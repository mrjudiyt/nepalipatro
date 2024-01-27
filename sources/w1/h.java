package w1;

import androidx.work.WorkerParameters;
import o1.i;

/* compiled from: StartWorkRunnable */
public class h implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    private i f12618h;

    /* renamed from: i  reason: collision with root package name */
    private String f12619i;

    /* renamed from: j  reason: collision with root package name */
    private WorkerParameters.a f12620j;

    public h(i iVar, String str, WorkerParameters.a aVar) {
        this.f12618h = iVar;
        this.f12619i = str;
        this.f12620j = aVar;
    }

    public void run() {
        this.f12618h.o().k(this.f12619i, this.f12620j);
    }
}
