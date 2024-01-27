package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.b;
import com.bumptech.glide.load.engine.j;
import i2.b;
import java.util.List;
import java.util.Map;
import w2.g;
import w2.h;

/* compiled from: GlideContext */
public class d extends ContextWrapper {

    /* renamed from: k  reason: collision with root package name */
    static final i<?, ?> f5591k = new a();

    /* renamed from: a  reason: collision with root package name */
    private final b f5592a;

    /* renamed from: b  reason: collision with root package name */
    private final Registry f5593b;

    /* renamed from: c  reason: collision with root package name */
    private final x2.b f5594c;

    /* renamed from: d  reason: collision with root package name */
    private final b.a f5595d;

    /* renamed from: e  reason: collision with root package name */
    private final List<g<Object>> f5596e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Class<?>, i<?, ?>> f5597f;

    /* renamed from: g  reason: collision with root package name */
    private final j f5598g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f5599h;

    /* renamed from: i  reason: collision with root package name */
    private final int f5600i;

    /* renamed from: j  reason: collision with root package name */
    private h f5601j;

    public d(Context context, i2.b bVar, Registry registry, x2.b bVar2, b.a aVar, Map<Class<?>, i<?, ?>> map, List<g<Object>> list, j jVar, boolean z10, int i10) {
        super(context.getApplicationContext());
        this.f5592a = bVar;
        this.f5593b = registry;
        this.f5594c = bVar2;
        this.f5595d = aVar;
        this.f5596e = list;
        this.f5597f = map;
        this.f5598g = jVar;
        this.f5599h = z10;
        this.f5600i = i10;
    }

    public i2.b a() {
        return this.f5592a;
    }

    public List<g<Object>> b() {
        return this.f5596e;
    }

    public synchronized h c() {
        if (this.f5601j == null) {
            this.f5601j = (h) this.f5595d.build().J();
        }
        return this.f5601j;
    }

    public <T> i<?, T> d(Class<T> cls) {
        i<?, T> iVar = this.f5597f.get(cls);
        if (iVar == null) {
            for (Map.Entry next : this.f5597f.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    iVar = (i) next.getValue();
                }
            }
        }
        return iVar == null ? f5591k : iVar;
    }

    public j e() {
        return this.f5598g;
    }

    public int f() {
        return this.f5600i;
    }

    public Registry g() {
        return this.f5593b;
    }

    public boolean h() {
        return this.f5599h;
    }
}
