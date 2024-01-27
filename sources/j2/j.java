package j2;

import a3.g;
import a3.k;
import b3.a;
import b3.c;
import e2.e;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: SafeKeyGenerator */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private final g<e, String> f9430a = new g<>(1000);

    /* renamed from: b  reason: collision with root package name */
    private final androidx.core.util.e<b> f9431b = b3.a.d(10, new a());

    /* compiled from: SafeKeyGenerator */
    class a implements a.d<b> {
        a() {
        }

        /* renamed from: b */
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* compiled from: SafeKeyGenerator */
    private static final class b implements a.f {

        /* renamed from: h  reason: collision with root package name */
        final MessageDigest f9433h;

        /* renamed from: i  reason: collision with root package name */
        private final c f9434i = c.a();

        b(MessageDigest messageDigest) {
            this.f9433h = messageDigest;
        }

        public c f() {
            return this.f9434i;
        }
    }

    private String a(e eVar) {
        b bVar = (b) a3.j.d(this.f9431b.b());
        try {
            eVar.a(bVar.f9433h);
            return k.t(bVar.f9433h.digest());
        } finally {
            this.f9431b.a(bVar);
        }
    }

    public String b(e eVar) {
        String g10;
        synchronized (this.f9430a) {
            g10 = this.f9430a.g(eVar);
        }
        if (g10 == null) {
            g10 = a(eVar);
        }
        synchronized (this.f9430a) {
            this.f9430a.k(eVar, g10);
        }
        return g10;
    }
}
