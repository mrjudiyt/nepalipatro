package androidx.room;

import android.database.Cursor;
import e1.c;
import java.util.List;

/* compiled from: RoomOpenHelper */
public class i extends c.a {

    /* renamed from: b  reason: collision with root package name */
    private a f4430b;

    /* renamed from: c  reason: collision with root package name */
    private final a f4431c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4432d;

    /* renamed from: e  reason: collision with root package name */
    private final String f4433e;

    /* compiled from: RoomOpenHelper */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f4434a;

        public a(int i10) {
            this.f4434a = i10;
        }

        /* access modifiers changed from: protected */
        public abstract void a(e1.b bVar);

        /* access modifiers changed from: protected */
        public abstract void b(e1.b bVar);

        /* access modifiers changed from: protected */
        public abstract void c(e1.b bVar);

        /* access modifiers changed from: protected */
        public abstract void d(e1.b bVar);

        /* access modifiers changed from: protected */
        public abstract void e(e1.b bVar);

        /* access modifiers changed from: protected */
        public abstract void f(e1.b bVar);

        /* access modifiers changed from: protected */
        public abstract b g(e1.b bVar);
    }

    /* compiled from: RoomOpenHelper */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f4435a;

        /* renamed from: b  reason: collision with root package name */
        public final String f4436b;

        public b(boolean z10, String str) {
            this.f4435a = z10;
            this.f4436b = str;
        }
    }

    public i(a aVar, a aVar2, String str, String str2) {
        super(aVar2.f4434a);
        this.f4430b = aVar;
        this.f4431c = aVar2;
        this.f4432d = str;
        this.f4433e = str2;
    }

    /* JADX INFO: finally extract failed */
    private void h(e1.b bVar) {
        if (k(bVar)) {
            String str = null;
            Cursor G0 = bVar.G0(new e1.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                if (G0.moveToFirst()) {
                    str = G0.getString(0);
                }
                G0.close();
                if (!this.f4432d.equals(str) && !this.f4433e.equals(str)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
            } catch (Throwable th) {
                G0.close();
                throw th;
            }
        } else {
            b g10 = this.f4431c.g(bVar);
            if (g10.f4435a) {
                this.f4431c.e(bVar);
                l(bVar);
                return;
            }
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g10.f4436b);
        }
    }

    private void i(e1.b bVar) {
        bVar.t("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private static boolean j(e1.b bVar) {
        Cursor X = bVar.X("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (X.moveToFirst() && X.getInt(0) == 0) {
                z10 = true;
            }
            return z10;
        } finally {
            X.close();
        }
    }

    private static boolean k(e1.b bVar) {
        Cursor X = bVar.X("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z10 = false;
            if (X.moveToFirst() && X.getInt(0) != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            X.close();
        }
    }

    private void l(e1.b bVar) {
        i(bVar);
        bVar.t(a1.b.a(this.f4432d));
    }

    public void b(e1.b bVar) {
        super.b(bVar);
    }

    public void d(e1.b bVar) {
        boolean j10 = j(bVar);
        this.f4431c.a(bVar);
        if (!j10) {
            b g10 = this.f4431c.g(bVar);
            if (!g10.f4435a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g10.f4436b);
            }
        }
        l(bVar);
        this.f4431c.c(bVar);
    }

    public void e(e1.b bVar, int i10, int i11) {
        g(bVar, i10, i11);
    }

    public void f(e1.b bVar) {
        super.f(bVar);
        h(bVar);
        this.f4431c.d(bVar);
        this.f4430b = null;
    }

    public void g(e1.b bVar, int i10, int i11) {
        boolean z10;
        List<b1.a> c10;
        a aVar = this.f4430b;
        if (aVar == null || (c10 = aVar.f4336d.c(i10, i11)) == null) {
            z10 = false;
        } else {
            this.f4431c.f(bVar);
            for (b1.a a10 : c10) {
                a10.a(bVar);
            }
            b g10 = this.f4431c.g(bVar);
            if (g10.f4435a) {
                this.f4431c.e(bVar);
                l(bVar);
                z10 = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + g10.f4436b);
            }
        }
        if (!z10) {
            a aVar2 = this.f4430b;
            if (aVar2 == null || aVar2.a(i10, i11)) {
                throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.f4431c.b(bVar);
            this.f4431c.a(bVar);
        }
    }
}
