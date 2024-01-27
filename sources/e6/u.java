package e6;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.install.InstallException;
import f6.s;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
final class u extends t {
    u(w wVar, TaskCompletionSource taskCompletionSource) {
        super(wVar, new s("OnCompleteUpdateCallback"), taskCompletionSource);
    }

    public final void zzb(Bundle bundle) {
        super.zzb(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f14279i.trySetException(new InstallException(bundle.getInt("error.code", -2)));
        } else {
            this.f14279i.trySetResult(null);
        }
    }
}
