package v1;

import a1.c;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.h;
import e1.f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkNameDao_Impl */
public final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    private final h f12241a;

    /* renamed from: b  reason: collision with root package name */
    private final a1.a<j> f12242b;

    /* compiled from: WorkNameDao_Impl */
    class a extends a1.a<j> {
        a(h hVar) {
            super(hVar);
        }

        public String d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void g(f fVar, j jVar) {
            String str = jVar.f12239a;
            if (str == null) {
                fVar.i0(1);
            } else {
                fVar.v(1, str);
            }
            String str2 = jVar.f12240b;
            if (str2 == null) {
                fVar.i0(2);
            } else {
                fVar.v(2, str2);
            }
        }
    }

    public l(h hVar) {
        this.f12241a = hVar;
        this.f12242b = new a(hVar);
    }

    public void a(j jVar) {
        this.f12241a.b();
        this.f12241a.c();
        try {
            this.f12242b.h(jVar);
            this.f12241a.r();
        } finally {
            this.f12241a.g();
        }
    }

    public List<String> b(String str) {
        c j10 = c.j("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            j10.i0(1);
        } else {
            j10.v(1, str);
        }
        this.f12241a.b();
        Cursor b10 = c1.c.b(this.f12241a, j10, false, (CancellationSignal) null);
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
}
