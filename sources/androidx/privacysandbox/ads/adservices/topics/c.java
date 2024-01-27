package androidx.privacysandbox.ads.adservices.topics;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.m;

/* compiled from: GetTopicsResponse.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<e> f3903a;

    public c(List<e> list) {
        m.f(list, "topics");
        this.f3903a = list;
    }

    public final List<e> a() {
        return this.f3903a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3903a.size() != cVar.f3903a.size()) {
            return false;
        }
        return m.a(new HashSet(this.f3903a), new HashSet(cVar.f3903a));
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f3903a});
    }

    public String toString() {
        return "Topics=" + this.f3903a;
    }
}
