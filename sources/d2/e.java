package d2;

import android.graphics.Bitmap;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d2.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: StandardGifDecoder */
public class e implements a {

    /* renamed from: u  reason: collision with root package name */
    private static final String f7923u = "e";

    /* renamed from: a  reason: collision with root package name */
    private int[] f7924a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f7925b;

    /* renamed from: c  reason: collision with root package name */
    private final a.C0122a f7926c;

    /* renamed from: d  reason: collision with root package name */
    private ByteBuffer f7927d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f7928e;

    /* renamed from: f  reason: collision with root package name */
    private short[] f7929f;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f7930g;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f7931h;

    /* renamed from: i  reason: collision with root package name */
    private byte[] f7932i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f7933j;

    /* renamed from: k  reason: collision with root package name */
    private int f7934k;

    /* renamed from: l  reason: collision with root package name */
    private c f7935l;

    /* renamed from: m  reason: collision with root package name */
    private Bitmap f7936m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f7937n;

    /* renamed from: o  reason: collision with root package name */
    private int f7938o;

    /* renamed from: p  reason: collision with root package name */
    private int f7939p;

    /* renamed from: q  reason: collision with root package name */
    private int f7940q;

    /* renamed from: r  reason: collision with root package name */
    private int f7941r;

    /* renamed from: s  reason: collision with root package name */
    private Boolean f7942s;

    /* renamed from: t  reason: collision with root package name */
    private Bitmap.Config f7943t;

    public e(a.C0122a aVar, c cVar, ByteBuffer byteBuffer, int i10) {
        this(aVar);
        q(cVar, byteBuffer, i10);
    }

    private int i(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f7939p + i10; i18++) {
            byte[] bArr = this.f7932i;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.f7924a[bArr[i18] & 255];
            if (i19 != 0) {
                i13 += (i19 >> 24) & 255;
                i14 += (i19 >> 16) & 255;
                i15 += (i19 >> 8) & 255;
                i16 += i19 & 255;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f7939p + i20; i21++) {
            byte[] bArr2 = this.f7932i;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.f7924a[bArr2[i21] & 255];
            if (i22 != 0) {
                i13 += (i22 >> 24) & 255;
                i14 += (i22 >> 16) & 255;
                i15 += (i22 >> 8) & 255;
                i16 += i22 & 255;
                i17++;
            }
        }
        if (i17 == 0) {
            return 0;
        }
        return ((i13 / i17) << 24) | ((i14 / i17) << 16) | ((i15 / i17) << 8) | (i16 / i17);
    }

