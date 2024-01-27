package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.u0;

public final class ExpandedMenuView extends ListView implements e.b, k, AdapterView.OnItemClickListener {

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f650j = {16842964, 16843049};

    /* renamed from: h  reason: collision with root package name */
    private e f651h;

    /* renamed from: i  reason: collision with root package name */
    private int f652i;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public boolean a(g gVar) {
        return this.f651h.L(gVar, 0);
    }

    public void b(e eVar) {
        this.f651h = eVar;
    }

    public int getWindowAnimations() {
        return this.f652i;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        a((g) getAdapter().getItem(i10));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        u0 u10 = u0.u(context, attributeSet, f650j, i10, 0);
        if (u10.r(0)) {
            setBackgroundDrawable(u10.f(0));
        }
        if (u10.r(1)) {
            setDivider(u10.f(1));
        }
        u10.v();
    }
}
