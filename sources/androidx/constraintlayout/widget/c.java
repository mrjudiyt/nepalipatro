package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import v.e;
import v.h;

/* compiled from: ConstraintHelper */
public abstract class c extends View {

    /* renamed from: h  reason: collision with root package name */
    protected int[] f1700h = new int[32];

    /* renamed from: i  reason: collision with root package name */
    protected int f1701i;

    /* renamed from: j  reason: collision with root package name */
    protected Context f1702j;

    /* renamed from: k  reason: collision with root package name */
    protected h f1703k;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f1704l = false;

    /* renamed from: m  reason: collision with root package name */
    protected String f1705m;

    /* renamed from: n  reason: collision with root package name */
    protected String f1706n;

    /* renamed from: o  reason: collision with root package name */
    private View[] f1707o = null;

    /* renamed from: p  reason: collision with root package name */
    protected HashMap<Integer, String> f1708p = new HashMap<>();

    public c(Context context) {
        super(context);
        this.f1702j = context;
        m((AttributeSet) null);
    }

    private void d(String str) {
        if (str != null && str.length() != 0 && this.f1702j != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int k10 = k(trim);
            if (k10 != 0) {
                this.f1708p.put(Integer.valueOf(k10), trim);
                e(k10);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find id of \"");
            sb.append(trim);
            sb.append("\"");
        }
    }

    private void e(int i10) {
        if (i10 != getId()) {
            int i11 = this.f1701i + 1;
            int[] iArr = this.f1700h;
            if (i11 > iArr.length) {
                this.f1700h = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f1700h;
            int i12 = this.f1701i;
            iArr2[i12] = i10;
            this.f1701i = i12 + 1;
        }
    }

    private void f(String str) {
        if (str != null && str.length() != 0 && this.f1702j != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            if (constraintLayout != null) {
                int childCount = constraintLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = constraintLayout.getChildAt(i10);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).f1626c0)) {
                        if (childAt.getId() == -1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("to use ConstraintTag view ");
                            sb.append(childAt.getClass().getSimpleName());
                            sb.append(" must have an ID");
                        } else {
                            e(childAt.getId());
                        }
                    }
                }
            }
        }
    }

    private int j(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f1702j.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int k(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i10 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object f10 = constraintLayout.f(0, str);
            if (f10 instanceof Integer) {
                i10 = ((Integer) f10).intValue();
            }
        }
        if (i10 == 0 && constraintLayout != null) {
            i10 = j(constraintLayout, str);
        }
        if (i10 == 0) {
            try {
                i10 = j.class.getField(str).getInt((Object) null);
            } catch (Exception unused) {
            }
        }
        return i10 == 0 ? this.f1702j.getResources().getIdentifier(str, "id", this.f1702j.getPackageName()) : i10;
    }

    /* access modifiers changed from: protected */
    public void g() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            h((ConstraintLayout) parent);
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1700h, this.f1701i);
    }

    /* access modifiers changed from: protected */
    public void h(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i10 = 0; i10 < this.f1701i; i10++) {
            View h10 = constraintLayout.h(this.f1700h[i10]);
            if (h10 != null) {
                h10.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    h10.setTranslationZ(h10.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void i(ConstraintLayout constraintLayout) {
    }

    /* access modifiers changed from: protected */
    public View[] l(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f1707o;
        if (viewArr == null || viewArr.length != this.f1701i) {
            this.f1707o = new View[this.f1701i];
        }
        for (int i10 = 0; i10 < this.f1701i; i10++) {
            this.f1707o[i10] = constraintLayout.h(this.f1700h[i10]);
        }
        return this.f1707o;
    }

    /* access modifiers changed from: protected */
    public void m(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.f1959n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == k.f2067z1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1705m = string;
                    setIds(string);
                } else if (index == k.A1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1706n = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void n(e eVar, boolean z10) {
    }

    public void o(ConstraintLayout constraintLayout) {
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1705m;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1706n;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        if (this.f1704l) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(ConstraintLayout constraintLayout) {
    }

    public void q(ConstraintLayout constraintLayout) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r1 = r5.f1708p.get(java.lang.Integer.valueOf(r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void r(androidx.constraintlayout.widget.ConstraintLayout r6) {
        /*
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.f1705m
            r5.setIds(r0)
        L_0x000b:
            v.h r0 = r5.f1703k
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            r0.a()
            r0 = 0
        L_0x0014:
            int r1 = r5.f1701i
            if (r0 >= r1) goto L_0x0053
            int[] r1 = r5.f1700h
            r1 = r1[r0]
            android.view.View r2 = r6.h(r1)
            if (r2 != 0) goto L_0x0045
            java.util.HashMap<java.lang.Integer, java.lang.String> r3 = r5.f1708p
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r5.j(r6, r1)
            if (r3 == 0) goto L_0x0045
            int[] r2 = r5.f1700h
            r2[r0] = r3
            java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r5.f1708p
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
            android.view.View r2 = r6.h(r3)
        L_0x0045:
            if (r2 == 0) goto L_0x0050
            v.h r1 = r5.f1703k
            v.e r2 = r6.i(r2)
            r1.b(r2)
        L_0x0050:
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0053:
            v.h r0 = r5.f1703k
            v.f r6 = r6.f1603j
            r0.c(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.r(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    public void s() {
        if (this.f1703k != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.b) {
                ((ConstraintLayout.b) layoutParams).f1664v0 = (e) this.f1703k;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setIds(String str) {
        this.f1705m = str;
        if (str != null) {
            int i10 = 0;
            this.f1701i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i10);
                if (indexOf == -1) {
                    d(str.substring(i10));
                    return;
                } else {
                    d(str.substring(i10, indexOf));
                    i10 = indexOf + 1;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setReferenceTags(String str) {
        this.f1706n = str;
        if (str != null) {
            int i10 = 0;
            this.f1701i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i10);
                if (indexOf == -1) {
                    f(str.substring(i10));
                    return;
                } else {
                    f(str.substring(i10, indexOf));
                    i10 = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1705m = null;
        this.f1701i = 0;
        for (int e10 : iArr) {
            e(e10);
        }
    }

    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f1705m == null) {
            e(i10);
        }
    }
}
