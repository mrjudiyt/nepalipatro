package q1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.m;
import androidx.work.v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o1.e;
import o1.i;
import v1.g;
import v1.p;
import v1.q;
import w1.c;

/* compiled from: SystemJobScheduler */
public class b implements e {

    /* renamed from: l  reason: collision with root package name */
    private static final String f10671l = m.f("SystemJobScheduler");

    /* renamed from: h  reason: collision with root package name */
    private final Context f10672h;

    /* renamed from: i  reason: collision with root package name */
    private final JobScheduler f10673i;

    /* renamed from: j  reason: collision with root package name */
    private final i f10674j;

    /* renamed from: k  reason: collision with root package name */
    private final a f10675k;

    public b(Context context, i iVar) {
        this(context, iVar, (JobScheduler) context.getSystemService("jobscheduler"), new a(context));
    }

    public static void b(Context context) {
        List<JobInfo> g10;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (g10 = g(context, jobScheduler)) != null && !g10.isEmpty()) {
            for (JobInfo id : g10) {
                c(jobScheduler, id.getId());
            }
        }
    }

    private static void c(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th) {
            m.c().b(f10671l, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i10)}), th);
        }
    }

    private static List<Integer> e(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g10 = g(context, jobScheduler);
        if (g10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo next : g10) {
            if (str.equals(h(next))) {
                arrayList.add(Integer.valueOf(next.getId()));
            }
        }
        return arrayList;
    }

    private static List<JobInfo> g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            m.c().b(f10671l, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private static String h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, i iVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g10 = g(context, jobScheduler);
        List<String> a10 = iVar.q().y().a();
        boolean z10 = false;
        HashSet hashSet = new HashSet(g10 != null ? g10.size() : 0);
        if (g10 != null && !g10.isEmpty()) {
            for (JobInfo next : g10) {
                String h10 = h(next);
                if (!TextUtils.isEmpty(h10)) {
                    hashSet.add(h10);
                } else {
                    c(jobScheduler, next.getId());
                }
            }
        }
        Iterator<String> it = a10.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    m.c().a(f10671l, "Reconciling jobs", new Throwable[0]);
                    z10 = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z10) {
            WorkDatabase q10 = iVar.q();
            q10.c();
            try {
                q B = q10.B();
                for (String c10 : a10) {
                    B.c(c10, -1);
                }
                q10.r();
            } finally {
                q10.g();
            }
        }
        return z10;
    }

    public boolean a() {
        return true;
    }

    public void d(String str) {
        List<Integer> e10 = e(this.f10672h, this.f10673i, str);
        if (e10 != null && !e10.isEmpty()) {
            for (Integer intValue : e10) {
                c(this.f10673i, intValue.intValue());
            }
            this.f10674j.q().y().c(str);
        }
    }

    /* JADX INFO: finally extract failed */
    public void f(p... pVarArr) {
        int i10;
        List<Integer> e10;
        int i11;
        WorkDatabase q10 = this.f10674j.q();
        c cVar = new c(q10);
        int length = pVarArr.length;
        int i12 = 0;
        while (i12 < length) {
            p pVar = pVarArr[i12];
            q10.c();
            try {
                p n10 = q10.B().n(pVar.f12255a);
                if (n10 == null) {
                    m c10 = m.c();
                    String str = f10671l;
                    c10.h(str, "Skipping scheduling " + pVar.f12255a + " because it's no longer in the DB", new Throwable[0]);
                    q10.r();
                } else if (n10.f12256b != v.a.ENQUEUED) {
                    m c11 = m.c();
                    String str2 = f10671l;
                    c11.h(str2, "Skipping scheduling " + pVar.f12255a + " because it is no longer enqueued", new Throwable[0]);
                    q10.r();
                } else {
                    g b10 = q10.y().b(pVar.f12255a);
                    if (b10 != null) {
                        i10 = b10.f12233b;
                    } else {
                        i10 = cVar.d(this.f10674j.k().i(), this.f10674j.k().g());
                    }
                    if (b10 == null) {
                        this.f10674j.q().y().d(new g(pVar.f12255a, i10));
                    }
                    j(pVar, i10);
                    if (Build.VERSION.SDK_INT == 23 && (e10 = e(this.f10672h, this.f10673i, pVar.f12255a)) != null) {
                        int indexOf = e10.indexOf(Integer.valueOf(i10));
                        if (indexOf >= 0) {
                            e10.remove(indexOf);
                        }
                        if (!e10.isEmpty()) {
                            i11 = e10.get(0).intValue();
                        } else {
                            i11 = cVar.d(this.f10674j.k().i(), this.f10674j.k().g());
                        }
                        j(pVar, i11);
                    }
                    q10.r();
                }
                q10.g();
                i12++;
            } catch (Throwable th) {
                q10.g();
                throw th;
            }
        }
    }

    public void j(p pVar, int i10) {
        JobInfo a10 = this.f10675k.a(pVar, i10);
        m c10 = m.c();
        String str = f10671l;
        c10.a(str, String.format("Scheduling work ID %s Job ID %s", new Object[]{pVar.f12255a, Integer.valueOf(i10)}), new Throwable[0]);
        try {
            if (this.f10673i.schedule(a10) == 0) {
                m.c().h(str, String.format("Unable to schedule work ID %s", new Object[]{pVar.f12255a}), new Throwable[0]);
                if (pVar.f12271q && pVar.f12272r == androidx.work.q.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f12271q = false;
                    m.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{pVar.f12255a}), new Throwable[0]);
                    j(pVar, i10);
                }
            }
        } catch (IllegalStateException e10) {
            List<JobInfo> g10 = g(this.f10672h, this.f10673i);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(g10 != null ? g10.size() : 0), Integer.valueOf(this.f10674j.q().B().g().size()), Integer.valueOf(this.f10674j.k().h())});
            m.c().b(f10671l, format, new Throwable[0]);
            throw new IllegalStateException(format, e10);
        } catch (Throwable th) {
            m.c().b(f10671l, String.format("Unable to schedule %s", new Object[]{pVar}), th);
        }
    }

    public b(Context context, i iVar, JobScheduler jobScheduler, a aVar) {
        this.f10672h = context;
        this.f10674j = iVar;
        this.f10673i = jobScheduler;
        this.f10675k = aVar;
    }
}
