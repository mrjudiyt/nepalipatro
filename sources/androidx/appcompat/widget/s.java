package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import f.a;

/* compiled from: AppCompatSeekBar */
public class s extends SeekBar {

    /* renamed from: h  reason: collision with root package name */
    private final t f1220h;

    public s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.H);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1220h.h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1220h.i();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1220h.g(canvas);
    }

    public s(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p0.a(this, getContext());
        t tVar = new t(this);
        this.f1220h = tVar;
        tVar.c(attributeSet, i10);
    }
}
