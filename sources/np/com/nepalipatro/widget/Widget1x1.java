package np.com.nepalipatro.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.format.DateFormat;
import android.widget.RemoteViews;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.Locale;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.MainActivity;
import np.com.nepalipatro.R;
import np.com.nepalipatro.helpers.d;
import np.com.nepalipatro.helpers.g;
import np.com.nepalipatro.helpers.l;
import np.com.nepalipatro.models.BsDate;
import v9.a;
import y9.b;
import y9.c;

/* compiled from: Widget1x1.kt */
public final class Widget1x1 extends AppWidgetProvider {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f16161a = true;

    private final PendingIntent a(Context context, String str) {
        Intent intent = new Intent(context, Widget1x1.class);
        intent.setAction(str);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 33554432);
        m.e(broadcast, "getBroadcast(context, 0,…ndingIntent.FLAG_MUTABLE)");
        return broadcast;
    }

    private final void b(Context context, AppWidgetManager appWidgetManager, int i10, boolean z10) {
        String str;
        String str2;
        g.a aVar = g.f16048a;
        aVar.b("updateWidget");
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget1x1);
        new c(context);
        b bVar = new b();
        if (DateFormat.is24HourFormat(context)) {
            l.a aVar2 = l.f16129a;
            Locale locale = Locale.ENGLISH;
            m.e(locale, ViewHierarchyConstants.ENGLISH);
            CharSequence g10 = aVar2.g(context, "HH:mm", locale);
            m.d(g10, "null cannot be cast to non-null type kotlin.String");
            str = (String) g10;
        } else {
            l.a aVar3 = l.f16129a;
            Locale locale2 = Locale.ENGLISH;
            m.e(locale2, ViewHierarchyConstants.ENGLISH);
            CharSequence g11 = aVar3.g(context, "h:mm", locale2);
            m.d(g11, "null cannot be cast to non-null type kotlin.String");
            str = (String) g11;
        }
        String str3 = str + " NPT";
        if (z10) {
            StringBuilder sb = new StringBuilder();
            sb.append("Current Language::");
            l.a aVar4 = l.f16129a;
            sb.append(aVar4.d(context));
            aVar.b(sb.toString());
            BsDate d10 = bVar.d(bVar.e(context));
            if (m.a(aVar4.e(context), new Locale("ne", ""))) {
                str2 = String.valueOf(d10.getMonthNpLong());
            } else {
                str2 = String.valueOf(d10.getMonthLong());
            }
            String h10 = aVar4.h(Integer.valueOf(d10.getDay()), aVar4.e(context), Boolean.FALSE);
            remoteViews.setTextViewText(R.id.textViewMonth, str2);
            remoteViews.setTextViewText(R.id.textViewDay, h10);
        }
        remoteViews.setTextViewText(R.id.textViewTime, str3);
        remoteViews.setOnClickPendingIntent(R.id.widget1x1, a(context, d.f15947a.d()));
        appWidgetManager.updateAppWidget(i10, remoteViews);
    }

    public void onDisabled(Context context) {
        m.f(context, "context");
        g.f16048a.b("onDisabled");
        new a(context.getApplicationContext()).f("WIDGET1x1");
        super.onDisabled(context);
    }

    public void onEnabled(Context context) {
        m.f(context, "context");
        super.onEnabled(context);
        g.f16048a.b("onEnabled");
        new a(context.getApplicationContext()).f("WIDGET1x1");
    }

    public void onReceive(Context context, Intent intent) {
        m.f(context, "context");
        m.f(intent, "intent");
        if (l.f16129a.o(context)) {
            g.a aVar = g.f16048a;
            aVar.b("onReceive");
            StringBuilder sb = new StringBuilder();
            sb.append("onReceive::");
            String action = intent.getAction();
            m.c(action);
            sb.append(action);
            aVar.b(sb.toString());
            super.onReceive(context, intent);
            if (AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, Widget1x1.class)).length < 1) {
                aVar.b("No 1x1 widget is added. Skipping update");
            } else if (m.a(intent.getAction(), d.f15947a.d())) {
                new a(context.getApplicationContext()).e("WIDGET1x1");
                Intent intent2 = new Intent(context, MainActivity.class);
                intent2.setFlags(872415232);
                context.startActivity(intent2);
            }
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        m.f(context, "context");
        m.f(appWidgetManager, "appWidgetManager");
        m.f(iArr, "appWidgetIds");
        super.onUpdate(context, appWidgetManager, iArr);
        g.f16048a.b(" Reset:" + this.f16161a);
        for (int i10 : iArr) {
            g.f16048a.b("appWidgetId: " + i10 + " Reset:" + this.f16161a);
            b(context, appWidgetManager, i10, this.f16161a);
        }
    }
}
