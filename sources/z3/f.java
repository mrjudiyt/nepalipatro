package z3;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ JobInfoSchedulerService f17497h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ JobParameters f17498i;

    public /* synthetic */ f(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f17497h = jobInfoSchedulerService;
        this.f17498i = jobParameters;
    }

    public final void run() {
        this.f17497h.b(this.f17498i);
    }
}
