package d0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ResourceCursorAdapter */
public abstract class c extends a {

    /* renamed from: p  reason: collision with root package name */
    private int f7887p;

    /* renamed from: q  reason: collision with root package name */
    private int f7888q;

    /* renamed from: r  reason: collision with root package name */
    private LayoutInflater f7889r;

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f7888q = i10;
        this.f7887p = i10;
        this.f7889r = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f7889r.inflate(this.f7888q, viewGroup, false);
    }

    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f7889r.inflate(this.f7887p, viewGroup, false);
    }
}
