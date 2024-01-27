package p0;

import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import p0.a;

/* compiled from: CreationExtras.kt */
public final class d extends a {
    public d() {
        this((a) null, 1, (g) null);
    }

    public d(a aVar) {
        m.f(aVar, "initialExtras");
        b().putAll(aVar.b());
    }

    public <T> T a(a.b<T> bVar) {
        m.f(bVar, Constants.KEY);
        return b().get(bVar);
    }

    public final <T> void c(a.b<T> bVar, T t10) {
        m.f(bVar, Constants.KEY);
        b().put(bVar, t10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(a aVar, int i10, g gVar) {
        this((i10 & 1) != 0 ? a.C0177a.f10444b : aVar);
    }
}
