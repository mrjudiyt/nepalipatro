package v9;

import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.helpers.g;

/* compiled from: Topics.kt */
public final class e {
    /* access modifiers changed from: private */
    public static final void c(Task task) {
        m.f(task, "task");
        if (task.isSuccessful()) {
            g.f16048a.a();
        }
    }

    public final void b() {
        try {
            FirebaseMessaging.getInstance().subscribeToTopic("FMC_TOPIC_ALL_USERS").addOnCompleteListener(d.f16975a);
        } catch (Exception e10) {
            if (g.f16048a.a()) {
                e10.printStackTrace();
            }
        }
    }
}
