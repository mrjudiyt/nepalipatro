package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.l;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.List;

/* compiled from: NotificationCompatBuilder */
class m implements k {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2207a;

    /* renamed from: b  reason: collision with root package name */
    private final Notification.Builder f2208b;

    /* renamed from: c  reason: collision with root package name */
    private final l.e f2209c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteViews f2210d;

    /* renamed from: e  reason: collision with root package name */
    private RemoteViews f2211e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Bundle> f2212f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f2213g = new Bundle();

    /* renamed from: h  reason: collision with root package name */
    private int f2214h;

    /* renamed from: i  reason: collision with root package name */
    private RemoteViews f2215i;

    /* compiled from: NotificationCompatBuilder */
    static class a {
        static Notification a(Notification.Builder builder) {
            return builder.build();
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setPriority(i10);
        }

        static Notification.Builder c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        static Notification.Builder d(Notification.Builder builder, boolean z10) {
            return builder.setUsesChronometer(z10);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    static class b {
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setShowWhen(z10);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    static class c {
        static Notification.Builder a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    static class d {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Action.Builder e(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i10, charSequence, pendingIntent);
        }

        static String f(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        static Notification.Builder i(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    static class e {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    static class f {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    static class g {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    static class h {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    static class i {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    static class j {
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    static class k {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x015c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    m(androidx.core.app.l.e r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r16.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f2212f = r2
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r0.f2213g = r2
            r0.f2209c = r1
            android.content.Context r2 = r1.f2167a
            r0.f2207a = r2
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 < r4) goto L_0x002a
            java.lang.String r5 = r1.L
            android.app.Notification$Builder r5 = androidx.core.app.m.h.a(r2, r5)
            r0.f2208b = r5
            goto L_0x0033
        L_0x002a:
            android.app.Notification$Builder r5 = new android.app.Notification$Builder
            android.content.Context r6 = r1.f2167a
            r5.<init>(r6)
            r0.f2208b = r5
        L_0x0033:
            android.app.Notification r5 = r1.T
            android.app.Notification$Builder r6 = r0.f2208b
            long r7 = r5.when
            android.app.Notification$Builder r6 = r6.setWhen(r7)
            int r7 = r5.icon
            int r8 = r5.iconLevel
            android.app.Notification$Builder r6 = r6.setSmallIcon(r7, r8)
            android.widget.RemoteViews r7 = r5.contentView
            android.app.Notification$Builder r6 = r6.setContent(r7)
            java.lang.CharSequence r7 = r5.tickerText
            android.widget.RemoteViews r8 = r1.f2175i
            android.app.Notification$Builder r6 = r6.setTicker(r7, r8)
            long[] r7 = r5.vibrate
            android.app.Notification$Builder r6 = r6.setVibrate(r7)
            int r7 = r5.ledARGB
            int r8 = r5.ledOnMS
            int r9 = r5.ledOffMS
            android.app.Notification$Builder r6 = r6.setLights(r7, r8, r9)
            int r7 = r5.flags
            r8 = 2
            r7 = r7 & r8
            r9 = 1
            r10 = 0
            if (r7 == 0) goto L_0x006d
            r7 = 1
            goto L_0x006e
        L_0x006d:
            r7 = 0
        L_0x006e:
            android.app.Notification$Builder r6 = r6.setOngoing(r7)
            int r7 = r5.flags
            r7 = r7 & 8
            if (r7 == 0) goto L_0x007a
            r7 = 1
            goto L_0x007b
        L_0x007a:
            r7 = 0
        L_0x007b:
            android.app.Notification$Builder r6 = r6.setOnlyAlertOnce(r7)
            int r7 = r5.flags
            r11 = 16
            r7 = r7 & r11
            if (r7 == 0) goto L_0x0088
            r7 = 1
            goto L_0x0089
        L_0x0088:
            r7 = 0
        L_0x0089:
            android.app.Notification$Builder r6 = r6.setAutoCancel(r7)
            int r7 = r5.defaults
            android.app.Notification$Builder r6 = r6.setDefaults(r7)
            java.lang.CharSequence r7 = r1.f2171e
            android.app.Notification$Builder r6 = r6.setContentTitle(r7)
            java.lang.CharSequence r7 = r1.f2172f
            android.app.Notification$Builder r6 = r6.setContentText(r7)
            java.lang.CharSequence r7 = r1.f2177k
            android.app.Notification$Builder r6 = r6.setContentInfo(r7)
            android.app.PendingIntent r7 = r1.f2173g
            android.app.Notification$Builder r6 = r6.setContentIntent(r7)
            android.app.PendingIntent r7 = r5.deleteIntent
            android.app.Notification$Builder r6 = r6.setDeleteIntent(r7)
            android.app.PendingIntent r7 = r1.f2174h
            int r12 = r5.flags
            r12 = r12 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x00bb
            r12 = 1
            goto L_0x00bc
        L_0x00bb:
            r12 = 0
        L_0x00bc:
            android.app.Notification$Builder r6 = r6.setFullScreenIntent(r7, r12)
            int r7 = r1.f2178l
            android.app.Notification$Builder r6 = r6.setNumber(r7)
            int r7 = r1.f2187u
            int r12 = r1.f2188v
            boolean r13 = r1.f2189w
            r6.setProgress(r7, r12, r13)
            r6 = 23
            r7 = 0
            if (r3 >= r6) goto L_0x00e4
            android.app.Notification$Builder r2 = r0.f2208b
            androidx.core.graphics.drawable.IconCompat r12 = r1.f2176j
            if (r12 != 0) goto L_0x00dc
            r12 = r7
            goto L_0x00e0
        L_0x00dc:
            android.graphics.Bitmap r12 = r12.o()
        L_0x00e0:
            r2.setLargeIcon(r12)
            goto L_0x00f3
        L_0x00e4:
            android.app.Notification$Builder r12 = r0.f2208b
            androidx.core.graphics.drawable.IconCompat r13 = r1.f2176j
            if (r13 != 0) goto L_0x00ec
            r2 = r7
            goto L_0x00f0
        L_0x00ec:
            android.graphics.drawable.Icon r2 = r13.z(r2)
        L_0x00f0:
            androidx.core.app.m.f.b(r12, r2)
        L_0x00f3:
            r2 = 21
            if (r3 >= r2) goto L_0x0100
            android.app.Notification$Builder r12 = r0.f2208b
            android.net.Uri r13 = r5.sound
            int r14 = r5.audioStreamType
            r12.setSound(r13, r14)
        L_0x0100:
            r12 = 20
            if (r3 < r11) goto L_0x0198
            android.app.Notification$Builder r11 = r0.f2208b
            java.lang.CharSequence r13 = r1.f2184r
            android.app.Notification$Builder r11 = androidx.core.app.m.a.c(r11, r13)
            boolean r13 = r1.f2181o
            android.app.Notification$Builder r11 = androidx.core.app.m.a.d(r11, r13)
            int r13 = r1.f2179m
            androidx.core.app.m.a.b(r11, r13)
            if (r3 < r12) goto L_0x0139
            androidx.core.app.l$h r3 = r1.f2183q
            boolean r11 = r3 instanceof androidx.core.app.l.f
            if (r11 == 0) goto L_0x0139
            androidx.core.app.l$f r3 = (androidx.core.app.l.f) r3
            java.util.ArrayList r3 = r3.r()
            java.util.Iterator r3 = r3.iterator()
        L_0x0129:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x014f
            java.lang.Object r11 = r3.next()
            androidx.core.app.l$a r11 = (androidx.core.app.l.a) r11
            r0.b(r11)
            goto L_0x0129
        L_0x0139:
            java.util.ArrayList<androidx.core.app.l$a> r3 = r1.f2168b
            java.util.Iterator r3 = r3.iterator()
        L_0x013f:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x014f
            java.lang.Object r11 = r3.next()
            androidx.core.app.l$a r11 = (androidx.core.app.l.a) r11
            r0.b(r11)
            goto L_0x013f
        L_0x014f:
            android.os.Bundle r3 = r1.E
            if (r3 == 0) goto L_0x0158
            android.os.Bundle r11 = r0.f2213g
            r11.putAll(r3)
        L_0x0158:
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 >= r12) goto L_0x0190
            boolean r3 = r1.A
            if (r3 == 0) goto L_0x0167
            android.os.Bundle r3 = r0.f2213g
            java.lang.String r11 = "android.support.localOnly"
            r3.putBoolean(r11, r9)
        L_0x0167:
            java.lang.String r3 = r1.f2190x
            if (r3 == 0) goto L_0x0185
            android.os.Bundle r11 = r0.f2213g
            java.lang.String r13 = "android.support.groupKey"
            r11.putString(r13, r3)
            boolean r3 = r1.f2191y
            if (r3 == 0) goto L_0x017e
            android.os.Bundle r3 = r0.f2213g
            java.lang.String r11 = "android.support.isGroupSummary"
            r3.putBoolean(r11, r9)
            goto L_0x0185
        L_0x017e:
            android.os.Bundle r3 = r0.f2213g
            java.lang.String r11 = "android.support.useSideChannel"
            r3.putBoolean(r11, r9)
        L_0x0185:
            java.lang.String r3 = r1.f2192z
            if (r3 == 0) goto L_0x0190
            android.os.Bundle r11 = r0.f2213g
            java.lang.String r13 = "android.support.sortKey"
            r11.putString(r13, r3)
        L_0x0190:
            android.widget.RemoteViews r3 = r1.I
            r0.f2210d = r3
            android.widget.RemoteViews r3 = r1.J
            r0.f2211e = r3
        L_0x0198:
            int r3 = android.os.Build.VERSION.SDK_INT
            r11 = 17
            if (r3 < r11) goto L_0x01a5
            android.app.Notification$Builder r11 = r0.f2208b
            boolean r13 = r1.f2180n
            androidx.core.app.m.b.a(r11, r13)
        L_0x01a5:
            r11 = 19
            if (r3 < r11) goto L_0x01d2
            if (r3 >= r2) goto L_0x01d2
            java.util.ArrayList<androidx.core.app.p> r11 = r1.f2169c
            java.util.List r11 = g(r11)
            java.util.ArrayList<java.lang.String> r13 = r1.W
            java.util.List r11 = e(r11, r13)
            if (r11 == 0) goto L_0x01d2
            boolean r13 = r11.isEmpty()
            if (r13 != 0) goto L_0x01d2
            android.os.Bundle r13 = r0.f2213g
            int r14 = r11.size()
            java.lang.String[] r14 = new java.lang.String[r14]
            java.lang.Object[] r11 = r11.toArray(r14)
            java.lang.String[] r11 = (java.lang.String[]) r11
            java.lang.String r14 = "android.people"
            r13.putStringArray(r14, r11)
        L_0x01d2:
            if (r3 < r12) goto L_0x01f4
            android.app.Notification$Builder r11 = r0.f2208b
            boolean r12 = r1.A
            androidx.core.app.m.d.i(r11, r12)
            android.app.Notification$Builder r11 = r0.f2208b
            java.lang.String r12 = r1.f2190x
            androidx.core.app.m.d.g(r11, r12)
            android.app.Notification$Builder r11 = r0.f2208b
            java.lang.String r12 = r1.f2192z
            androidx.core.app.m.d.j(r11, r12)
            android.app.Notification$Builder r11 = r0.f2208b
            boolean r12 = r1.f2191y
            androidx.core.app.m.d.h(r11, r12)
            int r11 = r1.P
            r0.f2214h = r11
        L_0x01f4:
            r11 = 28
            if (r3 < r2) goto L_0x02a7
            android.app.Notification$Builder r2 = r0.f2208b
            java.lang.String r12 = r1.D
            androidx.core.app.m.e.b(r2, r12)
            android.app.Notification$Builder r2 = r0.f2208b
            int r12 = r1.F
            androidx.core.app.m.e.c(r2, r12)
            android.app.Notification$Builder r2 = r0.f2208b
            int r12 = r1.G
            androidx.core.app.m.e.f(r2, r12)
            android.app.Notification$Builder r2 = r0.f2208b
            android.app.Notification r12 = r1.H
            androidx.core.app.m.e.d(r2, r12)
            android.app.Notification$Builder r2 = r0.f2208b
            android.net.Uri r12 = r5.sound
            android.media.AudioAttributes r13 = r5.audioAttributes
            androidx.core.app.m.e.e(r2, r12, r13)
            if (r3 >= r11) goto L_0x022c
            java.util.ArrayList<androidx.core.app.p> r2 = r1.f2169c
            java.util.List r2 = g(r2)
            java.util.ArrayList<java.lang.String> r3 = r1.W
            java.util.List r2 = e(r2, r3)
            goto L_0x022e
        L_0x022c:
            java.util.ArrayList<java.lang.String> r2 = r1.W
        L_0x022e:
            if (r2 == 0) goto L_0x024c
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x024c
            java.util.Iterator r2 = r2.iterator()
        L_0x023a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x024c
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            android.app.Notification$Builder r12 = r0.f2208b
            androidx.core.app.m.e.a(r12, r3)
            goto L_0x023a
        L_0x024c:
            android.widget.RemoteViews r2 = r1.K
            r0.f2215i = r2
            java.util.ArrayList<androidx.core.app.l$a> r2 = r1.f2170d
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x02a7
            android.os.Bundle r2 = r17.g()
            java.lang.String r3 = "android.car.EXTENSIONS"
            android.os.Bundle r2 = r2.getBundle(r3)
            if (r2 != 0) goto L_0x0269
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L_0x0269:
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>(r2)
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            r14 = 0
        L_0x0274:
            java.util.ArrayList<androidx.core.app.l$a> r15 = r1.f2170d
            int r15 = r15.size()
            if (r14 >= r15) goto L_0x0293
            java.lang.String r15 = java.lang.Integer.toString(r14)
            java.util.ArrayList<androidx.core.app.l$a> r9 = r1.f2170d
            java.lang.Object r9 = r9.get(r14)
            androidx.core.app.l$a r9 = (androidx.core.app.l.a) r9
            android.os.Bundle r9 = androidx.core.app.n.b(r9)
            r13.putBundle(r15, r9)
            int r14 = r14 + 1
            r9 = 1
            goto L_0x0274
        L_0x0293:
            java.lang.String r9 = "invisible_actions"
            r2.putBundle(r9, r13)
            r12.putBundle(r9, r13)
            android.os.Bundle r9 = r17.g()
            r9.putBundle(r3, r2)
            android.os.Bundle r2 = r0.f2213g
            r2.putBundle(r3, r12)
        L_0x02a7:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r6) goto L_0x02b4
            java.lang.Object r3 = r1.V
            if (r3 == 0) goto L_0x02b4
            android.app.Notification$Builder r6 = r0.f2208b
            androidx.core.app.m.f.c(r6, r3)
        L_0x02b4:
            r3 = 24
            if (r2 < r3) goto L_0x02e1
            android.app.Notification$Builder r3 = r0.f2208b
            android.os.Bundle r6 = r1.E
            androidx.core.app.m.c.a(r3, r6)
            android.app.Notification$Builder r3 = r0.f2208b
            java.lang.CharSequence[] r6 = r1.f2186t
            androidx.core.app.m.g.e(r3, r6)
            android.widget.RemoteViews r3 = r1.I
            if (r3 == 0) goto L_0x02cf
            android.app.Notification$Builder r6 = r0.f2208b
            androidx.core.app.m.g.c(r6, r3)
        L_0x02cf:
            android.widget.RemoteViews r3 = r1.J
            if (r3 == 0) goto L_0x02d8
            android.app.Notification$Builder r6 = r0.f2208b
            androidx.core.app.m.g.b(r6, r3)
        L_0x02d8:
            android.widget.RemoteViews r3 = r1.K
            if (r3 == 0) goto L_0x02e1
            android.app.Notification$Builder r6 = r0.f2208b
            androidx.core.app.m.g.d(r6, r3)
        L_0x02e1:
            if (r2 < r4) goto L_0x032a
            android.app.Notification$Builder r3 = r0.f2208b
            int r6 = r1.M
            androidx.core.app.m.h.b(r3, r6)
            android.app.Notification$Builder r3 = r0.f2208b
            java.lang.CharSequence r6 = r1.f2185s
            androidx.core.app.m.h.e(r3, r6)
            android.app.Notification$Builder r3 = r0.f2208b
            java.lang.String r6 = r1.N
            androidx.core.app.m.h.f(r3, r6)
            android.app.Notification$Builder r3 = r0.f2208b
            long r12 = r1.O
            androidx.core.app.m.h.g(r3, r12)
            android.app.Notification$Builder r3 = r0.f2208b
            int r6 = r1.P
            androidx.core.app.m.h.d(r3, r6)
            boolean r3 = r1.C
            if (r3 == 0) goto L_0x0311
            android.app.Notification$Builder r3 = r0.f2208b
            boolean r6 = r1.B
            androidx.core.app.m.h.c(r3, r6)
        L_0x0311:
            java.lang.String r3 = r1.L
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x032a
            android.app.Notification$Builder r3 = r0.f2208b
            android.app.Notification$Builder r3 = r3.setSound(r7)
            android.app.Notification$Builder r3 = r3.setDefaults(r10)
            android.app.Notification$Builder r3 = r3.setLights(r10, r10, r10)
            r3.setVibrate(r7)
        L_0x032a:
            if (r2 < r11) goto L_0x0348
            java.util.ArrayList<androidx.core.app.p> r2 = r1.f2169c
            java.util.Iterator r2 = r2.iterator()
        L_0x0332:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0348
            java.lang.Object r3 = r2.next()
            androidx.core.app.p r3 = (androidx.core.app.p) r3
            android.app.Notification$Builder r6 = r0.f2208b
            android.app.Person r3 = r3.h()
            androidx.core.app.m.i.a(r6, r3)
            goto L_0x0332
        L_0x0348:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L_0x0360
            android.app.Notification$Builder r3 = r0.f2208b
            boolean r6 = r1.R
            androidx.core.app.m.j.a(r3, r6)
            android.app.Notification$Builder r3 = r0.f2208b
            androidx.core.app.l$d r6 = r1.S
            android.app.Notification$BubbleMetadata r6 = androidx.core.app.l.d.a(r6)
            androidx.core.app.m.j.b(r3, r6)
        L_0x0360:
            r3 = 31
            if (r2 < r3) goto L_0x036d
            int r3 = r1.Q
            if (r3 == 0) goto L_0x036d
            android.app.Notification$Builder r6 = r0.f2208b
            androidx.core.app.m.k.b(r6, r3)
        L_0x036d:
            boolean r1 = r1.U
            if (r1 == 0) goto L_0x03b0
            androidx.core.app.l$e r1 = r0.f2209c
            boolean r1 = r1.f2191y
            if (r1 == 0) goto L_0x037a
            r0.f2214h = r8
            goto L_0x037d
        L_0x037a:
            r1 = 1
            r0.f2214h = r1
        L_0x037d:
            android.app.Notification$Builder r1 = r0.f2208b
            r1.setVibrate(r7)
            android.app.Notification$Builder r1 = r0.f2208b
            r1.setSound(r7)
            int r1 = r5.defaults
            r1 = r1 & -2
            r5.defaults = r1
            r1 = r1 & -3
            r5.defaults = r1
            android.app.Notification$Builder r3 = r0.f2208b
            r3.setDefaults(r1)
            if (r2 < r4) goto L_0x03b0
            androidx.core.app.l$e r1 = r0.f2209c
            java.lang.String r1 = r1.f2190x
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x03a9
            android.app.Notification$Builder r1 = r0.f2208b
            java.lang.String r2 = "silent"
            androidx.core.app.m.d.g(r1, r2)
        L_0x03a9:
            android.app.Notification$Builder r1 = r0.f2208b
            int r2 = r0.f2214h
            androidx.core.app.m.h.d(r1, r2)
        L_0x03b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.m.<init>(androidx.core.app.l$e):void");
    }

    private void b(l.a aVar) {
        Notification.Action.Builder builder;
        Bundle bundle;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 20) {
            IconCompat f10 = aVar.f();
            if (i10 >= 23) {
                builder = f.a(f10 != null ? f10.y() : null, aVar.j(), aVar.a());
            } else {
                builder = d.e(f10 != null ? f10.p() : 0, aVar.j(), aVar.a());
            }
            if (aVar.g() != null) {
                for (RemoteInput c10 : r.b(aVar.g())) {
                    d.c(builder, c10);
                }
            }
            if (aVar.d() != null) {
                bundle = new Bundle(aVar.d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 24) {
                g.a(builder, aVar.b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.h());
            if (i11 >= 28) {
                i.b(builder, aVar.h());
            }
            if (i11 >= 29) {
                j.c(builder, aVar.l());
            }
            if (i11 >= 31) {
                k.a(builder, aVar.k());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.i());
            d.b(builder, bundle);
            d.a(this.f2208b, d.d(builder));
        } else if (i10 >= 16) {
            this.f2212f.add(n.f(this.f2208b, aVar));
        }
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.b bVar = new androidx.collection.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> g(List<p> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (p g10 : list) {
            arrayList.add(g10.g());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i10 = notification.defaults & -2;
        notification.defaults = i10;
        notification.defaults = i10 & -3;
    }

    public Notification.Builder a() {
        return this.f2208b;
    }

    public Notification c() {
        Bundle a10;
        RemoteViews p10;
        RemoteViews n10;
        l.h hVar = this.f2209c.f2183q;
        if (hVar != null) {
            hVar.b(this);
        }
        RemoteViews o10 = hVar != null ? hVar.o(this) : null;
        Notification d10 = d();
        if (o10 != null) {
            d10.contentView = o10;
        } else {
            RemoteViews remoteViews = this.f2209c.I;
            if (remoteViews != null) {
                d10.contentView = remoteViews;
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (!(i10 < 16 || hVar == null || (n10 = hVar.n(this)) == null)) {
            d10.bigContentView = n10;
        }
        if (!(i10 < 21 || hVar == null || (p10 = this.f2209c.f2183q.p(this)) == null)) {
            d10.headsUpContentView = p10;
        }
        if (!(i10 < 16 || hVar == null || (a10 = l.a(d10)) == null)) {
            hVar.a(a10);
        }
        return d10;
    }

    /* access modifiers changed from: protected */
    public Notification d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            return a.a(this.f2208b);
        }
        if (i10 >= 24) {
            Notification a10 = a.a(this.f2208b);
            if (this.f2214h != 0) {
                if (!(d.f(a10) == null || (a10.flags & 512) == 0 || this.f2214h != 2)) {
                    h(a10);
                }
                if (d.f(a10) != null && (a10.flags & 512) == 0 && this.f2214h == 1) {
                    h(a10);
                }
            }
            return a10;
        } else if (i10 >= 21) {
            c.a(this.f2208b, this.f2213g);
            Notification a11 = a.a(this.f2208b);
            RemoteViews remoteViews = this.f2210d;
            if (remoteViews != null) {
                a11.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f2211e;
            if (remoteViews2 != null) {
                a11.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f2215i;
            if (remoteViews3 != null) {
                a11.headsUpContentView = remoteViews3;
            }
            if (this.f2214h != 0) {
                if (!(d.f(a11) == null || (a11.flags & 512) == 0 || this.f2214h != 2)) {
                    h(a11);
                }
                if (d.f(a11) != null && (a11.flags & 512) == 0 && this.f2214h == 1) {
                    h(a11);
                }
            }
            return a11;
        } else if (i10 >= 20) {
            c.a(this.f2208b, this.f2213g);
            Notification a12 = a.a(this.f2208b);
            RemoteViews remoteViews4 = this.f2210d;
            if (remoteViews4 != null) {
                a12.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f2211e;
            if (remoteViews5 != null) {
                a12.bigContentView = remoteViews5;
            }
            if (this.f2214h != 0) {
                if (!(d.f(a12) == null || (a12.flags & 512) == 0 || this.f2214h != 2)) {
                    h(a12);
                }
                if (d.f(a12) != null && (a12.flags & 512) == 0 && this.f2214h == 1) {
                    h(a12);
                }
            }
            return a12;
        } else if (i10 >= 19) {
            SparseArray<Bundle> a13 = n.a(this.f2212f);
            if (a13 != null) {
                this.f2213g.putSparseParcelableArray("android.support.actionExtras", a13);
            }
            c.a(this.f2208b, this.f2213g);
            Notification a14 = a.a(this.f2208b);
            RemoteViews remoteViews6 = this.f2210d;
            if (remoteViews6 != null) {
                a14.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f2211e;
            if (remoteViews7 != null) {
                a14.bigContentView = remoteViews7;
            }
            return a14;
        } else if (i10 < 16) {
            return this.f2208b.getNotification();
        } else {
            Notification a15 = a.a(this.f2208b);
            Bundle a16 = l.a(a15);
            Bundle bundle = new Bundle(this.f2213g);
            for (String str : this.f2213g.keySet()) {
                if (a16.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a16.putAll(bundle);
            SparseArray<Bundle> a17 = n.a(this.f2212f);
            if (a17 != null) {
                l.a(a15).putSparseParcelableArray("android.support.actionExtras", a17);
            }
            RemoteViews remoteViews8 = this.f2210d;
            if (remoteViews8 != null) {
                a15.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f2211e;
            if (remoteViews9 != null) {
                a15.bigContentView = remoteViews9;
            }
            return a15;
        }
    }

    /* access modifiers changed from: package-private */
    public Context f() {
        return this.f2207a;
    }
}
