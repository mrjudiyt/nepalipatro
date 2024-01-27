package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.cardview.widget.g;

/* compiled from: CardViewApi17Impl */
class a extends c {

    /* renamed from: androidx.cardview.widget.a$a  reason: collision with other inner class name */
    /* compiled from: CardViewApi17Impl */
    class C0015a implements g.a {
        C0015a() {
        }

        public void a(Canvas canvas, RectF rectF, float f10, Paint paint) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    a() {
    }

    public void i() {
        g.f1400r = new C0015a();
    }
}
