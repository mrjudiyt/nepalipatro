package f6;

import android.os.IBinder;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
public final /* synthetic */ class v implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d0 f14588a;

    public /* synthetic */ v(d0 d0Var) {
        this.f14588a = d0Var;
    }

    public final void binderDied() {
        d0.j(this.f14588a);
    }
}
