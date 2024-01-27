package b6;

import a6.m0;
import a6.p;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

/* compiled from: VideoFrameReleaseHelper */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final e f5081a = new e();

    /* renamed from: b  reason: collision with root package name */
    private final a f5082b;

    /* renamed from: c  reason: collision with root package name */
    private final d f5083c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5084d;

    /* renamed from: e  reason: collision with root package name */
    private Surface f5085e;

    /* renamed from: f  reason: collision with root package name */
    private float f5086f;

    /* renamed from: g  reason: collision with root package name */
    private float f5087g;

    /* renamed from: h  reason: collision with root package name */
    private float f5088h;

    /* renamed from: i  reason: collision with root package name */
    private float f5089i;

    /* renamed from: j  reason: collision with root package name */
    private long f5090j;

    /* renamed from: k  reason: collision with root package name */
    private long f5091k;

    /* renamed from: l  reason: collision with root package name */
    private long f5092l;

    /* renamed from: m  reason: collision with root package name */
    private long f5093m;

    /* renamed from: n  reason: collision with root package name */
    private long f5094n;

    /* renamed from: o  reason: collision with root package name */
    private long f5095o;

    /* renamed from: p  reason: collision with root package name */
    private long f5096p;

    /* compiled from: VideoFrameReleaseHelper */
    private interface a {

        /* renamed from: b6.j$a$a  reason: collision with other inner class name */
        /* compiled from: VideoFrameReleaseHelper */
        public interface C0097a {
            void a(Display display);
        }

        void a(C0097a aVar);

        void unregister();
    }

    /* compiled from: VideoFrameReleaseHelper */
    private static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final WindowManager f5097a;

        private b(WindowManager windowManager) {
            this.f5097a = windowManager;
        }

        public static a b(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new b(windowManager);
            }
            return null;
        }

        public void a(a.C0097a aVar) {
            aVar.a(this.f5097a.getDefaultDisplay());
        }

        public void unregister() {
        }
    }

    /* compiled from: VideoFrameReleaseHelper */
    private static final class c implements a, DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        private final DisplayManager f5098a;

        /* renamed from: b  reason: collision with root package name */
        private a.C0097a f5099b;

        private c(DisplayManager displayManager) {
            this.f5098a = displayManager;
        }

        private Display b() {
            return this.f5098a.getDisplay(0);
        }

        public static a c(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new c(displayManager);
            }
            return null;
        }

        public void a(a.C0097a aVar) {
            this.f5099b = aVar;
            this.f5098a.registerDisplayListener(this, m0.x());
            aVar.a(b());
        }

        public void onDisplayAdded(int i10) {
        }

        public void onDisplayChanged(int i10) {
            a.C0097a aVar = this.f5099b;
            if (aVar != null && i10 == 0) {
                aVar.a(b());
            }
        }

        public void onDisplayRemoved(int i10) {
        }

        public void unregister() {
            this.f5098a.unregisterDisplayListener(this);
            this.f5099b = null;
        }
    }

    /* compiled from: VideoFrameReleaseHelper */
    private static final class d implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: m  reason: collision with root package name */
        private static final d f5100m = new d();

        /* renamed from: h  reason: collision with root package name */
        public volatile long f5101h = -9223372036854775807L;

        /* renamed from: i  reason: collision with root package name */
        private final Handler f5102i;

        /* renamed from: j  reason: collision with root package name */
        private final HandlerThread f5103j;

        /* renamed from: k  reason: collision with root package name */
        private Choreographer f5104k;

        /* renamed from: l  reason: collision with root package name */
        private int f5105l;

        private d() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f5103j = handlerThread;
            handlerThread.start();
            Handler w10 = m0.w(handlerThread.getLooper(), this);
            this.f5102i = w10;
            w10.sendEmptyMessage(0);
        }

        private void b() {
            int i10 = this.f5105l + 1;
            this.f5105l = i10;
            if (i10 == 1) {
                ((Choreographer) a6.a.e(this.f5104k)).postFrameCallback(this);
            }
        }

        private void c() {
            this.f5104k = Choreographer.getInstance();
        }

        public static d d() {
            return f5100m;
        }

        private void f() {
            int i10 = this.f5105l - 1;
            this.f5105l = i10;
            if (i10 == 0) {
                ((Choreographer) a6.a.e(this.f5104k)).removeFrameCallback(this);
                this.f5101h = -9223372036854775807L;
            }
        }

        public void a() {
            this.f5102i.sendEmptyMessage(1);
        }

        public void doFrame(long j10) {
            this.f5101h = j10;
            ((Choreographer) a6.a.e(this.f5104k)).postFrameCallbackDelayed(this, 500);
        }

        public void e() {
            this.f5102i.sendEmptyMessage(2);
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c();
                return true;
            } else if (i10 == 1) {
                b();
                return true;
            } else if (i10 != 2) {
                return false;
            } else {
                f();
                return true;
            }
        }
    }

    public j(Context context) {
        a f10 = f(context);
        this.f5082b = f10;
        this.f5083c = f10 != null ? d.d() : null;
        this.f5090j = -9223372036854775807L;
        this.f5091k = -9223372036854775807L;
        this.f5086f = -1.0f;
        this.f5089i = 1.0f;
    }

    private static boolean c(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    private void d() {
        Surface surface;
        if (m0.f205a >= 30 && (surface = this.f5085e) != null && this.f5088h != 0.0f) {
            this.f5088h = 0.0f;
            q(surface, 0.0f);
        }
    }

    private static long e(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            long j15 = j14;
            j14 = j12 + j14;
            j13 = j15;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    private static a f(Context context) {
        a aVar = null;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (m0.f205a >= 17) {
            aVar = c.c(applicationContext);
        }
        return aVar == null ? b.b(applicationContext) : aVar;
    }

    private void p() {
        this.f5092l = 0;
        this.f5095o = -1;
        this.f5093m = -1;
    }

    private static void q(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e10) {
            p.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }

    /* access modifiers changed from: private */
    public void r(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f5090j = refreshRate;
            this.f5091k = (refreshRate * 80) / 100;
            return;
        }
        p.h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.f5090j = -9223372036854775807L;
        this.f5091k = -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (java.lang.Math.abs(r0 - r8.f5087g) >= (r8.f5081a.e() && (r8.f5081a.d() > 5000000000L ? 1 : (r8.f5081a.d() == 5000000000L ? 0 : -1)) >= 0 ? 0.02f : 1.0f)) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006a, code lost:
        if (r8.f5081a.c() >= 30) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void s() {
        /*
            r8 = this;
            int r0 = a6.m0.f205a
            r1 = 30
            if (r0 < r1) goto L_0x0073
            android.view.Surface r0 = r8.f5085e
            if (r0 != 0) goto L_0x000c
            goto L_0x0073
        L_0x000c:
            b6.e r0 = r8.f5081a
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x001b
            b6.e r0 = r8.f5081a
            float r0 = r0.b()
            goto L_0x001d
        L_0x001b:
            float r0 = r8.f5086f
        L_0x001d:
            float r2 = r8.f5087g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x0024
            return
        L_0x0024:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 0
            r5 = 1
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0061
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0061
            b6.e r1 = r8.f5081a
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x0049
            b6.e r1 = r8.f5081a
            long r1 = r1.d()
            r6 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x0049
            r1 = 1
            goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            if (r1 == 0) goto L_0x0050
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L_0x0052
        L_0x0050:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0052:
            float r2 = r8.f5087g
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x005f
            goto L_0x006c
        L_0x005f:
            r5 = 0
            goto L_0x006c
        L_0x0061:
            if (r6 == 0) goto L_0x0064
            goto L_0x006c
        L_0x0064:
            b6.e r2 = r8.f5081a
            int r2 = r2.c()
            if (r2 < r1) goto L_0x005f
        L_0x006c:
            if (r5 == 0) goto L_0x0073
            r8.f5087g = r0
            r8.t(r4)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.j.s():void");
    }

    private void t(boolean z10) {
        Surface surface;
        if (m0.f205a >= 30 && (surface = this.f5085e) != null) {
            float f10 = 0.0f;
            if (this.f5084d) {
                float f11 = this.f5087g;
                if (f11 != -1.0f) {
                    f10 = this.f5089i * f11;
                }
            }
            if (z10 || this.f5088h != f10) {
                this.f5088h = f10;
                q(surface, f10);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long b(long r11) {
        /*
            r10 = this;
            long r0 = r10.f5095o
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0030
            b6.e r0 = r10.f5081a
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0030
            b6.e r0 = r10.f5081a
            long r0 = r0.a()
            long r2 = r10.f5096p
            long r4 = r10.f5092l
            long r6 = r10.f5095o
            long r4 = r4 - r6
            long r0 = r0 * r4
            float r0 = (float) r0
            float r1 = r10.f5089i
            float r0 = r0 / r1
            long r0 = (long) r0
            long r2 = r2 + r0
            boolean r0 = c(r11, r2)
            if (r0 == 0) goto L_0x002d
            r4 = r2
            goto L_0x0031
        L_0x002d:
            r10.p()
        L_0x0030:
            r4 = r11
        L_0x0031:
            long r11 = r10.f5092l
            r10.f5093m = r11
            r10.f5094n = r4
            b6.j$d r11 = r10.f5083c
            if (r11 == 0) goto L_0x0058
            long r0 = r10.f5090j
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0047
            goto L_0x0058
        L_0x0047:
            long r6 = r11.f5101h
            int r11 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r11 != 0) goto L_0x004e
            return r4
        L_0x004e:
            long r8 = r10.f5090j
            long r11 = e(r4, r6, r8)
            long r0 = r10.f5091k
            long r11 = r11 - r0
            return r11
        L_0x0058:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.j.b(long):long");
    }

    public void g() {
        a aVar = this.f5082b;
        if (aVar != null) {
            aVar.unregister();
            ((d) a6.a.e(this.f5083c)).e();
        }
    }

    public void h() {
        if (this.f5082b != null) {
            ((d) a6.a.e(this.f5083c)).a();
            this.f5082b.a(new i(this));
        }
    }

    public void i(float f10) {
        this.f5086f = f10;
        this.f5081a.g();
        s();
    }

    public void j(long j10) {
        long j11 = this.f5093m;
        if (j11 != -1) {
            this.f5095o = j11;
            this.f5096p = this.f5094n;
        }
        this.f5092l++;
        this.f5081a.f(j10 * 1000);
        s();
    }

    public void k(float f10) {
        this.f5089i = f10;
        p();
        t(false);
    }

    public void l() {
        p();
    }

    public void m() {
        this.f5084d = true;
        p();
        t(false);
    }

    public void n() {
        this.f5084d = false;
        d();
    }

    public void o(Surface surface) {
        if (surface instanceof d) {
            surface = null;
        }
        if (this.f5085e != surface) {
            d();
            this.f5085e = surface;
            t(true);
        }
    }
}
