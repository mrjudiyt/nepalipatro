package k5;

import l6.l;

/* compiled from: BaseUrl */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f9641a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9642b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9643c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9644d;

    public b(String str) {
        this(str, str, 1, 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f9643c != bVar.f9643c || this.f9644d != bVar.f9644d || !l.a(this.f9641a, bVar.f9641a) || !l.a(this.f9642b, bVar.f9642b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return l.b(this.f9641a, this.f9642b, Integer.valueOf(this.f9643c), Integer.valueOf(this.f9644d));
    }

    public b(String str, String str2, int i10, int i11) {
        this.f9641a = str;
        this.f9642b = str2;
        this.f9643c = i10;
        this.f9644d = i11;
    }
}
