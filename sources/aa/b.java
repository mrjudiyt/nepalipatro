package aa;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViewsService;
import kotlin.jvm.internal.m;

/* compiled from: WidgetService.kt */
public final class b extends RemoteViewsService {
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        Context applicationContext = getApplicationContext();
        m.e(applicationContext, "this.applicationContext");
        return new da.b(applicationContext, intent);
    }
}
