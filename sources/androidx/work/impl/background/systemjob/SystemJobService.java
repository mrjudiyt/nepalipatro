package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.m;
import java.util.HashMap;
import java.util.Map;
import o1.b;
import o1.i;

public class SystemJobService extends JobService implements b {

    /* renamed from: j  reason: collision with root package name */
    private static final String f4831j = m.f("SystemJobService");

    /* renamed from: h  reason: collision with root package name */
    private i f4832h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, JobParameters> f4833i = new HashMap();

    private static String a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public void c(String str, boolean z10) {
        JobParameters remove;
        m.c().a(f4831j, String.format("%s executed on JobScheduler", new Object[]{str}), new Throwable[0]);
        synchronized (this.f4833i) {
            remove = this.f4833i.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z10);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            i m10 = i.m(getApplicationContext());
            this.f4832h = m10;
            m10.o().d(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                m.c().h(f4831j, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        i iVar = this.f4832h;
        if (iVar != null) {
            iVar.o().i(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        r2 = null;
        r3 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        if (r3 < 24) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        r2 = new androidx.work.WorkerParameters.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007c, code lost:
        if (r9.getTriggeredContentUris() == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        r2.f4701b = java.util.Arrays.asList(r9.getTriggeredContentUris());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        if (r9.getTriggeredContentAuthorities() == null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
        r2.f4700a = java.util.Arrays.asList(r9.getTriggeredContentAuthorities());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009a, code lost:
        if (r3 < 28) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009c, code lost:
        r2.f4702c = r9.getNetwork();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a2, code lost:
        r8.f4832h.x(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a7, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            o1.i r0 = r8.f4832h
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            androidx.work.m r0 = androidx.work.m.c()
            java.lang.String r3 = f4831j
            java.lang.String r4 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r5 = new java.lang.Throwable[r2]
            r0.a(r3, r4, r5)
            r8.jobFinished(r9, r1)
            return r2
        L_0x0017:
            java.lang.String r0 = a(r9)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x002f
            androidx.work.m r9 = androidx.work.m.c()
            java.lang.String r0 = f4831j
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r9.b(r0, r1, r3)
            return r2
        L_0x002f:
            java.util.Map<java.lang.String, android.app.job.JobParameters> r3 = r8.f4833i
            monitor-enter(r3)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r4 = r8.f4833i     // Catch:{ all -> 0x00a8 }
            boolean r4 = r4.containsKey(r0)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x0051
            androidx.work.m r9 = androidx.work.m.c()     // Catch:{ all -> 0x00a8 }
            java.lang.String r4 = f4831j     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a8 }
            r1[r2] = r0     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = java.lang.String.format(r5, r1)     // Catch:{ all -> 0x00a8 }
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00a8 }
            r9.a(r4, r0, r1)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a8 }
            return r2
        L_0x0051:
            androidx.work.m r4 = androidx.work.m.c()     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = f4831j     // Catch:{ all -> 0x00a8 }
            java.lang.String r6 = "onStartJob for %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a8 }
            r7[r2] = r0     // Catch:{ all -> 0x00a8 }
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch:{ all -> 0x00a8 }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00a8 }
            r4.a(r5, r6, r2)     // Catch:{ all -> 0x00a8 }
            java.util.Map<java.lang.String, android.app.job.JobParameters> r2 = r8.f4833i     // Catch:{ all -> 0x00a8 }
            r2.put(r0, r9)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a8 }
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L_0x00a2
            androidx.work.WorkerParameters$a r2 = new androidx.work.WorkerParameters$a
            r2.<init>()
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            if (r4 == 0) goto L_0x0088
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r2.f4701b = r4
        L_0x0088:
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            if (r4 == 0) goto L_0x0098
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r2.f4700a = r4
        L_0x0098:
            r4 = 28
            if (r3 < r4) goto L_0x00a2
            android.net.Network r9 = r9.getNetwork()
            r2.f4702c = r9
        L_0x00a2:
            o1.i r9 = r8.f4832h
            r9.x(r0, r2)
            return r1
        L_0x00a8:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a8 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f4832h == null) {
            m.c().a(f4831j, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String a10 = a(jobParameters);
        if (TextUtils.isEmpty(a10)) {
            m.c().b(f4831j, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        m.c().a(f4831j, String.format("onStopJob for %s", new Object[]{a10}), new Throwable[0]);
        synchronized (this.f4833i) {
            this.f4833i.remove(a10);
        }
        this.f4832h.z(a10);
        return !this.f4832h.o().f(a10);
    }
}
