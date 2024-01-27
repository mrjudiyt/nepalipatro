package y5;

import a6.m0;
import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.source.k;
import com.google.android.gms.common.api.Api;
import com.google.common.collect.o;
import com.google.common.collect.v0;
import com.google.common.collect.x;
import e4.j;
import e4.r;
import e4.t;
import g5.v;
import g5.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import y5.a;
import y5.h;
import y5.j;
import y5.m;

/* compiled from: DefaultTrackSelector */
public class f extends j {

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f12994f = new int[0];
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final v0<Integer> f12995g = v0.a(e.f17295h);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final v0<Integer> f12996h = v0.a(d.f17294h);

    /* renamed from: d  reason: collision with root package name */
    private final h.b f12997d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicReference<d> f12998e;

    /* compiled from: DefaultTrackSelector */
    protected static final class b implements Comparable<b> {

        /* renamed from: h  reason: collision with root package name */
        public final boolean f12999h;

        /* renamed from: i  reason: collision with root package name */
        private final String f13000i;

        /* renamed from: j  reason: collision with root package name */
        private final d f13001j;

        /* renamed from: k  reason: collision with root package name */
        private final boolean f13002k;

        /* renamed from: l  reason: collision with root package name */
        private final int f13003l;

        /* renamed from: m  reason: collision with root package name */
        private final int f13004m;

        /* renamed from: n  reason: collision with root package name */
        private final int f13005n;

        /* renamed from: o  reason: collision with root package name */
        private final int f13006o;

        /* renamed from: p  reason: collision with root package name */
        private final int f13007p;

        /* renamed from: q  reason: collision with root package name */
        private final boolean f13008q;

        /* renamed from: r  reason: collision with root package name */
        private final int f13009r;

        /* renamed from: s  reason: collision with root package name */
        private final int f13010s;

        /* renamed from: t  reason: collision with root package name */
        private final int f13011t;

        /* renamed from: u  reason: collision with root package name */
        private final int f13012u;

        public b(j jVar, d dVar, int i10) {
            int i11;
            int i12;
            int i13;
            this.f13001j = dVar;
            this.f13000i = f.z(jVar.f8087j);
            int i14 = 0;
            this.f13002k = f.t(i10, false);
            int i15 = 0;
            while (true) {
                int size = dVar.f13067t.size();
                i11 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                if (i15 >= size) {
                    i15 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    i12 = 0;
                    break;
                }
                i12 = f.q(jVar, dVar.f13067t.get(i15), false);
                if (i12 > 0) {
                    break;
                }
                i15++;
            }
            this.f13004m = i15;
            this.f13003l = i12;
            this.f13005n = Integer.bitCount(jVar.f8089l & dVar.f13068u);
            boolean z10 = true;
            this.f13008q = (jVar.f8088k & 1) != 0;
            int i16 = jVar.F;
            this.f13009r = i16;
            this.f13010s = jVar.G;
            int i17 = jVar.f8092o;
            this.f13011t = i17;
            if ((i17 != -1 && i17 > dVar.f13070w) || (i16 != -1 && i16 > dVar.f13069v)) {
                z10 = false;
            }
            this.f12999h = z10;
            String[] b02 = m0.b0();
            int i18 = 0;
            while (true) {
                if (i18 >= b02.length) {
                    i18 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    i13 = 0;
                    break;
                }
                i13 = f.q(jVar, b02[i18], false);
                if (i13 > 0) {
                    break;
                }
                i18++;
            }
            this.f13006o = i18;
            this.f13007p = i13;
            while (true) {
                if (i14 < dVar.f13071x.size()) {
                    String str = jVar.f8096s;
                    if (str != null && str.equals(dVar.f13071x.get(i14))) {
                        i11 = i14;
                        break;
                    }
                    i14++;
                } else {
                    break;
                }
            }
            this.f13012u = i11;
        }

        /* renamed from: a */
        public int compareTo(b bVar) {
            v0 v0Var;
            if (!this.f12999h || !this.f13002k) {
                v0Var = f.f12995g.f();
            } else {
                v0Var = f.f12995g;
            }
            o f10 = o.j().g(this.f13002k, bVar.f13002k).f(Integer.valueOf(this.f13004m), Integer.valueOf(bVar.f13004m), v0.c().f()).d(this.f13003l, bVar.f13003l).d(this.f13005n, bVar.f13005n).g(this.f12999h, bVar.f12999h).f(Integer.valueOf(this.f13012u), Integer.valueOf(bVar.f13012u), v0.c().f()).f(Integer.valueOf(this.f13011t), Integer.valueOf(bVar.f13011t), this.f13001j.B ? f.f12995g.f() : f.f12996h).g(this.f13008q, bVar.f13008q).f(Integer.valueOf(this.f13006o), Integer.valueOf(bVar.f13006o), v0.c().f()).d(this.f13007p, bVar.f13007p).f(Integer.valueOf(this.f13009r), Integer.valueOf(bVar.f13009r), v0Var).f(Integer.valueOf(this.f13010s), Integer.valueOf(bVar.f13010s), v0Var);
            Integer valueOf = Integer.valueOf(this.f13011t);
            Integer valueOf2 = Integer.valueOf(bVar.f13011t);
            if (!m0.c(this.f13000i, bVar.f13000i)) {
                v0Var = f.f12996h;
            }
            return f10.f(valueOf, valueOf2, v0Var).i();
        }
    }

