package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.x;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ExtensionRegistryLite */
public class o {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2853b = true;

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f2854c = c();

    /* renamed from: d  reason: collision with root package name */
    private static volatile o f2855d;

    /* renamed from: e  reason: collision with root package name */
    static final o f2856e = new o(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, x.e<?, ?>> f2857a;

    /* compiled from: ExtensionRegistryLite */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f2858a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2859b;

        a(Object obj, int i10) {
            this.f2858a = obj;
            this.f2859b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f2858a == aVar.f2858a && this.f2859b == aVar.f2859b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f2858a) * 65535) + this.f2859b;
        }
    }

    o() {
        this.f2857a = new HashMap();
    }

    public static o b() {
        o oVar = f2855d;
        if (oVar == null) {
            synchronized (o.class) {
                oVar = f2855d;
                if (oVar == null) {
                    oVar = f2853b ? n.a() : f2856e;
                    f2855d = oVar;
                }
            }
        }
        return oVar;
    }

    static Class<?> c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public <ContainingType extends p0> x.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return this.f2857a.get(new a(containingtype, i10));
    }

    o(boolean z10) {
        this.f2857a = Collections.emptyMap();
    }
}
