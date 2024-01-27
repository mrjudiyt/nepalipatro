package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.privacysandbox.ads.adservices.topics.i;
import androidx.profileinstaller.h;

public class ProfileInstallReceiver extends BroadcastReceiver {

    class a implements h.c {
        a() {
        }

        public void a(int i10, Object obj) {
            h.f3949b.a(i10, obj);
        }

        public void b(int i10, Object obj) {
            h.f3949b.b(i10, obj);
            ProfileInstallReceiver.this.setResultCode(i10);
        }
    }

    static void a(h.c cVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            Process.sendSignal(Process.myPid(), 10);
            cVar.b(12, (Object) null);
            return;
        }
        cVar.b(13, (Object) null);
    }

    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                h.k(context, i.f3908h, new a(), true);
            } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        h.l(context, i.f3908h, new a());
                    } else if ("DELETE_SKIP_FILE".equals(string)) {
                        h.c(context, i.f3908h, new a());
                    }
                }
            } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                a(new a());
            } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                a aVar = new a();
                if ("DROP_SHADER_CACHE".equals(string2)) {
                    a.b(context, aVar);
                } else {
                    aVar.b(16, (Object) null);
                }
            }
        }
    }
}
