package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: Guideline */
public class h extends View {

    /* renamed from: h  reason: collision with root package name */
    private boolean f1836h = true;

    public h(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z10) {
        this.f1836h = z10;
    }

    public void setGuidelineBegin(int i10) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (!this.f1836h || bVar.f1621a != i10) {
            bVar.f1621a = i10;
            setLayoutParams(bVar);
        }
    }

    public void setGuidelineEnd(int i10) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (!this.f1836h || bVar.f1623b != i10) {
            bVar.f1623b = i10;
            setLayoutParams(bVar);
        }
    }

    public void setGuidelinePercent(float f10) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (!this.f1836h || bVar.f1625c != f10) {
            bVar.f1625c = f10;
            setLayoutParams(bVar);
        }
    }

    public void setVisibility(int i10) {
    }
}
