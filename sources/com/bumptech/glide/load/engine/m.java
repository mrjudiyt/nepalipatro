package com.bumptech.glide.load.engine;

import a3.j;
import e2.e;
import e2.g;
import e2.k;
import java.security.MessageDigest;
import java.util.Map;

/* compiled from: EngineKey */
class m implements e {

    /* renamed from: b  reason: collision with root package name */
    private final Object f5795b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5796c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5797d;

    /* renamed from: e  reason: collision with root package name */
    private final Class<?> f5798e;

    /* renamed from: f  reason: collision with root package name */
    private final Class<?> f5799f;

    /* renamed from: g  reason: collision with root package name */
    private final e f5800g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<Class<?>, k<?>> f5801h;

    /* renamed from: i  reason: collision with root package name */
    private final g f5802i;

    /* renamed from: j  reason: collision with root package name */
    private int f5803j;

    m(Object obj, e eVar, int i10, int i11, Map<Class<?>, k<?>> map, Class<?> cls, Class<?> cls2, g gVar) {
        this.f5795b = j.d(obj);
        this.f5800g = (e) j.e(eVar, "Signature must not be null");
        this.f5796c = i10;
        this.f5797d = i11;
        this.f5801h = (Map) j.d(map);
        this.f5798e = (Class) j.e(cls, "Resource class must not be null");
        this.f5799f = (Class) j.e(cls2, "Transcode class must not be null");
        this.f5802i = (g) j.d(gVar);
    }

    public void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f5795b.equals(mVar.f5795b) || !this.f5800g.equals(mVar.f5800g) || this.f5797d != mVar.f5797d || this.f5796c != mVar.f5796c || !this.f5801h.equals(mVar.f5801h) || !this.f5798e.equals(mVar.f5798e) || !this.f5799f.equals(mVar.f5799f) || !this.f5802i.equals(mVar.f5802i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f5803j == 0) {
            int hashCode = this.f5795b.hashCode();
            this.f5803j = hashCode;
            int hashCode2 = (hashCode * 31) + this.f5800g.hashCode();
            this.f5803j = hashCode2;
            int i10 = (hashCode2 * 31) + this.f5796c;
            this.f5803j = i10;
            int i11 = (i10 * 31) + this.f5797d;
            this.f5803j = i11;
            int hashCode3 = (i11 * 31) + this.f5801h.hashCode();
            this.f5803j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f5798e.hashCode();
            this.f5803j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f5799f.hashCode();
            this.f5803j = hashCode5;
            this.f5803j = (hashCode5 * 31) + this.f5802i.hashCode();
        }
        return this.f5803j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f5795b + ", width=" + this.f5796c + ", height=" + this.f5797d + ", resourceClass=" + this.f5798e + ", transcodeClass=" + this.f5799f + ", signature=" + this.f5800g + ", hashCode=" + this.f5803j + ", transformations=" + this.f5801h + ", options=" + this.f5802i + '}';
    }
}
