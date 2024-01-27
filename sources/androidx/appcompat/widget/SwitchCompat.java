package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.view.z;
import androidx.core.widget.i;
import f.j;

public class SwitchCompat extends CompoundButton {
    private static final Property<SwitchCompat, Float> U = new a(Float.class, "thumbPos");
    private static final int[] V = {16842912};
    private float A;
    private float B;
    private VelocityTracker C;
    private int D;
    float E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private final TextPaint M;
    private ColorStateList N;
    private Layout O;
    private Layout P;
    private TransformationMethod Q;
    ObjectAnimator R;
    private final w S;
    private final Rect T;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f943h;

    /* renamed from: i  reason: collision with root package name */
    private ColorStateList f944i;

    /* renamed from: j  reason: collision with root package name */
    private PorterDuff.Mode f945j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f946k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f947l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f948m;

    /* renamed from: n  reason: collision with root package name */
    private ColorStateList f949n;

    /* renamed from: o  reason: collision with root package name */
    private PorterDuff.Mode f950o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f951p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f952q;

    /* renamed from: r  reason: collision with root package name */
    private int f953r;

    /* renamed from: s  reason: collision with root package name */
    private int f954s;

    /* renamed from: t  reason: collision with root package name */
    private int f955t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f956u;

    /* renamed from: v  reason: collision with root package name */
    private CharSequence f957v;

    /* renamed from: w  reason: collision with root package name */
    private CharSequence f958w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f959x;

    /* renamed from: y  reason: collision with root package name */
    private int f960y;

    /* renamed from: z  reason: collision with root package name */
    private int f961z;

