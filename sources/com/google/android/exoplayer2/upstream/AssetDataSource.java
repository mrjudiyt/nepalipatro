package com.google.android.exoplayer2.upstream;

import a6.a;
import a6.m0;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.ads.AdError;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import z5.f;

public final class AssetDataSource extends f {

    /* renamed from: e  reason: collision with root package name */
    private final AssetManager f7637e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f7638f;

    /* renamed from: g  reason: collision with root package name */
    private InputStream f7639g;

    /* renamed from: h  reason: collision with root package name */
    private long f7640h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f7641i;

    public static final class AssetDataSourceException extends DataSourceException {
        public AssetDataSourceException(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f7637e = context.getAssets();
    }

    public void close() {
        this.f7638f = null;
        try {
            InputStream inputStream = this.f7639g;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f7639g = null;
            if (this.f7641i) {
                this.f7641i = false;
                q();
            }
        } catch (IOException e10) {
            throw new AssetDataSourceException(e10, 2000);
        } catch (Throwable th) {
            this.f7639g = null;
            if (this.f7641i) {
                this.f7641i = false;
                q();
            }
            throw th;
        }
    }

    public long h(b bVar) {
        try {
            Uri uri = bVar.f7699a;
            this.f7638f = uri;
            String str = (String) a.e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                str = str.substring(1);
            }
            r(bVar);
            InputStream open = this.f7637e.open(str, 1);
            this.f7639g = open;
            if (open.skip(bVar.f7705g) >= bVar.f7705g) {
                long j10 = bVar.f7706h;
                if (j10 != -1) {
                    this.f7640h = j10;
                } else {
                    long available = (long) this.f7639g.available();
                    this.f7640h = available;
                    if (available == 2147483647L) {
                        this.f7640h = -1;
                    }
                }
                this.f7641i = true;
                s(bVar);
                return this.f7640h;
            }
            throw new AssetDataSourceException((Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (AssetDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new AssetDataSourceException(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    public Uri n() {
        return this.f7638f;
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f7640h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, (long) i11);
            } catch (IOException e10) {
                throw new AssetDataSourceException(e10, 2000);
            }
        }
        int read = ((InputStream) m0.j(this.f7639g)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f7640h;
        if (j11 != -1) {
            this.f7640h = j11 - ((long) read);
        }
        p(read);
        return read;
    }
}
