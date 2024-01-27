package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.z;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: FastScroller */
class d extends RecyclerView.m implements RecyclerView.r {
    private static final int[] D = {16842919};
    private static final int[] E = new int[0];
    int A;
    private final Runnable B;
    private final RecyclerView.s C;

    /* renamed from: a  reason: collision with root package name */
    private final int f4253a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4254b;

    /* renamed from: c  reason: collision with root package name */
    final StateListDrawable f4255c;

    /* renamed from: d  reason: collision with root package name */
    final Drawable f4256d;

    /* renamed from: e  reason: collision with root package name */
    private final int f4257e;

    /* renamed from: f  reason: collision with root package name */
    private final int f4258f;

    /* renamed from: g  reason: collision with root package name */
    private final StateListDrawable f4259g;

    /* renamed from: h  reason: collision with root package name */
    private final Drawable f4260h;

    /* renamed from: i  reason: collision with root package name */
    private final int f4261i;

    /* renamed from: j  reason: collision with root package name */
    private final int f4262j;

    /* renamed from: k  reason: collision with root package name */
    int f4263k;

    /* renamed from: l  reason: collision with root package name */
    int f4264l;

    /* renamed from: m  reason: collision with root package name */
    float f4265m;

    /* renamed from: n  reason: collision with root package name */
    int f4266n;

    /* renamed from: o  reason: collision with root package name */
    int f4267o;

    /* renamed from: p  reason: collision with root package name */
    float f4268p;

    /* renamed from: q  reason: collision with root package name */
    private int f4269q = 0;

    /* renamed from: r  reason: collision with root package name */
    private int f4270r = 0;

    /* renamed from: s  reason: collision with root package name */
    private RecyclerView f4271s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f4272t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f4273u = false;

    /* renamed from: v  reason: collision with root package name */
    private int f4274v = 0;

    /* renamed from: w  reason: collision with root package name */
    private int f4275w = 0;

    /* renamed from: x  reason: collision with root package name */
    private final int[] f4276x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    private final int[] f4277y = new int[2];

    /* renamed from: z  reason: collision with root package name */
    final ValueAnimator f4278z;

    /* compiled from: FastScroller */
    class a implements Runnable {
        a() {
        }

        public void run() {
            d.this.o(500);
        }
    }

    /* compiled from: FastScroller */
    class b extends RecyclerView.s {
        b() {
        }
    }

    /* compiled from: FastScroller */
    private class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f4281a = false;

