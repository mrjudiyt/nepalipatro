package androidx.work;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import v1.p;

/* compiled from: WorkRequest */
public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    private UUID f4943a;

    /* renamed from: b  reason: collision with root package name */
    private p f4944b;

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f4945c;

    /* compiled from: WorkRequest */
    public static abstract class a<B extends a<?, ?>, W extends x> {

        /* renamed from: a  reason: collision with root package name */
        boolean f4946a = false;

        /* renamed from: b  reason: collision with root package name */
        UUID f4947b = UUID.randomUUID();

        /* renamed from: c  reason: collision with root package name */
        p f4948c;

        /* renamed from: d  reason: collision with root package name */
        Set<String> f4949d = new HashSet();

        /* renamed from: e  reason: collision with root package name */
        Class<? extends ListenableWorker> f4950e;

        a(Class<? extends ListenableWorker> cls) {
            this.f4950e = cls;
            this.f4948c = new p(this.f4947b.toString(), cls.getName());
            a(cls.getName());
        }

        public final B a(String str) {
            this.f4949d.add(str);
            return d();
        }

        public final W b() {
            W c10 = c();
            c cVar = this.f4948c.f12264j;
            int i10 = Build.VERSION.SDK_INT;
            boolean z10 = (i10 >= 24 && cVar.e()) || cVar.f() || cVar.g() || (i10 >= 23 && cVar.h());
            p pVar = this.f4948c;
            if (pVar.f12271q) {
                if (z10) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                } else if (pVar.f12261g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            this.f4947b = UUID.randomUUID();
            p pVar2 = new p(this.f4948c);
            this.f4948c = pVar2;
            pVar2.f12255a = this.f4947b.toString();
            return c10;
        }

        /* access modifiers changed from: package-private */
        public abstract W c();

        /* access modifiers changed from: package-private */
        public abstract B d();

        public final B e(c cVar) {
            this.f4948c.f12264j = cVar;
            return d();
        }

        public final B f(e eVar) {
            this.f4948c.f12259e = eVar;
            return d();
        }
    }

    protected x(UUID uuid, p pVar, Set<String> set) {
        this.f4943a = uuid;
        this.f4944b = pVar;
        this.f4945c = set;
    }

    public String a() {
        return this.f4943a.toString();
    }

    public Set<String> b() {
        return this.f4945c;
    }

    public p c() {
        return this.f4944b;
    }
}
