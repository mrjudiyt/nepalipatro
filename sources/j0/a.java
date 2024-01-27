package j0;

import io.flutter.plugins.firebase.crashlytics.Constants;
import j0.d;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import y8.l;

/* compiled from: Preferences.kt */
public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final Map<d.a<?>, Object> f9383a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f9384b;

    /* renamed from: j0.a$a  reason: collision with other inner class name */
    /* compiled from: Preferences.kt */
    static final class C0153a extends n implements l<Map.Entry<d.a<?>, Object>, CharSequence> {

        /* renamed from: h  reason: collision with root package name */
        public static final C0153a f9385h = new C0153a();

        C0153a() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(Map.Entry<d.a<?>, Object> entry) {
            m.f(entry, "entry");
            return "  " + entry.getKey().a() + " = " + entry.getValue();
        }
    }

    public a() {
        this((Map) null, false, 3, (g) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Map map, boolean z10, int i10, g gVar) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? true : z10);
    }

    public Map<d.a<?>, Object> a() {
        Map<d.a<?>, Object> unmodifiableMap = Collections.unmodifiableMap(this.f9383a);
        m.e(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    public <T> T b(d.a<T> aVar) {
        m.f(aVar, Constants.KEY);
        return this.f9383a.get(aVar);
    }

    public final void e() {
        if (!(!this.f9384b.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return m.a(this.f9383a, ((a) obj).f9383a);
        }
        return false;
    }

    public final void f() {
        e();
        this.f9383a.clear();
    }

    public final void g() {
        this.f9384b.set(true);
    }

    public final void h(d.b<?>... bVarArr) {
        m.f(bVarArr, "pairs");
        e();
        for (d.b<?> bVar : bVarArr) {
            k(bVar.a(), bVar.b());
        }
    }

    public int hashCode() {
        return this.f9383a.hashCode();
    }

    public final <T> T i(d.a<T> aVar) {
        m.f(aVar, Constants.KEY);
        e();
        return this.f9383a.remove(aVar);
    }

    public final <T> void j(d.a<T> aVar, T t10) {
        m.f(aVar, Constants.KEY);
        k(aVar, t10);
    }

    public final void k(d.a<?> aVar, Object obj) {
        m.f(aVar, Constants.KEY);
        e();
        if (obj == null) {
            i(aVar);
        } else if (obj instanceof Set) {
            Map<d.a<?>, Object> map = this.f9383a;
            Set unmodifiableSet = Collections.unmodifiableSet(x.V((Iterable) obj));
            m.e(unmodifiableSet, "unmodifiableSet(value.toSet())");
            map.put(aVar, unmodifiableSet);
        } else {
            this.f9383a.put(aVar, obj);
        }
    }

    public String toString() {
        return x.D(this.f9383a.entrySet(), ",\n", "{\n", "\n}", 0, (CharSequence) null, C0153a.f9385h, 24, (Object) null);
    }

    public a(Map<d.a<?>, Object> map, boolean z10) {
        m.f(map, "preferencesMap");
        this.f9383a = map;
        this.f9384b = new AtomicBoolean(z10);
    }
}
