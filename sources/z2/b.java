package z2;

import a3.j;
import e2.e;
import java.security.MessageDigest;

/* compiled from: ObjectKey */
public final class b implements e {

    /* renamed from: b  reason: collision with root package name */
    private final Object f13137b;

    public b(Object obj) {
        this.f13137b = j.d(obj);
    }

    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.f13137b.toString().getBytes(e.f7997a));
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f13137b.equals(((b) obj).f13137b);
        }
        return false;
    }

    public int hashCode() {
        return this.f13137b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f13137b + '}';
    }
}
