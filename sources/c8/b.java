package c8;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements SQLiteDatabase.CursorFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d0 f5289a;

    public /* synthetic */ b(d0 d0Var) {
        this.f5289a = d0Var;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return this.f5289a.a(sQLiteQuery);
    }
}
