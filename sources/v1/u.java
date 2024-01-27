package v1;

import a1.c;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.h;
import e1.f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkTagDao_Impl */
public final class u implements t {

    /* renamed from: a  reason: collision with root package name */
    private final h f12302a;

    /* renamed from: b  reason: collision with root package name */
    private final a1.a<s> f12303b;

    /* compiled from: WorkTagDao_Impl */
    class a extends a1.a<s> {
        a(h hVar) {
            super(hVar);
        }

        public String d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void g(f fVar, s sVar) {
            String str = sVar.f12300a;
            if (str == null) {
                fVar.i0(1);
            } else {
                fVar.v(1, str);
            }
            String str2 = sVar.f12301b;
            if (str2 == null) {
                fVar.i0(2);
            } else {
                fVar.v(2, str2);
            }
        }
    }

    public u(h hVar) {
        this.f12302a = hVar;
        this.f12303b = new a(hVar);
    }

    public List<String> a(String str) {
        c j10 = c.j("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            j10.i0(1);
        } else {
            j10.v(1, str);
        }
        this.f12302a.b();
        Cursor b10 = c1.c.b(this.f12302a, j10, false, (CancellationSignal) null);
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

    public void b(s sVar) {
        this.f12302a.b();
        this.f12302a.c();
        try {
            this.f12303b.h(sVar);
            this.f12302a.r();
        } finally {
            this.f12302a.g();
        }
    }
}
