package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.p0;
import androidx.datastore.preferences.protobuf.q1;
import androidx.datastore.preferences.protobuf.t.b;
import androidx.datastore.preferences.protobuf.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: FieldSet */
final class t<T extends b<T>> {

    /* renamed from: d  reason: collision with root package name */
    private static final t f2945d = new t(true);

    /* renamed from: a  reason: collision with root package name */
    private final h1<T, Object> f2946a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2947b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2948c;

    /* compiled from: FieldSet */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2949a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f2950b;

        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012f */
        static {
            /*
                androidx.datastore.preferences.protobuf.q1$b[] r0 = androidx.datastore.preferences.protobuf.q1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2950b = r0
                r1 = 1
                androidx.datastore.preferences.protobuf.q1$b r2 = androidx.datastore.preferences.protobuf.q1.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f2950b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.q1$b r3 = androidx.datastore.preferences.protobuf.q1.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f2950b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.q1$b r4 = androidx.datastore.preferences.protobuf.q1.b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f2950b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.q1$b r5 = androidx.datastore.preferences.protobuf.q1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f2950b     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.q1$b r6 = androidx.datastore.preferences.protobuf.q1.b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f2950b     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.q1$b r7 = androidx.datastore.preferences.protobuf.q1.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f2950b     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.q1$b r8 = androidx.datastore.preferences.protobuf.q1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f2950b     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.q1$b r9 = androidx.datastore.preferences.protobuf.q1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f2950b     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.q1$b r10 = androidx.datastore.preferences.protobuf.q1.b.GROUP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f2950b     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.q1$b r10 = androidx.datastore.preferences.protobuf.q1.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f2950b     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.q1$b r10 = androidx.datastore.preferences.protobuf.q1.b.STRING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f2950b     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.q1$b r10 = androidx.datastore.preferences.protobuf.q1.b.BYTES     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f2950b     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.q1$b r10 = androidx.datastore.preferences.protobuf.q1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f2950b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.q1$b r10 = androidx.datastore.preferences.protobuf.q1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f2950b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.q1$b r10 = androidx.datastore.preferences.protobuf.q1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f2950b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.q1$b r10 = androidx.datastore.preferences.protobuf.q1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f2950b     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.q1$b r10 = androidx.datastore.preferences.protobuf.q1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f2950b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                androidx.datastore.preferences.protobuf.q1$b r10 = androidx.datastore.preferences.protobuf.q1.b.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                androidx.datastore.preferences.protobuf.q1$c[] r9 = androidx.datastore.preferences.protobuf.q1.c.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f2949a = r9
                androidx.datastore.preferences.protobuf.q1$c r10 = androidx.datastore.preferences.protobuf.q1.c.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f2949a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                androidx.datastore.preferences.protobuf.q1$c r9 = androidx.datastore.preferences.protobuf.q1.c.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f2949a     // Catch:{ NoSuchFieldError -> 0x00fd }
                androidx.datastore.preferences.protobuf.q1$c r1 = androidx.datastore.preferences.protobuf.q1.c.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f2949a     // Catch:{ NoSuchFieldError -> 0x0107 }
                androidx.datastore.preferences.protobuf.q1$c r1 = androidx.datastore.preferences.protobuf.q1.c.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f2949a     // Catch:{ NoSuchFieldError -> 0x0111 }
                androidx.datastore.preferences.protobuf.q1$c r1 = androidx.datastore.preferences.protobuf.q1.c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f2949a     // Catch:{ NoSuchFieldError -> 0x011b }
                androidx.datastore.preferences.protobuf.q1$c r1 = androidx.datastore.preferences.protobuf.q1.c.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f2949a     // Catch:{ NoSuchFieldError -> 0x0125 }
                androidx.datastore.preferences.protobuf.q1$c r1 = androidx.datastore.preferences.protobuf.q1.c.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f2949a     // Catch:{ NoSuchFieldError -> 0x012f }
                androidx.datastore.preferences.protobuf.q1$c r1 = androidx.datastore.preferences.protobuf.q1.c.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f2949a     // Catch:{ NoSuchFieldError -> 0x0139 }
                androidx.datastore.preferences.protobuf.q1$c r1 = androidx.datastore.preferences.protobuf.q1.c.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.t.a.<clinit>():void");
        }
    }

    /* compiled from: FieldSet */
    public interface b<T extends b<T>> extends Comparable<T> {
        boolean b();

        q1.b c();

        int getNumber();

        q1.c h();

        boolean i();

        p0.a j(p0.a aVar, p0 p0Var);
    }

    private t() {
        this.f2946a = h1.q(16);
    }

    static void A(CodedOutputStream codedOutputStream, q1.b bVar, Object obj) {
        switch (a.f2950b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.r0(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.z0(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.H0(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.a1(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.F0(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.x0(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.v0(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.l0(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.C0((p0) obj);
                return;
            case 10:
                codedOutputStream.J0((p0) obj);
                return;
            case 11:
                if (obj instanceof h) {
                    codedOutputStream.p0((h) obj);
                    return;
                } else {
                    codedOutputStream.V0((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof h) {
                    codedOutputStream.p0((h) obj);
                    return;
                } else {
                    codedOutputStream.m0((byte[]) obj);
                    return;
                }
            case 13:
                codedOutputStream.Y0(((Integer) obj).intValue());
                return;
            case 14:
                codedOutputStream.N0(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.P0(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.R0(((Integer) obj).intValue());
                return;
            case 17:
                codedOutputStream.T0(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof z.c) {
                    codedOutputStream.t0(((z.c) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.t0(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    private static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int d(q1.b bVar, int i10, Object obj) {
        int V = CodedOutputStream.V(i10);
        if (bVar == q1.b.GROUP) {
            V *= 2;
        }
        return V + e(bVar, obj);
    }

    static int e(q1.b bVar, Object obj) {
        switch (a.f2950b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.j(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.r(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.y(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.Z(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.w(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.p(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.n(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.e(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.t((p0) obj);
            case 10:
                if (obj instanceof b0) {
                    return CodedOutputStream.B((b0) obj);
                }
                return CodedOutputStream.G((p0) obj);
            case 11:
                if (obj instanceof h) {
                    return CodedOutputStream.h((h) obj);
                }
                return CodedOutputStream.U((String) obj);
            case 12:
                if (obj instanceof h) {
                    return CodedOutputStream.h((h) obj);
                }
                return CodedOutputStream.f((byte[]) obj);
            case 13:
                return CodedOutputStream.X(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.M(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.O(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.Q(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.S(((Long) obj).longValue());
            case 18:
                if (obj instanceof z.c) {
                    return CodedOutputStream.l(((z.c) obj).getNumber());
                }
                return CodedOutputStream.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        q1.b c10 = bVar.c();
        int number = bVar.getNumber();
        if (!bVar.b()) {
            return d(c10, number, obj);
        }
        int i10 = 0;
        if (bVar.i()) {
            for (Object e10 : (List) obj) {
                i10 += e(c10, e10);
            }
            return CodedOutputStream.V(number) + i10 + CodedOutputStream.K(i10);
        }
        for (Object d10 : (List) obj) {
            i10 += d(c10, number, d10);
        }
        return i10;
    }

    public static <T extends b<T>> t<T> h() {
        return f2945d;
    }

    private int k(Map.Entry<T, Object> entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.h() != q1.c.MESSAGE || bVar.b() || bVar.i()) {
            return f(bVar, value);
        }
        if (value instanceof b0) {
            return CodedOutputStream.z(((b) entry.getKey()).getNumber(), (b0) value);
        }
        return CodedOutputStream.D(((b) entry.getKey()).getNumber(), (p0) value);
    }

    static int m(q1.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.d();
    }

    private static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        b bVar = (b) entry.getKey();
        if (bVar.h() == q1.c.MESSAGE) {
            if (bVar.b()) {
                for (p0 isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof p0) {
                    if (!((p0) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof b0) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private static boolean r(q1.b bVar, Object obj) {
        z.a(obj);
        switch (a.f2949a[bVar.a().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                if ((obj instanceof h) || (obj instanceof byte[])) {
                    return true;
                }
                return false;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof z.c)) {
                    return true;
                }
                return false;
            case 9:
                if ((obj instanceof p0) || (obj instanceof b0)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    private void v(Map.Entry<T, Object> entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof b0) {
            value = ((b0) value).f();
        }
        if (bVar.b()) {
            Object i10 = i(bVar);
            if (i10 == null) {
                i10 = new ArrayList();
            }
            for (Object c10 : (List) value) {
                ((List) i10).add(c(c10));
            }
            this.f2946a.put(bVar, i10);
        } else if (bVar.h() == q1.c.MESSAGE) {
            Object i11 = i(bVar);
            if (i11 == null) {
                this.f2946a.put(bVar, c(value));
                return;
            }
            this.f2946a.put(bVar, bVar.j(((p0) i11).b(), (p0) value).build());
        } else {
            this.f2946a.put(bVar, c(value));
        }
    }

    public static <T extends b<T>> t<T> w() {
        return new t<>();
    }

    private void y(q1.b bVar, Object obj) {
        if (!r(bVar, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    static void z(CodedOutputStream codedOutputStream, q1.b bVar, int i10, Object obj) {
        if (bVar == q1.b.GROUP) {
            codedOutputStream.A0(i10, (p0) obj);
            return;
        }
        codedOutputStream.W0(i10, m(bVar, false));
        A(codedOutputStream, bVar, obj);
    }

    public void a(T t10, Object obj) {
        List list;
        if (t10.b()) {
            y(t10.c(), obj);
            Object i10 = i(t10);
            if (i10 == null) {
                list = new ArrayList();
                this.f2946a.put(t10, list);
            } else {
                list = (List) i10;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public t<T> clone() {
        t<T> w10 = w();
        for (int i10 = 0; i10 < this.f2946a.k(); i10++) {
            Map.Entry<T, Object> j10 = this.f2946a.j(i10);
            w10.x((b) j10.getKey(), j10.getValue());
        }
        for (Map.Entry next : this.f2946a.m()) {
            w10.x((b) next.getKey(), next.getValue());
        }
        w10.f2948c = this.f2948c;
        return w10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        return this.f2946a.equals(((t) obj).f2946a);
    }

    /* access modifiers changed from: package-private */
    public Iterator<Map.Entry<T, Object>> g() {
        if (this.f2948c) {
            return new b0.c(this.f2946a.h().iterator());
        }
        return this.f2946a.h().iterator();
    }

    public int hashCode() {
        return this.f2946a.hashCode();
    }

    public Object i(T t10) {
        Object obj = this.f2946a.get(t10);
        return obj instanceof b0 ? ((b0) obj).f() : obj;
    }

    public int j() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f2946a.k(); i11++) {
            i10 += k(this.f2946a.j(i11));
        }
        for (Map.Entry<T, Object> k10 : this.f2946a.m()) {
            i10 += k(k10);
        }
        return i10;
    }

    public int l() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f2946a.k(); i11++) {
            Map.Entry<T, Object> j10 = this.f2946a.j(i11);
            i10 += f((b) j10.getKey(), j10.getValue());
        }
        for (Map.Entry next : this.f2946a.m()) {
            i10 += f((b) next.getKey(), next.getValue());
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return this.f2946a.isEmpty();
    }

    public boolean o() {
        return this.f2947b;
    }

    public boolean p() {
        for (int i10 = 0; i10 < this.f2946a.k(); i10++) {
            if (!q(this.f2946a.j(i10))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> q10 : this.f2946a.m()) {
            if (!q(q10)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> s() {
        if (this.f2948c) {
            return new b0.c(this.f2946a.entrySet().iterator());
        }
        return this.f2946a.entrySet().iterator();
    }

    public void t() {
        if (!this.f2947b) {
            this.f2946a.p();
            this.f2947b = true;
        }
    }

    public void u(t<T> tVar) {
        for (int i10 = 0; i10 < tVar.f2946a.k(); i10++) {
            v(tVar.f2946a.j(i10));
        }
        for (Map.Entry<T, Object> v10 : tVar.f2946a.m()) {
            v(v10);
        }
    }

    public void x(T t10, Object obj) {
        if (!t10.b()) {
            y(t10.c(), obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object y10 : arrayList) {
                y(t10.c(), y10);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof b0) {
            this.f2948c = true;
        }
        this.f2946a.put(t10, obj);
    }

    private t(boolean z10) {
        this(h1.q(0));
        t();
    }

    private t(h1<T, Object> h1Var) {
        this.f2946a = h1Var;
        t();
    }
}
