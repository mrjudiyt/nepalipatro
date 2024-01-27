package s3;

import java.util.Arrays;
import java.util.Objects;
import s3.p;

/* compiled from: AutoValue_TransportContext */
final class d extends p {

    /* renamed from: a  reason: collision with root package name */
    private final String f11374a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f11375b;

    /* renamed from: c  reason: collision with root package name */
    private final q3.d f11376c;

    /* compiled from: AutoValue_TransportContext */
    static final class b extends p.a {

        /* renamed from: a  reason: collision with root package name */
        private String f11377a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f11378b;

        /* renamed from: c  reason: collision with root package name */
        private q3.d f11379c;

        b() {
        }

        public p a() {
            String str = "";
            if (this.f11377a == null) {
                str = str + " backendName";
            }
            if (this.f11379c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f11377a, this.f11378b, this.f11379c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public p.a b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f11377a = str;
            return this;
        }

        public p.a c(byte[] bArr) {
            this.f11378b = bArr;
            return this;
        }

        public p.a d(q3.d dVar) {
            Objects.requireNonNull(dVar, "Null priority");
            this.f11379c = dVar;
            return this;
        }
    }

    public String b() {
        return this.f11374a;
    }

    public byte[] c() {
        return this.f11375b;
    }

    public q3.d d() {
        return this.f11376c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f11374a.equals(pVar.b())) {
            if (!Arrays.equals(this.f11375b, pVar instanceof d ? ((d) pVar).f11375b : pVar.c()) || !this.f11376c.equals(pVar.d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f11374a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11375b)) * 1000003) ^ this.f11376c.hashCode();
    }

    private d(String str, byte[] bArr, q3.d dVar) {
        this.f11374a = str;
        this.f11375b = bArr;
        this.f11376c = dVar;
    }
}
