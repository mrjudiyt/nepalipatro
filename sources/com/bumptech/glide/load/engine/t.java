package com.bumptech.glide.load.engine;

import a3.g;
import e2.e;
import e2.k;
import i2.b;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: ResourceCacheKey */
final class t implements e {

    /* renamed from: j  reason: collision with root package name */
    private static final g<Class<?>, byte[]> f5832j = new g<>(50);

    /* renamed from: b  reason: collision with root package name */
    private final b f5833b;

    /* renamed from: c  reason: collision with root package name */
    private final e f5834c;

    /* renamed from: d  reason: collision with root package name */
    private final e f5835d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5836e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5837f;

    /* renamed from: g  reason: collision with root package name */
    private final Class<?> f5838g;

    /* renamed from: h  reason: collision with root package name */
    private final e2.g f5839h;

    /* renamed from: i  reason: collision with root package name */
    private final k<?> f5840i;

    t(b bVar, e eVar, e eVar2, int i10, int i11, k<?> kVar, Class<?> cls, e2.g gVar) {
        this.f5833b = bVar;
        this.f5834c = eVar;
        this.f5835d = eVar2;
        this.f5836e = i10;
        this.f5837f = i11;
        this.f5840i = kVar;
        this.f5838g = cls;
        this.f5839h = gVar;
    }

    private byte[] c() {
        g<Class<?>, byte[]> gVar = f5832j;
        byte[] g10 = gVar.g(this.f5838g);
        if (g10 != null) {
            return g10;
        }
        byte[] bytes = this.f5838g.getName().getBytes(e.f7997a);
        gVar.k(this.f5838g, bytes);
        return bytes;
    }

    public void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f5833b.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f5836e).putInt(this.f5837f).array();
        this.f5835d.a(messageDigest);
        this.f5834c.a(messageDigest);
        messageDigest.update(bArr);
        k<?> kVar = this.f5840i;
        if (kVar != null) {
            kVar.a(messageDigest);
        }
        this.f5839h.a(messageDigest);
        messageDigest.update(c());
        this.f5833b.d(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f5837f != tVar.f5837f || this.f5836e != tVar.f5836e || !a3.k.d(this.f5840i, tVar.f5840i) || !this.f5838g.equals(tVar.f5838g) || !this.f5834c.equals(tVar.f5834c) || !this.f5835d.equals(tVar.f5835d) || !this.f5839h.equals(tVar.f5839h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((this.f5834c.hashCode() * 31) + this.f5835d.hashCode()) * 31) + this.f5836e) * 31) + this.f5837f;
        k<?> kVar = this.f5840i;
        if (kVar != null) {
            hashCode = (hashCode * 31) + kVar.hashCode();
        }
        return (((hashCode * 31) + this.f5838g.hashCode()) * 31) + this.f5839h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f5834c + ", signature=" + this.f5835d + ", width=" + this.f5836e + ", height=" + this.f5837f + ", decodedResourceClass=" + this.f5838g + ", transformation='" + this.f5840i + '\'' + ", options=" + this.f5839h + '}';
    }
}
