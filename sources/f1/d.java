package f1;

import android.database.sqlite.SQLiteProgram;

/* compiled from: FrameworkSQLiteProgram */
class d implements e1.d {

    /* renamed from: h  reason: collision with root package name */
    private final SQLiteProgram f8468h;

    d(SQLiteProgram sQLiteProgram) {
        this.f8468h = sQLiteProgram;
    }

    public void C(int i10, double d10) {
        this.f8468h.bindDouble(i10, d10);
    }

    public void N(int i10, long j10) {
        this.f8468h.bindLong(i10, j10);
    }

    public void R(int i10, byte[] bArr) {
        this.f8468h.bindBlob(i10, bArr);
    }

    public void close() {
        this.f8468h.close();
    }

    public void i0(int i10) {
        this.f8468h.bindNull(i10);
    }

    public void v(int i10, String str) {
        this.f8468h.bindString(i10, str);
    }
}
