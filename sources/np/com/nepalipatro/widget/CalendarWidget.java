package np.com.nepalipatro.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.m;
import n7.a;
import np.com.nepalipatro.App;
import np.com.nepalipatro.MainActivity;
import np.com.nepalipatro.R;
import np.com.nepalipatro.helpers.d;
import np.com.nepalipatro.helpers.e;
import np.com.nepalipatro.helpers.f;
import np.com.nepalipatro.helpers.g;
import np.com.nepalipatro.helpers.k;
import np.com.nepalipatro.helpers.l;
import np.com.nepalipatro.models.BsDate;
import y9.b;

/* compiled from: CalendarWidget.kt */
public final class CalendarWidget extends AppWidgetProvider {

    /* renamed from: a  reason: collision with root package name */
    private b f16159a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f16160b = true;

    private final String a(String str, Boolean bool) {
        if (m.a(str, "")) {
            str = "yyyyMMdd";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, new Locale("en_US"));
        m.c(bool);
        if (bool.booleanValue()) {
            simpleDateFormat.setTimeZone(e.f15961a.T());
        }
        String format = simpleDateFormat.format(new Date());
        m.e(format, "dateFormat.format(date)");
        return format;
    }

    private final PendingIntent b(Context context, String str) {
        Intent intent = new Intent(context, CalendarWidget.class);
        intent.setAction(str);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 33554432);
        m.e(broadcast, "getBroadcast(context, 0,…ndingIntent.FLAG_MUTABLE)");
        return broadcast;
    }

    private final void c(Context context, RemoteViews remoteViews, b bVar) {
        String str;
        Context context2 = context;
        RemoteViews remoteViews2 = remoteViews;
        a aVar = new a(new p7.a("26.70", "86.15"), "Asia/Kathmandu");
        b bVar2 = this.f16159a;
        m.c(bVar2);
        Calendar e10 = bVar2.e(context2);
        String a10 = aVar.a(e10);
        String b10 = aVar.b(e10);
        Boolean bool = Boolean.TRUE;
        String a11 = a("MMMM d, yyyy", bool);
        k.a aVar2 = k.f16077a;
        String w10 = aVar2.w(context2, aVar2.h(), "ne");
        BsDate d10 = bVar.d(e10);
        String str2 = null;
        if (m.a(w10, "ne")) {
            if (d10 != null) {
                str2 = d10.getMonthNpLong();
            }
            str = String.valueOf(str2);
        } else {
            if (d10 != null) {
                str2 = d10.getMonthLong();
            }
            str = String.valueOf(str2);
        }
        StringBuilder sb = new StringBuilder();
        l.a aVar3 = l.f16129a;
        Integer valueOf = Integer.valueOf(d10.getYear());
        Locale e11 = aVar3.e(context2);
        Boolean bool2 = Boolean.FALSE;
        sb.append(aVar3.h(valueOf, e11, bool2));
        sb.append("");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        String str3 = b10;
        sb3.append(aVar3.h(Integer.valueOf(d10.getDay()), aVar3.e(context2), bool2));
        sb3.append("");
        String sb4 = sb3.toString();
        String dow_long = d10.getDow_long(String.valueOf(w10), e10);
        remoteViews2.setTextViewText(R.id.addate, a11);
        remoteViews2.setTextViewText(R.id.bsday, sb4);
        remoteViews2.setTextViewText(R.id.dow, dow_long);
        remoteViews2.setTextViewText(R.id.bsmonthyear, str + ", " + sb2);
        remoteViews2.setTextViewText(R.id.time, a("hh:mm a", bool) + " NST");
        remoteViews2.setTextViewText(R.id.textViewTodaySunRise, a10);
        remoteViews2.setTextViewText(R.id.textViewTodaySunSet, str3);
    }

    private final void d(Context context, AppWidgetManager appWidgetManager, int i10, boolean z10) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_calendar);
        k.a aVar = k.f16077a;
        String w10 = aVar.w(context, aVar.h(), "ne");
        b bVar = this.f16159a;
        m.c(bVar);
        c(context, remoteViews, bVar);
        Intent intent = new Intent(context, CalendarWidgetService.class);
        intent.putExtra("appWidgetId", i10);
        intent.setData(Uri.parse(intent.toUri(1)));
        Intent intent2 = new Intent(context, CalendarWidget.class);
        e.a aVar2 = e.f15961a;
        intent2.putExtra(aVar2.U(), aVar2.V());
        d.a aVar3 = d.f15947a;
        intent2.setAction(aVar3.h());
        remoteViews.setPendingIntentTemplate(R.id.gridViewCalendar, PendingIntent.getBroadcast(context, 0, intent2, 167772160));
        remoteViews.setRemoteAdapter(R.id.gridViewCalendar, intent);
        if (p.m(w10, "ne", true)) {
            remoteViews.setTextViewText(R.id.sun, "आ");
            remoteViews.setTextViewText(R.id.mon, "सो");
            remoteViews.setTextViewText(R.id.tue, "मं");
            remoteViews.setTextViewText(R.id.wed, "बु");
            remoteViews.setTextViewText(R.id.thu, "बि");
            remoteViews.setTextViewText(R.id.fri, "शु");
            remoteViews.setTextViewText(R.id.sat, "श");
        } else {
            remoteViews.setTextViewText(R.id.sun, context.getResources().getString(R.string.sun));
            remoteViews.setTextViewText(R.id.mon, context.getResources().getString(R.string.mon));
            remoteViews.setTextViewText(R.id.tue, context.getResources().getString(R.string.tue));
            remoteViews.setTextViewText(R.id.wed, context.getResources().getString(R.string.wed));
            remoteViews.setTextViewText(R.id.thu, context.getResources().getString(R.string.thu));
            remoteViews.setTextViewText(R.id.fri, context.getResources().getString(R.string.fri));
            remoteViews.setTextViewText(R.id.sat, context.getResources().getString(R.string.sat));
        }
        remoteViews.setOnClickPendingIntent(R.id.datewrapper, b(context, aVar3.g()));
        appWidgetManager.updateAppWidget(i10, remoteViews);
    }

    public void onDisabled(Context context) {
        m.f(context, "context");
        g.f16048a.b("onDisabled");
        Context applicationContext = context.getApplicationContext();
        m.d(applicationContext, "null cannot be cast to non-null type np.com.nepalipatro.App");
        new v9.a((App) applicationContext).f("WIDGET_CALENDAR");
        super.onDisabled(context);
    }

    public void onEnabled(Context context) {
        m.f(context, "context");
        g.f16048a.b("onEnabled");
        super.onEnabled(context);
    }

    public void onReceive(Context context, Intent intent) {
        Class<MainActivity> cls = MainActivity.class;
        m.f(context, "context");
        m.f(intent, "intent");
        if (l.f16129a.o(context)) {
            g.a aVar = g.f16048a;
            StringBuilder sb = new StringBuilder();
            sb.append("onReceive::");
            String action = intent.getAction();
            m.c(action);
            sb.append(action);
            aVar.b(sb.toString());
            super.onReceive(context, intent);
            String action2 = intent.getAction();
            d.a aVar2 = d.f15947a;
            if (m.a(action2, aVar2.g())) {
                Context applicationContext = context.getApplicationContext();
                m.d(applicationContext, "null cannot be cast to non-null type np.com.nepalipatro.App");
                new v9.a((App) applicationContext).e("WIDGET_CALENDAR");
                Intent intent2 = new Intent(context, cls);
                intent2.setFlags(268468224);
                context.startActivity(intent2);
            }
            if (m.a(intent.getAction(), aVar2.h())) {
                f.a aVar3 = f.f16022a;
                if (intent.hasExtra(aVar3.a())) {
                    Context applicationContext2 = context.getApplicationContext();
                    m.d(applicationContext2, "null cannot be cast to non-null type np.com.nepalipatro.App");
                    v9.a aVar4 = new v9.a((App) applicationContext2);
                    aVar4.e("WIDGET_CALENDAR - " + intent.getStringExtra(aVar3.a()));
                } else {
                    Context applicationContext3 = context.getApplicationContext();
                    m.d(applicationContext3, "null cannot be cast to non-null type np.com.nepalipatro.App");
                    new v9.a((App) applicationContext3).e("WIDGET_CALENDAR");
                }
                Intent intent3 = new Intent(context, cls);
                Bundle extras = intent.getExtras();
                m.c(extras);
                intent3.putExtras(extras);
                intent3.setFlags(268468224);
                context.startActivity(intent3);
            }
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        m.f(context, "context");
        m.f(appWidgetManager, "appWidgetManager");
        m.f(iArr, "appWidgetIds");
        this.f16159a = new b();
        for (int i10 : iArr) {
            if (this.f16160b) {
                appWidgetManager.notifyAppWidgetViewDataChanged(i10, R.id.gridViewCalendar);
            }
            d(context, appWidgetManager, i10, this.f16160b);
        }
        super.onUpdate(context, appWidgetManager, iArr);
    }
}