        c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f4281a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f4281a) {
                this.f4281a = false;
            } else if (((Float) d.this.f4278z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.A = 0;
                dVar.w(0);
            } else {
                d dVar2 = d.this;
                dVar2.A = 2;
                dVar2.t();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d  reason: collision with other inner class name */
    /* compiled from: FastScroller */
    private class C0072d implements ValueAnimator.AnimatorUpdateListener {
        C0072d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f4255c.setAlpha(floatValue);
            d.this.f4256d.setAlpha(floatValue);
            d.this.t();
        }
    }

    d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f4278z = ofFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f4255c = stateListDrawable;
        this.f4256d = drawable;
        this.f4259g = stateListDrawable2;
        this.f4260h = drawable2;
        this.f4257e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f4258f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f4261i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f4262j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f4253a = i11;
        this.f4254b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new C0072d());
        h(recyclerView);
    }

    private void i() {
        this.f4271s.removeCallbacks(this.B);
    }

    private void j() {
        this.f4271s.o0(this);
        this.f4271s.p0(this);
        this.f4271s.q0(this.C);
        i();
    }

    private void k(Canvas canvas) {
        int i10 = this.f4270r;
        int i11 = this.f4261i;
        int i12 = i10 - i11;
        int i13 = this.f4267o;
        int i14 = this.f4266n;
        int i15 = i13 - (i14 / 2);
        this.f4259g.setBounds(0, 0, i14, i11);
        this.f4260h.setBounds(0, 0, this.f4269q, this.f4262j);
        canvas.translate(0.0f, (float) i12);
        this.f4260h.draw(canvas);
        canvas.translate((float) i15, 0.0f);
        this.f4259g.draw(canvas);
        canvas.translate((float) (-i15), (float) (-i12));
    }

    private void l(Canvas canvas) {
        int i10 = this.f4269q;
        int i11 = this.f4257e;
        int i12 = i10 - i11;
        int i13 = this.f4264l;
        int i14 = this.f4263k;
        int i15 = i13 - (i14 / 2);
        this.f4255c.setBounds(0, 0, i11, i14);
        this.f4256d.setBounds(0, 0, this.f4258f, this.f4270r);
        if (q()) {
            this.f4256d.draw(canvas);
            canvas.translate((float) this.f4257e, (float) i15);
            canvas.scale(-1.0f, 1.0f);
            this.f4255c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate((float) (-this.f4257e), (float) (-i15));
            return;
        }
        canvas.translate((float) i12, 0.0f);
        this.f4256d.draw(canvas);
        canvas.translate(0.0f, (float) i15);
        this.f4255c.draw(canvas);
        canvas.translate((float) (-i12), (float) (-i15));
    }

    private int[] m() {
        int[] iArr = this.f4277y;
        int i10 = this.f4254b;
        iArr[0] = i10;
        iArr[1] = this.f4269q - i10;
        return iArr;
    }

    private int[] n() {
        int[] iArr = this.f4276x;
        int i10 = this.f4254b;
        iArr[0] = i10;
        iArr[1] = this.f4270r - i10;
        return iArr;
    }

    private void p(float f10) {
        int[] m10 = m();
        float max = Math.max((float) m10[0], Math.min((float) m10[1], f10));
        if (Math.abs(((float) this.f4267o) - max) >= 2.0f) {
            int v10 = v(this.f4268p, max, m10, this.f4271s.computeHorizontalScrollRange(), this.f4271s.computeHorizontalScrollOffset(), this.f4269q);
            if (v10 != 0) {
                this.f4271s.scrollBy(v10, 0);
            }
            this.f4268p = max;
        }
    }

    private boolean q() {
        return z.t(this.f4271s) == 1;
    }

    private void u(int i10) {
        i();
        this.f4271s.postDelayed(this.B, (long) i10);
    }

    private int v(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / ((float) i13)) * ((float) i14));
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    private void x() {
        this.f4271s.c(this);
        this.f4271s.e(this);
        this.f4271s.f(this.C);
    }

    private void z(float f10) {
        int[] n10 = n();
        float max = Math.max((float) n10[0], Math.min((float) n10[1], f10));
        if (Math.abs(((float) this.f4264l) - max) >= 2.0f) {
            int v10 = v(this.f4265m, max, n10, this.f4271s.computeVerticalScrollRange(), this.f4271s.computeVerticalScrollOffset(), this.f4270r);
            if (v10 != 0) {
                this.f4271s.scrollBy(0, v10);
            }
            this.f4265m = max;
        }
    }

    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f4274v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean s10 = s(motionEvent.getX(), motionEvent.getY());
                boolean r10 = r(motionEvent.getX(), motionEvent.getY());
                if (s10 || r10) {
                    if (r10) {
                        this.f4275w = 1;
                        this.f4268p = (float) ((int) motionEvent.getX());
                    } else if (s10) {
                        this.f4275w = 2;
                        this.f4265m = (float) ((int) motionEvent.getY());
                    }
                    w(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f4274v == 2) {
                this.f4265m = 0.0f;
                this.f4268p = 0.0f;
                w(1);
                this.f4275w = 0;
            } else if (motionEvent.getAction() == 2 && this.f4274v == 2) {
                y();
                if (this.f4275w == 1) {
                    p(motionEvent.getX());
                }
                if (this.f4275w == 2) {
                    z(motionEvent.getY());
                }
            }
        }
    }

    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f4274v;
        if (i10 == 1) {
            boolean s10 = s(motionEvent.getX(), motionEvent.getY());
            boolean r10 = r(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!s10 && !r10) {
                return false;
            }
            if (r10) {
                this.f4275w = 1;
                this.f4268p = (float) ((int) motionEvent.getX());
            } else if (s10) {
                this.f4275w = 2;
                this.f4265m = (float) ((int) motionEvent.getY());
            }
            w(2);
        } else if (i10 == 2) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    public void c(boolean z10) {
    }

    public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        if (this.f4269q != this.f4271s.getWidth() || this.f4270r != this.f4271s.getHeight()) {
            this.f4269q = this.f4271s.getWidth();
            this.f4270r = this.f4271s.getHeight();
            w(0);
        } else if (this.A != 0) {
            if (this.f4272t) {
                l(canvas);
            }
            if (this.f4273u) {
                k(canvas);
            }
        }
    }

    public void h(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4271s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                j();
            }
            this.f4271s = recyclerView;
            if (recyclerView != null) {
                x();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void o(int i10) {
        int i11 = this.A;
        if (i11 == 1) {
            this.f4278z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f4278z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f4278z.setDuration((long) i10);
        this.f4278z.start();
    }

    /* access modifiers changed from: package-private */
    public boolean r(float f10, float f11) {
        if (f11 >= ((float) (this.f4270r - this.f4261i))) {
            int i10 = this.f4267o;
            int i11 = this.f4266n;
            return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) (i10 + (i11 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean s(float f10, float f11) {
        if (!q() ? f10 >= ((float) (this.f4269q - this.f4257e)) : f10 <= ((float) (this.f4257e / 2))) {
            int i10 = this.f4264l;
            int i11 = this.f4263k;
            return f11 >= ((float) (i10 - (i11 / 2))) && f11 <= ((float) (i10 + (i11 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    public void t() {
        this.f4271s.invalidate();
    }

    /* access modifiers changed from: package-private */
    public void w(int i10) {
        if (i10 == 2 && this.f4274v != 2) {
            this.f4255c.setState(D);
            i();
        }
        if (i10 == 0) {
            t();
        } else {
            y();
        }
        if (this.f4274v == 2 && i10 != 2) {
            this.f4255c.setState(E);
            u(1200);
        } else if (i10 == 1) {
            u(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f4274v = i10;
    }

    public void y() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 == 3) {
                this.f4278z.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f4278z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f4278z.setDuration(500);
        this.f4278z.setStartDelay(0);
        this.f4278z.start();
    }
}
