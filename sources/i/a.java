package i;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.k0;
import androidx.collection.i;
import androidx.core.content.res.k;
import i.b;
import i.d;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint({"RestrictedAPI"})
/* compiled from: AnimatedStateListDrawableCompat */
public class a extends d implements androidx.core.graphics.drawable.b {
    private static final String A = a.class.getSimpleName();

    /* renamed from: v  reason: collision with root package name */
    private c f9003v;

    /* renamed from: w  reason: collision with root package name */
    private g f9004w;

    /* renamed from: x  reason: collision with root package name */
    private int f9005x;

    /* renamed from: y  reason: collision with root package name */
    private int f9006y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f9007z;

    /* compiled from: AnimatedStateListDrawableCompat */
    private static class b extends g {

        /* renamed from: a  reason: collision with root package name */
        private final Animatable f9008a;

        b(Animatable animatable) {
            super();
            this.f9008a = animatable;
        }

        public void c() {
            this.f9008a.start();
        }

        public void d() {
            this.f9008a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    static class c extends d.a {
        androidx.collection.e<Long> K;
        i<Integer> L;

        c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
                return;
            }
            this.K = new androidx.collection.e<>();
            this.L = new i<>();
        }

        private static long D(int i10, int i11) {
            return ((long) i11) | (((long) i10) << 32);
        }

        /* access modifiers changed from: package-private */
        public int B(int[] iArr, Drawable drawable, int i10) {
            int z10 = super.z(iArr, drawable);
            this.L.i(z10, Integer.valueOf(i10));
            return z10;
        }

        /* access modifiers changed from: package-private */
        public int C(int i10, int i11, Drawable drawable, boolean z10) {
            int a10 = super.a(drawable);
            long D = D(i10, i11);
            long j10 = z10 ? 8589934592L : 0;
            long j11 = (long) a10;
            this.K.a(D, Long.valueOf(j11 | j10));
            if (z10) {
                this.K.a(D(i11, i10), Long.valueOf(4294967296L | j11 | j10));
            }
            return a10;
        }

