package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import com.facebook.AuthenticationTokenClaims;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* compiled from: JobIntentService */
public abstract class h extends Service {

    /* renamed from: o  reason: collision with root package name */
    static final Object f2109o = new Object();

    /* renamed from: p  reason: collision with root package name */
    static final HashMap<ComponentName, C0025h> f2110p = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    b f2111h;

    /* renamed from: i  reason: collision with root package name */
    C0025h f2112i;

    /* renamed from: j  reason: collision with root package name */
    a f2113j;

    /* renamed from: k  reason: collision with root package name */
    boolean f2114k = false;

    /* renamed from: l  reason: collision with root package name */
    boolean f2115l = false;

    /* renamed from: m  reason: collision with root package name */
    boolean f2116m = false;

    /* renamed from: n  reason: collision with root package name */
    final ArrayList<d> f2117n;

    /* compiled from: JobIntentService */
    final class a extends AsyncTask<Void, Void, Void> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                e a10 = h.this.a();
                if (a10 == null) {
                    return null;
                }
                h.this.g(a10.getIntent());
                a10.complete();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onCancelled(Void voidR) {
            h.this.i();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(Void voidR) {
            h.this.i();
        }
    }

    /* compiled from: JobIntentService */
    interface b {
        IBinder compatGetBinder();

        e dequeueWork();
    }

    /* compiled from: JobIntentService */
    static final class c extends C0025h {

        /* renamed from: d  reason: collision with root package name */
        private final Context f2119d;

        /* renamed from: e  reason: collision with root package name */
        private final PowerManager.WakeLock f2120e;

        /* renamed from: f  reason: collision with root package name */
        private final PowerManager.WakeLock f2121f;

        /* renamed from: g  reason: collision with root package name */
        boolean f2122g;

        /* renamed from: h  reason: collision with root package name */
        boolean f2123h;

