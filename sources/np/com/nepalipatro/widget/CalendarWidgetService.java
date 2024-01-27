package np.com.nepalipatro.widget;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViewsService;
import da.a;
import kotlin.jvm.internal.m;
import y9.b;
import y9.c;

/* compiled from: CalendarWidgetService.kt */
public final class CalendarWidgetService extends RemoteViewsService {
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        m.f(intent, "intent");
        b bVar = new b();
        c cVar = new c(this);
        Context applicationContext = getApplicationContext();
        m.e(applicationContext, "applicationContext");
        a aVar = new a(applicationContext);
        aVar.b(bVar, cVar);
        return new da.c(this, intent, aVar.a());
    }
}
