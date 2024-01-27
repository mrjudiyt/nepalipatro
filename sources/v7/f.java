package v7;

import w7.h;

/* compiled from: Challenge */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final String f16789a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16790b;

    public f(String str, String str2) {
        this.f16789a = str;
        this.f16790b = str2;
    }

    public String a() {
        return this.f16790b;
    }

    public String b() {
        return this.f16789a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            return h.h(this.f16789a, fVar.f16789a) && h.h(this.f16790b, fVar.f16790b);
        }
    }

    public int hashCode() {
        String str = this.f16790b;
        int i10 = 0;
        int hashCode = (899 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f16789a;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return this.f16789a + " realm=\"" + this.f16790b + "\"";
    }
}
