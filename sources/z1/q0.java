package z1;

import com.google.android.gms.internal.play_billing.zzb;
import java.util.concurrent.Future;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public final /* synthetic */ class q0 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Future f13133h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Runnable f13134i;

    public /* synthetic */ q0(Future future, Runnable runnable) {
        this.f13133h = future;
        this.f13134i = runnable;
    }

    public final void run() {
        Future future = this.f13133h;
        Runnable runnable = this.f13134i;
        if (!future.isDone() && !future.isCancelled()) {
            future.cancel(true);
            zzb.zzj("BillingClient", "Async task is taking too long, cancel it!");
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
