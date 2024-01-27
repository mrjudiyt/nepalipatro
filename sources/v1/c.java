package v1;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.h;
import e1.f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DependencyDao_Impl */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final h f12224a;

    /* renamed from: b  reason: collision with root package name */
    private final a1.a<a> f12225b;

    /* compiled from: DependencyDao_Impl */
    class a extends a1.a<a> {
        a(h hVar) {
            super(hVar);
        }

        public String d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void g(f fVar, a aVar) {
            String str = aVar.f12222a;
            if (str == null) {
                fVar.i0(1);
            } else {
                fVar.v(1, str);
            }
            String str2 = aVar.f12223b;
            if (str2 == null) {
                fVar.i0(2);
            } else {
                fVar.v(2, str2);
            }
        }
    }

    public c(h hVar) {
        this.f12224a = hVar;
        this.f12225b = new a(hVar);
    }

    public void a(a aVar) {
        this.f12224a.b();
        this.f12224a.c();
        try {
            this.f12225b.h(aVar);
            this.f12224a.r();
        } finally {
            this.f12224a.g();
        }
    }

    public List<String> b(String str) {
        a1.c j10 = a1.c.j("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            j10.i0(1);
        } else {
            j10.v(1, str);
        }
        this.f12224a.b();
        Cursor b10 = c1.c.b(this.f12224a, j10, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(b10.getString(0));
            }
            return arrayList;
        } finally {
            b10.close();
            j10.release();
        }
    }

    public boolean c(String str) {
        boolean z10 = true;
        a1.c j10 = a1.c.j("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            j10.i0(1);
        } else {
            j10.v(1, str);
        }
        this.f12224a.b();
        boolean z11 = false;
        Cursor b10 = c1.c.b(this.f12224a, j10, false, (CancellationSignal) null);
        try {
            if (b10.moveToFirst()) {
                if (b10.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            b10.close();
            j10.release();
        }
    }

    public boolean d(String str) {
        boolean z10 = true;
        a1.c j10 = a1.c.j("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            j10.i0(1);
        } else {
            j10.v(1, str);
        }
        this.f12224a.b();
        boolean z11 = false;
        Cursor b10 = c1.c.b(this.f12224a, j10, false, (CancellationSignal) null);
        try {
            if (b10.moveToFirst()) {
                if (b10.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            b10.close();
            j10.release();
        }
    }
}
