package a6;

import a6.k;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SystemHandlerWrapper */
final class g0 implements k {

    /* renamed from: b  reason: collision with root package name */
    private static final List<b> f183b = new ArrayList(50);

    /* renamed from: a  reason: collision with root package name */
    private final Handler f184a;

    /* compiled from: SystemHandlerWrapper */
    private static final class b implements k.a {

        /* renamed from: a  reason: collision with root package name */
        private Message f185a;

        /* renamed from: b  reason: collision with root package name */
        private g0 f186b;

        private b() {
        }

        private void b() {
            this.f185a = null;
            this.f186b = null;
            g0.n(this);
        }

        public void a() {
            ((Message) a.e(this.f185a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) a.e(this.f185a));
            b();
            return sendMessageAtFrontOfQueue;
        }

        public b d(Message message, g0 g0Var) {
            this.f185a = message;
            this.f186b = g0Var;
            return this;
        }
    }

    public g0(Handler handler) {
        this.f184a = handler;
    }

    private static b m() {
        b bVar;
        List<b> list = f183b;
        synchronized (list) {
            if (list.isEmpty()) {
                bVar = new b();
            } else {
                bVar = list.remove(list.size() - 1);
            }
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    public static void n(b bVar) {
        List<b> list = f183b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(bVar);
            }
        }
    }

    public k.a a(int i10, int i11, int i12) {
        return m().d(this.f184a.obtainMessage(i10, i11, i12), this);
    }

    public boolean b(k.a aVar) {
        return ((b) aVar).c(this.f184a);
    }

    public boolean c(Runnable runnable) {
        return this.f184a.post(runnable);
    }

    public k.a d(int i10) {
        return m().d(this.f184a.obtainMessage(i10), this);
    }

    public boolean e(int i10) {
        return this.f184a.hasMessages(i10);
    }

    public boolean f(int i10) {
        return this.f184a.sendEmptyMessage(i10);
    }

    public k.a g(int i10, int i11, int i12, Object obj) {
        return m().d(this.f184a.obtainMessage(i10, i11, i12, obj), this);
    }

    public boolean h(int i10, long j10) {
        return this.f184a.sendEmptyMessageAtTime(i10, j10);
    }

    public void i(int i10) {
        this.f184a.removeMessages(i10);
    }

    public k.a j(int i10, Object obj) {
        return m().d(this.f184a.obtainMessage(i10, obj), this);
    }

    public void k(Object obj) {
        this.f184a.removeCallbacksAndMessages(obj);
    }
}
