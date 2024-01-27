package v1;

import a1.c;
import a1.d;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.h;
import e1.f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SystemIdInfoDao_Impl */
public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    private final h f12234a;

    /* renamed from: b  reason: collision with root package name */
    private final a1.a<g> f12235b;

    /* renamed from: c  reason: collision with root package name */
    private final d f12236c;

    /* compiled from: SystemIdInfoDao_Impl */
    class a extends a1.a<g> {
        a(h hVar) {
            super(hVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void g(f fVar, g gVar) {
            String str = gVar.f12232a;
            if (str == null) {
                fVar.i0(1);
            } else {
                fVar.v(1, str);
            }
            fVar.N(2, (long) gVar.f12233b);
        }
    }

    /* compiled from: SystemIdInfoDao_Impl */
    class b extends d {
        b(h hVar) {
            super(hVar);
        }

        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(h hVar) {
        this.f12234a = hVar;
        this.f12235b = new a(hVar);
        this.f12236c = new b(hVar);
    }

    public List<String> a() {
        c j10 = c.j("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f12234a.b();
        Cursor b10 = c1.c.b(this.f12234a, j10, false, (CancellationSignal) null);
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

    public g b(String str) {
        c j10 = c.j("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            j10.i0(1);
        } else {
            j10.v(1, str);
        }
        this.f12234a.b();
        g gVar = null;
        Cursor b10 = c1.c.b(this.f12234a, j10, false, (CancellationSignal) null);
        try {
            int b11 = c1.b.b(b10, "work_spec_id");
            int b12 = c1.b.b(b10, "system_id");
            if (b10.moveToFirst()) {
                gVar = new g(b10.getString(b11), b10.getInt(b12));
            }
            return gVar;
        } finally {
            b10.close();
            j10.release();
        }
    }

    public void c(String str) {
        this.f12234a.b();
        f a10 = this.f12236c.a();
        if (str == null) {
            a10.i0(1);
        } else {
            a10.v(1, str);
        }
        this.f12234a.c();
        try {
            a10.z();
            this.f12234a.r();
        } finally {
            this.f12234a.g();
            this.f12236c.f(a10);
        }
    }

    public void d(g gVar) {
        this.f12234a.b();
        this.f12234a.c();
        try {
            this.f12235b.h(gVar);
            this.f12234a.r();
        } finally {
            this.f12234a.g();
        }
    }
}
