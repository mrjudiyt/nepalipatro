package com.bumptech.glide.load.engine;

import e2.e;
import java.security.MessageDigest;

/* compiled from: DataCacheKey */
final class d implements e {

    /* renamed from: b  reason: collision with root package name */
    private final e f5674b;

    /* renamed from: c  reason: collision with root package name */
    private final e f5675c;

    d(e eVar, e eVar2) {
        this.f5674b = eVar;
        this.f5675c = eVar2;
    }

    public void a(MessageDigest messageDigest) {
        this.f5674b.a(messageDigest);
        this.f5675c.a(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f5674b.equals(dVar.f5674b) || !this.f5675c.equals(dVar.f5675c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f5674b.hashCode() * 31) + this.f5675c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f5674b + ", signature=" + this.f5675c + '}';
    }
}
