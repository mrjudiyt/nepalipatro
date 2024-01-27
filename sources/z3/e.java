package z3;

import a4.d;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.facebook.bolts.AppLinks;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import d4.a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import s3.p;

/* compiled from: JobInfoScheduler */
public class e implements y {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13151a;

    /* renamed from: b  reason: collision with root package name */
    private final d f13152b;

    /* renamed from: c  reason: collision with root package name */
    private final g f13153c;

    public e(Context context, d dVar, g gVar) {
        this.f13151a = context;
        this.f13152b = dVar;
        this.f13153c = gVar;
    }

    private boolean d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i12 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i10) {
                if (i12 >= i11) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public void a(p pVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f13151a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f13151a.getSystemService("jobscheduler");
        int c10 = c(pVar);
        if (z10 || !d(jobScheduler, c10, i10)) {
            long D0 = this.f13152b.D0(pVar);
            JobInfo.Builder c11 = this.f13153c.c(new JobInfo.Builder(c10, componentName), pVar.d(), D0, i10);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", pVar.b());
            persistableBundle.putInt("priority", a.a(pVar.d()));
            if (pVar.c() != null) {
                persistableBundle.putString(AppLinks.KEY_NAME_EXTRAS, Base64.encodeToString(pVar.c(), 0));
            }
            c11.setExtras(persistableBundle);
            w3.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", pVar, Integer.valueOf(c10), Long.valueOf(this.f13153c.g(pVar.d(), D0, i10)), Long.valueOf(D0), Integer.valueOf(i10));
            jobScheduler.schedule(c11.build());
            return;
        }
        w3.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
    }

    public void b(p pVar, int i10) {
        a(pVar, i10, false);
    }

    /* access modifiers changed from: package-private */
    public int c(p pVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f13151a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(pVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(a.a(pVar.d())).array());
        if (pVar.c() != null) {
            adler32.update(pVar.c());
        }
        return (int) adler32.getValue();
    }
}