        /* access modifiers changed from: package-private */
        public int E(int i10) {
            if (i10 < 0) {
                return 0;
            }
            return this.L.f(i10, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        public int F(int[] iArr) {
            int A = super.A(iArr);
            if (A >= 0) {
                return A;
            }
            return super.A(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        public int G(int i10, int i11) {
            return (int) this.K.f(D(i10, i11), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        public boolean H(int i10, int i11) {
            return (this.K.f(D(i10, i11), -1L).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean I(int i10, int i11) {
            return (this.K.f(D(i10, i11), -1L).longValue() & 8589934592L) != 0;
        }

        public Drawable newDrawable() {
            return new a(this, (Resources) null);
        }

        /* access modifiers changed from: package-private */
        public void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    private static class d extends g {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.vectordrawable.graphics.drawable.c f9009a;

        d(androidx.vectordrawable.graphics.drawable.c cVar) {
            super();
            this.f9009a = cVar;
        }

        public void c() {
            this.f9009a.start();
        }

        public void d() {
            this.f9009a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    private static class e extends g {

        /* renamed from: a  reason: collision with root package name */
        private final ObjectAnimator f9010a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f9011b;

        e(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i10 = z10 ? numberOfFrames - 1 : 0;
            int i11 = z10 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z10);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i10, i11});
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) fVar.a());
            ofInt.setInterpolator(fVar);
            this.f9011b = z11;
            this.f9010a = ofInt;
        }

        public boolean a() {
            return this.f9011b;
        }

        public void b() {
            this.f9010a.reverse();
        }

        public void c() {
            this.f9010a.start();
        }

        public void d() {
            this.f9010a.cancel();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    private static class f implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        private int[] f9012a;

        /* renamed from: b  reason: collision with root package name */
        private int f9013b;

        /* renamed from: c  reason: collision with root package name */
        private int f9014c;

        f(AnimationDrawable animationDrawable, boolean z10) {
            b(animationDrawable, z10);
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f9014c;
        }

        /* access modifiers changed from: package-private */
        public int b(AnimationDrawable animationDrawable, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f9013b = numberOfFrames;
            int[] iArr = this.f9012a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f9012a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f9012a;
            int i10 = 0;
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames - i11) - 1 : i11);
                iArr2[i11] = duration;
                i10 += duration;
            }
            this.f9014c = i10;
            return i10;
        }

        public float getInterpolation(float f10) {
            int i10 = (int) ((f10 * ((float) this.f9014c)) + 0.5f);
            int i11 = this.f9013b;
            int[] iArr = this.f9012a;
            int i12 = 0;
            while (i12 < i11 && i10 >= iArr[i12]) {
                i10 -= iArr[i12];
                i12++;
            }
            return (((float) i12) / ((float) i11)) + (i12 < i11 ? ((float) i10) / ((float) this.f9014c) : 0.0f);
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    private static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this((c) null, (Resources) null);
    }

    public static a m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        q(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        r(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    private void p() {
        onStateChange(getState());
    }

    private int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray s10 = k.s(resources, theme, attributeSet, j.b.f9368h);
        int resourceId = s10.getResourceId(j.b.f9369i, 0);
        int resourceId2 = s10.getResourceId(j.b.f9370j, -1);
        Drawable j10 = resourceId2 > 0 ? k0.h().j(context, resourceId2) : null;
        s10.recycle();
        int[] k10 = k(attributeSet);
        if (j10 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("vector")) {
                j10 = androidx.vectordrawable.graphics.drawable.i.c(resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                j10 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                j10 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (j10 != null) {
            return this.f9003v.B(k10, j10, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray s10 = k.s(resources, theme, attributeSet, j.b.f9371k);
        int resourceId = s10.getResourceId(j.b.f9374n, -1);
        int resourceId2 = s10.getResourceId(j.b.f9373m, -1);
        int resourceId3 = s10.getResourceId(j.b.f9372l, -1);
        Drawable j10 = resourceId3 > 0 ? k0.h().j(context, resourceId3) : null;
        boolean z10 = s10.getBoolean(j.b.f9375o, false);
        s10.recycle();
        if (j10 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                j10 = androidx.vectordrawable.graphics.drawable.c.a(context, resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                j10 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                j10 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (j10 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f9003v.C(resourceId, resourceId2, j10, z10);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    private boolean s(int i10) {
        int i11;
        int G;
        g gVar;
        g gVar2 = this.f9004w;
        if (gVar2 == null) {
            i11 = c();
        } else if (i10 == this.f9005x) {
            return true;
        } else {
            if (i10 != this.f9006y || !gVar2.a()) {
                i11 = this.f9005x;
                gVar2.d();
            } else {
                gVar2.b();
                this.f9005x = this.f9006y;
                this.f9006y = i10;
                return true;
            }
        }
        this.f9004w = null;
        this.f9006y = -1;
        this.f9005x = -1;
        c cVar = this.f9003v;
        int E = cVar.E(i11);
        int E2 = cVar.E(i10);
        if (E2 == 0 || E == 0 || (G = cVar.G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.I(E, E2);
        g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new e((AnimationDrawable) current, cVar.H(E, E2), I);
        } else if (current instanceof androidx.vectordrawable.graphics.drawable.c) {
            gVar = new d((androidx.vectordrawable.graphics.drawable.c) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new b((Animatable) current);
            }
            return false;
        }
        gVar.c();
        this.f9004w = gVar;
        this.f9006y = i11;
        this.f9005x = i10;
        return true;
    }

    private void t(TypedArray typedArray) {
        c cVar = this.f9003v;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f9032d |= typedArray.getChangingConfigurations();
        }
        cVar.x(typedArray.getBoolean(j.b.f9364d, cVar.f9037i));
        cVar.t(typedArray.getBoolean(j.b.f9365e, cVar.f9040l));
        cVar.u(typedArray.getInt(j.b.f9366f, cVar.A));
        cVar.v(typedArray.getInt(j.b.f9367g, cVar.B));
        setDither(typedArray.getBoolean(j.b.f9362b, cVar.f9052x));
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    public void h(b.c cVar) {
        super.h(cVar);
        if (cVar instanceof c) {
            this.f9003v = (c) cVar;
        }
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f9004w;
        if (gVar != null) {
            gVar.d();
            this.f9004w = null;
            g(this.f9005x);
            this.f9005x = -1;
            this.f9006y = -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public c j() {
        return new c(this.f9003v, this, (Resources) null);
    }

    public Drawable mutate() {
        if (!this.f9007z && super.mutate() == this) {
            this.f9003v.r();
            this.f9007z = true;
        }
        return this;
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray s10 = k.s(resources, theme, attributeSet, j.b.f9361a);
        setVisible(s10.getBoolean(j.b.f9363c, true), true);
        t(s10);
        i(resources);
        s10.recycle();
        o(context, resources, xmlPullParser, attributeSet, theme);
        p();
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i10) {
        return super.onLayoutDirectionChanged(i10);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int F = this.f9003v.F(iArr);
        boolean z10 = F != c() && (s(F) || g(F));
        Drawable current = getCurrent();
        return current != null ? z10 | current.setState(iArr) : z10;
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        super.scheduleDrawable(drawable, runnable, j10);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z10) {
        super.setAutoMirrored(z10);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z10) {
        super.setDither(z10);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        g gVar = this.f9004w;
        if (gVar != null && (visible || z11)) {
            if (z10) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    a(c cVar, Resources resources) {
        super((d.a) null);
        this.f9005x = -1;
        this.f9006y = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