    /* compiled from: DefaultTrackSelector */
    protected static final class c implements Comparable<c> {

        /* renamed from: h  reason: collision with root package name */
        private final boolean f13013h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f13014i;

        public c(j jVar, int i10) {
            this.f13013h = (jVar.f8088k & 1) == 0 ? false : true;
            this.f13014i = f.t(i10, false);
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            return o.j().g(this.f13014i, cVar.f13014i).g(this.f13013h, cVar.f13013h).i();
        }
    }

    /* compiled from: DefaultTrackSelector */
    public static final class d extends m {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public static final d S;
        @Deprecated
        public static final d T;
        public final int F;
        public final boolean G;
        public final boolean H;
        public final boolean I;
        public final boolean J;
        public final boolean K;
        public final boolean L;
        public final boolean M;
        public final boolean N;
        public final boolean O;
        public final boolean P;
        private final SparseArray<Map<w, C0219f>> Q;
        private final SparseBooleanArray R;

        /* compiled from: DefaultTrackSelector */
        class a implements Parcelable.Creator<d> {
            a() {
            }

            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* renamed from: b */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        static {
            d O2 = new e().w();
            S = O2;
            T = O2;
        }

        private static boolean b(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean c(SparseArray<Map<w, C0219f>> sparseArray, SparseArray<Map<w, C0219f>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (indexOfKey < 0 || !d(sparseArray.valueAt(i10), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x001a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean d(java.util.Map<g5.w, y5.f.C0219f> r4, java.util.Map<g5.w, y5.f.C0219f> r5) {
            /*
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r1 == r0) goto L_0x000c
                return r2
            L_0x000c:
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L_0x0014:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x003b
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                g5.w r1 = (g5.w) r1
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L_0x003a
                java.lang.Object r0 = r0.getValue()
                java.lang.Object r1 = r5.get(r1)
                boolean r0 = a6.m0.c(r0, r1)
                if (r0 != 0) goto L_0x0014
            L_0x003a:
                return r2
            L_0x003b:
                r4 = 1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: y5.f.d.d(java.util.Map, java.util.Map):boolean");
        }

        public static d e(Context context) {
            return new e(context).w();
        }

        private static SparseArray<Map<w, C0219f>> i(Parcel parcel) {
            int readInt = parcel.readInt();
            SparseArray<Map<w, C0219f>> sparseArray = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i11 = 0; i11 < readInt3; i11++) {
                    hashMap.put((w) a6.a.e((w) parcel.readParcelable(w.class.getClassLoader())), (C0219f) parcel.readParcelable(C0219f.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            return sparseArray;
        }

        private static void j(Parcel parcel, SparseArray<Map<w, C0219f>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = sparseArray.keyAt(i10);
                Map valueAt = sparseArray.valueAt(i10);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry entry : valueAt.entrySet()) {
                    parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                    parcel.writeParcelable((Parcelable) entry.getValue(), 0);
                }
            }
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (super.equals(dVar) && this.G == dVar.G && this.H == dVar.H && this.I == dVar.I && this.J == dVar.J && this.K == dVar.K && this.L == dVar.L && this.M == dVar.M && this.F == dVar.F && this.N == dVar.N && this.O == dVar.O && this.P == dVar.P && b(this.R, dVar.R) && c(this.Q, dVar.Q)) {
                return true;
            }
            return false;
        }

        public final boolean f(int i10) {
            return this.R.get(i10);
        }

        public final C0219f g(int i10, w wVar) {
            Map map = this.Q.get(i10);
            if (map != null) {
                return (C0219f) map.get(wVar);
            }
            return null;
        }

        public final boolean h(int i10, w wVar) {
            Map map = this.Q.get(i10);
            return map != null && map.containsKey(wVar);
        }

        public int hashCode() {
            return ((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0)) * 31) + (this.M ? 1 : 0)) * 31) + this.F) * 31) + (this.N ? 1 : 0)) * 31) + (this.O ? 1 : 0)) * 31) + (this.P ? 1 : 0);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            m0.M0(parcel, this.G);
            m0.M0(parcel, this.H);
            m0.M0(parcel, this.I);
            m0.M0(parcel, this.J);
            m0.M0(parcel, this.K);
            m0.M0(parcel, this.L);
            m0.M0(parcel, this.M);
            parcel.writeInt(this.F);
            m0.M0(parcel, this.N);
            m0.M0(parcel, this.O);
            m0.M0(parcel, this.P);
            j(parcel, this.Q);
            parcel.writeSparseBooleanArray(this.R);
        }

        private d(e eVar) {
            super((m.b) eVar);
            this.G = eVar.f13015w;
            this.H = eVar.f13016x;
            this.I = eVar.f13017y;
            this.J = eVar.f13018z;
            this.K = eVar.A;
            this.L = eVar.B;
            this.M = eVar.C;
            this.F = eVar.D;
            this.N = eVar.E;
            this.O = eVar.F;
            this.P = eVar.G;
            this.Q = eVar.H;
            this.R = eVar.I;
        }

        d(Parcel parcel) {
            super(parcel);
            this.G = m0.A0(parcel);
            this.H = m0.A0(parcel);
            this.I = m0.A0(parcel);
            this.J = m0.A0(parcel);
            this.K = m0.A0(parcel);
            this.L = m0.A0(parcel);
            this.M = m0.A0(parcel);
            this.F = parcel.readInt();
            this.N = m0.A0(parcel);
            this.O = m0.A0(parcel);
            this.P = m0.A0(parcel);
            this.Q = i(parcel);
            this.R = (SparseBooleanArray) m0.j(parcel.readSparseBooleanArray());
        }
    }

    /* renamed from: y5.f$f  reason: collision with other inner class name */
    /* compiled from: DefaultTrackSelector */
    public static final class C0219f implements Parcelable {
        public static final Parcelable.Creator<C0219f> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public final int f13019h;

        /* renamed from: i  reason: collision with root package name */
        public final int[] f13020i;

        /* renamed from: j  reason: collision with root package name */
        public final int f13021j;

        /* renamed from: k  reason: collision with root package name */
        public final int f13022k;

        /* renamed from: y5.f$f$a */
        /* compiled from: DefaultTrackSelector */
        class a implements Parcelable.Creator<C0219f> {
            a() {
            }

            /* renamed from: a */
            public C0219f createFromParcel(Parcel parcel) {
                return new C0219f(parcel);
            }

            /* renamed from: b */
            public C0219f[] newArray(int i10) {
                return new C0219f[i10];
            }
        }

        C0219f(Parcel parcel) {
            this.f13019h = parcel.readInt();
            int readByte = parcel.readByte();
            this.f13021j = readByte;
            int[] iArr = new int[readByte];
            this.f13020i = iArr;
            parcel.readIntArray(iArr);
            this.f13022k = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0219f.class != obj.getClass()) {
                return false;
            }
            C0219f fVar = (C0219f) obj;
            if (this.f13019h == fVar.f13019h && Arrays.equals(this.f13020i, fVar.f13020i) && this.f13022k == fVar.f13022k) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f13019h * 31) + Arrays.hashCode(this.f13020i)) * 31) + this.f13022k;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f13019h);
            parcel.writeInt(this.f13020i.length);
            parcel.writeIntArray(this.f13020i);
            parcel.writeInt(this.f13022k);
        }
    }

