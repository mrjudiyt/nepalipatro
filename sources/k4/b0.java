package k4;

import a6.y;
import e4.j;
import java.util.Arrays;
import z5.g;

/* compiled from: TrackOutput */
public interface b0 {

    /* compiled from: TrackOutput */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f9535a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f9536b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9537c;

        /* renamed from: d  reason: collision with root package name */
        public final int f9538d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f9535a = i10;
            this.f9536b = bArr;
            this.f9537c = i11;
            this.f9538d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f9535a == aVar.f9535a && this.f9537c == aVar.f9537c && this.f9538d == aVar.f9538d && Arrays.equals(this.f9536b, aVar.f9536b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f9535a * 31) + Arrays.hashCode(this.f9536b)) * 31) + this.f9537c) * 31) + this.f9538d;
        }
    }

    void a(y yVar, int i10);

    int b(g gVar, int i10, boolean z10, int i11);

    int c(g gVar, int i10, boolean z10);

    void d(j jVar);

    void e(long j10, int i10, int i11, int i12, a aVar);

    void f(y yVar, int i10, int i11);
}
