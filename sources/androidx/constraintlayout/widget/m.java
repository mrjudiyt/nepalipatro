package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import v.k;

/* compiled from: VirtualLayout */
public abstract class m extends c {

    /* renamed from: q  reason: collision with root package name */
    private boolean f2076q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f2077r;

    /* access modifiers changed from: protected */
    public void i(ConstraintLayout constraintLayout) {
        h(constraintLayout);
    }

    /* access modifiers changed from: protected */
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.f1959n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == k.f1977p1) {
                    this.f2076q = true;
                } else if (index == k.f2022u1) {
                    this.f2077r = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2076q || this.f2077r) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
                for (int i10 = 0; i10 < this.f1701i; i10++) {
                    View h10 = constraintLayout.h(this.f1700h[i10]);
                    if (h10 != null) {
                        if (this.f2076q) {
                            h10.setVisibility(visibility);
                        }
                        if (this.f2077r && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                            h10.setTranslationZ(h10.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        g();
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        g();
    }

    public void t(k kVar, int i10, int i11) {
    }
}
