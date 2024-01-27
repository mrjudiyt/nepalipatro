package da;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import ca.a;
import com.bumptech.glide.g;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.R;
import np.com.nepalipatro.helpers.e;
import np.com.nepalipatro.helpers.l;
import w2.c;

/* compiled from: NewsRemoteViewsFactory.kt */
public final class b implements RemoteViewsService.RemoteViewsFactory {

    /* renamed from: a  reason: collision with root package name */
    private Context f14209a;

    /* renamed from: b  reason: collision with root package name */
    private Intent f14210b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f14211c;

    /* renamed from: d  reason: collision with root package name */
    private SQLiteDatabase f14212d;

    /* renamed from: e  reason: collision with root package name */
    private final String f14213e = "np.com.nepalipatro";

    /* renamed from: f  reason: collision with root package name */
    private Cursor f14214f;

    public b(Context context, Intent intent) {
        m.f(context, "context");
        this.f14209a = context;
        this.f14210b = intent;
        this.f14211c = intent != null ? Integer.valueOf(intent.getIntExtra("appWidgetId", 0)) : null;
        a();
    }

    private final void a() {
        try {
            Context context = this.f14209a;
            Cursor cursor = null;
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(String.valueOf(context != null ? context.getDatabasePath(a.f13428a.c()) : null), (SQLiteDatabase.CursorFactory) null, 0);
            this.f14212d = openDatabase;
            if (openDatabase != null) {
                cursor = openDatabase.rawQuery("SELECT * FROM FEEDS ORDER BY pub_date DESC limit 6", (String[]) null);
            }
            this.f14214f = cursor;
        } catch (SQLiteCantOpenDatabaseException unused) {
        }
    }

    private final String b(Cursor cursor) {
        String str;
        Cursor cursor2;
        String str2 = null;
        if (cursor != null) {
            try {
                str = cursor.getString(8);
            } catch (Exception unused) {
                return "";
            }
        } else {
            str = null;
        }
        SQLiteDatabase sQLiteDatabase = this.f14212d;
        if (sQLiteDatabase != null) {
            cursor2 = sQLiteDatabase.rawQuery("SELECT * FROM SOURCES WHERE code = '" + str + '\'', (String[]) null);
        } else {
            cursor2 = null;
        }
        if (cursor2 != null) {
            cursor2.moveToNext();
        }
        if (cursor2 != null) {
            str2 = cursor2.getString(1);
        }
        String valueOf = String.valueOf(str2);
        if (cursor2 == null) {
            return valueOf;
        }
        cursor2.close();
        return valueOf;
    }

    @SuppressLint({"SimpleDateFormat"})
    private final String c(Cursor cursor) {
        String string = cursor != null ? cursor.getString(14) : null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return DateUtils.getRelativeTimeSpanString(simpleDateFormat.parse(string).getTime(), System.currentTimeMillis(), 1000).toString();
    }

    public int getCount() {
        Cursor cursor = this.f14214f;
        if (cursor == null) {
            return 0;
        }
        Integer num = null;
        Integer valueOf = cursor != null ? Integer.valueOf(cursor.getCount()) : null;
        m.c(valueOf);
        if (valueOf.intValue() <= 0) {
            return 0;
        }
        Cursor cursor2 = this.f14214f;
        if (cursor2 != null) {
            num = Integer.valueOf(cursor2.getCount());
        }
        m.c(num);
        return num.intValue() + 1;
    }

    public long getItemId(int i10) {
        return (long) i10;
    }

    public RemoteViews getLoadingView() {
        return null;
    }

