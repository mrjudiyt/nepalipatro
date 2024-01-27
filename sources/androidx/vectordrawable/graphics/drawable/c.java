package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: AnimatedVectorDrawableCompat */
public class c extends h implements Animatable {

    /* renamed from: i  reason: collision with root package name */
    private b f4479i;

    /* renamed from: j  reason: collision with root package name */
    private Context f4480j;

    /* renamed from: k  reason: collision with root package name */
    private ArgbEvaluator f4481k;

    /* renamed from: l  reason: collision with root package name */
    private Animator.AnimatorListener f4482l;

    /* renamed from: m  reason: collision with root package name */
    ArrayList<b> f4483m;

    /* renamed from: n  reason: collision with root package name */
    final Drawable.Callback f4484n;

    /* compiled from: AnimatedVectorDrawableCompat */
    class a implements Drawable.Callback {
        a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            c.this.scheduleSelf(runnable, j10);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat */
    private static class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f4486a;

        /* renamed from: b  reason: collision with root package name */
        i f4487b;

        /* renamed from: c  reason: collision with root package name */
        AnimatorSet f4488c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<Animator> f4489d;

        /* renamed from: e  reason: collision with root package name */
        androidx.collection.a<Animator, String> f4490e;

        public b(Context context, b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f4486a = bVar.f4486a;
                i iVar = bVar.f4487b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    if (resources != null) {
                        this.f4487b = (i) constantState.newDrawable(resources);
                    } else {
                        this.f4487b = (i) constantState.newDrawable();
                    }
                    i iVar2 = (i) this.f4487b.mutate();
                    this.f4487b = iVar2;
                    iVar2.setCallback(callback);
                    this.f4487b.setBounds(bVar.f4487b.getBounds());
                    this.f4487b.h(false);
                }
                ArrayList<Animator> arrayList = bVar.f4489d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f4489d = new ArrayList<>(size);
                    this.f4490e = new androidx.collection.a<>(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = bVar.f4489d.get(i10);
                        Animator clone = animator.clone();
                        String str = bVar.f4490e.get(animator);
                        clone.setTarget(this.f4487b.d(str));
                        this.f4489d.add(clone);
                        this.f4490e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f4488c == null) {
                this.f4488c = new AnimatorSet();
            }
            this.f4488c.playTogether(this.f4489d);
        }

        public int getChangingConfigurations() {
            return this.f4486a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    c() {
        this((Context) null, (b) null, (Resources) null);
    }

    public static c a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        c cVar = new c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    private void b(String str, Animator animator) {
        animator.setTarget(this.f4479i.f4487b.d(str));
        if (Build.VERSION.SDK_INT < 21) {
            c(animator);
        }
        b bVar = this.f4479i;
        if (bVar.f4489d == null) {
            bVar.f4489d = new ArrayList<>();
            this.f4479i.f4490e = new androidx.collection.a<>();
        }
        this.f4479i.f4489d.add(animator);
        this.f4479i.f4490e.put(animator, str);
    }

    private void c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i10 = 0; i10 < childAnimations.size(); i10++) {
                c(childAnimations.get(i10));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f4481k == null) {
                    this.f4481k = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f4481k);
            }
        }
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f4479i.f4487b.draw(canvas);
        if (this.f4479i.f4488c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.c(drawable);
        }
        return this.f4479i.f4487b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f4479i.f4486a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.d(drawable);
        }
        return this.f4479i.f4487b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f4496h == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0078c(this.f4496h.getConstantState());
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f4479i.f4487b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f4479i.f4487b.getIntrinsicWidth();
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
        return this.f4479i.f4487b.getOpacity();
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

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray s10 = k.s(resources, theme, attributeSet, a.f4471e);
                    int resourceId = s10.getResourceId(0, 0);
                    if (resourceId != 0) {
                        i b10 = i.b(resources, resourceId, theme);
                        b10.h(false);
                        b10.setCallback(this.f4484n);
                        i iVar = this.f4479i.f4487b;
                        if (iVar != null) {
                            iVar.setCallback((Drawable.Callback) null);
                        }
                        this.f4479i.f4487b = b10;
                    }
                    s10.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f4472f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f4480j;
                        if (context != null) {
                            b(string, e.i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f4479i.a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.g(drawable);
        }
        return this.f4479i.f4487b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f4479i.f4488c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f4479i.f4487b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f4479i.f4487b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        return this.f4479i.f4487b.setLevel(i10);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f4479i.f4487b.setState(iArr);
    }

    public void setAlpha(int i10) {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f4479i.f4487b.setAlpha(i10);
        }
    }

    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.i(drawable, z10);
        } else {
            this.f4479i.f4487b.setAutoMirrored(z10);
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
            this.f4479i.f4487b.setTint(i10);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, colorStateList);
        } else {
            this.f4479i.f4487b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, mode);
        } else {
            this.f4479i.f4487b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f4479i.f4487b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    public void start() {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f4479i.f4488c.isStarted()) {
            this.f4479i.f4488c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f4479i.f4488c.end();
        }
    }

    private c(Context context) {
        this(context, (b) null, (Resources) null);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4496h;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4479i.f4487b.setColorFilter(colorFilter);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c  reason: collision with other inner class name */
    /* compiled from: AnimatedVectorDrawableCompat */
    private static class C0078c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f4491a;

        public C0078c(Drawable.ConstantState constantState) {
            this.f4491a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f4491a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f4491a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            c cVar = new c();
            Drawable newDrawable = this.f4491a.newDrawable();
            cVar.f4496h = newDrawable;
            newDrawable.setCallback(cVar.f4484n);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable newDrawable = this.f4491a.newDrawable(resources);
            cVar.f4496h = newDrawable;
            newDrawable.setCallback(cVar.f4484n);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable newDrawable = this.f4491a.newDrawable(resources, theme);
            cVar.f4496h = newDrawable;
            newDrawable.setCallback(cVar.f4484n);
            return cVar;
        }
    }

    private c(Context context, b bVar, Resources resources) {
        this.f4481k = null;
        this.f4482l = null;
        this.f4483m = null;
        a aVar = new a();
        this.f4484n = aVar;
        this.f4480j = context;
        if (bVar != null) {
            this.f4479i = bVar;
        } else {
            this.f4479i = new b(context, bVar, aVar, resources);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
