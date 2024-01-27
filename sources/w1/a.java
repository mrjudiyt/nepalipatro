package w1;

import androidx.work.impl.WorkDatabase;
import androidx.work.p;
import androidx.work.v;
import java.util.LinkedList;
import java.util.UUID;
import o1.e;
import o1.f;
import o1.i;
import v1.q;

/* compiled from: CancelWorkRunnable */
public abstract class a implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    private final o1.c f12597h = new o1.c();

    /* renamed from: w1.a$a  reason: collision with other inner class name */
    /* compiled from: CancelWorkRunnable */
    class C0209a extends a {

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ i f12598i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ UUID f12599j;

        C0209a(i iVar, UUID uuid) {
            this.f12598i = iVar;
            this.f12599j = uuid;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        public void h() {
            WorkDatabase q10 = this.f12598i.q();
            q10.c();
            try {
                a(this.f12598i, this.f12599j.toString());
                q10.r();
                q10.g();
                g(this.f12598i);
            } catch (Throwable th) {
                q10.g();
                throw th;
            }
        }
    }

    /* compiled from: CancelWorkRunnable */
    class b extends a {

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ i f12600i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f12601j;

        b(i iVar, String str) {
            this.f12600i = iVar;
            this.f12601j = str;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        public void h() {
            WorkDatabase q10 = this.f12600i.q();
            q10.c();
            try {
                for (String a10 : q10.B().p(this.f12601j)) {
                    a(this.f12600i, a10);
                }
                q10.r();
                q10.g();
                g(this.f12600i);
            } catch (Throwable th) {
                q10.g();
                throw th;
            }
        }
    }

    /* compiled from: CancelWorkRunnable */
    class c extends a {

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ i f12602i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f12603j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f12604k;

        c(i iVar, String str, boolean z10) {
            this.f12602i = iVar;
            this.f12603j = str;
            this.f12604k = z10;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        public void h() {
            WorkDatabase q10 = this.f12602i.q();
            q10.c();
            try {
                for (String a10 : q10.B().l(this.f12603j)) {
                    a(this.f12602i, a10);
                }
                q10.r();
                q10.g();
                if (this.f12604k) {
                    g(this.f12602i);
                }
            } catch (Throwable th) {
                q10.g();
                throw th;
            }
        }
    }

    public static a b(UUID uuid, i iVar) {
        return new C0209a(iVar, uuid);
    }

    public static a c(String str, i iVar, boolean z10) {
        return new c(iVar, str, z10);
    }

    public static a d(String str, i iVar) {
        return new b(iVar, str);
    }

    private void f(WorkDatabase workDatabase, String str) {
        q B = workDatabase.B();
        v1.b t10 = workDatabase.t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            v.a m10 = B.m(str2);
            if (!(m10 == v.a.SUCCEEDED || m10 == v.a.FAILED)) {
                B.b(v.a.CANCELLED, str2);
            }
            linkedList.addAll(t10.b(str2));
        }
    }

    /* access modifiers changed from: package-private */
    public void a(i iVar, String str) {
        f(iVar.q(), str);
        iVar.o().l(str);
        for (e d10 : iVar.p()) {
            d10.d(str);
        }
    }

    public p e() {
        return this.f12597h;
    }

    /* access modifiers changed from: package-private */
    public void g(i iVar) {
        f.b(iVar.k(), iVar.q(), iVar.p());
    }

    /* access modifiers changed from: package-private */
    public abstract void h();

    public void run() {
        try {
            h();
            this.f12597h.a(p.f4923a);
        } catch (Throwable th) {
            this.f12597h.a(new p.b.a(th));
        }
    }
}
