package np.com.nepalipatro.firebase;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.h;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.helpers.e;
import np.com.nepalipatro.helpers.g;
import np.com.nepalipatro.helpers.k;
import np.com.nepalipatro.helpers.l;
import v9.c;
import w9.i;

/* compiled from: MessagingService.kt */
public final class MessagingService extends FirebaseMessagingService {
    public void onMessageReceived(RemoteMessage remoteMessage) {
        m.f(remoteMessage, "remoteMessage");
        try {
            Map<String, String> data = remoteMessage.getData();
            m.e(data, "remoteMessage.data");
            g.a aVar = g.f16048a;
            aVar.b("FCM Received " + e.f15961a.c() + " with element size " + data.size());
            l.a aVar2 = l.f16129a;
            Context applicationContext = getApplicationContext();
            m.e(applicationContext, "applicationContext");
            aVar2.w(applicationContext);
            if (!data.isEmpty()) {
                HashMap hashMap = new HashMap();
                for (Map.Entry next : data.entrySet()) {
                    String str = (String) next.getKey();
                    String str2 = (String) next.getValue();
                    m.e(str, Constants.KEY);
                    m.e(str2, "value");
                    hashMap.put(str, str2);
                }
                Intent intent = new Intent();
                intent.putExtra(e.f15961a.c(), hashMap);
                h.d(getApplicationContext(), MessagingIntentService.class, 3001, intent);
            }
        } catch (Exception e10) {
            if (g.f16048a.a()) {
                e10.printStackTrace();
            }
        }
    }

    public void onNewToken(String str) {
        m.f(str, "s");
        super.onNewToken(str);
        g.a aVar = g.f16048a;
        aVar.b("Refreshed token from messaging service: " + str);
        k.a aVar2 = k.f16077a;
        Context applicationContext = getApplicationContext();
        m.e(applicationContext, "applicationContext");
        aVar2.x(applicationContext, aVar2.d(), false);
        try {
            if (!i.f17064a.a(str)) {
                new v9.e().b();
                new c(getApplicationContext(), str).a();
            }
        } catch (Exception e10) {
            if (g.f16048a.a()) {
                e10.printStackTrace();
            }
        }
    }
}
