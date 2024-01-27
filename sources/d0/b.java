package d0;

import android.database.Cursor;
import android.widget.Filter;

/* compiled from: CursorFilter */
class b extends Filter {

    /* renamed from: a  reason: collision with root package name */
    a f7886a;

    /* compiled from: CursorFilter */
    interface a {
        void a(Cursor cursor);

        Cursor b();

        CharSequence c(Cursor cursor);

        Cursor d(CharSequence charSequence);
    }

    b(a aVar) {
        this.f7886a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f7886a.c((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d10 = this.f7886a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d10 != null) {
            filterResults.count = d10.getCount();
            filterResults.values = d10;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b10 = this.f7886a.b();
        Object obj = filterResults.values;
        if (obj != null && obj != b10) {
            this.f7886a.a((Cursor) obj);
        }
    }
}
