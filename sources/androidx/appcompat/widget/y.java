package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.view.z;
import com.google.android.gms.common.api.Api;
import f.j;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AppCompatTextViewAutoSizeHelper */
class y {

    /* renamed from: l  reason: collision with root package name */
    private static final RectF f1317l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    private static ConcurrentHashMap<String, Method> f1318m = new ConcurrentHashMap<>();

    /* renamed from: n  reason: collision with root package name */
    private static ConcurrentHashMap<String, Field> f1319n = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private int f1320a = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1321b = false;

    /* renamed from: c  reason: collision with root package name */
    private float f1322c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f1323d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f1324e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    private int[] f1325f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private boolean f1326g = false;

    /* renamed from: h  reason: collision with root package name */
    private TextPaint f1327h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f1328i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f1329j;

    /* renamed from: k  reason: collision with root package name */
    private final c f1330k;

    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static class a extends c {
        a() {
        }

        /* access modifiers changed from: package-private */
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) y.r(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static class b extends a {
        b() {
        }

        /* access modifiers changed from: package-private */
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* access modifiers changed from: package-private */
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static class c {
        c() {
        }

        /* access modifiers changed from: package-private */
        public void a(StaticLayout.Builder builder, TextView textView) {
        }

        /* access modifiers changed from: package-private */
        public boolean b(TextView textView) {
            return ((Boolean) y.r(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    y(TextView textView) {
        this.f1328i = textView;
        this.f1329j = textView.getContext();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            this.f1330k = new b();
        } else if (i10 >= 23) {
            this.f1330k = new a();
        } else {
            this.f1330k = new c();
        }
    }

    private void A(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f1325f = c(iArr);
            B();
        }
    }

    private boolean B() {
        int[] iArr = this.f1325f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f1326g = z10;
        if (z10) {
            this.f1320a = 1;
            this.f1323d = (float) iArr[0];
            this.f1324e = (float) iArr[length - 1];
            this.f1322c = -1.0f;
        }
        return z10;
    }

    private boolean C(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1328i.getText();
        TransformationMethod transformationMethod = this.f1328i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f1328i)) == null)) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f1328i.getMaxLines() : -1;
        q(i10);
        StaticLayout e10 = e(text, (Layout.Alignment) r(this.f1328i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (e10.getLineCount() <= maxLines && e10.getLineEnd(e10.getLineCount() - 1) == text.length())) && ((float) e10.getHeight()) <= rectF.bottom;
    }

    private boolean D() {
        return !(this.f1328i instanceof j);
    }

    private void E(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        } else if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        } else if (f12 > 0.0f) {
            this.f1320a = 1;
            this.f1323d = f10;
            this.f1324e = f11;
            this.f1322c = f12;
            this.f1326g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
    }

    private static <T> T a(Object obj, String str, T t10) {
        try {
            Field o10 = o(str);
            if (o10 == null) {
                return t10;
            }
            return o10.get(obj);
        } catch (IllegalAccessException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to access TextView#");
            sb.append(str);
            sb.append(" member");
            return t10;
        }
    }

    private int[] c(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    private void d() {
        this.f1320a = 0;
        this.f1323d = -1.0f;
        this.f1324e = -1.0f;
        this.f1322c = -1.0f;
        this.f1325f = new int[0];
        this.f1321b = false;
    }

    private StaticLayout f(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1327h, i10);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f1328i.getLineSpacingExtra(), this.f1328i.getLineSpacingMultiplier()).setIncludePad(this.f1328i.getIncludeFontPadding()).setBreakStrategy(this.f1328i.getBreakStrategy()).setHyphenationFrequency(this.f1328i.getHyphenationFrequency());
        if (i11 == -1) {
            i11 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        hyphenationFrequency.setMaxLines(i11);
        try {
            this.f1330k.a(obtain, this.f1328i);
        } catch (ClassCastException unused) {
        }
        return obtain.build();
    }

