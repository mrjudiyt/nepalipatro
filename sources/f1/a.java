package f1;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import e1.e;
import e1.f;
import java.util.List;

/* compiled from: FrameworkSQLiteDatabase */
class a implements e1.b {

    /* renamed from: i  reason: collision with root package name */
    private static final String[] f8449i = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: j  reason: collision with root package name */
    private static final String[] f8450j = new String[0];

    /* renamed from: h  reason: collision with root package name */
    private final SQLiteDatabase f8451h;

    /* renamed from: f1.a$a  reason: collision with other inner class name */
    /* compiled from: FrameworkSQLiteDatabase */
    class C0131a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f8452a;

        C0131a(e eVar) {
            this.f8452a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f8452a.a(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* compiled from: FrameworkSQLiteDatabase */
    class b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f8454a;

        b(e eVar) {
            this.f8454a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f8454a.a(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    a(SQLiteDatabase sQLiteDatabase) {
        this.f8451h = sQLiteDatabase;
    }

    public f A(String str) {
        return new e(this.f8451h.compileStatement(str));
    }

    public Cursor G0(e eVar) {
        return this.f8451h.rawQueryWithFactory(new C0131a(eVar), eVar.h(), f8450j, (String) null);
    }

    public Cursor M(e eVar, CancellationSignal cancellationSignal) {
        return this.f8451h.rawQueryWithFactory(new b(eVar), eVar.h(), f8450j, (String) null, cancellationSignal);
    }

    public void O() {
        this.f8451h.setTransactionSuccessful();
    }

    public void Q(String str, Object[] objArr) {
        this.f8451h.execSQL(str, objArr);
    }

    public Cursor X(String str) {
        return G0(new e1.a(str));
    }

    /* access modifiers changed from: package-private */
    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return this.f8451h == sQLiteDatabase;
    }

    public void a0() {
        this.f8451h.endTransaction();
    }

    public void close() {
        this.f8451h.close();
    }

    public boolean isOpen() {
        return this.f8451h.isOpen();
    }

    public void k() {
        this.f8451h.beginTransaction();
    }

    public String m0() {
        return this.f8451h.getPath();
    }

    public boolean p0() {
        return this.f8451h.inTransaction();
    }

    public List<Pair<String, String>> r() {
        return this.f8451h.getAttachedDbs();
    }

    public void t(String str) {
        this.f8451h.execSQL(str);
    }
}
