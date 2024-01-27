package q1;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.c;
import androidx.work.d;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.m;
import androidx.work.n;
import v1.p;

/* compiled from: SystemJobInfoConverter */
class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f10668b = m.f("SystemJobInfoConverter");

    /* renamed from: a  reason: collision with root package name */
    private final ComponentName f10669a;

    /* renamed from: q1.a$a  reason: collision with other inner class name */
    /* compiled from: SystemJobInfoConverter */
    static /* synthetic */ class C0185a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10670a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.work.n[] r0 = androidx.work.n.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10670a = r0
                androidx.work.n r1 = androidx.work.n.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10670a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.work.n r1 = androidx.work.n.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10670a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.work.n r1 = androidx.work.n.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10670a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.work.n r1 = androidx.work.n.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f10670a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.work.n r1 = androidx.work.n.METERED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q1.a.C0185a.<clinit>():void");
        }
    }

    a(Context context) {
        this.f10669a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    private static JobInfo.TriggerContentUri b(d.a aVar) {
        return new JobInfo.TriggerContentUri(aVar.a(), aVar.b() ? 1 : 0);
    }

    static int c(n nVar) {
        int i10 = C0185a.f10670a[nVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 != 4) {
            if (i10 == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        m.c().a(f10668b, String.format("API version too low. Cannot convert network type value %s", new Object[]{nVar}), new Throwable[0]);
        return 1;
    }

    static void d(JobInfo.Builder builder, n nVar) {
        if (Build.VERSION.SDK_INT < 30 || nVar != n.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(nVar));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    /* access modifiers changed from: package-private */
    public JobInfo a(p pVar, int i10) {
        c cVar = pVar.f12264j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.f12255a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.d());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f10669a).setRequiresCharging(cVar.g()).setRequiresDeviceIdle(cVar.h()).setExtras(persistableBundle);
        d(extras, cVar.b());
        boolean z10 = false;
        if (!cVar.h()) {
            extras.setBackoffCriteria(pVar.f12267m, pVar.f12266l == androidx.work.a.LINEAR ? 0 : 1);
        }
        long max = Math.max(pVar.a() - System.currentTimeMillis(), 0);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pVar.f12271q) {
            extras.setImportantWhileForeground(true);
        }
        if (i11 >= 24 && cVar.e()) {
            for (d.a b10 : cVar.a().b()) {
                extras.addTriggerContentUri(b(b10));
            }
            extras.setTriggerContentUpdateDelay(cVar.c());
            extras.setTriggerContentMaxDelay(cVar.d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(cVar.f());
            extras.setRequiresStorageNotLow(cVar.i());
        }
        boolean z11 = pVar.f12265k > 0;
        if (max > 0) {
            z10 = true;
        }
        if (androidx.core.os.a.b() && pVar.f12271q && !z11 && !z10) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
