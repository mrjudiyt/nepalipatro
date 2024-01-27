package g5;

import com.google.android.exoplayer2.source.m;
import k4.i;
import k4.j;
import k4.o;
import k4.x;
import q4.f;

/* compiled from: BundledExtractorsAdapter */
public final class a implements m {

    /* renamed from: a  reason: collision with root package name */
    private final o f8881a;

    /* renamed from: b  reason: collision with root package name */
    private i f8882b;

    /* renamed from: c  reason: collision with root package name */
    private j f8883c;

    public a(o oVar) {
        this.f8881a = oVar;
    }

    public void b(long j10, long j11) {
        ((i) a6.a.e(this.f8882b)).b(j10, j11);
    }

    public int c(x xVar) {
        return ((i) a6.a.e(this.f8882b)).g((j) a6.a.e(this.f8883c), xVar);
    }

    public long d() {
        j jVar = this.f8883c;
        if (jVar != null) {
            return jVar.getPosition();
        }
        return -1;
    }

    public void e() {
        i iVar = this.f8882b;
        if (iVar instanceof f) {
            ((f) iVar).j();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r0.getPosition() != r11) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        if (r0.getPosition() != r11) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        r1 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(z5.g r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, k4.k r15) {
        /*
            r7 = this;
            k4.f r6 = new k4.f
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f8883c = r6
            k4.i r8 = r7.f8882b
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            k4.o r8 = r7.f8881a
            k4.i[] r8 = r8.b(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L_0x0020
            r8 = r8[r13]
            r7.f8882b = r8
            goto L_0x0075
        L_0x0020:
            int r10 = r8.length
            r0 = 0
        L_0x0022:
            if (r0 >= r10) goto L_0x0071
            r1 = r8[r0]
            boolean r2 = r1.d(r6)     // Catch:{ EOFException -> 0x0057, all -> 0x0042 }
            if (r2 == 0) goto L_0x0035
            r7.f8882b = r1     // Catch:{ EOFException -> 0x0057, all -> 0x0042 }
            a6.a.f(r14)
            r6.k()
            goto L_0x0071
        L_0x0035:
            k4.i r1 = r7.f8882b
            if (r1 != 0) goto L_0x0067
            long r1 = r6.getPosition()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0065
            goto L_0x0067
        L_0x0042:
            r8 = move-exception
            k4.i r9 = r7.f8882b
            if (r9 != 0) goto L_0x004f
            long r9 = r6.getPosition()
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x0050
        L_0x004f:
            r13 = 1
        L_0x0050:
            a6.a.f(r13)
            r6.k()
            throw r8
        L_0x0057:
            k4.i r1 = r7.f8882b
            if (r1 != 0) goto L_0x0067
            long r1 = r6.getPosition()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r1 = 0
            goto L_0x0068
        L_0x0067:
            r1 = 1
        L_0x0068:
            a6.a.f(r1)
            r6.k()
            int r0 = r0 + 1
            goto L_0x0022
        L_0x0071:
            k4.i r10 = r7.f8882b
            if (r10 == 0) goto L_0x007b
        L_0x0075:
            k4.i r8 = r7.f8882b
            r8.c(r15)
            return
        L_0x007b:
            com.google.android.exoplayer2.source.UnrecognizedInputFormatException r10 = new com.google.android.exoplayer2.source.UnrecognizedInputFormatException
            java.lang.String r8 = a6.m0.J(r8)
            java.lang.String r11 = java.lang.String.valueOf(r8)
            int r11 = r11.length()
            int r11 = r11 + 58
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r11)
            java.lang.String r11 = "None of the available extractors ("
            r12.append(r11)
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            java.lang.Object r9 = a6.a.e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.f(z5.g, android.net.Uri, java.util.Map, long, long, k4.k):void");
    }

    public void release() {
        i iVar = this.f8882b;
        if (iVar != null) {
            iVar.release();
            this.f8882b = null;
        }
        this.f8883c = null;
    }
}
