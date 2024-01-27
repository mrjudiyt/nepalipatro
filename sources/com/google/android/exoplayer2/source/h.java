package com.google.android.exoplayer2.source;

import a6.m0;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.k;
import e4.v;
import g5.t;
import g5.w;
import java.io.IOException;
import z5.b;

/* compiled from: MaskingMediaPeriod */
public final class h implements j, j.a {

    /* renamed from: h  reason: collision with root package name */
    public final k.a f7288h;

    /* renamed from: i  reason: collision with root package name */
    private final long f7289i;

    /* renamed from: j  reason: collision with root package name */
    private final b f7290j;

    /* renamed from: k  reason: collision with root package name */
    private k f7291k;

    /* renamed from: l  reason: collision with root package name */
    private j f7292l;

    /* renamed from: m  reason: collision with root package name */
    private j.a f7293m;

    /* renamed from: n  reason: collision with root package name */
    private a f7294n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f7295o;

    /* renamed from: p  reason: collision with root package name */
    private long f7296p = -9223372036854775807L;

    /* compiled from: MaskingMediaPeriod */
    public interface a {
        void a(k.a aVar);

        void b(k.a aVar, IOException iOException);
    }

    public h(k.a aVar, b bVar, long j10) {
        this.f7288h = aVar;
        this.f7290j = bVar;
        this.f7289i = j10;
    }

    private long o(long j10) {
        long j11 = this.f7296p;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    public void a(k.a aVar) {
        long o10 = o(this.f7289i);
        j h10 = ((k) a6.a.e(this.f7291k)).h(aVar, this.f7290j, o10);
        this.f7292l = h10;
        if (this.f7293m != null) {
            h10.q(this, o10);
        }
    }

    public long b() {
        return ((j) m0.j(this.f7292l)).b();
    }

    public long c(long j10, v vVar) {
        return ((j) m0.j(this.f7292l)).c(j10, vVar);
    }

    public boolean d(long j10) {
        j jVar = this.f7292l;
        return jVar != null && jVar.d(j10);
    }

    public long e() {
        return this.f7296p;
    }

    public boolean f() {
        j jVar = this.f7292l;
        return jVar != null && jVar.f();
    }

    public long g() {
        return ((j) m0.j(this.f7292l)).g();
    }

    public void h(long j10) {
        ((j) m0.j(this.f7292l)).h(j10);
    }

    public void k(j jVar) {
        ((j.a) m0.j(this.f7293m)).k(this);
        a aVar = this.f7294n;
        if (aVar != null) {
            aVar.a(this.f7288h);
        }
    }

    public long l() {
        return this.f7289i;
    }

    public void m() {
        try {
            j jVar = this.f7292l;
            if (jVar != null) {
                jVar.m();
                return;
            }
            k kVar = this.f7291k;
            if (kVar != null) {
                kVar.l();
            }
        } catch (IOException e10) {
            a aVar = this.f7294n;
            if (aVar == null) {
                throw e10;
            } else if (!this.f7295o) {
                this.f7295o = true;
                aVar.b(this.f7288h, e10);
            }
        }
    }

    public long n(long j10) {
        return ((j) m0.j(this.f7292l)).n(j10);
    }

    public long p() {
        return ((j) m0.j(this.f7292l)).p();
    }

    public void q(j.a aVar, long j10) {
        this.f7293m = aVar;
        j jVar = this.f7292l;
        if (jVar != null) {
            jVar.q(this, o(this.f7289i));
        }
    }

    public w r() {
        return ((j) m0.j(this.f7292l)).r();
    }

    /* renamed from: s */
    public void i(j jVar) {
        ((j.a) m0.j(this.f7293m)).i(this);
    }

    public void t(long j10, boolean z10) {
        ((j) m0.j(this.f7292l)).t(j10, z10);
    }

    public long u(y5.h[] hVarArr, boolean[] zArr, t[] tVarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f7296p;
        if (j12 == -9223372036854775807L || j10 != this.f7289i) {
            j11 = j10;
        } else {
            this.f7296p = -9223372036854775807L;
            j11 = j12;
        }
        return ((j) m0.j(this.f7292l)).u(hVarArr, zArr, tVarArr, zArr2, j11);
    }

    public void v(long j10) {
        this.f7296p = j10;
    }

    public void w() {
        if (this.f7292l != null) {
            ((k) a6.a.e(this.f7291k)).n(this.f7292l);
        }
    }

    public void x(k kVar) {
        a6.a.f(this.f7291k == null);
        this.f7291k = kVar;
    }
}
