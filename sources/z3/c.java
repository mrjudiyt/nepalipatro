package z3;

import c4.a;
import java.util.Map;
import java.util.Objects;
import q3.d;
import z3.g;

/* compiled from: AutoValue_SchedulerConfig */
final class c extends g {

    /* renamed from: a  reason: collision with root package name */
    private final a f13143a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<d, g.b> f13144b;

    c(a aVar, Map<d, g.b> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.f13143a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.f13144b = map;
    }

    /* access modifiers changed from: package-private */
    public a e() {
        return this.f13143a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.f13143a.equals(gVar.e()) || !this.f13144b.equals(gVar.h())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public Map<d, g.b> h() {
        return this.f13144b;
    }

    public int hashCode() {
        return ((this.f13143a.hashCode() ^ 1000003) * 1000003) ^ this.f13144b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f13143a + ", values=" + this.f13144b + "}";
    }
}
