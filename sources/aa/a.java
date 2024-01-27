package aa;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.MainActivity;
import np.com.nepalipatro.R;
import np.com.nepalipatro.helpers.d;
import np.com.nepalipatro.helpers.l;

/* compiled from: WidgetProvider.kt */
public final class a extends AppWidgetProvider {
    public void onReceive(Context context, Intent intent) {
        m.f(context, "context");
        if (l.f16129a.o(context)) {
            super.onReceive(context, intent);
            Bundle bundle = null;
            if (p.n(intent != null ? intent.getAction() : null, "news_click", false, 2, (Object) null)) {
                Intent intent2 = new Intent(context, MainActivity.class);
                if (intent != null) {
                    bundle = intent.getExtras();
                }
                m.c(bundle);
                intent2.putExtras(bundle);
                intent2.setFlags(268468224);
                context.startActivity(intent2);
                return;
            }
            String action = intent != null ? intent.getAction() : null;
            d.a aVar = d.f15947a;
            if (!p.n(action, aVar.b(), false, 2, (Object) null)) {
                if (!p.n(intent != null ? intent.getAction() : null, aVar.c(), false, 2, (Object) null)) {
                    return;
                }
            }
            AppWidgetManager instance = AppWidgetManager.getInstance(context);
            m.e(instance, "getInstance(context)");
            int[] appWidgetIds = instance.getAppWidgetIds(new ComponentName(context, a.class));
            m.e(appWidgetIds, "appWidgetIds");
            for (int notifyAppWidgetViewDataChanged : appWidgetIds) {
                AppWidgetManager.getInstance(context).notifyAppWidgetViewDataChanged(notifyAppWidgetViewDataChanged, R.id.widget_lv);
            }
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        m.f(context, "context");
        m.f(appWidgetManager, "appWidgetManager");
        m.f(iArr, "appWidgetIds");
        super.onUpdate(context, appWidgetManager, iArr);
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Intent intent = new Intent(context, b.class);
            intent.putExtra("appWidgetId", iArr[i10]);
            intent.setData(Uri.parse(intent.toUri(1)));
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.news_widget_container);
            Intent intent2 = new Intent(context, a.class);
            intent2.setAction("news_click");
            remoteViews.setPendingIntentTemplate(R.id.widget_lv, PendingIntent.getBroadcast(context, 0, intent2, 134217728));
            remoteViews.setRemoteAdapter(R.id.widget_lv, intent);
            if (appWidgetManager != null) {
                appWidgetManager.updateAppWidget(iArr[i10], remoteViews);
            }
        }
    }
}
