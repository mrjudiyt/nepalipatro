package a7;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: HighLevelEncoder */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    static final String[] f13273b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: c  reason: collision with root package name */
    static final int[][] f13274c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: d  reason: collision with root package name */
    private static final int[][] f13275d;

    /* renamed from: e  reason: collision with root package name */
    static final int[][] f13276e;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f13277a;

    /* compiled from: HighLevelEncoder */
    class a implements Comparator<f> {
        a() {
        }

        /* renamed from: a */
        public int compare(f fVar, f fVar2) {
            return fVar.d() - fVar2.d();
        }
    }

    static {
        Class<int> cls = int.class;
        int[][] iArr = (int[][]) Array.newInstance(cls, new int[]{5, UserVerificationMethods.USER_VERIFY_HANDPRINT});
        f13275d = iArr;
        iArr[0][32] = 1;
        for (int i10 = 65; i10 <= 90; i10++) {
            f13275d[0][i10] = (i10 - 65) + 2;
        }
        f13275d[1][32] = 1;
        for (int i11 = 97; i11 <= 122; i11++) {
            f13275d[1][i11] = (i11 - 97) + 2;
        }
        f13275d[2][32] = 1;
        for (int i12 = 48; i12 <= 57; i12++) {
            f13275d[2][i12] = (i12 - 48) + 2;
        }
        int[][] iArr2 = f13275d;
        iArr2[2][44] = 12;
        iArr2[2][46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i13 = 0; i13 < 28; i13++) {
            f13275d[3][iArr3[i13]] = i13;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i14 = 0; i14 < 31; i14++) {
            if (iArr4[i14] > 0) {
                f13275d[4][iArr4[i14]] = i14;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(cls, new int[]{6, 6});
        f13276e = iArr5;
        for (int[] fill : iArr5) {
            Arrays.fill(fill, -1);
        }
        int[][] iArr6 = f13276e;
        iArr6[0][4] = 0;
        iArr6[1][4] = 0;
        iArr6[1][0] = 28;
        iArr6[3][4] = 0;
        iArr6[2][4] = 0;
        iArr6[2][0] = 15;
    }

    public d(byte[] bArr) {
        this.f13277a = bArr;
    }

    private static Collection<f> b(Iterable<f> iterable) {
        LinkedList linkedList = new LinkedList();
        for (f next : iterable) {
            boolean z10 = true;
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                f fVar = (f) it.next();
                if (fVar.f(next)) {
                    z10 = false;
                    break;
                } else if (next.f(fVar)) {
                    it.remove();
                }
            }
            if (z10) {
                linkedList.add(next);
            }
        }
        return linkedList;
    }

    private void c(f fVar, int i10, Collection<f> collection) {
        char c10 = (char) (this.f13277a[i10] & 255);
        boolean z10 = f13275d[fVar.e()][c10] > 0;
        f fVar2 = null;
        for (int i11 = 0; i11 <= 4; i11++) {
            int i12 = f13275d[i11][c10];
            if (i12 > 0) {
                if (fVar2 == null) {
                    fVar2 = fVar.b(i10);
                }
                if (!z10 || i11 == fVar.e() || i11 == 2) {
                    collection.add(fVar2.g(i11, i12));
                }
                if (!z10 && f13276e[fVar.e()][i11] >= 0) {
                    collection.add(fVar2.h(i11, i12));
                }
            }
        }
        if (fVar.c() > 0 || f13275d[fVar.e()][c10] == 0) {
            collection.add(fVar.a(i10));
        }
    }

    private static void d(f fVar, int i10, int i11, Collection<f> collection) {
        f b10 = fVar.b(i10);
        collection.add(b10.g(4, i11));
        if (fVar.e() != 4) {
            collection.add(b10.h(4, i11));
        }
        if (i11 == 3 || i11 == 4) {
            collection.add(b10.g(2, 16 - i11).g(2, 1));
        }
        if (fVar.c() > 0) {
            collection.add(fVar.a(i10).a(i10 + 1));
        }
    }

    private Collection<f> e(Iterable<f> iterable, int i10) {
        LinkedList linkedList = new LinkedList();
        for (f c10 : iterable) {
            c(c10, i10, linkedList);
        }
        return b(linkedList);
    }

    private static Collection<f> f(Iterable<f> iterable, int i10, int i11) {
        LinkedList linkedList = new LinkedList();
        for (f d10 : iterable) {
            d(d10, i10, i11, linkedList);
        }
        return b(linkedList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b7.a a() {
        /*
            r8 = this;
            a7.f r0 = a7.f.f13281e
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = 0
        L_0x0008:
            byte[] r3 = r8.f13277a
            int r4 = r3.length
            if (r2 >= r4) goto L_0x004c
            int r4 = r2 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L_0x0015
            byte r5 = r3[r4]
            goto L_0x0016
        L_0x0015:
            r5 = 0
        L_0x0016:
            byte r3 = r3[r2]
            r6 = 13
            if (r3 == r6) goto L_0x0038
            r6 = 44
            r7 = 32
            if (r3 == r6) goto L_0x0034
            r6 = 46
            if (r3 == r6) goto L_0x0030
            r6 = 58
            if (r3 == r6) goto L_0x002c
        L_0x002a:
            r3 = 0
            goto L_0x003d
        L_0x002c:
            if (r5 != r7) goto L_0x002a
            r3 = 5
            goto L_0x003d
        L_0x0030:
            if (r5 != r7) goto L_0x002a
            r3 = 3
            goto L_0x003d
        L_0x0034:
            if (r5 != r7) goto L_0x002a
            r3 = 4
            goto L_0x003d
        L_0x0038:
            r3 = 10
            if (r5 != r3) goto L_0x002a
            r3 = 2
        L_0x003d:
            if (r3 <= 0) goto L_0x0045
            java.util.Collection r0 = f(r0, r2, r3)
            r2 = r4
            goto L_0x0049
        L_0x0045:
            java.util.Collection r0 = r8.e(r0, r2)
        L_0x0049:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x004c:
            a7.d$a r1 = new a7.d$a
            r1.<init>()
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            a7.f r0 = (a7.f) r0
            byte[] r1 = r8.f13277a
            b7.a r0 = r0.i(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.d.a():b7.a");
    }
}
