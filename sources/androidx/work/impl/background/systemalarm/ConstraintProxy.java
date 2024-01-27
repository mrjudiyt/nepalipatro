package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.c;
import androidx.work.m;
import androidx.work.n;
import java.util.List;
import v1.p;

abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4783a = m.f("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    ConstraintProxy() {
    }

    static void a(Context context, List<p> list) {
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        for (p pVar : list) {
            c cVar = pVar.f12264j;
            z10 |= cVar.f();
            z11 |= cVar.g();
            z12 |= cVar.i();
            z13 |= cVar.b() != n.NOT_REQUIRED;
            if (z10 && z11 && z12 && z13) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.a(context, z10, z11, z12, z13));
    }

    public void onReceive(Context context, Intent intent) {
        m.c().a(f4783a, String.format("onReceive : %s", new Object[]{intent}), new Throwable[0]);
        context.startService(b.a(context));
    }
}
