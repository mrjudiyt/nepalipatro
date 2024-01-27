package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.accessibility.c;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.m;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup implements androidx.core.view.n {
    private static final int[] G0 = {16843830};
    private static final int[] H0 = {16842987};
    static final boolean I0;
    static final boolean J0;
    static final boolean K0;
    static final boolean L0;
    private static final boolean M0;
    private static final boolean N0;
    private static final Class<?>[] O0;
    static final Interpolator P0 = new c();
    boolean A;
    final int[] A0;
    boolean B;
    private final int[] B0;
    private int C;
    final int[] C0;
    boolean D;
    final List<c0> D0;
    boolean E;
    private Runnable E0;
    private boolean F;
    private final m.b F0;
    private int G;
    boolean H;
    private final AccessibilityManager I;
    private List<p> J;
    boolean K;
    boolean L;
    private int M;
    private int N;
    private j O;
    private EdgeEffect P;
    private EdgeEffect Q;
    private EdgeEffect R;
    private EdgeEffect S;
    k T;
    private int U;
    private int V;
    private VelocityTracker W;

    /* renamed from: a0  reason: collision with root package name */
    private int f4003a0;

    /* renamed from: b0  reason: collision with root package name */
    private int f4004b0;

    /* renamed from: c0  reason: collision with root package name */
    private int f4005c0;

    /* renamed from: d0  reason: collision with root package name */
    private int f4006d0;

    /* renamed from: e0  reason: collision with root package name */
    private int f4007e0;

    /* renamed from: f0  reason: collision with root package name */
    private q f4008f0;

    /* renamed from: g0  reason: collision with root package name */
    private final int f4009g0;

    /* renamed from: h  reason: collision with root package name */
    private final w f4010h;

    /* renamed from: h0  reason: collision with root package name */
    private final int f4011h0;

    /* renamed from: i  reason: collision with root package name */
    final u f4012i;

    /* renamed from: i0  reason: collision with root package name */
    private float f4013i0;

    /* renamed from: j  reason: collision with root package name */
    private x f4014j;

    /* renamed from: j0  reason: collision with root package name */
    private float f4015j0;

    /* renamed from: k  reason: collision with root package name */
    a f4016k;

    /* renamed from: k0  reason: collision with root package name */
    private boolean f4017k0;

    /* renamed from: l  reason: collision with root package name */
    b f4018l;

    /* renamed from: l0  reason: collision with root package name */
    final b0 f4019l0;

    /* renamed from: m  reason: collision with root package name */
    final m f4020m;

    /* renamed from: m0  reason: collision with root package name */
    e f4021m0;

    /* renamed from: n  reason: collision with root package name */
    boolean f4022n;

    /* renamed from: n0  reason: collision with root package name */
    e.b f4023n0;

    /* renamed from: o  reason: collision with root package name */
    final Runnable f4024o;

    /* renamed from: o0  reason: collision with root package name */
    final z f4025o0;

    /* renamed from: p  reason: collision with root package name */
    final Rect f4026p;

    /* renamed from: p0  reason: collision with root package name */
    private s f4027p0;

    /* renamed from: q  reason: collision with root package name */
    private final Rect f4028q;

    /* renamed from: q0  reason: collision with root package name */
    private List<s> f4029q0;

    /* renamed from: r  reason: collision with root package name */
    final RectF f4030r;

    /* renamed from: r0  reason: collision with root package name */
    boolean f4031r0;

    /* renamed from: s  reason: collision with root package name */
    g f4032s;

    /* renamed from: s0  reason: collision with root package name */
    boolean f4033s0;

    /* renamed from: t  reason: collision with root package name */
    n f4034t;

    /* renamed from: t0  reason: collision with root package name */
    private k.b f4035t0;

    /* renamed from: u  reason: collision with root package name */
    v f4036u;

    /* renamed from: u0  reason: collision with root package name */
    boolean f4037u0;

    /* renamed from: v  reason: collision with root package name */
    final ArrayList<m> f4038v;

    /* renamed from: v0  reason: collision with root package name */
    i f4039v0;

    /* renamed from: w  reason: collision with root package name */
    private final ArrayList<r> f4040w;

    /* renamed from: w0  reason: collision with root package name */
    private i f4041w0;

    /* renamed from: x  reason: collision with root package name */
    private r f4042x;

    /* renamed from: x0  reason: collision with root package name */
    private final int[] f4043x0;

    /* renamed from: y  reason: collision with root package name */
    boolean f4044y;

    /* renamed from: y0  reason: collision with root package name */
    private androidx.core.view.o f4045y0;

    /* renamed from: z  reason: collision with root package name */
    boolean f4046z;

    /* renamed from: z0  reason: collision with root package name */
    private final int[] f4047z0;

    class a implements Runnable {
        a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.B && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f4044y) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.E) {
                    recyclerView2.D = true;
                } else {
                    recyclerView2.l();
                }
            }
        }
    }

    public static abstract class a0 {
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            k kVar = RecyclerView.this.T;
            if (kVar != null) {
                kVar.p();
            }
            RecyclerView.this.f4037u0 = false;
        }
    }

    class b0 implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        private int f4050h;

        /* renamed from: i  reason: collision with root package name */
        private int f4051i;

        /* renamed from: j  reason: collision with root package name */
        OverScroller f4052j;

        /* renamed from: k  reason: collision with root package name */
        Interpolator f4053k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f4054l = false;

        /* renamed from: m  reason: collision with root package name */
        private boolean f4055m = false;

        b0() {
            Interpolator interpolator = RecyclerView.P0;
            this.f4053k = interpolator;
            this.f4052j = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i10, int i11, int i12, int i13) {
            int i14;
            int abs = Math.abs(i10);
            int abs2 = Math.abs(i11);
            boolean z10 = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i12 * i12) + (i13 * i13)));
            int sqrt2 = (int) Math.sqrt((double) ((i10 * i10) + (i11 * i11)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i15 = width / 2;
            float f10 = (float) width;
            float f11 = (float) i15;
            float c10 = f11 + (c(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f10)) * f11);
            if (sqrt > 0) {
                i14 = Math.round(Math.abs(c10 / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z10) {
                    abs = abs2;
                }
                i14 = (int) (((((float) abs) / f10) + 1.0f) * 300.0f);
            }
            return Math.min(i14, 2000);
        }

        private void b() {
            this.f4055m = false;
            this.f4054l = true;
        }

        private float c(float f10) {
            return (float) Math.sin((double) ((f10 - 0.5f) * 0.47123894f));
        }

        private void d() {
            this.f4054l = false;
            if (this.f4055m) {
                f();
            }
        }

        public void e(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f4051i = 0;
            this.f4050h = 0;
            this.f4052j.fling(0, 0, i10, i11, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            f();
        }

        /* access modifiers changed from: package-private */
        public void f() {
            if (this.f4054l) {
                this.f4055m = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            androidx.core.view.z.N(RecyclerView.this, this);
        }

        public void g(int i10, int i11, int i12, Interpolator interpolator) {
            if (this.f4053k != interpolator) {
                this.f4053k = interpolator;
                this.f4052j = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            RecyclerView.this.setScrollState(2);
            this.f4051i = 0;
            this.f4050h = 0;
            this.f4052j.startScroll(0, 0, i10, i11, i12);
            if (Build.VERSION.SDK_INT < 23) {
                this.f4052j.computeScrollOffset();
            }
            f();
        }

        public void h(int i10, int i11, Interpolator interpolator) {
            int a10 = a(i10, i11, 0, 0);
            if (interpolator == null) {
                interpolator = RecyclerView.P0;
            }
            g(i10, i11, a10, interpolator);
        }

        public void i() {
            RecyclerView.this.removeCallbacks(this);
            this.f4052j.abortAnimation();
        }

        public void run() {
            if (RecyclerView.this.f4034t == null) {
                i();
                return;
            }
            b();
            RecyclerView.this.l();
            OverScroller overScroller = this.f4052j;
            y yVar = RecyclerView.this.f4034t.f4096g;
            if (overScroller.computeScrollOffset()) {
                int[] iArr = RecyclerView.this.A0;
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i10 = currX - this.f4050h;
                int i11 = currY - this.f4051i;
                this.f4050h = currX;
                this.f4051i = currY;
                if (RecyclerView.this.r(i10, i11, iArr, (int[]) null, 1)) {
                    i10 -= iArr[0];
                    i11 -= iArr[1];
                }
                RecyclerView recyclerView = RecyclerView.this;
                g gVar = recyclerView.f4032s;
                if (!recyclerView.f4038v.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.k(i10, i11);
                }
                boolean s10 = RecyclerView.this.s(0, 0, 0, 0, (int[]) null, 1);
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = (i10 == 0 && i11 == 0) || (i10 != 0 && RecyclerView.this.f4034t.b() && i10 == 0) || (i11 != 0 && RecyclerView.this.f4034t.c() && i11 == 0);
                if (overScroller.isFinished() || (!z10 && !RecyclerView.this.K(1))) {
                    RecyclerView.this.setScrollState(0);
                    if (RecyclerView.L0) {
                        RecyclerView.this.f4023n0.a();
                    }
                    RecyclerView.this.C0(1);
                } else {
                    f();
                    RecyclerView recyclerView2 = RecyclerView.this;
                    e eVar = recyclerView2.f4021m0;
                    if (eVar != null) {
                        eVar.f(recyclerView2, i10, i11);
                    }
                }
            }
            d();
        }
    }

    static class c implements Interpolator {
        c() {
        }

        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public static abstract class c0 {

        /* renamed from: s  reason: collision with root package name */
        private static final List<Object> f4057s = Collections.emptyList();

        /* renamed from: a  reason: collision with root package name */
        public final View f4058a;

        /* renamed from: b  reason: collision with root package name */
        WeakReference<RecyclerView> f4059b;

        /* renamed from: c  reason: collision with root package name */
        int f4060c;

        /* renamed from: d  reason: collision with root package name */
        int f4061d;

        /* renamed from: e  reason: collision with root package name */
        long f4062e;

        /* renamed from: f  reason: collision with root package name */
        int f4063f;

        /* renamed from: g  reason: collision with root package name */
        int f4064g;

        /* renamed from: h  reason: collision with root package name */
        c0 f4065h;

        /* renamed from: i  reason: collision with root package name */
        c0 f4066i;

        /* renamed from: j  reason: collision with root package name */
        int f4067j;

        /* renamed from: k  reason: collision with root package name */
        List<Object> f4068k;

        /* renamed from: l  reason: collision with root package name */
        List<Object> f4069l;

        /* renamed from: m  reason: collision with root package name */
        private int f4070m;

        /* renamed from: n  reason: collision with root package name */
        u f4071n;

        /* renamed from: o  reason: collision with root package name */
        boolean f4072o;

        /* renamed from: p  reason: collision with root package name */
        private int f4073p;

        /* renamed from: q  reason: collision with root package name */
        int f4074q;

        /* renamed from: r  reason: collision with root package name */
        RecyclerView f4075r;

        private void f() {
            if (this.f4068k == null) {
                ArrayList arrayList = new ArrayList();
                this.f4068k = arrayList;
                this.f4069l = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: package-private */
        public void A(int i10, int i11) {
            this.f4067j = (i10 & i11) | (this.f4067j & (~i11));
        }

        public final void B(boolean z10) {
            int i10 = this.f4070m;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.f4070m = i11;
            if (i11 < 0) {
                this.f4070m = 0;
                StringBuilder sb = new StringBuilder();
                sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                sb.append(this);
            } else if (!z10 && i11 == 1) {
                this.f4067j |= 16;
            } else if (z10 && i11 == 0) {
                this.f4067j &= -17;
            }
        }

        /* access modifiers changed from: package-private */
        public void C(u uVar, boolean z10) {
            this.f4071n = uVar;
            this.f4072o = z10;
        }

        /* access modifiers changed from: package-private */
        public boolean D() {
            return (this.f4067j & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean E() {
            return (this.f4067j & 128) != 0;
        }

        /* access modifiers changed from: package-private */
        public void F() {
            this.f4071n.B(this);
        }

        /* access modifiers changed from: package-private */
        public boolean G() {
            return (this.f4067j & 32) != 0;
        }

        /* access modifiers changed from: package-private */
        public void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f4067j) == 0) {
                f();
                this.f4068k.add(obj);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i10) {
            this.f4067j = i10 | this.f4067j;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            List<Object> list = this.f4068k;
            if (list != null) {
                list.clear();
            }
            this.f4067j &= -1025;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f4067j &= -33;
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f4067j &= -257;
        }

        /* access modifiers changed from: package-private */
        public boolean g() {
            return (this.f4067j & 16) == 0 && androidx.core.view.z.C(this.f4058a);
        }

        /* access modifiers changed from: package-private */
        public void h(int i10, int i11, boolean z10) {
            b(8);
            x(i11, z10);
            this.f4060c = i10;
        }

        public final int i() {
            RecyclerView recyclerView = this.f4075r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.F(this);
        }

        public final int j() {
            return this.f4063f;
        }

        public final int k() {
            int i10 = this.f4064g;
            return i10 == -1 ? this.f4060c : i10;
        }

        public final int l() {
            return this.f4061d;
        }

        /* access modifiers changed from: package-private */
        public List<Object> m() {
            if ((this.f4067j & 1024) != 0) {
                return f4057s;
            }
            List<Object> list = this.f4068k;
            if (list == null || list.size() == 0) {
                return f4057s;
            }
            return this.f4069l;
        }

        /* access modifiers changed from: package-private */
        public boolean n(int i10) {
            return (i10 & this.f4067j) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean o() {
            return (this.f4067j & 512) != 0 || q();
        }

        /* access modifiers changed from: package-private */
        public boolean p() {
            return (this.f4067j & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean q() {
            return (this.f4067j & 4) != 0;
        }

        public final boolean r() {
            return (this.f4067j & 16) == 0 && !androidx.core.view.z.C(this.f4058a);
        }

        /* access modifiers changed from: package-private */
        public boolean s() {
            return (this.f4067j & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean t() {
            return this.f4071n != null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f4060c + " id=" + this.f4062e + ", oldPos=" + this.f4061d + ", pLpos:" + this.f4064g);
            if (t()) {
                sb.append(" scrap ");
                sb.append(this.f4072o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (q()) {
                sb.append(" invalid");
            }
            if (!p()) {
                sb.append(" unbound");
            }
            if (w()) {
                sb.append(" update");
            }
            if (s()) {
                sb.append(" removed");
            }
            if (E()) {
                sb.append(" ignored");
            }
            if (u()) {
                sb.append(" tmpDetached");
            }
            if (!r()) {
                sb.append(" not recyclable(" + this.f4070m + ")");
            }
            if (o()) {
                sb.append(" undefined adapter position");
            }
            if (this.f4058a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public boolean u() {
            return (this.f4067j & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean v() {
            return (this.f4067j & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean w() {
            return (this.f4067j & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public void x(int i10, boolean z10) {
            if (this.f4061d == -1) {
                this.f4061d = this.f4060c;
            }
            if (this.f4064g == -1) {
                this.f4064g = this.f4060c;
            }
            if (z10) {
                this.f4064g += i10;
            }
            this.f4060c += i10;
            if (this.f4058a.getLayoutParams() != null) {
                ((o) this.f4058a.getLayoutParams()).f4115c = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void y(RecyclerView recyclerView) {
            recyclerView.v0(this, this.f4073p);
            this.f4073p = 0;
        }

        /* access modifiers changed from: package-private */
        public void z() {
            this.f4067j = 0;
            this.f4060c = -1;
            this.f4061d = -1;
            this.f4062e = -1;
            this.f4064g = -1;
            this.f4070m = 0;
            this.f4065h = null;
            this.f4066i = null;
            c();
            this.f4073p = 0;
            this.f4074q = -1;
            RecyclerView.j(this);
        }
    }

    class d implements m.b {
        d() {
        }
    }

    class e implements b.C0070b {
        e() {
        }

        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        public int b() {
            return RecyclerView.this.getChildCount();
        }

        public void c() {
            int b10 = b();
            for (int i10 = 0; i10 < b10; i10++) {
                View a10 = a(i10);
                RecyclerView.this.o(a10);
                a10.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        public int d(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        public c0 e(View view) {
            return RecyclerView.H(view);
        }

        public void f(int i10) {
            c0 H;
            View a10 = a(i10);
            if (!(a10 == null || (H = RecyclerView.H(a10)) == null)) {
                if (!H.u() || H.E()) {
                    H.b(UserVerificationMethods.USER_VERIFY_HANDPRINT);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + H + RecyclerView.this.B());
                }
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        public void g(View view) {
            c0 H = RecyclerView.H(view);
            if (H != null) {
                H.y(RecyclerView.this);
            }
        }

        public void h(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.o(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }
    }

    class f implements a.C0069a {
        f() {
        }

        public void a(int i10, int i11) {
            RecyclerView.this.Y(i10, i11);
            RecyclerView.this.f4031r0 = true;
        }

        public void b(a.b bVar) {
            i(bVar);
        }

        public void c(int i10, int i11, Object obj) {
            RecyclerView.this.F0(i10, i11, obj);
            RecyclerView.this.f4033s0 = true;
        }

        public void d(a.b bVar) {
            i(bVar);
        }

        public c0 e(int i10) {
            c0 D = RecyclerView.this.D(i10, true);
            if (D != null && !RecyclerView.this.f4018l.i(D.f4058a)) {
                return D;
            }
            return null;
        }

        public void f(int i10, int i11) {
            RecyclerView.this.Z(i10, i11, false);
            RecyclerView.this.f4031r0 = true;
        }

        public void g(int i10, int i11) {
            RecyclerView.this.X(i10, i11);
            RecyclerView.this.f4031r0 = true;
        }

        public void h(int i10, int i11) {
            RecyclerView.this.Z(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f4031r0 = true;
            recyclerView.f4025o0.f4136d += i11;
        }

        /* access modifiers changed from: package-private */
        public void i(a.b bVar) {
            int i10 = bVar.f4194a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f4034t.g0(recyclerView, bVar.f4195b, bVar.f4197d);
            } else if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f4034t.j0(recyclerView2, bVar.f4195b, bVar.f4197d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f4034t.l0(recyclerView3, bVar.f4195b, bVar.f4197d, bVar.f4196c);
            } else if (i10 == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f4034t.i0(recyclerView4, bVar.f4195b, bVar.f4197d, 1);
            }
        }
    }

    public static abstract class g<VH extends c0> {
    }

    public static abstract class h {
    }

    public interface i {
        int a(int i10, int i11);
    }

    public static class j {
        /* access modifiers changed from: protected */
        public EdgeEffect a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class k {

        /* renamed from: a  reason: collision with root package name */
        private b f4079a = null;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<a> f4080b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        private long f4081c = 120;

        /* renamed from: d  reason: collision with root package name */
        private long f4082d = 120;

        /* renamed from: e  reason: collision with root package name */
        private long f4083e = 250;

        /* renamed from: f  reason: collision with root package name */
        private long f4084f = 250;

        public interface a {
            void a();
        }

        interface b {
            void a(c0 c0Var);
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f4085a;

            /* renamed from: b  reason: collision with root package name */
            public int f4086b;

            /* renamed from: c  reason: collision with root package name */
            public int f4087c;

            /* renamed from: d  reason: collision with root package name */
            public int f4088d;

            public c a(c0 c0Var) {
                return b(c0Var, 0);
            }

            public c b(c0 c0Var, int i10) {
                View view = c0Var.f4058a;
                this.f4085a = view.getLeft();
                this.f4086b = view.getTop();
                this.f4087c = view.getRight();
                this.f4088d = view.getBottom();
                return this;
            }
        }

        static int a(c0 c0Var) {
            int i10 = c0Var.f4067j & 14;
            if (c0Var.q()) {
                return 4;
            }
            if ((i10 & 4) != 0) {
                return i10;
            }
            int l10 = c0Var.l();
            int i11 = c0Var.i();
            return (l10 == -1 || i11 == -1 || l10 == i11) ? i10 : i10 | 2048;
        }

        public abstract boolean b(c0 c0Var);

        public boolean c(c0 c0Var, List<Object> list) {
            return b(c0Var);
        }

        public final void d(c0 c0Var) {
            n(c0Var);
            b bVar = this.f4079a;
            if (bVar != null) {
                bVar.a(c0Var);
            }
        }

        public final void e() {
            int size = this.f4080b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f4080b.get(i10).a();
            }
            this.f4080b.clear();
        }

        public abstract void f(c0 c0Var);

        public abstract void g();

        public long h() {
            return this.f4081c;
        }

        public long i() {
            return this.f4084f;
        }

        public long j() {
            return this.f4083e;
        }

        public long k() {
            return this.f4082d;
        }

        public abstract boolean l();

        public c m() {
            return new c();
        }

        public void n(c0 c0Var) {
        }

        public c o(z zVar, c0 c0Var, int i10, List<Object> list) {
            return m().a(c0Var);
        }

        public abstract void p();

        /* access modifiers changed from: package-private */
        public void q(b bVar) {
            this.f4079a = bVar;
        }
    }

    private class l implements k.b {
        l() {
        }

        public void a(c0 c0Var) {
            c0Var.B(true);
            if (c0Var.f4065h != null && c0Var.f4066i == null) {
                c0Var.f4065h = null;
            }
            c0Var.f4066i = null;
            if (!c0Var.D() && !RecyclerView.this.n0(c0Var.f4058a) && c0Var.u()) {
                RecyclerView.this.removeDetachedView(c0Var.f4058a, false);
            }
        }
    }

    public static abstract class m {
        @Deprecated
        public void d(Canvas canvas, RecyclerView recyclerView) {
        }

        public void e(Canvas canvas, RecyclerView recyclerView, z zVar) {
            d(canvas, recyclerView);
        }

        @Deprecated
        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, z zVar) {
            f(canvas, recyclerView);
        }
    }

    public static abstract class n {

        /* renamed from: a  reason: collision with root package name */
        b f4090a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView f4091b;

        /* renamed from: c  reason: collision with root package name */
        private final l.b f4092c;

        /* renamed from: d  reason: collision with root package name */
        private final l.b f4093d;

        /* renamed from: e  reason: collision with root package name */
        l f4094e;

        /* renamed from: f  reason: collision with root package name */
        l f4095f;

        /* renamed from: g  reason: collision with root package name */
        y f4096g;

        /* renamed from: h  reason: collision with root package name */
        boolean f4097h = false;

        /* renamed from: i  reason: collision with root package name */
        boolean f4098i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f4099j = false;

        /* renamed from: k  reason: collision with root package name */
        private boolean f4100k = true;

        /* renamed from: l  reason: collision with root package name */
        private boolean f4101l = true;

        /* renamed from: m  reason: collision with root package name */
        int f4102m;

        /* renamed from: n  reason: collision with root package name */
        private int f4103n;

        /* renamed from: o  reason: collision with root package name */
        private int f4104o;

        /* renamed from: p  reason: collision with root package name */
        private int f4105p;

        /* renamed from: q  reason: collision with root package name */
        private int f4106q;

        class a implements l.b {
            a() {
            }

            public View a(int i10) {
                return n.this.s(i10);
            }

            public int b(View view) {
                return n.this.y(view) - ((o) view.getLayoutParams()).leftMargin;
            }

            public int c() {
                return n.this.F();
            }

            public int d() {
                return n.this.O() - n.this.G();
            }

            public int e(View view) {
                return n.this.z(view) + ((o) view.getLayoutParams()).rightMargin;
            }
        }

        class b implements l.b {
            b() {
            }

            public View a(int i10) {
                return n.this.s(i10);
            }

            public int b(View view) {
                return n.this.A(view) - ((o) view.getLayoutParams()).topMargin;
            }

            public int c() {
                return n.this.H();
            }

            public int d() {
                return n.this.B() - n.this.E();
            }

            public int e(View view) {
                return n.this.w(view) + ((o) view.getLayoutParams()).bottomMargin;
            }
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f4109a;

            /* renamed from: b  reason: collision with root package name */
            public int f4110b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f4111c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f4112d;
        }

        public n() {
            a aVar = new a();
            this.f4092c = aVar;
            b bVar = new b();
            this.f4093d = bVar;
            this.f4094e = new l(aVar);
            this.f4095f = new l(bVar);
        }

        public static c J(Context context, AttributeSet attributeSet, int i10, int i11) {
            c cVar = new c();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z0.b.f13109h, i10, i11);
            cVar.f4109a = obtainStyledAttributes.getInt(z0.b.f13110i, 1);
            cVar.f4110b = obtainStyledAttributes.getInt(z0.b.f13119r, 1);
            cVar.f4111c = obtainStyledAttributes.getBoolean(z0.b.f13118q, false);
            cVar.f4112d = obtainStyledAttributes.getBoolean(z0.b.f13120s, false);
            obtainStyledAttributes.recycle();
            return cVar;
        }

        private boolean R(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int F = F();
            int H = H();
            int O = O() - G();
            int B = B() - E();
            Rect rect = this.f4091b.f4026p;
            x(focusedChild, rect);
            if (rect.left - i10 >= O || rect.right - i10 <= F || rect.top - i11 >= B || rect.bottom - i11 <= H) {
                return false;
            }
            return true;
        }

        public static int e(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i11, i12) : size;
            }
            return Math.min(size, Math.max(i11, i12));
        }

        private int[] u(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            int[] iArr = new int[2];
            int F = F();
            int H = H();
            int O = O() - G();
            int B = B() - E();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i10 = left - F;
            int min = Math.min(0, i10);
            int i11 = top - H;
            int min2 = Math.min(0, i11);
            int i12 = width - O;
            int max = Math.max(0, i12);
            int max2 = Math.max(0, height - B);
            if (C() != 1) {
                if (min == 0) {
                    min = Math.min(i10, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i12);
            }
            if (min2 == 0) {
                min2 = Math.min(i11, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public int A(View view) {
            return view.getTop() - N(view);
        }

        public void A0(int i10) {
            if (s(i10) != null) {
                this.f4090a.k(i10);
            }
        }

        public int B() {
            return this.f4106q;
        }

        public boolean B0(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return C0(recyclerView, view, rect, z10, false);
        }

        public int C() {
            return androidx.core.view.z.t(this.f4091b);
        }

        public boolean C0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] u10 = u(recyclerView, view, rect, z10);
            int i10 = u10[0];
            int i11 = u10[1];
            if ((z11 && !R(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.x0(i10, i11);
            }
            return true;
        }

        public int D(View view) {
            return ((o) view.getLayoutParams()).f4114b.left;
        }

        public void D0() {
            RecyclerView recyclerView = this.f4091b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int E() {
            RecyclerView recyclerView = this.f4091b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public void E0() {
            this.f4097h = true;
        }

        public int F() {
            RecyclerView recyclerView = this.f4091b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public void F0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f4091b = null;
                this.f4090a = null;
                this.f4105p = 0;
                this.f4106q = 0;
            } else {
                this.f4091b = recyclerView;
                this.f4090a = recyclerView.f4018l;
                this.f4105p = recyclerView.getWidth();
                this.f4106q = recyclerView.getHeight();
            }
            this.f4103n = 1073741824;
            this.f4104o = 1073741824;
        }

        public int G() {
            RecyclerView recyclerView = this.f4091b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public void G0() {
        }

        public int H() {
            RecyclerView recyclerView = this.f4091b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public boolean H0() {
            return false;
        }

        public int I(View view) {
            return ((o) view.getLayoutParams()).a();
        }

        public int K(View view) {
            return ((o) view.getLayoutParams()).f4114b.right;
        }

        public int L(u uVar, z zVar) {
            RecyclerView recyclerView = this.f4091b;
            if (recyclerView == null) {
                return 1;
            }
            g gVar = recyclerView.f4032s;
            return 1;
        }

        public int M(u uVar, z zVar) {
            return 0;
        }

        public int N(View view) {
            return ((o) view.getLayoutParams()).f4114b.top;
        }

        public int O() {
            return this.f4105p;
        }

        public boolean P() {
            return this.f4098i;
        }

        public boolean Q() {
            return this.f4099j;
        }

        public boolean S(u uVar, z zVar) {
            return false;
        }

        public boolean T() {
            return false;
        }

        public void U(g gVar, g gVar2) {
        }

        public boolean V(RecyclerView recyclerView, ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        public void W(RecyclerView recyclerView) {
        }

        @Deprecated
        public void X(RecyclerView recyclerView) {
        }

        public void Y(RecyclerView recyclerView, u uVar) {
            X(recyclerView);
        }

        public void Z(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4091b;
            a0(recyclerView.f4012i, recyclerView.f4025o0, accessibilityEvent);
        }

        public void a(String str) {
            RecyclerView recyclerView = this.f4091b;
            if (recyclerView != null) {
                recyclerView.g(str);
            }
        }

        public void a0(u uVar, z zVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4091b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z10 = true;
                if (!recyclerView.canScrollVertically(1) && !this.f4091b.canScrollVertically(-1) && !this.f4091b.canScrollHorizontally(-1) && !this.f4091b.canScrollHorizontally(1)) {
                    z10 = false;
                }
                accessibilityEvent.setScrollable(z10);
                g gVar = this.f4091b.f4032s;
            }
        }

        public boolean b() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public void b0(androidx.core.view.accessibility.c cVar) {
            RecyclerView recyclerView = this.f4091b;
            c0(recyclerView.f4012i, recyclerView.f4025o0, cVar);
        }

        public boolean c() {
            return false;
        }

        public void c0(u uVar, z zVar, androidx.core.view.accessibility.c cVar) {
            if (this.f4091b.canScrollVertically(-1) || this.f4091b.canScrollHorizontally(-1)) {
                cVar.a(8192);
                cVar.d0(true);
            }
            if (this.f4091b.canScrollVertically(1) || this.f4091b.canScrollHorizontally(1)) {
                cVar.a(4096);
                cVar.d0(true);
            }
            cVar.Y(c.f.a(L(uVar, zVar), v(uVar, zVar), S(uVar, zVar), M(uVar, zVar)));
        }

        public boolean d(o oVar) {
            return oVar != null;
        }

        /* access modifiers changed from: package-private */
        public void d0(View view, androidx.core.view.accessibility.c cVar) {
            c0 H = RecyclerView.H(view);
            if (H != null && !H.s() && !this.f4090a.i(H.f4058a)) {
                RecyclerView recyclerView = this.f4091b;
                e0(recyclerView.f4012i, recyclerView.f4025o0, view, cVar);
            }
        }

        public void e0(u uVar, z zVar, View view, androidx.core.view.accessibility.c cVar) {
            cVar.Z(c.g.a(c() ? I(view) : 0, 1, b() ? I(view) : 0, 1, false, false));
        }

        public int f(z zVar) {
            return 0;
        }

        public View f0(View view, int i10) {
            return null;
        }

        public int g(z zVar) {
            return 0;
        }

        public void g0(RecyclerView recyclerView, int i10, int i11) {
        }

        public int h(z zVar) {
            return 0;
        }

        public void h0(RecyclerView recyclerView) {
        }

        public int i(z zVar) {
            return 0;
        }

        public void i0(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public int j(z zVar) {
            return 0;
        }

        public void j0(RecyclerView recyclerView, int i10, int i11) {
        }

        public int k(z zVar) {
            return 0;
        }

        public void k0(RecyclerView recyclerView, int i10, int i11) {
        }

        /* access modifiers changed from: package-private */
        public void l(RecyclerView recyclerView) {
            this.f4098i = true;
            W(recyclerView);
        }

        public void l0(RecyclerView recyclerView, int i10, int i11, Object obj) {
            k0(recyclerView, i10, i11);
        }

        /* access modifiers changed from: package-private */
        public void m(RecyclerView recyclerView, u uVar) {
            this.f4098i = false;
            Y(recyclerView, uVar);
        }

        public void m0(u uVar, z zVar, int i10, int i11) {
            this.f4091b.n(i10, i11);
        }

        public abstract o n();

        @Deprecated
        public boolean n0(RecyclerView recyclerView, View view, View view2) {
            return T() || recyclerView.T();
        }

        public o o(Context context, AttributeSet attributeSet) {
            return new o(context, attributeSet);
        }

        public boolean o0(RecyclerView recyclerView, z zVar, View view, View view2) {
            return n0(recyclerView, view, view2);
        }

        public o p(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof o) {
                return new o((o) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new o((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new o(layoutParams);
        }

        public void p0(Parcelable parcelable) {
        }

        public int q() {
            return -1;
        }

        public Parcelable q0() {
            return null;
        }

        public int r(View view) {
            return ((o) view.getLayoutParams()).f4114b.bottom;
        }

        public void r0(int i10) {
        }

        public View s(int i10) {
            b bVar = this.f4090a;
            if (bVar != null) {
                return bVar.c(i10);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public boolean s0(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f4091b;
            return t0(recyclerView.f4012i, recyclerView.f4025o0, i10, bundle);
        }

        public int t() {
            b bVar = this.f4090a;
            if (bVar != null) {
                return bVar.d();
            }
            return 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0070 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean t0(androidx.recyclerview.widget.RecyclerView.u r2, androidx.recyclerview.widget.RecyclerView.z r3, int r4, android.os.Bundle r5) {
            /*
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r2 = r1.f4091b
                r3 = 0
                if (r2 != 0) goto L_0x0006
                return r3
            L_0x0006:
                r5 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r4 == r5) goto L_0x0042
                r5 = 8192(0x2000, float:1.14794E-41)
                if (r4 == r5) goto L_0x0012
                r2 = 0
            L_0x0010:
                r4 = 0
                goto L_0x006e
            L_0x0012:
                r4 = -1
                boolean r2 = r2.canScrollVertically(r4)
                if (r2 == 0) goto L_0x0029
                int r2 = r1.B()
                int r5 = r1.H()
                int r2 = r2 - r5
                int r5 = r1.E()
                int r2 = r2 - r5
                int r2 = -r2
                goto L_0x002a
            L_0x0029:
                r2 = 0
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r5 = r1.f4091b
                boolean r4 = r5.canScrollHorizontally(r4)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.O()
                int r5 = r1.F()
                int r4 = r4 - r5
                int r5 = r1.G()
                int r4 = r4 - r5
                int r4 = -r4
                goto L_0x006e
            L_0x0042:
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 == 0) goto L_0x0057
                int r2 = r1.B()
                int r4 = r1.H()
                int r2 = r2 - r4
                int r4 = r1.E()
                int r2 = r2 - r4
                goto L_0x0058
            L_0x0057:
                r2 = 0
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r4 = r1.f4091b
                boolean r4 = r4.canScrollHorizontally(r0)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.O()
                int r5 = r1.F()
                int r4 = r4 - r5
                int r5 = r1.G()
                int r4 = r4 - r5
            L_0x006e:
                if (r2 != 0) goto L_0x0073
                if (r4 != 0) goto L_0x0073
                return r3
            L_0x0073:
                androidx.recyclerview.widget.RecyclerView r3 = r1.f4091b
                r3.x0(r4, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.n.t0(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z, int, android.os.Bundle):boolean");
        }

        /* access modifiers changed from: package-private */
        public boolean u0(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f4091b;
            return v0(recyclerView.f4012i, recyclerView.f4025o0, view, i10, bundle);
        }

        public int v(u uVar, z zVar) {
            RecyclerView recyclerView = this.f4091b;
            if (recyclerView == null) {
                return 1;
            }
            g gVar = recyclerView.f4032s;
            return 1;
        }

        public boolean v0(u uVar, z zVar, View view, int i10, Bundle bundle) {
            return false;
        }

        public int w(View view) {
            return view.getBottom() + r(view);
        }

        public void w0(u uVar) {
            for (int t10 = t() - 1; t10 >= 0; t10--) {
                if (!RecyclerView.H(s(t10)).E()) {
                    y0(t10, uVar);
                }
            }
        }

        public void x(View view, Rect rect) {
            RecyclerView.I(view, rect);
        }

        /* access modifiers changed from: package-private */
        public void x0(u uVar) {
            int h10 = uVar.h();
            for (int i10 = h10 - 1; i10 >= 0; i10--) {
                View j10 = uVar.j(i10);
                c0 H = RecyclerView.H(j10);
                if (!H.E()) {
                    H.B(false);
                    if (H.u()) {
                        this.f4091b.removeDetachedView(j10, false);
                    }
                    k kVar = this.f4091b.T;
                    if (kVar != null) {
                        kVar.f(H);
                    }
                    H.B(true);
                    uVar.q(j10);
                }
            }
            uVar.c();
            if (h10 > 0) {
                this.f4091b.invalidate();
            }
        }

        public int y(View view) {
            return view.getLeft() - D(view);
        }

        public void y0(int i10, u uVar) {
            View s10 = s(i10);
            A0(i10);
            uVar.t(s10);
        }

        public int z(View view) {
            return view.getRight() + K(view);
        }

        public boolean z0(Runnable runnable) {
            RecyclerView recyclerView = this.f4091b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }
    }

    public interface p {
        void a(View view);
    }

    public static abstract class q {
    }

    public interface r {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z10);
    }

    public static abstract class s {
        public void a(RecyclerView recyclerView, int i10) {
        }
    }

    public static class t {

        /* renamed from: a  reason: collision with root package name */
        SparseArray<a> f4117a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        private int f4118b = 0;

        static class a {

            /* renamed from: a  reason: collision with root package name */
            final ArrayList<c0> f4119a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            int f4120b = 5;

            /* renamed from: c  reason: collision with root package name */
            long f4121c = 0;

            /* renamed from: d  reason: collision with root package name */
            long f4122d = 0;

            a() {
            }
        }

        private a c(int i10) {
            a aVar = this.f4117a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f4117a.put(i10, aVar2);
            return aVar2;
        }

        public void a() {
            for (int i10 = 0; i10 < this.f4117a.size(); i10++) {
                this.f4117a.valueAt(i10).f4119a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f4118b--;
        }

        /* access modifiers changed from: package-private */
        public void d(g gVar, g gVar2, boolean z10) {
            if (!z10 && this.f4118b == 0) {
                a();
            }
        }

        public void e(c0 c0Var) {
            int j10 = c0Var.j();
            ArrayList<c0> arrayList = c(j10).f4119a;
            if (this.f4117a.get(j10).f4120b > arrayList.size()) {
                c0Var.z();
                arrayList.add(c0Var);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean f(int i10, long j10, long j11) {
            long j12 = c(i10).f4122d;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    public final class u {

        /* renamed from: a  reason: collision with root package name */
        final ArrayList<c0> f4123a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList<c0> f4124b = null;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<c0> f4125c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        private final List<c0> f4126d;

        /* renamed from: e  reason: collision with root package name */
        private int f4127e;

        /* renamed from: f  reason: collision with root package name */
        int f4128f;

        /* renamed from: g  reason: collision with root package name */
        t f4129g;

        public u() {
            ArrayList<c0> arrayList = new ArrayList<>();
            this.f4123a = arrayList;
            this.f4126d = Collections.unmodifiableList(arrayList);
            this.f4127e = 2;
            this.f4128f = 2;
        }

        private boolean z(c0 c0Var, int i10, int i11, long j10) {
            c0Var.f4075r = RecyclerView.this;
            int j11 = c0Var.j();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j10 != Long.MAX_VALUE && !this.f4129g.f(j11, nanoTime, j10)) {
                return false;
            }
            g gVar = RecyclerView.this.f4032s;
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00a5 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x011d  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x012b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.c0 A(int r12, boolean r13, long r14) {
            /*
                r11 = this;
                if (r12 < 0) goto L_0x014e
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r0 = r0.f4025o0
                int r0 = r0.a()
                if (r12 >= r0) goto L_0x014e
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r0 = r0.f4025o0
                boolean r0 = r0.b()
                r1 = 1
                r2 = 0
                r3 = 0
                if (r0 == 0) goto L_0x0021
                androidx.recyclerview.widget.RecyclerView$c0 r0 = r11.f(r12)
                if (r0 == 0) goto L_0x0022
                r4 = 1
                goto L_0x0023
            L_0x0021:
                r0 = r2
            L_0x0022:
                r4 = 0
            L_0x0023:
                if (r0 != 0) goto L_0x0057
                androidx.recyclerview.widget.RecyclerView$c0 r0 = r11.i(r12, r13)
                if (r0 == 0) goto L_0x0057
                boolean r5 = r11.D(r0)
                if (r5 != 0) goto L_0x0056
                if (r13 != 0) goto L_0x0054
                r13 = 4
                r0.b(r13)
                boolean r13 = r0.t()
                if (r13 == 0) goto L_0x0048
                androidx.recyclerview.widget.RecyclerView r13 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r5 = r0.f4058a
                r13.removeDetachedView(r5, r3)
                r0.F()
                goto L_0x0051
            L_0x0048:
                boolean r13 = r0.G()
                if (r13 == 0) goto L_0x0051
                r0.d()
            L_0x0051:
                r11.u(r0)
            L_0x0054:
                r0 = r2
                goto L_0x0057
            L_0x0056:
                r4 = 1
            L_0x0057:
                if (r0 != 0) goto L_0x00a5
                androidx.recyclerview.widget.RecyclerView r13 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r13 = r13.f4016k
                int r13 = r13.m(r12)
                if (r13 < 0) goto L_0x0068
                androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r12 = r12.f4032s
                throw r2
            L_0x0068:
                java.lang.IndexOutOfBoundsException r14 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r0 = "Inconsistency detected. Invalid item position "
                r15.append(r0)
                r15.append(r12)
                java.lang.String r12 = "(offset:"
                r15.append(r12)
                r15.append(r13)
                java.lang.String r12 = ")."
                r15.append(r12)
                java.lang.String r12 = "state:"
                r15.append(r12)
                androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r12 = r12.f4025o0
                int r12 = r12.a()
                r15.append(r12)
                androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r12 = r12.B()
                r15.append(r12)
                java.lang.String r12 = r15.toString()
                r14.<init>(r12)
                throw r14
            L_0x00a5:
                if (r4 == 0) goto L_0x00dd
                androidx.recyclerview.widget.RecyclerView r13 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r13 = r13.f4025o0
                boolean r13 = r13.b()
                if (r13 != 0) goto L_0x00dd
                r13 = 8192(0x2000, float:1.14794E-41)
                boolean r2 = r0.n(r13)
                if (r2 == 0) goto L_0x00dd
                r0.A(r3, r13)
                androidx.recyclerview.widget.RecyclerView r13 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r13 = r13.f4025o0
                boolean r13 = r13.f4143k
                if (r13 == 0) goto L_0x00dd
                int r13 = androidx.recyclerview.widget.RecyclerView.k.a(r0)
                r13 = r13 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$k r5 = r2.T
                androidx.recyclerview.widget.RecyclerView$z r2 = r2.f4025o0
                java.util.List r6 = r0.m()
                androidx.recyclerview.widget.RecyclerView$k$c r13 = r5.o(r2, r0, r13, r6)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                r2.k0(r0, r13)
            L_0x00dd:
                androidx.recyclerview.widget.RecyclerView r13 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r13 = r13.f4025o0
                boolean r13 = r13.b()
                if (r13 == 0) goto L_0x00f0
                boolean r13 = r0.p()
                if (r13 == 0) goto L_0x00f0
                r0.f4064g = r12
                goto L_0x0103
            L_0x00f0:
                boolean r13 = r0.p()
                if (r13 == 0) goto L_0x0105
                boolean r13 = r0.w()
                if (r13 != 0) goto L_0x0105
                boolean r13 = r0.q()
                if (r13 == 0) goto L_0x0103
                goto L_0x0105
            L_0x0103:
                r12 = 0
                goto L_0x0115
            L_0x0105:
                androidx.recyclerview.widget.RecyclerView r13 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r13 = r13.f4016k
                int r7 = r13.m(r12)
                r5 = r11
                r6 = r0
                r8 = r12
                r9 = r14
                boolean r12 = r5.z(r6, r7, r8, r9)
            L_0x0115:
                android.view.View r13 = r0.f4058a
                android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
                if (r13 != 0) goto L_0x012b
                androidx.recyclerview.widget.RecyclerView r13 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r13 = r13.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$o r13 = (androidx.recyclerview.widget.RecyclerView.o) r13
                android.view.View r14 = r0.f4058a
                r14.setLayoutParams(r13)
                goto L_0x0143
            L_0x012b:
                androidx.recyclerview.widget.RecyclerView r14 = androidx.recyclerview.widget.RecyclerView.this
                boolean r14 = r14.checkLayoutParams(r13)
                if (r14 != 0) goto L_0x0141
                androidx.recyclerview.widget.RecyclerView r14 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r13 = r14.generateLayoutParams((android.view.ViewGroup.LayoutParams) r13)
                androidx.recyclerview.widget.RecyclerView$o r13 = (androidx.recyclerview.widget.RecyclerView.o) r13
                android.view.View r14 = r0.f4058a
                r14.setLayoutParams(r13)
                goto L_0x0143
            L_0x0141:
                androidx.recyclerview.widget.RecyclerView$o r13 = (androidx.recyclerview.widget.RecyclerView.o) r13
            L_0x0143:
                r13.f4113a = r0
                if (r4 == 0) goto L_0x014a
                if (r12 == 0) goto L_0x014a
                goto L_0x014b
            L_0x014a:
                r1 = 0
            L_0x014b:
                r13.f4116d = r1
                return r0
            L_0x014e:
                java.lang.IndexOutOfBoundsException r13 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "Invalid item position "
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "("
                r14.append(r15)
                r14.append(r12)
                java.lang.String r12 = "). Item count:"
                r14.append(r12)
                androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r12 = r12.f4025o0
                int r12 = r12.a()
                r14.append(r12)
                androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r12 = r12.B()
                r14.append(r12)
                java.lang.String r12 = r14.toString()
                r13.<init>(r12)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.A(int, boolean, long):androidx.recyclerview.widget.RecyclerView$c0");
        }

        /* access modifiers changed from: package-private */
        public void B(c0 c0Var) {
            if (c0Var.f4072o) {
                this.f4124b.remove(c0Var);
            } else {
                this.f4123a.remove(c0Var);
            }
            c0Var.f4071n = null;
            c0Var.f4072o = false;
            c0Var.d();
        }

        /* access modifiers changed from: package-private */
        public void C() {
            n nVar = RecyclerView.this.f4034t;
            this.f4128f = this.f4127e + (nVar != null ? nVar.f4102m : 0);
            for (int size = this.f4125c.size() - 1; size >= 0 && this.f4125c.size() > this.f4128f; size--) {
                s(size);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean D(c0 c0Var) {
            if (c0Var.s()) {
                return RecyclerView.this.f4025o0.b();
            }
            if (c0Var.f4060c >= 0) {
                g gVar = RecyclerView.this.f4032s;
                throw null;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + c0Var + RecyclerView.this.B());
        }

        /* access modifiers changed from: package-private */
        public void E(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f4125c.size() - 1; size >= 0; size--) {
                c0 c0Var = this.f4125c.get(size);
                if (c0Var != null && (i12 = c0Var.f4060c) >= i10 && i12 < i13) {
                    c0Var.b(2);
                    s(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(c0 c0Var, boolean z10) {
            RecyclerView.j(c0Var);
            if (c0Var.n(16384)) {
                c0Var.A(0, 16384);
                androidx.core.view.z.S(c0Var.f4058a, (androidx.core.view.a) null);
            }
            if (z10) {
                e(c0Var);
            }
            c0Var.f4075r = null;
            g().e(c0Var);
        }

        public void b() {
            this.f4123a.clear();
            r();
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f4123a.clear();
            ArrayList<c0> arrayList = this.f4124b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int d(int i10) {
            if (i10 < 0 || i10 >= RecyclerView.this.f4025o0.a()) {
                throw new IndexOutOfBoundsException("invalid position " + i10 + ". State " + "item count is " + RecyclerView.this.f4025o0.a() + RecyclerView.this.B());
            } else if (!RecyclerView.this.f4025o0.b()) {
                return i10;
            } else {
                return RecyclerView.this.f4016k.m(i10);
            }
        }

        /* access modifiers changed from: package-private */
        public void e(c0 c0Var) {
            v vVar = RecyclerView.this.f4036u;
            if (vVar != null) {
                vVar.a(c0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            g gVar = recyclerView.f4032s;
            if (recyclerView.f4025o0 != null) {
                recyclerView.f4020m.d(c0Var);
            }
        }

        /* access modifiers changed from: package-private */
        public c0 f(int i10) {
            int size;
            ArrayList<c0> arrayList = this.f4124b;
            if (arrayList == null || (size = arrayList.size()) == 0) {
                return null;
            }
            int i11 = 0;
            while (i11 < size) {
                c0 c0Var = this.f4124b.get(i11);
                if (c0Var.G() || c0Var.k() != i10) {
                    i11++;
                } else {
                    c0Var.b(32);
                    return c0Var;
                }
            }
            g gVar = RecyclerView.this.f4032s;
            throw null;
        }

        /* access modifiers changed from: package-private */
        public t g() {
            if (this.f4129g == null) {
                this.f4129g = new t();
            }
            return this.f4129g;
        }

        /* access modifiers changed from: package-private */
        public int h() {
            return this.f4123a.size();
        }

        /* access modifiers changed from: package-private */
        public c0 i(int i10, boolean z10) {
            View b10;
            int size = this.f4123a.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                c0 c0Var = this.f4123a.get(i12);
                if (c0Var.G() || c0Var.k() != i10 || c0Var.q() || (!RecyclerView.this.f4025o0.f4140h && c0Var.s())) {
                    i12++;
                } else {
                    c0Var.b(32);
                    return c0Var;
                }
            }
            if (z10 || (b10 = RecyclerView.this.f4018l.b(i10)) == null) {
                int size2 = this.f4125c.size();
                while (i11 < size2) {
                    c0 c0Var2 = this.f4125c.get(i11);
                    if (c0Var2.q() || c0Var2.k() != i10) {
                        i11++;
                    } else {
                        if (!z10) {
                            this.f4125c.remove(i11);
                        }
                        return c0Var2;
                    }
                }
                return null;
            }
            c0 H = RecyclerView.H(b10);
            RecyclerView.this.f4018l.m(b10);
            int h10 = RecyclerView.this.f4018l.h(b10);
            if (h10 != -1) {
                RecyclerView.this.f4018l.a(h10);
                v(b10);
                H.b(8224);
                return H;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + H + RecyclerView.this.B());
        }

        /* access modifiers changed from: package-private */
        public View j(int i10) {
            return this.f4123a.get(i10).f4058a;
        }

        /* access modifiers changed from: package-private */
        public void k() {
            int size = this.f4125c.size();
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = (o) this.f4125c.get(i10).f4058a.getLayoutParams();
                if (oVar != null) {
                    oVar.f4115c = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void l() {
            int size = this.f4125c.size();
            for (int i10 = 0; i10 < size; i10++) {
                c0 c0Var = this.f4125c.get(i10);
                if (c0Var != null) {
                    c0Var.b(6);
                    c0Var.a((Object) null);
                }
            }
            g gVar = RecyclerView.this.f4032s;
            r();
        }

        /* access modifiers changed from: package-private */
        public void m(int i10, int i11) {
            int size = this.f4125c.size();
            for (int i12 = 0; i12 < size; i12++) {
                c0 c0Var = this.f4125c.get(i12);
                if (c0Var != null && c0Var.f4060c >= i10) {
                    c0Var.x(i11, true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void n(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i14 = -1;
                i13 = i10;
                i12 = i11;
            } else {
                i14 = 1;
                i12 = i10;
                i13 = i11;
            }
            int size = this.f4125c.size();
            for (int i16 = 0; i16 < size; i16++) {
                c0 c0Var = this.f4125c.get(i16);
                if (c0Var != null && (i15 = c0Var.f4060c) >= i13 && i15 <= i12) {
                    if (i15 == i10) {
                        c0Var.x(i11 - i10, false);
                    } else {
                        c0Var.x(i14, false);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void o(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f4125c.size() - 1; size >= 0; size--) {
                c0 c0Var = this.f4125c.get(size);
                if (c0Var != null) {
                    int i13 = c0Var.f4060c;
                    if (i13 >= i12) {
                        c0Var.x(-i11, z10);
                    } else if (i13 >= i10) {
                        c0Var.b(8);
                        s(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void p(g gVar, g gVar2, boolean z10) {
            b();
            g().d(gVar, gVar2, z10);
        }

        /* access modifiers changed from: package-private */
        public void q(View view) {
            c0 H = RecyclerView.H(view);
            H.f4071n = null;
            H.f4072o = false;
            H.d();
            u(H);
        }

        /* access modifiers changed from: package-private */
        public void r() {
            for (int size = this.f4125c.size() - 1; size >= 0; size--) {
                s(size);
            }
            this.f4125c.clear();
            if (RecyclerView.L0) {
                RecyclerView.this.f4023n0.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void s(int i10) {
            a(this.f4125c.get(i10), true);
            this.f4125c.remove(i10);
        }

        public void t(View view) {
            c0 H = RecyclerView.H(view);
            if (H.u()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (H.t()) {
                H.F();
            } else if (H.G()) {
                H.d();
            }
            u(H);
        }

        /* access modifiers changed from: package-private */
        public void u(c0 c0Var) {
            boolean z10;
            boolean z11 = false;
            boolean z12 = true;
            if (c0Var.t() || c0Var.f4058a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(c0Var.t());
                sb.append(" isAttached:");
                if (c0Var.f4058a.getParent() != null) {
                    z11 = true;
                }
                sb.append(z11);
                sb.append(RecyclerView.this.B());
                throw new IllegalArgumentException(sb.toString());
            } else if (c0Var.u()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + c0Var + RecyclerView.this.B());
            } else if (!c0Var.E()) {
                boolean g10 = c0Var.g();
                g gVar = RecyclerView.this.f4032s;
                if (c0Var.r()) {
                    if (this.f4128f <= 0 || c0Var.n(526)) {
                        z10 = false;
                    } else {
                        int size = this.f4125c.size();
                        if (size >= this.f4128f && size > 0) {
                            s(0);
                            size--;
                        }
                        if (RecyclerView.L0 && size > 0 && !RecyclerView.this.f4023n0.c(c0Var.f4060c)) {
                            int i10 = size - 1;
                            while (i10 >= 0) {
                                if (!RecyclerView.this.f4023n0.c(this.f4125c.get(i10).f4060c)) {
                                    break;
                                }
                                i10--;
                            }
                            size = i10 + 1;
                        }
                        this.f4125c.add(size, c0Var);
                        z10 = true;
                    }
                    if (!z10) {
                        a(c0Var, true);
                        z11 = z10;
                        RecyclerView.this.f4020m.d(c0Var);
                        if (!z11 && !z12 && g10) {
                            c0Var.f4075r = null;
                            return;
                        }
                        return;
                    }
                    z11 = z10;
                }
                z12 = false;
                RecyclerView.this.f4020m.d(c0Var);
                if (!z11) {
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.B());
            }
        }

        /* access modifiers changed from: package-private */
        public void v(View view) {
            c0 H = RecyclerView.H(view);
            if (!H.n(12) && H.v() && !RecyclerView.this.h(H)) {
                if (this.f4124b == null) {
                    this.f4124b = new ArrayList<>();
                }
                H.C(this, true);
                this.f4124b.add(H);
            } else if (!H.q() || H.s()) {
                H.C(this, false);
                this.f4123a.add(H);
            } else {
                g gVar = RecyclerView.this.f4032s;
                throw null;
            }
        }

        /* access modifiers changed from: package-private */
        public void w(t tVar) {
            t tVar2 = this.f4129g;
            if (tVar2 != null) {
                tVar2.b();
            }
            this.f4129g = tVar;
            if (tVar != null) {
                RecyclerView.this.getAdapter();
            }
        }

        /* access modifiers changed from: package-private */
        public void x(a0 a0Var) {
        }

        public void y(int i10) {
            this.f4127e = i10;
            C();
        }
    }

    public interface v {
        void a(c0 c0Var);
    }

    private class w extends h {
        w() {
        }
    }

    public static abstract class y {
    }

    public static class z {

        /* renamed from: a  reason: collision with root package name */
        int f4133a = -1;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<Object> f4134b;

        /* renamed from: c  reason: collision with root package name */
        int f4135c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f4136d = 0;

        /* renamed from: e  reason: collision with root package name */
        int f4137e = 1;

        /* renamed from: f  reason: collision with root package name */
        int f4138f = 0;

        /* renamed from: g  reason: collision with root package name */
        boolean f4139g = false;

        /* renamed from: h  reason: collision with root package name */
        boolean f4140h = false;

        /* renamed from: i  reason: collision with root package name */
        boolean f4141i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f4142j = false;

        /* renamed from: k  reason: collision with root package name */
        boolean f4143k = false;

        /* renamed from: l  reason: collision with root package name */
        boolean f4144l = false;

        public int a() {
            return this.f4140h ? this.f4135c - this.f4136d : this.f4138f;
        }

        public boolean b() {
            return this.f4140h;
        }

        /* access modifiers changed from: package-private */
        public void c(g gVar) {
            this.f4137e = 1;
            throw null;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f4133a + ", mData=" + this.f4134b + ", mItemCount=" + this.f4138f + ", mIsMeasuring=" + this.f4142j + ", mPreviousLayoutItemCount=" + this.f4135c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f4136d + ", mStructureChanged=" + this.f4139g + ", mInPreLayout=" + this.f4140h + ", mRunSimpleAnimations=" + this.f4143k + ", mRunPredictiveAnimations=" + this.f4144l + '}';
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16843830(0x1010436, float:2.369658E-38)
            r3 = 0
            r1[r3] = r2
            G0 = r1
            int[] r1 = new int[r0]
            r2 = 16842987(0x10100eb, float:2.3694217E-38)
            r1[r3] = r2
            H0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 18
            if (r1 == r2) goto L_0x0025
            r2 = 19
            if (r1 == r2) goto L_0x0025
            r2 = 20
            if (r1 != r2) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r2 = 0
            goto L_0x0026
        L_0x0025:
            r2 = 1
        L_0x0026:
            I0 = r2
            r2 = 23
            if (r1 < r2) goto L_0x002e
            r2 = 1
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            J0 = r2
            r2 = 16
            if (r1 < r2) goto L_0x0037
            r2 = 1
            goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            K0 = r2
            r2 = 21
            if (r1 < r2) goto L_0x0040
            r2 = 1
            goto L_0x0041
        L_0x0040:
            r2 = 0
        L_0x0041:
            L0 = r2
            r2 = 15
            if (r1 > r2) goto L_0x0049
            r4 = 1
            goto L_0x004a
        L_0x0049:
            r4 = 0
        L_0x004a:
            M0 = r4
            if (r1 > r2) goto L_0x0050
            r1 = 1
            goto L_0x0051
        L_0x0050:
            r1 = 0
        L_0x0051:
            N0 = r1
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r3] = r2
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            O0 = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            P0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void E0() {
        this.f4019l0.i();
        n nVar = this.f4034t;
        if (nVar != null) {
            nVar.G0();
        }
    }

    static c0 H(View view) {
        if (view == null) {
            return null;
        }
        return ((o) view.getLayoutParams()).f4113a;
    }

    static void I(View view, Rect rect) {
        o oVar = (o) view.getLayoutParams();
        Rect rect2 = oVar.f4114b;
        rect.set((view.getLeft() - rect2.left) - oVar.leftMargin, (view.getTop() - rect2.top) - oVar.topMargin, view.getRight() + rect2.right + oVar.rightMargin, view.getBottom() + rect2.bottom + oVar.bottomMargin);
    }

    private String J(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private boolean M() {
        int d10 = this.f4018l.d();
        for (int i10 = 0; i10 < d10; i10++) {
            c0 H2 = H(this.f4018l.c(i10));
            if (H2 != null && !H2.E() && H2.v()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void O() {
        if (androidx.core.view.z.s(this) == 0) {
            androidx.core.view.z.b0(this, 8);
        }
    }

    private void P() {
        this.f4018l = new b(new e());
    }

    private boolean U(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || C(view2) == null) {
            return false;
        }
        if (view == null || C(view) == null) {
            return true;
        }
        this.f4026p.set(0, 0, view.getWidth(), view.getHeight());
        this.f4028q.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f4026p);
        offsetDescendantRectToMyCoords(view2, this.f4028q);
        char c10 = 65535;
        int i12 = this.f4034t.C() == 1 ? -1 : 1;
        Rect rect = this.f4026p;
        int i13 = rect.left;
        Rect rect2 = this.f4028q;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 != 130) {
                                throw new IllegalArgumentException("Invalid direction: " + i10 + B());
                            } else if (c10 > 0) {
                                return true;
                            } else {
                                return false;
                            }
                        } else if (i11 > 0) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (c10 < 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (i11 < 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (c10 > 0 || (c10 == 0 && i11 * i12 >= 0)) {
                return true;
            } else {
                return false;
            }
        } else if (c10 < 0 || (c10 == 0 && i11 * i12 <= 0)) {
            return true;
        } else {
            return false;
        }
    }

    private void e0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.V) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.V = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f4005c0 = x10;
            this.f4003a0 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f4006d0 = y10;
            this.f4004b0 = y10;
        }
    }

    private boolean g0() {
        return this.T != null && this.f4034t.H0();
    }

    private androidx.core.view.o getScrollingChildHelper() {
        if (this.f4045y0 == null) {
            this.f4045y0 = new androidx.core.view.o(this);
        }
        return this.f4045y0;
    }

    private void h0() {
        boolean z10;
        boolean z11;
        if (this.K) {
            this.f4016k.t();
            if (this.L) {
                this.f4034t.h0(this);
            }
        }
        if (g0()) {
            this.f4016k.r();
        } else {
            this.f4016k.j();
        }
        boolean z12 = false;
        boolean z13 = this.f4031r0 || this.f4033s0;
        z zVar = this.f4025o0;
        if (!this.B || this.T == null || (!(z11 = this.K) && !z13 && !this.f4034t.f4097h)) {
            z10 = false;
        } else if (!z11) {
            z10 = true;
        } else {
            throw null;
        }
        zVar.f4143k = z10;
        if (z10 && z13 && !this.K && g0()) {
            z12 = true;
        }
        zVar.f4144l = z12;
    }

    private void i() {
        s0();
        setScrollState(0);
    }

    static void j(c0 c0Var) {
        WeakReference<RecyclerView> weakReference = c0Var.f4059b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != c0Var.f4058a) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            c0Var.f4059b = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void j0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.y()
            android.widget.EdgeEffect r3 = r6.P
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.d.c(r3, r4, r9)
        L_0x001f:
            r9 = 1
            goto L_0x003c
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x003b
            r6.z()
            android.widget.EdgeEffect r3 = r6.R
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.d.c(r3, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0056
            r6.A()
            android.widget.EdgeEffect r9 = r6.Q
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.d.c(r9, r0, r7)
            goto L_0x0072
        L_0x0056:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0071
            r6.x()
            android.widget.EdgeEffect r9 = r6.S
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.d.c(r9, r3, r0)
            goto L_0x0072
        L_0x0071:
            r1 = r9
        L_0x0072:
            if (r1 != 0) goto L_0x007c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            androidx.core.view.z.M(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.j0(float, float, float, float):void");
    }

    private void l0() {
        boolean z10;
        EdgeEffect edgeEffect = this.P;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.P.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.Q;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.Q.isFinished();
        }
        EdgeEffect edgeEffect3 = this.R;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.R.isFinished();
        }
        EdgeEffect edgeEffect4 = this.S;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.S.isFinished();
        }
        if (z10) {
            androidx.core.view.z.M(this);
        }
    }

    private void m(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        ClassLoader classLoader;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String J2 = J(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = classLoader.loadClass(J2).asSubclass(n.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(O0);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                    } catch (NoSuchMethodException e10) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((n) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e11) {
                    e11.initCause(e10);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + J2, e11);
                } catch (ClassNotFoundException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + J2, e12);
                } catch (InvocationTargetException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + J2, e13);
                } catch (InstantiationException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + J2, e14);
                } catch (IllegalAccessException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + J2, e15);
                } catch (ClassCastException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + J2, e16);
                }
            }
        }
    }

    private void p() {
        int i10 = this.G;
        this.G = 0;
        if (i10 != 0 && S()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            androidx.core.view.accessibility.b.b(obtain, i10);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void r0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f4026p.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof o) {
            o oVar = (o) layoutParams;
            if (!oVar.f4115c) {
                Rect rect = oVar.f4114b;
                Rect rect2 = this.f4026p;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f4026p);
            offsetRectIntoDescendantCoords(view, this.f4026p);
        }
        this.f4034t.C0(this, view, this.f4026p, !this.B, view2 == null);
    }

    private void s0() {
        VelocityTracker velocityTracker = this.W;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        C0(0);
        l0();
    }

    private boolean t(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        r rVar = this.f4042x;
        if (rVar != null) {
            if (action == 0) {
                this.f4042x = null;
            } else {
                rVar.a(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.f4042x = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int size = this.f4040w.size();
            for (int i10 = 0; i10 < size; i10++) {
                r rVar2 = this.f4040w.get(i10);
                if (rVar2.b(this, motionEvent)) {
                    this.f4042x = rVar2;
                    return true;
                }
            }
        }
        return false;
    }

    private boolean u(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f4042x = null;
        }
        int size = this.f4040w.size();
        int i10 = 0;
        while (i10 < size) {
            r rVar = this.f4040w.get(i10);
            if (!rVar.b(this, motionEvent) || action == 3) {
                i10++;
            } else {
                this.f4042x = rVar;
                return true;
            }
        }
        return false;
    }

    private void u0(g gVar, boolean z10, boolean z11) {
        if (!z10 || z11) {
            m0();
        }
        this.f4016k.t();
        g gVar2 = this.f4032s;
        n nVar = this.f4034t;
        if (nVar != null) {
            nVar.U(gVar2, gVar);
        }
        this.f4012i.p(gVar2, this.f4032s, z10);
        this.f4025o0.f4139g = true;
    }

    /* access modifiers changed from: package-private */
    public void A() {
        if (this.Q == null) {
            EdgeEffect a10 = this.O.a(this, 1);
            this.Q = a10;
            if (this.f4022n) {
                a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a10.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public boolean A0(int i10, int i11) {
        return getScrollingChildHelper().q(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public String B() {
        return " " + super.toString() + ", adapter:" + this.f4032s + ", layout:" + this.f4034t + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    public void B0(boolean z10) {
        if (this.C < 1) {
            this.C = 1;
        }
        if (!z10 && !this.E) {
            this.D = false;
        }
        int i10 = this.C;
        if (i10 == 1) {
            if (z10 && this.D && !this.E) {
                n nVar = this.f4034t;
            }
            if (!this.E) {
                this.D = false;
            }
        }
        this.C = i10 - 1;
    }

    public View C(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public void C0(int i10) {
        getScrollingChildHelper().s(i10);
    }

    /* access modifiers changed from: package-private */
    public c0 D(int i10, boolean z10) {
        int g10 = this.f4018l.g();
        c0 c0Var = null;
        for (int i11 = 0; i11 < g10; i11++) {
            c0 H2 = H(this.f4018l.f(i11));
            if (H2 != null && !H2.s()) {
                if (z10) {
                    if (H2.f4060c != i10) {
                        continue;
                    }
                } else if (H2.k() != i10) {
                    continue;
                }
                if (!this.f4018l.i(H2.f4058a)) {
                    return H2;
                }
                c0Var = H2;
            }
        }
        return c0Var;
    }

    public void D0() {
        setScrollState(0);
        E0();
    }

    public boolean E(int i10, int i11) {
        n nVar = this.f4034t;
        if (nVar == null || this.E) {
            return false;
        }
        boolean b10 = nVar.b();
        boolean c10 = this.f4034t.c();
        if (!b10 || Math.abs(i10) < this.f4009g0) {
            i10 = 0;
        }
        if (!c10 || Math.abs(i11) < this.f4009g0) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        float f10 = (float) i10;
        float f11 = (float) i11;
        if (!dispatchNestedPreFling(f10, f11)) {
            boolean z10 = b10 || c10;
            dispatchNestedFling(f10, f11, z10);
            if (z10) {
                if (c10) {
                    b10 |= true;
                }
                A0(b10 ? 1 : 0, 1);
                int i12 = this.f4011h0;
                int max = Math.max(-i12, Math.min(i10, i12));
                int i13 = this.f4011h0;
                this.f4019l0.e(max, Math.max(-i13, Math.min(i11, i13)));
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int F(c0 c0Var) {
        if (c0Var.n(524) || !c0Var.p()) {
            return -1;
        }
        return this.f4016k.e(c0Var.f4060c);
    }

    /* access modifiers changed from: package-private */
    public void F0(int i10, int i11, Object obj) {
        int i12;
        int g10 = this.f4018l.g();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < g10; i14++) {
            View f10 = this.f4018l.f(i14);
            c0 H2 = H(f10);
            if (H2 != null && !H2.E() && (i12 = H2.f4060c) >= i10 && i12 < i13) {
                H2.b(2);
                H2.a(obj);
                ((o) f10.getLayoutParams()).f4115c = true;
            }
        }
        this.f4012i.E(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public long G(c0 c0Var) {
        throw null;
    }

    public boolean K(int i10) {
        return getScrollingChildHelper().l(i10);
    }

    public boolean L() {
        return !this.B || this.K || this.f4016k.p();
    }

    /* access modifiers changed from: package-private */
    public void N() {
        this.f4016k = new a(new f());
    }

    /* access modifiers changed from: package-private */
    public void Q(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + B());
        }
        Resources resources = getContext().getResources();
        new d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(z0.a.fastscroll_default_thickness), resources.getDimensionPixelSize(z0.a.fastscroll_minimum_range), resources.getDimensionPixelOffset(z0.a.fastscroll_margin));
    }

    /* access modifiers changed from: package-private */
    public void R() {
        this.S = null;
        this.Q = null;
        this.R = null;
        this.P = null;
    }

    /* access modifiers changed from: package-private */
    public boolean S() {
        AccessibilityManager accessibilityManager = this.I;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean T() {
        return this.M > 0;
    }

    /* access modifiers changed from: package-private */
    public void V() {
        int g10 = this.f4018l.g();
        for (int i10 = 0; i10 < g10; i10++) {
            ((o) this.f4018l.f(i10).getLayoutParams()).f4115c = true;
        }
        this.f4012i.k();
    }

    /* access modifiers changed from: package-private */
    public void W() {
        int g10 = this.f4018l.g();
        for (int i10 = 0; i10 < g10; i10++) {
            c0 H2 = H(this.f4018l.f(i10));
            if (H2 != null && !H2.E()) {
                H2.b(6);
            }
        }
        V();
        this.f4012i.l();
    }

    /* access modifiers changed from: package-private */
    public void X(int i10, int i11) {
        int g10 = this.f4018l.g();
        for (int i12 = 0; i12 < g10; i12++) {
            c0 H2 = H(this.f4018l.f(i12));
            if (H2 != null && !H2.E() && H2.f4060c >= i10) {
                H2.x(i11, false);
                this.f4025o0.f4139g = true;
            }
        }
        this.f4012i.m(i10, i11);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void Y(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int g10 = this.f4018l.g();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < g10; i16++) {
            c0 H2 = H(this.f4018l.f(i16));
            if (H2 != null && (i15 = H2.f4060c) >= i13 && i15 <= i12) {
                if (i15 == i10) {
                    H2.x(i11 - i10, false);
                } else {
                    H2.x(i14, false);
                }
                this.f4025o0.f4139g = true;
            }
        }
        this.f4012i.n(i10, i11);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void Z(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int g10 = this.f4018l.g();
        for (int i13 = 0; i13 < g10; i13++) {
            c0 H2 = H(this.f4018l.f(i13));
            if (H2 != null && !H2.E()) {
                int i14 = H2.f4060c;
                if (i14 >= i12) {
                    H2.x(-i11, z10);
                    this.f4025o0.f4139g = true;
                } else if (i14 >= i10) {
                    H2.h(i10 - 1, -i11, z10);
                    this.f4025o0.f4139g = true;
                }
            }
        }
        this.f4012i.o(i10, i11, z10);
        requestLayout();
    }

    public void a0(View view) {
    }

    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        n nVar = this.f4034t;
        if (nVar == null || !nVar.V(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    /* access modifiers changed from: package-private */
    public void b0() {
        this.M++;
    }

    public void c(m mVar) {
        d(mVar, -1);
    }

    /* access modifiers changed from: package-private */
    public void c0() {
        d0(true);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof o) && this.f4034t.d((o) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        n nVar = this.f4034t;
        if (nVar != null && nVar.b()) {
            return this.f4034t.f(this.f4025o0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        n nVar = this.f4034t;
        if (nVar != null && nVar.b()) {
            return this.f4034t.g(this.f4025o0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        n nVar = this.f4034t;
        if (nVar != null && nVar.b()) {
            return this.f4034t.h(this.f4025o0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        n nVar = this.f4034t;
        if (nVar != null && nVar.c()) {
            return this.f4034t.i(this.f4025o0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        n nVar = this.f4034t;
        if (nVar != null && nVar.c()) {
            return this.f4034t.j(this.f4025o0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        n nVar = this.f4034t;
        if (nVar != null && nVar.c()) {
            return this.f4034t.k(this.f4025o0);
        }
        return 0;
    }

    public void d(m mVar, int i10) {
        n nVar = this.f4034t;
        if (nVar != null) {
            nVar.a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f4038v.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f4038v.add(mVar);
        } else {
            this.f4038v.add(i10, mVar);
        }
        V();
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void d0(boolean z10) {
        int i10 = this.M - 1;
        this.M = i10;
        if (i10 < 1) {
            this.M = 0;
            if (z10) {
                p();
                w();
            }
        }
    }

    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.f4038v.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            this.f4038v.get(i10).g(canvas, this, this.f4025o0);
        }
        EdgeEffect edgeEffect = this.P;
        boolean z12 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f4022n ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.P;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.Q;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f4022n) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.Q;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.R;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f4022n ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.R;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.S;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f4022n) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.S;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(save4);
        }
        if (z10 || this.T == null || this.f4038v.size() <= 0 || !this.T.l()) {
            z12 = z10;
        }
        if (z12) {
            androidx.core.view.z.M(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public void e(r rVar) {
        this.f4040w.add(rVar);
    }

    public void f(s sVar) {
        if (this.f4029q0 == null) {
            this.f4029q0 = new ArrayList();
        }
        this.f4029q0.add(sVar);
    }

    public void f0(int i10) {
    }

    public View focusSearch(View view, int i10) {
        View f02 = this.f4034t.f0(view, i10);
        if (f02 != null) {
            return f02;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i10);
        if (findNextFocus == null || findNextFocus.hasFocusable()) {
            return U(view, findNextFocus, i10) ? findNextFocus : super.focusSearch(view, i10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        r0(findNextFocus, (View) null);
        return view;
    }

    /* access modifiers changed from: package-private */
    public void g(String str) {
        if (T()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + B());
            }
            throw new IllegalStateException(str);
        } else if (this.N > 0) {
            new IllegalStateException("" + B());
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        n nVar = this.f4034t;
        if (nVar != null) {
            return nVar.n();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + B());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        n nVar = this.f4034t;
        if (nVar != null) {
            return nVar.o(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + B());
    }

    public g getAdapter() {
        return this.f4032s;
    }

    public int getBaseline() {
        n nVar = this.f4034t;
        if (nVar != null) {
            return nVar.q();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i10, int i11) {
        i iVar = this.f4041w0;
        if (iVar == null) {
            return super.getChildDrawingOrder(i10, i11);
        }
        return iVar.a(i10, i11);
    }

    public boolean getClipToPadding() {
        return this.f4022n;
    }

    public i getCompatAccessibilityDelegate() {
        return this.f4039v0;
    }

    public j getEdgeEffectFactory() {
        return this.O;
    }

    public k getItemAnimator() {
        return this.T;
    }

    public int getItemDecorationCount() {
        return this.f4038v.size();
    }

    public n getLayoutManager() {
        return this.f4034t;
    }

    public int getMaxFlingVelocity() {
        return this.f4011h0;
    }

    public int getMinFlingVelocity() {
        return this.f4009g0;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (L0) {
            return System.nanoTime();
        }
        return 0;
    }

    public q getOnFlingListener() {
        return this.f4008f0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f4017k0;
    }

    public t getRecycledViewPool() {
        return this.f4012i.g();
    }

    public int getScrollState() {
        return this.U;
    }

    /* access modifiers changed from: package-private */
    public boolean h(c0 c0Var) {
        k kVar = this.T;
        return kVar == null || kVar.c(c0Var, c0Var.m());
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    /* access modifiers changed from: package-private */
    public void i0(boolean z10) {
        this.L = z10 | this.L;
        this.K = true;
        W();
    }

    public boolean isAttachedToWindow() {
        return this.f4044y;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    /* access modifiers changed from: package-private */
    public void k(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.P;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z10 = false;
        } else {
            this.P.onRelease();
            z10 = this.P.isFinished();
        }
        EdgeEffect edgeEffect2 = this.R;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.R.onRelease();
            z10 |= this.R.isFinished();
        }
        EdgeEffect edgeEffect3 = this.Q;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.Q.onRelease();
            z10 |= this.Q.isFinished();
        }
        EdgeEffect edgeEffect4 = this.S;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.S.onRelease();
            z10 |= this.S.isFinished();
        }
        if (z10) {
            androidx.core.view.z.M(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void k0(c0 c0Var, k.c cVar) {
        c0Var.A(0, 8192);
        if (this.f4025o0.f4141i && c0Var.v() && !c0Var.s() && !c0Var.E()) {
            this.f4020m.a(G(c0Var), c0Var);
        }
        this.f4020m.b(c0Var, cVar);
    }

    /* access modifiers changed from: package-private */
    public void l() {
        if (!this.B || this.K) {
            androidx.core.os.p.a("RV FullInvalidate");
            q();
            androidx.core.os.p.b();
        } else if (this.f4016k.p()) {
            if (this.f4016k.o(4) && !this.f4016k.o(11)) {
                androidx.core.os.p.a("RV PartialInvalidate");
                z0();
                b0();
                this.f4016k.r();
                if (!this.D) {
                    if (M()) {
                        q();
                    } else {
                        this.f4016k.i();
                    }
                }
                B0(true);
                c0();
                androidx.core.os.p.b();
            } else if (this.f4016k.p()) {
                androidx.core.os.p.a("RV FullInvalidate");
                q();
                androidx.core.os.p.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void m0() {
        k kVar = this.T;
        if (kVar != null) {
            kVar.g();
        }
        n nVar = this.f4034t;
        if (nVar != null) {
            nVar.w0(this.f4012i);
            this.f4034t.x0(this.f4012i);
        }
        this.f4012i.b();
    }

    /* access modifiers changed from: package-private */
    public void n(int i10, int i11) {
        setMeasuredDimension(n.e(i10, getPaddingLeft() + getPaddingRight(), androidx.core.view.z.v(this)), n.e(i11, getPaddingTop() + getPaddingBottom(), androidx.core.view.z.u(this)));
    }

    /* access modifiers changed from: package-private */
    public boolean n0(View view) {
        z0();
        boolean l10 = this.f4018l.l(view);
        if (l10) {
            c0 H2 = H(view);
            this.f4012i.B(H2);
            this.f4012i.u(H2);
        }
        B0(!l10);
        return l10;
    }

    /* access modifiers changed from: package-private */
    public void o(View view) {
        H(view);
        a0(view);
        List<p> list = this.J;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.J.get(size).a(view);
            }
        }
    }

    public void o0(m mVar) {
        n nVar = this.f4034t;
        if (nVar != null) {
            nVar.a("Cannot remove item decoration during a scroll  or layout");
        }
        this.f4038v.remove(mVar);
        if (this.f4038v.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        V();
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.M = 0;
        boolean z10 = true;
        this.f4044y = true;
        if (!this.B || isLayoutRequested()) {
            z10 = false;
        }
        this.B = z10;
        n nVar = this.f4034t;
        if (nVar != null) {
            nVar.l(this);
        }
        this.f4037u0 = false;
        if (L0) {
            ThreadLocal<e> threadLocal = e.f4284l;
            e eVar = threadLocal.get();
            this.f4021m0 = eVar;
            if (eVar == null) {
                this.f4021m0 = new e();
                Display p10 = androidx.core.view.z.p(this);
                float f10 = 60.0f;
                if (!isInEditMode() && p10 != null) {
                    float refreshRate = p10.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f10 = refreshRate;
                    }
                }
                e eVar2 = this.f4021m0;
                eVar2.f4288j = (long) (1.0E9f / f10);
                threadLocal.set(eVar2);
            }
            this.f4021m0.a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        e eVar;
        super.onDetachedFromWindow();
        k kVar = this.T;
        if (kVar != null) {
            kVar.g();
        }
        D0();
        this.f4044y = false;
        n nVar = this.f4034t;
        if (nVar != null) {
            nVar.m(this, this.f4012i);
        }
        this.D0.clear();
        removeCallbacks(this.E0);
        this.f4020m.c();
        if (L0 && (eVar = this.f4021m0) != null) {
            eVar.j(this);
            this.f4021m0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f4038v.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4038v.get(i10).e(canvas, this, this.f4025o0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float f11;
        if (this.f4034t != null && !this.E && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f11 = this.f4034t.c() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f4034t.b()) {
                    f10 = motionEvent.getAxisValue(10);
                    if (!(f11 == 0.0f && f10 == 0.0f)) {
                        t0((int) (f10 * this.f4013i0), (int) (f11 * this.f4015j0), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f4034t.c()) {
                        f11 = -axisValue;
                    } else if (this.f4034t.b()) {
                        f10 = axisValue;
                        f11 = 0.0f;
                        t0((int) (f10 * this.f4013i0), (int) (f11 * this.f4015j0), motionEvent);
                    }
                }
                f11 = 0.0f;
            }
            f10 = 0.0f;
            t0((int) (f10 * this.f4013i0), (int) (f11 * this.f4015j0), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.E) {
            return false;
        }
        if (u(motionEvent)) {
            i();
            return true;
        }
        n nVar = this.f4034t;
        if (nVar == null) {
            return false;
        }
        boolean b10 = nVar.b();
        boolean c10 = this.f4034t.c();
        if (this.W == null) {
            this.W = VelocityTracker.obtain();
        }
        this.W.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.F) {
                this.F = false;
            }
            this.V = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f4005c0 = x10;
            this.f4003a0 = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f4006d0 = y10;
            this.f4004b0 = y10;
            if (this.U == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.B0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (c10) {
                b10 |= true;
            }
            A0(b10 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.W.clear();
            C0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.V);
            if (findPointerIndex < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error processing scroll; pointer index for id ");
                sb.append(this.V);
                sb.append(" not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.U != 1) {
                int i10 = x11 - this.f4003a0;
                int i11 = y11 - this.f4004b0;
                if (!b10 || Math.abs(i10) <= this.f4007e0) {
                    z10 = false;
                } else {
                    this.f4005c0 = x11;
                    z10 = true;
                }
                if (c10 && Math.abs(i11) > this.f4007e0) {
                    this.f4006d0 = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            i();
        } else if (actionMasked == 5) {
            this.V = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f4005c0 = x12;
            this.f4003a0 = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f4006d0 = y12;
            this.f4004b0 = y12;
        } else if (actionMasked == 6) {
            e0(motionEvent);
        }
        if (this.U == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        androidx.core.os.p.a("RV OnLayout");
        q();
        androidx.core.os.p.b();
        this.B = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        n nVar = this.f4034t;
        if (nVar == null) {
            n(i10, i11);
        } else if (nVar.Q()) {
            View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getMode(i11);
            this.f4034t.m0(this.f4012i, this.f4025o0, i10, i11);
        } else if (this.f4046z) {
            this.f4034t.m0(this.f4012i, this.f4025o0, i10, i11);
        } else {
            if (this.H) {
                z0();
                b0();
                h0();
                c0();
                z zVar = this.f4025o0;
                if (zVar.f4144l) {
                    zVar.f4140h = true;
                } else {
                    this.f4016k.j();
                    this.f4025o0.f4140h = false;
                }
                this.H = false;
                B0(false);
            } else if (this.f4025o0.f4144l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            this.f4025o0.f4138f = 0;
            z0();
            this.f4034t.m0(this.f4012i, this.f4025o0, i10, i11);
            B0(false);
            this.f4025o0.f4140h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (T()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof x)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x xVar = (x) parcelable;
        this.f4014j = xVar;
        super.onRestoreInstanceState(xVar.b());
        n nVar = this.f4034t;
        if (nVar != null && (parcelable2 = this.f4014j.f4132j) != null) {
            nVar.p0(parcelable2);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        x xVar = new x(super.onSaveInstanceState());
        x xVar2 = this.f4014j;
        if (xVar2 != null) {
            xVar.c(xVar2);
        } else {
            n nVar = this.f4034t;
            if (nVar != null) {
                xVar.f4132j = nVar.q0();
            } else {
                xVar.f4132j = null;
            }
        }
        return xVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            R();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        boolean z11 = false;
        if (this.E || this.F) {
            return false;
        }
        if (t(motionEvent)) {
            i();
            return true;
        }
        n nVar = this.f4034t;
        if (nVar == null) {
            return false;
        }
        boolean b10 = nVar.b();
        boolean c10 = this.f4034t.c();
        if (this.W == null) {
            this.W = VelocityTracker.obtain();
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.B0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        int[] iArr2 = this.B0;
        obtain.offsetLocation((float) iArr2[0], (float) iArr2[1]);
        if (actionMasked == 0) {
            this.V = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f4005c0 = x10;
            this.f4003a0 = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f4006d0 = y10;
            this.f4004b0 = y10;
            if (c10) {
                b10 |= true;
            }
            A0(b10 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.W.addMovement(obtain);
            this.W.computeCurrentVelocity(1000, (float) this.f4011h0);
            float f10 = b10 ? -this.W.getXVelocity(this.V) : 0.0f;
            float f11 = c10 ? -this.W.getYVelocity(this.V) : 0.0f;
            if ((f10 == 0.0f && f11 == 0.0f) || !E((int) f10, (int) f11)) {
                setScrollState(0);
            }
            s0();
            z11 = true;
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.V);
            if (findPointerIndex < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error processing scroll; pointer index for id ");
                sb.append(this.V);
                sb.append(" not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            int i14 = this.f4005c0 - x11;
            int i15 = this.f4006d0 - y11;
            if (r(i14, i15, this.A0, this.f4047z0, 0)) {
                int[] iArr3 = this.A0;
                i14 -= iArr3[0];
                i15 -= iArr3[1];
                int[] iArr4 = this.f4047z0;
                obtain.offsetLocation((float) iArr4[0], (float) iArr4[1]);
                int[] iArr5 = this.B0;
                int i16 = iArr5[0];
                int[] iArr6 = this.f4047z0;
                iArr5[0] = i16 + iArr6[0];
                iArr5[1] = iArr5[1] + iArr6[1];
            }
            if (this.U != 1) {
                if (!b10 || Math.abs(i11) <= (i13 = this.f4007e0)) {
                    z10 = false;
                } else {
                    i11 = i11 > 0 ? i11 - i13 : i11 + i13;
                    z10 = true;
                }
                if (c10 && Math.abs(i10) > (i12 = this.f4007e0)) {
                    i10 = i10 > 0 ? i10 - i12 : i10 + i12;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
            if (this.U == 1) {
                int[] iArr7 = this.f4047z0;
                this.f4005c0 = x11 - iArr7[0];
                this.f4006d0 = y11 - iArr7[1];
                if (t0(b10 ? i11 : 0, c10 ? i10 : 0, obtain)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                e eVar = this.f4021m0;
                if (!(eVar == null || (i11 == 0 && i10 == 0))) {
                    eVar.f(this, i11, i10);
                }
            }
        } else if (actionMasked == 3) {
            i();
        } else if (actionMasked == 5) {
            this.V = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f4005c0 = x12;
            this.f4003a0 = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f4006d0 = y12;
            this.f4004b0 = y12;
        } else if (actionMasked == 6) {
            e0(motionEvent);
        }
        if (!z11) {
            this.W.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void p0(r rVar) {
        this.f4040w.remove(rVar);
        if (this.f4042x == rVar) {
            this.f4042x = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void q() {
    }

    public void q0(s sVar) {
        List<s> list = this.f4029q0;
        if (list != null) {
            list.remove(sVar);
        }
    }

    public boolean r(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z10) {
        c0 H2 = H(view);
        if (H2 != null) {
            if (H2.u()) {
                H2.e();
            } else if (!H2.E()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + H2 + B());
            }
        }
        view.clearAnimation();
        o(view);
        super.removeDetachedView(view, z10);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f4034t.o0(this, this.f4025o0, view, view2) && view2 != null) {
            r0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f4034t.B0(this, view, rect, z10);
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f4040w.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4040w.get(i10).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void requestLayout() {
        if (this.C != 0 || this.E) {
            this.D = true;
        } else {
            super.requestLayout();
        }
    }

    public boolean s(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return getScrollingChildHelper().g(i10, i11, i12, i13, iArr, i14);
    }

    public void scrollBy(int i10, int i11) {
        n nVar = this.f4034t;
        if (nVar != null && !this.E) {
            boolean b10 = nVar.b();
            boolean c10 = this.f4034t.c();
            if (b10 || c10) {
                if (!b10) {
                    i10 = 0;
                }
                if (!c10) {
                    i11 = 0;
                }
                t0(i10, i11, (MotionEvent) null);
            }
        }
    }

    public void scrollTo(int i10, int i11) {
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!w0(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(i iVar) {
        this.f4039v0 = iVar;
        androidx.core.view.z.S(this, iVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        u0(gVar, false, true);
        i0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(i iVar) {
        if (iVar != this.f4041w0) {
            this.f4041w0 = iVar;
            setChildrenDrawingOrderEnabled(iVar != null);
        }
    }

    public void setClipToPadding(boolean z10) {
        if (z10 != this.f4022n) {
            R();
        }
        this.f4022n = z10;
        super.setClipToPadding(z10);
        if (this.B) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(j jVar) {
        androidx.core.util.h.b(jVar);
        this.O = jVar;
        R();
    }

    public void setHasFixedSize(boolean z10) {
        this.f4046z = z10;
    }

    public void setItemAnimator(k kVar) {
        k kVar2 = this.T;
        if (kVar2 != null) {
            kVar2.g();
            this.T.q((k.b) null);
        }
        this.T = kVar;
        if (kVar != null) {
            kVar.q(this.f4035t0);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f4012i.y(i10);
    }

    public void setLayoutFrozen(boolean z10) {
        if (z10 != this.E) {
            g("Do not setLayoutFrozen in layout or scroll");
            if (!z10) {
                this.E = false;
                if (this.D) {
                    n nVar = this.f4034t;
                }
                this.D = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.E = true;
            this.F = true;
            D0();
        }
    }

    public void setLayoutManager(n nVar) {
        if (nVar != this.f4034t) {
            D0();
            if (this.f4034t != null) {
                k kVar = this.T;
                if (kVar != null) {
                    kVar.g();
                }
                this.f4034t.w0(this.f4012i);
                this.f4034t.x0(this.f4012i);
                this.f4012i.b();
                if (this.f4044y) {
                    this.f4034t.m(this, this.f4012i);
                }
                this.f4034t.F0((RecyclerView) null);
                this.f4034t = null;
            } else {
                this.f4012i.b();
            }
            this.f4018l.j();
            this.f4034t = nVar;
            if (nVar != null) {
                if (nVar.f4091b == null) {
                    nVar.F0(this);
                    if (this.f4044y) {
                        this.f4034t.l(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + nVar + " is already attached to a RecyclerView:" + nVar.f4091b.B());
                }
            }
            this.f4012i.C();
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().n(z10);
    }

    public void setOnFlingListener(q qVar) {
    }

    @Deprecated
    public void setOnScrollListener(s sVar) {
        this.f4027p0 = sVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f4017k0 = z10;
    }

    public void setRecycledViewPool(t tVar) {
        this.f4012i.w(tVar);
    }

    public void setRecyclerListener(v vVar) {
        this.f4036u = vVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i10) {
        if (i10 != this.U) {
            this.U = i10;
            if (i10 != 2) {
                E0();
            }
            v(i10);
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("setScrollingTouchSlop(): bad argument constant ");
                sb.append(i10);
                sb.append("; using default value");
            } else {
                this.f4007e0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f4007e0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(a0 a0Var) {
        this.f4012i.x(a0Var);
    }

    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().p(i10);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().r();
    }

    /* access modifiers changed from: package-private */
    public boolean t0(int i10, int i11, MotionEvent motionEvent) {
        l();
        if (!this.f4038v.isEmpty()) {
            invalidate();
        }
        if (s(0, 0, 0, 0, this.f4047z0, 0)) {
            int i12 = this.f4005c0;
            int[] iArr = this.f4047z0;
            this.f4005c0 = i12 - iArr[0];
            this.f4006d0 -= iArr[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
            }
            int[] iArr2 = this.B0;
            int i13 = iArr2[0];
            int[] iArr3 = this.f4047z0;
            iArr2[0] = i13 + iArr3[0];
            iArr2[1] = iArr2[1] + iArr3[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.m.a(motionEvent, 8194)) {
                j0(motionEvent.getX(), (float) 0, motionEvent.getY(), (float) 0);
            }
            k(i10, i11);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void v(int i10) {
        n nVar = this.f4034t;
        if (nVar != null) {
            nVar.r0(i10);
        }
        f0(i10);
        s sVar = this.f4027p0;
        if (sVar != null) {
            sVar.a(this, i10);
        }
        List<s> list = this.f4029q0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4029q0.get(size).a(this, i10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean v0(c0 c0Var, int i10) {
        if (T()) {
            c0Var.f4074q = i10;
            this.D0.add(c0Var);
            return false;
        }
        androidx.core.view.z.Z(c0Var.f4058a, i10);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void w() {
        int i10;
        for (int size = this.D0.size() - 1; size >= 0; size--) {
            c0 c0Var = this.D0.get(size);
            if (c0Var.f4058a.getParent() == this && !c0Var.E() && (i10 = c0Var.f4074q) != -1) {
                androidx.core.view.z.Z(c0Var.f4058a, i10);
                c0Var.f4074q = -1;
            }
        }
        this.D0.clear();
    }

    /* access modifiers changed from: package-private */
    public boolean w0(AccessibilityEvent accessibilityEvent) {
        int i10 = 0;
        if (!T()) {
            return false;
        }
        int a10 = accessibilityEvent != null ? androidx.core.view.accessibility.b.a(accessibilityEvent) : 0;
        if (a10 != 0) {
            i10 = a10;
        }
        this.G |= i10;
        return true;
    }

    /* access modifiers changed from: package-private */
    public void x() {
        if (this.S == null) {
            EdgeEffect a10 = this.O.a(this, 3);
            this.S = a10;
            if (this.f4022n) {
                a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a10.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void x0(int i10, int i11) {
        y0(i10, i11, (Interpolator) null);
    }

    /* access modifiers changed from: package-private */
    public void y() {
        if (this.P == null) {
            EdgeEffect a10 = this.O.a(this, 0);
            this.P = a10;
            if (this.f4022n) {
                a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a10.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void y0(int i10, int i11, Interpolator interpolator) {
        n nVar = this.f4034t;
        if (nVar != null && !this.E) {
            if (!nVar.b()) {
                i10 = 0;
            }
            if (!this.f4034t.c()) {
                i11 = 0;
            }
            if (i10 != 0 || i11 != 0) {
                this.f4019l0.h(i10, i11, interpolator);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void z() {
        if (this.R == null) {
            EdgeEffect a10 = this.O.a(this, 2);
            this.R = a10;
            if (this.f4022n) {
                a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a10.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void z0() {
        int i10 = this.C + 1;
        this.C = i10;
        if (i10 == 1 && !this.E) {
            this.D = false;
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4010h = new w();
        this.f4012i = new u();
        this.f4020m = new m();
        this.f4024o = new a();
        this.f4026p = new Rect();
        this.f4028q = new Rect();
        this.f4030r = new RectF();
        this.f4038v = new ArrayList<>();
        this.f4040w = new ArrayList<>();
        this.C = 0;
        this.K = false;
        this.L = false;
        this.M = 0;
        this.N = 0;
        this.O = new j();
        this.T = new c();
        this.U = 0;
        this.V = -1;
        this.f4013i0 = Float.MIN_VALUE;
        this.f4015j0 = Float.MIN_VALUE;
        boolean z10 = true;
        this.f4017k0 = true;
        this.f4019l0 = new b0();
        this.f4023n0 = L0 ? new e.b() : null;
        this.f4025o0 = new z();
        this.f4031r0 = false;
        this.f4033s0 = false;
        this.f4035t0 = new l();
        this.f4037u0 = false;
        this.f4043x0 = new int[2];
        this.f4047z0 = new int[2];
        this.A0 = new int[2];
        this.B0 = new int[2];
        this.C0 = new int[2];
        this.D0 = new ArrayList();
        this.E0 = new b();
        this.F0 = new d();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H0, i10, 0);
            this.f4022n = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f4022n = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4007e0 = viewConfiguration.getScaledTouchSlop();
        this.f4013i0 = androidx.core.view.b0.c(viewConfiguration, context);
        this.f4015j0 = androidx.core.view.b0.e(viewConfiguration, context);
        this.f4009g0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4011h0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.T.q(this.f4035t0);
        N();
        P();
        O();
        if (androidx.core.view.z.r(this) == 0) {
            androidx.core.view.z.Z(this, 1);
        }
        this.I = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new i(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, z0.b.f13109h, i10, 0);
            String string = obtainStyledAttributes2.getString(z0.b.f13117p);
            if (obtainStyledAttributes2.getInt(z0.b.f13111j, -1) == -1) {
                setDescendantFocusability(262144);
            }
            boolean z11 = obtainStyledAttributes2.getBoolean(z0.b.f13112k, false);
            this.A = z11;
            if (z11) {
                Q((StateListDrawable) obtainStyledAttributes2.getDrawable(z0.b.f13115n), obtainStyledAttributes2.getDrawable(z0.b.f13116o), (StateListDrawable) obtainStyledAttributes2.getDrawable(z0.b.f13113l), obtainStyledAttributes2.getDrawable(z0.b.f13114m));
            }
            obtainStyledAttributes2.recycle();
            m(context, string, attributeSet, i10, 0);
            if (Build.VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, G0, i10, 0);
                boolean z12 = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
                z10 = z12;
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z10);
    }

    public static class o extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        c0 f4113a;

        /* renamed from: b  reason: collision with root package name */
        final Rect f4114b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        boolean f4115c = true;

        /* renamed from: d  reason: collision with root package name */
        boolean f4116d = false;

        public o(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int a() {
            return this.f4113a.k();
        }

        public o(int i10, int i11) {
            super(i10, i11);
        }

        public o(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public o(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public o(o oVar) {
            super(oVar);
        }
    }

    public static class x extends e0.a {
        public static final Parcelable.Creator<x> CREATOR = new a();

        /* renamed from: j  reason: collision with root package name */
        Parcelable f4132j;

        static class a implements Parcelable.ClassLoaderCreator<x> {
            a() {
            }

            /* renamed from: a */
            public x createFromParcel(Parcel parcel) {
                return new x(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public x createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new x(parcel, classLoader);
            }

            /* renamed from: c */
            public x[] newArray(int i10) {
                return new x[i10];
            }
        }

        x(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4132j = parcel.readParcelable(classLoader == null ? n.class.getClassLoader() : classLoader);
        }

        /* access modifiers changed from: package-private */
        public void c(x xVar) {
            this.f4132j = xVar.f4132j;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f4132j, 0);
        }

        x(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        n nVar = this.f4034t;
        if (nVar != null) {
            return nVar.p(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + B());
    }
}
