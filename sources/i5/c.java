package i5;

import a6.p;
import com.google.android.exoplayer2.source.u;
import i5.g;
import k4.b0;
import k4.h;

/* compiled from: BaseMediaChunkOutput */
public final class c implements g.b {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f9287a;

    /* renamed from: b  reason: collision with root package name */
    private final u[] f9288b;

    public c(int[] iArr, u[] uVarArr) {
        this.f9287a = iArr;
        this.f9288b = uVarArr;
    }

    public int[] a() {
        int[] iArr = new int[this.f9288b.length];
        int i10 = 0;
        while (true) {
            u[] uVarArr = this.f9288b;
            if (i10 >= uVarArr.length) {
                return iArr;
            }
            iArr[i10] = uVarArr[i10].G();
            i10++;
        }
    }

    public void b(long j10) {
        for (u a02 : this.f9288b) {
            a02.a0(j10);
        }
    }

    public b0 e(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f9287a;
            if (i12 >= iArr.length) {
                StringBuilder sb = new StringBuilder(36);
                sb.append("Unmatched track of type: ");
                sb.append(i11);
                p.c("BaseMediaChunkOutput", sb.toString());
                return new h();
            } else if (i11 == iArr[i12]) {
                return this.f9288b[i12];
            } else {
                i12++;
            }
        }
    }
}
