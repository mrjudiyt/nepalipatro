package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.e0;

public class FitWindowsFrameLayout extends FrameLayout implements e0 {

    /* renamed from: h  reason: collision with root package name */
    private e0.a f888h;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        e0.a aVar = this.f888h;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(e0.a aVar) {
        this.f888h = aVar;
    }
}
