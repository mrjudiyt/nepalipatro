package k5;

import a6.m0;

/* compiled from: ProgramInformation */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f9683a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9684b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9685c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9686d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9687e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f9683a = str;
        this.f9684b = str2;
        this.f9685c = str3;
        this.f9686d = str4;
        this.f9687e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!m0.c(this.f9683a, hVar.f9683a) || !m0.c(this.f9684b, hVar.f9684b) || !m0.c(this.f9685c, hVar.f9685c) || !m0.c(this.f9686d, hVar.f9686d) || !m0.c(this.f9687e, hVar.f9687e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f9683a;
        int i10 = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9684b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9685c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f9686d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f9687e;
        if (str5 != null) {
            i10 = str5.hashCode();
        }
        return hashCode4 + i10;
    }
}
