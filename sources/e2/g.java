package e2;

import a3.b;
import androidx.collection.a;
import java.security.MessageDigest;

/* compiled from: Options */
public final class g implements e {

    /* renamed from: b  reason: collision with root package name */
    private final a<f<?>, Object> f8003b = new b();

    private static <T> void f(f<T> fVar, Object obj, MessageDigest messageDigest) {
        fVar.g(obj, messageDigest);
    }

    public void a(MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f8003b.size(); i10++) {
            f(this.f8003b.i(i10), this.f8003b.m(i10), messageDigest);
        }
    }

    public <T> T c(f<T> fVar) {
        return this.f8003b.containsKey(fVar) ? this.f8003b.get(fVar) : fVar.c();
    }

    public void d(g gVar) {
        this.f8003b.j(gVar.f8003b);
    }

    public <T> g e(f<T> fVar, T t10) {
        this.f8003b.put(fVar, t10);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f8003b.equals(((g) obj).f8003b);
        }
        return false;
    }

    public int hashCode() {
        return this.f8003b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f8003b + '}';
    }
}
