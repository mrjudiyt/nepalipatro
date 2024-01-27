package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import z5.o;

/* compiled from: DefaultLoadErrorHandlingPolicy */
public class f implements g {

    /* renamed from: a  reason: collision with root package name */
    private final int f7757a;

    public f() {
        this(-1);
    }

    public long a(g.c cVar) {
        IOException iOException = cVar.f7766c;
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource.CleartextNotPermittedException) || (iOException instanceof Loader.UnexpectedLoaderException)) {
            return -9223372036854775807L;
        }
        return (long) Math.min((cVar.f7767d - 1) * 1000, 5000);
    }

    public g.b b(g.a aVar, g.c cVar) {
        if (!e(cVar.f7766c)) {
            return null;
        }
        if (aVar.a(1)) {
            return new g.b(1, 300000);
        }
        if (aVar.a(2)) {
            return new g.b(2, 60000);
        }
        return null;
    }

    public /* synthetic */ void c(long j10) {
        o.a(this, j10);
    }

    public int d(int i10) {
        int i11 = this.f7757a;
        if (i11 == -1) {
            return i10 == 7 ? 6 : 3;
        }
        return i11;
    }

    /* access modifiers changed from: protected */
    public boolean e(IOException iOException) {
        if (!(iOException instanceof HttpDataSource.InvalidResponseCodeException)) {
            return false;
        }
        int i10 = ((HttpDataSource.InvalidResponseCodeException) iOException).f7656k;
        if (i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503) {
            return true;
        }
        return false;
    }

    public f(int i10) {
        this.f7757a = i10;
    }
}
