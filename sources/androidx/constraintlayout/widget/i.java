package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import v.e;

/* compiled from: Placeholder */
public class i extends View {

    /* renamed from: h  reason: collision with root package name */
    private int f1837h;

    /* renamed from: i  reason: collision with root package name */
    private View f1838i;

    /* renamed from: j  reason: collision with root package name */
    private int f1839j;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f1838i != null) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f1838i.getLayoutParams();
            bVar2.f1664v0.g1(0);
            e.b y10 = bVar.f1664v0.y();
            e.b bVar3 = e.b.FIXED;
            if (y10 != bVar3) {
                bVar.f1664v0.h1(bVar2.f1664v0.U());
            }
            if (bVar.f1664v0.R() != bVar3) {
                bVar.f1664v0.I0(bVar2.f1664v0.v());
            }
            bVar2.f1664v0.g1(8);
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f1837h == -1 && !isInEditMode()) {
            setVisibility(this.f1839j);
        }
        View findViewById = constraintLayout.findViewById(this.f1837h);
        this.f1838i = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.b) findViewById.getLayoutParams()).f1640j0 = true;
            this.f1838i.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f1838i;
    }

    public int getEmptyVisibility() {
        return this.f1839j;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i10) {
        View findViewById;
        if (this.f1837h != i10) {
            View view = this.f1838i;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.b) this.f1838i.getLayoutParams()).f1640j0 = false;
                this.f1838i = null;
            }
            this.f1837h = i10;
            if (i10 != -1 && (findViewById = ((View) getParent()).findViewById(i10)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i10) {
        this.f1839j = i10;
    }
}
