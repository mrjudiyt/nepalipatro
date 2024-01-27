package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.h;
import h.a;

/* compiled from: TintTypedArray */
public class u0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1256a;

    /* renamed from: b  reason: collision with root package name */
    private final TypedArray f1257b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f1258c;

    private u0(Context context, TypedArray typedArray) {
        this.f1256a = context;
        this.f1257b = typedArray;
    }

    public static u0 s(Context context, int i10, int[] iArr) {
        return new u0(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static u0 t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new u0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static u0 u(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new u0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f1257b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f1257b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList c10;
        if (!this.f1257b.hasValue(i10) || (resourceId = this.f1257b.getResourceId(i10, 0)) == 0 || (c10 = a.c(this.f1256a, resourceId)) == null) {
            return this.f1257b.getColorStateList(i10);
        }
        return c10;
    }

    public int d(int i10, int i11) {
        return this.f1257b.getDimensionPixelOffset(i10, i11);
    }

    public int e(int i10, int i11) {
        return this.f1257b.getDimensionPixelSize(i10, i11);
    }

    public Drawable f(int i10) {
        int resourceId;
        if (!this.f1257b.hasValue(i10) || (resourceId = this.f1257b.getResourceId(i10, 0)) == 0) {
            return this.f1257b.getDrawable(i10);
        }
        return a.d(this.f1256a, resourceId);
    }

    public Drawable g(int i10) {
        int resourceId;
        if (!this.f1257b.hasValue(i10) || (resourceId = this.f1257b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return i.b().d(this.f1256a, resourceId, true);
    }

    public float h(int i10, float f10) {
        return this.f1257b.getFloat(i10, f10);
    }

    public Typeface i(int i10, int i11, h.e eVar) {
        int resourceId = this.f1257b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1258c == null) {
            this.f1258c = new TypedValue();
        }
        return h.e(this.f1256a, resourceId, this.f1258c, i11, eVar);
    }

    public int j(int i10, int i11) {
        return this.f1257b.getInt(i10, i11);
    }

    public int k(int i10, int i11) {
        return this.f1257b.getInteger(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f1257b.getLayoutDimension(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f1257b.getResourceId(i10, i11);
    }

    public String n(int i10) {
        return this.f1257b.getString(i10);
    }

    public CharSequence o(int i10) {
        return this.f1257b.getText(i10);
    }

    public CharSequence[] p(int i10) {
        return this.f1257b.getTextArray(i10);
    }

    public TypedArray q() {
        return this.f1257b;
    }

    public boolean r(int i10) {
        return this.f1257b.hasValue(i10);
    }

    public void v() {
        this.f1257b.recycle();
    }
}