    class a extends Property<SwitchCompat, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.E);
        }

        /* renamed from: b */
        public void set(SwitchCompat switchCompat, Float f10) {
            switchCompat.setThumbPosition(f10.floatValue());
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.J);
    }

    private void a(boolean z10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, U, new float[]{z10 ? 1.0f : 0.0f});
        this.R = ofFloat;
        ofFloat.setDuration(250);
        if (Build.VERSION.SDK_INT >= 18) {
            this.R.setAutoCancel(true);
        }
        this.R.start();
    }

    private void b() {
        Drawable drawable = this.f943h;
        if (drawable == null) {
            return;
        }
        if (this.f946k || this.f947l) {
            Drawable mutate = androidx.core.graphics.drawable.a.q(drawable).mutate();
            this.f943h = mutate;
            if (this.f946k) {
                androidx.core.graphics.drawable.a.n(mutate, this.f944i);
            }
            if (this.f947l) {
                androidx.core.graphics.drawable.a.o(this.f943h, this.f945j);
            }
            if (this.f943h.isStateful()) {
                this.f943h.setState(getDrawableState());
            }
        }
    }

    private void c() {
        Drawable drawable = this.f948m;
        if (drawable == null) {
            return;
        }
        if (this.f951p || this.f952q) {
            Drawable mutate = androidx.core.graphics.drawable.a.q(drawable).mutate();
            this.f948m = mutate;
            if (this.f951p) {
                androidx.core.graphics.drawable.a.n(mutate, this.f949n);
            }
            if (this.f952q) {
                androidx.core.graphics.drawable.a.o(this.f948m, this.f950o);
            }
            if (this.f948m.isStateful()) {
                this.f948m.setState(getDrawableState());
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.R;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private static float f(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    private boolean g(float f10, float f11) {
        if (this.f943h == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f943h.getPadding(this.T);
        int i10 = this.J;
        int i11 = this.f961z;
        int i12 = i10 - i11;
        int i13 = (this.I + thumbOffset) - i11;
        Rect rect = this.T;
        int i14 = this.H + i13 + rect.left + rect.right + i11;
        int i15 = this.L + i11;
        if (f10 <= ((float) i13) || f10 >= ((float) i14) || f11 <= ((float) i12) || f11 >= ((float) i15)) {
            return false;
        }
        return true;
    }

    private boolean getTargetCheckedState() {
        return this.E > 0.5f;
    }

    private int getThumbOffset() {
        float f10;
        if (a1.b(this)) {
            f10 = 1.0f - this.E;
        } else {
            f10 = this.E;
        }
        return (int) ((f10 * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f948m;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.T;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.f943h;
        if (drawable2 != null) {
            rect = c0.d(drawable2);
        } else {
            rect = c0.f1028c;
        }
        return ((((this.F - this.H) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    private Layout h(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.Q;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.M;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k(int i10, int i11) {
        Typeface typeface;
        if (i10 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i10 != 2) {
            typeface = i10 != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        j(typeface, i11);
    }

    private void l(MotionEvent motionEvent) {
        this.f960y = 0;
        boolean z10 = true;
        boolean z11 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z11) {
            this.C.computeCurrentVelocity(1000);
            float xVelocity = this.C.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.D)) {
                z10 = getTargetCheckedState();
            } else if (!a1.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z10 = false;
            }
        } else {
            z10 = isChecked;
        }
        if (z10 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z10);
        e(motionEvent);
    }

    public void draw(Canvas canvas) {
        Rect rect;
        int i10;
        int i11;
        Rect rect2 = this.T;
        int i12 = this.I;
        int i13 = this.J;
        int i14 = this.K;
        int i15 = this.L;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f943h;
        if (drawable != null) {
            rect = c0.d(drawable);
        } else {
            rect = c0.f1028c;
        }
        Drawable drawable2 = this.f948m;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i16 = rect2.left;
            thumbOffset += i16;
            if (rect != null) {
                int i17 = rect.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rect.top;
                int i19 = rect2.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = rect.right;
                int i21 = rect2.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rect.bottom;
                int i23 = rect2.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                    this.f948m.setBounds(i12, i10, i14, i11);
                }
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f948m.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f943h;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i24 = thumbOffset - rect2.left;
            int i25 = thumbOffset + this.H + rect2.right;
            this.f943h.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                androidx.core.graphics.drawable.a.k(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f10, f11);
        }
        Drawable drawable = this.f943h;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, f10, f11);
        }
        Drawable drawable2 = this.f948m;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.a.j(drawable2, f10, f11);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f943h;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f948m;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!a1.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.F;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f955t : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (a1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.F;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f955t : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f959x;
    }

    public boolean getSplitTrack() {
        return this.f956u;
    }

    public int getSwitchMinWidth() {
        return this.f954s;
    }

    public int getSwitchPadding() {
        return this.f955t;
    }

    public CharSequence getTextOff() {
        return this.f958w;
    }

    public CharSequence getTextOn() {
        return this.f957v;
    }

    public Drawable getThumbDrawable() {
        return this.f943h;
    }

    public int getThumbTextPadding() {
        return this.f953r;
    }

    public ColorStateList getThumbTintList() {
        return this.f944i;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f945j;
    }

    public Drawable getTrackDrawable() {
        return this.f948m;
    }

    public ColorStateList getTrackTintList() {
        return this.f949n;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f950o;
    }

    public void i(Context context, int i10) {
        u0 s10 = u0.s(context, i10, j.X2);
        ColorStateList c10 = s10.c(j.f8328b3);
        if (c10 != null) {
            this.N = c10;
        } else {
            this.N = getTextColors();
        }
        int e10 = s10.e(j.Y2, 0);
        if (e10 != 0) {
            float f10 = (float) e10;
            if (f10 != this.M.getTextSize()) {
                this.M.setTextSize(f10);
                requestLayout();
            }
        }
        k(s10.j(j.Z2, -1), s10.j(j.f8323a3, -1));
        if (s10.a(j.f8363i3, false)) {
            this.Q = new k.a(getContext());
        } else {
            this.Q = null;
        }
        s10.v();
    }

    public void j(Typeface typeface, int i10) {
        Typeface typeface2;
        float f10 = 0.0f;
        boolean z10 = false;
        if (i10 > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i10);
            } else {
                typeface2 = Typeface.create(typeface, i10);
            }
            setSwitchTypeface(typeface2);
            int i11 = (~(typeface2 != null ? typeface2.getStyle() : 0)) & i10;
            TextPaint textPaint = this.M;
            if ((i11 & 1) != 0) {
                z10 = true;
            }
            textPaint.setFakeBoldText(z10);
            TextPaint textPaint2 = this.M;
            if ((i11 & 2) != 0) {
                f10 = -0.25f;
            }
            textPaint2.setTextSkewX(f10);
            return;
        }
        this.M.setFakeBoldText(false);
        this.M.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f943h;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f948m;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.R;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.R.end();
            this.R = null;
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, V);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        Rect rect = this.T;
        Drawable drawable = this.f948m;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i11 = this.J;
        int i12 = this.L;
        int i13 = i11 + rect.top;
        int i14 = i12 - rect.bottom;
        Drawable drawable2 = this.f943h;
        if (drawable != null) {
            if (!this.f956u || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d10 = c0.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d10.left;
                rect.right -= d10.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.O : this.P;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.N;
            if (colorStateList != null) {
                this.M.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.M.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i10 = bounds.left + bounds.right;
            } else {
                i10 = getWidth();
            }
            canvas.translate((float) ((i10 / 2) - (layout.getWidth() / 2)), (float) (((i13 + i14) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f957v : this.f958w;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        super.onLayout(z10, i10, i11, i12, i13);
        int i20 = 0;
        if (this.f943h != null) {
            Rect rect = this.T;
            Drawable drawable = this.f948m;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d10 = c0.d(this.f943h);
            i14 = Math.max(0, d10.left - rect.left);
            i20 = Math.max(0, d10.right - rect.right);
        } else {
            i14 = 0;
        }
        if (a1.b(this)) {
            i16 = getPaddingLeft() + i14;
            i15 = ((this.F + i16) - i14) - i20;
        } else {
            i15 = (getWidth() - getPaddingRight()) - i20;
            i16 = (i15 - this.F) + i14 + i20;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i19 = this.G;
            i18 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i19 / 2);
        } else if (gravity != 80) {
            i18 = getPaddingTop();
            i19 = this.G;
        } else {
            i17 = getHeight() - getPaddingBottom();
            i18 = i17 - this.G;
            this.I = i16;
            this.J = i18;
            this.L = i17;
            this.K = i15;
        }
        i17 = i19 + i18;
        this.I = i16;
        this.J = i18;
        this.L = i17;
        this.K = i15;
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        if (this.f959x) {
            if (this.O == null) {
                this.O = h(this.f957v);
            }
            if (this.P == null) {
                this.P = h(this.f958w);
            }
        }
        Rect rect = this.T;
        Drawable drawable = this.f943h;
        int i14 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i13 = (this.f943h.getIntrinsicWidth() - rect.left) - rect.right;
            i12 = this.f943h.getIntrinsicHeight();
        } else {
            i13 = 0;
            i12 = 0;
        }
        this.H = Math.max(this.f959x ? Math.max(this.O.getWidth(), this.P.getWidth()) + (this.f953r * 2) : 0, i13);
        Drawable drawable2 = this.f948m;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i14 = this.f948m.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i15 = rect.left;
        int i16 = rect.right;
        Drawable drawable3 = this.f943h;
        if (drawable3 != null) {
            Rect d10 = c0.d(drawable3);
            i15 = Math.max(i15, d10.left);
            i16 = Math.max(i16, d10.right);
        }
        int max = Math.max(this.f954s, (this.H * 2) + i15 + i16);
        int max2 = Math.max(i14, i12);
        this.F = max;
        this.G = max2;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f957v : this.f958w;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.C
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x009f
            r2 = 2
            if (r0 == r1) goto L_0x008b
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x008b
            goto L_0x00b9
        L_0x0016:
            int r0 = r6.f960y
            if (r0 == r1) goto L_0x0057
            if (r0 == r2) goto L_0x001e
            goto L_0x00b9
        L_0x001e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.A
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0032
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003d
        L_0x0032:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0039
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003d
        L_0x0039:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003d:
            boolean r0 = androidx.appcompat.widget.a1.b(r6)
            if (r0 == 0) goto L_0x0044
            float r2 = -r2
        L_0x0044:
            float r0 = r6.E
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.E
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0056
            r6.A = r7
            r6.setThumbPosition(r0)
        L_0x0056:
            return r1
        L_0x0057:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.A
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f961z
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007d
            float r4 = r6.B
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f961z
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b9
        L_0x007d:
            r6.f960y = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.A = r0
            r6.B = r3
            return r1
        L_0x008b:
            int r0 = r6.f960y
            if (r0 != r2) goto L_0x0096
            r6.l(r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0096:
            r0 = 0
            r6.f960y = r0
            android.view.VelocityTracker r0 = r6.C
            r0.clear()
            goto L_0x00b9
        L_0x009f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00b9
            boolean r3 = r6.g(r0, r2)
            if (r3 == 0) goto L_0x00b9
            r6.f960y = r1
            r6.A = r0
            r6.B = r2
        L_0x00b9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !z.F(this)) {
            d();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.m(this, callback));
    }

    public void setShowText(boolean z10) {
        if (this.f959x != z10) {
            this.f959x = z10;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f956u = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f954s = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f955t = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.M.getTypeface() != null && !this.M.getTypeface().equals(typeface)) || (this.M.getTypeface() == null && typeface != null)) {
            this.M.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f958w = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f957v = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f943h;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f943h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void setThumbPosition(float f10) {
        this.E = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(h.a.d(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f953r = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f944i = colorStateList;
        this.f946k = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f945j = mode;
        this.f947l = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f948m;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f948m = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(h.a.d(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f949n = colorStateList;
        this.f951p = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f950o = mode;
        this.f952q = true;
        c();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f943h || drawable == this.f948m;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f944i = null;
        this.f945j = null;
        this.f946k = false;
        this.f947l = false;
        this.f949n = null;
        this.f950o = null;
        this.f951p = false;
        this.f952q = false;
        this.C = VelocityTracker.obtain();
        this.T = new Rect();
        p0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.M = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = j.I2;
        u0 u10 = u0.u(context, attributeSet, iArr, i10, 0);
        z.Q(this, context, iArr, attributeSet, u10.q(), i10, 0);
        Drawable f10 = u10.f(j.L2);
        this.f943h = f10;
        if (f10 != null) {
            f10.setCallback(this);
        }
        Drawable f11 = u10.f(j.U2);
        this.f948m = f11;
        if (f11 != null) {
            f11.setCallback(this);
        }
        this.f957v = u10.o(j.J2);
        this.f958w = u10.o(j.K2);
        this.f959x = u10.a(j.M2, true);
        this.f953r = u10.e(j.R2, 0);
        this.f954s = u10.e(j.O2, 0);
        this.f955t = u10.e(j.P2, 0);
        this.f956u = u10.a(j.N2, false);
        ColorStateList c10 = u10.c(j.S2);
        if (c10 != null) {
            this.f944i = c10;
            this.f946k = true;
        }
        PorterDuff.Mode e10 = c0.e(u10.j(j.T2, -1), (PorterDuff.Mode) null);
        if (this.f945j != e10) {
            this.f945j = e10;
            this.f947l = true;
        }
        if (this.f946k || this.f947l) {
            b();
        }
        ColorStateList c11 = u10.c(j.V2);
        if (c11 != null) {
            this.f949n = c11;
            this.f951p = true;
        }
        PorterDuff.Mode e11 = c0.e(u10.j(j.W2, -1), (PorterDuff.Mode) null);
        if (this.f950o != e11) {
            this.f950o = e11;
            this.f952q = true;
        }
        if (this.f951p || this.f952q) {
            c();
        }
        int m10 = u10.m(j.Q2, 0);
        if (m10 != 0) {
            i(context, m10);
        }
        w wVar = new w(this);
        this.S = wVar;
        wVar.m(attributeSet, i10);
        u10.v();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f961z = viewConfiguration.getScaledTouchSlop();
        this.D = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }
}
