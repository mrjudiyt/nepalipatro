package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.h;
import f.j;

/* compiled from: AppCompatPopupWindow */
class o extends PopupWindow {

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f1184b = (Build.VERSION.SDK_INT < 21);

    /* renamed from: a  reason: collision with root package name */
    private boolean f1185a;

    public o(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        u0 u10 = u0.u(context, attributeSet, j.f8327b2, i10, i11);
        int i12 = j.f8337d2;
        if (u10.r(i12)) {
            b(u10.a(i12, false));
        }
        setBackgroundDrawable(u10.f(j.f8332c2));
        u10.v();
    }

    private void b(boolean z10) {
        if (f1184b) {
            this.f1185a = z10;
        } else {
            h.a(this, z10);
        }
    }

    public void showAsDropDown(View view, int i10, int i11) {
        if (f1184b && this.f1185a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f1184b && this.f1185a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f1184b && this.f1185a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}
