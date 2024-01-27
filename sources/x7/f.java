package x7;

import ea.h;

/* compiled from: Header */
public final class f {

    /* renamed from: d  reason: collision with root package name */
    public static final h f17208d = h.e(":status");

    /* renamed from: e  reason: collision with root package name */
    public static final h f17209e = h.e(":method");

    /* renamed from: f  reason: collision with root package name */
    public static final h f17210f = h.e(":path");

    /* renamed from: g  reason: collision with root package name */
    public static final h f17211g = h.e(":scheme");

    /* renamed from: h  reason: collision with root package name */
    public static final h f17212h = h.e(":authority");

    /* renamed from: i  reason: collision with root package name */
    public static final h f17213i = h.e(":host");

    /* renamed from: j  reason: collision with root package name */
    public static final h f17214j = h.e(":version");

    /* renamed from: a  reason: collision with root package name */
    public final h f17215a;

    /* renamed from: b  reason: collision with root package name */
    public final h f17216b;

    /* renamed from: c  reason: collision with root package name */
    final int f17217c;

    public f(String str, String str2) {
        this(h.e(str), h.e(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f17215a.equals(fVar.f17215a) || !this.f17216b.equals(fVar.f17216b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f17215a.hashCode()) * 31) + this.f17216b.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", new Object[]{this.f17215a.x(), this.f17216b.x()});
    }

    public f(h hVar, String str) {
        this(hVar, h.e(str));
    }

    public f(h hVar, h hVar2) {
        this.f17215a = hVar;
        this.f17216b = hVar2;
        this.f17217c = hVar.u() + 32 + hVar2.u();
    }
}
