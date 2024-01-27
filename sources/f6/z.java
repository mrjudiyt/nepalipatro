package f6;

import android.os.IBinder;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
final class z extends t {

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ IBinder f14593i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ c0 f14594j;

    z(c0 c0Var, IBinder iBinder) {
        this.f14594j = c0Var;
        this.f14593i = iBinder;
    }

    public final void a() {
        this.f14594j.f14553a.f14567m = k.A0(this.f14593i);
        d0.q(this.f14594j.f14553a);
        this.f14594j.f14553a.f14561g = false;
        for (Runnable run : this.f14594j.f14553a.f14558d) {
            run.run();
        }
        this.f14594j.f14553a.f14558d.clear();
    }
}
