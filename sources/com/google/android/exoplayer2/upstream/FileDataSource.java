package com.google.android.exoplayer2.upstream;

import a6.m0;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import z5.f;

public final class FileDataSource extends f {

    /* renamed from: e  reason: collision with root package name */
    private RandomAccessFile f7649e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f7650f;

    /* renamed from: g  reason: collision with root package name */
    private long f7651g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7652h;

    public static class FileDataSourceException extends DataSourceException {
        public FileDataSourceException(Throwable th, int i10) {
            super(th, i10);
        }

        public FileDataSourceException(String str, Throwable th, int i10) {
            super(str, th, i10);
        }
    }

    private static final class a {
        /* access modifiers changed from: private */
        public static boolean b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    public FileDataSource() {
        super(false);
    }

    private static RandomAccessFile t(Uri uri) {
        int i10 = AdError.INTERNAL_ERROR_2006;
        try {
            return new RandomAccessFile((String) a6.a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e10, 1004);
            }
            if (m0.f205a < 21 || !a.b(e10.getCause())) {
                i10 = 2005;
            }
            throw new FileDataSourceException(e10, i10);
        } catch (SecurityException e11) {
            throw new FileDataSourceException(e11, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e12) {
            throw new FileDataSourceException(e12, 2000);
        }
    }

    public void close() {
        this.f7650f = null;
        try {
            RandomAccessFile randomAccessFile = this.f7649e;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f7649e = null;
            if (this.f7652h) {
                this.f7652h = false;
                q();
            }
        } catch (IOException e10) {
            throw new FileDataSourceException(e10, 2000);
        } catch (Throwable th) {
            this.f7649e = null;
            if (this.f7652h) {
                this.f7652h = false;
                q();
            }
            throw th;
        }
    }

    public long h(b bVar) {
        Uri uri = bVar.f7699a;
        this.f7650f = uri;
        r(bVar);
        RandomAccessFile t10 = t(uri);
        this.f7649e = t10;
        try {
            t10.seek(bVar.f7705g);
            long j10 = bVar.f7706h;
            if (j10 == -1) {
                j10 = this.f7649e.length() - bVar.f7705g;
            }
            this.f7651g = j10;
            if (j10 >= 0) {
                this.f7652h = true;
                s(bVar);
                return this.f7651g;
            }
            throw new FileDataSourceException((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (IOException e10) {
            throw new FileDataSourceException(e10, 2000);
        }
    }

    public Uri n() {
        return this.f7650f;
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f7651g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) m0.j(this.f7649e)).read(bArr, i10, (int) Math.min(this.f7651g, (long) i11));
            if (read > 0) {
                this.f7651g -= (long) read;
                p(read);
            }
            return read;
        } catch (IOException e10) {
            throw new FileDataSourceException(e10, 2000);
        }
    }
}
