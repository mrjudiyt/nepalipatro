package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import f.a;

/* compiled from: AppCompatRatingBar */
public class r extends RatingBar {

    /* renamed from: h  reason: collision with root package name */
    private final p f1215h;

    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.F);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap b10 = this.f1215h.b();
        if (b10 != null) {
            setMeasuredDimension(View.resolveSizeAndState(b10.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }

    public r(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p0.a(this, getContext());
        p pVar = new p(this);
        this.f1215h = pVar;
        pVar.c(attributeSet, i10);
    }
}
