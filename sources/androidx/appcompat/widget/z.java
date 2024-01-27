package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: AppCompatToggleButton */
public class z extends ToggleButton {

    /* renamed from: h  reason: collision with root package name */
    private final w f1338h;

    public z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public z(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p0.a(this, getContext());
        w wVar = new w(this);
        this.f1338h = wVar;
        wVar.m(attributeSet, i10);
    }
}