    private StaticLayout g(CharSequence charSequence, Layout.Alignment alignment, int i10) {
        return new StaticLayout(charSequence, this.f1327h, i10, alignment, ((Float) a(this.f1328i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) a(this.f1328i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) a(this.f1328i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    private StaticLayout h(CharSequence charSequence, Layout.Alignment alignment, int i10) {
        return new StaticLayout(charSequence, this.f1327h, i10, alignment, this.f1328i.getLineSpacingMultiplier(), this.f1328i.getLineSpacingExtra(), this.f1328i.getIncludeFontPadding());
    }

    private int i(RectF rectF) {
        int length = this.f1325f.length;
        if (length != 0) {
            int i10 = length - 1;
            int i11 = 1;
            int i12 = 0;
            while (i11 <= i10) {
                int i13 = (i11 + i10) / 2;
                if (C(this.f1325f[i13], rectF)) {
                    int i14 = i13 + 1;
                    i12 = i11;
                    i11 = i14;
                } else {
                    i12 = i13 - 1;
                    i10 = i12;
                }
            }
            return this.f1325f[i12];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private static Field o(String str) {
        try {
            Field field = f1319n.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f1319n.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to access TextView#");
            sb.append(str);
            sb.append(" member");
            return null;
        }
    }

    private static Method p(String str) {
        try {
            Method method = f1318m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1318m.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to retrieve TextView#");
            sb.append(str);
            sb.append("() method");
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("Failed to invoke TextView#");
        r2.append(r3);
        r2.append("() method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> T r(java.lang.Object r2, java.lang.String r3, T r4) {
        /*
            java.lang.reflect.Method r0 = p(r3)     // Catch:{ Exception -> 0x000e }
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x000e }
            java.lang.Object r4 = r0.invoke(r2, r1)     // Catch:{ Exception -> 0x000e }
            goto L_0x0020
        L_0x000c:
            r2 = move-exception
            goto L_0x0021
        L_0x000e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x000c }
            r2.<init>()     // Catch:{ all -> 0x000c }
            java.lang.String r0 = "Failed to invoke TextView#"
            r2.append(r0)     // Catch:{ all -> 0x000c }
            r2.append(r3)     // Catch:{ all -> 0x000c }
            java.lang.String r3 = "() method"
            r2.append(r3)     // Catch:{ all -> 0x000c }
        L_0x0020:
            return r4
        L_0x0021:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y.r(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    private void x(float f10) {
        if (f10 != this.f1328i.getPaint().getTextSize()) {
            this.f1328i.getPaint().setTextSize(f10);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f1328i.isInLayout() : false;
            if (this.f1328i.getLayout() != null) {
                this.f1321b = false;
                try {
                    Method p10 = p("nullLayouts");
                    if (p10 != null) {
                        p10.invoke(this.f1328i, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!isInLayout) {
                    this.f1328i.requestLayout();
                } else {
                    this.f1328i.forceLayout();
                }
                this.f1328i.invalidate();
            }
        }
    }

    private boolean z() {
        if (!D() || this.f1320a != 1) {
            this.f1321b = false;
        } else {
            if (!this.f1326g || this.f1325f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f1324e - this.f1323d) / this.f1322c))) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round(this.f1323d + (((float) i10) * this.f1322c));
                }
                this.f1325f = c(iArr);
            }
            this.f1321b = true;
        }
        return this.f1321b;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int i10;
        if (s()) {
            if (this.f1321b) {
                if (this.f1328i.getMeasuredHeight() > 0 && this.f1328i.getMeasuredWidth() > 0) {
                    if (this.f1330k.b(this.f1328i)) {
                        i10 = 1048576;
                    } else {
                        i10 = (this.f1328i.getMeasuredWidth() - this.f1328i.getTotalPaddingLeft()) - this.f1328i.getTotalPaddingRight();
                    }
                    int height = (this.f1328i.getHeight() - this.f1328i.getCompoundPaddingBottom()) - this.f1328i.getCompoundPaddingTop();
                    if (i10 > 0 && height > 0) {
                        RectF rectF = f1317l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) i10;
                            rectF.bottom = (float) height;
                            float i11 = (float) i(rectF);
                            if (i11 != this.f1328i.getTextSize()) {
                                y(0, i11);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1321b = true;
        }
    }

    /* access modifiers changed from: package-private */
    public StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 23) {
            return f(charSequence, alignment, i10, i11);
        }
        if (i12 >= 16) {
            return h(charSequence, alignment, i10);
        }
        return g(charSequence, alignment, i10);
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return Math.round(this.f1324e);
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return Math.round(this.f1323d);
    }

    /* access modifiers changed from: package-private */
    public int l() {
        return Math.round(this.f1322c);
    }

    /* access modifiers changed from: package-private */
    public int[] m() {
        return this.f1325f;
    }

    /* access modifiers changed from: package-private */
    public int n() {
        return this.f1320a;
    }

    /* access modifiers changed from: package-private */
    public void q(int i10) {
        TextPaint textPaint = this.f1327h;
        if (textPaint == null) {
            this.f1327h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1327h.set(this.f1328i.getPaint());
        this.f1327h.setTextSize((float) i10);
    }

    /* access modifiers changed from: package-private */
    public boolean s() {
        return D() && this.f1320a != 0;
    }

    /* access modifiers changed from: package-private */
    public void t(AttributeSet attributeSet, int i10) {
        int resourceId;
        Context context = this.f1329j;
        int[] iArr = j.f8360i0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView = this.f1328i;
        z.Q(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i10, 0);
        int i11 = j.f8385n0;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f1320a = obtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = j.f8380m0;
        float dimension = obtainStyledAttributes.hasValue(i12) ? obtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        int i13 = j.f8370k0;
        float dimension2 = obtainStyledAttributes.hasValue(i13) ? obtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = j.f8365j0;
        float dimension3 = obtainStyledAttributes.hasValue(i14) ? obtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = j.f8375l0;
        if (obtainStyledAttributes.hasValue(i15) && (resourceId = obtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            A(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!D()) {
            this.f1320a = 0;
        } else if (this.f1320a == 1) {
            if (!this.f1326g) {
                DisplayMetrics displayMetrics = this.f1329j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                E(dimension2, dimension3, dimension);
            }
            z();
        }
    }

    /* access modifiers changed from: package-private */
    public void u(int i10, int i11, int i12, int i13) {
        if (D()) {
            DisplayMetrics displayMetrics = this.f1329j.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(i13, (float) i10, displayMetrics), TypedValue.applyDimension(i13, (float) i11, displayMetrics), TypedValue.applyDimension(i13, (float) i12, displayMetrics));
            if (z()) {
                b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void v(int[] iArr, int i10) {
        if (D()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1329j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, (float) iArr[i11], displayMetrics));
                    }
                }
                this.f1325f = c(iArr2);
                if (!B()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1326g = false;
            }
            if (z()) {
                b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void w(int i10) {
        if (!D()) {
            return;
        }
        if (i10 == 0) {
            d();
        } else if (i10 == 1) {
            DisplayMetrics displayMetrics = this.f1329j.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (z()) {
                b();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void y(int i10, float f10) {
        Resources resources;
        Context context = this.f1329j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        x(TypedValue.applyDimension(i10, f10, resources.getDisplayMetrics()));
    }
}