    private void j(b bVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        b bVar2 = bVar;
        int[] iArr = this.f7933j;
        int i15 = bVar2.f7898d;
        int i16 = this.f7939p;
        int i17 = i15 / i16;
        int i18 = bVar2.f7896b / i16;
        int i19 = bVar2.f7897c / i16;
        int i20 = bVar2.f7895a / i16;
        boolean z11 = this.f7934k == 0;
        int i21 = this.f7941r;
        int i22 = this.f7940q;
        byte[] bArr = this.f7932i;
        int[] iArr2 = this.f7924a;
        Boolean bool = this.f7942s;
        int i23 = 8;
        int i24 = 0;
        int i25 = 0;
        int i26 = 1;
        while (i24 < i17) {
            Boolean bool2 = bool;
            if (bVar2.f7899e) {
                if (i25 >= i17) {
                    i10 = i17;
                    int i27 = i26 + 1;
                    if (i27 == 2) {
                        i26 = i27;
                        i25 = 4;
                    } else if (i27 == 3) {
                        i26 = i27;
                        i25 = 2;
                        i23 = 4;
                    } else if (i27 != 4) {
                        i26 = i27;
                    } else {
                        i26 = i27;
                        i25 = 1;
                        i23 = 2;
                    }
                } else {
                    i10 = i17;
                }
                i11 = i25 + i23;
            } else {
                i10 = i17;
                i11 = i25;
                i25 = i24;
            }
            int i28 = i25 + i18;
            boolean z12 = i16 == 1;
            if (i28 < i22) {
                int i29 = i28 * i21;
                int i30 = i29 + i20;
                int i31 = i30 + i19;
                int i32 = i29 + i21;
                if (i32 < i31) {
                    i31 = i32;
                }
                i12 = i11;
                int i33 = i24 * i16 * bVar2.f7897c;
                if (z12) {
                    int i34 = i30;
                    while (i34 < i31) {
                        int i35 = i18;
                        int i36 = iArr2[bArr[i33] & 255];
                        if (i36 != 0) {
                            iArr[i34] = i36;
                        } else if (z11 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i33 += i16;
                        i34++;
                        i18 = i35;
                    }
                } else {
                    i14 = i18;
                    int i37 = ((i31 - i30) * i16) + i33;
                    int i38 = i30;
                    while (true) {
                        i13 = i19;
                        if (i38 >= i31) {
                            break;
                        }
                        int i39 = i(i33, i37, bVar2.f7897c);
                        if (i39 != 0) {
                            iArr[i38] = i39;
                        } else if (z11 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i33 += i16;
                        i38++;
                        i19 = i13;
                    }
                    bool = bool2;
                    i24++;
                    i18 = i14;
                    i19 = i13;
                    i17 = i10;
                    i25 = i12;
                }
            } else {
                i12 = i11;
            }
            i14 = i18;
            i13 = i19;
            bool = bool2;
            i24++;
            i18 = i14;
            i19 = i13;
            i17 = i10;
            i25 = i12;
        }
        Boolean bool3 = bool;
        if (this.f7942s == null) {
            if (bool3 == null) {
                z10 = false;
            } else {
                z10 = bool3.booleanValue();
            }
            this.f7942s = Boolean.valueOf(z10);
        }
    }

    private void k(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f7933j;
        int i10 = bVar2.f7898d;
        int i11 = bVar2.f7896b;
        int i12 = bVar2.f7897c;
        int i13 = bVar2.f7895a;
        boolean z10 = this.f7934k == 0;
        int i14 = this.f7941r;
        byte[] bArr = this.f7932i;
        int[] iArr2 = this.f7924a;
        int i15 = 0;
        byte b10 = -1;
        while (i15 < i10) {
            int i16 = (i15 + i11) * i14;
            int i17 = i16 + i13;
            int i18 = i17 + i12;
            int i19 = i16 + i14;
            if (i19 < i18) {
                i18 = i19;
            }
            int i20 = bVar2.f7897c * i15;
            int i21 = i17;
            while (i21 < i18) {
                byte b11 = bArr[i20];
                int i22 = i10;
                byte b12 = b11 & 255;
                if (b12 != b10) {
                    int i23 = iArr2[b12];
                    if (i23 != 0) {
                        iArr[i21] = i23;
                    } else {
                        b10 = b11;
                    }
                }
                i20++;
                i21++;
                b bVar3 = bVar;
                i10 = i22;
            }
            int i24 = i10;
            i15++;
            bVar2 = bVar;
        }
        Boolean bool = this.f7942s;
        this.f7942s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f7942s == null && z10 && b10 != -1));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r7v13, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void l(d2.b r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            if (r1 == 0) goto L_0x000d
            java.nio.ByteBuffer r2 = r0.f7927d
            int r3 = r1.f7904j
            r2.position(r3)
        L_0x000d:
            if (r1 != 0) goto L_0x0016
            d2.c r1 = r0.f7935l
            int r2 = r1.f7911f
            int r1 = r1.f7912g
            goto L_0x001a
        L_0x0016:
            int r2 = r1.f7897c
            int r1 = r1.f7898d
        L_0x001a:
            int r2 = r2 * r1
            byte[] r1 = r0.f7932i
            if (r1 == 0) goto L_0x0023
            int r1 = r1.length
            if (r1 >= r2) goto L_0x002b
        L_0x0023:
            d2.a$a r1 = r0.f7926c
            byte[] r1 = r1.e(r2)
            r0.f7932i = r1
        L_0x002b:
            byte[] r1 = r0.f7932i
            short[] r3 = r0.f7929f
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x0037
            short[] r3 = new short[r4]
            r0.f7929f = r3
        L_0x0037:
            short[] r3 = r0.f7929f
            byte[] r5 = r0.f7930g
            if (r5 != 0) goto L_0x0041
            byte[] r5 = new byte[r4]
            r0.f7930g = r5
        L_0x0041:
            byte[] r5 = r0.f7930g
            byte[] r6 = r0.f7931h
            if (r6 != 0) goto L_0x004d
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.f7931h = r6
        L_0x004d:
            byte[] r6 = r0.f7931h
            int r7 = r28.p()
            r8 = 1
            int r9 = r8 << r7
            int r10 = r9 + 1
            int r11 = r9 + 2
            int r7 = r7 + r8
            int r12 = r8 << r7
            int r12 = r12 - r8
            r13 = 0
            r14 = 0
        L_0x0060:
            if (r14 >= r9) goto L_0x006a
            r3[r14] = r13
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L_0x0060
        L_0x006a:
            byte[] r14 = r0.f7928e
            r15 = -1
            r23 = r7
            r21 = r11
            r22 = r12
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r24 = -1
            r25 = 0
            r26 = 0
        L_0x0083:
            if (r13 >= r2) goto L_0x014c
            if (r16 != 0) goto L_0x0094
            int r16 = r28.o()
            if (r16 > 0) goto L_0x0092
            r3 = 3
            r0.f7938o = r3
            goto L_0x014c
        L_0x0092:
            r17 = 0
        L_0x0094:
            byte r4 = r14[r17]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r18
            int r19 = r19 + r4
            int r18 = r18 + 8
            int r17 = r17 + 1
            int r16 = r16 + -1
            r4 = r18
            r8 = r21
            r15 = r23
            r0 = r24
            r23 = r7
            r7 = r25
        L_0x00ae:
            if (r4 < r15) goto L_0x0136
            r24 = r11
            r11 = r19 & r22
            int r19 = r19 >> r15
            int r4 = r4 - r15
            if (r11 != r9) goto L_0x00c2
            r22 = r12
            r15 = r23
            r8 = r24
            r11 = r8
            r0 = -1
            goto L_0x00ae
        L_0x00c2:
            if (r11 != r10) goto L_0x00d9
            r18 = r4
            r25 = r7
            r21 = r8
            r7 = r23
            r11 = r24
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r24 = r0
            r23 = r15
            r15 = -1
            r0 = r28
            goto L_0x0083
        L_0x00d9:
            r25 = r4
            r4 = -1
            if (r0 != r4) goto L_0x00ed
            byte r0 = r5[r11]
            r1[r20] = r0
            int r20 = r20 + 1
            int r13 = r13 + 1
            r0 = r11
            r7 = r0
            r11 = r24
            r4 = r25
            goto L_0x00ae
        L_0x00ed:
            if (r11 < r8) goto L_0x00f6
            byte r7 = (byte) r7
            r6[r26] = r7
            int r26 = r26 + 1
            r7 = r0
            goto L_0x00f7
        L_0x00f6:
            r7 = r11
        L_0x00f7:
            if (r7 < r9) goto L_0x0102
            byte r21 = r5[r7]
            r6[r26] = r21
            int r26 = r26 + 1
            short r7 = r3[r7]
            goto L_0x00f7
        L_0x0102:
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r7
            r1[r20] = r4
        L_0x0109:
            int r20 = r20 + 1
            int r13 = r13 + 1
            if (r26 <= 0) goto L_0x0116
            int r26 = r26 + -1
            byte r27 = r6[r26]
            r1[r20] = r27
            goto L_0x0109
        L_0x0116:
            r27 = r6
            r6 = 4096(0x1000, float:5.74E-42)
            if (r8 >= r6) goto L_0x012d
            short r0 = (short) r0
            r3[r8] = r0
            r5[r8] = r4
            int r8 = r8 + 1
            r0 = r8 & r22
            if (r0 != 0) goto L_0x012d
            if (r8 >= r6) goto L_0x012d
            int r15 = r15 + 1
            int r22 = r22 + r8
        L_0x012d:
            r0 = r11
            r11 = r24
            r4 = r25
            r6 = r27
            goto L_0x00ae
        L_0x0136:
            r25 = r4
            r24 = r0
            r21 = r8
            r18 = r25
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r0 = r28
            r25 = r7
            r7 = r23
            r23 = r15
            r15 = -1
            goto L_0x0083
        L_0x014c:
            r13 = r20
            r0 = 0
            java.util.Arrays.fill(r1, r13, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.e.l(d2.b):void");
    }

    private Bitmap n() {
        Boolean bool = this.f7942s;
        Bitmap a10 = this.f7926c.a(this.f7941r, this.f7940q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f7943t);
        a10.setHasAlpha(true);
        return a10;
    }

    private int o() {
        int p10 = p();
        if (p10 <= 0) {
            return p10;
        }
        ByteBuffer byteBuffer = this.f7927d;
        byteBuffer.get(this.f7928e, 0, Math.min(p10, byteBuffer.remaining()));
        return p10;
    }

    private int p() {
        return this.f7927d.get() & 255;
    }

    private Bitmap r(b bVar, b bVar2) {
        int i10;
        int i11;
        Bitmap bitmap;
        int[] iArr = this.f7933j;
        int i12 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f7936m;
            if (bitmap2 != null) {
                this.f7926c.c(bitmap2);
            }
            this.f7936m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f7901g == 3 && this.f7936m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i11 = bVar2.f7901g) > 0) {
            if (i11 == 2) {
                if (!bVar.f7900f) {
                    c cVar = this.f7935l;
                    int i13 = cVar.f7917l;
                    if (bVar.f7905k == null || cVar.f7915j != bVar.f7902h) {
                        i12 = i13;
                    }
                }
                int i14 = bVar2.f7898d;
                int i15 = this.f7939p;
                int i16 = i14 / i15;
                int i17 = bVar2.f7896b / i15;
                int i18 = bVar2.f7897c / i15;
                int i19 = bVar2.f7895a / i15;
                int i20 = this.f7941r;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f7941r;
                }
            } else if (i11 == 3 && (bitmap = this.f7936m) != null) {
                int i25 = this.f7941r;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f7940q);
            }
        }
        l(bVar);
        if (bVar.f7899e || this.f7939p != 1) {
            j(bVar);
        } else {
            k(bVar);
        }
        if (this.f7937n && ((i10 = bVar.f7901g) == 0 || i10 == 1)) {
            if (this.f7936m == null) {
                this.f7936m = n();
            }
            Bitmap bitmap3 = this.f7936m;
            int i26 = this.f7941r;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f7940q);
        }
        Bitmap n10 = n();
        int i27 = this.f7941r;
        n10.setPixels(iArr, 0, i27, 0, 0, i27, this.f7940q);
        return n10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ce, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap a() {
        /*
            r8 = this;
            monitor-enter(r8)
            d2.c r0 = r8.f7935l     // Catch:{ all -> 0x00cf }
            int r0 = r0.f7908c     // Catch:{ all -> 0x00cf }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r8.f7934k     // Catch:{ all -> 0x00cf }
            if (r0 >= 0) goto L_0x0032
        L_0x000d:
            java.lang.String r0 = f7923u     // Catch:{ all -> 0x00cf }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x0030
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            r0.<init>()     // Catch:{ all -> 0x00cf }
            java.lang.String r3 = "Unable to decode frame, frameCount="
            r0.append(r3)     // Catch:{ all -> 0x00cf }
            d2.c r3 = r8.f7935l     // Catch:{ all -> 0x00cf }
            int r3 = r3.f7908c     // Catch:{ all -> 0x00cf }
            r0.append(r3)     // Catch:{ all -> 0x00cf }
            java.lang.String r3 = ", framePointer="
            r0.append(r3)     // Catch:{ all -> 0x00cf }
            int r3 = r8.f7934k     // Catch:{ all -> 0x00cf }
            r0.append(r3)     // Catch:{ all -> 0x00cf }
        L_0x0030:
            r8.f7938o = r2     // Catch:{ all -> 0x00cf }
        L_0x0032:
            int r0 = r8.f7938o     // Catch:{ all -> 0x00cf }
            r3 = 0
            if (r0 == r2) goto L_0x00b6
            r4 = 2
            if (r0 != r4) goto L_0x003c
            goto L_0x00b6
        L_0x003c:
            r0 = 0
            r8.f7938o = r0     // Catch:{ all -> 0x00cf }
            byte[] r5 = r8.f7928e     // Catch:{ all -> 0x00cf }
            if (r5 != 0) goto L_0x004d
            d2.a$a r5 = r8.f7926c     // Catch:{ all -> 0x00cf }
            r6 = 255(0xff, float:3.57E-43)
            byte[] r5 = r5.e(r6)     // Catch:{ all -> 0x00cf }
            r8.f7928e = r5     // Catch:{ all -> 0x00cf }
        L_0x004d:
            d2.c r5 = r8.f7935l     // Catch:{ all -> 0x00cf }
            java.util.List<d2.b> r5 = r5.f7910e     // Catch:{ all -> 0x00cf }
            int r6 = r8.f7934k     // Catch:{ all -> 0x00cf }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00cf }
            d2.b r5 = (d2.b) r5     // Catch:{ all -> 0x00cf }
            int r6 = r8.f7934k     // Catch:{ all -> 0x00cf }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x0069
            d2.c r7 = r8.f7935l     // Catch:{ all -> 0x00cf }
            java.util.List<d2.b> r7 = r7.f7910e     // Catch:{ all -> 0x00cf }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x00cf }
            d2.b r6 = (d2.b) r6     // Catch:{ all -> 0x00cf }
            goto L_0x006a
        L_0x0069:
            r6 = r3
        L_0x006a:
            int[] r7 = r5.f7905k     // Catch:{ all -> 0x00cf }
            if (r7 == 0) goto L_0x006f
            goto L_0x0073
        L_0x006f:
            d2.c r7 = r8.f7935l     // Catch:{ all -> 0x00cf }
            int[] r7 = r7.f7906a     // Catch:{ all -> 0x00cf }
        L_0x0073:
            r8.f7924a = r7     // Catch:{ all -> 0x00cf }
            if (r7 != 0) goto L_0x0092
            java.lang.String r0 = f7923u     // Catch:{ all -> 0x00cf }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x008e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            r0.<init>()     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "No valid color table found for frame #"
            r0.append(r1)     // Catch:{ all -> 0x00cf }
            int r1 = r8.f7934k     // Catch:{ all -> 0x00cf }
            r0.append(r1)     // Catch:{ all -> 0x00cf }
        L_0x008e:
            r8.f7938o = r2     // Catch:{ all -> 0x00cf }
            monitor-exit(r8)
            return r3
        L_0x0092:
            boolean r1 = r5.f7900f     // Catch:{ all -> 0x00cf }
            if (r1 == 0) goto L_0x00b0
            int[] r1 = r8.f7925b     // Catch:{ all -> 0x00cf }
            int r2 = r7.length     // Catch:{ all -> 0x00cf }
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch:{ all -> 0x00cf }
            int[] r1 = r8.f7925b     // Catch:{ all -> 0x00cf }
            r8.f7924a = r1     // Catch:{ all -> 0x00cf }
            int r2 = r5.f7902h     // Catch:{ all -> 0x00cf }
            r1[r2] = r0     // Catch:{ all -> 0x00cf }
            int r0 = r5.f7901g     // Catch:{ all -> 0x00cf }
            if (r0 != r4) goto L_0x00b0
            int r0 = r8.f7934k     // Catch:{ all -> 0x00cf }
            if (r0 != 0) goto L_0x00b0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00cf }
            r8.f7942s = r0     // Catch:{ all -> 0x00cf }
        L_0x00b0:
            android.graphics.Bitmap r0 = r8.r(r5, r6)     // Catch:{ all -> 0x00cf }
            monitor-exit(r8)
            return r0
        L_0x00b6:
            java.lang.String r0 = f7923u     // Catch:{ all -> 0x00cf }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x00cd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            r0.<init>()     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "Unable to decode frame, status="
            r0.append(r1)     // Catch:{ all -> 0x00cf }
            int r1 = r8.f7938o     // Catch:{ all -> 0x00cf }
            r0.append(r1)     // Catch:{ all -> 0x00cf }
        L_0x00cd:
            monitor-exit(r8)
            return r3
        L_0x00cf:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.e.a():android.graphics.Bitmap");
    }

    public void b() {
        this.f7934k = (this.f7934k + 1) % this.f7935l.f7908c;
    }

    public int c() {
        return this.f7935l.f7908c;
    }

    public void clear() {
        this.f7935l = null;
        byte[] bArr = this.f7932i;
        if (bArr != null) {
            this.f7926c.d(bArr);
        }
        int[] iArr = this.f7933j;
        if (iArr != null) {
            this.f7926c.f(iArr);
        }
        Bitmap bitmap = this.f7936m;
        if (bitmap != null) {
            this.f7926c.c(bitmap);
        }
        this.f7936m = null;
        this.f7927d = null;
        this.f7942s = null;
        byte[] bArr2 = this.f7928e;
        if (bArr2 != null) {
            this.f7926c.d(bArr2);
        }
    }

    public int d() {
        int i10;
        if (this.f7935l.f7908c <= 0 || (i10 = this.f7934k) < 0) {
            return 0;
        }
        return m(i10);
    }

    public void e(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f7943t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    public void f() {
        this.f7934k = -1;
    }

    public int g() {
        return this.f7934k;
    }

    public ByteBuffer getData() {
        return this.f7927d;
    }

    public int h() {
        return this.f7927d.limit() + this.f7932i.length + (this.f7933j.length * 4);
    }

    public int m(int i10) {
        if (i10 >= 0) {
            c cVar = this.f7935l;
            if (i10 < cVar.f7908c) {
                return cVar.f7910e.get(i10).f7903i;
            }
        }
        return -1;
    }

    public synchronized void q(c cVar, ByteBuffer byteBuffer, int i10) {
        if (i10 > 0) {
            int highestOneBit = Integer.highestOneBit(i10);
            this.f7938o = 0;
            this.f7935l = cVar;
            this.f7934k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f7927d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f7927d.order(ByteOrder.LITTLE_ENDIAN);
            this.f7937n = false;
            Iterator<b> it = cVar.f7910e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f7901g == 3) {
                        this.f7937n = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f7939p = highestOneBit;
            int i11 = cVar.f7911f;
            this.f7941r = i11 / highestOneBit;
            int i12 = cVar.f7912g;
            this.f7940q = i12 / highestOneBit;
            this.f7932i = this.f7926c.e(i11 * i12);
            this.f7933j = this.f7926c.b(this.f7941r * this.f7940q);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
        }
    }

    public e(a.C0122a aVar) {
        this.f7925b = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        this.f7943t = Bitmap.Config.ARGB_8888;
        this.f7926c = aVar;
        this.f7935l = new c();
    }
}
