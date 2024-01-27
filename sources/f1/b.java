package f1;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import e1.c;
import java.io.File;

/* compiled from: FrameworkSQLiteOpenHelper */
class b implements c {

    /* renamed from: h  reason: collision with root package name */
    private final Context f8456h;

    /* renamed from: i  reason: collision with root package name */
    private final String f8457i;

    /* renamed from: j  reason: collision with root package name */
    private final c.a f8458j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f8459k;

    /* renamed from: l  reason: collision with root package name */
    private final Object f8460l = new Object();

    /* renamed from: m  reason: collision with root package name */
    private a f8461m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f8462n;

    /* compiled from: FrameworkSQLiteOpenHelper */
    static class a extends SQLiteOpenHelper {

        /* renamed from: h  reason: collision with root package name */
        final a[] f8463h;

        /* renamed from: i  reason: collision with root package name */
        final c.a f8464i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f8465j;

        /* renamed from: f1.b$a$a  reason: collision with other inner class name */
        /* compiled from: FrameworkSQLiteOpenHelper */
        class C0132a implements DatabaseErrorHandler {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c.a f8466a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a[] f8467b;

            C0132a(c.a aVar, a[] aVarArr) {
                this.f8466a = aVar;
                this.f8467b = aVarArr;
            }

            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f8466a.c(a.h(this.f8467b, sQLiteDatabase));
            }
        }

        a(Context context, String str, a[] aVarArr, c.a aVar) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.f7974a, new C0132a(aVar, aVarArr));
            this.f8464i = aVar;
            this.f8463h = aVarArr;
        }

        static a h(a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            a aVar = aVarArr[0];
            if (aVar == null || !aVar.a(sQLiteDatabase)) {
                aVarArr[0] = new a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        /* access modifiers changed from: package-private */
        public a a(SQLiteDatabase sQLiteDatabase) {
            return h(this.f8463h, sQLiteDatabase);
        }

        public synchronized void close() {
            super.close();
            this.f8463h[0] = null;
        }

        /* access modifiers changed from: package-private */
        public synchronized e1.b j() {
            this.f8465j = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f8465j) {
                close();
                return j();
            }
            return a(writableDatabase);
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f8464i.b(a(sQLiteDatabase));
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f8464i.d(a(sQLiteDatabase));
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f8465j = true;
            this.f8464i.e(a(sQLiteDatabase), i10, i11);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f8465j) {
                this.f8464i.f(a(sQLiteDatabase));
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f8465j = true;
            this.f8464i.g(a(sQLiteDatabase), i10, i11);
        }
    }

    b(Context context, String str, c.a aVar, boolean z10) {
        this.f8456h = context;
        this.f8457i = str;
        this.f8458j = aVar;
        this.f8459k = z10;
    }

    private a a() {
        a aVar;
        synchronized (this.f8460l) {
            if (this.f8461m == null) {
                a[] aVarArr = new a[1];
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 23 || this.f8457i == null || !this.f8459k) {
                    this.f8461m = new a(this.f8456h, this.f8457i, aVarArr, this.f8458j);
                } else {
                    this.f8461m = new a(this.f8456h, new File(this.f8456h.getNoBackupFilesDir(), this.f8457i).getAbsolutePath(), aVarArr, this.f8458j);
                }
                if (i10 >= 16) {
                    this.f8461m.setWriteAheadLoggingEnabled(this.f8462n);
                }
            }
            aVar = this.f8461m;
        }
        return aVar;
    }

    public e1.b V() {
        return a().j();
    }

    public void close() {
        a().close();
    }

    public String getDatabaseName() {
        return this.f8457i;
    }

    public void setWriteAheadLoggingEnabled(boolean z10) {
        synchronized (this.f8460l) {
            a aVar = this.f8461m;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z10);
            }
            this.f8462n = z10;
        }
    }
}
