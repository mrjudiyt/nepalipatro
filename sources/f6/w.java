package f6;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
final class w extends t {

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f14589i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ t f14590j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ d0 f14591k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    w(d0 d0Var, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, t tVar) {
        super(taskCompletionSource);
        this.f14591k = d0Var;
        this.f14589i = taskCompletionSource2;
        this.f14590j = tVar;
    }

    public final void a() {
        synchronized (this.f14591k.f14560f) {
            d0.n(this.f14591k, this.f14589i);
            if (this.f14591k.f14565k.getAndIncrement() > 0) {
                this.f14591k.f14556b.d("Already connected to the service.", new Object[0]);
            }
            d0.p(this.f14591k, this.f14590j);
        }
    }
}
