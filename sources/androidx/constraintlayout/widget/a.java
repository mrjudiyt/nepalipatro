package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import v.e;

/* compiled from: Barrier */
public class a extends c {

    /* renamed from: q  reason: collision with root package name */
    private int f1679q;

    /* renamed from: r  reason: collision with root package name */
    private int f1680r;

    /* renamed from: s  reason: collision with root package name */
    private v.a f1681s;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void t(e eVar, int i10, boolean z10) {
        this.f1680r = i10;
        if (Build.VERSION.SDK_INT < 17) {
            int i11 = this.f1679q;
            if (i11 == 5) {
                this.f1680r = 0;
            } else if (i11 == 6) {
                this.f1680r = 1;
            }
        } else if (z10) {
            int i12 = this.f1679q;
            if (i12 == 5) {
                this.f1680r = 1;
            } else if (i12 == 6) {
                this.f1680r = 0;
            }
        } else {
            int i13 = this.f1679q;
            if (i13 == 5) {
                this.f1680r = 0;
            } else if (i13 == 6) {
                this.f1680r = 1;
            }
        }
        if (eVar instanceof v.a) {
            ((v.a) eVar).x1(this.f1680r);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f1681s.r1();
    }

    public int getMargin() {
        return this.f1681s.t1();
    }

    public int getType() {
        return this.f1679q;
    }

    /* access modifiers changed from: protected */
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.f1681s = new v.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.f1959n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == k.f2040w1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == k.f2031v1) {
                    this.f1681s.w1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == k.f2049x1) {
                    this.f1681s.y1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1703k = this.f1681s;
        s();
    }

    public void n(e eVar, boolean z10) {
        t(eVar, this.f1679q, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f1681s.w1(z10);
    }

    public void setDpMargin(int i10) {
        v.a aVar = this.f1681s;
        aVar.y1((int) ((((float) i10) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f1681s.y1(i10);
    }

    public void setType(int i10) {
        this.f1679q = i10;
    }
}
