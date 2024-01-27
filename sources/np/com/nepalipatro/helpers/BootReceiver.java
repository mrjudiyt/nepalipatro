package np.com.nepalipatro.helpers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.helpers.g;
import np.com.nepalipatro.helpers.l;

/* compiled from: BootReceiver.kt */
public final class BootReceiver extends BroadcastReceiver {
    public final void a(Context context, Intent intent) {
        l.a aVar = l.f16129a;
        m.c(context);
        aVar.w(context);
        aVar.y(context);
    }

    public void onReceive(Context context, Intent intent) {
        g.a aVar = g.f16048a;
        StringBuilder sb = new StringBuilder();
        sb.append("BootReceiver ");
        m.c(intent);
        sb.append(intent.getAction());
        aVar.b(sb.toString());
        a(context, intent);
    }
}
