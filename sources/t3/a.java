package t3;

import java.util.Arrays;
import java.util.Objects;
import s3.i;
import t3.f;

/* compiled from: AutoValue_BackendRequest */
final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Iterable<i> f11633a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f11634b;

    /* compiled from: AutoValue_BackendRequest */
    static final class b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private Iterable<i> f11635a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f11636b;

        b() {
        }

        public f a() {
            String str = "";
            if (this.f11635a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new a(this.f11635a, this.f11636b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f.a b(Iterable<i> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.f11635a = iterable;
            return this;
        }

        public f.a c(byte[] bArr) {
            this.f11636b = bArr;
            return this;
        }
    }

    public Iterable<i> b() {
        return this.f11633a;
    }

    public byte[] c() {
        return this.f11634b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f11633a.equals(fVar.b())) {
            if (Arrays.equals(this.f11634b, fVar instanceof a ? ((a) fVar).f11634b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f11633a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11634b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f11633a + ", extras=" + Arrays.toString(this.f11634b) + "}";
    }

    private a(Iterable<i> iterable, byte[] bArr) {
        this.f11633a = iterable;
        this.f11634b = bArr;
    }
}
