package com.google.android.exoplayer2;

import a6.m0;
import com.google.android.exoplayer2.source.w;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* compiled from: PlaylistTimeline */
final class v0 extends a {

    /* renamed from: f  reason: collision with root package name */
    private final int f7787f;

    /* renamed from: g  reason: collision with root package name */
    private final int f7788g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f7789h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f7790i;

    /* renamed from: j  reason: collision with root package name */
    private final a1[] f7791j;

    /* renamed from: k  reason: collision with root package name */
    private final Object[] f7792k;

    /* renamed from: l  reason: collision with root package name */
    private final HashMap<Object, Integer> f7793l = new HashMap<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v0(Collection<? extends p0> collection, w wVar) {
        super(false, wVar);
        int i10 = 0;
        int size = collection.size();
        this.f7789h = new int[size];
        this.f7790i = new int[size];
        this.f7791j = new a1[size];
        this.f7792k = new Object[size];
        int i11 = 0;
        int i12 = 0;
        for (p0 p0Var : collection) {
            this.f7791j[i12] = p0Var.a();
            this.f7790i[i12] = i10;
            this.f7789h[i12] = i11;
            i10 += this.f7791j[i12].p();
            i11 += this.f7791j[i12].i();
            this.f7792k[i12] = p0Var.getUid();
            this.f7793l.put(this.f7792k[i12], Integer.valueOf(i12));
            i12++;
        }
        this.f7787f = i10;
        this.f7788g = i11;
    }

    /* access modifiers changed from: protected */
    public int A(int i10) {
        return this.f7790i[i10];
    }

    /* access modifiers changed from: protected */
    public a1 D(int i10) {
        return this.f7791j[i10];
    }

    /* access modifiers changed from: package-private */
    public List<a1> E() {
        return Arrays.asList(this.f7791j);
    }

    public int i() {
        return this.f7788g;
    }

    public int p() {
        return this.f7787f;
    }

    /* access modifiers changed from: protected */
    public int s(Object obj) {
        Integer num = this.f7793l.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    public int t(int i10) {
        return m0.h(this.f7789h, i10 + 1, false, false);
    }

    /* access modifiers changed from: protected */
    public int u(int i10) {
        return m0.h(this.f7790i, i10 + 1, false, false);
    }

    /* access modifiers changed from: protected */
    public Object x(int i10) {
        return this.f7792k[i10];
    }

    /* access modifiers changed from: protected */
    public int z(int i10) {
        return this.f7789h[i10];
    }
}
