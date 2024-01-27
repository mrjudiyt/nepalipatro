package o8;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.Serializable;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: Result.kt */
public final class l<T> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public static final a f16183h = new a((g) null);

    /* compiled from: Result.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* compiled from: Result.kt */
    public static final class b implements Serializable {

        /* renamed from: h  reason: collision with root package name */
        public final Throwable f16184h;

        public b(Throwable th) {
            m.f(th, Constants.EXCEPTION);
            this.f16184h = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && m.a(this.f16184h, ((b) obj).f16184h);
        }

        public int hashCode() {
            return this.f16184h.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f16184h + ')';
        }
    }

    public static <T> Object a(Object obj) {
        return obj;
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f16184h;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof b;
    }

    public static final boolean d(Object obj) {
        return !(obj instanceof b);
    }
}
