package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.b0;
import androidx.core.view.z;
import com.google.android.gms.common.api.Api;

/* compiled from: TooltipCompatHandler */
class x0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: q  reason: collision with root package name */
    private static x0 f1304q;

    /* renamed from: r  reason: collision with root package name */
    private static x0 f1305r;

    /* renamed from: h  reason: collision with root package name */
    private final View f1306h;

    /* renamed from: i  reason: collision with root package name */
    private final CharSequence f1307i;

    /* renamed from: j  reason: collision with root package name */
    private final int f1308j;

    /* renamed from: k  reason: collision with root package name */
    private final Runnable f1309k = new a();

    /* renamed from: l  reason: collision with root package name */
    private final Runnable f1310l = new b();

    /* renamed from: m  reason: collision with root package name */
    private int f1311m;

    /* renamed from: n  reason: collision with root package name */
    private int f1312n;

    /* renamed from: o  reason: collision with root package name */
    private y0 f1313o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f1314p;

    /* compiled from: TooltipCompatHandler */
    class a implements Runnable {
        a() {
        }

        public void run() {
            x0.this.g(false);
        }
    }

    /* compiled from: TooltipCompatHandler */
    class b implements Runnable {
        b() {
        }

        public void run() {
            x0.this.c();
        }
    }

    private x0(View view, CharSequence charSequence) {
        this.f1306h = view;
        this.f1307i = charSequence;
        this.f1308j = b0.d(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void a() {
        this.f1306h.removeCallbacks(this.f1309k);
    }

    private void b() {
        this.f1311m = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f1312n = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    private void d() {
        this.f1306h.postDelayed(this.f1309k, (long) ViewConfiguration.getLongPressTimeout());
    }

    private static void e(x0 x0Var) {
        x0 x0Var2 = f1304q;
        if (x0Var2 != null) {
            x0Var2.a();
        }
        f1304q = x0Var;
        if (x0Var != null) {
            x0Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        x0 x0Var = f1304q;
        if (x0Var != null && x0Var.f1306h == view) {
            e((x0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            x0 x0Var2 = f1305r;
            if (x0Var2 != null && x0Var2.f1306h == view) {
                x0Var2.c();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new x0(view, charSequence);
    }

    private boolean h(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (Math.abs(x10 - this.f1311m) <= this.f1308j && Math.abs(y10 - this.f1312n) <= this.f1308j) {
            return false;
        }
        this.f1311m = x10;
        this.f1312n = y10;
        return true;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (f1305r == this) {
            f1305r = null;
            y0 y0Var = this.f1313o;
            if (y0Var != null) {
                y0Var.c();
                this.f1313o = null;
                b();
                this.f1306h.removeOnAttachStateChangeListener(this);
            }
        }
        if (f1304q == this) {
            e((x0) null);
        }
        this.f1306h.removeCallbacks(this.f1310l);
    }

    /* access modifiers changed from: package-private */
    public void g(boolean z10) {
        long j10;
        int i10;
        long j11;
        if (z.E(this.f1306h)) {
            e((x0) null);
            x0 x0Var = f1305r;
            if (x0Var != null) {
                x0Var.c();
            }
            f1305r = this;
            this.f1314p = z10;
            y0 y0Var = new y0(this.f1306h.getContext());
            this.f1313o = y0Var;
            y0Var.e(this.f1306h, this.f1311m, this.f1312n, this.f1314p, this.f1307i);
            this.f1306h.addOnAttachStateChangeListener(this);
            if (this.f1314p) {
                j10 = 2500;
            } else {
                if ((z.z(this.f1306h) & 1) == 1) {
                    j11 = 3000;
                    i10 = ViewConfiguration.getLongPressTimeout();
                } else {
                    j11 = 15000;
                    i10 = ViewConfiguration.getLongPressTimeout();
                }
                j10 = j11 - ((long) i10);
            }
            this.f1306h.removeCallbacks(this.f1310l);
            this.f1306h.postDelayed(this.f1310l, j10);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1313o != null && this.f1314p) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1306h.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.f1306h.isEnabled() && this.f1313o == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f1311m = view.getWidth() / 2;
        this.f1312n = view.getHeight() / 2;
        g(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
