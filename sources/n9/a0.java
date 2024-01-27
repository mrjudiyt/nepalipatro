package n9;

import i9.e2;
import i9.v0;
import kotlin.KotlinNothingValueException;
import r8.g;

/* compiled from: MainDispatchers.kt */
final class a0 extends e2 implements v0 {

    /* renamed from: j  reason: collision with root package name */
    private final Throwable f15787j;

    /* renamed from: k  reason: collision with root package name */
    private final String f15788k;

    public a0(Throwable th, String str) {
        this.f15787j = th;
        this.f15788k = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Void Q0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f15787j
            if (r0 == 0) goto L_0x0036
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f15788k
            if (r1 == 0) goto L_0x0025
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L_0x0027
        L_0x0025:
            java.lang.String r1 = ""
        L_0x0027:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f15787j
            r1.<init>(r0, r2)
            throw r1
        L_0x0036:
            n9.z.d()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.a0.Q0():java.lang.Void");
    }

    public boolean L0(g gVar) {
        Q0();
        throw new KotlinNothingValueException();
    }

    public e2 N0() {
        return this;
    }

    /* renamed from: P0 */
    public Void K0(g gVar, Runnable runnable) {
        Q0();
        throw new KotlinNothingValueException();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.f15787j != null) {
            str = ", cause=" + this.f15787j;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }
}
