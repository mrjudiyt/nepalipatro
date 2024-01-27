package c8;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: DatabaseWorker */
class m {

    /* renamed from: a  reason: collision with root package name */
    private final String f13406a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13407b;

    /* renamed from: c  reason: collision with root package name */
    private HandlerThread f13408c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f13409d;

    /* renamed from: e  reason: collision with root package name */
    protected Runnable f13410e;

    /* renamed from: f  reason: collision with root package name */
    private k f13411f;

    m(String str, int i10) {
        this.f13406a = str;
        this.f13407b = i10;
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        k kVar = this.f13411f;
        return kVar != null && kVar.b();
    }

    /* access modifiers changed from: package-private */
    public Integer d() {
        k kVar = this.f13411f;
        if (kVar != null) {
            return kVar.a();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void e(k kVar) {
        this.f13409d.post(new l(this, kVar));
    }

    /* access modifiers changed from: package-private */
    public synchronized void f() {
        HandlerThread handlerThread = this.f13408c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f13408c = null;
            this.f13409d = null;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void g(Runnable runnable) {
        HandlerThread handlerThread = new HandlerThread(this.f13406a, this.f13407b);
        this.f13408c = handlerThread;
        handlerThread.start();
        this.f13409d = new Handler(this.f13408c.getLooper());
        this.f13410e = runnable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void c(k kVar) {
        kVar.f13405b.run();
        this.f13411f = kVar;
        this.f13410e.run();
    }
}
