package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.os.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.m;
import androidx.work.v;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o1.f;
import o1.h;
import o1.i;
import q1.b;
import v1.n;
import v1.p;
import v1.q;

public class ForceStopRunnable implements Runnable {

    /* renamed from: k  reason: collision with root package name */
    private static final String f4864k = m.f("ForceStopRunnable");

    /* renamed from: l  reason: collision with root package name */
    private static final long f4865l = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: h  reason: collision with root package name */
    private final Context f4866h;

    /* renamed from: i  reason: collision with root package name */
    private final i f4867i;

    /* renamed from: j  reason: collision with root package name */
    private int f4868j = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private static final String f4869a = m.f("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                m.c().g(f4869a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
                ForceStopRunnable.g(context);
            }
        }
    }

    public ForceStopRunnable(Context context, i iVar) {
        this.f4866h = context.getApplicationContext();
        this.f4867i = iVar;
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, c(context), i10);
    }

    @SuppressLint({"ClassVerificationFailure"})
    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d10 = d(context, a.b() ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f4865l;
        if (alarmManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, currentTimeMillis, d10);
        } else {
            alarmManager.set(0, currentTimeMillis, d10);
        }
    }

    public boolean a() {
        boolean i10 = Build.VERSION.SDK_INT >= 23 ? b.i(this.f4866h, this.f4867i) : false;
        WorkDatabase q10 = this.f4867i.q();
        q B = q10.B();
        n A = q10.A();
        q10.c();
        try {
            List<p> i11 = B.i();
            boolean z10 = i11 != null && !i11.isEmpty();
            if (z10) {
                for (p next : i11) {
                    B.b(v.a.ENQUEUED, next.f12255a);
                    B.c(next.f12255a, -1);
                }
            }
            A.c();
            q10.r();
            if (z10 || i10) {
                return true;
            }
            return false;
        } finally {
            q10.g();
        }
    }

    public void b() {
        boolean a10 = a();
        if (h()) {
            m.c().a(f4864k, "Rescheduling Workers.", new Throwable[0]);
            this.f4867i.u();
            this.f4867i.n().c(false);
        } else if (e()) {
            m.c().a(f4864k, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f4867i.u();
        } else if (a10) {
            m.c().a(f4864k, "Found unfinished work, scheduling it.", new Throwable[0]);
            f.b(this.f4867i.k(), this.f4867i.q(), this.f4867i.p());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    public boolean e() {
        int i10 = 536870912;
        try {
            if (a.b()) {
                i10 = 570425344;
            }
            PendingIntent d10 = d(this.f4866h, i10);
            if (Build.VERSION.SDK_INT >= 30) {
                if (d10 != null) {
                    d10.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.f4866h.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i11 = 0; i11 < historicalProcessExitReasons.size(); i11++) {
                        if (((ApplicationExitInfo) historicalProcessExitReasons.get(i11)).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (d10 == null) {
                g(this.f4866h);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e10) {
            m.c().h(f4864k, "Ignoring exception", e10);
            return true;
        }
    }

    public boolean f() {
        androidx.work.b k10 = this.f4867i.k();
        if (TextUtils.isEmpty(k10.c())) {
            m.c().a(f4864k, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean b10 = w1.f.b(this.f4866h, k10);
        m.c().a(f4864k, String.format("Is default app process = %s", new Object[]{Boolean.valueOf(b10)}), new Throwable[0]);
        return b10;
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return this.f4867i.n().a();
    }

    public void i(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    public void run() {
        try {
            if (!f()) {
                this.f4867i.t();
                return;
            }
            while (true) {
                h.e(this.f4866h);
                m.c().a(f4864k, "Performing cleanup operations.", new Throwable[0]);
                b();
                break;
            }
            this.f4867i.t();
        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e10) {
            int i10 = this.f4868j + 1;
            this.f4868j = i10;
            if (i10 >= 3) {
                m c10 = m.c();
                String str = f4864k;
                c10.b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                androidx.work.i d10 = this.f4867i.k().d();
                if (d10 != null) {
                    m.c().a(str, "Routing exception to the specified exception handler", illegalStateException);
                    d10.a(illegalStateException);
                } else {
                    throw illegalStateException;
                }
            } else {
                m.c().a(f4864k, String.format("Retrying after %s", new Object[]{Long.valueOf(((long) i10) * 300)}), e10);
                i(((long) this.f4868j) * 300);
            }
        } catch (Throwable th) {
            this.f4867i.t();
            throw th;
        }
    }
}
