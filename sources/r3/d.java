package r3;

import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;
import java.util.Objects;

/* compiled from: AutoValue_BatchedLogRequest */
final class d extends j {

    /* renamed from: a  reason: collision with root package name */
    private final List<m> f10929a;

    d(List<m> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.f10929a = list;
    }

    @Encodable.Field(name = "logRequest")
    public List<m> c() {
        return this.f10929a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f10929a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f10929a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f10929a + "}";
    }
}
