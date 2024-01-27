package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import f.g;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter */
public class c implements j, AdapterView.OnItemClickListener {

    /* renamed from: h  reason: collision with root package name */
    Context f708h;

    /* renamed from: i  reason: collision with root package name */
    LayoutInflater f709i;

    /* renamed from: j  reason: collision with root package name */
    e f710j;

    /* renamed from: k  reason: collision with root package name */
    ExpandedMenuView f711k;

    /* renamed from: l  reason: collision with root package name */
    int f712l;

    /* renamed from: m  reason: collision with root package name */
    int f713m;

    /* renamed from: n  reason: collision with root package name */
    int f714n;

    /* renamed from: o  reason: collision with root package name */
    private j.a f715o;

    /* renamed from: p  reason: collision with root package name */
    a f716p;

    /* compiled from: ListMenuPresenter */
    private class a extends BaseAdapter {

        /* renamed from: h  reason: collision with root package name */
        private int f717h = -1;

        public a() {
            a();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            g v10 = c.this.f710j.v();
            if (v10 != null) {
                ArrayList<g> z10 = c.this.f710j.z();
                int size = z10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (z10.get(i10) == v10) {
                        this.f717h = i10;
                        return;
                    }
                }
            }
            this.f717h = -1;
        }

        /* renamed from: b */
        public g getItem(int i10) {
            ArrayList<g> z10 = c.this.f710j.z();
            int i11 = i10 + c.this.f712l;
            int i12 = this.f717h;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return z10.get(i11);
        }

        public int getCount() {
            int size = c.this.f710j.z().size() - c.this.f712l;
            return this.f717h < 0 ? size : size - 1;
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f709i.inflate(cVar.f714n, viewGroup, false);
            }
            ((k.a) view).d(getItem(i10), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i10) {
        this(i10, 0);
        this.f708h = context;
        this.f709i = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f716p == null) {
            this.f716p = new a();
        }
        return this.f716p;
    }

    public void b(e eVar, boolean z10) {
        j.a aVar = this.f715o;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    public void c(boolean z10) {
        a aVar = this.f716p;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public boolean d() {
        return false;
    }

    public boolean e(e eVar, g gVar) {
        return false;
    }

    public boolean f(e eVar, g gVar) {
        return false;
    }

    public void g(j.a aVar) {
        this.f715o = aVar;
    }

    public void h(Context context, e eVar) {
        if (this.f713m != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f713m);
            this.f708h = contextThemeWrapper;
            this.f709i = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f708h != null) {
            this.f708h = context;
            if (this.f709i == null) {
                this.f709i = LayoutInflater.from(context);
            }
        }
        this.f710j = eVar;
        a aVar = this.f716p;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public k i(ViewGroup viewGroup) {
        if (this.f711k == null) {
            this.f711k = (ExpandedMenuView) this.f709i.inflate(g.f8289g, viewGroup, false);
            if (this.f716p == null) {
                this.f716p = new a();
            }
            this.f711k.setAdapter(this.f716p);
            this.f711k.setOnItemClickListener(this);
        }
        return this.f711k;
    }

    public boolean j(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).d((IBinder) null);
        j.a aVar = this.f715o;
        if (aVar == null) {
            return true;
        }
        aVar.c(mVar);
        return true;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f710j.M(this.f716p.getItem(i10), this, 0);
    }

    public c(int i10, int i11) {
        this.f714n = i10;
        this.f713m = i11;
    }
}
