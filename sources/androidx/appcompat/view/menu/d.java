package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* compiled from: MenuAdapter */
public class d extends BaseAdapter {

    /* renamed from: h  reason: collision with root package name */
    e f719h;

    /* renamed from: i  reason: collision with root package name */
    private int f720i = -1;

    /* renamed from: j  reason: collision with root package name */
    private boolean f721j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f722k;

    /* renamed from: l  reason: collision with root package name */
    private final LayoutInflater f723l;

    /* renamed from: m  reason: collision with root package name */
    private final int f724m;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f722k = z10;
        this.f723l = layoutInflater;
        this.f719h = eVar;
        this.f724m = i10;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        g v10 = this.f719h.v();
        if (v10 != null) {
            ArrayList<g> z10 = this.f719h.z();
            int size = z10.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (z10.get(i10) == v10) {
                    this.f720i = i10;
                    return;
                }
            }
        }
        this.f720i = -1;
    }

    public e b() {
        return this.f719h;
    }

    /* renamed from: c */
    public g getItem(int i10) {
        ArrayList<g> z10 = this.f722k ? this.f719h.z() : this.f719h.E();
        int i11 = this.f720i;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return z10.get(i10);
    }

    public void d(boolean z10) {
        this.f721j = z10;
    }

    public int getCount() {
        ArrayList<g> z10 = this.f722k ? this.f719h.z() : this.f719h.E();
        if (this.f720i < 0) {
            return z10.size();
        }
        return z10.size() - 1;
    }

    public long getItemId(int i10) {
        return (long) i10;
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f723l.inflate(this.f724m, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f719h.F() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f721j) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i10), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
