package e6;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import f6.m;
import f6.s;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
class t extends m {

    /* renamed from: h  reason: collision with root package name */
    final s f14278h;

    /* renamed from: i  reason: collision with root package name */
    final TaskCompletionSource f14279i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ w f14280j;

    t(w wVar, s sVar, TaskCompletionSource taskCompletionSource) {
        this.f14280j = wVar;
        this.f14278h = sVar;
        this.f14279i = taskCompletionSource;
    }

    public void Q(Bundle bundle) {
        this.f14280j.f14285a.u(this.f14279i);
        this.f14278h.d("onRequestInfo", new Object[0]);
    }

    public void zzb(Bundle bundle) {
        this.f14280j.f14285a.u(this.f14279i);
        this.f14278h.d("onCompleteUpdate", new Object[0]);
    }
}
