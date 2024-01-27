package k6;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.consent_sdk.zzc;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final class f {

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
    public interface a {
        void onConsentFormLoadFailure(@RecentlyNonNull e eVar);
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
    public interface b {
        void onConsentFormLoadSuccess(@RecentlyNonNull b bVar);
    }

    @RecentlyNonNull
    public static c a(@RecentlyNonNull Context context) {
        return zzc.zza(context).zzb();
    }

    public static void b(@RecentlyNonNull Context context, @RecentlyNonNull b bVar, @RecentlyNonNull a aVar) {
        zzc.zza(context).zzc().zzb(bVar, aVar);
    }
}
