package f6;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
final class x extends t {

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ d0 f14592i;

    x(d0 d0Var) {
        this.f14592i = d0Var;
    }

    public final void a() {
        synchronized (this.f14592i.f14560f) {
            if (this.f14592i.f14565k.get() > 0) {
                if (this.f14592i.f14565k.decrementAndGet() > 0) {
                    this.f14592i.f14556b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
            }
            d0 d0Var = this.f14592i;
            if (d0Var.f14567m != null) {
                d0Var.f14556b.d("Unbind from service.", new Object[0]);
                d0 d0Var2 = this.f14592i;
                d0Var2.f14555a.unbindService(d0Var2.f14566l);
                this.f14592i.f14561g = false;
                this.f14592i.f14567m = null;
                this.f14592i.f14566l = null;
            }
            this.f14592i.w();
        }
    }
}
