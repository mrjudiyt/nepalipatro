package com.google.android.exoplayer2.source;

import a6.y;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.b;
import java.util.List;
import java.util.Map;
import z5.r;

/* compiled from: IcyDataSource */
final class g implements com.google.android.exoplayer2.upstream.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.a f7283a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7284b;

    /* renamed from: c  reason: collision with root package name */
    private final a f7285c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f7286d;

    /* renamed from: e  reason: collision with root package name */
    private int f7287e;

    /* compiled from: IcyDataSource */
    public interface a {
        void a(y yVar);
    }

    public g(com.google.android.exoplayer2.upstream.a aVar, int i10, a aVar2) {
        a6.a.a(i10 > 0);
        this.f7283a = aVar;
        this.f7284b = i10;
        this.f7285c = aVar2;
        this.f7286d = new byte[1];
        this.f7287e = i10;
    }

    private boolean p() {
        if (this.f7283a.read(this.f7286d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f7286d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int read = this.f7283a.read(bArr, i12, i11);
            if (read == -1) {
                return false;
            }
            i12 += read;
            i11 -= read;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f7285c.a(new y(bArr, i10));
        }
        return true;
    }

    public void c(r rVar) {
        a6.a.e(rVar);
        this.f7283a.c(rVar);
    }

    public void close() {
        throw new UnsupportedOperationException();
    }

    public long h(b bVar) {
        throw new UnsupportedOperationException();
    }

    public Map<String, List<String>> j() {
        return this.f7283a.j();
    }

    public Uri n() {
        return this.f7283a.n();
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (this.f7287e == 0) {
            if (!p()) {
                return -1;
            }
            this.f7287e = this.f7284b;
        }
        int read = this.f7283a.read(bArr, i10, Math.min(this.f7287e, i11));
        if (read != -1) {
            this.f7287e -= read;
        }
        return read;
    }
}
