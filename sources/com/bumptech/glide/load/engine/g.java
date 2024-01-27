package com.bumptech.glide.load.engine;

import com.bumptech.glide.d;
import com.bumptech.glide.f;
import com.bumptech.glide.load.engine.h;
import e2.e;
import e2.j;
import e2.k;
import h2.a;
import h2.c;
import i2.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l2.n;

/* compiled from: DecodeHelper */
final class g<Transcode> {

    /* renamed from: a  reason: collision with root package name */
    private final List<n.a<?>> f5679a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final List<e> f5680b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private d f5681c;

    /* renamed from: d  reason: collision with root package name */
    private Object f5682d;

    /* renamed from: e  reason: collision with root package name */
    private int f5683e;

    /* renamed from: f  reason: collision with root package name */
    private int f5684f;

    /* renamed from: g  reason: collision with root package name */
    private Class<?> f5685g;

    /* renamed from: h  reason: collision with root package name */
    private h.e f5686h;

    /* renamed from: i  reason: collision with root package name */
    private e2.g f5687i;

    /* renamed from: j  reason: collision with root package name */
    private Map<Class<?>, k<?>> f5688j;

    /* renamed from: k  reason: collision with root package name */
    private Class<Transcode> f5689k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f5690l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f5691m;

    /* renamed from: n  reason: collision with root package name */
    private e f5692n;

    /* renamed from: o  reason: collision with root package name */
    private f f5693o;

    /* renamed from: p  reason: collision with root package name */
    private a f5694p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f5695q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f5696r;

    g() {
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f5681c = null;
        this.f5682d = null;
        this.f5692n = null;
        this.f5685g = null;
        this.f5689k = null;
        this.f5687i = null;
        this.f5693o = null;
        this.f5688j = null;
        this.f5694p = null;
        this.f5679a.clear();
        this.f5690l = false;
        this.f5680b.clear();
        this.f5691m = false;
    }

    /* access modifiers changed from: package-private */
    public b b() {
        return this.f5681c.a();
    }

    /* access modifiers changed from: package-private */
    public List<e> c() {
        if (!this.f5691m) {
            this.f5691m = true;
            this.f5680b.clear();
            List<n.a<?>> g10 = g();
            int size = g10.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a aVar = g10.get(i10);
                if (!this.f5680b.contains(aVar.f9918a)) {
                    this.f5680b.add(aVar.f9918a);
                }
                for (int i11 = 0; i11 < aVar.f9919b.size(); i11++) {
                    if (!this.f5680b.contains(aVar.f9919b.get(i11))) {
                        this.f5680b.add(aVar.f9919b.get(i11));
                    }
                }
            }
        }
        return this.f5680b;
    }

    /* access modifiers changed from: package-private */
    public j2.a d() {
        return this.f5686h.a();
    }

    /* access modifiers changed from: package-private */
    public a e() {
        return this.f5694p;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f5684f;
    }

    /* access modifiers changed from: package-private */
    public List<n.a<?>> g() {
        if (!this.f5690l) {
            this.f5690l = true;
            this.f5679a.clear();
            List i10 = this.f5681c.g().i(this.f5682d);
            int size = i10.size();
            for (int i11 = 0; i11 < size; i11++) {
                n.a b10 = ((n) i10.get(i11)).b(this.f5682d, this.f5683e, this.f5684f, this.f5687i);
                if (b10 != null) {
                    this.f5679a.add(b10);
                }
            }
        }
        return this.f5679a;
    }

    /* access modifiers changed from: package-private */
    public <Data> q<Data, ?, Transcode> h(Class<Data> cls) {
        return this.f5681c.g().h(cls, this.f5685g, this.f5689k);
    }

    /* access modifiers changed from: package-private */
    public Class<?> i() {
        return this.f5682d.getClass();
    }

    /* access modifiers changed from: package-private */
    public List<n<File, ?>> j(File file) {
        return this.f5681c.g().i(file);
    }

    /* access modifiers changed from: package-private */
    public e2.g k() {
        return this.f5687i;
    }

    /* access modifiers changed from: package-private */
    public f l() {
        return this.f5693o;
    }

    /* access modifiers changed from: package-private */
    public List<Class<?>> m() {
        return this.f5681c.g().j(this.f5682d.getClass(), this.f5685g, this.f5689k);
    }

    /* access modifiers changed from: package-private */
    public <Z> j<Z> n(c<Z> cVar) {
        return this.f5681c.g().k(cVar);
    }

    /* access modifiers changed from: package-private */
    public e o() {
        return this.f5692n;
    }

    /* access modifiers changed from: package-private */
    public <X> e2.d<X> p(X x10) {
        return this.f5681c.g().m(x10);
    }

    /* access modifiers changed from: package-private */
    public Class<?> q() {
        return this.f5689k;
    }

    /* access modifiers changed from: package-private */
    public <Z> k<Z> r(Class<Z> cls) {
        k<Z> kVar = this.f5688j.get(cls);
        if (kVar == null) {
            Iterator<Map.Entry<Class<?>, k<?>>> it = this.f5688j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    kVar = (k) next.getValue();
                    break;
                }
            }
        }
        if (kVar != null) {
            return kVar;
        }
        if (!this.f5688j.isEmpty() || !this.f5695q) {
            return n2.c.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* access modifiers changed from: package-private */
    public int s() {
        return this.f5683e;
    }

    /* access modifiers changed from: package-private */
    public boolean t(Class<?> cls) {
        return h(cls) != null;
    }

    /* access modifiers changed from: package-private */
    public <R> void u(d dVar, Object obj, e eVar, int i10, int i11, a aVar, Class<?> cls, Class<R> cls2, f fVar, e2.g gVar, Map<Class<?>, k<?>> map, boolean z10, boolean z11, h.e eVar2) {
        this.f5681c = dVar;
        this.f5682d = obj;
        this.f5692n = eVar;
        this.f5683e = i10;
        this.f5684f = i11;
        this.f5694p = aVar;
        this.f5685g = cls;
        this.f5686h = eVar2;
        this.f5689k = cls2;
        this.f5693o = fVar;
        this.f5687i = gVar;
        this.f5688j = map;
        this.f5695q = z10;
        this.f5696r = z11;
    }

    /* access modifiers changed from: package-private */
    public boolean v(c<?> cVar) {
        return this.f5681c.g().n(cVar);
    }

    /* access modifiers changed from: package-private */
    public boolean w() {
        return this.f5696r;
    }

    /* access modifiers changed from: package-private */
    public boolean x(e eVar) {
        List<n.a<?>> g10 = g();
        int size = g10.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (g10.get(i10).f9918a.equals(eVar)) {
                return true;
            }
        }
        return false;
    }
}
