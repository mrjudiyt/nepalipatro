package t2;

import android.content.Context;
import android.util.Log;
import androidx.core.content.a;
import t2.c;

/* compiled from: DefaultConnectivityMonitorFactory */
public class f implements d {
    public c a(Context context, c.a aVar) {
        boolean z10 = a.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        boolean isLoggable = Log.isLoggable("ConnectivityMonitor", 3);
        if (z10) {
            return new e(context, aVar);
        }
        return new j();
    }
}
