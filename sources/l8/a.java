package l8;

import android.view.View;
import io.flutter.util.ViewUtils;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements ViewUtils.ViewVisitor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Class[] f15644a;

    public /* synthetic */ a(Class[] clsArr) {
        this.f15644a = clsArr;
    }

    public final boolean run(View view) {
        return ViewUtils.lambda$hasChildViewOfType$1(this.f15644a, view);
    }
}
