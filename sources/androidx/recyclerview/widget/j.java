package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollbarHelper */
class j {
    static int a(RecyclerView.z zVar, h hVar, View view, View view2, RecyclerView.n nVar, boolean z10) {
        if (nVar.t() == 0 || zVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(nVar.I(view) - nVar.I(view2)) + 1;
        }
        return Math.min(hVar.h(), hVar.d(view2) - hVar.e(view));
    }

    static int b(RecyclerView.z zVar, h hVar, View view, View view2, RecyclerView.n nVar, boolean z10, boolean z11) {
        int i10;
        if (nVar.t() == 0 || zVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(nVar.I(view), nVar.I(view2));
        int max = Math.max(nVar.I(view), nVar.I(view2));
        if (z11) {
            i10 = Math.max(0, (zVar.a() - max) - 1);
        } else {
            i10 = Math.max(0, min);
        }
        if (!z10) {
            return i10;
        }
        return Math.round((((float) i10) * (((float) Math.abs(hVar.d(view2) - hVar.e(view))) / ((float) (Math.abs(nVar.I(view) - nVar.I(view2)) + 1)))) + ((float) (hVar.g() - hVar.e(view))));
    }

    static int c(RecyclerView.z zVar, h hVar, View view, View view2, RecyclerView.n nVar, boolean z10) {
        if (nVar.t() == 0 || zVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return zVar.a();
        }
        return (int) ((((float) (hVar.d(view2) - hVar.e(view))) / ((float) (Math.abs(nVar.I(view) - nVar.I(view2)) + 1))) * ((float) zVar.a()));
    }
}
