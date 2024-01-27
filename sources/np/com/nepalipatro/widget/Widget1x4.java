package np.com.nepalipatro.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.App;
import np.com.nepalipatro.MainActivity;
import np.com.nepalipatro.helpers.d;
import np.com.nepalipatro.helpers.g;
import np.com.nepalipatro.helpers.l;
import u9.a;
import y9.b;
import y9.c;

/* compiled from: Widget1x4.kt */
public final class Widget1x4 extends AppWidgetProvider {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f16162a = true;

    /* renamed from: b  reason: collision with root package name */
    private b f16163b;

    /* renamed from: c  reason: collision with root package name */
    private c f16164c;

    /* renamed from: d  reason: collision with root package name */
    private a f16165d;

    private final PendingIntent a(Context context, String str) {
        Intent intent = new Intent(context, Widget1x4.class);
        intent.setAction(str);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 33554432);
        m.e(broadcast, "getBroadcast(context, 0,…ndingIntent.FLAG_MUTABLE)");
        return broadcast;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(android.content.Context r24, android.appwidget.AppWidgetManager r25, int r26, boolean r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            np.com.nepalipatro.helpers.g$a r2 = np.com.nepalipatro.helpers.g.f16048a
            java.lang.String r3 = "updateWidget"
            r2.b(r3)
            y9.b r2 = new y9.b
            r2.<init>()
            r0.f16163b = r2
            y9.c r2 = new y9.c
            r2.<init>(r1)
            r0.f16164c = r2
            u9.a r2 = new u9.a
            r2.<init>(r1)
            r0.f16165d = r2
            np.com.nepalipatro.helpers.k$a r2 = np.com.nepalipatro.helpers.k.f16077a
            java.lang.String r3 = r2.h()
            java.lang.String r4 = "ne"
            java.lang.String r2 = r2.w(r1, r3, r4)
            if (r2 != 0) goto L_0x002f
            r2 = r4
        L_0x002f:
            y9.b r3 = r0.f16163b
            kotlin.jvm.internal.m.c(r3)
            java.util.Calendar r3 = r3.e(r1)
            y9.b r5 = r0.f16163b
            if (r5 == 0) goto L_0x0041
            np.com.nepalipatro.models.BsDate r5 = r5.d(r3)
            goto L_0x0042
        L_0x0041:
            r5 = 0
        L_0x0042:
            android.widget.RemoteViews r7 = new android.widget.RemoteViews
            java.lang.String r8 = r24.getPackageName()
            r9 = 2131492993(0x7f0c0081, float:1.8609454E38)
            r7.<init>(r8, r9)
            boolean r8 = android.text.format.DateFormat.is24HourFormat(r24)
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.String"
            java.lang.String r10 = "ENGLISH"
            if (r8 == 0) goto L_0x006b
            np.com.nepalipatro.helpers.l$a r8 = np.com.nepalipatro.helpers.l.f16129a
            java.util.Locale r11 = java.util.Locale.ENGLISH
            kotlin.jvm.internal.m.e(r11, r10)
            java.lang.String r12 = "HH:mm"
            java.lang.CharSequence r8 = r8.g(r1, r12, r11)
            kotlin.jvm.internal.m.d(r8, r9)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x007d
        L_0x006b:
            np.com.nepalipatro.helpers.l$a r8 = np.com.nepalipatro.helpers.l.f16129a
            java.util.Locale r11 = java.util.Locale.ENGLISH
            kotlin.jvm.internal.m.e(r11, r10)
            java.lang.String r12 = "h:mm"
            java.lang.CharSequence r8 = r8.g(r1, r12, r11)
            kotlin.jvm.internal.m.d(r8, r9)
            java.lang.String r8 = (java.lang.String) r8
        L_0x007d:
            g9.f r11 = new g9.f
            java.lang.String r12 = " "
            r11.<init>((java.lang.String) r12)
            r12 = 0
            java.util.List r8 = r11.c(r8, r12)
            boolean r11 = r8.isEmpty()
            r13 = 1
            if (r11 != 0) goto L_0x00b9
            int r11 = r8.size()
            java.util.ListIterator r11 = r8.listIterator(r11)
        L_0x0098:
            boolean r14 = r11.hasPrevious()
            if (r14 == 0) goto L_0x00b9
            java.lang.Object r14 = r11.previous()
            java.lang.String r14 = (java.lang.String) r14
            int r14 = r14.length()
            if (r14 != 0) goto L_0x00ac
            r14 = 1
            goto L_0x00ad
        L_0x00ac:
            r14 = 0
        L_0x00ad:
            if (r14 != 0) goto L_0x0098
            int r11 = r11.nextIndex()
            int r11 = r11 + r13
            java.util.List r8 = p8.x.P(r8, r11)
            goto L_0x00bd
        L_0x00b9:
            java.util.List r8 = p8.p.e()
        L_0x00bd:
            java.lang.String[] r11 = new java.lang.String[r12]
            java.lang.Object[] r8 = r8.toArray(r11)
            java.lang.String[] r8 = (java.lang.String[]) r8
            r11 = 2131296713(0x7f0901c9, float:1.821135E38)
            r14 = r8[r12]
            r7.setTextViewText(r11, r14)
            int r11 = r8.length
            r14 = 2131296712(0x7f0901c8, float:1.8211348E38)
            r15 = 2
            if (r11 != r15) goto L_0x00eb
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r8 = r8[r13]
            r11.append(r8)
            java.lang.String r8 = " NPT"
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r7.setTextViewText(r14, r8)
            goto L_0x00f0
        L_0x00eb:
            java.lang.String r8 = "NPT"
            r7.setTextViewText(r14, r8)
        L_0x00f0:
            if (r27 == 0) goto L_0x0244
            np.com.nepalipatro.helpers.l$a r8 = np.com.nepalipatro.helpers.l.f16129a
            java.util.Locale r11 = java.util.Locale.ENGLISH
            kotlin.jvm.internal.m.e(r11, r10)
            java.lang.String r10 = "MMMM d, yyyy"
            java.lang.CharSequence r10 = r8.g(r1, r10, r11)
            kotlin.jvm.internal.m.d(r10, r9)
            java.lang.String r10 = (java.lang.String) r10
            boolean r4 = kotlin.jvm.internal.m.a(r2, r4)
            if (r4 == 0) goto L_0x0117
            if (r5 == 0) goto L_0x0111
            java.lang.String r4 = r5.getMonthNpLong()
            goto L_0x0112
        L_0x0111:
            r4 = 0
        L_0x0112:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            goto L_0x0123
        L_0x0117:
            if (r5 == 0) goto L_0x011e
            java.lang.String r4 = r5.getMonthLong()
            goto L_0x011f
        L_0x011e:
            r4 = 0
        L_0x011f:
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L_0x0123:
            if (r5 == 0) goto L_0x012a
            int r9 = r5.getDay()
            goto L_0x012b
        L_0x012a:
            r9 = 0
        L_0x012b:
            java.lang.String r9 = r8.t(r9)
            int r9 = java.lang.Integer.parseInt(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.util.Locale r11 = r8.e(r1)
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            java.lang.String r9 = r8.h(r9, r11, r14)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            if (r5 == 0) goto L_0x014c
            int r12 = r5.getYear()
        L_0x014c:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.util.Locale r6 = r8.e(r1)
            java.lang.String r6 = r8.h(r12, r6, r14)
            r11.append(r6)
            java.lang.String r6 = ""
            r11.append(r6)
            java.lang.String r8 = r11.toString()
            if (r5 == 0) goto L_0x016b
            java.lang.String r5 = r5.getDow_long(r2, r3)
            goto L_0x016c
        L_0x016b:
            r5 = 0
        L_0x016c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r4)
            r4 = 32
            r11.append(r4)
            r11.append(r9)
            java.lang.String r9 = ", "
            r11.append(r9)
            r11.append(r8)
            r11.append(r4)
            r11.append(r5)
            java.lang.String r4 = r11.toString()
            if (r3 == 0) goto L_0x0199
            y9.c r5 = r0.f16164c
            if (r5 == 0) goto L_0x0199
            np.com.nepalipatro.models.NsDate r5 = r5.d(r3)
            goto L_0x019a
        L_0x0199:
            r5 = 0
        L_0x019a:
            if (r5 == 0) goto L_0x01a2
            java.lang.String r5 = r5.getTithiLong(r2)
            if (r5 != 0) goto L_0x01a3
        L_0x01a2:
            r5 = r6
        L_0x01a3:
            java.util.Calendar r8 = java.util.Calendar.getInstance()
            java.util.Calendar r9 = java.util.Calendar.getInstance()
            if (r3 == 0) goto L_0x01b6
            int r11 = r3.get(r13)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x01b7
        L_0x01b6:
            r11 = 0
        L_0x01b7:
            kotlin.jvm.internal.m.c(r11)
            int r17 = r11.intValue()
            int r18 = r3.get(r15)
            r11 = 5
            int r19 = r3.get(r11)
            r20 = 0
            r21 = 0
            r22 = 0
            r16 = r8
            r16.set(r17, r18, r19, r20, r21, r22)
            int r17 = r3.get(r13)
            int r18 = r3.get(r15)
            int r19 = r3.get(r11)
            r20 = 23
            r21 = 59
            r16 = r9
            r16.set(r17, r18, r19, r20, r21, r22)
            u9.a r3 = r0.f16165d
            kotlin.jvm.internal.m.c(r3)
            java.lang.String r11 = "startDate"
            kotlin.jvm.internal.m.e(r8, r11)
            java.lang.String r2 = r3.s(r8, r9, r2)
            w9.i r3 = w9.i.f17064a
            boolean r8 = r3.a(r5)
            if (r8 == 0) goto L_0x0204
            boolean r8 = r3.a(r2)
            if (r8 == 0) goto L_0x0204
            goto L_0x0232
        L_0x0204:
            boolean r8 = r3.a(r5)
            if (r8 != 0) goto L_0x0212
            boolean r8 = r3.a(r2)
            if (r8 == 0) goto L_0x0212
            r6 = r5
            goto L_0x0232
        L_0x0212:
            boolean r8 = r3.a(r5)
            if (r8 != 0) goto L_0x0232
            boolean r3 = r3.a(r2)
            if (r3 != 0) goto L_0x0232
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            java.lang.String r5 = " - "
            r3.append(r5)
            r3.append(r2)
            java.lang.String r6 = r3.toString()
        L_0x0232:
            r2 = 2131296709(0x7f0901c5, float:1.8211342E38)
            r7.setTextViewText(r2, r10)
            r2 = 2131296710(0x7f0901c6, float:1.8211344E38)
            r7.setTextViewText(r2, r4)
            r2 = 2131296711(0x7f0901c7, float:1.8211346E38)
            r7.setTextViewText(r2, r6)
        L_0x0244:
            r2 = 2131296771(0x7f090203, float:1.8211468E38)
            np.com.nepalipatro.helpers.d$a r3 = np.com.nepalipatro.helpers.d.f15947a
            java.lang.String r3 = r3.e()
            android.app.PendingIntent r1 = r0.a(r1, r3)
            r7.setOnClickPendingIntent(r2, r1)
            r1 = r25
            r2 = r26
            r1.updateAppWidget(r2, r7)
            np.com.nepalipatro.helpers.g$a r1 = np.com.nepalipatro.helpers.g.f16048a
            java.lang.String r2 = "Updated app widget 8"
            r1.b(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: np.com.nepalipatro.widget.Widget1x4.b(android.content.Context, android.appwidget.AppWidgetManager, int, boolean):void");
    }

    public void onDisabled(Context context) {
        m.f(context, "context");
        g.f16048a.b("onDisabled");
        Context applicationContext = context.getApplicationContext();
        m.d(applicationContext, "null cannot be cast to non-null type np.com.nepalipatro.App");
        new v9.a((App) applicationContext).f("WIDGET1x4");
        super.onDisabled(context);
    }

    public void onEnabled(Context context) {
        m.f(context, "context");
        super.onEnabled(context);
        g.f16048a.b("onEnabled");
    }

    public void onReceive(Context context, Intent intent) {
        m.f(context, "context");
        m.f(intent, "intent");
        super.onReceive(context, intent);
        if (l.f16129a.o(context)) {
            g.a aVar = g.f16048a;
            aVar.b("onReceive");
            StringBuilder sb = new StringBuilder();
            sb.append("onReceive::");
            String action = intent.getAction();
            m.c(action);
            sb.append(action);
            aVar.b(sb.toString());
            if (AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, Widget1x4.class)).length >= 1 && m.a(intent.getAction(), d.f15947a.e())) {
                Context applicationContext = context.getApplicationContext();
                m.d(applicationContext, "null cannot be cast to non-null type np.com.nepalipatro.App");
                new v9.a((App) applicationContext).e("WIDGET1x4");
                Intent intent2 = new Intent(context, MainActivity.class);
                intent2.setFlags(872415232);
                intent2.putExtra("fragmentToOpen", "np.com.nepalipatro.fragment.fn");
                context.startActivity(intent2);
            }
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        m.f(context, "context");
        m.f(appWidgetManager, "appWidgetManager");
        m.f(iArr, "appWidgetIds");
        super.onUpdate(context, appWidgetManager, iArr);
        g.a aVar = g.f16048a;
        aVar.b("onUpdate");
        aVar.b("Reset status: " + this.f16162a);
        for (int i10 : iArr) {
            g.f16048a.b("appWidgetId: " + i10 + " Reset:" + this.f16162a);
            b(context, appWidgetManager, i10, this.f16162a);
        }
    }
}
