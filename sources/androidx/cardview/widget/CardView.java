package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import r.b;
import r.d;
import r.e;

public class CardView extends FrameLayout {

    /* renamed from: o  reason: collision with root package name */
    private static final int[] f1374o = {16842801};

    /* renamed from: p  reason: collision with root package name */
    private static final e f1375p;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1376h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1377i;

    /* renamed from: j  reason: collision with root package name */
    int f1378j;

    /* renamed from: k  reason: collision with root package name */
    int f1379k;

    /* renamed from: l  reason: collision with root package name */
    final Rect f1380l;

    /* renamed from: m  reason: collision with root package name */
    final Rect f1381m;

    /* renamed from: n  reason: collision with root package name */
    private final d f1382n;

    class a implements d {

        /* renamed from: a  reason: collision with root package name */
        private Drawable f1383a;

        a() {
        }

        public void a(int i10, int i11) {
            CardView cardView = CardView.this;
            if (i10 > cardView.f1378j) {
                CardView.super.setMinimumWidth(i10);
            }
            CardView cardView2 = CardView.this;
            if (i11 > cardView2.f1379k) {
                CardView.super.setMinimumHeight(i11);
            }
        }

        public void b(Drawable drawable) {
            this.f1383a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        public boolean c() {
            return CardView.this.getPreventCornerOverlap();
        }

        public boolean d() {
            return CardView.this.getUseCompatPadding();
        }

        public Drawable e() {
            return this.f1383a;
        }

        public View f() {
            return CardView.this;
        }

        public void g(int i10, int i11, int i12, int i13) {
            CardView.this.f1381m.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1380l;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            f1375p = new b();
        } else if (i10 >= 17) {
            f1375p = new a();
        } else {
            f1375p = new c();
        }
        f1375p.i();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, r.a.f10781a);
    }

    public ColorStateList getCardBackgroundColor() {
        return f1375p.h(this.f1382n);
    }

    public float getCardElevation() {
        return f1375p.c(this.f1382n);
    }

    public int getContentPaddingBottom() {
        return this.f1380l.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1380l.left;
    }

    public int getContentPaddingRight() {
        return this.f1380l.right;
    }

    public int getContentPaddingTop() {
        return this.f1380l.top;
    }

    public float getMaxCardElevation() {
        return f1375p.g(this.f1382n);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1377i;
    }

    public float getRadius() {
        return f1375p.d(this.f1382n);
    }

    public boolean getUseCompatPadding() {
        return this.f1376h;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        e eVar = f1375p;
        if (!(eVar instanceof b)) {
            int mode = View.MeasureSpec.getMode(i10);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) eVar.k(this.f1382n)), View.MeasureSpec.getSize(i10)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) eVar.j(this.f1382n)), View.MeasureSpec.getSize(i11)), mode2);
            }
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        f1375p.m(this.f1382n, ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        f1375p.f(this.f1382n, f10);
    }

    public void setMaxCardElevation(float f10) {
        f1375p.n(this.f1382n, f10);
    }

    public void setMinimumHeight(int i10) {
        this.f1379k = i10;
        super.setMinimumHeight(i10);
    }

    public void setMinimumWidth(int i10) {
        this.f1378j = i10;
        super.setMinimumWidth(i10);
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f1377i) {
            this.f1377i = z10;
            f1375p.l(this.f1382n);
        }
    }

    public void setRadius(float f10) {
        f1375p.b(this.f1382n, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f1376h != z10) {
            this.f1376h = z10;
            f1375p.e(this.f1382n);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int i11;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f1380l = rect;
        this.f1381m = new Rect();
        a aVar = new a();
        this.f1382n = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.f10788a, i10, d.f10787a);
        int i12 = e.f10791d;
        if (obtainStyledAttributes.hasValue(i12)) {
            valueOf = obtainStyledAttributes.getColorStateList(i12);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1374o);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i11 = getResources().getColor(b.f10783b);
            } else {
                i11 = getResources().getColor(b.f10782a);
            }
            valueOf = ColorStateList.valueOf(i11);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(e.f10792e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(e.f10793f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(e.f10794g, 0.0f);
        this.f1376h = obtainStyledAttributes.getBoolean(e.f10796i, false);
        this.f1377i = obtainStyledAttributes.getBoolean(e.f10795h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(e.f10797j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(e.f10799l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(e.f10801n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(e.f10800m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(e.f10798k, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1378j = obtainStyledAttributes.getDimensionPixelSize(e.f10789b, 0);
        this.f1379k = obtainStyledAttributes.getDimensionPixelSize(e.f10790c, 0);
        obtainStyledAttributes.recycle();
        f1375p.a(aVar, context, colorStateList, dimension, dimension2, f10);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1375p.m(this.f1382n, colorStateList);
    }
}
