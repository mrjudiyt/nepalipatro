package e6;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private n f14257a;

    /* synthetic */ g(f fVar) {
    }

    public final e a() {
        n nVar = this.f14257a;
        if (nVar != null) {
            return new e0(nVar, (d0) null);
        }
        throw new IllegalStateException(String.valueOf(n.class.getCanonicalName()).concat(" must be set"));
    }

    public final g b(n nVar) {
        this.f14257a = nVar;
        return this;
    }
}