    public RemoteViews getViewAt(int i10) {
        RemoteViews remoteViews;
        Resources resources;
        Resources resources2;
        Resources resources3;
        Resources resources4;
        String string;
        Resources resources5;
        Resources resources6;
        Resources resources7;
        Resources resources8;
        Resources resources9;
        Resources resources10;
        Resources resources11;
        Resources resources12;
        int i11 = i10;
        try {
            Cursor cursor = this.f14214f;
            if (cursor == null) {
                return null;
            }
            m.c(cursor != null ? Boolean.valueOf(cursor.moveToPosition(i11)) : null);
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            String j10 = l.f16129a.j(this.f14209a);
            Cursor cursor2 = this.f14214f;
            Integer valueOf = cursor2 != null ? Integer.valueOf(cursor2.getCount()) : null;
            m.c(valueOf);
            if (i11 < valueOf.intValue()) {
                Context context = this.f14209a;
                remoteViews = new RemoteViews(context != null ? context.getPackageName() : null, R.layout.news_widget_item);
                if (p.n(j10, e.f15961a.a(), false, 2, (Object) null)) {
                    try {
                        Context context2 = this.f14209a;
                        if (!(context2 == null || (resources12 = context2.getResources()) == null)) {
                            remoteViews.setTextColor(R.id.news_widget_item_tv, resources12.getColor(R.color.grey_800));
                        }
                        Context context3 = this.f14209a;
                        if (!(context3 == null || (resources11 = context3.getResources()) == null)) {
                            remoteViews.setTextColor(R.id.news_widget_item_source_tv, resources11.getColor(R.color.grey_600));
                        }
                        Context context4 = this.f14209a;
                        if (!(context4 == null || (resources10 = context4.getResources()) == null)) {
                            remoteViews.setTextColor(R.id.news_widget_item_time_tv, resources10.getColor(R.color.grey_600));
                        }
                        Context context5 = this.f14209a;
                        if (!(context5 == null || (resources9 = context5.getResources()) == null)) {
                            remoteViews.setInt(R.id.news_widget_item_layout, "setBackgroundColor", resources9.getColor(R.color.seventytransparentwhite));
                        }
                    } catch (Exception unused) {
                        return null;
                    }
                } else {
                    Context context6 = this.f14209a;
                    if (!(context6 == null || (resources8 = context6.getResources()) == null)) {
                        remoteViews.setTextColor(R.id.news_widget_item_tv, resources8.getColor(R.color.grey_200));
                    }
                    Context context7 = this.f14209a;
                    if (!(context7 == null || (resources7 = context7.getResources()) == null)) {
                        remoteViews.setTextColor(R.id.news_widget_item_source_tv, resources7.getColor(R.color.grey_400));
                    }
                    Context context8 = this.f14209a;
                    if (!(context8 == null || (resources6 = context8.getResources()) == null)) {
                        remoteViews.setTextColor(R.id.news_widget_item_time_tv, resources6.getColor(R.color.grey_400));
                    }
                    Context context9 = this.f14209a;
                    if (!(context9 == null || (resources5 = context9.getResources()) == null)) {
                        remoteViews.setInt(R.id.news_widget_item_layout, "setBackgroundColor", resources5.getColor(R.color.transparent_black_75));
                    }
                }
                Cursor cursor3 = this.f14214f;
                remoteViews.setTextViewText(R.id.news_widget_item_tv, cursor3 != null ? cursor3.getString(2) : null);
                remoteViews.setTextViewText(R.id.news_widget_item_source_tv, b(this.f14214f));
                remoteViews.setTextViewText(R.id.news_widget_item_time_tv, "-   " + c(this.f14214f));
                Cursor cursor4 = this.f14214f;
                String obj = (cursor4 == null || (string = cursor4.getString(11)) == null) ? null : q.q0(string).toString();
                try {
                    Context context10 = this.f14209a;
                    m.c(context10);
                    w2.a c10 = com.bumptech.glide.b.t(context10).e().k0(obj).c();
                    m.e(c10, "with(mContext!!)\n       …            .centerCrop()");
                    c o02 = ((g) c10).o0(UserVerificationMethods.USER_VERIFY_HANDPRINT, UserVerificationMethods.USER_VERIFY_HANDPRINT);
                    m.e(o02, "builder.submit(256, 256)");
                    remoteViews.setImageViewBitmap(R.id.news_widget_item_iv, (Bitmap) o02.get());
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                Cursor cursor5 = this.f14214f;
                bundle.putString("news_widget", cursor5 != null ? cursor5.getString(0) : null);
                intent.putExtras(bundle);
                remoteViews.setOnClickFillInIntent(R.id.news_widget_item_layout, intent);
            } else {
                Context context11 = this.f14209a;
                remoteViews = new RemoteViews(context11 != null ? context11.getPackageName() : null, R.layout.news_widget_read_more);
                try {
                    if (p.n(j10, e.f15961a.a(), false, 2, (Object) null)) {
                        Context context12 = this.f14209a;
                        if (!(context12 == null || (resources4 = context12.getResources()) == null)) {
                            remoteViews.setTextColor(R.id.news_widget_read_more, resources4.getColor(R.color.grey_800));
                        }
                        Context context13 = this.f14209a;
                        if (!(context13 == null || (resources3 = context13.getResources()) == null)) {
                            remoteViews.setInt(R.id.news_widget_read_more, "setBackgroundColor", resources3.getColor(R.color.seventytransparentwhite));
                        }
                    } else {
                        Context context14 = this.f14209a;
                        if (!(context14 == null || (resources2 = context14.getResources()) == null)) {
                            remoteViews.setTextColor(R.id.news_widget_read_more, resources2.getColor(R.color.grey_200));
                        }
                        Context context15 = this.f14209a;
                        if (!(context15 == null || (resources = context15.getResources()) == null)) {
                            remoteViews.setInt(R.id.news_widget_read_more, "setBackgroundColor", resources.getColor(R.color.transparent_black_75));
                        }
                    }
                    bundle.putString("news_widget", "open_news");
                    intent.putExtras(bundle);
                    remoteViews.setOnClickFillInIntent(R.id.news_widget_read_more, intent);
                } catch (Exception unused2) {
                    return null;
                }
            }
            return remoteViews;
        } catch (Exception unused3) {
            return null;
        }
    }

    public int getViewTypeCount() {
        return 2;
    }

    public boolean hasStableIds() {
        return true;
    }

    public void onCreate() {
        a();
    }

    public void onDataSetChanged() {
        a();
    }

    public void onDestroy() {
        Cursor cursor = this.f14214f;
        if (cursor != null) {
            cursor.close();
        }
    }
}
