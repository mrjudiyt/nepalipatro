package com.google.zxing;

/* compiled from: Dimension */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f14084a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14085b;

    public int a() {
        return this.f14085b;
    }

    public int b() {
        return this.f14084a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f14084a == bVar.f14084a && this.f14085b == bVar.f14085b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (this.f14084a * 32713) + this.f14085b;
    }

    public String toString() {
        return this.f14084a + "x" + this.f14085b;
    }
}
