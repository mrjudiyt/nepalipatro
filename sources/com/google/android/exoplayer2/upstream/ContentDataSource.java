package com.google.android.exoplayer2.upstream;

import a6.m0;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import z5.f;

public final class ContentDataSource extends f {

    /* renamed from: e  reason: collision with root package name */
    private final ContentResolver f7642e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f7643f;

    /* renamed from: g  reason: collision with root package name */
    private AssetFileDescriptor f7644g;

    /* renamed from: h  reason: collision with root package name */
    private FileInputStream f7645h;

    /* renamed from: i  reason: collision with root package name */
    private long f7646i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f7647j;

    public static class ContentDataSourceException extends DataSourceException {
        public ContentDataSourceException(IOException iOException, int i10) {
            super((Throwable) iOException, i10);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f7642e = context.getContentResolver();
    }

    public void close() {
        this.f7643f = null;
        try {
            FileInputStream fileInputStream = this.f7645h;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f7645h = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f7644g;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f7644g = null;
                if (this.f7647j) {
                    this.f7647j = false;
                    q();
                }
            } catch (IOException e10) {
                throw new ContentDataSourceException(e10, 2000);
            } catch (Throwable th) {
                this.f7644g = null;
                if (this.f7647j) {
                    this.f7647j = false;
                    q();
                }
                throw th;
            }
        } catch (IOException e11) {
            throw new ContentDataSourceException(e11, 2000);
        } catch (Throwable th2) {
            this.f7645h = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f7644g;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f7644g = null;
                if (this.f7647j) {
                    this.f7647j = false;
                    q();
                }
                throw th2;
            } catch (IOException e12) {
                throw new ContentDataSourceException(e12, 2000);
            } catch (Throwable th3) {
                this.f7644g = null;
                if (this.f7647j) {
                    this.f7647j = false;
                    q();
                }
                throw th3;
            }
        }
    }

    public long h(b bVar) {
        int i10 = 2000;
        try {
            Uri uri = bVar.f7699a;
            this.f7643f = uri;
            r(bVar);
            AssetFileDescriptor openAssetFileDescriptor = this.f7642e.openAssetFileDescriptor(uri, "r");
            this.f7644g = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f7645h = fileInputStream;
                int i11 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                if (i11 != 0) {
                    if (bVar.f7705g > length) {
                        throw new ContentDataSourceException((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(bVar.f7705g + startOffset) - startOffset;
                if (skip == bVar.f7705g) {
                    if (i11 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f7646i = -1;
                        } else {
                            long position = size - channel.position();
                            this.f7646i = position;
                            if (position < 0) {
                                throw new ContentDataSourceException((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                    } else {
                        long j10 = length - skip;
                        this.f7646i = j10;
                        if (j10 < 0) {
                            throw new ContentDataSourceException((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                    long j11 = bVar.f7706h;
                    if (j11 != -1) {
                        long j12 = this.f7646i;
                        if (j12 != -1) {
                            j11 = Math.min(j12, j11);
                        }
                        this.f7646i = j11;
                    }
                    this.f7647j = true;
                    s(bVar);
                    long j13 = bVar.f7706h;
                    return j13 != -1 ? j13 : this.f7646i;
                }
                throw new ContentDataSourceException((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(valueOf.length() + 36);
            sb.append("Could not open file descriptor for: ");
            sb.append(valueOf);
            throw new ContentDataSourceException(new IOException(sb.toString()), 2000);
        } catch (ContentDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i10 = 2005;
            }
            throw new ContentDataSourceException(e11, i10);
        }
    }

    public Uri n() {
        return this.f7643f;
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f7646i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, (long) i11);
            } catch (IOException e10) {
                throw new ContentDataSourceException(e10, 2000);
            }
        }
        int read = ((FileInputStream) m0.j(this.f7645h)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f7646i;
        if (j11 != -1) {
            this.f7646i = j11 - ((long) read);
        }
        p(read);
        return read;
    }
}
