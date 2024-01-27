package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.k;
import com.google.common.collect.x;
import e4.m;
import g5.w;
import java.util.List;
import x4.a;
import y5.p;

/* compiled from: PlaybackInfo */
final class s0 {

    /* renamed from: t  reason: collision with root package name */
    private static final k.a f7058t = new k.a(new Object());

    /* renamed from: a  reason: collision with root package name */
    public final a1 f7059a;

    /* renamed from: b  reason: collision with root package name */
    public final k.a f7060b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7061c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7062d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7063e;

    /* renamed from: f  reason: collision with root package name */
    public final ExoPlaybackException f7064f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f7065g;

    /* renamed from: h  reason: collision with root package name */
    public final w f7066h;

    /* renamed from: i  reason: collision with root package name */
    public final p f7067i;

    /* renamed from: j  reason: collision with root package name */
    public final List<a> f7068j;

    /* renamed from: k  reason: collision with root package name */
    public final k.a f7069k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f7070l;

    /* renamed from: m  reason: collision with root package name */
    public final int f7071m;

    /* renamed from: n  reason: collision with root package name */
    public final m f7072n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f7073o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f7074p;

    /* renamed from: q  reason: collision with root package name */
    public volatile long f7075q;

    /* renamed from: r  reason: collision with root package name */
    public volatile long f7076r;

    /* renamed from: s  reason: collision with root package name */
    public volatile long f7077s;

    public s0(a1 a1Var, k.a aVar, long j10, long j11, int i10, ExoPlaybackException exoPlaybackException, boolean z10, w wVar, p pVar, List<a> list, k.a aVar2, boolean z11, int i11, m mVar, long j12, long j13, long j14, boolean z12, boolean z13) {
        this.f7059a = a1Var;
        this.f7060b = aVar;
        this.f7061c = j10;
        this.f7062d = j11;
        this.f7063e = i10;
        this.f7064f = exoPlaybackException;
        this.f7065g = z10;
        this.f7066h = wVar;
        this.f7067i = pVar;
        this.f7068j = list;
        this.f7069k = aVar2;
        this.f7070l = z11;
        this.f7071m = i11;
        this.f7072n = mVar;
        this.f7075q = j12;
        this.f7076r = j13;
        this.f7077s = j14;
        this.f7073o = z12;
        this.f7074p = z13;
    }

    public static s0 k(p pVar) {
        a1 a1Var = a1.f6231a;
        k.a aVar = f7058t;
        return new s0(a1Var, aVar, -9223372036854775807L, 0, 1, (ExoPlaybackException) null, false, w.f8923k, pVar, x.s(), aVar, false, 0, m.f8132d, 0, 0, 0, false, false);
    }

    public static k.a l() {
        return f7058t;
    }

    public s0 a(boolean z10) {
        a1 a1Var = this.f7059a;
        return new s0(a1Var, this.f7060b, this.f7061c, this.f7062d, this.f7063e, this.f7064f, z10, this.f7066h, this.f7067i, this.f7068j, this.f7069k, this.f7070l, this.f7071m, this.f7072n, this.f7075q, this.f7076r, this.f7077s, this.f7073o, this.f7074p);
    }

    public s0 b(k.a aVar) {
        a1 a1Var = this.f7059a;
        return new s0(a1Var, this.f7060b, this.f7061c, this.f7062d, this.f7063e, this.f7064f, this.f7065g, this.f7066h, this.f7067i, this.f7068j, aVar, this.f7070l, this.f7071m, this.f7072n, this.f7075q, this.f7076r, this.f7077s, this.f7073o, this.f7074p);
    }

    public s0 c(k.a aVar, long j10, long j11, long j12, long j13, w wVar, p pVar, List<a> list) {
        long j14 = j10;
        w wVar2 = wVar;
        p pVar2 = pVar;
        List<a> list2 = list;
        a1 a1Var = this.f7059a;
        return new s0(a1Var, aVar, j11, j12, this.f7063e, this.f7064f, this.f7065g, wVar2, pVar2, list2, this.f7069k, this.f7070l, this.f7071m, this.f7072n, this.f7075q, j13, j14, this.f7073o, this.f7074p);
    }

    public s0 d(boolean z10) {
        a1 a1Var = this.f7059a;
        return new s0(a1Var, this.f7060b, this.f7061c, this.f7062d, this.f7063e, this.f7064f, this.f7065g, this.f7066h, this.f7067i, this.f7068j, this.f7069k, this.f7070l, this.f7071m, this.f7072n, this.f7075q, this.f7076r, this.f7077s, z10, this.f7074p);
    }

    public s0 e(boolean z10, int i10) {
        a1 a1Var = this.f7059a;
        return new s0(a1Var, this.f7060b, this.f7061c, this.f7062d, this.f7063e, this.f7064f, this.f7065g, this.f7066h, this.f7067i, this.f7068j, this.f7069k, z10, i10, this.f7072n, this.f7075q, this.f7076r, this.f7077s, this.f7073o, this.f7074p);
    }

    public s0 f(ExoPlaybackException exoPlaybackException) {
        a1 a1Var = this.f7059a;
        return new s0(a1Var, this.f7060b, this.f7061c, this.f7062d, this.f7063e, exoPlaybackException, this.f7065g, this.f7066h, this.f7067i, this.f7068j, this.f7069k, this.f7070l, this.f7071m, this.f7072n, this.f7075q, this.f7076r, this.f7077s, this.f7073o, this.f7074p);
    }

    public s0 g(m mVar) {
        a1 a1Var = this.f7059a;
        return new s0(a1Var, this.f7060b, this.f7061c, this.f7062d, this.f7063e, this.f7064f, this.f7065g, this.f7066h, this.f7067i, this.f7068j, this.f7069k, this.f7070l, this.f7071m, mVar, this.f7075q, this.f7076r, this.f7077s, this.f7073o, this.f7074p);
    }

    public s0 h(int i10) {
        a1 a1Var = this.f7059a;
        return new s0(a1Var, this.f7060b, this.f7061c, this.f7062d, i10, this.f7064f, this.f7065g, this.f7066h, this.f7067i, this.f7068j, this.f7069k, this.f7070l, this.f7071m, this.f7072n, this.f7075q, this.f7076r, this.f7077s, this.f7073o, this.f7074p);
    }

    public s0 i(boolean z10) {
        a1 a1Var = this.f7059a;
        return new s0(a1Var, this.f7060b, this.f7061c, this.f7062d, this.f7063e, this.f7064f, this.f7065g, this.f7066h, this.f7067i, this.f7068j, this.f7069k, this.f7070l, this.f7071m, this.f7072n, this.f7075q, this.f7076r, this.f7077s, this.f7073o, z10);
    }

    public s0 j(a1 a1Var) {
        return new s0(a1Var, this.f7060b, this.f7061c, this.f7062d, this.f7063e, this.f7064f, this.f7065g, this.f7066h, this.f7067i, this.f7068j, this.f7069k, this.f7070l, this.f7071m, this.f7072n, this.f7075q, this.f7076r, this.f7077s, this.f7073o, this.f7074p);
    }
}
