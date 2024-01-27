package androidx.lifecycle;

import androidx.lifecycle.h0;
import com.facebook.bolts.AppLinks;
import kotlin.jvm.internal.m;
import p0.a;

/* compiled from: ViewModelProvider.kt */
public final /* synthetic */ class i0 {
    static {
        h0.b.a aVar = h0.b.f3498a;
    }

    public static g0 a(h0.b bVar, Class cls) {
        m.f(cls, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public static g0 b(h0.b bVar, Class cls, a aVar) {
        m.f(cls, "modelClass");
        m.f(aVar, AppLinks.KEY_NAME_EXTRAS);
        return bVar.a(cls);
    }
}
