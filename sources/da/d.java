package da;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.App;
import np.com.nepalipatro.MainActivity;
import np.com.nepalipatro.R;
import np.com.nepalipatro.helpers.d;
import np.com.nepalipatro.helpers.f;
import np.com.nepalipatro.helpers.g;
import np.com.nepalipatro.helpers.l;
import v9.a;
import w9.i;

/* compiled from: WidgetProvider.kt */
public final class d extends AppWidgetProvider {
    public void onDisabled(Context context) {
        m.f(context, "context");
        g.f16048a.b("onDisabled");
        new a(context.getApplicationContext()).f("NEWS");
        super.onDisabled(context);
    }

    public void onEnabled(Context context) {
        m.f(context, "context");
        super.onEnabled(context);
        g.f16048a.b("onEnabled");
        new a(context.getApplicationContext()).f("NEWS");
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        Class<MainActivity> cls = MainActivity.class;
        m.f(context, "context");
        m.f(intent, "intent");
        if (l.f16129a.o(context)) {
            super.onReceive(context, intent);
            String action = intent.getAction();
            d.a aVar = np.com.nepalipatro.helpers.d.f15947a;
            if (m.a(action, aVar.b()) || m.a(intent.getAction(), aVar.c())) {
                int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context.getPackageName(), d.class.getName()));
                m.e(appWidgetIds, "appWidgetIds");
                for (int notifyAppWidgetViewDataChanged : appWidgetIds) {
                    AppWidgetManager.getInstance(context).notifyAppWidgetViewDataChanged(notifyAppWidgetViewDataChanged, R.id.feedsListView);
                }
            }
            String action2 = intent.getAction();
            d.a aVar2 = np.com.nepalipatro.helpers.d.f15947a;
            if (m.a(action2, aVar2.i())) {
                Intent intent2 = new Intent(context, cls);
                Bundle extras = intent.getExtras();
                m.c(extras);
                intent2.putExtras(extras);
                intent2.setFlags(335577088);
                context.startActivity(intent2);
                Context applicationContext = context.getApplicationContext();
                m.d(applicationContext, "null cannot be cast to non-null type np.com.nepalipatro.App");
                new a((App) applicationContext).e("NEWS ICON");
            }
            if (m.a(intent.getAction(), aVar2.j())) {
                Intent intent3 = new Intent(context, cls);
                Bundle extras2 = intent.getExtras();
                m.c(extras2);
                intent3.putExtras(extras2);
                intent3.setFlags(335577088);
                context.startActivity(intent3);
                Context applicationContext2 = context.getApplicationContext();
                m.d(applicationContext2, "null cannot be cast to non-null type np.com.nepalipatro.App");
                a aVar3 = new a((App) applicationContext2);
                StringBuilder sb = new StringBuilder();
                sb.append("NEWS - ");
                i iVar = i.f17064a;
                f.a aVar4 = f.f16022a;
                if (iVar.a(intent.getStringExtra(aVar4.g()))) {
                    str = intent.getStringExtra(aVar4.h());
                } else {
                    str = intent.getStringExtra(aVar4.g()) + " - " + intent.getStringExtra(aVar4.h());
                }
                sb.append(str);
                aVar3.e(sb.toString());
            }
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        m.f(context, "context");
        m.f(appWidgetManager, "appWidgetManager");
        m.f(iArr, "appWidgetIds");
        super.onUpdate(context, appWidgetManager, iArr);
        for (int i10 : iArr) {
        }
    }
}
