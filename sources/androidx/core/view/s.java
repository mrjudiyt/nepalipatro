package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: NestedScrollingParentHelper */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private int f2581a;

    /* renamed from: b  reason: collision with root package name */
    private int f2582b;

    public s(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f2581a | this.f2582b;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f2582b = i10;
        } else {
            this.f2581a = i10;
        }
    }

    public void d(View view, int i10) {
        if (i10 == 1) {
            this.f2582b = 0;
        } else {
            this.f2581a = 0;
        }
    }
}
