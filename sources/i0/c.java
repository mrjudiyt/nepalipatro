package i0;

import android.content.Context;
import e9.i;
import g0.e;
import h0.b;
import i9.l0;
import j0.d;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import y8.l;

/* compiled from: PreferenceDataStoreDelegate.kt */
public final class c implements a9.a<Context, e<d>> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f9059a;

    /* renamed from: b  reason: collision with root package name */
    private final b<d> f9060b;

    /* renamed from: c  reason: collision with root package name */
    private final l<Context, List<g0.c<d>>> f9061c;

    /* renamed from: d  reason: collision with root package name */
    private final l0 f9062d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f9063e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private volatile e<d> f9064f;

    /* compiled from: PreferenceDataStoreDelegate.kt */
    static final class a extends n implements y8.a<File> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f9065h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ c f9066i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, c cVar) {
            super(0);
            this.f9065h = context;
            this.f9066i = cVar;
        }

        /* renamed from: a */
        public final File invoke() {
            Context context = this.f9065h;
            m.e(context, "applicationContext");
            return b.a(context, this.f9066i.f9059a);
        }
    }

    public c(String str, b<d> bVar, l<? super Context, ? extends List<? extends g0.c<d>>> lVar, l0 l0Var) {
        m.f(str, "name");
        m.f(lVar, "produceMigrations");
        m.f(l0Var, "scope");
        this.f9059a = str;
        this.f9061c = lVar;
        this.f9062d = l0Var;
    }

    /* renamed from: c */
    public e<d> a(Context context, i<?> iVar) {
        e<d> eVar;
        m.f(context, "thisRef");
        m.f(iVar, "property");
        e<d> eVar2 = this.f9064f;
        if (eVar2 != null) {
            return eVar2;
        }
        synchronized (this.f9063e) {
            if (this.f9064f == null) {
                Context applicationContext = context.getApplicationContext();
                j0.c cVar = j0.c.f9390a;
                b<d> bVar = this.f9060b;
                l<Context, List<g0.c<d>>> lVar = this.f9061c;
                m.e(applicationContext, "applicationContext");
                this.f9064f = cVar.a(bVar, lVar.invoke(applicationContext), this.f9062d, new a(applicationContext, this));
            }
            eVar = this.f9064f;
            m.c(eVar);
        }
        return eVar;
    }
}
