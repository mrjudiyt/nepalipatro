package com.google.common.collect;

import com.google.common.collect.k0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import l6.c;
import l6.f;
import l6.j;
import l6.p;

/* compiled from: MapMaker */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    boolean f13576a;

    /* renamed from: b  reason: collision with root package name */
    int f13577b = -1;

    /* renamed from: c  reason: collision with root package name */
    int f13578c = -1;

    /* renamed from: d  reason: collision with root package name */
    k0.p f13579d;

    /* renamed from: e  reason: collision with root package name */
    k0.p f13580e;

    /* renamed from: f  reason: collision with root package name */
    f<Object> f13581f;

    public j0 a(int i10) {
        int i11 = this.f13578c;
        boolean z10 = true;
        p.q(i11 == -1, "concurrency level was already set to %s", i11);
        if (i10 <= 0) {
            z10 = false;
        }
        p.d(z10);
        this.f13578c = i10;
        return this;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        int i10 = this.f13578c;
        if (i10 == -1) {
            return 4;
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        int i10 = this.f13577b;
        if (i10 == -1) {
            return 16;
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public f<Object> d() {
        return (f) j.a(this.f13581f, e().d());
    }

    /* access modifiers changed from: package-private */
    public k0.p e() {
        return (k0.p) j.a(this.f13579d, k0.p.STRONG);
    }

    /* access modifiers changed from: package-private */
    public k0.p f() {
        return (k0.p) j.a(this.f13580e, k0.p.STRONG);
    }

    public j0 g(int i10) {
        int i11 = this.f13577b;
        boolean z10 = true;
        p.q(i11 == -1, "initial capacity was already set to %s", i11);
        if (i10 < 0) {
            z10 = false;
        }
        p.d(z10);
        this.f13577b = i10;
        return this;
    }

    /* access modifiers changed from: package-private */
    public j0 h(f<Object> fVar) {
        f<Object> fVar2 = this.f13581f;
        p.r(fVar2 == null, "key equivalence was already set to %s", fVar2);
        this.f13581f = (f) p.j(fVar);
        this.f13576a = true;
        return this;
    }

    public <K, V> ConcurrentMap<K, V> i() {
        if (!this.f13576a) {
            return new ConcurrentHashMap(c(), 0.75f, b());
        }
        return k0.b(this);
    }

    /* access modifiers changed from: package-private */
    public j0 j(k0.p pVar) {
        k0.p pVar2 = this.f13579d;
        p.r(pVar2 == null, "Key strength was already set to %s", pVar2);
        this.f13579d = (k0.p) p.j(pVar);
        if (pVar != k0.p.STRONG) {
            this.f13576a = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public j0 k(k0.p pVar) {
        k0.p pVar2 = this.f13580e;
        p.r(pVar2 == null, "Value strength was already set to %s", pVar2);
        this.f13580e = (k0.p) p.j(pVar);
        if (pVar != k0.p.STRONG) {
            this.f13576a = true;
        }
        return this;
    }

    public j0 l() {
        return j(k0.p.WEAK);
    }

    public String toString() {
        j.b b10 = j.b(this);
        int i10 = this.f13577b;
        if (i10 != -1) {
            b10.a("initialCapacity", i10);
        }
        int i11 = this.f13578c;
        if (i11 != -1) {
            b10.a("concurrencyLevel", i11);
        }
        k0.p pVar = this.f13579d;
        if (pVar != null) {
            b10.b("keyStrength", c.e(pVar.toString()));
        }
        k0.p pVar2 = this.f13580e;
        if (pVar2 != null) {
            b10.b("valueStrength", c.e(pVar2.toString()));
        }
        if (this.f13581f != null) {
            b10.h("keyEquivalence");
        }
        return b10.toString();
    }
}
