package np.com.nepalipatro.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.MainActivity;
import np.com.nepalipatro.helpers.d;
import np.com.nepalipatro.helpers.g;
import np.com.nepalipatro.helpers.l;
import u9.a;
import y9.b;
import y9.c;

/* compiled from: Widget2x4.kt */
public final class Widget2x4 extends AppWidgetProvider {

    /* renamed from: a  reason: collision with root package name */
    private boolean f16166a = true;

    /* renamed from: b  reason: collision with root package name */
    private c f16167b;

    /* renamed from: c  reason: collision with root package name */
    private b f16168c;

    /* renamed from: d  reason: collision with root package name */
    private a f16169d;

    private final PendingIntent a(Context context, String str) {
        Intent intent = new Intent(context, Widget2x4.class);
        intent.setAction(str);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 33554432);
        m.e(broadcast, "getBroadcast(context, 0,…ndingIntent.FLAG_MUTABLE)");
        return broadcast;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0443 A[LOOP:1: B:101:0x02a6->B:174:0x0443, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0455  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x046f A[EDGE_INSN: B:183:0x046f->B:176:0x046f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x029e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(android.content.Context r24, android.appwidget.AppWidgetManager r25, int r26, boolean r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            np.com.nepalipatro.helpers.g$a r2 = np.com.nepalipatro.helpers.g.f16048a
            java.lang.String r3 = "updateWidget"
            r2.b(r3)
            android.widget.RemoteViews r2 = new android.widget.RemoteViews
            java.lang.String r3 = r24.getPackageName()
            r4 = 2131492994(0x7f0c0082, float:1.8609456E38)
            r2.<init>(r3, r4)
            y9.b r3 = new y9.b
            r3.<init>()
            r0.f16168c = r3
            kotlin.jvm.internal.m.c(r3)
            java.util.Calendar r3 = r3.e(r1)
            y9.c r4 = new y9.c
            r4.<init>(r1)
            r0.f16167b = r4
            u9.a r4 = new u9.a
            r4.<init>(r1)
            r0.f16169d = r4
            np.com.nepalipatro.helpers.k$a r4 = np.com.nepalipatro.helpers.k.f16077a
            java.lang.String r5 = r4.h()
            java.lang.String r6 = "ne"
            java.lang.String r4 = r4.w(r1, r5, r6)
            boolean r5 = android.text.format.DateFormat.is24HourFormat(r24)
            java.lang.String r7 = "ENGLISH"
            if (r5 == 0) goto L_0x0059
            np.com.nepalipatro.helpers.l$a r5 = np.com.nepalipatro.helpers.l.f16129a
            java.util.Locale r8 = java.util.Locale.ENGLISH
            kotlin.jvm.internal.m.e(r8, r7)
            java.lang.String r9 = "HH:mm"
            java.lang.CharSequence r5 = r5.g(r1, r9, r8)
            java.lang.String r5 = r5.toString()
            goto L_0x006a
        L_0x0059:
            np.com.nepalipatro.helpers.l$a r5 = np.com.nepalipatro.helpers.l.f16129a
            java.util.Locale r8 = java.util.Locale.ENGLISH
            kotlin.jvm.internal.m.e(r8, r7)
            java.lang.String r9 = "h:mm"
            java.lang.CharSequence r5 = r5.g(r1, r9, r8)
            java.lang.String r5 = r5.toString()
        L_0x006a:
            g9.f r8 = new g9.f
            java.lang.String r9 = " "
            r8.<init>((java.lang.String) r9)
            r9 = 0
            java.util.List r5 = r8.c(r5, r9)
            boolean r8 = r5.isEmpty()
            r10 = 1
            if (r8 != 0) goto L_0x00a6
            int r8 = r5.size()
            java.util.ListIterator r8 = r5.listIterator(r8)
        L_0x0085:
            boolean r11 = r8.hasPrevious()
            if (r11 == 0) goto L_0x00a6
            java.lang.Object r11 = r8.previous()
            java.lang.String r11 = (java.lang.String) r11
            int r11 = r11.length()
            if (r11 != 0) goto L_0x0099
            r11 = 1
            goto L_0x009a
        L_0x0099:
            r11 = 0
        L_0x009a:
            if (r11 != 0) goto L_0x0085
            int r8 = r8.nextIndex()
            int r8 = r8 + r10
            java.util.List r5 = p8.x.P(r5, r8)
            goto L_0x00aa
        L_0x00a6:
            java.util.List r5 = p8.p.e()
        L_0x00aa:
            java.lang.String[] r8 = new java.lang.String[r9]
            java.lang.Object[] r5 = r5.toArray(r8)
            java.lang.String[] r5 = (java.lang.String[]) r5
            r8 = 2131296718(0x7f0901ce, float:1.821136E38)
            r11 = r5[r9]
            r2.setTextViewText(r8, r11)
            int r8 = r5.length
            r11 = 2131296717(0x7f0901cd, float:1.8211359E38)
            r12 = 2
            if (r8 != r12) goto L_0x00d8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r5 = r5[r10]
            r8.append(r5)
            java.lang.String r5 = " NPT"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r2.setTextViewText(r11, r5)
            goto L_0x00dd
        L_0x00d8:
            java.lang.String r5 = "NPT"
            r2.setTextViewText(r11, r5)
        L_0x00dd:
            if (r27 == 0) goto L_0x046f
            y9.b r5 = r0.f16168c
            if (r5 == 0) goto L_0x00e8
            np.com.nepalipatro.models.BsDate r5 = r5.d(r3)
            goto L_0x00e9
        L_0x00e8:
            r5 = 0
        L_0x00e9:
            y9.b r11 = r0.f16168c
            r13 = 12
            if (r11 == 0) goto L_0x0100
            if (r5 == 0) goto L_0x00f6
            int r14 = r5.getYear()
            goto L_0x00f7
        L_0x00f6:
            r14 = 1
        L_0x00f7:
            int r11 = r11.h(r14, r13)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x0101
        L_0x0100:
            r11 = 0
        L_0x0101:
            np.com.nepalipatro.models.BsDate r14 = new np.com.nepalipatro.models.BsDate
            if (r5 == 0) goto L_0x010a
            int r15 = r5.getYear()
            goto L_0x010c
        L_0x010a:
            r15 = 2077(0x81d, float:2.91E-42)
        L_0x010c:
            if (r11 == 0) goto L_0x0113
            int r11 = r11.intValue()
            goto L_0x0115
        L_0x0113:
            r11 = 30
        L_0x0115:
            r14.<init>(r15, r13, r11)
            y9.b r11 = r0.f16168c
            if (r11 == 0) goto L_0x0121
            java.util.Calendar r11 = r11.b(r14)
            goto L_0x0122
        L_0x0121:
            r11 = 0
        L_0x0122:
            np.com.nepalipatro.helpers.l$a r13 = np.com.nepalipatro.helpers.l.f16129a
            java.util.Locale r14 = java.util.Locale.ENGLISH
            kotlin.jvm.internal.m.e(r14, r7)
            java.lang.String r7 = "MMMM d, yyyy"
            java.lang.CharSequence r7 = r13.g(r1, r7, r14)
            java.lang.String r14 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.m.d(r7, r14)
            java.lang.String r7 = (java.lang.String) r7
            u9.a r14 = r0.f16169d
            if (r14 == 0) goto L_0x013f
            java.util.List r11 = r14.q(r3, r11)
            goto L_0x0140
        L_0x013f:
            r11 = 0
        L_0x0140:
            boolean r14 = kotlin.jvm.internal.m.a(r4, r6)
            if (r14 == 0) goto L_0x0153
            if (r5 == 0) goto L_0x014d
            java.lang.String r14 = r5.getMonthNpLong()
            goto L_0x014e
        L_0x014d:
            r14 = 0
        L_0x014e:
            java.lang.String r14 = java.lang.String.valueOf(r14)
            goto L_0x015f
        L_0x0153:
            if (r5 == 0) goto L_0x015a
            java.lang.String r14 = r5.getMonthLong()
            goto L_0x015b
        L_0x015a:
            r14 = 0
        L_0x015b:
            java.lang.String r14 = java.lang.String.valueOf(r14)
        L_0x015f:
            if (r5 == 0) goto L_0x0166
            int r15 = r5.getDay()
            goto L_0x0167
        L_0x0166:
            r15 = 0
        L_0x0167:
            java.lang.String r15 = r13.t(r15)
            int r15 = java.lang.Integer.parseInt(r15)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.util.Locale r9 = new java.util.Locale
            java.lang.String r8 = java.lang.String.valueOf(r4)
            r9.<init>(r8)
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            java.lang.String r9 = r13.h(r15, r9, r8)
            if (r5 == 0) goto L_0x0189
            int r15 = r5.getYear()
            goto L_0x018a
        L_0x0189:
            r15 = 0
        L_0x018a:
            java.lang.String r15 = r13.t(r15)
            int r15 = java.lang.Integer.parseInt(r15)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.util.Locale r12 = new java.util.Locale
            java.lang.String r10 = java.lang.String.valueOf(r4)
            r12.<init>(r10)
            java.lang.String r8 = r13.h(r15, r12, r8)
            if (r5 == 0) goto L_0x01ae
            java.lang.String r10 = java.lang.String.valueOf(r4)
            java.lang.String r5 = r5.getDow_long(r10, r3)
            goto L_0x01af
        L_0x01ae:
            r5 = 0
        L_0x01af:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r14)
            r12 = 32
            r10.append(r12)
            r10.append(r9)
            java.lang.String r9 = ", "
            r10.append(r9)
            r10.append(r8)
            r10.append(r12)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            y9.c r8 = r0.f16167b
            if (r8 == 0) goto L_0x01da
            np.com.nepalipatro.models.NsDate r8 = r8.d(r3)
            goto L_0x01db
        L_0x01da:
            r8 = 0
        L_0x01db:
            java.lang.String r10 = ""
            if (r8 == 0) goto L_0x01e8
            java.lang.String r13 = java.lang.String.valueOf(r4)
            java.lang.String r8 = r8.getTithiLong(r13)
            goto L_0x01e9
        L_0x01e8:
            r8 = r10
        L_0x01e9:
            java.util.Calendar r13 = java.util.Calendar.getInstance()
            java.util.Calendar r14 = java.util.Calendar.getInstance()
            if (r3 == 0) goto L_0x01fd
            r15 = 1
            int r16 = r3.get(r15)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r16)
            goto L_0x01fe
        L_0x01fd:
            r15 = 0
        L_0x01fe:
            kotlin.jvm.internal.m.c(r15)
            int r17 = r15.intValue()
            r15 = 2
            int r18 = r3.get(r15)
            r15 = 5
            int r19 = r3.get(r15)
            r20 = 0
            r21 = 0
            r22 = 0
            r16 = r13
            r16.set(r17, r18, r19, r20, r21, r22)
            r12 = 1
            int r17 = r3.get(r12)
            r12 = 2
            int r18 = r3.get(r12)
            int r19 = r3.get(r15)
            r20 = 23
            r21 = 59
            r16 = r14
            r16.set(r17, r18, r19, r20, r21, r22)
            u9.a r12 = r0.f16169d
            kotlin.jvm.internal.m.c(r12)
            java.lang.String r15 = "startDate"
            kotlin.jvm.internal.m.e(r13, r15)
            java.lang.String r15 = java.lang.String.valueOf(r4)
            java.lang.String r12 = r12.s(r13, r14, r15)
            boolean r13 = kotlin.jvm.internal.m.a(r8, r10)
            java.lang.String r14 = " - "
            if (r13 == 0) goto L_0x0252
            boolean r13 = kotlin.jvm.internal.m.a(r12, r10)
            if (r13 == 0) goto L_0x0252
            goto L_0x027e
        L_0x0252:
            boolean r13 = kotlin.jvm.internal.m.a(r8, r10)
            if (r13 != 0) goto L_0x025f
            boolean r13 = kotlin.jvm.internal.m.a(r12, r10)
            if (r13 == 0) goto L_0x025f
            goto L_0x027f
        L_0x025f:
            boolean r13 = kotlin.jvm.internal.m.a(r8, r10)
            if (r13 != 0) goto L_0x027e
            boolean r13 = kotlin.jvm.internal.m.a(r12, r10)
            if (r13 != 0) goto L_0x027e
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r8)
            r13.append(r14)
            r13.append(r12)
            java.lang.String r8 = r13.toString()
            goto L_0x027f
        L_0x027e:
            r8 = r10
        L_0x027f:
            r12 = 2131296714(0x7f0901ca, float:1.8211352E38)
            r2.setTextViewText(r12, r7)
            r7 = 2131296715(0x7f0901cb, float:1.8211355E38)
            r2.setTextViewText(r7, r5)
            r5 = 2131296716(0x7f0901cc, float:1.8211357E38)
            r2.setTextViewText(r5, r8)
            r5 = 2131296526(0x7f09010e, float:1.8210971E38)
            r2.removeAllViews(r5)
            if (r11 == 0) goto L_0x029e
            int r7 = r11.size()
            goto L_0x029f
        L_0x029e:
            r7 = 0
        L_0x029f:
            r8 = 2131492995(0x7f0c0083, float:1.8609458E38)
            r13 = 1
            if (r7 <= r13) goto L_0x0455
            r13 = 0
        L_0x02a6:
            if (r13 >= r7) goto L_0x046f
            android.widget.RemoteViews r15 = new android.widget.RemoteViews
            java.lang.String r5 = r24.getPackageName()
            r15.<init>(r5, r8)
            if (r11 == 0) goto L_0x02ba
            java.lang.Object r5 = r11.get(r13)
            np.com.nepalipatro.models.EventModel r5 = (np.com.nepalipatro.models.EventModel) r5
            goto L_0x02bb
        L_0x02ba:
            r5 = 0
        L_0x02bb:
            if (r5 == 0) goto L_0x02c7
            java.lang.String r16 = r5.getDescription()
            if (r16 != 0) goto L_0x02c4
            goto L_0x02c7
        L_0x02c4:
            r8 = r16
            goto L_0x02c8
        L_0x02c7:
            r8 = r10
        L_0x02c8:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Exception -> 0x02d4 }
            r12.<init>(r8)     // Catch:{ Exception -> 0x02d4 }
            np.com.nepalipatro.models.EventDescriptionModel$Companion r8 = np.com.nepalipatro.models.EventDescriptionModel.Companion     // Catch:{ Exception -> 0x02d4 }
            np.com.nepalipatro.models.EventDescriptionModel r8 = r8.eventModelFromJson(r12)     // Catch:{ Exception -> 0x02d4 }
            goto L_0x02d5
        L_0x02d4:
            r8 = 0
        L_0x02d5:
            if (r8 == 0) goto L_0x0310
            r12 = 1
            boolean r18 = g9.p.m(r4, r6, r12)
            if (r18 == 0) goto L_0x02e3
            java.lang.String r8 = r8.getDescriptionNe()
            goto L_0x02e7
        L_0x02e3:
            java.lang.String r8 = r8.getDescriptionEn()
        L_0x02e7:
            int r12 = r10.length()
            if (r12 != 0) goto L_0x02ef
            r12 = 1
            goto L_0x02f0
        L_0x02ef:
            r12 = 0
        L_0x02f0:
            if (r12 == 0) goto L_0x02f9
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r18 = r7
            goto L_0x031b
        L_0x02f9:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            r18 = r7
            r7 = 47
            r12.append(r7)
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            goto L_0x031b
        L_0x0310:
            r18 = r7
            if (r5 == 0) goto L_0x031a
            java.lang.String r8 = r5.getTitle()
            if (r8 != 0) goto L_0x031b
        L_0x031a:
            r8 = r10
        L_0x031b:
            if (r5 == 0) goto L_0x0323
            java.lang.String r5 = r5.getStartDate()
            if (r5 != 0) goto L_0x0324
        L_0x0323:
            r5 = r10
        L_0x0324:
            np.com.nepalipatro.helpers.b r7 = np.com.nepalipatro.helpers.b.f15915a
            java.lang.String r12 = r7.e()
            r19 = r10
            r10 = 0
            java.util.Calendar r5 = r7.g(r5, r12, r10)
            y9.b r12 = r0.f16168c
            if (r12 == 0) goto L_0x033a
            np.com.nepalipatro.models.BsDate r12 = r12.d(r5)
            goto L_0x033b
        L_0x033a:
            r12 = r10
        L_0x033b:
            if (r12 == 0) goto L_0x0340
            r12.getMonth()
        L_0x0340:
            if (r12 == 0) goto L_0x0349
            int r20 = r12.getDay()
            r27 = r20
            goto L_0x034b
        L_0x0349:
            r27 = 1
        L_0x034b:
            kotlin.jvm.internal.m.c(r5)
            r10 = 1
            int r5 = r7.j(r3, r5, r10)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r7 = g9.p.m(r4, r6, r10)
            if (r7 == 0) goto L_0x03b0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r8)
            r7.append(r9)
            if (r12 == 0) goto L_0x036f
            java.lang.String r8 = r12.getMonthNpLong()
            goto L_0x0370
        L_0x036f:
            r8 = 0
        L_0x0370:
            r7.append(r8)
            r8 = 32
            r7.append(r8)
            np.com.nepalipatro.helpers.l$a r8 = np.com.nepalipatro.helpers.l.f16129a
            java.lang.String r10 = java.lang.String.valueOf(r27)
            int r10 = java.lang.Integer.parseInt(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r21 = r3
            java.util.Locale r3 = r8.e(r1)
            r22 = r4
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            java.lang.String r3 = r8.h(r10, r3, r4)
            r7.append(r3)
            r7.append(r14)
            if (r12 == 0) goto L_0x03a1
            java.lang.String r3 = r12.getDow_ShortNp()
            goto L_0x03a2
        L_0x03a1:
            r3 = 0
        L_0x03a2:
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            r4 = 2131296719(0x7f0901cf, float:1.8211363E38)
            r15.setTextViewText(r4, r3)
            goto L_0x03ec
        L_0x03b0:
            r21 = r3
            r22 = r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            r3.append(r9)
            if (r12 == 0) goto L_0x03c6
            java.lang.String r4 = r12.getMonthLong()
            goto L_0x03c7
        L_0x03c6:
            r4 = 0
        L_0x03c7:
            r3.append(r4)
            r4 = 32
            r3.append(r4)
            r4 = r27
            r3.append(r4)
            r3.append(r14)
            if (r12 == 0) goto L_0x03de
            java.lang.String r4 = r12.getDow_Short()
            goto L_0x03df
        L_0x03de:
            r4 = 0
        L_0x03df:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 2131296719(0x7f0901cf, float:1.8211363E38)
            r15.setTextViewText(r4, r3)
        L_0x03ec:
            r3 = 2131296720(0x7f0901d0, float:1.8211365E38)
            if (r5 != 0) goto L_0x03f3
            r7 = 1
            goto L_0x040a
        L_0x03f3:
            int r4 = r5.intValue()
            r7 = 1
            if (r4 != r7) goto L_0x040a
            r4 = 2131821145(0x7f110259, float:1.9275025E38)
            java.lang.String r4 = r1.getString(r4)
            r15.setTextViewText(r3, r4)
            r3 = 2131296526(0x7f09010e, float:1.8210971E38)
            r5 = 32
            goto L_0x043b
        L_0x040a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            np.com.nepalipatro.helpers.l$a r8 = np.com.nepalipatro.helpers.l.f16129a
            java.util.Locale r10 = r8.e(r1)
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            java.lang.String r5 = r8.h(r5, r10, r12)
            r4.append(r5)
            r5 = 32
            r4.append(r5)
            java.util.Locale r10 = r8.e(r1)
            r12 = 2131820723(0x7f1100b3, float:1.927417E38)
            java.lang.String r8 = r8.k(r1, r10, r12)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            r15.setTextViewText(r3, r4)
            r3 = 2131296526(0x7f09010e, float:1.8210971E38)
        L_0x043b:
            r2.addView(r3, r15)
            r3 = 14
            if (r13 != r3) goto L_0x0443
            goto L_0x046f
        L_0x0443:
            int r13 = r13 + 1
            r7 = r18
            r10 = r19
            r3 = r21
            r4 = r22
            r5 = 2131296526(0x7f09010e, float:1.8210971E38)
            r8 = 2131492995(0x7f0c0083, float:1.8609458E38)
            goto L_0x02a6
        L_0x0455:
            android.widget.RemoteViews r3 = new android.widget.RemoteViews
            java.lang.String r4 = r24.getPackageName()
            r5 = 2131492995(0x7f0c0083, float:1.8609458E38)
            r3.<init>(r4, r5)
            java.lang.String r4 = "No upcoming events"
            r5 = 2131296719(0x7f0901cf, float:1.8211363E38)
            r3.setTextViewText(r5, r4)
            r4 = 2131296526(0x7f09010e, float:1.8210971E38)
            r2.addView(r4, r3)
        L_0x046f:
            r3 = 2131296772(0x7f090204, float:1.821147E38)
            np.com.nepalipatro.helpers.d$a r4 = np.com.nepalipatro.helpers.d.f15947a
            java.lang.String r4 = r4.f()
            android.app.PendingIntent r1 = r0.a(r1, r4)
            r2.setOnClickPendingIntent(r3, r1)
            r1 = r25
            r3 = r26
            r1.updateAppWidget(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: np.com.nepalipatro.widget.Widget2x4.b(android.content.Context, android.appwidget.AppWidgetManager, int, boolean):void");
    }

    public void onDisabled(Context context) {
        m.f(context, "context");
        g.f16048a.b("onDisabled");
        new v9.a(context.getApplicationContext()).f("WIDGET2x4");
        super.onDisabled(context);
    }

    public void onEnabled(Context context) {
        m.f(context, "context");
        g.f16048a.b("onEnabled");
        super.onEnabled(context);
    }

    public void onReceive(Context context, Intent intent) {
        m.f(context, "context");
        m.f(intent, "intent");
        if (l.f16129a.o(context)) {
            super.onReceive(context, intent);
            g.a aVar = g.f16048a;
            StringBuilder sb = new StringBuilder();
            sb.append("onReceive::");
            String action = intent.getAction();
            m.c(action);
            sb.append(action);
            aVar.b(sb.toString());
            if (AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, Widget2x4.class)).length < 1) {
                aVar.b("No 2x4 widget is added. Skipping update");
            } else if (m.a(intent.getAction(), d.f15947a.f())) {
                new v9.a(context.getApplicationContext()).e("WIDGET2x4");
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
        g.f16048a.b("onUpdate");
        for (int b10 : iArr) {
            b(context, appWidgetManager, b10, this.f16166a);
        }
    }
}
