package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import q.a;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: h  reason: collision with root package name */
    private final int f1341h = getResources().getDimensionPixelOffset(a.f10653b);

    /* renamed from: i  reason: collision with root package name */
    private final int f1342i = getResources().getDimensionPixelOffset(a.f10652a);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1341h * 2), this.f1342i), 1073741824), i11);
    }
}