        c(Context context, ComponentName componentName) {
            super(componentName);
            this.f2119d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f2120e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f2121f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        /* access modifiers changed from: package-private */
        public void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f2134a);
            if (this.f2119d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f2122g) {
                        this.f2122g = true;
                        if (!this.f2123h) {
                            this.f2120e.acquire(60000);
                        }
                    }
                }
            }
        }

        public void c() {
            synchronized (this) {
                if (this.f2123h) {
                    if (this.f2122g) {
                        this.f2120e.acquire(60000);
                    }
                    this.f2123h = false;
                    this.f2121f.release();
                }
            }
        }

        public void d() {
            synchronized (this) {
                if (!this.f2123h) {
                    this.f2123h = true;
                    this.f2121f.acquire(AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED);
                    this.f2120e.release();
                }
            }
        }

        public void e() {
            synchronized (this) {
                this.f2122g = false;
            }
        }
    }

    /* compiled from: JobIntentService */
    final class d implements e {

        /* renamed from: a  reason: collision with root package name */
        final Intent f2124a;

        /* renamed from: b  reason: collision with root package name */
        final int f2125b;

        d(Intent intent, int i10) {
            this.f2124a = intent;
            this.f2125b = i10;
        }

        public void complete() {
            h.this.stopSelf(this.f2125b);
        }

        public Intent getIntent() {
            return this.f2124a;
        }
    }

    /* compiled from: JobIntentService */
    interface e {
        void complete();

        Intent getIntent();
    }

    /* compiled from: JobIntentService */
    static final class f extends JobServiceEngine implements b {

        /* renamed from: a  reason: collision with root package name */
        final h f2127a;

        /* renamed from: b  reason: collision with root package name */
        final Object f2128b = new Object();

        /* renamed from: c  reason: collision with root package name */
        JobParameters f2129c;

        /* compiled from: JobIntentService */
        final class a implements e {

            /* renamed from: a  reason: collision with root package name */
            final JobWorkItem f2130a;

            a(JobWorkItem jobWorkItem) {
                this.f2130a = jobWorkItem;
            }

            public void complete() {
                synchronized (f.this.f2128b) {
                    JobParameters jobParameters = f.this.f2129c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f2130a);
                    }
                }
            }

            public Intent getIntent() {
                return this.f2130a.getIntent();
            }
        }

        f(h hVar) {
            super(hVar);
            this.f2127a = hVar;
        }

        public IBinder compatGetBinder() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            r1.getIntent().setExtrasClassLoader(r3.f2127a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            return new androidx.core.app.h.f.a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (r1 == null) goto L_0x0024;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.core.app.h.e dequeueWork() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f2128b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f2129c     // Catch:{ all -> 0x0025 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                return r2
            L_0x000a:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0025 }
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                if (r1 == 0) goto L_0x0024
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.h r2 = r3.f2127a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                androidx.core.app.h$f$a r0 = new androidx.core.app.h$f$a
                r0.<init>(r1)
                return r0
            L_0x0024:
                return r2
            L_0x0025:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.h.f.dequeueWork():androidx.core.app.h$e");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f2129c = jobParameters;
            this.f2127a.e(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean b10 = this.f2127a.b();
            synchronized (this.f2128b) {
                this.f2129c = null;
            }
            return b10;
        }
    }

    /* compiled from: JobIntentService */
    static final class g extends C0025h {

        /* renamed from: d  reason: collision with root package name */
        private final JobInfo f2132d;

        /* renamed from: e  reason: collision with root package name */
        private final JobScheduler f2133e;

        g(Context context, ComponentName componentName, int i10) {
            super(componentName);
            b(i10);
            this.f2132d = new JobInfo.Builder(i10, this.f2134a).setOverrideDeadline(0).build();
            this.f2133e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        /* access modifiers changed from: package-private */
        public void a(Intent intent) {
            this.f2133e.enqueue(this.f2132d, new JobWorkItem(intent));
        }
    }

    /* renamed from: androidx.core.app.h$h  reason: collision with other inner class name */
    /* compiled from: JobIntentService */
    static abstract class C0025h {

        /* renamed from: a  reason: collision with root package name */
        final ComponentName f2134a;

        /* renamed from: b  reason: collision with root package name */
        boolean f2135b;

        /* renamed from: c  reason: collision with root package name */
        int f2136c;

        C0025h(ComponentName componentName) {
            this.f2134a = componentName;
        }

        /* access modifiers changed from: package-private */
        public abstract void a(Intent intent);

        /* access modifiers changed from: package-private */
        public void b(int i10) {
            if (!this.f2135b) {
                this.f2135b = true;
                this.f2136c = i10;
            } else if (this.f2136c != i10) {
                throw new IllegalArgumentException("Given job ID " + i10 + " is different than previous " + this.f2136c);
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public h() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2117n = null;
        } else {
            this.f2117n = new ArrayList<>();
        }
    }

    public static void c(Context context, ComponentName componentName, int i10, Intent intent) {
        if (intent != null) {
            synchronized (f2109o) {
                C0025h f10 = f(context, componentName, true, i10);
                f10.b(i10);
                f10.a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    public static void d(Context context, Class<?> cls, int i10, Intent intent) {
        c(context, new ComponentName(context, cls), i10, intent);
    }

    static C0025h f(Context context, ComponentName componentName, boolean z10, int i10) {
        C0025h hVar;
        HashMap<ComponentName, C0025h> hashMap = f2110p;
        C0025h hVar2 = hashMap.get(componentName);
        if (hVar2 != null) {
            return hVar2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            hVar = new c(context, componentName);
        } else if (z10) {
            hVar = new g(context, componentName, i10);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        C0025h hVar3 = hVar;
        hashMap.put(componentName, hVar3);
        return hVar3;
    }

    /* access modifiers changed from: package-private */
    public e a() {
        b bVar = this.f2111h;
        if (bVar != null) {
            return bVar.dequeueWork();
        }
        synchronized (this.f2117n) {
            if (this.f2117n.size() <= 0) {
                return null;
            }
            e remove = this.f2117n.remove(0);
            return remove;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        a aVar = this.f2113j;
        if (aVar != null) {
            aVar.cancel(this.f2114k);
        }
        this.f2115l = true;
        return h();
    }

    /* access modifiers changed from: package-private */
    public void e(boolean z10) {
        if (this.f2113j == null) {
            this.f2113j = new a();
            C0025h hVar = this.f2112i;
            if (hVar != null && z10) {
                hVar.d();
            }
            this.f2113j.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void g(Intent intent);

    public boolean h() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        ArrayList<d> arrayList = this.f2117n;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f2113j = null;
                ArrayList<d> arrayList2 = this.f2117n;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    e(false);
                } else if (!this.f2116m) {
                    this.f2112i.c();
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        b bVar = this.f2111h;
        if (bVar != null) {
            return bVar.compatGetBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2111h = new f(this);
            this.f2112i = null;
            return;
        }
        this.f2111h = null;
        this.f2112i = f(this, new ComponentName(this, getClass()), false, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.f2117n;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f2116m = true;
                this.f2112i.c();
            }
        }
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        if (this.f2117n == null) {
            return 2;
        }
        this.f2112i.e();
        synchronized (this.f2117n) {
            ArrayList<d> arrayList = this.f2117n;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i11));
            e(true);
        }
        return 3;
    }
}
