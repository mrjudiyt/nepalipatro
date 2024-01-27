package r1;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* compiled from: NetworkState */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f10806a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f10807b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10808c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10809d;

    public b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f10806a = z10;
        this.f10807b = z11;
        this.f10808c = z12;
        this.f10809d = z13;
    }

    public boolean a() {
        return this.f10806a;
    }

    public boolean b() {
        return this.f10808c;
    }

    public boolean c() {
        return this.f10809d;
    }

    public boolean d() {
        return this.f10807b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f10806a == bVar.f10806a && this.f10807b == bVar.f10807b && this.f10808c == bVar.f10808c && this.f10809d == bVar.f10809d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f10806a;
        if (this.f10807b) {
            i10 += 16;
        }
        if (this.f10808c) {
            i10 += UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        return this.f10809d ? i10 + 4096 : i10;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.f10806a), Boolean.valueOf(this.f10807b), Boolean.valueOf(this.f10808c), Boolean.valueOf(this.f10809d)});
    }
}
