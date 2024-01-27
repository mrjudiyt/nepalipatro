package v1;

import a1.c;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.h;

/* compiled from: PreferenceDao_Impl */
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final h f12229a;

    /* renamed from: b  reason: collision with root package name */
    private final a1.a<d> f12230b;

    /* compiled from: PreferenceDao_Impl */
    class a extends a1.a<d> {
        a(h hVar) {
            super(hVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void g(e1.f fVar, d dVar) {
            String str = dVar.f12227a;
            if (str == null) {
                fVar.i0(1);
            } else {
                fVar.v(1, str);
            }
            Long l10 = dVar.f12228b;
            if (l10 == null) {
                fVar.i0(2);
            } else {
                fVar.N(2, l10.longValue());
            }
        }
    }

    public f(h hVar) {
        this.f12229a = hVar;
        this.f12230b = new a(hVar);
    }

    public Long a(String str) {
        c j10 = c.j("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            j10.i0(1);
        } else {
            j10.v(1, str);
        }
        this.f12229a.b();
        Long l10 = null;
        Cursor b10 = c1.c.b(this.f12229a, j10, false, (CancellationSignal) null);
        try {
            if (b10.moveToFirst()) {
                if (!b10.isNull(0)) {
                    l10 = Long.valueOf(b10.getLong(0));
                }
            }
            return l10;
        } finally {
            b10.close();
            j10.release();
        }
    }

    public void b(d dVar) {
        this.f12229a.b();
        this.f12229a.c();
        try {
            this.f12230b.h(dVar);
            this.f12229a.r();
        } finally {
            this.f12229a.g();
        }
    }
}
