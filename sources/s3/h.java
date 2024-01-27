package s3;

import java.util.Arrays;
import java.util.Objects;
import q3.b;

/* compiled from: EncodedPayload */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final b f11394a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f11395b;

    public h(b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f11394a = bVar;
        this.f11395b = bArr;
    }

    public byte[] a() {
        return this.f11395b;
    }

    public b b() {
        return this.f11394a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f11394a.equals(hVar.f11394a)) {
            return false;
        }
        return Arrays.equals(this.f11395b, hVar.f11395b);
    }

    public int hashCode() {
        return ((this.f11394a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11395b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f11394a + ", bytes=[...]}";
    }
}
