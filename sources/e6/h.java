package e6;

import android.content.Context;
import f6.e0;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static e f14258a;

    static synchronized e a(Context context) {
        e eVar;
        synchronized (h.class) {
            if (f14258a == null) {
                g gVar = new g((f) null);
                gVar.b(new n(e0.a(context)));
                f14258a = gVar.a();
            }
            eVar = f14258a;
        }
        return eVar;
    }
}
