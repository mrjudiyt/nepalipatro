package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import f.d;
import f.f;
import f.g;
import f.i;

/* compiled from: TooltipPopup */
class y0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1331a;

    /* renamed from: b  reason: collision with root package name */
    private final View f1332b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f1333c;

    /* renamed from: d  reason: collision with root package name */
    private final WindowManager.LayoutParams f1334d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f1335e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final int[] f1336f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    private final int[] f1337g = new int[2];

    y0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1334d = layoutParams;
        this.f1331a = context;
        View inflate = LayoutInflater.from(context).inflate(g.f8301s, (ViewGroup) null);
        this.f1332b = inflate;
        this.f1333c = (TextView) inflate.findViewById(f.f8275s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = i.f8315a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int i12;
        int i13;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1331a.getResources().getDimensionPixelOffset(d.f8228j);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1331a.getResources().getDimensionPixelOffset(d.f8227i);
            i13 = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            i13 = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1331a.getResources().getDimensionPixelOffset(z10 ? d.f8230l : d.f8229k);
        View b10 = b(view);
        if (b10 != null) {
            b10.getWindowVisibleDisplayFrame(this.f1335e);
            Rect rect = this.f1335e;
            if (rect.left < 0 && rect.top < 0) {
                Resources resources = this.f1331a.getResources();
                int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                this.f1335e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            b10.getLocationOnScreen(this.f1337g);
            view.getLocationOnScreen(this.f1336f);
            int[] iArr = this.f1336f;
            int i14 = iArr[0];
            int[] iArr2 = this.f1337g;
            iArr[0] = i14 - iArr2[0];
            iArr[1] = iArr[1] - iArr2[1];
            layoutParams.x = (iArr[0] + i10) - (b10.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.f1332b.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = this.f1332b.getMeasuredHeight();
            int[] iArr3 = this.f1336f;
            int i15 = ((iArr3[1] + i12) - dimensionPixelOffset3) - measuredHeight;
            int i16 = iArr3[1] + i13 + dimensionPixelOffset3;
            if (z10) {
                if (i15 >= 0) {
                    layoutParams.y = i15;
                } else {
                    layoutParams.y = i16;
                }
            } else if (measuredHeight + i16 <= this.f1335e.height()) {
                layoutParams.y = i16;
            } else {
                layoutParams.y = i15;
            }
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (d()) {
            ((WindowManager) this.f1331a.getSystemService("window")).removeView(this.f1332b);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f1332b.getParent() != null;
    }

    /* access modifiers changed from: package-private */
    public void e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f1333c.setText(charSequence);
        a(view, i10, i11, z10, this.f1334d);
        ((WindowManager) this.f1331a.getSystemService("window")).addView(this.f1332b, this.f1334d);
    }
}
