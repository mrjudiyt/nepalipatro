package e6;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.install.InstallException;
import f6.s;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
final class v extends t {

    /* renamed from: k  reason: collision with root package name */
    private final String f14281k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ w f14282l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    v(w wVar, TaskCompletionSource taskCompletionSource, String str) {
        super(wVar, new s("OnRequestInstallCallback"), taskCompletionSource);
        this.f14282l = wVar;
        this.f14281k = str;
    }

    public final void Q(Bundle bundle) {
        super.Q(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f14279i.trySetException(new InstallException(bundle.getInt("error.code", -2)));
        } else {
            this.f14279i.trySetResult(w.f(this.f14282l, bundle, this.f14281k));
        }
    }
}
