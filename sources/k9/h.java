package k9;

import com.facebook.internal.AnalyticsEvents;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: Channel.kt */
public final class h<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final b f15528b = new b((g) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final c f15529c = new c();

    /* renamed from: a  reason: collision with root package name */
    private final Object f15530a;

    /* compiled from: Channel.kt */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f15531a;

        public a(Throwable th) {
            this.f15531a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && m.a(this.f15531a, ((a) obj).f15531a);
        }

        public int hashCode() {
            Throwable th = this.f15531a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Closed(" + this.f15531a + ')';
        }
    }

    /* compiled from: Channel.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final <E> Object a(Throwable th) {
            return h.c(new a(th));
        }

        public final <E> Object b() {
            return h.c(h.f15529c);
        }

        public final <E> Object c(E e10) {
            return h.c(e10);
        }
    }

    /* compiled from: Channel.kt */
    public static class c {
        public String toString() {
            return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED;
        }
    }

    private /* synthetic */ h(Object obj) {
        this.f15530a = obj;
    }

    public static final /* synthetic */ h b(Object obj) {
        return new h(obj);
    }

    public static <T> Object c(Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof h) && m.a(obj, ((h) obj2).k());
    }

    public static final Throwable e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f15531a;
        }
        return null;
    }

    public static final T f(Object obj) {
        if (!(obj instanceof c)) {
            return obj;
        }
        return null;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof a;
    }

    public static final boolean i(Object obj) {
        return !(obj instanceof c);
    }

    public static String j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f15530a, obj);
    }

    public int hashCode() {
        return g(this.f15530a);
    }

    public final /* synthetic */ Object k() {
        return this.f15530a;
    }

    public String toString() {
        return j(this.f15530a);
    }
}
