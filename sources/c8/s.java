package c8;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: DatabaseWorkerPool */
class s implements o {

    /* renamed from: a  reason: collision with root package name */
    final String f13421a;

    /* renamed from: b  reason: collision with root package name */
    final int f13422b;

    /* renamed from: c  reason: collision with root package name */
    private HandlerThread f13423c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f13424d;

    s(String str, int i10) {
        this.f13421a = str;
        this.f13422b = i10;
    }

    public void a(k kVar) {
        this.f13424d.post(kVar.f13405b);
    }

    public void b() {
        HandlerThread handlerThread = this.f13423c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f13423c = null;
            this.f13424d = null;
        }
    }

    public /* synthetic */ void c(i iVar, Runnable runnable) {
        n.a(this, iVar, runnable);
    }

    public void start() {
        HandlerThread handlerThread = new HandlerThread(this.f13421a, this.f13422b);
        this.f13423c = handlerThread;
        handlerThread.start();
        this.f13424d = new Handler(this.f13423c.getLooper());
    }
}
