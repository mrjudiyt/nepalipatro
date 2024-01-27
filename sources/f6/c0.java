package f6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
final class c0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d0 f14553a;

    /* synthetic */ c0(d0 d0Var, b0 b0Var) {
        this.f14553a = d0Var;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f14553a.f14556b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        d0 d0Var = this.f14553a;
        d0Var.c().post(new z(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f14553a.f14556b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        d0 d0Var = this.f14553a;
        d0Var.c().post(new a0(this));
    }
}
