package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.f0;
import androidx.core.view.g0;
import androidx.core.view.z;
import f.j;

/* compiled from: AbsActionBarView */
abstract class a extends ViewGroup {

    /* renamed from: h  reason: collision with root package name */
    protected final C0012a f995h;

    /* renamed from: i  reason: collision with root package name */
    protected final Context f996i;

    /* renamed from: j  reason: collision with root package name */
    protected ActionMenuView f997j;

    /* renamed from: k  reason: collision with root package name */
    protected c f998k;

    /* renamed from: l  reason: collision with root package name */
    protected int f999l;

    /* renamed from: m  reason: collision with root package name */
    protected f0 f1000m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f1001n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f1002o;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* compiled from: AbsActionBarView */
    protected class C0012a implements g0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1003a = false;

        /* renamed from: b  reason: collision with root package name */
        int f1004b;

        protected C0012a() {
        }

        public void a(View view) {
            this.f1003a = true;
        }

        public void b(View view) {
            if (!this.f1003a) {
                a aVar = a.this;
                aVar.f1000m = null;
                a.super.setVisibility(this.f1004b);
            }
        }

        public void c(View view) {
            a.super.setVisibility(0);
            this.f1003a = false;
        }

        public C0012a d(f0 f0Var, int i10) {
            a.this.f1000m = f0Var;
            this.f1004b = i10;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    /* access modifiers changed from: protected */
    public int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    /* access modifiers changed from: protected */
    public int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public f0 f(int i10, long j10) {
        f0 f0Var = this.f1000m;
        if (f0Var != null) {
            f0Var.c();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            f0 b10 = z.b(this).b(1.0f);
            b10.f(j10);
            b10.h(this.f995h.d(b10, i10));
            return b10;
        }
        f0 b11 = z.b(this).b(0.0f);
        b11.f(j10);
        b11.h(this.f995h.d(b11, i10));
        return b11;
    }

    public int getAnimatedVisibility() {
        if (this.f1000m != null) {
            return this.f995h.f1004b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f999l;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, j.f8319a, f.a.f8186c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(j.f8364j, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f998k;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1002o = false;
        }
        if (!this.f1002o) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1002o = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1002o = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1001n = false;
        }
        if (!this.f1001n) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1001n = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1001n = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f999l = i10;
        requestLayout();
    }

    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            f0 f0Var = this.f1000m;
            if (f0Var != null) {
                f0Var.c();
            }
            super.setVisibility(i10);
        }
    }

    a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f995h = new C0012a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(f.a.f8184a, typedValue, true) || typedValue.resourceId == 0) {
            this.f996i = context;
        } else {
            this.f996i = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
