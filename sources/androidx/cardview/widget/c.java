package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.g;

/* compiled from: CardViewBaseImpl */
class c implements e {

    /* renamed from: a  reason: collision with root package name */
    final RectF f1386a = new RectF();

    /* compiled from: CardViewBaseImpl */
    class a implements g.a {
        a() {
        }

        public void a(Canvas canvas, RectF rectF, float f10, Paint paint) {
            Canvas canvas2 = canvas;
            RectF rectF2 = rectF;
            float f11 = 2.0f * f10;
            float width = (rectF.width() - f11) - 1.0f;
            float height = (rectF.height() - f11) - 1.0f;
            if (f10 >= 1.0f) {
                float f12 = f10 + 0.5f;
                float f13 = -f12;
                c.this.f1386a.set(f13, f13, f12, f12);
                int save = canvas.save();
                canvas2.translate(rectF2.left + f12, rectF2.top + f12);
                Paint paint2 = paint;
                canvas.drawArc(c.this.f1386a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(c.this.f1386a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(height, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(c.this.f1386a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(c.this.f1386a, 180.0f, 90.0f, true, paint2);
                canvas2.restoreToCount(save);
                float f14 = rectF2.top;
                canvas.drawRect((rectF2.left + f12) - 1.0f, f14, (rectF2.right - f12) + 1.0f, f14 + f12, paint2);
                float f15 = rectF2.bottom;
                Canvas canvas3 = canvas;
                canvas3.drawRect((rectF2.left + f12) - 1.0f, f15 - f12, (rectF2.right - f12) + 1.0f, f15, paint2);
            }
            canvas.drawRect(rectF2.left, rectF2.top + f10, rectF2.right, rectF2.bottom - f10, paint);
        }
    }

    c() {
    }

    private g o(Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        return new g(context.getResources(), colorStateList, f10, f11, f12);
    }

    private g p(d dVar) {
        return (g) dVar.e();
    }

    public void a(d dVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        g o10 = o(context, colorStateList, f10, f11, f12);
        o10.m(dVar.c());
        dVar.b(o10);
        q(dVar);
    }

    public void b(d dVar, float f10) {
        p(dVar).p(f10);
        q(dVar);
    }

    public float c(d dVar) {
        return p(dVar).l();
    }

    public float d(d dVar) {
        return p(dVar).g();
    }

    public void e(d dVar) {
    }

    public void f(d dVar, float f10) {
        p(dVar).r(f10);
    }

    public float g(d dVar) {
        return p(dVar).i();
    }

    public ColorStateList h(d dVar) {
        return p(dVar).f();
    }

    public void i() {
        g.f1400r = new a();
    }

    public float j(d dVar) {
        return p(dVar).j();
    }

    public float k(d dVar) {
        return p(dVar).k();
    }

    public void l(d dVar) {
        p(dVar).m(dVar.c());
        q(dVar);
    }

    public void m(d dVar, ColorStateList colorStateList) {
        p(dVar).o(colorStateList);
    }

    public void n(d dVar, float f10) {
        p(dVar).q(f10);
        q(dVar);
    }

    public void q(d dVar) {
        Rect rect = new Rect();
        p(dVar).h(rect);
        dVar.a((int) Math.ceil((double) k(dVar)), (int) Math.ceil((double) j(dVar)));
        dVar.g(rect.left, rect.top, rect.right, rect.bottom);
    }
}
