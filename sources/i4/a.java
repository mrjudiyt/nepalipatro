package i4;

import b6.y;
import e4.b;

/* compiled from: DeviceInfo */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f9275d = new a(0, 0, 0);

    /* renamed from: e  reason: collision with root package name */
    public static final b<a> f9276e = y.f5134a;

    /* renamed from: a  reason: collision with root package name */
    public final int f9277a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9278b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9279c;

    public a(int i10, int i11, int i12) {
        this.f9277a = i10;
        this.f9278b = i11;
        this.f9279c = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f9277a == aVar.f9277a && this.f9278b == aVar.f9278b && this.f9279c == aVar.f9279c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f9277a) * 31) + this.f9278b) * 31) + this.f9279c;
    }
}
