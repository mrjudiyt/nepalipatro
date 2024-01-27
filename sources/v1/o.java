package v1;

import a1.d;
import androidx.room.h;
import androidx.work.e;
import e1.f;

/* compiled from: WorkProgressDao_Impl */
public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    private final h f12246a;

    /* renamed from: b  reason: collision with root package name */
    private final a1.a<m> f12247b;

    /* renamed from: c  reason: collision with root package name */
    private final d f12248c;

    /* renamed from: d  reason: collision with root package name */
    private final d f12249d;

    /* compiled from: WorkProgressDao_Impl */
    class a extends a1.a<m> {
        a(h hVar) {
            super(hVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void g(f fVar, m mVar) {
            String str = mVar.f12244a;
            if (str == null) {
                fVar.i0(1);
            } else {
                fVar.v(1, str);
            }
            byte[] l10 = e.l(mVar.f12245b);
            if (l10 == null) {
                fVar.i0(2);
            } else {
                fVar.R(2, l10);
            }
        }
    }

    /* compiled from: WorkProgressDao_Impl */
    class b extends d {
        b(h hVar) {
            super(hVar);
        }

        public String d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* compiled from: WorkProgressDao_Impl */
    class c extends d {
        c(h hVar) {
            super(hVar);
        }

        public String d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(h hVar) {
        this.f12246a = hVar;
        this.f12247b = new a(hVar);
        this.f12248c = new b(hVar);
        this.f12249d = new c(hVar);
    }

    public void a(String str) {
        this.f12246a.b();
        f a10 = this.f12248c.a();
        if (str == null) {
            a10.i0(1);
        } else {
            a10.v(1, str);
        }
        this.f12246a.c();
        try {
            a10.z();
            this.f12246a.r();
        } finally {
            this.f12246a.g();
            this.f12248c.f(a10);
        }
    }

    public void b(m mVar) {
        this.f12246a.b();
        this.f12246a.c();
        try {
            this.f12247b.h(mVar);
            this.f12246a.r();
        } finally {
            this.f12246a.g();
        }
    }

    public void c() {
        this.f12246a.b();
        f a10 = this.f12249d.a();
        this.f12246a.c();
        try {
            a10.z();
            this.f12246a.r();
        } finally {
            this.f12246a.g();
            this.f12249d.f(a10);
        }
    }
}
