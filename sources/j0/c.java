package j0;

import g0.e;
import g0.f;
import h0.b;
import i9.l0;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* compiled from: PreferenceDataStoreFactory.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f9390a = new c();

    /* compiled from: PreferenceDataStoreFactory.kt */
    static final class a extends n implements y8.a<File> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ y8.a<File> f9391h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(y8.a<? extends File> aVar) {
            super(0);
            this.f9391h = aVar;
        }

        /* renamed from: a */
        public final File invoke() {
            File invoke = this.f9391h.invoke();
            String h10 = j.h(invoke);
            h hVar = h.f9398a;
            if (m.a(h10, hVar.f())) {
                return invoke;
            }
            throw new IllegalStateException(("File extension for file: " + invoke + " does not match required extension for Preferences file: " + hVar.f()).toString());
        }
    }

    private c() {
    }

    public final e<d> a(b<d> bVar, List<? extends g0.c<d>> list, l0 l0Var, y8.a<? extends File> aVar) {
        m.f(list, "migrations");
        m.f(l0Var, "scope");
        m.f(aVar, "produceFile");
        return new b(f.f8696a.a(h.f9398a, bVar, list, l0Var, new a(aVar)));
    }
}
