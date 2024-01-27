package w;

import v.d;
import v.e;
import v.h;
import w.f;
import w.p;

/* compiled from: HorizontalWidgetRun */
public class l extends p {

    /* renamed from: k  reason: collision with root package name */
    private static int[] f12533k = new int[2];

    /* compiled from: HorizontalWidgetRun */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12534a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                w.p$b[] r0 = w.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12534a = r0
                w.p$b r1 = w.p.b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12534a     // Catch:{ NoSuchFieldError -> 0x001d }
                w.p$b r1 = w.p.b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12534a     // Catch:{ NoSuchFieldError -> 0x0028 }
                w.p$b r1 = w.p.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w.l.a.<clinit>():void");
        }
    }

    public l(e eVar) {
        super(eVar);
        this.f12568h.f12512e = f.a.LEFT;
        this.f12569i.f12512e = f.a.RIGHT;
        this.f12566f = 0;
    }

    private void q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 == -1) {
            int i17 = (int) ((((float) i16) * f10) + 0.5f);
            int i18 = (int) ((((float) i15) / f10) + 0.5f);
            if (i17 <= i15) {
                iArr[0] = i17;
                iArr[1] = i16;
            } else if (i18 <= i16) {
                iArr[0] = i15;
                iArr[1] = i18;
            }
        } else if (i14 == 0) {
            iArr[0] = (int) ((((float) i16) * f10) + 0.5f);
            iArr[1] = i16;
        } else if (i14 == 1) {
            iArr[0] = i15;
            iArr[1] = (int) ((((float) i15) * f10) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02bc, code lost:
        if (r14 != 1) goto L_0x0324;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(w.d r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = w.l.a.f12534a
            w.p$b r1 = r8.f12570j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            v.e r0 = r8.f12562b
            v.d r1 = r0.O
            v.d r0 = r0.Q
            r3 = r17
            r8.n(r3, r1, r0, r10)
            return
        L_0x0023:
            r3 = r17
            r16.o(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.p(r17)
        L_0x002e:
            w.g r0 = r8.f12565e
            boolean r0 = r0.f12517j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x0324
            v.e$b r0 = r8.f12564d
            v.e$b r3 = v.e.b.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x0324
            v.e r0 = r8.f12562b
            int r3 = r0.f12187w
            if (r3 == r1) goto L_0x0306
            if (r3 == r2) goto L_0x0046
            goto L_0x0324
        L_0x0046:
            int r1 = r0.f12189x
            r3 = -1
            if (r1 == 0) goto L_0x008f
            if (r1 != r2) goto L_0x004e
            goto L_0x008f
        L_0x004e:
            int r0 = r0.u()
            if (r0 == r3) goto L_0x0077
            if (r0 == 0) goto L_0x0068
            if (r0 == r9) goto L_0x005a
            r0 = 0
            goto L_0x0088
        L_0x005a:
            v.e r0 = r8.f12562b
            w.n r1 = r0.f12153f
            w.g r1 = r1.f12565e
            int r1 = r1.f12514g
            float r1 = (float) r1
            float r0 = r0.t()
            goto L_0x0084
        L_0x0068:
            v.e r0 = r8.f12562b
            w.n r1 = r0.f12153f
            w.g r1 = r1.f12565e
            int r1 = r1.f12514g
            float r1 = (float) r1
            float r0 = r0.t()
            float r1 = r1 / r0
            goto L_0x0086
        L_0x0077:
            v.e r0 = r8.f12562b
            w.n r1 = r0.f12153f
            w.g r1 = r1.f12565e
            int r1 = r1.f12514g
            float r1 = (float) r1
            float r0 = r0.t()
        L_0x0084:
            float r1 = r1 * r0
        L_0x0086:
            float r1 = r1 + r11
            int r0 = (int) r1
        L_0x0088:
            w.g r1 = r8.f12565e
            r1.d(r0)
            goto L_0x0324
        L_0x008f:
            w.n r1 = r0.f12153f
            w.f r12 = r1.f12568h
            w.f r13 = r1.f12569i
            v.d r1 = r0.O
            v.d r1 = r1.f12128f
            if (r1 == 0) goto L_0x009d
            r1 = 1
            goto L_0x009e
        L_0x009d:
            r1 = 0
        L_0x009e:
            v.d r2 = r0.P
            v.d r2 = r2.f12128f
            if (r2 == 0) goto L_0x00a6
            r2 = 1
            goto L_0x00a7
        L_0x00a6:
            r2 = 0
        L_0x00a7:
            v.d r4 = r0.Q
            v.d r4 = r4.f12128f
            if (r4 == 0) goto L_0x00af
            r4 = 1
            goto L_0x00b0
        L_0x00af:
            r4 = 0
        L_0x00b0:
            v.d r5 = r0.R
            v.d r5 = r5.f12128f
            if (r5 == 0) goto L_0x00b8
            r5 = 1
            goto L_0x00b9
        L_0x00b8:
            r5 = 0
        L_0x00b9:
            int r14 = r0.u()
            if (r1 == 0) goto L_0x0200
            if (r2 == 0) goto L_0x0200
            if (r4 == 0) goto L_0x0200
            if (r5 == 0) goto L_0x0200
            v.e r0 = r8.f12562b
            float r15 = r0.t()
            boolean r0 = r12.f12517j
            if (r0 == 0) goto L_0x012e
            boolean r0 = r13.f12517j
            if (r0 == 0) goto L_0x012e
            w.f r0 = r8.f12568h
            boolean r1 = r0.f12510c
            if (r1 == 0) goto L_0x012d
            w.f r1 = r8.f12569i
            boolean r1 = r1.f12510c
            if (r1 != 0) goto L_0x00e0
            goto L_0x012d
        L_0x00e0:
            java.util.List<w.f> r0 = r0.f12519l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            int r0 = r0.f12514g
            w.f r1 = r8.f12568h
            int r1 = r1.f12513f
            int r2 = r0 + r1
            w.f r0 = r8.f12569i
            java.util.List<w.f> r0 = r0.f12519l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            int r0 = r0.f12514g
            w.f r1 = r8.f12569i
            int r1 = r1.f12513f
            int r3 = r0 - r1
            int r0 = r12.f12514g
            int r1 = r12.f12513f
            int r4 = r0 + r1
            int r0 = r13.f12514g
            int r1 = r13.f12513f
            int r5 = r0 - r1
            int[] r1 = f12533k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            w.g r0 = r8.f12565e
            int[] r1 = f12533k
            r1 = r1[r10]
            r0.d(r1)
            v.e r0 = r8.f12562b
            w.n r0 = r0.f12153f
            w.g r0 = r0.f12565e
            int[] r1 = f12533k
            r1 = r1[r9]
            r0.d(r1)
        L_0x012d:
            return
        L_0x012e:
            w.f r0 = r8.f12568h
            boolean r1 = r0.f12517j
            if (r1 == 0) goto L_0x018b
            w.f r1 = r8.f12569i
            boolean r2 = r1.f12517j
            if (r2 == 0) goto L_0x018b
            boolean r2 = r12.f12510c
            if (r2 == 0) goto L_0x018a
            boolean r2 = r13.f12510c
            if (r2 != 0) goto L_0x0143
            goto L_0x018a
        L_0x0143:
            int r2 = r0.f12514g
            int r0 = r0.f12513f
            int r2 = r2 + r0
            int r0 = r1.f12514g
            int r1 = r1.f12513f
            int r3 = r0 - r1
            java.util.List<w.f> r0 = r12.f12519l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            int r0 = r0.f12514g
            int r1 = r12.f12513f
            int r4 = r0 + r1
            java.util.List<w.f> r0 = r13.f12519l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            int r0 = r0.f12514g
            int r1 = r13.f12513f
            int r5 = r0 - r1
            int[] r1 = f12533k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            w.g r0 = r8.f12565e
            int[] r1 = f12533k
            r1 = r1[r10]
            r0.d(r1)
            v.e r0 = r8.f12562b
            w.n r0 = r0.f12153f
            w.g r0 = r0.f12565e
            int[] r1 = f12533k
            r1 = r1[r9]
            r0.d(r1)
            goto L_0x018b
        L_0x018a:
            return
        L_0x018b:
            w.f r0 = r8.f12568h
            boolean r1 = r0.f12510c
            if (r1 == 0) goto L_0x01ff
            w.f r1 = r8.f12569i
            boolean r1 = r1.f12510c
            if (r1 == 0) goto L_0x01ff
            boolean r1 = r12.f12510c
            if (r1 == 0) goto L_0x01ff
            boolean r1 = r13.f12510c
            if (r1 != 0) goto L_0x01a0
            goto L_0x01ff
        L_0x01a0:
            java.util.List<w.f> r0 = r0.f12519l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            int r0 = r0.f12514g
            w.f r1 = r8.f12568h
            int r1 = r1.f12513f
            int r2 = r0 + r1
            w.f r0 = r8.f12569i
            java.util.List<w.f> r0 = r0.f12519l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            int r0 = r0.f12514g
            w.f r1 = r8.f12569i
            int r1 = r1.f12513f
            int r3 = r0 - r1
            java.util.List<w.f> r0 = r12.f12519l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            int r0 = r0.f12514g
            int r1 = r12.f12513f
            int r4 = r0 + r1
            java.util.List<w.f> r0 = r13.f12519l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            int r0 = r0.f12514g
            int r1 = r13.f12513f
            int r5 = r0 - r1
            int[] r1 = f12533k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            w.g r0 = r8.f12565e
            int[] r1 = f12533k
            r1 = r1[r10]
            r0.d(r1)
            v.e r0 = r8.f12562b
            w.n r0 = r0.f12153f
            w.g r0 = r0.f12565e
            int[] r1 = f12533k
            r1 = r1[r9]
            r0.d(r1)
            goto L_0x0324
        L_0x01ff:
            return
        L_0x0200:
            if (r1 == 0) goto L_0x028b
            if (r4 == 0) goto L_0x028b
            w.f r0 = r8.f12568h
            boolean r0 = r0.f12510c
            if (r0 == 0) goto L_0x028a
            w.f r0 = r8.f12569i
            boolean r0 = r0.f12510c
            if (r0 != 0) goto L_0x0212
            goto L_0x028a
        L_0x0212:
            v.e r0 = r8.f12562b
            float r0 = r0.t()
            w.f r1 = r8.f12568h
            java.util.List<w.f> r1 = r1.f12519l
            java.lang.Object r1 = r1.get(r10)
            w.f r1 = (w.f) r1
            int r1 = r1.f12514g
            w.f r2 = r8.f12568h
            int r2 = r2.f12513f
            int r1 = r1 + r2
            w.f r2 = r8.f12569i
            java.util.List<w.f> r2 = r2.f12519l
            java.lang.Object r2 = r2.get(r10)
            w.f r2 = (w.f) r2
            int r2 = r2.f12514g
            w.f r4 = r8.f12569i
            int r4 = r4.f12513f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x0266
            if (r14 == 0) goto L_0x0266
            if (r14 == r9) goto L_0x0242
            goto L_0x0324
        L_0x0242:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x0256
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0256:
            w.g r0 = r8.f12565e
            r0.d(r1)
            v.e r0 = r8.f12562b
            w.n r0 = r0.f12153f
            w.g r0 = r0.f12565e
            r0.d(r3)
            goto L_0x0324
        L_0x0266:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x027a
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x027a:
            w.g r0 = r8.f12565e
            r0.d(r1)
            v.e r0 = r8.f12562b
            w.n r0 = r0.f12153f
            w.g r0 = r0.f12565e
            r0.d(r3)
            goto L_0x0324
        L_0x028a:
            return
        L_0x028b:
            if (r2 == 0) goto L_0x0324
            if (r5 == 0) goto L_0x0324
            boolean r0 = r12.f12510c
            if (r0 == 0) goto L_0x0305
            boolean r0 = r13.f12510c
            if (r0 != 0) goto L_0x0298
            goto L_0x0305
        L_0x0298:
            v.e r0 = r8.f12562b
            float r0 = r0.t()
            java.util.List<w.f> r1 = r12.f12519l
            java.lang.Object r1 = r1.get(r10)
            w.f r1 = (w.f) r1
            int r1 = r1.f12514g
            int r2 = r12.f12513f
            int r1 = r1 + r2
            java.util.List<w.f> r2 = r13.f12519l
            java.lang.Object r2 = r2.get(r10)
            w.f r2 = (w.f) r2
            int r2 = r2.f12514g
            int r4 = r13.f12513f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02e2
            if (r14 == 0) goto L_0x02bf
            if (r14 == r9) goto L_0x02e2
            goto L_0x0324
        L_0x02bf:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x02d3
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02d3:
            w.g r0 = r8.f12565e
            r0.d(r3)
            v.e r0 = r8.f12562b
            w.n r0 = r0.f12153f
            w.g r0 = r0.f12565e
            r0.d(r1)
            goto L_0x0324
        L_0x02e2:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x02f6
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02f6:
            w.g r0 = r8.f12565e
            r0.d(r3)
            v.e r0 = r8.f12562b
            w.n r0 = r0.f12153f
            w.g r0 = r0.f12565e
            r0.d(r1)
            goto L_0x0324
        L_0x0305:
            return
        L_0x0306:
            v.e r0 = r0.I()
            if (r0 == 0) goto L_0x0324
            w.l r0 = r0.f12151e
            w.g r0 = r0.f12565e
            boolean r1 = r0.f12517j
            if (r1 == 0) goto L_0x0324
            v.e r1 = r8.f12562b
            float r1 = r1.B
            int r0 = r0.f12514g
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
            w.g r1 = r8.f12565e
            r1.d(r0)
        L_0x0324:
            w.f r0 = r8.f12568h
            boolean r1 = r0.f12510c
            if (r1 == 0) goto L_0x0446
            w.f r1 = r8.f12569i
            boolean r2 = r1.f12510c
            if (r2 != 0) goto L_0x0332
            goto L_0x0446
        L_0x0332:
            boolean r0 = r0.f12517j
            if (r0 == 0) goto L_0x0341
            boolean r0 = r1.f12517j
            if (r0 == 0) goto L_0x0341
            w.g r0 = r8.f12565e
            boolean r0 = r0.f12517j
            if (r0 == 0) goto L_0x0341
            return
        L_0x0341:
            w.g r0 = r8.f12565e
            boolean r0 = r0.f12517j
            if (r0 != 0) goto L_0x038b
            v.e$b r0 = r8.f12564d
            v.e$b r1 = v.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x038b
            v.e r0 = r8.f12562b
            int r1 = r0.f12187w
            if (r1 != 0) goto L_0x038b
            boolean r0 = r0.g0()
            if (r0 != 0) goto L_0x038b
            w.f r0 = r8.f12568h
            java.util.List<w.f> r0 = r0.f12519l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            w.f r1 = r8.f12569i
            java.util.List<w.f> r1 = r1.f12519l
            java.lang.Object r1 = r1.get(r10)
            w.f r1 = (w.f) r1
            int r0 = r0.f12514g
            w.f r2 = r8.f12568h
            int r3 = r2.f12513f
            int r0 = r0 + r3
            int r1 = r1.f12514g
            w.f r3 = r8.f12569i
            int r3 = r3.f12513f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.d(r0)
            w.f r0 = r8.f12569i
            r0.d(r1)
            w.g r0 = r8.f12565e
            r0.d(r3)
            return
        L_0x038b:
            w.g r0 = r8.f12565e
            boolean r0 = r0.f12517j
            if (r0 != 0) goto L_0x03ef
            v.e$b r0 = r8.f12564d
            v.e$b r1 = v.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03ef
            int r0 = r8.f12561a
            if (r0 != r9) goto L_0x03ef
            w.f r0 = r8.f12568h
            java.util.List<w.f> r0 = r0.f12519l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03ef
            w.f r0 = r8.f12569i
            java.util.List<w.f> r0 = r0.f12519l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03ef
            w.f r0 = r8.f12568h
            java.util.List<w.f> r0 = r0.f12519l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            w.f r1 = r8.f12569i
            java.util.List<w.f> r1 = r1.f12519l
            java.lang.Object r1 = r1.get(r10)
            w.f r1 = (w.f) r1
            int r0 = r0.f12514g
            w.f r2 = r8.f12568h
            int r2 = r2.f12513f
            int r0 = r0 + r2
            int r1 = r1.f12514g
            w.f r2 = r8.f12569i
            int r2 = r2.f12513f
            int r1 = r1 + r2
            int r1 = r1 - r0
            w.g r0 = r8.f12565e
            int r0 = r0.f12529m
            int r0 = java.lang.Math.min(r1, r0)
            v.e r1 = r8.f12562b
            int r2 = r1.A
            int r1 = r1.f12193z
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03ea
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03ea:
            w.g r1 = r8.f12565e
            r1.d(r0)
        L_0x03ef:
            w.g r0 = r8.f12565e
            boolean r0 = r0.f12517j
            if (r0 != 0) goto L_0x03f6
            return
        L_0x03f6:
            w.f r0 = r8.f12568h
            java.util.List<w.f> r0 = r0.f12519l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            w.f r1 = r8.f12569i
            java.util.List<w.f> r1 = r1.f12519l
            java.lang.Object r1 = r1.get(r10)
            w.f r1 = (w.f) r1
            int r2 = r0.f12514g
            w.f r3 = r8.f12568h
            int r3 = r3.f12513f
            int r2 = r2 + r3
            int r3 = r1.f12514g
            w.f r4 = r8.f12569i
            int r4 = r4.f12513f
            int r3 = r3 + r4
            v.e r4 = r8.f12562b
            float r4 = r4.w()
            if (r0 != r1) goto L_0x0426
            int r2 = r0.f12514g
            int r3 = r1.f12514g
            r4 = 1056964608(0x3f000000, float:0.5)
        L_0x0426:
            int r3 = r3 - r2
            w.g r0 = r8.f12565e
            int r0 = r0.f12514g
            int r3 = r3 - r0
            w.f r0 = r8.f12568h
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.d(r1)
            w.f r0 = r8.f12569i
            w.f r1 = r8.f12568h
            int r1 = r1.f12514g
            w.g r2 = r8.f12565e
            int r2 = r2.f12514g
            int r1 = r1 + r2
            r0.d(r1)
        L_0x0446:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.l.a(w.d):void");
    }

    /* access modifiers changed from: package-private */
    public void d() {
        e I;
        e I2;
        e eVar = this.f12562b;
        if (eVar.f12143a) {
            this.f12565e.d(eVar.U());
        }
        if (!this.f12565e.f12517j) {
            e.b y10 = this.f12562b.y();
            this.f12564d = y10;
            if (y10 != e.b.MATCH_CONSTRAINT) {
                e.b bVar = e.b.MATCH_PARENT;
                if (y10 == bVar && (I2 = this.f12562b.I()) != null && (I2.y() == e.b.FIXED || I2.y() == bVar)) {
                    int U = (I2.U() - this.f12562b.O.e()) - this.f12562b.Q.e();
                    b(this.f12568h, I2.f12151e.f12568h, this.f12562b.O.e());
                    b(this.f12569i, I2.f12151e.f12569i, -this.f12562b.Q.e());
                    this.f12565e.d(U);
                    return;
                } else if (this.f12564d == e.b.FIXED) {
                    this.f12565e.d(this.f12562b.U());
                }
            }
        } else {
            e.b bVar2 = this.f12564d;
            e.b bVar3 = e.b.MATCH_PARENT;
            if (bVar2 == bVar3 && (I = this.f12562b.I()) != null && (I.y() == e.b.FIXED || I.y() == bVar3)) {
                b(this.f12568h, I.f12151e.f12568h, this.f12562b.O.e());
                b(this.f12569i, I.f12151e.f12569i, -this.f12562b.Q.e());
                return;
            }
        }
        g gVar = this.f12565e;
        if (gVar.f12517j) {
            e eVar2 = this.f12562b;
            if (eVar2.f12143a) {
                d[] dVarArr = eVar2.W;
                if (dVarArr[0].f12128f == null || dVarArr[1].f12128f == null) {
                    if (dVarArr[0].f12128f != null) {
                        f h10 = h(dVarArr[0]);
                        if (h10 != null) {
                            b(this.f12568h, h10, this.f12562b.W[0].e());
                            b(this.f12569i, this.f12568h, this.f12565e.f12514g);
                            return;
                        }
                        return;
                    } else if (dVarArr[1].f12128f != null) {
                        f h11 = h(dVarArr[1]);
                        if (h11 != null) {
                            b(this.f12569i, h11, -this.f12562b.W[1].e());
                            b(this.f12568h, this.f12569i, -this.f12565e.f12514g);
                            return;
                        }
                        return;
                    } else if (!(eVar2 instanceof h) && eVar2.I() != null && this.f12562b.m(d.b.CENTER).f12128f == null) {
                        b(this.f12568h, this.f12562b.I().f12151e.f12568h, this.f12562b.V());
                        b(this.f12569i, this.f12568h, this.f12565e.f12514g);
                        return;
                    } else {
                        return;
                    }
                } else if (eVar2.g0()) {
                    this.f12568h.f12513f = this.f12562b.W[0].e();
                    this.f12569i.f12513f = -this.f12562b.W[1].e();
                    return;
                } else {
                    f h12 = h(this.f12562b.W[0]);
                    if (h12 != null) {
                        b(this.f12568h, h12, this.f12562b.W[0].e());
                    }
                    f h13 = h(this.f12562b.W[1]);
                    if (h13 != null) {
                        b(this.f12569i, h13, -this.f12562b.W[1].e());
                    }
                    this.f12568h.f12509b = true;
                    this.f12569i.f12509b = true;
                    return;
                }
            }
        }
        if (this.f12564d == e.b.MATCH_CONSTRAINT) {
            e eVar3 = this.f12562b;
            int i10 = eVar3.f12187w;
            if (i10 == 2) {
                e I3 = eVar3.I();
                if (I3 != null) {
                    g gVar2 = I3.f12153f.f12565e;
                    this.f12565e.f12519l.add(gVar2);
                    gVar2.f12518k.add(this.f12565e);
                    g gVar3 = this.f12565e;
                    gVar3.f12509b = true;
                    gVar3.f12518k.add(this.f12568h);
                    this.f12565e.f12518k.add(this.f12569i);
                }
            } else if (i10 == 3) {
                if (eVar3.f12189x == 3) {
                    this.f12568h.f12508a = this;
                    this.f12569i.f12508a = this;
                    n nVar = eVar3.f12153f;
                    nVar.f12568h.f12508a = this;
                    nVar.f12569i.f12508a = this;
                    gVar.f12508a = this;
                    if (eVar3.i0()) {
                        this.f12565e.f12519l.add(this.f12562b.f12153f.f12565e);
                        this.f12562b.f12153f.f12565e.f12518k.add(this.f12565e);
                        n nVar2 = this.f12562b.f12153f;
                        nVar2.f12565e.f12508a = this;
                        this.f12565e.f12519l.add(nVar2.f12568h);
                        this.f12565e.f12519l.add(this.f12562b.f12153f.f12569i);
                        this.f12562b.f12153f.f12568h.f12518k.add(this.f12565e);
                        this.f12562b.f12153f.f12569i.f12518k.add(this.f12565e);
                    } else if (this.f12562b.g0()) {
                        this.f12562b.f12153f.f12565e.f12519l.add(this.f12565e);
                        this.f12565e.f12518k.add(this.f12562b.f12153f.f12565e);
                    } else {
                        this.f12562b.f12153f.f12565e.f12519l.add(this.f12565e);
                    }
                } else {
                    g gVar4 = eVar3.f12153f.f12565e;
                    gVar.f12519l.add(gVar4);
                    gVar4.f12518k.add(this.f12565e);
                    this.f12562b.f12153f.f12568h.f12518k.add(this.f12565e);
                    this.f12562b.f12153f.f12569i.f12518k.add(this.f12565e);
                    g gVar5 = this.f12565e;
                    gVar5.f12509b = true;
                    gVar5.f12518k.add(this.f12568h);
                    this.f12565e.f12518k.add(this.f12569i);
                    this.f12568h.f12519l.add(this.f12565e);
                    this.f12569i.f12519l.add(this.f12565e);
                }
            }
        }
        e eVar4 = this.f12562b;
        d[] dVarArr2 = eVar4.W;
        if (dVarArr2[0].f12128f == null || dVarArr2[1].f12128f == null) {
            if (dVarArr2[0].f12128f != null) {
                f h14 = h(dVarArr2[0]);
                if (h14 != null) {
                    b(this.f12568h, h14, this.f12562b.W[0].e());
                    c(this.f12569i, this.f12568h, 1, this.f12565e);
                }
            } else if (dVarArr2[1].f12128f != null) {
                f h15 = h(dVarArr2[1]);
                if (h15 != null) {
                    b(this.f12569i, h15, -this.f12562b.W[1].e());
                    c(this.f12568h, this.f12569i, -1, this.f12565e);
                }
            } else if (!(eVar4 instanceof h) && eVar4.I() != null) {
                b(this.f12568h, this.f12562b.I().f12151e.f12568h, this.f12562b.V());
                c(this.f12569i, this.f12568h, 1, this.f12565e);
            }
        } else if (eVar4.g0()) {
            this.f12568h.f12513f = this.f12562b.W[0].e();
            this.f12569i.f12513f = -this.f12562b.W[1].e();
        } else {
            f h16 = h(this.f12562b.W[0]);
            f h17 = h(this.f12562b.W[1]);
            if (h16 != null) {
                h16.b(this);
            }
            if (h17 != null) {
                h17.b(this);
            }
            this.f12570j = p.b.CENTER;
        }
    }

    public void e() {
        f fVar = this.f12568h;
        if (fVar.f12517j) {
            this.f12562b.j1(fVar.f12514g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f12563c = null;
        this.f12568h.c();
        this.f12569i.c();
        this.f12565e.c();
        this.f12567g = false;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        if (this.f12564d != e.b.MATCH_CONSTRAINT || this.f12562b.f12187w == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        this.f12567g = false;
        this.f12568h.c();
        this.f12568h.f12517j = false;
        this.f12569i.c();
        this.f12569i.f12517j = false;
        this.f12565e.f12517j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f12562b.r();
    }
}
