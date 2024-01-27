package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import m.e;

/* compiled from: ForwardingListener */
public abstract class f0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: h  reason: collision with root package name */
    private final float f1058h;

    /* renamed from: i  reason: collision with root package name */
    private final int f1059i;

    /* renamed from: j  reason: collision with root package name */
    private final int f1060j;

    /* renamed from: k  reason: collision with root package name */
    final View f1061k;

    /* renamed from: l  reason: collision with root package name */
    private Runnable f1062l;

    /* renamed from: m  reason: collision with root package name */
    private Runnable f1063m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f1064n;

    /* renamed from: o  reason: collision with root package name */
    private int f1065o;

    /* renamed from: p  reason: collision with root package name */
    private final int[] f1066p = new int[2];

    /* compiled from: ForwardingListener */
    private class a implements Runnable {
        a() {
        }

        public void run() {
            ViewParent parent = f0.this.f1061k.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* compiled from: ForwardingListener */
    private class b implements Runnable {
        b() {
        }

        public void run() {
            f0.this.e();
        }
    }

    public f0(View view) {
        this.f1061k = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1058h = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1059i = tapTimeout;
        this.f1060j = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f1063m;
        if (runnable != null) {
            this.f1061k.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1062l;
        if (runnable2 != null) {
            this.f1061k.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        d0 d0Var;
        View view = this.f1061k;
        e b10 = b();
        if (b10 == null || !b10.a() || (d0Var = (d0) b10.i()) == null || !d0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(d0Var, obtainNoHistory);
        boolean e10 = d0Var.e(obtainNoHistory, this.f1065o);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        boolean z10 = (actionMasked == 1 || actionMasked == 3) ? false : true;
        if (!e10 || !z10) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1061k
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f1065o
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1058h
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.a()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f1065o = r6
            java.lang.Runnable r6 = r5.f1062l
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.f0$a r6 = new androidx.appcompat.widget.f0$a
            r6.<init>()
            r5.f1062l = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f1062l
            int r1 = r5.f1059i
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1063m
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.f0$b r6 = new androidx.appcompat.widget.f0$b
            r6.<init>()
            r5.f1063m = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f1063m
            int r1 = r5.f1060j
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f0.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1066p;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1066p;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    public abstract e b();

    /* access modifiers changed from: protected */
    public abstract boolean c();

    /* access modifiers changed from: protected */
    public boolean d() {
        e b10 = b();
        if (b10 == null || !b10.a()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        a();
        View view = this.f1061k;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1064n = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f1064n;
        if (z11) {
            z10 = f(motionEvent) || !d();
        } else {
            z10 = g(motionEvent) && c();
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1061k.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1064n = z10;
        if (z10 || z11) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f1064n = false;
        this.f1065o = -1;
        Runnable runnable = this.f1062l;
        if (runnable != null) {
            this.f1061k.removeCallbacks(runnable);
        }
    }
}
