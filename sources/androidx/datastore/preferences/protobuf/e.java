package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.q1;
import com.google.android.gms.common.api.Api;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: BinaryReader */
abstract class e implements d1 {

    /* compiled from: BinaryReader */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2733a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.datastore.preferences.protobuf.q1$b[] r0 = androidx.datastore.preferences.protobuf.q1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2733a = r0
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2733a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2733a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2733a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f2733a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f2733a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f2733a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f2733a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f2733a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f2733a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f2733a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f2733a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f2733a     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f2733a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f2733a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f2733a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f2733a     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.e.a.<clinit>():void");
        }
    }

    /* compiled from: BinaryReader */
    private static final class b extends e {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f2734a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f2735b;

        /* renamed from: c  reason: collision with root package name */
        private int f2736c;

        /* renamed from: d  reason: collision with root package name */
        private final int f2737d;

        /* renamed from: e  reason: collision with root package name */
        private int f2738e;

        /* renamed from: f  reason: collision with root package name */
        private int f2739f;

        /* renamed from: g  reason: collision with root package name */
        private int f2740g;

        public b(ByteBuffer byteBuffer, boolean z10) {
            super((a) null);
            this.f2734a = z10;
            this.f2735b = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f2736c = arrayOffset;
            this.f2737d = arrayOffset;
            this.f2738e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean R() {
            return this.f2736c == this.f2738e;
        }

        private byte S() {
            int i10 = this.f2736c;
            if (i10 != this.f2738e) {
                byte[] bArr = this.f2735b;
                this.f2736c = i10 + 1;
                return bArr[i10];
            }
            throw InvalidProtocolBufferException.k();
        }

        private Object T(q1.b bVar, Class<?> cls, o oVar) {
            switch (a.f2733a[bVar.ordinal()]) {
                case 1:
                    return Boolean.valueOf(k());
                case 2:
                    return D();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(u());
                case 5:
                    return Integer.valueOf(j());
                case 6:
                    return Long.valueOf(e());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(F());
                case 9:
                    return Long.valueOf(M());
                case 10:
                    return f(cls, oVar);
                case 11:
                    return Integer.valueOf(I());
                case 12:
                    return Long.valueOf(l());
                case 13:
                    return Integer.valueOf(w());
                case 14:
                    return Long.valueOf(x());
                case 15:
                    return N();
                case 16:
                    return Integer.valueOf(o());
                case 17:
                    return Long.valueOf(d());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private <T> T U(e1<T> e1Var, o oVar) {
            int i10 = this.f2740g;
            this.f2740g = q1.c(q1.a(this.f2739f), 4);
            try {
                T h10 = e1Var.h();
                e1Var.b(h10, this, oVar);
                e1Var.c(h10);
                if (this.f2739f == this.f2740g) {
                    return h10;
                }
                throw InvalidProtocolBufferException.g();
            } finally {
                this.f2740g = i10;
            }
        }

        private int V() {
            f0(4);
            return W();
        }

        private int W() {
            int i10 = this.f2736c;
            byte[] bArr = this.f2735b;
            this.f2736c = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        private long X() {
            f0(8);
            return Y();
        }

        private long Y() {
            int i10 = this.f2736c;
            byte[] bArr = this.f2735b;
            this.f2736c = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        private <T> T Z(e1<T> e1Var, o oVar) {
            int c02 = c0();
            f0(c02);
            int i10 = this.f2738e;
            int i11 = this.f2736c + c02;
            this.f2738e = i11;
            try {
                T h10 = e1Var.h();
                e1Var.b(h10, this, oVar);
                e1Var.c(h10);
                if (this.f2736c == i11) {
                    return h10;
                }
                throw InvalidProtocolBufferException.g();
            } finally {
                this.f2738e = i10;
            }
        }

        private int c0() {
            byte b10;
            int i10 = this.f2736c;
            int i11 = this.f2738e;
            if (i11 != i10) {
                byte[] bArr = this.f2735b;
                int i12 = i10 + 1;
                byte b11 = bArr[i10];
                if (b11 >= 0) {
                    this.f2736c = i12;
                    return b11;
                } else if (i11 - i12 < 9) {
                    return (int) e0();
                } else {
                    int i13 = i12 + 1;
                    byte b12 = b11 ^ (bArr[i12] << 7);
                    if (b12 < 0) {
                        b10 = b12 ^ Byte.MIN_VALUE;
                    } else {
                        int i14 = i13 + 1;
                        byte b13 = b12 ^ (bArr[i13] << 14);
                        if (b13 >= 0) {
                            b10 = b13 ^ 16256;
                        } else {
                            i13 = i14 + 1;
                            byte b14 = b13 ^ (bArr[i14] << 21);
                            if (b14 < 0) {
                                b10 = b14 ^ -2080896;
                            } else {
                                i14 = i13 + 1;
                                byte b15 = bArr[i13];
                                b10 = (b14 ^ (b15 << 28)) ^ 266354560;
                                if (b15 < 0) {
                                    i13 = i14 + 1;
                                    if (bArr[i14] < 0) {
                                        i14 = i13 + 1;
                                        if (bArr[i13] < 0) {
                                            i13 = i14 + 1;
                                            if (bArr[i14] < 0) {
                                                i14 = i13 + 1;
                                                if (bArr[i13] < 0) {
                                                    i13 = i14 + 1;
                                                    if (bArr[i14] < 0) {
                                                        throw InvalidProtocolBufferException.e();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i13 = i14;
                    }
                    this.f2736c = i13;
                    return b10;
                }
            } else {
                throw InvalidProtocolBufferException.k();
            }
        }

        private long e0() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte S = S();
                j10 |= ((long) (S & Byte.MAX_VALUE)) << i10;
                if ((S & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private void f0(int i10) {
            if (i10 < 0 || i10 > this.f2738e - this.f2736c) {
                throw InvalidProtocolBufferException.k();
            }
        }

        private void g0(int i10) {
            if (this.f2736c != i10) {
                throw InvalidProtocolBufferException.k();
            }
        }

        private void h0(int i10) {
            if (q1.b(this.f2739f) != i10) {
                throw InvalidProtocolBufferException.d();
            }
        }

        private void i0(int i10) {
            f0(i10);
            this.f2736c += i10;
        }

        /* JADX WARNING: Removed duplicated region for block: B:1:0x000f A[LOOP:0: B:1:0x000f->B:4:0x001c, LOOP_START] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void j0() {
            /*
                r3 = this;
                int r0 = r3.f2740g
                int r1 = r3.f2739f
                int r1 = androidx.datastore.preferences.protobuf.q1.a(r1)
                r2 = 4
                int r1 = androidx.datastore.preferences.protobuf.q1.c(r1, r2)
                r3.f2740g = r1
            L_0x000f:
                int r1 = r3.A()
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L_0x001e
                boolean r1 = r3.H()
                if (r1 != 0) goto L_0x000f
            L_0x001e:
                int r1 = r3.f2739f
                int r2 = r3.f2740g
                if (r1 != r2) goto L_0x0027
                r3.f2740g = r0
                return
            L_0x0027:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.g()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.e.b.j0():void");
        }

        private void k0() {
            int i10 = this.f2738e;
            int i11 = this.f2736c;
            if (i10 - i11 >= 10) {
                byte[] bArr = this.f2735b;
                int i12 = 0;
                while (i12 < 10) {
                    int i13 = i11 + 1;
                    if (bArr[i11] >= 0) {
                        this.f2736c = i13;
                        return;
                    } else {
                        i12++;
                        i11 = i13;
                    }
                }
            }
            l0();
        }

        private void l0() {
            int i10 = 0;
            while (i10 < 10) {
                if (S() < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private void m0(int i10) {
            f0(i10);
            if ((i10 & 3) != 0) {
                throw InvalidProtocolBufferException.g();
            }
        }

        private void n0(int i10) {
            f0(i10);
            if ((i10 & 7) != 0) {
                throw InvalidProtocolBufferException.g();
            }
        }

        public int A() {
            if (R()) {
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            int c02 = c0();
            this.f2739f = c02;
            if (c02 == this.f2740g) {
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            return q1.a(c02);
        }

        public void B(List<String> list) {
            b0(list, false);
        }

        public void C(List<String> list) {
            b0(list, true);
        }

        public h D() {
            h hVar;
            h0(2);
            int c02 = c0();
            if (c02 == 0) {
                return h.f2754i;
            }
            f0(c02);
            if (this.f2734a) {
                hVar = h.A(this.f2735b, this.f2736c, c02);
            } else {
                hVar = h.f(this.f2735b, this.f2736c, c02);
            }
            this.f2736c += c02;
            return hVar;
        }

        public void E(List<Float> list) {
            int i10;
            int i11;
            if (list instanceof v) {
                v vVar = (v) list;
                int b10 = q1.b(this.f2739f);
                if (b10 == 2) {
                    int c02 = c0();
                    m0(c02);
                    int i12 = this.f2736c + c02;
                    while (this.f2736c < i12) {
                        vVar.d(Float.intBitsToFloat(W()));
                    }
                } else if (b10 == 5) {
                    do {
                        vVar.d(readFloat());
                        if (!R()) {
                            i11 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i11;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b11 = q1.b(this.f2739f);
                if (b11 == 2) {
                    int c03 = c0();
                    m0(c03);
                    int i13 = this.f2736c + c03;
                    while (this.f2736c < i13) {
                        list.add(Float.valueOf(Float.intBitsToFloat(W())));
                    }
                } else if (b11 == 5) {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (!R()) {
                            i10 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i10;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public int F() {
            h0(0);
            return c0();
        }

        public <T> void G(List<T> list, e1<T> e1Var, o oVar) {
            int i10;
            if (q1.b(this.f2739f) == 3) {
                int i11 = this.f2739f;
                do {
                    list.add(U(e1Var, oVar));
                    if (!R()) {
                        i10 = this.f2736c;
                    } else {
                        return;
                    }
                } while (c0() == i11);
                this.f2736c = i10;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        public boolean H() {
            int i10;
            if (R() || (i10 = this.f2739f) == this.f2740g) {
                return false;
            }
            int b10 = q1.b(i10);
            if (b10 == 0) {
                k0();
                return true;
            } else if (b10 == 1) {
                i0(8);
                return true;
            } else if (b10 == 2) {
                i0(c0());
                return true;
            } else if (b10 == 3) {
                j0();
                return true;
            } else if (b10 == 5) {
                i0(4);
                return true;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        public int I() {
            h0(5);
            return V();
        }

        public void J(List<h> list) {
            int i10;
            if (q1.b(this.f2739f) == 2) {
                do {
                    list.add(D());
                    if (!R()) {
                        i10 = this.f2736c;
                    } else {
                        return;
                    }
                } while (c0() == this.f2739f);
                this.f2736c = i10;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        public void K(List<Double> list) {
            int i10;
            int i11;
            if (list instanceof l) {
                l lVar = (l) list;
                int b10 = q1.b(this.f2739f);
                if (b10 == 1) {
                    do {
                        lVar.d(readDouble());
                        if (!R()) {
                            i11 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i11;
                } else if (b10 == 2) {
                    int c02 = c0();
                    n0(c02);
                    int i12 = this.f2736c + c02;
                    while (this.f2736c < i12) {
                        lVar.d(Double.longBitsToDouble(Y()));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b11 = q1.b(this.f2739f);
                if (b11 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (!R()) {
                            i10 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i10;
                } else if (b11 == 2) {
                    int c03 = c0();
                    n0(c03);
                    int i13 = this.f2736c + c03;
                    while (this.f2736c < i13) {
                        list.add(Double.valueOf(Double.longBitsToDouble(Y())));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public <T> void L(List<T> list, e1<T> e1Var, o oVar) {
            int i10;
            if (q1.b(this.f2739f) == 2) {
                int i11 = this.f2739f;
                do {
                    list.add(Z(e1Var, oVar));
                    if (!R()) {
                        i10 = this.f2736c;
                    } else {
                        return;
                    }
                } while (c0() == i11);
                this.f2736c = i10;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        public long M() {
            h0(0);
            return d0();
        }

        public String N() {
            return a0(true);
        }

        public void O(List<Long> list) {
            int i10;
            int i11;
            if (list instanceof g0) {
                g0 g0Var = (g0) list;
                int b10 = q1.b(this.f2739f);
                if (b10 == 1) {
                    do {
                        g0Var.e(e());
                        if (!R()) {
                            i11 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i11;
                } else if (b10 == 2) {
                    int c02 = c0();
                    n0(c02);
                    int i12 = this.f2736c + c02;
                    while (this.f2736c < i12) {
                        g0Var.e(Y());
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b11 = q1.b(this.f2739f);
                if (b11 == 1) {
                    do {
                        list.add(Long.valueOf(e()));
                        if (!R()) {
                            i10 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i10;
                } else if (b11 == 2) {
                    int c03 = c0();
                    n0(c03);
                    int i13 = this.f2736c + c03;
                    while (this.f2736c < i13) {
                        list.add(Long.valueOf(Y()));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public <T> T P(e1<T> e1Var, o oVar) {
            h0(3);
            return U(e1Var, oVar);
        }

        public int a() {
            return this.f2739f;
        }

        public String a0(boolean z10) {
            h0(2);
            int c02 = c0();
            if (c02 == 0) {
                return "";
            }
            f0(c02);
            if (z10) {
                byte[] bArr = this.f2735b;
                int i10 = this.f2736c;
                if (!p1.n(bArr, i10, i10 + c02)) {
                    throw InvalidProtocolBufferException.c();
                }
            }
            String str = new String(this.f2735b, this.f2736c, c02, z.f3024a);
            this.f2736c += c02;
            return str;
        }

        public <T> T b(e1<T> e1Var, o oVar) {
            h0(2);
            return Z(e1Var, oVar);
        }

        public void b0(List<String> list, boolean z10) {
            int i10;
            int i11;
            if (q1.b(this.f2739f) != 2) {
                throw InvalidProtocolBufferException.d();
            } else if (!(list instanceof e0) || z10) {
                do {
                    list.add(a0(z10));
                    if (!R()) {
                        i10 = this.f2736c;
                    } else {
                        return;
                    }
                } while (c0() == this.f2739f);
                this.f2736c = i10;
            } else {
                e0 e0Var = (e0) list;
                do {
                    e0Var.w(D());
                    if (!R()) {
                        i11 = this.f2736c;
                    } else {
                        return;
                    }
                } while (c0() == this.f2739f);
                this.f2736c = i11;
            }
        }

        public void c(List<Integer> list) {
            int i10;
            int i11;
            if (list instanceof y) {
                y yVar = (y) list;
                int b10 = q1.b(this.f2739f);
                if (b10 == 0) {
                    do {
                        yVar.d(w());
                        if (!R()) {
                            i11 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i11;
                } else if (b10 == 2) {
                    int c02 = this.f2736c + c0();
                    while (this.f2736c < c02) {
                        yVar.d(i.b(c0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b11 = q1.b(this.f2739f);
                if (b11 == 0) {
                    do {
                        list.add(Integer.valueOf(w()));
                        if (!R()) {
                            i10 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i10;
                } else if (b11 == 2) {
                    int c03 = this.f2736c + c0();
                    while (this.f2736c < c03) {
                        list.add(Integer.valueOf(i.b(c0())));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public long d() {
            h0(0);
            return d0();
        }

        public long d0() {
            long j10;
            int i10;
            long j11;
            long j12;
            byte b10;
            int i11 = this.f2736c;
            int i12 = this.f2738e;
            if (i12 != i11) {
                byte[] bArr = this.f2735b;
                int i13 = i11 + 1;
                byte b11 = bArr[i11];
                if (b11 >= 0) {
                    this.f2736c = i13;
                    return (long) b11;
                } else if (i12 - i13 < 9) {
                    return e0();
                } else {
                    int i14 = i13 + 1;
                    byte b12 = b11 ^ (bArr[i13] << 7);
                    if (b12 < 0) {
                        b10 = b12 ^ Byte.MIN_VALUE;
                    } else {
                        int i15 = i14 + 1;
                        byte b13 = b12 ^ (bArr[i14] << 14);
                        if (b13 >= 0) {
                            i10 = i15;
                            j10 = (long) (b13 ^ 16256);
                        } else {
                            i14 = i15 + 1;
                            byte b14 = b13 ^ (bArr[i15] << 21);
                            if (b14 < 0) {
                                b10 = b14 ^ -2080896;
                            } else {
                                long j13 = (long) b14;
                                int i16 = i14 + 1;
                                long j14 = j13 ^ (((long) bArr[i14]) << 28);
                                if (j14 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i17 = i16 + 1;
                                    long j15 = j14 ^ (((long) bArr[i16]) << 35);
                                    if (j15 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i16 = i17 + 1;
                                        j14 = j15 ^ (((long) bArr[i17]) << 42);
                                        if (j14 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i17 = i16 + 1;
                                            j15 = j14 ^ (((long) bArr[i16]) << 49);
                                            if (j15 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                int i18 = i17 + 1;
                                                long j16 = (j15 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    i10 = i18 + 1;
                                                    if (((long) bArr[i18]) < 0) {
                                                        throw InvalidProtocolBufferException.e();
                                                    }
                                                } else {
                                                    i10 = i18;
                                                }
                                                j10 = j16;
                                            }
                                        }
                                    }
                                    j10 = j15 ^ j11;
                                }
                                j10 = j14 ^ j12;
                                i10 = i16;
                            }
                        }
                        this.f2736c = i10;
                        return j10;
                    }
                    j10 = (long) b10;
                    this.f2736c = i10;
                    return j10;
                }
            } else {
                throw InvalidProtocolBufferException.k();
            }
        }

        public long e() {
            h0(1);
            return X();
        }

        public <T> T f(Class<T> cls, o oVar) {
            h0(2);
            return Z(a1.a().d(cls), oVar);
        }

        public void g(List<Integer> list) {
            int i10;
            int i11;
            if (list instanceof y) {
                y yVar = (y) list;
                int b10 = q1.b(this.f2739f);
                if (b10 == 2) {
                    int c02 = c0();
                    m0(c02);
                    int i12 = this.f2736c + c02;
                    while (this.f2736c < i12) {
                        yVar.d(W());
                    }
                } else if (b10 == 5) {
                    do {
                        yVar.d(I());
                        if (!R()) {
                            i11 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i11;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b11 = q1.b(this.f2739f);
                if (b11 == 2) {
                    int c03 = c0();
                    m0(c03);
                    int i13 = this.f2736c + c03;
                    while (this.f2736c < i13) {
                        list.add(Integer.valueOf(W()));
                    }
                } else if (b11 == 5) {
                    do {
                        list.add(Integer.valueOf(I()));
                        if (!R()) {
                            i10 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i10;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public void h(List<Long> list) {
            int i10;
            int i11;
            if (list instanceof g0) {
                g0 g0Var = (g0) list;
                int b10 = q1.b(this.f2739f);
                if (b10 == 0) {
                    do {
                        g0Var.e(x());
                        if (!R()) {
                            i11 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i11;
                } else if (b10 == 2) {
                    int c02 = this.f2736c + c0();
                    while (this.f2736c < c02) {
                        g0Var.e(i.c(d0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b11 = q1.b(this.f2739f);
                if (b11 == 0) {
                    do {
                        list.add(Long.valueOf(x()));
                        if (!R()) {
                            i10 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i10;
                } else if (b11 == 2) {
                    int c03 = this.f2736c + c0();
                    while (this.f2736c < c03) {
                        list.add(Long.valueOf(i.c(d0())));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public void i(List<Integer> list) {
            int i10;
            int i11;
            if (list instanceof y) {
                y yVar = (y) list;
                int b10 = q1.b(this.f2739f);
                if (b10 == 0) {
                    do {
                        yVar.d(o());
                        if (!R()) {
                            i11 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i11;
                } else if (b10 == 2) {
                    int c02 = this.f2736c + c0();
                    while (this.f2736c < c02) {
                        yVar.d(c0());
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b11 = q1.b(this.f2739f);
                if (b11 == 0) {
                    do {
                        list.add(Integer.valueOf(o()));
                        if (!R()) {
                            i10 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i10;
                } else if (b11 == 2) {
                    int c03 = this.f2736c + c0();
                    while (this.f2736c < c03) {
                        list.add(Integer.valueOf(c0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public int j() {
            h0(5);
            return V();
        }

        public boolean k() {
            h0(0);
            if (c0() != 0) {
                return true;
            }
            return false;
        }

        public long l() {
            h0(1);
            return X();
        }

        public void m(List<Long> list) {
            int i10;
            int i11;
            if (list instanceof g0) {
                g0 g0Var = (g0) list;
                int b10 = q1.b(this.f2739f);
                if (b10 == 0) {
                    do {
                        g0Var.e(d());
                        if (!R()) {
                            i11 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i11;
                } else if (b10 == 2) {
                    int c02 = this.f2736c + c0();
                    while (this.f2736c < c02) {
                        g0Var.e(d0());
                    }
                    g0(c02);
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b11 = q1.b(this.f2739f);
                if (b11 == 0) {
                    do {
                        list.add(Long.valueOf(d()));
                        if (!R()) {
                            i10 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i10;
                } else if (b11 == 2) {
                    int c03 = this.f2736c + c0();
                    while (this.f2736c < c03) {
                        list.add(Long.valueOf(d0()));
                    }
                    g0(c03);
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public <T> T n(Class<T> cls, o oVar) {
            h0(3);
            return U(a1.a().d(cls), oVar);
        }

        public int o() {
            h0(0);
            return c0();
        }

        public void p(List<Long> list) {
            int i10;
            int i11;
            if (list instanceof g0) {
                g0 g0Var = (g0) list;
                int b10 = q1.b(this.f2739f);
                if (b10 == 0) {
                    do {
                        g0Var.e(M());
                        if (!R()) {
                            i11 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i11;
                } else if (b10 == 2) {
                    int c02 = this.f2736c + c0();
                    while (this.f2736c < c02) {
                        g0Var.e(d0());
                    }
                    g0(c02);
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b11 = q1.b(this.f2739f);
                if (b11 == 0) {
                    do {
                        list.add(Long.valueOf(M()));
                        if (!R()) {
                            i10 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i10;
                } else if (b11 == 2) {
                    int c03 = this.f2736c + c0();
                    while (this.f2736c < c03) {
                        list.add(Long.valueOf(d0()));
                    }
                    g0(c03);
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public void q(List<Long> list) {
            int i10;
            int i11;
            if (list instanceof g0) {
                g0 g0Var = (g0) list;
                int b10 = q1.b(this.f2739f);
                if (b10 == 1) {
                    do {
                        g0Var.e(l());
                        if (!R()) {
                            i11 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i11;
                } else if (b10 == 2) {
                    int c02 = c0();
                    n0(c02);
                    int i12 = this.f2736c + c02;
                    while (this.f2736c < i12) {
                        g0Var.e(Y());
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b11 = q1.b(this.f2739f);
                if (b11 == 1) {
                    do {
                        list.add(Long.valueOf(l()));
                        if (!R()) {
                            i10 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i10;
                } else if (b11 == 2) {
                    int c03 = c0();
                    n0(c03);
                    int i13 = this.f2736c + c03;
                    while (this.f2736c < i13) {
                        list.add(Long.valueOf(Y()));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public void r(List<Integer> list) {
            int i10;
            int i11;
            if (list instanceof y) {
                y yVar = (y) list;
                int b10 = q1.b(this.f2739f);
                if (b10 == 0) {
                    do {
                        yVar.d(F());
                        if (!R()) {
                            i11 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i11;
                } else if (b10 == 2) {
                    int c02 = this.f2736c + c0();
                    while (this.f2736c < c02) {
                        yVar.d(c0());
                    }
                    g0(c02);
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b11 = q1.b(this.f2739f);
                if (b11 == 0) {
                    do {
                        list.add(Integer.valueOf(F()));
                        if (!R()) {
                            i10 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i10;
                } else if (b11 == 2) {
                    int c03 = this.f2736c + c0();
                    while (this.f2736c < c03) {
                        list.add(Integer.valueOf(c0()));
                    }
                    g0(c03);
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public double readDouble() {
            h0(1);
            return Double.longBitsToDouble(X());
        }

        public float readFloat() {
            h0(5);
            return Float.intBitsToFloat(V());
        }

        public void s(List<Integer> list) {
            int i10;
            int i11;
            if (list instanceof y) {
                y yVar = (y) list;
                int b10 = q1.b(this.f2739f);
                if (b10 == 0) {
                    do {
                        yVar.d(u());
                        if (!R()) {
                            i11 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i11;
                } else if (b10 == 2) {
                    int c02 = this.f2736c + c0();
                    while (this.f2736c < c02) {
                        yVar.d(c0());
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b11 = q1.b(this.f2739f);
                if (b11 == 0) {
                    do {
                        list.add(Integer.valueOf(u()));
                        if (!R()) {
                            i10 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i10;
                } else if (b11 == 2) {
                    int c03 = this.f2736c + c0();
                    while (this.f2736c < c03) {
                        list.add(Integer.valueOf(c0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|(2:22|35)(3:30|23|24)) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
            if (H() != false) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
            throw new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <K, V> void t(java.util.Map<K, V> r8, androidx.datastore.preferences.protobuf.i0.a<K, V> r9, androidx.datastore.preferences.protobuf.o r10) {
            /*
                r7 = this;
                r0 = 2
                r7.h0(r0)
                int r1 = r7.c0()
                r7.f0(r1)
                int r2 = r7.f2738e
                int r3 = r7.f2736c
                int r3 = r3 + r1
                r7.f2738e = r3
                K r1 = r9.f2817b     // Catch:{ all -> 0x005b }
                V r3 = r9.f2819d     // Catch:{ all -> 0x005b }
            L_0x0016:
                int r4 = r7.A()     // Catch:{ all -> 0x005b }
                r5 = 2147483647(0x7fffffff, float:NaN)
                if (r4 != r5) goto L_0x0025
                r8.put(r1, r3)     // Catch:{ all -> 0x005b }
                r7.f2738e = r2
                return
            L_0x0025:
                r5 = 1
                java.lang.String r6 = "Unable to parse map entry."
                if (r4 == r5) goto L_0x0046
                if (r4 == r0) goto L_0x0039
                boolean r4 = r7.H()     // Catch:{ InvalidWireTypeException -> 0x004e }
                if (r4 == 0) goto L_0x0033
                goto L_0x0016
            L_0x0033:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch:{ InvalidWireTypeException -> 0x004e }
                r4.<init>(r6)     // Catch:{ InvalidWireTypeException -> 0x004e }
                throw r4     // Catch:{ InvalidWireTypeException -> 0x004e }
            L_0x0039:
                androidx.datastore.preferences.protobuf.q1$b r4 = r9.f2818c     // Catch:{ InvalidWireTypeException -> 0x004e }
                V r5 = r9.f2819d     // Catch:{ InvalidWireTypeException -> 0x004e }
                java.lang.Class r5 = r5.getClass()     // Catch:{ InvalidWireTypeException -> 0x004e }
                java.lang.Object r3 = r7.T(r4, r5, r10)     // Catch:{ InvalidWireTypeException -> 0x004e }
                goto L_0x0016
            L_0x0046:
                androidx.datastore.preferences.protobuf.q1$b r4 = r9.f2816a     // Catch:{ InvalidWireTypeException -> 0x004e }
                r5 = 0
                java.lang.Object r1 = r7.T(r4, r5, r5)     // Catch:{ InvalidWireTypeException -> 0x004e }
                goto L_0x0016
            L_0x004e:
                boolean r4 = r7.H()     // Catch:{ all -> 0x005b }
                if (r4 == 0) goto L_0x0055
                goto L_0x0016
            L_0x0055:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x005b }
                r8.<init>(r6)     // Catch:{ all -> 0x005b }
                throw r8     // Catch:{ all -> 0x005b }
            L_0x005b:
                r8 = move-exception
                r7.f2738e = r2
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.e.b.t(java.util.Map, androidx.datastore.preferences.protobuf.i0$a, androidx.datastore.preferences.protobuf.o):void");
        }

        public int u() {
            h0(0);
            return c0();
        }

        public void v(List<Integer> list) {
            int i10;
            int i11;
            if (list instanceof y) {
                y yVar = (y) list;
                int b10 = q1.b(this.f2739f);
                if (b10 == 2) {
                    int c02 = c0();
                    m0(c02);
                    int i12 = this.f2736c + c02;
                    while (this.f2736c < i12) {
                        yVar.d(W());
                    }
                } else if (b10 == 5) {
                    do {
                        yVar.d(j());
                        if (!R()) {
                            i11 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i11;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b11 = q1.b(this.f2739f);
                if (b11 == 2) {
                    int c03 = c0();
                    m0(c03);
                    int i13 = this.f2736c + c03;
                    while (this.f2736c < i13) {
                        list.add(Integer.valueOf(W()));
                    }
                } else if (b11 == 5) {
                    do {
                        list.add(Integer.valueOf(j()));
                        if (!R()) {
                            i10 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i10;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public int w() {
            h0(0);
            return i.b(c0());
        }

        public long x() {
            h0(0);
            return i.c(d0());
        }

        public void y(List<Boolean> list) {
            int i10;
            int i11;
            if (list instanceof f) {
                f fVar = (f) list;
                int b10 = q1.b(this.f2739f);
                if (b10 == 0) {
                    do {
                        fVar.e(k());
                        if (!R()) {
                            i11 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i11;
                } else if (b10 == 2) {
                    int c02 = this.f2736c + c0();
                    while (this.f2736c < c02) {
                        fVar.e(c0() != 0);
                    }
                    g0(c02);
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b11 = q1.b(this.f2739f);
                if (b11 == 0) {
                    do {
                        list.add(Boolean.valueOf(k()));
                        if (!R()) {
                            i10 = this.f2736c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f2739f);
                    this.f2736c = i10;
                } else if (b11 == 2) {
                    int c03 = this.f2736c + c0();
                    while (this.f2736c < c03) {
                        list.add(Boolean.valueOf(c0() != 0));
                    }
                    g0(c03);
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public String z() {
            return a0(false);
        }
    }

    /* synthetic */ e(a aVar) {
        this();
    }

    public static e Q(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z10);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    private e() {
    }
}