    /* compiled from: DefaultTrackSelector */
    protected static final class g implements Comparable<g> {

        /* renamed from: h  reason: collision with root package name */
        public final boolean f13023h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f13024i;

        /* renamed from: j  reason: collision with root package name */
        private final boolean f13025j;

        /* renamed from: k  reason: collision with root package name */
        private final boolean f13026k;

        /* renamed from: l  reason: collision with root package name */
        private final int f13027l;

        /* renamed from: m  reason: collision with root package name */
        private final int f13028m;

        /* renamed from: n  reason: collision with root package name */
        private final int f13029n;

        /* renamed from: o  reason: collision with root package name */
        private final int f13030o;

        /* renamed from: p  reason: collision with root package name */
        private final boolean f13031p;

        public g(j jVar, d dVar, int i10, String str) {
            x<String> xVar;
            int i11;
            boolean z10 = false;
            this.f13024i = f.t(i10, false);
            int i12 = jVar.f8088k & (~dVar.F);
            this.f13025j = (i12 & 1) != 0;
            this.f13026k = (i12 & 2) != 0;
            int i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (dVar.f13072y.isEmpty()) {
                xVar = x.t("");
            } else {
                xVar = dVar.f13072y;
            }
            int i14 = 0;
            while (true) {
                if (i14 >= xVar.size()) {
                    i11 = 0;
                    break;
                }
                i11 = f.q(jVar, xVar.get(i14), dVar.A);
                if (i11 > 0) {
                    i13 = i14;
                    break;
                }
                i14++;
            }
            this.f13027l = i13;
            this.f13028m = i11;
            int bitCount = Integer.bitCount(jVar.f8089l & dVar.f13073z);
            this.f13029n = bitCount;
            this.f13031p = (jVar.f8089l & 1088) != 0;
            int q10 = f.q(jVar, str, f.z(str) == null);
            this.f13030o = q10;
            if (i11 > 0 || ((dVar.f13072y.isEmpty() && bitCount > 0) || this.f13025j || (this.f13026k && q10 > 0))) {
                z10 = true;
            }
            this.f13023h = z10;
        }

        /* renamed from: a */
        public int compareTo(g gVar) {
            o d10 = o.j().g(this.f13024i, gVar.f13024i).f(Integer.valueOf(this.f13027l), Integer.valueOf(gVar.f13027l), v0.c().f()).d(this.f13028m, gVar.f13028m).d(this.f13029n, gVar.f13029n).g(this.f13025j, gVar.f13025j).f(Boolean.valueOf(this.f13026k), Boolean.valueOf(gVar.f13026k), this.f13028m == 0 ? v0.c() : v0.c().f()).d(this.f13030o, gVar.f13030o);
            if (this.f13029n == 0) {
                d10 = d10.h(this.f13031p, gVar.f13031p);
            }
            return d10.i();
        }
    }

    /* compiled from: DefaultTrackSelector */
    protected static final class h implements Comparable<h> {

        /* renamed from: h  reason: collision with root package name */
        public final boolean f13032h;

        /* renamed from: i  reason: collision with root package name */
        private final d f13033i;

        /* renamed from: j  reason: collision with root package name */
        private final boolean f13034j;

        /* renamed from: k  reason: collision with root package name */
        private final boolean f13035k;

        /* renamed from: l  reason: collision with root package name */
        private final int f13036l;

        /* renamed from: m  reason: collision with root package name */
        private final int f13037m;

