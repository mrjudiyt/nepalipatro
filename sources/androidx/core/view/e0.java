package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i0 f2512a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2513b;

    public /* synthetic */ e0(i0 i0Var, View view) {
        this.f2512a = i0Var;
        this.f2513b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2512a.a(this.f2513b);
    }
}
