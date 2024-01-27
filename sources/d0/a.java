package d0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import d0.b;

/* compiled from: CursorAdapter */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: h  reason: collision with root package name */
    protected boolean f7876h;

    /* renamed from: i  reason: collision with root package name */
    protected boolean f7877i;

    /* renamed from: j  reason: collision with root package name */
    protected Cursor f7878j;

    /* renamed from: k  reason: collision with root package name */
    protected Context f7879k;

    /* renamed from: l  reason: collision with root package name */
    protected int f7880l;

    /* renamed from: m  reason: collision with root package name */
    protected C0121a f7881m;

    /* renamed from: n  reason: collision with root package name */
    protected DataSetObserver f7882n;

    /* renamed from: o  reason: collision with root package name */
    protected b f7883o;

    /* renamed from: d0.a$a  reason: collision with other inner class name */
    /* compiled from: CursorAdapter */
    private class C0121a extends ContentObserver {
        C0121a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z10) {
            a.this.i();
        }
    }

    /* compiled from: CursorAdapter */
    private class b extends DataSetObserver {
        b() {
        }

        public void onChanged() {
            a aVar = a.this;
            aVar.f7876h = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a aVar = a.this;
            aVar.f7876h = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        f(context, cursor, z10 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor j10 = j(cursor);
        if (j10 != null) {
            j10.close();
        }
    }

    public Cursor b() {
        return this.f7878j;
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    /* access modifiers changed from: package-private */
    public void f(Context context, Cursor cursor, int i10) {
        boolean z10 = false;
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f7877i = true;
        } else {
            this.f7877i = false;
        }
        if (cursor != null) {
            z10 = true;
        }
        this.f7878j = cursor;
        this.f7876h = z10;
        this.f7879k = context;
        this.f7880l = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f7881m = new C0121a();
            this.f7882n = new b();
        } else {
            this.f7881m = null;
            this.f7882n = null;
        }
        if (z10) {
            C0121a aVar = this.f7881m;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f7882n;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.f7876h || (cursor = this.f7878j) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f7876h) {
            return null;
        }
        this.f7878j.moveToPosition(i10);
        if (view == null) {
            view = g(this.f7879k, this.f7878j, viewGroup);
        }
        e(view, this.f7879k, this.f7878j);
        return view;
    }

    public Filter getFilter() {
        if (this.f7883o == null) {
            this.f7883o = new b(this);
        }
        return this.f7883o;
    }

    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f7876h || (cursor = this.f7878j) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f7878j;
    }

    public long getItemId(int i10) {
        Cursor cursor;
        if (!this.f7876h || (cursor = this.f7878j) == null || !cursor.moveToPosition(i10)) {
            return 0;
        }
        return this.f7878j.getLong(this.f7880l);
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f7876h) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f7878j.moveToPosition(i10)) {
            if (view == null) {
                view = h(this.f7879k, this.f7878j, viewGroup);
            }
            e(view, this.f7879k, this.f7878j);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i10);
        }
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    public void i() {
        Cursor cursor;
        if (this.f7877i && (cursor = this.f7878j) != null && !cursor.isClosed()) {
            this.f7876h = this.f7878j.requery();
        }
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f7878j;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0121a aVar = this.f7881m;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f7882n;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f7878j = cursor;
        if (cursor != null) {
            C0121a aVar2 = this.f7881m;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f7882n;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f7880l = cursor.getColumnIndexOrThrow("_id");
            this.f7876h = true;
            notifyDataSetChanged();
        } else {
            this.f7880l = -1;
            this.f7876h = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
