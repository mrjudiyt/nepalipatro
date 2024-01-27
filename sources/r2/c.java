package r2;

import a3.j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.vectordrawable.graphics.drawable.b;
import e2.k;
import java.nio.ByteBuffer;
import java.util.List;
import r2.g;

/* compiled from: GifDrawable */
public class c extends Drawable implements g.b, Animatable {

    /* renamed from: h  reason: collision with root package name */
    private final a f10824h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f10825i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f10826j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f10827k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f10828l;

    /* renamed from: m  reason: collision with root package name */
    private int f10829m;

    /* renamed from: n  reason: collision with root package name */
    private int f10830n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f10831o;

    /* renamed from: p  reason: collision with root package name */
    private Paint f10832p;

    /* renamed from: q  reason: collision with root package name */
    private Rect f10833q;

    /* renamed from: r  reason: collision with root package name */
    private List<b> f10834r;

    /* compiled from: GifDrawable */
    static final class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        final g f10835a;

        a(g gVar) {
            this.f10835a = gVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        public Drawable newDrawable() {
            return new c(this);
        }
    }

    public c(Context context, d2.a aVar, k<Bitmap> kVar, int i10, int i11, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.b.c(context), aVar, i10, i11, kVar, bitmap)));
    }

    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect d() {
        if (this.f10833q == null) {
            this.f10833q = new Rect();
        }
        return this.f10833q;
    }

    private Paint h() {
        if (this.f10832p == null) {
            this.f10832p = new Paint(2);
        }
        return this.f10832p;
    }

    private void j() {
        List<b> list = this.f10834r;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f10834r.get(i10).a(this);
            }
        }
    }

    private void l() {
        this.f10829m = 0;
    }

    private void n() {
        j.a(!this.f10827k, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f10824h.f10835a.f() == 1) {
            invalidateSelf();
        } else if (!this.f10825i) {
            this.f10825i = true;
            this.f10824h.f10835a.r(this);
            invalidateSelf();
        }
    }

    private void o() {
        this.f10825i = false;
        this.f10824h.f10835a.s(this);
    }

    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f10829m++;
        }
        int i10 = this.f10830n;
        if (i10 != -1 && this.f10829m >= i10) {
            j();
            stop();
        }
    }

    public ByteBuffer c() {
        return this.f10824h.f10835a.b();
    }

    public void draw(Canvas canvas) {
        if (!this.f10827k) {
            if (this.f10831o) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
                this.f10831o = false;
            }
            canvas.drawBitmap(this.f10824h.f10835a.c(), (Rect) null, d(), h());
        }
    }

    public Bitmap e() {
        return this.f10824h.f10835a.e();
    }

    public int f() {
        return this.f10824h.f10835a.f();
    }

    public int g() {
        return this.f10824h.f10835a.d();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f10824h;
    }

    public int getIntrinsicHeight() {
        return this.f10824h.f10835a.h();
    }

    public int getIntrinsicWidth() {
        return this.f10824h.f10835a.k();
    }

    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.f10824h.f10835a.j();
    }

    public boolean isRunning() {
        return this.f10825i;
    }

    public void k() {
        this.f10827k = true;
        this.f10824h.f10835a.a();
    }

    public void m(k<Bitmap> kVar, Bitmap bitmap) {
        this.f10824h.f10835a.o(kVar, bitmap);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f10831o = true;
    }

    public void setAlpha(int i10) {
        h().setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z10, boolean z11) {
        j.a(!this.f10827k, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f10828l = z10;
        if (!z10) {
            o();
        } else if (this.f10826j) {
            n();
        }
        return super.setVisible(z10, z11);
    }

    public void start() {
        this.f10826j = true;
        l();
        if (this.f10828l) {
            n();
        }
    }

    public void stop() {
        this.f10826j = false;
        o();
    }

    c(a aVar) {
        this.f10828l = true;
        this.f10830n = -1;
        this.f10824h = (a) j.d(aVar);
    }
}
