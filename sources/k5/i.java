package k5;

import a6.k0;
import android.net.Uri;

/* compiled from: RangedUri */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final long f9688a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9689b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9690c;

    /* renamed from: d  reason: collision with root package name */
    private int f9691d;

    public i(String str, long j10, long j11) {
        this.f9690c = str == null ? "" : str;
        this.f9688a = j10;
        this.f9689b = j11;
    }

    public i a(i iVar, String str) {
        String c10 = c(str);
        if (iVar != null && c10.equals(iVar.c(str))) {
            long j10 = this.f9689b;
            long j11 = -1;
            if (j10 != -1) {
                long j12 = this.f9688a;
                if (j12 + j10 == iVar.f9688a) {
                    long j13 = iVar.f9689b;
                    if (j13 != -1) {
                        j11 = j10 + j13;
                    }
                    return new i(c10, j12, j11);
                }
            }
            long j14 = iVar.f9689b;
            if (j14 != -1) {
                long j15 = iVar.f9688a;
                if (j15 + j14 == this.f9688a) {
                    if (j10 != -1) {
                        j11 = j14 + j10;
                    }
                    return new i(c10, j15, j11);
                }
            }
        }
        return null;
    }

    public Uri b(String str) {
        return k0.e(str, this.f9690c);
    }

    public String c(String str) {
        return k0.d(str, this.f9690c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f9688a == iVar.f9688a && this.f9689b == iVar.f9689b && this.f9690c.equals(iVar.f9690c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f9691d == 0) {
            this.f9691d = ((((527 + ((int) this.f9688a)) * 31) + ((int) this.f9689b)) * 31) + this.f9690c.hashCode();
        }
        return this.f9691d;
    }

    public String toString() {
        String str = this.f9690c;
        long j10 = this.f9688a;
        long j11 = this.f9689b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 81);
        sb.append("RangedUri(referenceUri=");
        sb.append(str);
        sb.append(", start=");
        sb.append(j10);
        sb.append(", length=");
        sb.append(j11);
        sb.append(")");
        return sb.toString();
    }
}
