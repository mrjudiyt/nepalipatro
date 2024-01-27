package androidx.work;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ContentUriTriggers */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Set<a> f4749a = new HashSet();

    /* compiled from: ContentUriTriggers */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f4750a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f4751b;

        a(Uri uri, boolean z10) {
            this.f4750a = uri;
            this.f4751b = z10;
        }

        public Uri a() {
            return this.f4750a;
        }

        public boolean b() {
            return this.f4751b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f4751b != aVar.f4751b || !this.f4750a.equals(aVar.f4750a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f4750a.hashCode() * 31) + (this.f4751b ? 1 : 0);
        }
    }

    public void a(Uri uri, boolean z10) {
        this.f4749a.add(new a(uri, z10));
    }

    public Set<a> b() {
        return this.f4749a;
    }

    public int c() {
        return this.f4749a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f4749a.equals(((d) obj).f4749a);
    }

    public int hashCode() {
        return this.f4749a.hashCode();
    }
}
