package k6;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public interface c {

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
    public interface a {
        void onConsentInfoUpdateFailure(@RecentlyNonNull e eVar);
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
    public interface b {
        void onConsentInfoUpdateSuccess();
    }

    /* renamed from: k6.c$c  reason: collision with other inner class name */
    /* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
    public enum C0257c {
        UNKNOWN,
        NOT_REQUIRED,
        REQUIRED
    }

    int getConsentStatus();

    boolean isConsentFormAvailable();

    void requestConsentInfoUpdate(@RecentlyNonNull Activity activity, @RecentlyNonNull d dVar, @RecentlyNonNull b bVar, @RecentlyNonNull a aVar);

    void reset();
}
