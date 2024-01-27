package q3;

import java.util.Objects;

/* compiled from: Encoding */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f10679a;

    private b(String str) {
        Objects.requireNonNull(str, "name is null");
        this.f10679a = str;
    }

    public static b b(String str) {
        return new b(str);
    }

    public String a() {
        return this.f10679a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f10679a.equals(((b) obj).f10679a);
    }

    public int hashCode() {
        return this.f10679a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f10679a + "\"}";
    }
}