        /* renamed from: n  reason: collision with root package name */
        private final int f13038n;

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0053, code lost:
            if (r10 < ((float) r8.f13061n)) goto L_0x005e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x005b, code lost:
            if (r10 < r8.f13062o) goto L_0x005e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0091 A[EDGE_INSN: B:50:0x0091->B:48:0x0091 ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public h(e4.j r7, y5.f.d r8, int r9, boolean r10) {
            /*
                r6 = this;
                r6.<init>()
                r6.f13033i = r8
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1 = 1
                r2 = 0
                r3 = -1
                if (r10 == 0) goto L_0x0033
                int r4 = r7.f8101x
                if (r4 == r3) goto L_0x0014
                int r5 = r8.f13055h
                if (r4 > r5) goto L_0x0033
            L_0x0014:
                int r4 = r7.f8102y
                if (r4 == r3) goto L_0x001c
                int r5 = r8.f13056i
                if (r4 > r5) goto L_0x0033
            L_0x001c:
                float r4 = r7.f8103z
                int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r5 == 0) goto L_0x0029
                int r5 = r8.f13057j
                float r5 = (float) r5
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 > 0) goto L_0x0033
            L_0x0029:
                int r4 = r7.f8092o
                if (r4 == r3) goto L_0x0031
                int r5 = r8.f13058k
                if (r4 > r5) goto L_0x0033
            L_0x0031:
                r4 = 1
                goto L_0x0034
            L_0x0033:
                r4 = 0
            L_0x0034:
                r6.f13032h = r4
                if (r10 == 0) goto L_0x005e
                int r10 = r7.f8101x
                if (r10 == r3) goto L_0x0040
                int r4 = r8.f13059l
                if (r10 < r4) goto L_0x005e
            L_0x0040:
                int r10 = r7.f8102y
                if (r10 == r3) goto L_0x0048
                int r4 = r8.f13060m
                if (r10 < r4) goto L_0x005e
            L_0x0048:
                float r10 = r7.f8103z
                int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x0055
                int r0 = r8.f13061n
                float r0 = (float) r0
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 < 0) goto L_0x005e
            L_0x0055:
                int r10 = r7.f8092o
                if (r10 == r3) goto L_0x005f
                int r0 = r8.f13062o
                if (r10 < r0) goto L_0x005e
                goto L_0x005f
            L_0x005e:
                r1 = 0
            L_0x005f:
                r6.f13034j = r1
                boolean r9 = y5.f.t(r9, r2)
                r6.f13035k = r9
                int r9 = r7.f8092o
                r6.f13036l = r9
                int r9 = r7.d()
                r6.f13037m = r9
                r9 = 2147483647(0x7fffffff, float:NaN)
            L_0x0074:
                com.google.common.collect.x<java.lang.String> r10 = r8.f13066s
                int r10 = r10.size()
                if (r2 >= r10) goto L_0x0091
                java.lang.String r10 = r7.f8096s
                if (r10 == 0) goto L_0x008e
                com.google.common.collect.x<java.lang.String> r0 = r8.f13066s
                java.lang.Object r0 = r0.get(r2)
                boolean r10 = r10.equals(r0)
                if (r10 == 0) goto L_0x008e
                r9 = r2
                goto L_0x0091
            L_0x008e:
                int r2 = r2 + 1
                goto L_0x0074
            L_0x0091:
                r6.f13038n = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y5.f.h.<init>(e4.j, y5.f$d, int, boolean):void");
        }

        /* renamed from: a */
        public int compareTo(h hVar) {
            v0 v0Var;
            if (!this.f13032h || !this.f13035k) {
                v0Var = f.f12995g.f();
            } else {
                v0Var = f.f12995g;
            }
            return o.j().g(this.f13035k, hVar.f13035k).g(this.f13032h, hVar.f13032h).g(this.f13034j, hVar.f13034j).f(Integer.valueOf(this.f13038n), Integer.valueOf(hVar.f13038n), v0.c().f()).f(Integer.valueOf(this.f13036l), Integer.valueOf(hVar.f13036l), this.f13033i.B ? f.f12995g.f() : f.f12996h).f(Integer.valueOf(this.f13037m), Integer.valueOf(hVar.f13037m), v0Var).f(Integer.valueOf(this.f13036l), Integer.valueOf(hVar.f13036l), v0Var).i();
        }
    }

    public f(Context context) {
        this(context, (h.b) new a.b());
    }

    private static boolean A(int[][] iArr, w wVar, h hVar) {
        if (hVar == null) {
            return false;
        }
        int c10 = wVar.c(hVar.b());
        for (int i10 = 0; i10 < hVar.length(); i10++) {
            if (r.d(iArr[c10][hVar.k(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private static h.a B(w wVar, int[][] iArr, int i10, d dVar) {
        w wVar2 = wVar;
        d dVar2 = dVar;
        int i11 = dVar2.I ? 24 : 16;
        boolean z10 = dVar2.H && (i10 & i11) != 0;
        int i12 = 0;
        while (i12 < wVar2.f8924h) {
            v b10 = wVar2.b(i12);
            int[] iArr2 = iArr[i12];
            int i13 = dVar2.f13055h;
            int i14 = dVar2.f13056i;
            int i15 = dVar2.f13057j;
            int i16 = dVar2.f13058k;
            int i17 = dVar2.f13059l;
            int i18 = dVar2.f13060m;
            int i19 = dVar2.f13061n;
            int i20 = dVar2.f13062o;
            int i21 = dVar2.f13063p;
            int i22 = dVar2.f13064q;
            boolean z11 = dVar2.f13065r;
            v vVar = b10;
            int i23 = i12;
            int[] p10 = p(b10, iArr2, z10, i11, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, z11);
            if (p10.length > 0) {
                return new h.a(vVar, p10);
            }
            i12 = i23 + 1;
            wVar2 = wVar;
            dVar2 = dVar;
        }
        return null;
    }

    private static h.a E(w wVar, int[][] iArr, d dVar) {
        w wVar2 = wVar;
        d dVar2 = dVar;
        int i10 = -1;
        v vVar = null;
        h hVar = null;
        for (int i11 = 0; i11 < wVar2.f8924h; i11++) {
            v b10 = wVar2.b(i11);
            List<Integer> s10 = s(b10, dVar2.f13063p, dVar2.f13064q, dVar2.f13065r);
            int[] iArr2 = iArr[i11];
            for (int i12 = 0; i12 < b10.f8920h; i12++) {
                j b11 = b10.b(i12);
                if ((b11.f8089l & 16384) == 0 && t(iArr2[i12], dVar2.N)) {
                    h hVar2 = new h(b11, dVar2, iArr2[i12], s10.contains(Integer.valueOf(i12)));
                    if ((hVar2.f13032h || dVar2.G) && (hVar == null || hVar2.compareTo(hVar) > 0)) {
                        vVar = b10;
                        i10 = i12;
                        hVar = hVar2;
                    }
                }
            }
        }
        if (vVar == null) {
            return null;
        }
        return new h.a(vVar, i10);
    }

    private static void m(v vVar, int[] iArr, int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, List<Integer> list) {
        List<Integer> list2 = list;
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list2.get(size).intValue();
            if (!v(vVar.b(intValue), str, iArr[intValue], i10, i11, i12, i13, i14, i15, i16, i17, i18)) {
                list2.remove(size);
            }
        }
    }

    private static int[] n(v vVar, int[] iArr, int i10, int i11, boolean z10, boolean z11, boolean z12) {
        v vVar2 = vVar;
        int i12 = i10;
        j b10 = vVar.b(i10);
        int[] iArr2 = new int[vVar2.f8920h];
        int i13 = 0;
        for (int i14 = 0; i14 < vVar2.f8920h; i14++) {
            if (i14 == i12 || u(vVar.b(i14), iArr[i14], b10, i11, z10, z11, z12)) {
                iArr2[i13] = i14;
                i13++;
            }
        }
        return Arrays.copyOf(iArr2, i13);
    }

    private static int o(v vVar, int[] iArr, int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, List<Integer> list) {
        int i19 = 0;
        for (int i20 = 0; i20 < list.size(); i20++) {
            int intValue = list.get(i20).intValue();
            if (v(vVar.b(intValue), str, iArr[intValue], i10, i11, i12, i13, i14, i15, i16, i17, i18)) {
                i19++;
            }
        }
        return i19;
    }

    private static int[] p(v vVar, int[] iArr, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, boolean z11) {
        String str;
        HashSet hashSet;
        int i21;
        int i22;
        v vVar2 = vVar;
        if (vVar2.f8920h < 2) {
            return f12994f;
        }
        List<Integer> s10 = s(vVar2, i19, i20, z11);
        if (s10.size() < 2) {
            return f12994f;
        }
        if (!z10) {
            HashSet hashSet2 = new HashSet();
            String str2 = null;
            int i23 = 0;
            int i24 = 0;
            while (i24 < s10.size()) {
                String str3 = vVar2.b(s10.get(i24).intValue()).f8096s;
                if (hashSet2.add(str3)) {
                    String str4 = str3;
                    i22 = i23;
                    i21 = i24;
                    hashSet = hashSet2;
                    int o10 = o(vVar, iArr, i10, str3, i11, i12, i13, i14, i15, i16, i17, i18, s10);
                    if (o10 > i22) {
                        i23 = o10;
                        str2 = str4;
                        i24 = i21 + 1;
                        hashSet2 = hashSet;
                    }
                } else {
                    i22 = i23;
                    i21 = i24;
                    hashSet = hashSet2;
                }
                i23 = i22;
                i24 = i21 + 1;
                hashSet2 = hashSet;
            }
            str = str2;
        } else {
            str = null;
        }
        m(vVar, iArr, i10, str, i11, i12, i13, i14, i15, i16, i17, i18, s10);
        return s10.size() < 2 ? f12994f : n6.d.k(s10);
    }

    protected static int q(j jVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(jVar.f8087j)) {
            return 4;
        }
        String z11 = z(str);
        String z12 = z(jVar.f8087j);
        if (z12 == null || z11 == null) {
            if (!z10 || z12 != null) {
                return 0;
            }
            return 1;
        } else if (z12.startsWith(z11) || z11.startsWith(z12)) {
            return 3;
        } else {
            if (m0.F0(z12, "-")[0].equals(m0.F0(z11, "-")[0])) {
                return 2;
            }
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1 != r3) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Point r(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L_0x0010
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L_0x0008
            r1 = 1
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            if (r4 <= r5) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r3 = 0
        L_0x000d:
            if (r1 == r3) goto L_0x0010
            goto L_0x0013
        L_0x0010:
            r2 = r5
            r5 = r4
            r4 = r2
        L_0x0013:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L_0x0023
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = a6.m0.l(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L_0x0023:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = a6.m0.l(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.f.r(boolean, int, int, int, int):android.graphics.Point");
    }

    private static List<Integer> s(v vVar, int i10, int i11, boolean z10) {
        int i12;
        ArrayList arrayList = new ArrayList(vVar.f8920h);
        for (int i13 = 0; i13 < vVar.f8920h; i13++) {
            arrayList.add(Integer.valueOf(i13));
        }
        if (!(i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE)) {
            int i14 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            for (int i15 = 0; i15 < vVar.f8920h; i15++) {
                j b10 = vVar.b(i15);
                int i16 = b10.f8101x;
                if (i16 > 0 && (i12 = b10.f8102y) > 0) {
                    Point r10 = r(z10, i10, i11, i16, i12);
                    int i17 = b10.f8101x;
                    int i18 = b10.f8102y;
                    int i19 = i17 * i18;
                    if (i17 >= ((int) (((float) r10.x) * 0.98f)) && i18 >= ((int) (((float) r10.y) * 0.98f)) && i19 < i14) {
                        i14 = i19;
                    }
                }
            }
            if (i14 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int d10 = vVar.b(((Integer) arrayList.get(size)).intValue()).d();
                    if (d10 == -1 || d10 > i14) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    protected static boolean t(int i10, boolean z10) {
        int c10 = r.c(i10);
        return c10 == 4 || (z10 && c10 == 3);
    }

    private static boolean u(j jVar, int i10, j jVar2, int i11, boolean z10, boolean z11, boolean z12) {
        int i12;
        int i13;
        String str;
        int i14;
        if (!t(i10, false) || (i12 = jVar.f8092o) == -1 || i12 > i11) {
            return false;
        }
        if (!z12 && ((i14 = jVar.F) == -1 || i14 != jVar2.F)) {
            return false;
        }
        if (!z10 && ((str = jVar.f8096s) == null || !TextUtils.equals(str, jVar2.f8096s))) {
            return false;
        }
        if (z11 || ((i13 = jVar.G) != -1 && i13 == jVar2.G)) {
            return true;
        }
        return false;
    }

    private static boolean v(j jVar, String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int i20;
        if ((jVar.f8089l & 16384) != 0 || !t(i10, false) || (i10 & i11) == 0) {
            return false;
        }
        if (str != null && !m0.c(jVar.f8096s, str)) {
            return false;
        }
        int i21 = jVar.f8101x;
        if (i21 != -1 && (i16 > i21 || i21 > i12)) {
            return false;
        }
        int i22 = jVar.f8102y;
        if (i22 != -1 && (i17 > i22 || i22 > i13)) {
            return false;
        }
        float f10 = jVar.f8103z;
        if ((f10 == -1.0f || (((float) i18) <= f10 && f10 <= ((float) i14))) && (i20 = jVar.f8092o) != -1 && i19 <= i20 && i20 <= i15) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int w(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            if (num2.intValue() == -1) {
                return 0;
            }
            return -1;
        } else if (num2.intValue() == -1) {
            return 1;
        } else {
            return num.intValue() - num2.intValue();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int x(Integer num, Integer num2) {
        return 0;
    }

    private static void y(j.a aVar, int[][][] iArr, t[] tVarArr, h[] hVarArr) {
        boolean z10;
        boolean z11 = false;
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            if (i10 >= aVar.a()) {
                z10 = true;
                break;
            }
            int b10 = aVar.b(i10);
            h hVar = hVarArr[i10];
            if ((b10 == 1 || b10 == 2) && hVar != null && A(iArr[i10], aVar.c(i10), hVar)) {
                if (b10 == 1) {
                    if (i12 != -1) {
                        break;
                    }
                    i12 = i10;
                } else if (i11 != -1) {
                    break;
                } else {
                    i11 = i10;
                }
            }
            i10++;
        }
        z10 = false;
        if (!(i12 == -1 || i11 == -1)) {
            z11 = true;
        }
        if (z10 && z11) {
            t tVar = new t(true);
            tVarArr[i12] = tVar;
            tVarArr[i11] = tVar;
        }
    }

    protected static String z(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: y5.f$b} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public y5.h.a[] C(y5.j.a r22, int[][][] r23, int[] r24, y5.f.d r25) {
        /*
            r21 = this;
            r6 = r21
            r7 = r22
            r8 = r25
            int r9 = r22.a()
            y5.h$a[] r10 = new y5.h.a[r9]
            r11 = 0
            r0 = 0
            r12 = 0
            r13 = 0
        L_0x0010:
            r14 = 2
            r15 = 1
            if (r12 >= r9) goto L_0x0044
            int r1 = r7.b(r12)
            if (r14 != r1) goto L_0x0041
            if (r0 != 0) goto L_0x0036
            g5.w r1 = r7.c(r12)
            r2 = r23[r12]
            r3 = r24[r12]
            r5 = 1
            r0 = r21
            r4 = r25
            y5.h$a r0 = r0.H(r1, r2, r3, r4, r5)
            r10[r12] = r0
            r0 = r10[r12]
            if (r0 == 0) goto L_0x0035
            r0 = 1
            goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            g5.w r1 = r7.c(r12)
            int r1 = r1.f8924h
            if (r1 <= 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r15 = 0
        L_0x0040:
            r13 = r13 | r15
        L_0x0041:
            int r12 = r12 + 1
            goto L_0x0010
        L_0x0044:
            r12 = -1
            r16 = 0
            r3 = r16
            r4 = r3
            r2 = -1
            r5 = 0
        L_0x004c:
            if (r5 >= r9) goto L_0x00b7
            int r0 = r7.b(r5)
            if (r15 != r0) goto L_0x00a8
            boolean r0 = r8.P
            if (r0 != 0) goto L_0x005e
            if (r13 != 0) goto L_0x005b
            goto L_0x005e
        L_0x005b:
            r17 = 0
            goto L_0x0060
        L_0x005e:
            r17 = 1
        L_0x0060:
            g5.w r1 = r7.c(r5)
            r18 = r23[r5]
            r19 = r24[r5]
            r0 = r21
            r14 = r2
            r2 = r18
            r15 = r3
            r3 = r19
            r20 = r4
            r4 = r25
            r19 = r5
            r5 = r17
            android.util.Pair r0 = r0.D(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00ae
            if (r15 == 0) goto L_0x008a
            java.lang.Object r1 = r0.second
            y5.f$b r1 = (y5.f.b) r1
            int r1 = r1.compareTo(r15)
            if (r1 <= 0) goto L_0x00ae
        L_0x008a:
            if (r14 == r12) goto L_0x008e
            r10[r14] = r16
        L_0x008e:
            java.lang.Object r1 = r0.first
            y5.h$a r1 = (y5.h.a) r1
            r10[r19] = r1
            g5.v r2 = r1.f13039a
            int[] r1 = r1.f13040b
            r1 = r1[r11]
            e4.j r1 = r2.b(r1)
            java.lang.String r4 = r1.f8087j
            java.lang.Object r0 = r0.second
            r3 = r0
            y5.f$b r3 = (y5.f.b) r3
            r2 = r19
            goto L_0x00b2
        L_0x00a8:
            r14 = r2
            r15 = r3
            r20 = r4
            r19 = r5
        L_0x00ae:
            r2 = r14
            r3 = r15
            r4 = r20
        L_0x00b2:
            int r5 = r19 + 1
            r14 = 2
            r15 = 1
            goto L_0x004c
        L_0x00b7:
            r20 = r4
            r0 = r16
            r1 = -1
        L_0x00bc:
            if (r11 >= r9) goto L_0x010d
            int r2 = r7.b(r11)
            r3 = 1
            if (r2 == r3) goto L_0x0105
            r4 = 2
            if (r2 == r4) goto L_0x0102
            r5 = 3
            if (r2 == r5) goto L_0x00d8
            g5.w r5 = r7.c(r11)
            r13 = r23[r11]
            y5.h$a r2 = r6.F(r2, r5, r13, r8)
            r10[r11] = r2
            goto L_0x0102
        L_0x00d8:
            g5.w r2 = r7.c(r11)
            r5 = r23[r11]
            r13 = r20
            android.util.Pair r2 = r6.G(r2, r5, r8, r13)
            if (r2 == 0) goto L_0x0108
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r5 = r2.second
            y5.f$g r5 = (y5.f.g) r5
            int r5 = r5.compareTo(r0)
            if (r5 <= 0) goto L_0x0108
        L_0x00f2:
            if (r1 == r12) goto L_0x00f6
            r10[r1] = r16
        L_0x00f6:
            java.lang.Object r0 = r2.first
            y5.h$a r0 = (y5.h.a) r0
            r10[r11] = r0
            java.lang.Object r0 = r2.second
            y5.f$g r0 = (y5.f.g) r0
            r1 = r11
            goto L_0x0108
        L_0x0102:
            r13 = r20
            goto L_0x0108
        L_0x0105:
            r13 = r20
            r4 = 2
        L_0x0108:
            int r11 = r11 + 1
            r20 = r13
            goto L_0x00bc
        L_0x010d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.f.C(y5.j$a, int[][][], int[], y5.f$d):y5.h$a[]");
    }

    /* access modifiers changed from: protected */
    public Pair<h.a, b> D(w wVar, int[][] iArr, int i10, d dVar, boolean z10) {
        w wVar2 = wVar;
        d dVar2 = dVar;
        h.a aVar = null;
        b bVar = null;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < wVar2.f8924h; i13++) {
            v b10 = wVar2.b(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < b10.f8920h; i14++) {
                if (t(iArr2[i14], dVar2.N)) {
                    b bVar2 = new b(b10.b(i14), dVar2, iArr2[i14]);
                    if ((bVar2.f12999h || dVar2.J) && (bVar == null || bVar2.compareTo(bVar) > 0)) {
                        i11 = i13;
                        i12 = i14;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (i11 == -1) {
            return null;
        }
        v b11 = wVar2.b(i11);
        if (!dVar2.C && !dVar2.B && z10) {
            int[] n10 = n(b11, iArr[i11], i12, dVar2.f13070w, dVar2.K, dVar2.L, dVar2.M);
            if (n10.length > 1) {
                aVar = new h.a(b11, n10);
            }
        }
        if (aVar == null) {
            aVar = new h.a(b11, i12);
        }
        return Pair.create(aVar, (b) a6.a.e(bVar));
    }

    /* access modifiers changed from: protected */
    public h.a F(int i10, w wVar, int[][] iArr, d dVar) {
        v vVar = null;
        c cVar = null;
        int i11 = 0;
        for (int i12 = 0; i12 < wVar.f8924h; i12++) {
            v b10 = wVar.b(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < b10.f8920h; i13++) {
                if (t(iArr2[i13], dVar.N)) {
                    c cVar2 = new c(b10.b(i13), iArr2[i13]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        vVar = b10;
                        i11 = i13;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (vVar == null) {
            return null;
        }
        return new h.a(vVar, i11);
    }

    /* access modifiers changed from: protected */
    public Pair<h.a, g> G(w wVar, int[][] iArr, d dVar, String str) {
        w wVar2 = wVar;
        d dVar2 = dVar;
        int i10 = -1;
        v vVar = null;
        g gVar = null;
        for (int i11 = 0; i11 < wVar2.f8924h; i11++) {
            v b10 = wVar2.b(i11);
            int[] iArr2 = iArr[i11];
            for (int i12 = 0; i12 < b10.f8920h; i12++) {
                if (t(iArr2[i12], dVar2.N)) {
                    g gVar2 = new g(b10.b(i12), dVar2, iArr2[i12], str);
                    if (gVar2.f13023h && (gVar == null || gVar2.compareTo(gVar) > 0)) {
                        vVar = b10;
                        i10 = i12;
                        gVar = gVar2;
                    }
                } else {
                    String str2 = str;
                }
            }
            String str3 = str;
        }
        if (vVar == null) {
            return null;
        }
        return Pair.create(new h.a(vVar, i10), (g) a6.a.e(gVar));
    }

    /* access modifiers changed from: protected */
    public h.a H(w wVar, int[][] iArr, int i10, d dVar, boolean z10) {
        h.a B = (dVar.C || dVar.B || !z10) ? null : B(wVar, iArr, i10, dVar);
        return B == null ? E(wVar, iArr, dVar) : B;
    }

    /* access modifiers changed from: protected */
    public final Pair<t[], h[]> h(j.a aVar, int[][][] iArr, int[] iArr2, k.a aVar2, a1 a1Var) {
        d dVar = this.f12998e.get();
        int a10 = aVar.a();
        h.a[] C = C(aVar, iArr, iArr2, dVar);
        int i10 = 0;
        while (true) {
            h.a aVar3 = null;
            if (i10 >= a10) {
                break;
            }
            if (dVar.f(i10)) {
                C[i10] = null;
            } else {
                w c10 = aVar.c(i10);
                if (dVar.h(i10, c10)) {
                    C0219f g10 = dVar.g(i10, c10);
                    if (g10 != null) {
                        aVar3 = new h.a(c10.b(g10.f13019h), g10.f13020i, g10.f13022k);
                    }
                    C[i10] = aVar3;
                }
            }
            i10++;
        }
        h[] a11 = this.f12997d.a(C, a(), aVar2, a1Var);
        t[] tVarArr = new t[a10];
        for (int i11 = 0; i11 < a10; i11++) {
            tVarArr[i11] = !dVar.f(i11) && (aVar.b(i11) == 7 || a11[i11] != null) ? t.f8137b : null;
        }
        if (dVar.O) {
            y(aVar, iArr, tVarArr, a11);
        }
        return Pair.create(tVarArr, a11);
    }

    public f(Context context, h.b bVar) {
        this(d.e(context), bVar);
    }

    public f(d dVar, h.b bVar) {
        this.f12997d = bVar;
        this.f12998e = new AtomicReference<>(dVar);
    }

    /* compiled from: DefaultTrackSelector */
    public static final class e extends m.b {
        /* access modifiers changed from: private */
        public boolean A;
        /* access modifiers changed from: private */
        public boolean B;
        /* access modifiers changed from: private */
        public boolean C;
        /* access modifiers changed from: private */
        public int D;
        /* access modifiers changed from: private */
        public boolean E;
        /* access modifiers changed from: private */
        public boolean F;
        /* access modifiers changed from: private */
        public boolean G;
        /* access modifiers changed from: private */
        public final SparseArray<Map<w, C0219f>> H = new SparseArray<>();
        /* access modifiers changed from: private */
        public final SparseBooleanArray I = new SparseBooleanArray();
        /* access modifiers changed from: private */

        /* renamed from: w  reason: collision with root package name */
        public boolean f13015w;
        /* access modifiers changed from: private */

        /* renamed from: x  reason: collision with root package name */
        public boolean f13016x;
        /* access modifiers changed from: private */

        /* renamed from: y  reason: collision with root package name */
        public boolean f13017y;
        /* access modifiers changed from: private */

        /* renamed from: z  reason: collision with root package name */
        public boolean f13018z;

        @Deprecated
        public e() {
            P();
        }

        private void P() {
            this.f13015w = true;
            this.f13016x = false;
            this.f13017y = true;
            this.f13018z = true;
            this.A = false;
            this.B = false;
            this.C = false;
            this.D = 0;
            this.E = true;
            this.F = false;
            this.G = true;
        }

        /* renamed from: O */
        public d w() {
            return new d(this);
        }

        /* renamed from: Q */
        public e x(Context context) {
            super.x(context);
            return this;
        }

        /* renamed from: R */
        public e z(int i10, int i11, boolean z10) {
            super.z(i10, i11, z10);
            return this;
        }

        /* renamed from: S */
        public e A(Context context, boolean z10) {
            super.A(context, z10);
            return this;
        }

        public e(Context context) {
            super(context);
            P();
        }
    }
}
