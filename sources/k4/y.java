package k4;

/* compiled from: SeekMap */
public interface y {

    /* compiled from: SeekMap */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final z f9628a;

        /* renamed from: b  reason: collision with root package name */
        public final z f9629b;

        public a(z zVar) {
            this(zVar, zVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f9628a.equals(aVar.f9628a) || !this.f9629b.equals(aVar.f9629b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f9628a.hashCode() * 31) + this.f9629b.hashCode();
        }

        public String toString() {
            String str;
            String valueOf = String.valueOf(this.f9628a);
            if (this.f9628a.equals(this.f9629b)) {
                str = "";
            } else {
                String valueOf2 = String.valueOf(this.f9629b);
                StringBuilder sb = new StringBuilder(valueOf2.length() + 2);
                sb.append(", ");
                sb.append(valueOf2);
                str = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 2 + String.valueOf(str).length());
            sb2.append("[");
            sb2.append(valueOf);
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }

        public a(z zVar, z zVar2) {
            this.f9628a = (z) a6.a.e(zVar);
            this.f9629b = (z) a6.a.e(zVar2);
        }
    }

    /* compiled from: SeekMap */
    public static class b implements y {

        /* renamed from: a  reason: collision with root package name */
        private final long f9630a;

        /* renamed from: b  reason: collision with root package name */
        private final a f9631b;

        public b(long j10) {
            this(j10, 0);
        }

        public boolean f() {
            return false;
        }

        public a h(long j10) {
            return this.f9631b;
        }

        public long i() {
            return this.f9630a;
        }

        public b(long j10, long j11) {
            this.f9630a = j10;
            this.f9631b = new a(j11 == 0 ? z.f9632c : new z(0, j11));
        }
    }

    boolean f();

    a h(long j10);

    long i();
}
