package w;

import java.util.ArrayList;
import java.util.Iterator;
import v.d;
import v.e;
import v.f;

/* compiled from: ChainRun */
public class c extends p {

    /* renamed from: k  reason: collision with root package name */
    ArrayList<p> f12497k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    private int f12498l;

    public c(e eVar, int i10) {
        super(eVar);
        this.f12566f = i10;
        q();
    }

    private void q() {
        e eVar;
        e eVar2 = this.f12562b;
        e J = eVar2.J(this.f12566f);
        while (true) {
            e eVar3 = J;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            }
            J = eVar2.J(this.f12566f);
        }
        this.f12562b = eVar;
        this.f12497k.add(eVar.L(this.f12566f));
        e H = eVar.H(this.f12566f);
        while (H != null) {
            this.f12497k.add(H.L(this.f12566f));
            H = H.H(this.f12566f);
        }
        Iterator<p> it = this.f12497k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i10 = this.f12566f;
            if (i10 == 0) {
                next.f12562b.f12147c = this;
            } else if (i10 == 1) {
                next.f12562b.f12149d = this;
            }
        }
        if ((this.f12566f == 0 && ((f) this.f12562b.I()).L1()) && this.f12497k.size() > 1) {
            ArrayList<p> arrayList = this.f12497k;
            this.f12562b = arrayList.get(arrayList.size() - 1).f12562b;
        }
        this.f12498l = this.f12566f == 0 ? this.f12562b.x() : this.f12562b.Q();
    }

    private e r() {
        for (int i10 = 0; i10 < this.f12497k.size(); i10++) {
            p pVar = this.f12497k.get(i10);
            if (pVar.f12562b.T() != 8) {
                return pVar.f12562b;
            }
        }
        return null;
    }

    private e s() {
        for (int size = this.f12497k.size() - 1; size >= 0; size--) {
            p pVar = this.f12497k.get(size);
            if (pVar.f12562b.T() != 8) {
                return pVar.f12562b;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(w.d r27) {
        /*
            r26 = this;
            r0 = r26
            w.f r1 = r0.f12568h
            boolean r1 = r1.f12517j
            if (r1 == 0) goto L_0x0429
            w.f r1 = r0.f12569i
            boolean r1 = r1.f12517j
            if (r1 != 0) goto L_0x0010
            goto L_0x0429
        L_0x0010:
            v.e r1 = r0.f12562b
            v.e r1 = r1.I()
            boolean r2 = r1 instanceof v.f
            if (r2 == 0) goto L_0x0021
            v.f r1 = (v.f) r1
            boolean r1 = r1.L1()
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            w.f r2 = r0.f12569i
            int r2 = r2.f12514g
            w.f r4 = r0.f12568h
            int r4 = r4.f12514g
            int r2 = r2 - r4
            java.util.ArrayList<w.p> r4 = r0.f12497k
            int r4 = r4.size()
            r5 = 0
        L_0x0032:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x004a
            java.util.ArrayList<w.p> r8 = r0.f12497k
            java.lang.Object r8 = r8.get(r5)
            w.p r8 = (w.p) r8
            v.e r8 = r8.f12562b
            int r8 = r8.T()
            if (r8 != r7) goto L_0x004b
            int r5 = r5 + 1
            goto L_0x0032
        L_0x004a:
            r5 = -1
        L_0x004b:
            int r8 = r4 + -1
            r9 = r8
        L_0x004e:
            if (r9 < 0) goto L_0x0064
            java.util.ArrayList<w.p> r10 = r0.f12497k
            java.lang.Object r10 = r10.get(r9)
            w.p r10 = (w.p) r10
            v.e r10 = r10.f12562b
            int r10 = r10.T()
            if (r10 != r7) goto L_0x0063
            int r9 = r9 + -1
            goto L_0x004e
        L_0x0063:
            r6 = r9
        L_0x0064:
            r9 = 0
        L_0x0065:
            r11 = 2
            if (r9 >= r11) goto L_0x0109
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x006f:
            if (r13 >= r4) goto L_0x00fb
            java.util.ArrayList<w.p> r3 = r0.f12497k
            java.lang.Object r3 = r3.get(r13)
            w.p r3 = (w.p) r3
            v.e r11 = r3.f12562b
            int r11 = r11.T()
            if (r11 != r7) goto L_0x0083
            goto L_0x00f4
        L_0x0083:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x008e
            if (r13 < r5) goto L_0x008e
            w.f r11 = r3.f12568h
            int r11 = r11.f12513f
            int r14 = r14 + r11
        L_0x008e:
            w.g r11 = r3.f12565e
            int r7 = r11.f12514g
            v.e$b r10 = r3.f12564d
            v.e$b r12 = v.e.b.MATCH_CONSTRAINT
            if (r10 == r12) goto L_0x009a
            r10 = 1
            goto L_0x009b
        L_0x009a:
            r10 = 0
        L_0x009b:
            if (r10 == 0) goto L_0x00bd
            int r11 = r0.f12566f
            if (r11 != 0) goto L_0x00ac
            v.e r12 = r3.f12562b
            w.l r12 = r12.f12151e
            w.g r12 = r12.f12565e
            boolean r12 = r12.f12517j
            if (r12 != 0) goto L_0x00ac
            return
        L_0x00ac:
            r12 = 1
            if (r11 != r12) goto L_0x00ba
            v.e r11 = r3.f12562b
            w.n r11 = r11.f12153f
            w.g r11 = r11.f12565e
            boolean r11 = r11.f12517j
            if (r11 != 0) goto L_0x00ba
            return
        L_0x00ba:
            r19 = r7
            goto L_0x00d3
        L_0x00bd:
            r19 = r7
            r12 = 1
            int r7 = r3.f12561a
            if (r7 != r12) goto L_0x00cb
            if (r9 != 0) goto L_0x00cb
            int r7 = r11.f12529m
            int r15 = r15 + 1
            goto L_0x00d1
        L_0x00cb:
            boolean r7 = r11.f12517j
            if (r7 == 0) goto L_0x00d3
            r7 = r19
        L_0x00d1:
            r10 = 1
            goto L_0x00d5
        L_0x00d3:
            r7 = r19
        L_0x00d5:
            if (r10 != 0) goto L_0x00e9
            int r15 = r15 + 1
            v.e r7 = r3.f12562b
            float[] r7 = r7.D0
            int r10 = r0.f12566f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00ea
            float r17 = r17 + r7
            goto L_0x00ea
        L_0x00e9:
            int r14 = r14 + r7
        L_0x00ea:
            if (r13 >= r8) goto L_0x00f4
            if (r13 >= r6) goto L_0x00f4
            w.f r3 = r3.f12569i
            int r3 = r3.f12513f
            int r3 = -r3
            int r14 = r14 + r3
        L_0x00f4:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x006f
        L_0x00fb:
            if (r14 < r2) goto L_0x0106
            if (r15 != 0) goto L_0x0100
            goto L_0x0106
        L_0x0100:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0065
        L_0x0106:
            r3 = r16
            goto L_0x010e
        L_0x0109:
            r3 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x010e:
            w.f r7 = r0.f12568h
            int r7 = r7.f12514g
            if (r1 == 0) goto L_0x0118
            w.f r7 = r0.f12569i
            int r7 = r7.f12514g
        L_0x0118:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r2) goto L_0x012f
            r10 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L_0x0128
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 + r10
            goto L_0x012f
        L_0x0128:
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 - r10
        L_0x012f:
            if (r15 <= 0) goto L_0x0227
            int r10 = r2 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r12 = 0
            r13 = 0
        L_0x013b:
            if (r12 >= r4) goto L_0x01d9
            java.util.ArrayList<w.p> r9 = r0.f12497k
            java.lang.Object r9 = r9.get(r12)
            w.p r9 = (w.p) r9
            r19 = r11
            v.e r11 = r9.f12562b
            int r11 = r11.T()
            r20 = r14
            r14 = 8
            if (r11 != r14) goto L_0x0155
            goto L_0x01bf
        L_0x0155:
            v.e$b r11 = r9.f12564d
            v.e$b r14 = v.e.b.MATCH_CONSTRAINT
            if (r11 != r14) goto L_0x01bf
            w.g r11 = r9.f12565e
            boolean r14 = r11.f12517j
            if (r14 != 0) goto L_0x01bf
            r14 = 0
            int r18 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r18 <= 0) goto L_0x0179
            v.e r14 = r9.f12562b
            float[] r14 = r14.D0
            r21 = r7
            int r7 = r0.f12566f
            r7 = r14[r7]
            float r7 = r7 * r10
            float r7 = r7 / r17
            r14 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r14
            int r7 = (int) r7
            goto L_0x017d
        L_0x0179:
            r21 = r7
            r7 = r19
        L_0x017d:
            int r14 = r0.f12566f
            if (r14 != 0) goto L_0x018c
            v.e r14 = r9.f12562b
            r22 = r10
            int r10 = r14.A
            int r14 = r14.f12193z
            r23 = r1
            goto L_0x019b
        L_0x018c:
            r22 = r10
            v.e r10 = r9.f12562b
            int r14 = r10.D
            int r10 = r10.C
            r23 = r1
            r25 = r14
            r14 = r10
            r10 = r25
        L_0x019b:
            int r1 = r9.f12561a
            r24 = r3
            r3 = 1
            if (r1 != r3) goto L_0x01a9
            int r1 = r11.f12529m
            int r1 = java.lang.Math.min(r7, r1)
            goto L_0x01aa
        L_0x01a9:
            r1 = r7
        L_0x01aa:
            int r1 = java.lang.Math.max(r14, r1)
            if (r10 <= 0) goto L_0x01b4
            int r1 = java.lang.Math.min(r10, r1)
        L_0x01b4:
            if (r1 == r7) goto L_0x01b9
            int r13 = r13 + 1
            r7 = r1
        L_0x01b9:
            w.g r1 = r9.f12565e
            r1.d(r7)
            goto L_0x01c7
        L_0x01bf:
            r23 = r1
            r24 = r3
            r21 = r7
            r22 = r10
        L_0x01c7:
            int r12 = r12 + 1
            r11 = r19
            r14 = r20
            r7 = r21
            r10 = r22
            r1 = r23
            r3 = r24
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x013b
        L_0x01d9:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            if (r13 <= 0) goto L_0x0218
            int r15 = r15 - r13
            r1 = 0
            r3 = 0
        L_0x01e6:
            if (r1 >= r4) goto L_0x0216
            java.util.ArrayList<w.p> r7 = r0.f12497k
            java.lang.Object r7 = r7.get(r1)
            w.p r7 = (w.p) r7
            v.e r9 = r7.f12562b
            int r9 = r9.T()
            r10 = 8
            if (r9 != r10) goto L_0x01fb
            goto L_0x0213
        L_0x01fb:
            if (r1 <= 0) goto L_0x0204
            if (r1 < r5) goto L_0x0204
            w.f r9 = r7.f12568h
            int r9 = r9.f12513f
            int r3 = r3 + r9
        L_0x0204:
            w.g r9 = r7.f12565e
            int r9 = r9.f12514g
            int r3 = r3 + r9
            if (r1 >= r8) goto L_0x0213
            if (r1 >= r6) goto L_0x0213
            w.f r7 = r7.f12569i
            int r7 = r7.f12513f
            int r7 = -r7
            int r3 = r3 + r7
        L_0x0213:
            int r1 = r1 + 1
            goto L_0x01e6
        L_0x0216:
            r14 = r3
            goto L_0x021a
        L_0x0218:
            r14 = r20
        L_0x021a:
            int r1 = r0.f12498l
            r3 = 2
            if (r1 != r3) goto L_0x0225
            if (r13 != 0) goto L_0x0225
            r1 = 0
            r0.f12498l = r1
            goto L_0x0231
        L_0x0225:
            r1 = 0
            goto L_0x0231
        L_0x0227:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            r1 = 0
            r3 = 2
        L_0x0231:
            if (r14 <= r2) goto L_0x0235
            r0.f12498l = r3
        L_0x0235:
            if (r24 <= 0) goto L_0x023d
            if (r15 != 0) goto L_0x023d
            if (r5 != r6) goto L_0x023d
            r0.f12498l = r3
        L_0x023d:
            int r3 = r0.f12498l
            r7 = 1
            if (r3 != r7) goto L_0x02e1
            r9 = r24
            if (r9 <= r7) goto L_0x024b
            int r2 = r2 - r14
            int r3 = r9 + -1
            int r2 = r2 / r3
            goto L_0x0252
        L_0x024b:
            if (r9 != r7) goto L_0x0251
            int r2 = r2 - r14
            r3 = 2
            int r2 = r2 / r3
            goto L_0x0252
        L_0x0251:
            r2 = 0
        L_0x0252:
            if (r15 <= 0) goto L_0x0255
            r2 = 0
        L_0x0255:
            r7 = r21
            r3 = 0
        L_0x0258:
            if (r3 >= r4) goto L_0x0429
            if (r23 == 0) goto L_0x0261
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x0262
        L_0x0261:
            r1 = r3
        L_0x0262:
            java.util.ArrayList<w.p> r9 = r0.f12497k
            java.lang.Object r1 = r9.get(r1)
            w.p r1 = (w.p) r1
            v.e r9 = r1.f12562b
            int r9 = r9.T()
            r10 = 8
            if (r9 != r10) goto L_0x027f
            w.f r9 = r1.f12568h
            r9.d(r7)
            w.f r1 = r1.f12569i
            r1.d(r7)
            goto L_0x02dd
        L_0x027f:
            if (r3 <= 0) goto L_0x0286
            if (r23 == 0) goto L_0x0285
            int r7 = r7 - r2
            goto L_0x0286
        L_0x0285:
            int r7 = r7 + r2
        L_0x0286:
            if (r3 <= 0) goto L_0x0297
            if (r3 < r5) goto L_0x0297
            if (r23 == 0) goto L_0x0292
            w.f r9 = r1.f12568h
            int r9 = r9.f12513f
            int r7 = r7 - r9
            goto L_0x0297
        L_0x0292:
            w.f r9 = r1.f12568h
            int r9 = r9.f12513f
            int r7 = r7 + r9
        L_0x0297:
            if (r23 == 0) goto L_0x029f
            w.f r9 = r1.f12569i
            r9.d(r7)
            goto L_0x02a4
        L_0x029f:
            w.f r9 = r1.f12568h
            r9.d(r7)
        L_0x02a4:
            w.g r9 = r1.f12565e
            int r10 = r9.f12514g
            v.e$b r11 = r1.f12564d
            v.e$b r12 = v.e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x02b5
            int r11 = r1.f12561a
            r12 = 1
            if (r11 != r12) goto L_0x02b5
            int r10 = r9.f12529m
        L_0x02b5:
            if (r23 == 0) goto L_0x02b9
            int r7 = r7 - r10
            goto L_0x02ba
        L_0x02b9:
            int r7 = r7 + r10
        L_0x02ba:
            if (r23 == 0) goto L_0x02c2
            w.f r9 = r1.f12568h
            r9.d(r7)
            goto L_0x02c7
        L_0x02c2:
            w.f r9 = r1.f12569i
            r9.d(r7)
        L_0x02c7:
            r9 = 1
            r1.f12567g = r9
            if (r3 >= r8) goto L_0x02dd
            if (r3 >= r6) goto L_0x02dd
            if (r23 == 0) goto L_0x02d7
            w.f r1 = r1.f12569i
            int r1 = r1.f12513f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x02dd
        L_0x02d7:
            w.f r1 = r1.f12569i
            int r1 = r1.f12513f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x02dd:
            int r3 = r3 + 1
            goto L_0x0258
        L_0x02e1:
            r9 = r24
            if (r3 != 0) goto L_0x0378
            int r2 = r2 - r14
            r3 = 1
            int r7 = r9 + 1
            int r2 = r2 / r7
            if (r15 <= 0) goto L_0x02ed
            r2 = 0
        L_0x02ed:
            r7 = r21
            r3 = 0
        L_0x02f0:
            if (r3 >= r4) goto L_0x0429
            if (r23 == 0) goto L_0x02f9
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x02fa
        L_0x02f9:
            r1 = r3
        L_0x02fa:
            java.util.ArrayList<w.p> r9 = r0.f12497k
            java.lang.Object r1 = r9.get(r1)
            w.p r1 = (w.p) r1
            v.e r9 = r1.f12562b
            int r9 = r9.T()
            r10 = 8
            if (r9 != r10) goto L_0x0317
            w.f r9 = r1.f12568h
            r9.d(r7)
            w.f r1 = r1.f12569i
            r1.d(r7)
            goto L_0x0374
        L_0x0317:
            if (r23 == 0) goto L_0x031b
            int r7 = r7 - r2
            goto L_0x031c
        L_0x031b:
            int r7 = r7 + r2
        L_0x031c:
            if (r3 <= 0) goto L_0x032d
            if (r3 < r5) goto L_0x032d
            if (r23 == 0) goto L_0x0328
            w.f r9 = r1.f12568h
            int r9 = r9.f12513f
            int r7 = r7 - r9
            goto L_0x032d
        L_0x0328:
            w.f r9 = r1.f12568h
            int r9 = r9.f12513f
            int r7 = r7 + r9
        L_0x032d:
            if (r23 == 0) goto L_0x0335
            w.f r9 = r1.f12569i
            r9.d(r7)
            goto L_0x033a
        L_0x0335:
            w.f r9 = r1.f12568h
            r9.d(r7)
        L_0x033a:
            w.g r9 = r1.f12565e
            int r10 = r9.f12514g
            v.e$b r11 = r1.f12564d
            v.e$b r12 = v.e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x034f
            int r11 = r1.f12561a
            r12 = 1
            if (r11 != r12) goto L_0x034f
            int r9 = r9.f12529m
            int r10 = java.lang.Math.min(r10, r9)
        L_0x034f:
            if (r23 == 0) goto L_0x0353
            int r7 = r7 - r10
            goto L_0x0354
        L_0x0353:
            int r7 = r7 + r10
        L_0x0354:
            if (r23 == 0) goto L_0x035c
            w.f r9 = r1.f12568h
            r9.d(r7)
            goto L_0x0361
        L_0x035c:
            w.f r9 = r1.f12569i
            r9.d(r7)
        L_0x0361:
            if (r3 >= r8) goto L_0x0374
            if (r3 >= r6) goto L_0x0374
            if (r23 == 0) goto L_0x036e
            w.f r1 = r1.f12569i
            int r1 = r1.f12513f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x0374
        L_0x036e:
            w.f r1 = r1.f12569i
            int r1 = r1.f12513f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x0374:
            int r3 = r3 + 1
            goto L_0x02f0
        L_0x0378:
            r7 = 2
            if (r3 != r7) goto L_0x0429
            int r3 = r0.f12566f
            if (r3 != 0) goto L_0x0386
            v.e r3 = r0.f12562b
            float r3 = r3.w()
            goto L_0x038c
        L_0x0386:
            v.e r3 = r0.f12562b
            float r3 = r3.P()
        L_0x038c:
            if (r23 == 0) goto L_0x0392
            r7 = 1065353216(0x3f800000, float:1.0)
            float r3 = r7 - r3
        L_0x0392:
            int r2 = r2 - r14
            float r2 = (float) r2
            float r2 = r2 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            if (r2 < 0) goto L_0x039e
            if (r15 <= 0) goto L_0x039f
        L_0x039e:
            r2 = 0
        L_0x039f:
            if (r23 == 0) goto L_0x03a4
            int r7 = r21 - r2
            goto L_0x03a6
        L_0x03a4:
            int r7 = r21 + r2
        L_0x03a6:
            r3 = 0
        L_0x03a7:
            if (r3 >= r4) goto L_0x0429
            if (r23 == 0) goto L_0x03b0
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x03b1
        L_0x03b0:
            r1 = r3
        L_0x03b1:
            java.util.ArrayList<w.p> r2 = r0.f12497k
            java.lang.Object r1 = r2.get(r1)
            w.p r1 = (w.p) r1
            v.e r2 = r1.f12562b
            int r2 = r2.T()
            r9 = 8
            if (r2 != r9) goto L_0x03cf
            w.f r2 = r1.f12568h
            r2.d(r7)
            w.f r1 = r1.f12569i
            r1.d(r7)
            r12 = 1
            goto L_0x0425
        L_0x03cf:
            if (r3 <= 0) goto L_0x03e0
            if (r3 < r5) goto L_0x03e0
            if (r23 == 0) goto L_0x03db
            w.f r2 = r1.f12568h
            int r2 = r2.f12513f
            int r7 = r7 - r2
            goto L_0x03e0
        L_0x03db:
            w.f r2 = r1.f12568h
            int r2 = r2.f12513f
            int r7 = r7 + r2
        L_0x03e0:
            if (r23 == 0) goto L_0x03e8
            w.f r2 = r1.f12569i
            r2.d(r7)
            goto L_0x03ed
        L_0x03e8:
            w.f r2 = r1.f12568h
            r2.d(r7)
        L_0x03ed:
            w.g r2 = r1.f12565e
            int r10 = r2.f12514g
            v.e$b r11 = r1.f12564d
            v.e$b r12 = v.e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x03ff
            int r11 = r1.f12561a
            r12 = 1
            if (r11 != r12) goto L_0x0400
            int r10 = r2.f12529m
            goto L_0x0400
        L_0x03ff:
            r12 = 1
        L_0x0400:
            if (r23 == 0) goto L_0x0404
            int r7 = r7 - r10
            goto L_0x0405
        L_0x0404:
            int r7 = r7 + r10
        L_0x0405:
            if (r23 == 0) goto L_0x040d
            w.f r2 = r1.f12568h
            r2.d(r7)
            goto L_0x0412
        L_0x040d:
            w.f r2 = r1.f12569i
            r2.d(r7)
        L_0x0412:
            if (r3 >= r8) goto L_0x0425
            if (r3 >= r6) goto L_0x0425
            if (r23 == 0) goto L_0x041f
            w.f r1 = r1.f12569i
            int r1 = r1.f12513f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x0425
        L_0x041f:
            w.f r1 = r1.f12569i
            int r1 = r1.f12513f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x0425:
            int r3 = r3 + 1
            goto L_0x03a7
        L_0x0429:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.c.a(w.d):void");
    }

    /* access modifiers changed from: package-private */
    public void d() {
        Iterator<p> it = this.f12497k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f12497k.size();
        if (size >= 1) {
            e eVar = this.f12497k.get(0).f12562b;
            e eVar2 = this.f12497k.get(size - 1).f12562b;
            if (this.f12566f == 0) {
                d dVar = eVar.O;
                d dVar2 = eVar2.Q;
                f i10 = i(dVar, 0);
                int e10 = dVar.e();
                e r10 = r();
                if (r10 != null) {
                    e10 = r10.O.e();
                }
                if (i10 != null) {
                    b(this.f12568h, i10, e10);
                }
                f i11 = i(dVar2, 0);
                int e11 = dVar2.e();
                e s10 = s();
                if (s10 != null) {
                    e11 = s10.Q.e();
                }
                if (i11 != null) {
                    b(this.f12569i, i11, -e11);
                }
            } else {
                d dVar3 = eVar.P;
                d dVar4 = eVar2.R;
                f i12 = i(dVar3, 1);
                int e12 = dVar3.e();
                e r11 = r();
                if (r11 != null) {
                    e12 = r11.P.e();
                }
                if (i12 != null) {
                    b(this.f12568h, i12, e12);
                }
                f i13 = i(dVar4, 1);
                int e13 = dVar4.e();
                e s11 = s();
                if (s11 != null) {
                    e13 = s11.R.e();
                }
                if (i13 != null) {
                    b(this.f12569i, i13, -e13);
                }
            }
            this.f12568h.f12508a = this;
            this.f12569i.f12508a = this;
        }
    }

    public void e() {
        for (int i10 = 0; i10 < this.f12497k.size(); i10++) {
            this.f12497k.get(i10).e();
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f12563c = null;
        Iterator<p> it = this.f12497k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    public long j() {
        int size = this.f12497k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = this.f12497k.get(i10);
            j10 = j10 + ((long) pVar.f12568h.f12513f) + pVar.j() + ((long) pVar.f12569i.f12513f);
        }
        return j10;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        int size = this.f12497k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f12497k.get(i10).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f12566f == 0 ? "horizontal : " : "vertical : ");
        Iterator<p> it = this.f12497k.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append(it.next());
            sb.append("> ");
        }
        return sb.toString();
    }
}
