package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.m;
import androidx.work.o;
import androidx.work.w;

public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4834a = m.f("DiagnosticsRcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            m.c().a(f4834a, "Requesting diagnostics", new Throwable[0]);
            try {
                w.f(context).b(o.d(DiagnosticsWorker.class));
            } catch (IllegalStateException e10) {
                m.c().b(f4834a, "WorkManager is not initialized", e10);
            }
        }
    }
}
