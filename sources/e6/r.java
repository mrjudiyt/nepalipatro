package e6;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import f6.t;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
final class r extends t {

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ String f14272i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f14273j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ w f14274k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    r(w wVar, TaskCompletionSource taskCompletionSource, String str, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f14274k = wVar;
        this.f14272i = str;
        this.f14273j = taskCompletionSource2;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [f6.l, android.os.IInterface] */
    /* access modifiers changed from: protected */
    public final void a() {
        try {
            ? e10 = this.f14274k.f14285a.e();
            w wVar = this.f14274k;
            e10.c0(wVar.f14286b, w.b(wVar, this.f14272i), new v(this.f14274k, this.f14273j, this.f14272i));
        } catch (RemoteException e11) {
            w.f14283e.c(e11, "requestUpdateInfo(%s)", this.f14272i);
            this.f14273j.trySetException(new RuntimeException(e11));
        }
    }
}
