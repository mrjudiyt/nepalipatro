package e6;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import f6.t;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
final class s extends t {

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f14275i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ String f14276j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ w f14277k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    s(w wVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, String str) {
        super(taskCompletionSource);
        this.f14277k = wVar;
        this.f14275i = taskCompletionSource2;
        this.f14276j = str;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [f6.l, android.os.IInterface] */
    /* access modifiers changed from: protected */
    public final void a() {
        try {
            this.f14277k.f14285a.e().S(this.f14277k.f14286b, w.i(), new u(this.f14277k, this.f14275i));
        } catch (RemoteException e10) {
            w.f14283e.c(e10, "completeUpdate(%s)", this.f14276j);
            this.f14275i.trySetException(new RuntimeException(e10));
        }
    }
}
