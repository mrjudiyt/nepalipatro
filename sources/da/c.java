package da;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import da.a;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.R;
import np.com.nepalipatro.helpers.e;
import np.com.nepalipatro.helpers.f;
import y9.b;

/* compiled from: CalendarWidgetService.kt */
public final class c implements RemoteViewsService.RemoteViewsFactory {

    /* renamed from: a  reason: collision with root package name */
    private List<a.C0247a> f14215a;

    /* renamed from: b  reason: collision with root package name */
    private Context f14216b;

    /* renamed from: c  reason: collision with root package name */
    private b f14217c = new b();

    /* renamed from: d  reason: collision with root package name */
    private y9.c f14218d = new y9.c(this.f14216b);

    /* renamed from: e  reason: collision with root package name */
    private final int f14219e;

    /* renamed from: f  reason: collision with root package name */
    private final int f14220f;

    /* renamed from: g  reason: collision with root package name */
    private final int f14221g;

    public c(Context context, Intent intent, List<a.C0247a> list) {
        m.f(context, "ctxt");
        m.f(intent, "intent");
        this.f14215a = list;
        this.f14216b = context;
        this.f14219e = androidx.core.content.a.d(context, R.color.white);
        this.f14220f = androidx.core.content.a.d(context, R.color.green_a700);
        this.f14221g = androidx.core.content.a.d(context, R.color.grey_400);
    }

    private final a.C0247a a(int i10) {
        List<a.C0247a> list = this.f14215a;
        m.c(list);
        return list.get(i10);
    }

    public int getCount() {
        List<a.C0247a> list = this.f14215a;
        if (list == null) {
            return 0;
        }
        m.c(list);
        return list.size();
    }

    public long getItemId(int i10) {
        return (long) i10;
    }

    public RemoteViews getLoadingView() {
        return null;
    }

    public RemoteViews getViewAt(int i10) {
        Intent intent = new Intent();
        a.C0247a a10 = a(i10);
        Context context = this.f14216b;
        m.c(context);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.new_convertview_calendar_grid);
        intent.putExtra(f.f16022a.a(), a10.a());
        HashMap hashMap = new HashMap();
        e.a aVar = e.f15961a;
        hashMap.put(aVar.u(), aVar.y());
        hashMap.put(aVar.h(), aVar.k());
        String r10 = aVar.r();
        hashMap.put(r10, "{\"date\":\"" + a10.a() + "\"}");
        if (a10.d()) {
            remoteViews.setTextColor(R.id.grid_cell_day_bs, this.f14219e);
            if (a10.c()) {
                remoteViews.setInt(R.id.grid_cell_day_bs, "setBackgroundColor", this.f14220f);
            } else {
                remoteViews.setInt(R.id.grid_cell_day_bs, "setBackgroundColor", 0);
            }
        } else {
            remoteViews.setTextColor(R.id.grid_cell_day_bs, this.f14221g);
            remoteViews.setInt(R.id.grid_cell_day_bs, "setBackgroundColor", 0);
        }
        remoteViews.setTextViewText(R.id.grid_cell_day_bs, a10.b());
        intent.putExtra(aVar.c(), hashMap);
        remoteViews.setOnClickFillInIntent(R.id.grid_cell_day_bs, intent);
        return remoteViews;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public boolean hasStableIds() {
        return true;
    }

    public void onCreate() {
    }

    public void onDataSetChanged() {
        Context context = this.f14216b;
        m.c(context);
        a aVar = new a(context);
        b bVar = this.f14217c;
        m.c(bVar);
        y9.c cVar = this.f14218d;
        m.c(cVar);
        aVar.b(bVar, cVar);
        this.f14215a = aVar.a();
    }

    public void onDestroy() {
    }
}
