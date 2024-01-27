package np.com.nepalipatro.helpers;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.core.app.h;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.e;
import androidx.work.o;
import androidx.work.x;
import b9.c;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import da.d;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.App;
import np.com.nepalipatro.helpers.e;
import np.com.nepalipatro.helpers.i;
import np.com.nepalipatro.helpers.k;
import np.com.nepalipatro.helpers.l;
import np.com.nepalipatro.models.EventModel;
import np.com.nepalipatro.notification.AppNotifications;
import o8.q;
import u9.a;
import z9.b;
import z9.f;
import z9.h;

/* compiled from: AlarmHelper.kt */
public final class AlarmHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final AlarmHelper f15890a = new AlarmHelper();

    /* renamed from: b  reason: collision with root package name */
    private static final int f15891b = 2000;

    /* renamed from: c  reason: collision with root package name */
    private static final int f15892c = 1000;

    /* renamed from: d  reason: collision with root package name */
    private static final int f15893d = 1001;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f15894e = 1002;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f15895f = 1003;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int f15896g = 9000;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final String f15897h = "ALARM_CODE";
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final String f15898i = "ALARM_CODE_SET_AT";

    /* renamed from: j  reason: collision with root package name */
    private static final AtomicInteger f15899j = new AtomicInteger(0);

    /* compiled from: AlarmHelper.kt */
    public static final class AlarmBroadcastReceiver extends BroadcastReceiver {
        /* JADX WARNING: Can't wrap try/catch for region: R(5:15|16|17|18|(2:20|45)(1:46)) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005a */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x006b A[Catch:{ Exception -> 0x0123 }] */
        /* JADX WARNING: Removed duplicated region for block: B:46:? A[Catch:{ Exception -> 0x0123 }, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceive(android.content.Context r8, android.content.Intent r9) {
            /*
                r7 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.m.f(r8, r0)
                java.lang.String r0 = "intent"
                kotlin.jvm.internal.m.f(r9, r0)
                java.lang.String r0 = r9.getAction()
                if (r0 != 0) goto L_0x0011
                return
            L_0x0011:
                java.lang.String r0 = r9.getAction()
                np.com.nepalipatro.helpers.d$a r1 = np.com.nepalipatro.helpers.d.f15947a
                java.lang.String r1 = r1.a()
                boolean r0 = kotlin.jvm.internal.m.a(r0, r1)
                if (r0 == 0) goto L_0x0128
                java.lang.String r0 = np.com.nepalipatro.helpers.AlarmHelper.f15897h     // Catch:{ Exception -> 0x0123 }
                r1 = 0
                int r0 = r9.getIntExtra(r0, r1)     // Catch:{ Exception -> 0x0123 }
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0123 }
                long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0123 }
                long r2 = r2 - r4
                java.lang.String r4 = np.com.nepalipatro.helpers.AlarmHelper.f15898i     // Catch:{ Exception -> 0x0123 }
                r5 = 0
                long r4 = r9.getLongExtra(r4, r5)     // Catch:{ Exception -> 0x0123 }
                long r2 = r2 - r4
                r4 = 1000(0x3e8, double:4.94E-321)
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x004a
                np.com.nepalipatro.helpers.AlarmHelper r9 = np.com.nepalipatro.helpers.AlarmHelper.f15890a     // Catch:{ Exception -> 0x0123 }
                r9.q(r8)     // Catch:{ Exception -> 0x0123 }
                return
            L_0x004a:
                if (r0 != 0) goto L_0x004d
                return
            L_0x004d:
                int r2 = np.com.nepalipatro.helpers.AlarmHelper.f15896g     // Catch:{ Exception -> 0x0123 }
                java.lang.String r3 = "getInstance(context.applicationContext)"
                if (r0 < r2) goto L_0x007f
                np.com.nepalipatro.helpers.AlarmHelper r0 = np.com.nepalipatro.helpers.AlarmHelper.f15890a     // Catch:{ Exception -> 0x005a }
                r0.v(r8)     // Catch:{ Exception -> 0x005a }
            L_0x005a:
                android.os.Bundle r9 = r9.getExtras()     // Catch:{ Exception -> 0x0123 }
                android.content.Context r8 = r8.getApplicationContext()     // Catch:{ Exception -> 0x0123 }
                androidx.work.w r8 = androidx.work.w.f(r8)     // Catch:{ Exception -> 0x0123 }
                kotlin.jvm.internal.m.e(r8, r3)     // Catch:{ Exception -> 0x0123 }
                if (r9 == 0) goto L_0x007e
                np.com.nepalipatro.helpers.AlarmHelper$MyEventWorker$a r0 = np.com.nepalipatro.helpers.AlarmHelper.MyEventWorker.f15905a     // Catch:{ Exception -> 0x0123 }
                androidx.work.o r9 = r0.a(r9)     // Catch:{ Exception -> 0x0123 }
                int r0 = np.com.nepalipatro.helpers.AlarmHelper.f15896g     // Catch:{ Exception -> 0x0123 }
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0123 }
                androidx.work.f r1 = androidx.work.f.REPLACE     // Catch:{ Exception -> 0x0123 }
                r8.d(r0, r1, r9)     // Catch:{ Exception -> 0x0123 }
            L_0x007e:
                return
            L_0x007f:
                np.com.nepalipatro.helpers.AlarmHelper r9 = np.com.nepalipatro.helpers.AlarmHelper.f15890a     // Catch:{ Exception -> 0x0123 }
                int r2 = r9.o()     // Catch:{ Exception -> 0x0123 }
                if (r0 != r2) goto L_0x0098
                r9.A(r8)     // Catch:{ Exception -> 0x0123 }
                np.com.nepalipatro.helpers.l$a r9 = np.com.nepalipatro.helpers.l.f16129a     // Catch:{ Exception -> 0x0123 }
                boolean r8 = r9.o(r8)     // Catch:{ Exception -> 0x0123 }
                if (r8 != 0) goto L_0x013c
                np.com.nepalipatro.App$a r8 = np.com.nepalipatro.App.f15871k     // Catch:{ Exception -> 0x0123 }
                r8.a()     // Catch:{ Exception -> 0x0123 }
                return
            L_0x0098:
                int r2 = np.com.nepalipatro.helpers.AlarmHelper.f15895f     // Catch:{ Exception -> 0x0123 }
                if (r0 != r2) goto L_0x00c9
                np.com.nepalipatro.helpers.l$a r0 = np.com.nepalipatro.helpers.l.f16129a     // Catch:{ Exception -> 0x0123 }
                boolean r0 = r0.o(r8)     // Catch:{ Exception -> 0x0123 }
                if (r0 != 0) goto L_0x00a7
                return
            L_0x00a7:
                r9.x(r8)     // Catch:{ Exception -> 0x0123 }
                android.content.Context r8 = r8.getApplicationContext()     // Catch:{ Exception -> 0x0123 }
                androidx.work.w r8 = androidx.work.w.f(r8)     // Catch:{ Exception -> 0x0123 }
                kotlin.jvm.internal.m.e(r8, r3)     // Catch:{ Exception -> 0x0123 }
                np.com.nepalipatro.helpers.AlarmHelper$NewsWorker$a r9 = np.com.nepalipatro.helpers.AlarmHelper.NewsWorker.f15909a     // Catch:{ Exception -> 0x0123 }
                androidx.work.o r9 = r9.a()     // Catch:{ Exception -> 0x0123 }
                int r0 = np.com.nepalipatro.helpers.AlarmHelper.f15896g     // Catch:{ Exception -> 0x0123 }
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0123 }
                androidx.work.f r1 = androidx.work.f.REPLACE     // Catch:{ Exception -> 0x0123 }
                r8.d(r0, r1, r9)     // Catch:{ Exception -> 0x0123 }
                goto L_0x013c
            L_0x00c9:
                int r2 = r9.n()     // Catch:{ Exception -> 0x0123 }
                if (r0 != r2) goto L_0x00f1
                r9.t(r8)     // Catch:{ Exception -> 0x0123 }
                android.content.Context r8 = r8.getApplicationContext()     // Catch:{ Exception -> 0x0123 }
                androidx.work.w r8 = androidx.work.w.f(r8)     // Catch:{ Exception -> 0x0123 }
                kotlin.jvm.internal.m.e(r8, r3)     // Catch:{ Exception -> 0x0123 }
                np.com.nepalipatro.helpers.AlarmHelper$CalendarWorker$a r0 = np.com.nepalipatro.helpers.AlarmHelper.CalendarWorker.f15902a     // Catch:{ Exception -> 0x0123 }
                androidx.work.o r0 = r0.a()     // Catch:{ Exception -> 0x0123 }
                int r9 = r9.n()     // Catch:{ Exception -> 0x0123 }
                java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0123 }
                androidx.work.f r1 = androidx.work.f.REPLACE     // Catch:{ Exception -> 0x0123 }
                r8.d(r9, r1, r0)     // Catch:{ Exception -> 0x0123 }
                goto L_0x013c
            L_0x00f1:
                int r2 = np.com.nepalipatro.helpers.AlarmHelper.f15894e     // Catch:{ Exception -> 0x0123 }
                if (r0 != r2) goto L_0x013c
                r9.y(r8)     // Catch:{ Exception -> 0x0123 }
                android.content.Context r9 = r8.getApplicationContext()     // Catch:{ Exception -> 0x0123 }
                androidx.work.w r9 = androidx.work.w.f(r9)     // Catch:{ Exception -> 0x0123 }
                kotlin.jvm.internal.m.e(r9, r3)     // Catch:{ Exception -> 0x0123 }
                np.com.nepalipatro.helpers.k$a r0 = np.com.nepalipatro.helpers.k.f16077a     // Catch:{ Exception -> 0x0123 }
                java.lang.String r2 = r0.s()     // Catch:{ Exception -> 0x0123 }
                boolean r8 = r0.c(r8, r2, r1)     // Catch:{ Exception -> 0x0123 }
                np.com.nepalipatro.helpers.AlarmHelper$RashifalPreFetchWorker$a r0 = np.com.nepalipatro.helpers.AlarmHelper.RashifalPreFetchWorker.f15910b     // Catch:{ Exception -> 0x0123 }
                androidx.work.o r8 = r0.a(r8)     // Catch:{ Exception -> 0x0123 }
                int r0 = np.com.nepalipatro.helpers.AlarmHelper.f15894e     // Catch:{ Exception -> 0x0123 }
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0123 }
                androidx.work.f r1 = androidx.work.f.REPLACE     // Catch:{ Exception -> 0x0123 }
                r9.d(r0, r1, r8)     // Catch:{ Exception -> 0x0123 }
                goto L_0x013c
            L_0x0123:
                r8 = move-exception
                r8.printStackTrace()
                goto L_0x013c
            L_0x0128:
                np.com.nepalipatro.helpers.l$a r0 = np.com.nepalipatro.helpers.l.f16129a
                boolean r0 = r0.o(r8)
                if (r0 != 0) goto L_0x0131
                return
            L_0x0131:
                java.lang.Class<np.com.nepalipatro.helpers.AlarmHelper$TimeTickAlarmIntentService> r0 = np.com.nepalipatro.helpers.AlarmHelper.TimeTickAlarmIntentService.class
                np.com.nepalipatro.helpers.AlarmHelper r1 = np.com.nepalipatro.helpers.AlarmHelper.f15890a
                int r1 = r1.o()
                androidx.core.app.h.d(r8, r0, r1, r9)
            L_0x013c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: np.com.nepalipatro.helpers.AlarmHelper.AlarmBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* compiled from: AlarmHelper.kt */
    public static final class CalendarIntentService extends h {

        /* compiled from: AlarmHelper.kt */
        public static final class a implements h.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ z9.h f15900a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ CalendarIntentService f15901b;

            a(z9.h hVar, CalendarIntentService calendarIntentService) {
                this.f15900a = hVar;
                this.f15901b = calendarIntentService;
            }

            public void a(i.f fVar) {
                m.f(fVar, AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS);
                if (fVar == i.f.HTTP_SUCCESS && !this.f15900a.f().contains("D")) {
                    Context applicationContext = this.f15901b.getApplicationContext();
                    m.e(applicationContext, "applicationContext");
                    new AppNotifications(applicationContext, (Service) null, 2, (g) null).y();
                }
                this.f15900a.h(this);
            }
        }

        /* access modifiers changed from: protected */
        public void g(Intent intent) {
            m.f(intent, "intent");
            k.a aVar = k.f16077a;
            Context applicationContext = getApplicationContext();
            m.e(applicationContext, "applicationContext");
            boolean c10 = aVar.c(applicationContext, aVar.u(), true);
            Context applicationContext2 = getApplicationContext();
            m.e(applicationContext2, "applicationContext");
            boolean c11 = aVar.c(applicationContext2, aVar.m(), false);
            if (!c10 && c11) {
                Context applicationContext3 = getApplicationContext();
                m.e(applicationContext3, "applicationContext");
                new AppNotifications(applicationContext3, (Service) null, 2, (g) null).u(true);
            }
            Context applicationContext4 = getApplicationContext();
            m.e(applicationContext4, "applicationContext");
            if (aVar.c(applicationContext4, aVar.u(), true)) {
                Context applicationContext5 = getApplicationContext();
                m.e(applicationContext5, "applicationContext");
                if (aVar.c(applicationContext5, aVar.m(), false)) {
                    Context applicationContext6 = getApplicationContext();
                    m.e(applicationContext6, "applicationContext");
                    new AppNotifications(applicationContext6, (Service) null, 2, (g) null).u(true);
                }
            }
            Context applicationContext7 = getApplicationContext();
            m.e(applicationContext7, "applicationContext");
            if (aVar.c(applicationContext7, aVar.s(), false)) {
                Context applicationContext8 = getApplicationContext();
                m.e(applicationContext8, "applicationContext");
                if (aVar.c(applicationContext8, aVar.t(), true)) {
                    try {
                        Context applicationContext9 = getApplicationContext();
                        m.d(applicationContext9, "null cannot be cast to non-null type np.com.nepalipatro.App");
                        b b10 = ((App) applicationContext9).b();
                        m.c(b10);
                        z9.h o10 = b10.o();
                        if (o10.f().contains("D")) {
                            o10.j(new a(o10, this));
                            o10.c(Boolean.FALSE);
                            return;
                        }
                        Context applicationContext10 = getApplicationContext();
                        m.e(applicationContext10, "applicationContext");
                        new AppNotifications(applicationContext10, (Service) null, 2, (g) null).y();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            }
        }
    }

    /* compiled from: AlarmHelper.kt */
    public static final class CalendarWorker extends Worker {

        /* renamed from: a  reason: collision with root package name */
        public static final a f15902a = new a((g) null);

        /* compiled from: AlarmHelper.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(g gVar) {
                this();
            }

            public final o a() {
                e.a aVar = new e.a();
                o.a aVar2 = new o.a(CalendarWorker.class);
                aVar2.f(aVar.a());
                x b10 = aVar2.b();
                m.e(b10, "OneTimeWorkRequestBuilde…                 .build()");
                return (o) b10;
            }
        }

        /* compiled from: AlarmHelper.kt */
        public static final class b implements h.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ z9.h f15903a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ CalendarWorker f15904b;

            b(z9.h hVar, CalendarWorker calendarWorker) {
                this.f15903a = hVar;
                this.f15904b = calendarWorker;
            }

            public void a(i.f fVar) {
                m.f(fVar, AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS);
                if (fVar == i.f.HTTP_SUCCESS && !this.f15903a.f().contains("D")) {
                    Context applicationContext = this.f15904b.getApplicationContext();
                    m.e(applicationContext, "applicationContext");
                    new AppNotifications(applicationContext, (Service) null, 2, (g) null).y();
                }
                this.f15903a.h(this);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CalendarWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            m.f(context, "context");
            m.f(workerParameters, "workerParams");
        }

        public ListenableWorker.a doWork() {
            k.a aVar = k.f16077a;
            Context applicationContext = getApplicationContext();
            m.e(applicationContext, "applicationContext");
            boolean c10 = aVar.c(applicationContext, aVar.u(), true);
            Context applicationContext2 = getApplicationContext();
            m.e(applicationContext2, "applicationContext");
            boolean c11 = aVar.c(applicationContext2, aVar.m(), false);
            if (!c10 && c11) {
                Context applicationContext3 = getApplicationContext();
                m.e(applicationContext3, "applicationContext");
                new AppNotifications(applicationContext3, (Service) null, 2, (g) null).u(true);
            }
            Context applicationContext4 = getApplicationContext();
            m.e(applicationContext4, "applicationContext");
            if (aVar.c(applicationContext4, aVar.u(), true)) {
                Context applicationContext5 = getApplicationContext();
                m.e(applicationContext5, "applicationContext");
                if (aVar.c(applicationContext5, aVar.s(), false)) {
                    Context applicationContext6 = getApplicationContext();
                    m.e(applicationContext6, "applicationContext");
                    if (aVar.c(applicationContext6, aVar.t(), true)) {
                        try {
                            Context applicationContext7 = getApplicationContext();
                            m.d(applicationContext7, "null cannot be cast to non-null type np.com.nepalipatro.App");
                            z9.b b10 = ((App) applicationContext7).b();
                            m.c(b10);
                            z9.h o10 = b10.o();
                            if (o10.f().contains("D")) {
                                o10.j(new b(o10, this));
                                o10.c(Boolean.FALSE);
                            } else {
                                Context applicationContext8 = getApplicationContext();
                                m.e(applicationContext8, "applicationContext");
                                new AppNotifications(applicationContext8, (Service) null, 2, (g) null).y();
                            }
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                }
            }
            ListenableWorker.a c12 = ListenableWorker.a.c();
            m.e(c12, "success()");
            return c12;
        }
    }

    /* compiled from: AlarmHelper.kt */
    public static final class MyEventIntentservice extends androidx.core.app.h {
        /* access modifiers changed from: protected */
        public void g(Intent intent) {
            m.f(intent, "intent");
            Bundle extras = intent.getExtras();
            if (extras != null) {
                Context applicationContext = getApplicationContext();
                m.e(applicationContext, "getApplicationContext()");
                AppNotifications appNotifications = new AppNotifications(applicationContext, (Service) null, 2, (g) null);
                String string = extras.getString("MY_EVENT_ID");
                m.c(string);
                String string2 = extras.getString("MY_EVENT_REMINDER_ID");
                m.c(string2);
                appNotifications.x(string, string2, extras.getBoolean("IS_REMINDER"));
                q qVar = q.f16189a;
            }
        }
    }

    /* compiled from: AlarmHelper.kt */
    public static final class MyEventWorker extends Worker {

        /* renamed from: a  reason: collision with root package name */
        public static final a f15905a = new a((g) null);
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public static String f15906b = "MY_EVENT_ID";
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static String f15907c = "MY_EVENT_REMINDER_ID";
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static String f15908d = "IS_REMINDER";

        /* compiled from: AlarmHelper.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(g gVar) {
                this();
            }

            public final o a(Bundle bundle) {
                m.f(bundle, "bundle");
                e.a aVar = new e.a();
                aVar.f(b(), bundle.getString(b()));
                aVar.f(c(), bundle.getString(c()));
                aVar.e(d(), bundle.getBoolean(d()));
                o.a aVar2 = new o.a(MyEventWorker.class);
                aVar2.f(aVar.a());
                x b10 = aVar2.b();
                m.e(b10, "OneTimeWorkRequestBuilde…                 .build()");
                return (o) b10;
            }

            public final String b() {
                return MyEventWorker.f15906b;
            }

            public final String c() {
                return MyEventWorker.f15907c;
            }

            public final String d() {
                return MyEventWorker.f15908d;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MyEventWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            m.f(context, "context");
            m.f(workerParameters, "workerParams");
        }

        public ListenableWorker.a doWork() {
            e inputData = getInputData();
            m.e(inputData, "inputData");
            Context applicationContext = getApplicationContext();
            m.e(applicationContext, "applicationContext");
            AppNotifications appNotifications = new AppNotifications(applicationContext, (Service) null, 2, (g) null);
            String j10 = inputData.j(f15906b);
            m.d(j10, "null cannot be cast to non-null type kotlin.String");
            String j11 = inputData.j(f15907c);
            m.d(j11, "null cannot be cast to non-null type kotlin.String");
            appNotifications.x(j10, j11, inputData.h(f15908d, false));
            ListenableWorker.a c10 = ListenableWorker.a.c();
            m.e(c10, "success()");
            return c10;
        }
    }

    /* compiled from: AlarmHelper.kt */
    public static final class NewsIntentService extends androidx.core.app.h {
        /* access modifiers changed from: protected */
        public void g(Intent intent) {
            m.f(intent, "intent");
            Context applicationContext = getApplicationContext();
            m.e(applicationContext, "applicationContext");
            new f(applicationContext).c();
            l.a aVar = l.f16129a;
            Context applicationContext2 = getApplicationContext();
            m.e(applicationContext2, "applicationContext");
            aVar.A(applicationContext2, d.class);
        }
    }

    /* compiled from: AlarmHelper.kt */
    public static final class NewsWorker extends Worker {

        /* renamed from: a  reason: collision with root package name */
        public static final a f15909a = new a((g) null);

        /* compiled from: AlarmHelper.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(g gVar) {
                this();
            }

            public final o a() {
                e.a aVar = new e.a();
                o.a aVar2 = new o.a(NewsWorker.class);
                aVar2.f(aVar.a());
                x b10 = aVar2.b();
                m.e(b10, "OneTimeWorkRequestBuilde…                 .build()");
                return (o) b10;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NewsWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            m.f(context, "context");
            m.f(workerParameters, "workerParams");
        }

        public ListenableWorker.a doWork() {
            Context applicationContext = getApplicationContext();
            m.e(applicationContext, "applicationContext");
            new f(applicationContext).c();
            l.a aVar = l.f16129a;
            Context applicationContext2 = getApplicationContext();
            m.e(applicationContext2, "applicationContext");
            aVar.A(applicationContext2, d.class);
            ListenableWorker.a c10 = ListenableWorker.a.c();
            m.e(c10, "success()");
            return c10;
        }
    }

    /* compiled from: AlarmHelper.kt */
    public static final class RashifalPreFetchWorker extends Worker {

        /* renamed from: b  reason: collision with root package name */
        public static final a f15910b = new a((g) null);

        /* renamed from: a  reason: collision with root package name */
        private final Context f15911a;

        /* compiled from: AlarmHelper.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(g gVar) {
                this();
            }

            public final o a(boolean z10) {
                e.a aVar = new e.a();
                aVar.e(k.f16077a.s(), z10);
                o.a aVar2 = new o.a(RashifalPreFetchWorker.class);
                aVar2.f(aVar.a());
                x b10 = aVar2.b();
                m.e(b10, "OneTimeWorkRequestBuilde…                 .build()");
                return (o) b10;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RashifalPreFetchWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            m.f(context, "context");
            m.f(workerParameters, "workerParams");
            this.f15911a = context;
        }

        public ListenableWorker.a doWork() {
            try {
                if (!getInputData().h(k.f16077a.s(), false)) {
                    ListenableWorker.a a10 = ListenableWorker.a.a();
                    m.e(a10, "failure()");
                    return a10;
                }
                Context applicationContext = this.f15911a.getApplicationContext();
                m.d(applicationContext, "null cannot be cast to non-null type np.com.nepalipatro.App");
                b b10 = ((App) applicationContext).b();
                if (b10 != null) {
                    b10.i(Boolean.FALSE);
                }
                ListenableWorker.a c10 = ListenableWorker.a.c();
                m.e(c10, "success()");
                return c10;
            } catch (Exception unused) {
                ListenableWorker.a a11 = ListenableWorker.a.a();
                m.e(a11, "failure()");
                return a11;
            }
        }
    }

    /* compiled from: AlarmHelper.kt */
    public static final class RashifalPrefetchIntentService extends androidx.core.app.h {
        /* access modifiers changed from: protected */
        public void g(Intent intent) {
            m.f(intent, "intent");
            try {
                k.a aVar = k.f16077a;
                Context applicationContext = getApplicationContext();
                m.e(applicationContext, "applicationContext");
                if (aVar.c(applicationContext, aVar.s(), false)) {
                    Context applicationContext2 = getApplicationContext();
                    m.d(applicationContext2, "null cannot be cast to non-null type np.com.nepalipatro.App");
                    b b10 = ((App) applicationContext2).b();
                    if (b10 != null) {
                        b10.i(Boolean.FALSE);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* compiled from: AlarmHelper.kt */
    public static final class TimeTickAlarmIntentService extends androidx.core.app.h {
        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
            if (r3.equals("android.intent.action.TIME_SET") == false) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
            if (r3.equals("android.intent.action.TIMEZONE_CHANGED") == false) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
            r3 = np.com.nepalipatro.helpers.AlarmHelper.f15890a;
            r1 = getApplicationContext();
            kotlin.jvm.internal.m.e(r1, "applicationContext");
            r3.q(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
            if (r3.equals("android.intent.action.DATE_CHANGED") == false) goto L_0x004e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void g(android.content.Intent r3) {
            /*
                r2 = this;
                java.lang.String r0 = "intent"
                kotlin.jvm.internal.m.f(r3, r0)
                java.lang.String r0 = r3.getAction()
                if (r0 != 0) goto L_0x000c
                return
            L_0x000c:
                java.lang.String r3 = r3.getAction()
                java.lang.String r0 = "applicationContext"
                if (r3 == 0) goto L_0x004e
                int r1 = r3.hashCode()
                switch(r1) {
                    case -1513032534: goto L_0x004b;
                    case -1454123155: goto L_0x0044;
                    case 502473491: goto L_0x002e;
                    case 505380757: goto L_0x0025;
                    case 1041332296: goto L_0x001c;
                    default: goto L_0x001b;
                }
            L_0x001b:
                goto L_0x004e
            L_0x001c:
                java.lang.String r1 = "android.intent.action.DATE_CHANGED"
                boolean r3 = r3.equals(r1)
                if (r3 != 0) goto L_0x0037
                goto L_0x004e
            L_0x0025:
                java.lang.String r1 = "android.intent.action.TIME_SET"
                boolean r3 = r3.equals(r1)
                if (r3 != 0) goto L_0x0037
                goto L_0x004e
            L_0x002e:
                java.lang.String r1 = "android.intent.action.TIMEZONE_CHANGED"
                boolean r3 = r3.equals(r1)
                if (r3 != 0) goto L_0x0037
                goto L_0x004e
            L_0x0037:
                np.com.nepalipatro.helpers.AlarmHelper r3 = np.com.nepalipatro.helpers.AlarmHelper.f15890a
                android.content.Context r1 = r2.getApplicationContext()
                kotlin.jvm.internal.m.e(r1, r0)
                r3.q(r1)
                goto L_0x004e
            L_0x0044:
                java.lang.String r1 = "android.intent.action.SCREEN_ON"
            L_0x0046:
                boolean r3 = r3.equals(r1)
                goto L_0x004e
            L_0x004b:
                java.lang.String r1 = "android.intent.action.TIME_TICK"
                goto L_0x0046
            L_0x004e:
                np.com.nepalipatro.helpers.l$a r3 = np.com.nepalipatro.helpers.l.f16129a
                android.content.Context r1 = r2.getApplicationContext()
                kotlin.jvm.internal.m.e(r1, r0)
                r3.z(r1)
                android.content.Context r1 = r2.getApplicationContext()
                kotlin.jvm.internal.m.e(r1, r0)
                r3.x(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: np.com.nepalipatro.helpers.AlarmHelper.TimeTickAlarmIntentService.g(android.content.Intent):void");
        }
    }

    private AlarmHelper() {
    }

    /* access modifiers changed from: private */
    public final void A(Context context) {
        s(context, 1, 1, f15892c, (Bundle) null);
    }

    private final void B(Context context) {
        A(context);
        t(context);
        v(context);
        y(context);
    }

    private final void C(Context context) {
        k(context);
        m(context);
        l(context);
    }

    private final void k(Context context) {
        if (context != null) {
            Object systemService = context.getSystemService("alarm");
            m.d(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
            AlarmManager alarmManager = (AlarmManager) systemService;
            PendingIntent p10 = p(context, f15893d, (Bundle) null, (Integer) null);
            try {
                alarmManager.cancel(p10);
                p10.cancel();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private final void l(Context context) {
        if (context != null) {
            Object systemService = context.getSystemService("alarm");
            m.d(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
            AlarmManager alarmManager = (AlarmManager) systemService;
            PendingIntent p10 = p(context, f15894e, (Bundle) null, (Integer) null);
            try {
                alarmManager.cancel(p10);
                p10.cancel();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private final void m(Context context) {
        if (context != null) {
            Object systemService = context.getSystemService("alarm");
            m.d(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
            AlarmManager alarmManager = (AlarmManager) systemService;
            PendingIntent p10 = p(context, f15892c, (Bundle) null, (Integer) null);
            try {
                alarmManager.cancel(p10);
                p10.cancel();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private final PendingIntent p(Context context, int i10, Bundle bundle, Integer num) {
        Intent intent = new Intent(context, AlarmBroadcastReceiver.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra(f15897h, i10);
        intent.putExtra(f15898i, System.currentTimeMillis() - SystemClock.elapsedRealtime());
        intent.setAction(d.f15947a.a());
        int i11 = Build.VERSION.SDK_INT >= 31 ? 1275068416 : 134217728;
        if (num != null) {
            num.intValue();
            PendingIntent broadcast = PendingIntent.getBroadcast(context, num.intValue(), intent, i11);
            m.e(broadcast, "getBroadcast(context, aCode, scanIntent, flags)");
            return broadcast;
        }
        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, i10, intent, i11);
        m.e(broadcast2, "getBroadcast(context, al…mCode, scanIntent, flags)");
        return broadcast2;
    }

    private final void r(Context context, int i10, int i11, int i12, int i13) {
        Context context2 = context;
        int i14 = i10;
        int i15 = i13;
        Object systemService = context2.getSystemService("alarm");
        m.d(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        PendingIntent p10 = p(context2, i15, (Bundle) null, (Integer) null);
        Calendar instance = Calendar.getInstance();
        instance.set(11, i11);
        instance.set(12, i12);
        instance.set(13, 0);
        if (i15 == f15894e) {
            k.a aVar = k.f16077a;
            String w10 = aVar.w(context2, aVar.p(), "6:0");
            m.c(w10);
            List c02 = q.c0(w10, new String[]{CertificateUtil.DELIMITER}, false, 0, 6, (Object) null);
            int parseInt = Integer.parseInt((String) c02.get(0));
            int parseInt2 = Integer.parseInt((String) c02.get(1));
            instance.set(11, parseInt);
            instance.set(12, parseInt2);
            long j10 = 60000;
            try {
                Context applicationContext = context.getApplicationContext();
                m.d(applicationContext, "null cannot be cast to non-null type np.com.nepalipatro.App");
                FirebaseRemoteConfig c10 = ((App) applicationContext).c();
                m.c(c10);
                Long.valueOf(c10.getLong(f.f16022a.f())).longValue();
                j10 = 60 * ((long) 1000);
            } catch (Exception unused) {
            }
            ArrayList arrayList = new ArrayList(10);
            for (int i16 = 0; i16 < 10; i16++) {
                arrayList.add(Long.valueOf(c.f13332h.g(0, j10)));
            }
            instance.setTimeInMillis(instance.getTimeInMillis() - ((Number) arrayList.get(0)).longValue());
        }
        k.a aVar2 = k.f16077a;
        if (m.a(aVar2.w(context2, aVar2.q(), AppEventsConstants.EVENT_PARAM_VALUE_NO), AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
            instance.setTimeZone(e.f15961a.T());
        }
        if (instance.getTimeInMillis() <= Calendar.getInstance().getTimeInMillis()) {
            instance.add(5, 1);
        }
        long timeInMillis = instance.getTimeInMillis();
        if (instance.getTimeInMillis() < System.currentTimeMillis()) {
            timeInMillis = System.currentTimeMillis() + ((long) 1440000);
        }
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 23) {
            alarmManager.setExactAndAllowWhileIdle(i14, timeInMillis, p10);
        } else if (i17 >= 19) {
            alarmManager.setExact(i14, timeInMillis, p10);
        } else {
            alarmManager.set(i14, timeInMillis, p10);
        }
    }

    private final void s(Context context, int i10, long j10, int i11, Bundle bundle) {
        int i12;
        String b10;
        String b11;
        long j11 = (long) 60;
        long j12 = (long) 1000;
        long currentTimeMillis = System.currentTimeMillis() + ((j11 - Long.parseLong(new SimpleDateFormat("ss", Locale.ENGLISH).format(new Date()))) * j12);
        long j13 = 0;
        if (j10 > 0) {
            j13 = j10 - 1;
        }
        long j14 = currentTimeMillis + (j13 * j11 * j12);
        if (bundle != null) {
            String string = bundle.getString("MY_EVENT_REMINDER_ID");
            Integer num = null;
            if (!m.a(string, AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
                if (!(string == null || (b11 = new g9.f("[^\\d.]").b(string, "")) == null)) {
                    num = Integer.valueOf(new BigInteger(b11).intValue());
                }
                m.c(num);
                i12 = num.intValue();
            } else {
                String string2 = bundle.getString("MY_EVENT_ID");
                if (!(string2 == null || (b10 = new g9.f("[^\\d.]").b(string2, "")) == null)) {
                    num = Integer.valueOf(new BigInteger(b10).intValue());
                }
                m.c(num);
                i12 = num.intValue();
            }
        } else {
            i12 = i11;
        }
        Object systemService = context.getSystemService("alarm");
        m.d(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        PendingIntent p10 = p(context, i11, bundle, Integer.valueOf(i12));
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 23) {
            alarmManager.setExactAndAllowWhileIdle(i10, j14, p10);
        } else if (i13 >= 19) {
            alarmManager.setExact(i10, j14, p10);
        } else {
            alarmManager.set(i10, j14, p10);
        }
    }

    /* access modifiers changed from: private */
    public final void t(Context context) {
        List list;
        boolean z10;
        k.a aVar = k.f16077a;
        String w10 = aVar.w(context, aVar.p(), "06:00");
        m.c(w10);
        List<String> c10 = new g9.f(CertificateUtil.DELIMITER).c(w10, 0);
        if (!c10.isEmpty()) {
            ListIterator<String> listIterator = c10.listIterator(c10.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                if (listIterator.previous().length() == 0) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (!z10) {
                    list = x.P(c10, listIterator.nextIndex() + 1);
                    break;
                }
            }
            String[] strArr = (String[]) list.toArray(new String[0]);
            r(context, 0, Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]), f15893d);
        }
        list = p.e();
        String[] strArr2 = (String[]) list.toArray(new String[0]);
        try {
            r(context, 0, Integer.parseInt(strArr2[0]), Integer.parseInt(strArr2[1]), f15893d);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void w(Context context) {
        int size;
        Calendar calendar;
        m.f(context, "$context");
        k.a aVar = k.f16077a;
        String v10 = aVar.v();
        e.a aVar2 = e.f15961a;
        String w10 = aVar.w(context, v10, aVar2.b());
        if (w10 == null) {
            w10 = aVar2.b();
        }
        ArrayList<EventModel> b10 = new y9.e(new a(context), context).b(w10);
        if (b10.size() > 0 && b10.size() - 1 >= 0) {
            int i10 = 0;
            while (true) {
                EventModel eventModel = b10.get(i10);
                m.e(eventModel, "cUpcoming.get(i)");
                EventModel eventModel2 = eventModel;
                String id = eventModel2.getId();
                if (id == null) {
                    id = "";
                }
                String str = id;
                eventModel2.getCalendar_id();
                eventModel2.getTitle();
                eventModel2.getDescription();
                EventModel.EventType type = eventModel2.getType();
                if (type == null) {
                    type = EventModel.EventType.Event;
                }
                b bVar = b.f15915a;
                Calendar g10 = bVar.g(eventModel2.getStartDate(), bVar.e(), (TimeZone) null);
                k.a aVar3 = k.f16077a;
                String w11 = aVar3.w(context, aVar3.q(), AppEventsConstants.EVENT_PARAM_VALUE_NO);
                if (w11 == null) {
                    w11 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                }
                if (w11.equals(AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
                    Calendar g11 = bVar.g(eventModel2.getStartDate(), bVar.e(), TimeZone.getTimeZone("GMT+5:45"));
                    Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT+5:45"));
                    m.e(instance, "getInstance(TimeZone.getTimeZone(\"GMT+5:45\"))");
                    instance.setTime(g11.getTime());
                    instance.setTimeZone(TimeZone.getTimeZone("GMT+5:45"));
                    calendar = instance;
                } else {
                    Calendar instance2 = Calendar.getInstance();
                    m.e(instance2, "getInstance()");
                    instance2.setTime(g10.getTime());
                    calendar = instance2;
                }
                if (type == EventModel.EventType.Event) {
                    f15890a.u(context, 0, calendar, str, AppEventsConstants.EVENT_PARAM_VALUE_NO);
                } else {
                    f15890a.z(context, 0, calendar, eventModel2, str);
                }
                if (i10 != size) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void x(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("FlutterSharedPreferences", 0);
        m.e(sharedPreferences, "context.getSharedPrefere…s\", Context.MODE_PRIVATE)");
        try {
            s(context, 1, sharedPreferences.getLong("flutter." + k.f16077a.j(), 15), f15895f, (Bundle) null);
        } catch (Exception unused) {
            s(context, 1, 15, f15895f, (Bundle) null);
        }
    }

    /* access modifiers changed from: private */
    public final void y(Context context) {
        List c02 = q.c0("6:0", new String[]{CertificateUtil.DELIMITER}, false, 0, 6, (Object) null);
        r(context, 0, Integer.parseInt((String) c02.get(0)), Integer.parseInt((String) c02.get(1)), f15894e);
    }

    public final int n() {
        return f15893d;
    }

    public final int o() {
        return f15892c;
    }

    public final void q(Context context) {
        m.f(context, "context");
        C(context);
        B(context);
    }

    public final int u(Context context, int i10, Calendar calendar, String str, String str2) {
        m.f(context, "context");
        m.f(calendar, "calendar");
        m.f(str, "eventId");
        m.f(str2, "reminderId");
        long timeInMillis = calendar.getTimeInMillis();
        Bundle bundle = new Bundle();
        bundle.putString("MY_EVENT_ID", str);
        bundle.putString("MY_EVENT_REMINDER_ID", str2);
        if (timeInMillis <= System.currentTimeMillis()) {
            return i10;
        }
        System.currentTimeMillis();
        s(context, 0, (((timeInMillis - System.currentTimeMillis()) / ((long) 1000)) / ((long) 60)) + 1, f15896g, bundle);
        return i10 + 1;
    }

    public final void v(Context context) {
        m.f(context, "context");
        new Thread(new w9.a(context)).start();
    }

    public final int z(Context context, int i10, Calendar calendar, EventModel eventModel, String str) {
        m.f(context, "context");
        m.f(calendar, "calendar");
        m.f(eventModel, "eventItem");
        m.f(str, "eventId");
        long timeInMillis = calendar.getTimeInMillis();
        Bundle bundle = new Bundle();
        String id = eventModel.getId();
        String str2 = "";
        if (id == null) {
            id = str2;
        }
        bundle.putString("MY_EVENT_ID", id);
        String reminderid = eventModel.getReminderid();
        if (reminderid != null) {
            str2 = reminderid;
        }
        bundle.putString("MY_EVENT_REMINDER_ID", str2);
        bundle.putBoolean("IS_REMINDER", true);
        if (timeInMillis <= System.currentTimeMillis()) {
            return i10;
        }
        s(context, 0, (((timeInMillis - System.currentTimeMillis()) / ((long) 1000)) / ((long) 60)) + 1, f15896g + i10, bundle);
        return i10 + 1;
    }
}
