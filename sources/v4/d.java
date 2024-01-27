package v4;

import a6.m0;
import a6.p;
import a6.y;
import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import k4.j;

/* compiled from: WavHeaderReader */
final class d {

    /* compiled from: WavHeaderReader */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f12402a;

        /* renamed from: b  reason: collision with root package name */
        public final long f12403b;

        private a(int i10, long j10) {
            this.f12402a = i10;
            this.f12403b = j10;
        }

        public static a a(j jVar, y yVar) {
            jVar.o(yVar.d(), 0, 8);
            yVar.O(0);
            return new a(yVar.m(), yVar.s());
        }
    }

    public static c a(j jVar) {
        byte[] bArr;
        a6.a.e(jVar);
        y yVar = new y(16);
        if (a.a(jVar, yVar).f12402a != 1380533830) {
            return null;
        }
        jVar.o(yVar.d(), 0, 4);
        yVar.O(0);
        int m10 = yVar.m();
        if (m10 != 1463899717) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unsupported RIFF format: ");
            sb.append(m10);
            p.c("WavHeaderReader", sb.toString());
            return null;
        }
        a a10 = a.a(jVar, yVar);
        while (a10.f12402a != 1718449184) {
            jVar.f((int) a10.f12403b);
            a10 = a.a(jVar, yVar);
        }
        a6.a.f(a10.f12403b >= 16);
        jVar.o(yVar.d(), 0, 16);
        yVar.O(0);
        int u10 = yVar.u();
        int u11 = yVar.u();
        int t10 = yVar.t();
        int t11 = yVar.t();
        int u12 = yVar.u();
        int u13 = yVar.u();
        int i10 = ((int) a10.f12403b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            jVar.o(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = m0.f210f;
        }
        return new c(u10, u11, t10, t11, u12, u13, bArr);
    }

    public static Pair<Long, Long> b(j jVar) {
        a6.a.e(jVar);
        jVar.k();
        y yVar = new y(8);
        a a10 = a.a(jVar, yVar);
        while (true) {
            int i10 = a10.f12402a;
            if (i10 != 1684108385) {
                if (!(i10 == 1380533830 || i10 == 1718449184)) {
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("Ignoring unknown WAV chunk: ");
                    sb.append(i10);
                    p.h("WavHeaderReader", sb.toString());
                }
                long j10 = a10.f12403b + 8;
                int i11 = a10.f12402a;
                if (i11 == 1380533830) {
                    j10 = 12;
                }
                if (j10 <= 2147483647L) {
                    jVar.l((int) j10);
                    a10 = a.a(jVar, yVar);
                } else {
                    StringBuilder sb2 = new StringBuilder(51);
                    sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                    sb2.append(i11);
                    throw ParserException.d(sb2.toString());
                }
            } else {
                jVar.l(8);
                long position = jVar.getPosition();
                long j11 = a10.f12403b + position;
                long a11 = jVar.a();
                if (a11 != -1 && j11 > a11) {
                    StringBuilder sb3 = new StringBuilder(69);
                    sb3.append("Data exceeds input length: ");
                    sb3.append(j11);
                    sb3.append(", ");
                    sb3.append(a11);
                    p.h("WavHeaderReader", sb3.toString());
                    j11 = a11;
                }
                return Pair.create(Long.valueOf(position), Long.valueOf(j11));
            }
        }
    }
}
