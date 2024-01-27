package z9;

import android.content.Context;
import android.os.AsyncTask;
import com.facebook.internal.NativeProtocol;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.helpers.g;
import z9.d;

/* compiled from: DataLoader.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f17547a;

    /* renamed from: b  reason: collision with root package name */
    private final d f17548b;

    /* renamed from: c  reason: collision with root package name */
    private c f17549c;

    /* renamed from: d  reason: collision with root package name */
    private final h f17550d;

    /* renamed from: e  reason: collision with root package name */
    private final e f17551e;

    /* renamed from: f  reason: collision with root package name */
    private a f17552f;

    /* renamed from: g  reason: collision with root package name */
    private i f17553g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final g f17554h;

    /* compiled from: DataLoader.kt */
    private enum a {
        NEWS,
        FOREX,
        RASHFIAL,
        AMESSAGE,
        BLOG,
        LS,
        PANCHANGA,
        CACHE,
        TITHI
    }

    public b(Context context) {
        m.f(context, "context");
        this.f17547a = context;
        this.f17551e = new e(context);
        this.f17549c = new c(context);
        this.f17550d = new h(context);
        this.f17548b = new d(context);
        this.f17554h = new g(context);
        this.f17552f = new a(context);
        this.f17553g = new i(context);
    }

    private final void d(Boolean bool) {
        Boolean i10 = this.f17548b.i();
        if (!(i10 != null ? i10.booleanValue() : false)) {
            m.c(bool);
            if (bool.booleanValue() || this.f17548b.j()) {
                new C0297b(this, a.BLOG, bool).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
        }
    }

    private final void f(Boolean bool) {
    }

    public final void b(Boolean bool) {
        g.a aVar = g.f16048a;
        StringBuilder sb = new StringBuilder();
        sb.append("Executing all dataloaders with force: ");
        m.c(bool);
        sb.append(bool.booleanValue());
        aVar.b(sb.toString());
        f(bool);
        g(bool);
        i(bool);
        c(bool);
        d(bool);
    }

    public final void c(Boolean bool) {
        Boolean h10 = this.f17549c.h();
        if (!(h10 != null ? h10.booleanValue() : false)) {
            m.c(bool);
            if (!bool.booleanValue()) {
                Boolean i10 = this.f17549c.i();
                m.c(i10);
                if (!i10.booleanValue()) {
                    return;
                }
            }
            new C0297b(this, a.AMESSAGE, bool).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public final void e(String str) {
        m.f(str, NativeProtocol.WEB_DIALOG_PARAMS);
        new C0297b(this, a.CACHE, Boolean.TRUE, str).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public final void g(Boolean bool) {
        Boolean f10 = this.f17551e.f();
        if (!(f10 != null ? f10.booleanValue() : false)) {
            m.c(bool);
            if (bool.booleanValue()) {
                new C0297b(this, a.FOREX, bool).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
        }
    }

    public final void h(boolean z10, String str) {
        m.f(str, "bsDate");
        if (!z10) {
            Boolean h10 = this.f17554h.h();
            m.c(h10);
            if (!h10.booleanValue()) {
                return;
            }
        }
        new C0297b(this, a.PANCHANGA, Boolean.valueOf(z10), str).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public final void i(Boolean bool) {
        Boolean g10 = this.f17550d.g();
        if (!(g10 != null ? g10.booleanValue() : false)) {
            new C0297b(this, a.RASHFIAL, bool).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public final void j(boolean z10, String str) {
        m.f(str, "options");
        new C0297b(this, a.TITHI, Boolean.valueOf(z10), str).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public final c k() {
        return this.f17549c;
    }

    public final a l() {
        return this.f17552f;
    }

    public final d m() {
        return this.f17548b;
    }

    public final e n() {
        return this.f17551e;
    }

    public final h o() {
        return this.f17550d;
    }

    public final i p() {
        return this.f17553g;
    }

    /* renamed from: z9.b$b  reason: collision with other inner class name */
    /* compiled from: DataLoader.kt */
    private static final class C0297b extends AsyncTask<Void, Integer, Void> {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<b> f17565a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<a> f17566b;

        /* renamed from: c  reason: collision with root package name */
        private final WeakReference<Boolean> f17567c;

        /* renamed from: d  reason: collision with root package name */
        private final WeakReference<String> f17568d;

        public C0297b(b bVar, a aVar, Boolean bool) {
            m.f(bVar, "dataLoader");
            m.f(aVar, "executeType");
            this.f17565a = new WeakReference<>(bVar);
            this.f17566b = new WeakReference<>(aVar);
            this.f17567c = new WeakReference<>(Boolean.valueOf(bool != null ? bool.booleanValue() : false));
            this.f17568d = new WeakReference<>("");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            b bVar;
            i p10;
            a l10;
            g a10;
            d m10;
            c k10;
            h o10;
            e n10;
            m.f(voidArr, "voids");
            try {
                if (this.f17566b.get() != a.NEWS) {
                    if (this.f17566b.get() == a.FOREX) {
                        b bVar2 = (b) this.f17565a.get();
                        if (!(bVar2 == null || (n10 = bVar2.n()) == null)) {
                            n10.c((String) null);
                        }
                    } else if (this.f17566b.get() == a.RASHFIAL) {
                        b bVar3 = (b) this.f17565a.get();
                        if (!(bVar3 == null || (o10 = bVar3.o()) == null)) {
                            o10.c((Boolean) this.f17567c.get());
                        }
                    } else if (this.f17566b.get() == a.AMESSAGE) {
                        b bVar4 = (b) this.f17565a.get();
                        if (!(bVar4 == null || (k10 = bVar4.k()) == null)) {
                            k10.f((Boolean) this.f17567c.get());
                        }
                    } else if (this.f17566b.get() == a.BLOG) {
                        b bVar5 = (b) this.f17565a.get();
                        if (!(bVar5 == null || (m10 = bVar5.m()) == null)) {
                            Boolean bool = (Boolean) this.f17567c.get();
                            if (bool == null) {
                                bool = Boolean.FALSE;
                            }
                            m10.g(bool.booleanValue(), d.b.NONE, 0);
                        }
                    } else {
                        String str = "";
                        if (this.f17566b.get() == a.PANCHANGA) {
                            b bVar6 = (b) this.f17565a.get();
                            if (!(bVar6 == null || (a10 = bVar6.f17554h) == null)) {
                                Boolean bool2 = (Boolean) this.f17567c.get();
                                String str2 = (String) this.f17568d.get();
                                if (str2 != null) {
                                    str = str2;
                                }
                                a10.f(bool2, str);
                            }
                        } else if (this.f17566b.get() == a.CACHE) {
                            b bVar7 = (b) this.f17565a.get();
                            if (!(bVar7 == null || (l10 = bVar7.l()) == null)) {
                                Boolean bool3 = (Boolean) this.f17567c.get();
                                if (bool3 == null) {
                                    bool3 = Boolean.TRUE;
                                }
                                boolean booleanValue = bool3.booleanValue();
                                String str3 = (String) this.f17568d.get();
                                if (str3 != null) {
                                    str = str3;
                                }
                                l10.a(booleanValue, str);
                            }
                        } else if (!(this.f17566b.get() != a.TITHI || (bVar = (b) this.f17565a.get()) == null || (p10 = bVar.p()) == null)) {
                            Boolean bool4 = (Boolean) this.f17567c.get();
                            if (bool4 == null) {
                                bool4 = Boolean.TRUE;
                            }
                            boolean booleanValue2 = bool4.booleanValue();
                            String str4 = (String) this.f17568d.get();
                            if (str4 != null) {
                                str = str4;
                            }
                            p10.c(booleanValue2, str);
                        }
                    }
                }
            } catch (Exception e10) {
                if (g.f16048a.a()) {
                    e10.printStackTrace();
                }
            }
            return null;
        }

        public C0297b(b bVar, a aVar, Boolean bool, String str) {
            m.f(bVar, "dataLoader");
            m.f(aVar, "executeType");
            m.f(str, "bsDate");
            this.f17565a = new WeakReference<>(bVar);
            this.f17566b = new WeakReference<>(aVar);
            this.f17567c = new WeakReference<>(Boolean.valueOf(bool != null ? bool.booleanValue() : false));
            this.f17568d = new WeakReference<>(str);
        }
    }
}
