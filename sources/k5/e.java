package k5;

import a6.m0;

/* compiled from: Descriptor */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f9670a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9671b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9672c;

    public e(String str, String str2, String str3) {
        this.f9670a = str;
        this.f9671b = str2;
        this.f9672c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!m0.c(this.f9670a, eVar.f9670a) || !m0.c(this.f9671b, eVar.f9671b) || !m0.c(this.f9672c, eVar.f9672c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.f9670a.hashCode() * 31;
        String str = this.f9671b;
        int i10 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9672c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }
}
