package s;

import java.util.Arrays;
import java.util.HashSet;

/* compiled from: SolverVariable */
public class i implements Comparable<i> {

    /* renamed from: y  reason: collision with root package name */
    private static int f11258y = 1;

    /* renamed from: h  reason: collision with root package name */
    public boolean f11259h;

    /* renamed from: i  reason: collision with root package name */
    private String f11260i;

    /* renamed from: j  reason: collision with root package name */
    public int f11261j = -1;

    /* renamed from: k  reason: collision with root package name */
    int f11262k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f11263l = 0;

    /* renamed from: m  reason: collision with root package name */
    public float f11264m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f11265n = false;

    /* renamed from: o  reason: collision with root package name */
    float[] f11266o = new float[9];

    /* renamed from: p  reason: collision with root package name */
    float[] f11267p = new float[9];

    /* renamed from: q  reason: collision with root package name */
    a f11268q;

    /* renamed from: r  reason: collision with root package name */
    b[] f11269r = new b[16];

    /* renamed from: s  reason: collision with root package name */
    int f11270s = 0;

    /* renamed from: t  reason: collision with root package name */
    public int f11271t = 0;

    /* renamed from: u  reason: collision with root package name */
    boolean f11272u = false;

    /* renamed from: v  reason: collision with root package name */
    int f11273v = -1;

    /* renamed from: w  reason: collision with root package name */
    float f11274w = 0.0f;

    /* renamed from: x  reason: collision with root package name */
    HashSet<b> f11275x = null;

    /* compiled from: SolverVariable */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f11268q = aVar;
    }

    static void e() {
        f11258y++;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f11270s;
            if (i10 >= i11) {
                b[] bVarArr = this.f11269r;
                if (i11 >= bVarArr.length) {
                    this.f11269r = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f11269r;
                int i12 = this.f11270s;
                bVarArr2[i12] = bVar;
                this.f11270s = i12 + 1;
                return;
            } else if (this.f11269r[i10] != bVar) {
                i10++;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public int compareTo(i iVar) {
        return this.f11261j - iVar.f11261j;
    }

    public final void f(b bVar) {
        int i10 = this.f11270s;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f11269r[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f11269r;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f11270s--;
                return;
            }
            i11++;
        }
    }

    public void g() {
        this.f11260i = null;
        this.f11268q = a.UNKNOWN;
        this.f11263l = 0;
        this.f11261j = -1;
        this.f11262k = -1;
        this.f11264m = 0.0f;
        this.f11265n = false;
        this.f11272u = false;
        this.f11273v = -1;
        this.f11274w = 0.0f;
        int i10 = this.f11270s;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f11269r[i11] = null;
        }
        this.f11270s = 0;
        this.f11271t = 0;
        this.f11259h = false;
        Arrays.fill(this.f11267p, 0.0f);
    }

    public void k(d dVar, float f10) {
        this.f11264m = f10;
        this.f11265n = true;
        this.f11272u = false;
        this.f11273v = -1;
        this.f11274w = 0.0f;
        int i10 = this.f11270s;
        this.f11262k = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f11269r[i11].A(dVar, this, false);
        }
        this.f11270s = 0;
    }

    public void l(a aVar, String str) {
        this.f11268q = aVar;
    }

    public final void m(d dVar, b bVar) {
        int i10 = this.f11270s;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f11269r[i11].B(dVar, bVar, false);
        }
        this.f11270s = 0;
    }

    public String toString() {
        if (this.f11260i != null) {
            return "" + this.f11260i;
        }
        return "" + this.f11261j;
    }
}
