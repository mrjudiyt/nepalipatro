package f1;

import android.database.sqlite.SQLiteStatement;
import e1.f;

/* compiled from: FrameworkSQLiteStatement */
class e extends d implements f {

    /* renamed from: i  reason: collision with root package name */
    private final SQLiteStatement f8469i;

    e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f8469i = sQLiteStatement;
    }

    public long E0() {
        return this.f8469i.executeInsert();
    }

    public int z() {
        return this.f8469i.executeUpdateDelete();
    }
}
