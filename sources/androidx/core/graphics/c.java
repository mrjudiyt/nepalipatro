package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* compiled from: Insets */
public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final c f2316e = new c(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f2317a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2318b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2319c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2320d;

    /* compiled from: Insets */
    static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private c(int i10, int i11, int i12, int i13) {
        this.f2317a = i10;
        this.f2318b = i11;
        this.f2319c = i12;
        this.f2320d = i13;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f2317a, cVar2.f2317a), Math.max(cVar.f2318b, cVar2.f2318b), Math.max(cVar.f2319c, cVar2.f2319c), Math.max(cVar.f2320d, cVar2.f2320d));
    }

    public static c b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f2316e;
        }
        return new c(i10, i11, i12, i13);
    }

    public static c c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static c d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f2317a, this.f2318b, this.f2319c, this.f2320d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2320d == cVar.f2320d && this.f2317a == cVar.f2317a && this.f2319c == cVar.f2319c && this.f2318b == cVar.f2318b;
    }

    public int hashCode() {
        return (((((this.f2317a * 31) + this.f2318b) * 31) + this.f2319c) * 31) + this.f2320d;
    }

    public String toString() {
        return "Insets{left=" + this.f2317a + ", top=" + this.f2318b + ", right=" + this.f2319c + ", bottom=" + this.f2320d + '}';
    }
}
