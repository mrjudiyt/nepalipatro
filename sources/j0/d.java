package j0;

import java.util.Map;
import kotlin.jvm.internal.m;

/* compiled from: Preferences.kt */
public abstract class d {

    /* compiled from: Preferences.kt */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f9392a;

        public a(String str) {
            m.f(str, "name");
            this.f9392a = str;
        }

        public final String a() {
            return this.f9392a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return m.a(this.f9392a, ((a) obj).f9392a);
            }
            return false;
        }

        public int hashCode() {
            return this.f9392a.hashCode();
        }

        public String toString() {
            return this.f9392a;
        }
    }

    /* compiled from: Preferences.kt */
    public static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        private final a<T> f9393a;

        /* renamed from: b  reason: collision with root package name */
        private final T f9394b;

        public final a<T> a() {
            return this.f9393a;
        }

        public final T b() {
            return this.f9394b;
        }
    }

    public abstract Map<a<?>, Object> a();

    public abstract <T> T b(a<T> aVar);

    public final a c() {
        return new a(h0.n(a()), false);
    }

    public final d d() {
        return new a(h0.n(a()), true);
    }
}
