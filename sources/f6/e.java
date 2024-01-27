package f6;

import java.util.Objects;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
public final class e implements g {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f14569c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile g f14570a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f14571b = f14569c;

    private e(g gVar) {
        this.f14570a = gVar;
    }

    public static g a(g gVar) {
        Objects.requireNonNull(gVar);
        return gVar instanceof e ? gVar : new e(gVar);
    }

    public final Object zza() {
        Object obj = this.f14571b;
        Object obj2 = f14569c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f14571b;
                if (obj == obj2) {
                    obj = this.f14570a.zza();
                    Object obj3 = this.f14571b;
                    if (obj3 != obj2) {
                        if (obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                    }
                    this.f14571b = obj;
                    this.f14570a = null;
                }
            }
        }
        return obj;
    }
}
