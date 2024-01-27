package h4;

import a6.a;
import e4.j;

/* compiled from: DecoderReuseEvaluation */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f8965a;

    /* renamed from: b  reason: collision with root package name */
    public final j f8966b;

    /* renamed from: c  reason: collision with root package name */
    public final j f8967c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8968d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8969e;

    public e(String str, j jVar, j jVar2, int i10, int i11) {
        a.a(i10 == 0 || i11 == 0);
        this.f8965a = a.d(str);
        this.f8966b = (j) a.e(jVar);
        this.f8967c = (j) a.e(jVar2);
        this.f8968d = i10;
        this.f8969e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f8968d != eVar.f8968d || this.f8969e != eVar.f8969e || !this.f8965a.equals(eVar.f8965a) || !this.f8966b.equals(eVar.f8966b) || !this.f8967c.equals(eVar.f8967c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((527 + this.f8968d) * 31) + this.f8969e) * 31) + this.f8965a.hashCode()) * 31) + this.f8966b.hashCode()) * 31) + this.f8967c.hashCode();
    }
}
