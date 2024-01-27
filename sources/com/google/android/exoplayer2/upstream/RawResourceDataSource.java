package com.google.android.exoplayer2.upstream;

import a6.a;
import a6.m0;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import z5.f;

public final class RawResourceDataSource extends f {

    /* renamed from: e  reason: collision with root package name */
    private final Resources f7682e;

    /* renamed from: f  reason: collision with root package name */
    private final String f7683f;

    /* renamed from: g  reason: collision with root package name */
    private Uri f7684g;

    /* renamed from: h  reason: collision with root package name */
    private AssetFileDescriptor f7685h;

    /* renamed from: i  reason: collision with root package name */
    private InputStream f7686i;

    /* renamed from: j  reason: collision with root package name */
    private long f7687j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7688k;

    public static class RawResourceDataSourceException extends DataSourceException {
        public RawResourceDataSourceException(String str, Throwable th, int i10) {
            super(str, th, i10);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f7682e = context.getResources();
        this.f7683f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("rawresource:///");
        sb.append(i10);
        return Uri.parse(sb.toString());
    }

    public void close() {
        this.f7684g = null;
        try {
            InputStream inputStream = this.f7686i;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f7686i = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f7685h;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f7685h = null;
                if (this.f7688k) {
                    this.f7688k = false;
                    q();
                }
            } catch (IOException e10) {
                throw new RawResourceDataSourceException((String) null, e10, 2000);
            } catch (Throwable th) {
                this.f7685h = null;
                if (this.f7688k) {
                    this.f7688k = false;
                    q();
                }
                throw th;
            }
        } catch (IOException e11) {
            throw new RawResourceDataSourceException((String) null, e11, 2000);
        } catch (Throwable th2) {
            this.f7686i = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f7685h;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f7685h = null;
                if (this.f7688k) {
                    this.f7688k = false;
                    q();
                }
                throw th2;
            } catch (IOException e12) {
                throw new RawResourceDataSourceException((String) null, e12, 2000);
            } catch (Throwable th3) {
                this.f7685h = null;
                if (this.f7688k) {
                    this.f7688k = false;
                    q();
                }
                throw th3;
            }
        }
    }

    public long h(b bVar) {
        int i10;
        b bVar2 = bVar;
        Uri uri = bVar2.f7699a;
        this.f7684g = uri;
        if (TextUtils.equals("rawresource", uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) a.e(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                i10 = Integer.parseInt((String) a.e(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.", (Throwable) null, 1004);
            }
        } else if (TextUtils.equals("android.resource", uri.getScheme())) {
            String str = (String) a.e(uri.getPath());
            if (str.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                str = str.substring(1);
            }
            String host = uri.getHost();
            String valueOf = String.valueOf(TextUtils.isEmpty(host) ? "" : String.valueOf(host).concat(CertificateUtil.DELIMITER));
            String valueOf2 = String.valueOf(str);
            i10 = this.f7682e.getIdentifier(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), "raw", this.f7683f);
            if (i10 == 0) {
                throw new RawResourceDataSourceException("Resource not found.", (Throwable) null, 2005);
            }
        } else {
            throw new RawResourceDataSourceException("URI must either use scheme rawresource or android.resource", (Throwable) null, 1004);
        }
        r(bVar);
        try {
            AssetFileDescriptor openRawResourceFd = this.f7682e.openRawResourceFd(i10);
            this.f7685h = openRawResourceFd;
            if (openRawResourceFd != null) {
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                this.f7686i = fileInputStream;
                int i11 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                if (i11 != 0) {
                    try {
                        if (bVar2.f7705g > length) {
                            throw new RawResourceDataSourceException((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    } catch (RawResourceDataSourceException e10) {
                        throw e10;
                    } catch (IOException e11) {
                        throw new RawResourceDataSourceException((String) null, e11, 2000);
                    }
                }
                long startOffset = openRawResourceFd.getStartOffset();
                long skip = fileInputStream.skip(bVar2.f7705g + startOffset) - startOffset;
                if (skip == bVar2.f7705g) {
                    if (i11 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.f7687j = -1;
                        } else {
                            long size = channel.size() - channel.position();
                            this.f7687j = size;
                            if (size < 0) {
                                throw new RawResourceDataSourceException((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                    } else {
                        long j10 = length - skip;
                        this.f7687j = j10;
                        if (j10 < 0) {
                            throw new DataSourceException(AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                    long j11 = bVar2.f7706h;
                    if (j11 != -1) {
                        long j12 = this.f7687j;
                        if (j12 != -1) {
                            j11 = Math.min(j12, j11);
                        }
                        this.f7687j = j11;
                    }
                    this.f7688k = true;
                    s(bVar);
                    long j13 = bVar2.f7706h;
                    return j13 != -1 ? j13 : this.f7687j;
                }
                throw new RawResourceDataSourceException((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            String valueOf3 = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(valueOf3.length() + 24);
            sb.append("Resource is compressed: ");
            sb.append(valueOf3);
            throw new RawResourceDataSourceException(sb.toString(), (Throwable) null, 2000);
        } catch (Resources.NotFoundException e12) {
            throw new RawResourceDataSourceException((String) null, e12, 2005);
        }
    }

    public Uri n() {
        return this.f7684g;
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f7687j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, (long) i11);
            } catch (IOException e10) {
                throw new RawResourceDataSourceException((String) null, e10, 2000);
            }
        }
        int read = ((InputStream) m0.j(this.f7686i)).read(bArr, i10, i11);
        if (read != -1) {
            long j11 = this.f7687j;
            if (j11 != -1) {
                this.f7687j = j11 - ((long) read);
            }
            p(read);
            return read;
        } else if (this.f7687j == -1) {
            return -1;
        } else {
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
    }
}
