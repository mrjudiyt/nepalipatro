package f6;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
public final /* synthetic */ class u implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d0 f14586a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f14587b;

    public /* synthetic */ u(d0 d0Var, TaskCompletionSource taskCompletionSource) {
        this.f14586a = d0Var;
        this.f14587b = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        this.f14586a.t(this.f14587b, task);
    }
}
