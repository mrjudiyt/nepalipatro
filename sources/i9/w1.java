package i9;

/* compiled from: JobSupport.kt */
public class w1 extends a2 implements x {

    /* renamed from: j  reason: collision with root package name */
    private final boolean f14998j = P0();

    public w1(u1 u1Var) {
        super(true);
        b0(u1Var);
    }

    private final boolean P0() {
        a2 u10;
        r V = V();
        s sVar = V instanceof s ? (s) V : null;
        if (!(sVar == null || (u10 = sVar.u()) == null)) {
            while (!u10.S()) {
                r V2 = u10.V();
                s sVar2 = V2 instanceof s ? (s) V2 : null;
                if (sVar2 != null) {
                    u10 = sVar2.u();
                    if (u10 == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean S() {
        return this.f14998j;
    }

    public boolean T() {
        return true;
    }
}
