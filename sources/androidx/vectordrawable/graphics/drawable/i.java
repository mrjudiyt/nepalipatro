package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import androidx.core.graphics.d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VectorDrawableCompat */
public class i extends h {

    /* renamed from: r  reason: collision with root package name */
    static final PorterDuff.Mode f4497r = PorterDuff.Mode.SRC_IN;

    /* renamed from: i  reason: collision with root package name */
    private h f4498i;

    /* renamed from: j  reason: collision with root package name */
    private PorterDuffColorFilter f4499j;

    /* renamed from: k  reason: collision with root package name */
    private ColorFilter f4500k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f4501l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f4502m;

    /* renamed from: n  reason: collision with root package name */
    private Drawable.ConstantState f4503n;

    /* renamed from: o  reason: collision with root package name */
    private final float[] f4504o;

    /* renamed from: p  reason: collision with root package name */
    private final Matrix f4505p;

    /* renamed from: q  reason: collision with root package name */
    private final Rect f4506q;

    /* compiled from: VectorDrawableCompat */
    private static class b extends f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f4533b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f4532a = androidx.core.graphics.d.d(string2);
            }
            this.f4534c = k.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.r(xmlPullParser, "pathData")) {
                TypedArray s10 = k.s(resources, theme, attributeSet, a.f4470d);
                f(s10, xmlPullParser);
                s10.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* compiled from: VectorDrawableCompat */
    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* compiled from: VectorDrawableCompat */
    private static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f4553a;

        /* renamed from: b  reason: collision with root package name */
        g f4554b;

        /* renamed from: c  reason: collision with root package name */
        ColorStateList f4555c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f4556d;

        /* renamed from: e  reason: collision with root package name */
        boolean f4557e;

        /* renamed from: f  reason: collision with root package name */
        Bitmap f4558f;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f4559g;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f4560h;

        /* renamed from: i  reason: collision with root package name */
        int f4561i;

        /* renamed from: j  reason: collision with root package name */
        boolean f4562j;

        /* renamed from: k  reason: collision with root package name */
        boolean f4563k;

        /* renamed from: l  reason: collision with root package name */
        Paint f4564l;

        public h(h hVar) {
            this.f4555c = null;
            this.f4556d = i.f4497r;
            if (hVar != null) {
                this.f4553a = hVar.f4553a;
                g gVar = new g(hVar.f4554b);
                this.f4554b = gVar;
                if (hVar.f4554b.f4541e != null) {
                    gVar.f4541e = new Paint(hVar.f4554b.f4541e);
                }
                if (hVar.f4554b.f4540d != null) {
                    this.f4554b.f4540d = new Paint(hVar.f4554b.f4540d);
                }
                this.f4555c = hVar.f4555c;
                this.f4556d = hVar.f4556d;
                this.f4557e = hVar.f4557e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f4558f.getWidth() && i11 == this.f4558f.getHeight();
        }

        public boolean b() {
            return !this.f4563k && this.f4559g == this.f4555c && this.f4560h == this.f4556d && this.f4562j == this.f4557e && this.f4561i == this.f4554b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f4558f == null || !a(i10, i11)) {
                this.f4558f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f4563k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f4558f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f4564l == null) {
                Paint paint = new Paint();
                this.f4564l = paint;
                paint.setFilterBitmap(true);
            }
            this.f4564l.setAlpha(this.f4554b.getRootAlpha());
            this.f4564l.setColorFilter(colorFilter);
            return this.f4564l;
        }

        public boolean f() {
            return this.f4554b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f4554b.f();
        }

        public int getChangingConfigurations() {
            return this.f4553a;
        }

        public boolean h(int[] iArr) {
            boolean g10 = this.f4554b.g(iArr);
            this.f4563k |= g10;
            return g10;
        }

        public void i() {
            this.f4559g = this.f4555c;
            this.f4560h = this.f4556d;
            this.f4561i = this.f4554b.getRootAlpha();
            this.f4562j = this.f4557e;
            this.f4563k = false;
        }

        public void j(int i10, int i11) {
            this.f4558f.eraseColor(0);
            this.f4554b.b(new Canvas(this.f4558f), i10, i11, (ColorFilter) null);
        }

        public Drawable newDrawable() {
            return new i(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new i(this);
        }

        public h() {
            this.f4555c = null;
            this.f4556d = i.f4497r;
            this.f4554b = new g();
        }
    }

    i() {
        this.f4502m = true;
        this.f4504o = new float[9];
        this.f4505p = new Matrix();
        this.f4506q = new Rect();
        this.f4498i = new h();
    }

    static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (((float) Color.alpha(i10)) * f10)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034 A[Catch:{ IOException | XmlPullParserException -> 0x0041 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039 A[Catch:{ IOException | XmlPullParserException -> 0x0041 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.vectordrawable.graphics.drawable.i b(android.content.res.Resources r4, int r5, android.content.res.Resources.Theme r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x001f
            androidx.vectordrawable.graphics.drawable.i r0 = new androidx.vectordrawable.graphics.drawable.i
            r0.<init>()
            android.graphics.drawable.Drawable r4 = androidx.core.content.res.h.d(r4, r5, r6)
            r0.f4496h = r4
            androidx.vectordrawable.graphics.drawable.i$i r4 = new androidx.vectordrawable.graphics.drawable.i$i
            android.graphics.drawable.Drawable r5 = r0.f4496h
            android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()
            r4.<init>(r5)
            r0.f4503n = r4
            return r0
        L_0x001f:
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
        L_0x0027:
            int r1 = r5.next()     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            r2 = 2
            if (r1 == r2) goto L_0x0032
            r3 = 1
            if (r1 == r3) goto L_0x0032
            goto L_0x0027
        L_0x0032:
            if (r1 != r2) goto L_0x0039
            androidx.vectordrawable.graphics.drawable.i r4 = c(r4, r5, r0, r6)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            return r4
        L_0x0039:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            throw r4     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
        L_0x0041:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.i.b(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.vectordrawable.graphics.drawable.i");
    }

    public static i c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        i iVar = new i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        h hVar = this.f4498i;
        g gVar = hVar.f4554b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f4544h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4520b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f4552p.put(cVar.getPathName(), cVar);
                    }
                    z10 = false;
                    hVar.f4553a = cVar.f4535d | hVar.f4553a;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4520b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f4552p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f4553a = bVar.f4535d | hVar.f4553a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4520b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f4552p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f4553a = dVar2.f4529k | hVar.f4553a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        if (Build.VERSION.SDK_INT < 17 || !isAutoMirrored() || androidx.core.graphics.drawable.a.e(this) != 1) {
            return false;
        }
        return true;
    }

    private static PorterDuff.Mode g(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        h hVar = this.f4498i;
        g gVar = hVar.f4554b;
        hVar.f4556d = g(k.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList g10 = k.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (g10 != null) {
            hVar.f4555c = g10;
        }
        hVar.f4557e = k.e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f4557e);
        gVar.f4547k = k.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f4547k);
        float j10 = k.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f4548l);
        gVar.f4548l = j10;
        if (gVar.f4547k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (j10 > 0.0f) {
            gVar.f4545i = typedArray.getDimension(3, gVar.f4545i);
            float dimension = typedArray.getDimension(2, gVar.f4546j);
            gVar.f4546j = dimension;
            if (gVar.f4545i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(k.j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f4550n = string;
                    gVar.f4552p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f4496h;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* access modifiers changed from: package-private */
    public Object d(String str) {
        return this.f4498i.f4554b.f4552p.get(str);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f4506q);
        if (this.f4506q.width() > 0 && this.f4506q.height() > 0) {
            ColorFilter colorFilter = this.f4500k;
            if (colorFilter == null) {
                colorFilter = this.f4499j;
            }
            canvas.getMatrix(this.f4505p);
            this.f4505p.getValues(this.f4504o);
            float abs = Math.abs(this.f4504o[0]);
            float abs2 = Math.abs(this.f4504o[4]);
            float abs3 = Math.abs(this.f4504o[1]);
            float abs4 = Math.abs(this.f4504o[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f4506q.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f4506q.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f4506q;
                canvas.translate((float) rect.left, (float) rect.top);
                if (f()) {
                    canvas.translate((float) this.f4506q.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f4506q.offsetTo(0, 0);
                this.f4498i.c(min, min2);
                if (!this.f4502m) {
                    this.f4498i.j(min, min2);
                } else if (!this.f4498i.b()) {
                    this.f4498i.j(min, min2);
                    this.f4498i.i();
                }
                this.f4498i.d(canvas, colorFilter, this.f4506q);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.c(drawable);
        }
        return this.f4498i.f4554b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f4498i.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.d(drawable);
        }
        return this.f4500k;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f4496h != null && Build.VERSION.SDK_INT >= 24) {
            return new C0079i(this.f4496h.getConstantState());
        }
        this.f4498i.f4553a = getChangingConfigurations();
        return this.f4498i;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f4498i.f4554b.f4546j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f4498i.f4554b.f4545i;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* access modifiers changed from: package-private */
    public void h(boolean z10) {
        this.f4502m = z10;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.g(drawable);
        }
        return this.f4498i.f4557e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f4498i.f4555c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f4498i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f4496h
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.graphics.drawable.i$h r0 = r1.f4498i
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.graphics.drawable.i$h r0 = r1.f4498i
            android.content.res.ColorStateList r0 = r0.f4555c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.i.isStateful():boolean");
    }

    /* access modifiers changed from: package-private */
    public PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f4501l && super.mutate() == this) {
            this.f4498i = new h(this.f4498i);
            this.f4501l = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z10 = false;
        h hVar = this.f4498i;
        ColorStateList colorStateList = hVar.f4555c;
        if (!(colorStateList == null || (mode = hVar.f4556d) == null)) {
            this.f4499j = j(this.f4499j, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    public void setAlpha(int i10) {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f4498i.f4554b.getRootAlpha() != i10) {
            this.f4498i.f4554b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.i(drawable, z10);
        } else {
            this.f4498i.f4557e = z10;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i10) {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, colorStateList);
            return;
        }
        h hVar = this.f4498i;
        if (hVar.f4555c != colorStateList) {
            hVar.f4555c = colorStateList;
            this.f4499j = j(this.f4499j, colorStateList, hVar.f4556d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, mode);
            return;
        }
        h hVar = this.f4498i;
        if (hVar.f4556d != mode) {
            hVar.f4556d = mode;
            this.f4499j = j(this.f4499j, hVar.f4555c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$i  reason: collision with other inner class name */
    /* compiled from: VectorDrawableCompat */
    private static class C0079i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f4565a;

        public C0079i(Drawable.ConstantState constantState) {
            this.f4565a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f4565a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f4565a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            i iVar = new i();
            iVar.f4496h = (VectorDrawable) this.f4565a.newDrawable();
            return iVar;
        }

        public Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f4496h = (VectorDrawable) this.f4565a.newDrawable(resources);
            return iVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f4496h = (VectorDrawable) this.f4565a.newDrawable(resources, theme);
            return iVar;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f4500k = colorFilter;
        invalidateSelf();
    }

    /* compiled from: VectorDrawableCompat */
    private static abstract class f extends e {

        /* renamed from: a  reason: collision with root package name */
        protected d.b[] f4532a = null;

        /* renamed from: b  reason: collision with root package name */
        String f4533b;

        /* renamed from: c  reason: collision with root package name */
        int f4534c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f4535d;

        public f() {
            super();
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            d.b[] bVarArr = this.f4532a;
            if (bVarArr != null) {
                d.b.e(bVarArr, path);
            }
        }

        public d.b[] getPathData() {
            return this.f4532a;
        }

        public String getPathName() {
            return this.f4533b;
        }

        public void setPathData(d.b[] bVarArr) {
            if (!androidx.core.graphics.d.b(this.f4532a, bVarArr)) {
                this.f4532a = androidx.core.graphics.d.f(bVarArr);
            } else {
                androidx.core.graphics.d.j(this.f4532a, bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f4533b = fVar.f4533b;
            this.f4535d = fVar.f4535d;
            this.f4532a = androidx.core.graphics.d.f(fVar.f4532a);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f4498i;
        hVar.f4554b = new g();
        TypedArray s10 = k.s(resources, theme, attributeSet, a.f4467a);
        i(s10, xmlPullParser, theme);
        s10.recycle();
        hVar.f4553a = getChangingConfigurations();
        hVar.f4563k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f4499j = j(this.f4499j, hVar.f4555c, hVar.f4556d);
    }

    i(h hVar) {
        this.f4502m = true;
        this.f4504o = new float[9];
        this.f4505p = new Matrix();
        this.f4506q = new Rect();
        this.f4498i = hVar;
        this.f4499j = j(this.f4499j, hVar.f4555c, hVar.f4556d);
    }

    /* compiled from: VectorDrawableCompat */
    private static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private int[] f4507e;

        /* renamed from: f  reason: collision with root package name */
        androidx.core.content.res.d f4508f;

        /* renamed from: g  reason: collision with root package name */
        float f4509g = 0.0f;

        /* renamed from: h  reason: collision with root package name */
        androidx.core.content.res.d f4510h;

        /* renamed from: i  reason: collision with root package name */
        float f4511i = 1.0f;

        /* renamed from: j  reason: collision with root package name */
        float f4512j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        float f4513k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        float f4514l = 1.0f;

        /* renamed from: m  reason: collision with root package name */
        float f4515m = 0.0f;

        /* renamed from: n  reason: collision with root package name */
        Paint.Cap f4516n = Paint.Cap.BUTT;

        /* renamed from: o  reason: collision with root package name */
        Paint.Join f4517o = Paint.Join.MITER;

        /* renamed from: p  reason: collision with root package name */
        float f4518p = 4.0f;

        c() {
        }

        private Paint.Cap e(int i10, Paint.Cap cap) {
            if (i10 == 0) {
                return Paint.Cap.BUTT;
            }
            if (i10 != 1) {
                return i10 != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        private Paint.Join f(int i10, Paint.Join join) {
            if (i10 == 0) {
                return Paint.Join.MITER;
            }
            if (i10 != 1) {
                return i10 != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f4507e = null;
            if (k.r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f4533b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f4532a = androidx.core.graphics.d.d(string2);
                }
                Resources.Theme theme2 = theme;
                this.f4510h = k.i(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f4512j = k.j(typedArray, xmlPullParser, "fillAlpha", 12, this.f4512j);
                this.f4516n = e(k.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f4516n);
                this.f4517o = f(k.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f4517o);
                this.f4518p = k.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f4518p);
                this.f4508f = k.i(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f4511i = k.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f4511i);
                this.f4509g = k.j(typedArray, xmlPullParser, "strokeWidth", 4, this.f4509g);
                this.f4514l = k.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f4514l);
                this.f4515m = k.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f4515m);
                this.f4513k = k.j(typedArray, xmlPullParser, "trimPathStart", 5, this.f4513k);
                this.f4534c = k.k(typedArray, xmlPullParser, "fillType", 13, this.f4534c);
            }
        }

        public boolean a() {
            return this.f4510h.i() || this.f4508f.i();
        }

        public boolean b(int[] iArr) {
            return this.f4508f.j(iArr) | this.f4510h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s10 = k.s(resources, theme, attributeSet, a.f4469c);
            h(s10, xmlPullParser, theme);
            s10.recycle();
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f4512j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f4510h.e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f4511i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f4508f.e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f4509g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f4514l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f4515m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f4513k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f10) {
            this.f4512j = f10;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i10) {
            this.f4510h.k(i10);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f10) {
            this.f4511i = f10;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i10) {
            this.f4508f.k(i10);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f10) {
            this.f4509g = f10;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f10) {
            this.f4514l = f10;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f10) {
            this.f4515m = f10;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f10) {
            this.f4513k = f10;
        }

        c(c cVar) {
            super(cVar);
            this.f4507e = cVar.f4507e;
            this.f4508f = cVar.f4508f;
            this.f4509g = cVar.f4509g;
            this.f4511i = cVar.f4511i;
            this.f4510h = cVar.f4510h;
            this.f4534c = cVar.f4534c;
            this.f4512j = cVar.f4512j;
            this.f4513k = cVar.f4513k;
            this.f4514l = cVar.f4514l;
            this.f4515m = cVar.f4515m;
            this.f4516n = cVar.f4516n;
            this.f4517o = cVar.f4517o;
            this.f4518p = cVar.f4518p;
        }
    }

    /* compiled from: VectorDrawableCompat */
    private static class g {

        /* renamed from: q  reason: collision with root package name */
        private static final Matrix f4536q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        private final Path f4537a;

        /* renamed from: b  reason: collision with root package name */
        private final Path f4538b;

        /* renamed from: c  reason: collision with root package name */
        private final Matrix f4539c;

        /* renamed from: d  reason: collision with root package name */
        Paint f4540d;

        /* renamed from: e  reason: collision with root package name */
        Paint f4541e;

        /* renamed from: f  reason: collision with root package name */
        private PathMeasure f4542f;

        /* renamed from: g  reason: collision with root package name */
        private int f4543g;

        /* renamed from: h  reason: collision with root package name */
        final d f4544h;

        /* renamed from: i  reason: collision with root package name */
        float f4545i;

        /* renamed from: j  reason: collision with root package name */
        float f4546j;

        /* renamed from: k  reason: collision with root package name */
        float f4547k;

        /* renamed from: l  reason: collision with root package name */
        float f4548l;

        /* renamed from: m  reason: collision with root package name */
        int f4549m;

        /* renamed from: n  reason: collision with root package name */
        String f4550n;

        /* renamed from: o  reason: collision with root package name */
        Boolean f4551o;

        /* renamed from: p  reason: collision with root package name */
        final androidx.collection.a<String, Object> f4552p;

        public g() {
            this.f4539c = new Matrix();
            this.f4545i = 0.0f;
            this.f4546j = 0.0f;
            this.f4547k = 0.0f;
            this.f4548l = 0.0f;
            this.f4549m = 255;
            this.f4550n = null;
            this.f4551o = null;
            this.f4552p = new androidx.collection.a<>();
            this.f4544h = new d();
            this.f4537a = new Path();
            this.f4538b = new Path();
        }

        private static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            dVar.f4519a.set(matrix);
            dVar.f4519a.preConcat(dVar.f4528j);
            canvas.save();
            for (int i12 = 0; i12 < dVar.f4520b.size(); i12++) {
                e eVar = dVar.f4520b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f4519a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i10, i11, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = ((float) i10) / this.f4547k;
            float f11 = ((float) i11) / this.f4548l;
            float min = Math.min(f10, f11);
            Matrix matrix = dVar.f4519a;
            this.f4539c.set(matrix);
            this.f4539c.postScale(f10, f11);
            float e10 = e(matrix);
            if (e10 != 0.0f) {
                fVar.d(this.f4537a);
                Path path = this.f4537a;
                this.f4538b.reset();
                if (fVar.c()) {
                    this.f4538b.setFillType(fVar.f4534c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f4538b.addPath(path, this.f4539c);
                    canvas.clipPath(this.f4538b);
                    return;
                }
                c cVar = (c) fVar;
                float f12 = cVar.f4513k;
                if (!(f12 == 0.0f && cVar.f4514l == 1.0f)) {
                    float f13 = cVar.f4515m;
                    float f14 = (f12 + f13) % 1.0f;
                    float f15 = (cVar.f4514l + f13) % 1.0f;
                    if (this.f4542f == null) {
                        this.f4542f = new PathMeasure();
                    }
                    this.f4542f.setPath(this.f4537a, false);
                    float length = this.f4542f.getLength();
                    float f16 = f14 * length;
                    float f17 = f15 * length;
                    path.reset();
                    if (f16 > f17) {
                        this.f4542f.getSegment(f16, length, path, true);
                        this.f4542f.getSegment(0.0f, f17, path, true);
                    } else {
                        this.f4542f.getSegment(f16, f17, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f4538b.addPath(path, this.f4539c);
                if (cVar.f4510h.l()) {
                    androidx.core.content.res.d dVar2 = cVar.f4510h;
                    if (this.f4541e == null) {
                        Paint paint = new Paint(1);
                        this.f4541e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f4541e;
                    if (dVar2.h()) {
                        Shader f18 = dVar2.f();
                        f18.setLocalMatrix(this.f4539c);
                        paint2.setShader(f18);
                        paint2.setAlpha(Math.round(cVar.f4512j * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(i.a(dVar2.e(), cVar.f4512j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.f4538b.setFillType(cVar.f4534c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f4538b, paint2);
                }
                if (cVar.f4508f.l()) {
                    androidx.core.content.res.d dVar3 = cVar.f4508f;
                    if (this.f4540d == null) {
                        Paint paint3 = new Paint(1);
                        this.f4540d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f4540d;
                    Paint.Join join = cVar.f4517o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f4516n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f4518p);
                    if (dVar3.h()) {
                        Shader f19 = dVar3.f();
                        f19.setLocalMatrix(this.f4539c);
                        paint4.setShader(f19);
                        paint4.setAlpha(Math.round(cVar.f4511i * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(i.a(dVar3.e(), cVar.f4511i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f4509g * min * e10);
                    canvas.drawPath(this.f4538b, paint4);
                }
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a10 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a10) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f4544h, f4536q, canvas, i10, i11, colorFilter);
        }

        public boolean f() {
            if (this.f4551o == null) {
                this.f4551o = Boolean.valueOf(this.f4544h.a());
            }
            return this.f4551o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f4544h.b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f4549m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f4549m = i10;
        }

        public g(g gVar) {
            this.f4539c = new Matrix();
            this.f4545i = 0.0f;
            this.f4546j = 0.0f;
            this.f4547k = 0.0f;
            this.f4548l = 0.0f;
            this.f4549m = 255;
            this.f4550n = null;
            this.f4551o = null;
            androidx.collection.a<String, Object> aVar = new androidx.collection.a<>();
            this.f4552p = aVar;
            this.f4544h = new d(gVar.f4544h, aVar);
            this.f4537a = new Path(gVar.f4537a);
            this.f4538b = new Path(gVar.f4538b);
            this.f4545i = gVar.f4545i;
            this.f4546j = gVar.f4546j;
            this.f4547k = gVar.f4547k;
            this.f4548l = gVar.f4548l;
            this.f4543g = gVar.f4543g;
            this.f4549m = gVar.f4549m;
            this.f4550n = gVar.f4550n;
            String str = gVar.f4550n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f4551o = gVar.f4551o;
        }
    }

    /* compiled from: VectorDrawableCompat */
    private static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final Matrix f4519a;

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<e> f4520b;

        /* renamed from: c  reason: collision with root package name */
        float f4521c;

        /* renamed from: d  reason: collision with root package name */
        private float f4522d;

        /* renamed from: e  reason: collision with root package name */
        private float f4523e;

        /* renamed from: f  reason: collision with root package name */
        private float f4524f;

        /* renamed from: g  reason: collision with root package name */
        private float f4525g;

        /* renamed from: h  reason: collision with root package name */
        private float f4526h;

        /* renamed from: i  reason: collision with root package name */
        private float f4527i;

        /* renamed from: j  reason: collision with root package name */
        final Matrix f4528j;

        /* renamed from: k  reason: collision with root package name */
        int f4529k;

        /* renamed from: l  reason: collision with root package name */
        private int[] f4530l;

        /* renamed from: m  reason: collision with root package name */
        private String f4531m;

        public d(d dVar, androidx.collection.a<String, Object> aVar) {
            super();
            f fVar;
            this.f4519a = new Matrix();
            this.f4520b = new ArrayList<>();
            this.f4521c = 0.0f;
            this.f4522d = 0.0f;
            this.f4523e = 0.0f;
            this.f4524f = 1.0f;
            this.f4525g = 1.0f;
            this.f4526h = 0.0f;
            this.f4527i = 0.0f;
            Matrix matrix = new Matrix();
            this.f4528j = matrix;
            this.f4531m = null;
            this.f4521c = dVar.f4521c;
            this.f4522d = dVar.f4522d;
            this.f4523e = dVar.f4523e;
            this.f4524f = dVar.f4524f;
            this.f4525g = dVar.f4525g;
            this.f4526h = dVar.f4526h;
            this.f4527i = dVar.f4527i;
            this.f4530l = dVar.f4530l;
            String str = dVar.f4531m;
            this.f4531m = str;
            this.f4529k = dVar.f4529k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f4528j);
            ArrayList<e> arrayList = dVar.f4520b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.f4520b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        fVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        fVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f4520b.add(fVar);
                    String str2 = fVar.f4533b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        private void d() {
            this.f4528j.reset();
            this.f4528j.postTranslate(-this.f4522d, -this.f4523e);
            this.f4528j.postScale(this.f4524f, this.f4525g);
            this.f4528j.postRotate(this.f4521c, 0.0f, 0.0f);
            this.f4528j.postTranslate(this.f4526h + this.f4522d, this.f4527i + this.f4523e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f4530l = null;
            this.f4521c = k.j(typedArray, xmlPullParser, "rotation", 5, this.f4521c);
            this.f4522d = typedArray.getFloat(1, this.f4522d);
            this.f4523e = typedArray.getFloat(2, this.f4523e);
            this.f4524f = k.j(typedArray, xmlPullParser, "scaleX", 3, this.f4524f);
            this.f4525g = k.j(typedArray, xmlPullParser, "scaleY", 4, this.f4525g);
            this.f4526h = k.j(typedArray, xmlPullParser, "translateX", 6, this.f4526h);
            this.f4527i = k.j(typedArray, xmlPullParser, "translateY", 7, this.f4527i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f4531m = string;
            }
            d();
        }

        public boolean a() {
            for (int i10 = 0; i10 < this.f4520b.size(); i10++) {
                if (this.f4520b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        public boolean b(int[] iArr) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.f4520b.size(); i10++) {
                z10 |= this.f4520b.get(i10).b(iArr);
            }
            return z10;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s10 = k.s(resources, theme, attributeSet, a.f4468b);
            e(s10, xmlPullParser);
            s10.recycle();
        }

        public String getGroupName() {
            return this.f4531m;
        }

        public Matrix getLocalMatrix() {
            return this.f4528j;
        }

        public float getPivotX() {
            return this.f4522d;
        }

        public float getPivotY() {
            return this.f4523e;
        }

        public float getRotation() {
            return this.f4521c;
        }

        public float getScaleX() {
            return this.f4524f;
        }

        public float getScaleY() {
            return this.f4525g;
        }

        public float getTranslateX() {
            return this.f4526h;
        }

        public float getTranslateY() {
            return this.f4527i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f4522d) {
                this.f4522d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f4523e) {
                this.f4523e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f4521c) {
                this.f4521c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f4524f) {
                this.f4524f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f4525g) {
                this.f4525g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f4526h) {
                this.f4526h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f4527i) {
                this.f4527i = f10;
                d();
            }
        }

        public d() {
            super();
            this.f4519a = new Matrix();
            this.f4520b = new ArrayList<>();
            this.f4521c = 0.0f;
            this.f4522d = 0.0f;
            this.f4523e = 0.0f;
            this.f4524f = 1.0f;
            this.f4525g = 1.0f;
            this.f4526h = 0.0f;
            this.f4527i = 0.0f;
            this.f4528j = new Matrix();
            this.f4531m = null;
        }
    }
}
