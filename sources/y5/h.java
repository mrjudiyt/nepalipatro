package y5;

import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.source.k;
import e4.j;
import g5.v;
import i5.f;
import i5.n;
import i5.o;
import java.util.List;
import z5.e;

/* compiled from: ExoTrackSelection */
public interface h extends k {

    /* compiled from: ExoTrackSelection */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final v f13039a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f13040b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13041c;

        public a(v vVar, int... iArr) {
            this(vVar, iArr, 0);
        }

        public a(v vVar, int[] iArr, int i10) {
            this.f13039a = vVar;
            this.f13040b = iArr;
            this.f13041c = i10;
        }
    }

    /* compiled from: ExoTrackSelection */
    public interface b {
        h[] a(a[] aVarArr, e eVar, k.a aVar, a1 a1Var);
    }

    int c();

    void d(long j10, long j11, long j12, List<? extends n> list, o[] oVarArr);

    boolean e(int i10, long j10);

    boolean f(int i10, long j10);

    void g(boolean z10);

    void h();

    void j();

    boolean l(long j10, f fVar, List<? extends n> list);

    int m(long j10, List<? extends n> list);

    int n();

    j o();

    int p();

    void q(float f10);

    Object r();

    void s();

    void t();
}
