package h4;

/* compiled from: Buffer */
public abstract class a {

    /* renamed from: h  reason: collision with root package name */
    private int f8941h;

    public final void g(int i10) {
        this.f8941h = i10 | this.f8941h;
    }

    public void k() {
        this.f8941h = 0;
    }

    public final void l(int i10) {
        this.f8941h = (~i10) & this.f8941h;
    }

    /* access modifiers changed from: protected */
    public final boolean m(int i10) {
        return (this.f8941h & i10) == i10;
    }

    public final boolean n() {
        return m(268435456);
    }

    public final boolean o() {
        return m(Integer.MIN_VALUE);
    }

    public final boolean p() {
        return m(4);
    }

    public final boolean q() {
        return m(1);
    }

    public final void r(int i10) {
        this.f8941h = i10;
    }
}
