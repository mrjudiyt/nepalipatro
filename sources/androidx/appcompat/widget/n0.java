package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.g0;
import g.a;

/* compiled from: ScrollingTabContainerView */
public class n0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: q  reason: collision with root package name */
    private static final Interpolator f1164q = new DecelerateInterpolator();

    /* renamed from: h  reason: collision with root package name */
    Runnable f1165h;

    /* renamed from: i  reason: collision with root package name */
    private c f1166i;

    /* renamed from: j  reason: collision with root package name */
    g0 f1167j;

    /* renamed from: k  reason: collision with root package name */
    private Spinner f1168k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f1169l;

    /* renamed from: m  reason: collision with root package name */
    int f1170m;

    /* renamed from: n  reason: collision with root package name */
    int f1171n;

    /* renamed from: o  reason: collision with root package name */
    private int f1172o;

    /* renamed from: p  reason: collision with root package name */
    private int f1173p;

    /* compiled from: ScrollingTabContainerView */
    class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ View f1174h;

        a(View view) {
            this.f1174h = view;
        }

        public void run() {
            n0.this.smoothScrollTo(this.f1174h.getLeft() - ((n0.this.getWidth() - this.f1174h.getWidth()) / 2), 0);
            n0.this.f1165h = null;
        }
    }

    /* compiled from: ScrollingTabContainerView */
    private class b extends BaseAdapter {
        b() {
        }

        public int getCount() {
            return n0.this.f1167j.getChildCount();
        }

        public Object getItem(int i10) {
            return ((d) n0.this.f1167j.getChildAt(i10)).b();
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                return n0.this.c((a.c) getItem(i10), true);
            }
            ((d) view).a((a.c) getItem(i10));
            return view;
        }
    }

    /* compiled from: ScrollingTabContainerView */
    private class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = n0.this.f1167j.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = n0.this.f1167j.getChildAt(i10);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* compiled from: ScrollingTabContainerView */
    private class d extends LinearLayout {

        /* renamed from: h  reason: collision with root package name */
        private final int[] f1178h;

        /* renamed from: i  reason: collision with root package name */
        private a.c f1179i;

        /* renamed from: j  reason: collision with root package name */
        private TextView f1180j;

        /* renamed from: k  reason: collision with root package name */
        private ImageView f1181k;

        /* renamed from: l  reason: collision with root package name */
        private View f1182l;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public d(android.content.Context r6, g.a.c r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.n0.this = r5
                int r5 = f.a.f8187d
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1178h = r1
                r4.f1179i = r7
                androidx.appcompat.widget.u0 r5 = androidx.appcompat.widget.u0.u(r6, r0, r1, r5, r3)
                boolean r6 = r5.r(r3)
                if (r6 == 0) goto L_0x0026
                android.graphics.drawable.Drawable r6 = r5.f(r3)
                r4.setBackgroundDrawable(r6)
            L_0x0026:
                r5.v()
                if (r8 == 0) goto L_0x0031
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L_0x0031:
                r4.c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.n0.d.<init>(androidx.appcompat.widget.n0, android.content.Context, g.a$c, boolean):void");
        }

        public void a(a.c cVar) {
            this.f1179i = cVar;
            c();
        }

        public a.c b() {
            return this.f1179i;
        }

        public void c() {
            a.c cVar = this.f1179i;
            View b10 = cVar.b();
            CharSequence charSequence = null;
            if (b10 != null) {
                ViewParent parent = b10.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b10);
                    }
                    addView(b10);
                }
                this.f1182l = b10;
                TextView textView = this.f1180j;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1181k;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1181k.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f1182l;
            if (view != null) {
                removeView(view);
                this.f1182l = null;
            }
            Drawable c10 = cVar.c();
            CharSequence d10 = cVar.d();
            if (c10 != null) {
                if (this.f1181k == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1181k = appCompatImageView;
                }
                this.f1181k.setImageDrawable(c10);
                this.f1181k.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1181k;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1181k.setImageDrawable((Drawable) null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(d10);
            if (z10) {
                if (this.f1180j == null) {
                    x xVar = new x(getContext(), (AttributeSet) null, f.a.f8188e);
                    xVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    xVar.setLayoutParams(layoutParams2);
                    addView(xVar);
                    this.f1180j = xVar;
                }
                this.f1180j.setText(d10);
                this.f1180j.setVisibility(0);
            } else {
                TextView textView2 = this.f1180j;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1180j.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1181k;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            if (!z10) {
                charSequence = cVar.a();
            }
            w0.a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i10, int i11) {
            int i12;
            super.onMeasure(i10, i11);
            if (n0.this.f1170m > 0 && getMeasuredWidth() > (i12 = n0.this.f1170m)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
            }
        }

        public void setSelected(boolean z10) {
            boolean z11 = isSelected() != z10;
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }
    }

    private Spinner b() {
        u uVar = new u(getContext(), (AttributeSet) null, f.a.f8191h);
        uVar.setLayoutParams(new g0.a(-2, -1));
        uVar.setOnItemSelectedListener(this);
        return uVar;
    }

    private boolean d() {
        Spinner spinner = this.f1168k;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (!d()) {
            if (this.f1168k == null) {
                this.f1168k = b();
            }
            removeView(this.f1167j);
            addView(this.f1168k, new ViewGroup.LayoutParams(-2, -1));
            if (this.f1168k.getAdapter() == null) {
                this.f1168k.setAdapter(new b());
            }
            Runnable runnable = this.f1165h;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f1165h = null;
            }
            this.f1168k.setSelection(this.f1173p);
        }
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f1168k);
        addView(this.f1167j, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1168k.getSelectedItemPosition());
        return false;
    }

    public void a(int i10) {
        View childAt = this.f1167j.getChildAt(i10);
        Runnable runnable = this.f1165h;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1165h = aVar;
        post(aVar);
    }

    /* access modifiers changed from: package-private */
    public d c(a.c cVar, boolean z10) {
        d dVar = new d(getContext(), cVar, z10);
        if (z10) {
            dVar.setBackgroundDrawable((Drawable) null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1172o));
        } else {
            dVar.setFocusable(true);
            if (this.f1166i == null) {
                this.f1166i = new c();
            }
            dVar.setOnClickListener(this.f1166i);
        }
        return dVar;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1165h;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        l.a b10 = l.a.b(getContext());
        setContentHeight(b10.f());
        this.f1171n = b10.e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1165h;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((d) view).b().e();
    }

    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        boolean z10 = true;
        boolean z11 = mode == 1073741824;
        setFillViewport(z11);
        int childCount = this.f1167j.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1170m = -1;
        } else {
            if (childCount > 2) {
                this.f1170m = (int) (((float) View.MeasureSpec.getSize(i10)) * 0.4f);
            } else {
                this.f1170m = View.MeasureSpec.getSize(i10) / 2;
            }
            this.f1170m = Math.min(this.f1170m, this.f1171n);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1172o, 1073741824);
        if (z11 || !this.f1169l) {
            z10 = false;
        }
        if (z10) {
            this.f1167j.measure(0, makeMeasureSpec);
            if (this.f1167j.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                e();
            } else {
                f();
            }
        } else {
            f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i10, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z11 && measuredWidth != measuredWidth2) {
            setTabSelected(this.f1173p);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z10) {
        this.f1169l = z10;
    }

    public void setContentHeight(int i10) {
        this.f1172o = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f1173p = i10;
        int childCount = this.f1167j.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f1167j.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                a(i10);
            }
            i11++;
        }
        Spinner spinner = this.f1168k;
        if (spinner != null && i10 >= 0) {
            spinner.setSelection(i10);
        }
    }
}
