package q5;

import a6.m0;
import a6.p;
import a6.x;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o5.a;

/* compiled from: DvbParser */
final class b {

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f10724h = {0, 7, 8, 15};

    /* renamed from: i  reason: collision with root package name */
    private static final byte[] f10725i = {0, 119, -120, -1};

    /* renamed from: j  reason: collision with root package name */
    private static final byte[] f10726j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a  reason: collision with root package name */
    private final Paint f10727a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f10728b;

    /* renamed from: c  reason: collision with root package name */
    private final Canvas f10729c = new Canvas();

    /* renamed from: d  reason: collision with root package name */
    private final C0186b f10730d = new C0186b(719, 575, 0, 719, 0, 575);

    /* renamed from: e  reason: collision with root package name */
    private final a f10731e = new a(0, c(), d(), e());

    /* renamed from: f  reason: collision with root package name */
    private final h f10732f;

    /* renamed from: g  reason: collision with root package name */
    private Bitmap f10733g;

    /* compiled from: DvbParser */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f10734a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f10735b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f10736c;

        /* renamed from: d  reason: collision with root package name */
        public final int[] f10737d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f10734a = i10;
            this.f10735b = iArr;
            this.f10736c = iArr2;
            this.f10737d = iArr3;
        }
    }

    /* renamed from: q5.b$b  reason: collision with other inner class name */
    /* compiled from: DvbParser */
    private static final class C0186b {

        /* renamed from: a  reason: collision with root package name */
        public final int f10738a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10739b;

        /* renamed from: c  reason: collision with root package name */
        public final int f10740c;

        /* renamed from: d  reason: collision with root package name */
        public final int f10741d;

        /* renamed from: e  reason: collision with root package name */
        public final int f10742e;

        /* renamed from: f  reason: collision with root package name */
        public final int f10743f;

        public C0186b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f10738a = i10;
            this.f10739b = i11;
            this.f10740c = i12;
            this.f10741d = i13;
            this.f10742e = i14;
            this.f10743f = i15;
        }
    }

    /* compiled from: DvbParser */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f10744a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f10745b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f10746c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f10747d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f10744a = i10;
            this.f10745b = z10;
            this.f10746c = bArr;
            this.f10747d = bArr2;
        }
    }

    /* compiled from: DvbParser */
    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f10748a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10749b;

        /* renamed from: c  reason: collision with root package name */
        public final int f10750c;

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray<e> f10751d;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f10748a = i10;
            this.f10749b = i11;
            this.f10750c = i12;
            this.f10751d = sparseArray;
        }
    }

    /* compiled from: DvbParser */
    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f10752a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10753b;

        public e(int i10, int i11) {
            this.f10752a = i10;
            this.f10753b = i11;
        }
    }

    /* compiled from: DvbParser */
    private static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f10754a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f10755b;

        /* renamed from: c  reason: collision with root package name */
        public final int f10756c;

        /* renamed from: d  reason: collision with root package name */
        public final int f10757d;

        /* renamed from: e  reason: collision with root package name */
        public final int f10758e;

        /* renamed from: f  reason: collision with root package name */
        public final int f10759f;

        /* renamed from: g  reason: collision with root package name */
        public final int f10760g;

        /* renamed from: h  reason: collision with root package name */
        public final int f10761h;

        /* renamed from: i  reason: collision with root package name */
        public final int f10762i;

        /* renamed from: j  reason: collision with root package name */
        public final int f10763j;

        /* renamed from: k  reason: collision with root package name */
        public final SparseArray<g> f10764k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f10754a = i10;
            this.f10755b = z10;
            this.f10756c = i11;
            this.f10757d = i12;
            this.f10758e = i13;
            this.f10759f = i14;
            this.f10760g = i15;
            this.f10761h = i16;
            this.f10762i = i17;
            this.f10763j = i18;
            this.f10764k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.f10764k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f10764k.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
            }
        }
    }

    /* compiled from: DvbParser */
    private static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final int f10765a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10766b;

        /* renamed from: c  reason: collision with root package name */
        public final int f10767c;

        /* renamed from: d  reason: collision with root package name */
        public final int f10768d;

        /* renamed from: e  reason: collision with root package name */
        public final int f10769e;

        /* renamed from: f  reason: collision with root package name */
        public final int f10770f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f10765a = i10;
            this.f10766b = i11;
            this.f10767c = i12;
            this.f10768d = i13;
            this.f10769e = i14;
            this.f10770f = i15;
        }
    }

    /* compiled from: DvbParser */
    private static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final int f10771a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10772b;

        /* renamed from: c  reason: collision with root package name */
        public final SparseArray<f> f10773c = new SparseArray<>();

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray<a> f10774d = new SparseArray<>();

        /* renamed from: e  reason: collision with root package name */
        public final SparseArray<c> f10775e = new SparseArray<>();

        /* renamed from: f  reason: collision with root package name */
        public final SparseArray<a> f10776f = new SparseArray<>();

        /* renamed from: g  reason: collision with root package name */
        public final SparseArray<c> f10777g = new SparseArray<>();

        /* renamed from: h  reason: collision with root package name */
        public C0186b f10778h;

        /* renamed from: i  reason: collision with root package name */
        public d f10779i;

        public h(int i10, int i11) {
            this.f10771a = i10;
            this.f10772b = i11;
        }

        public void a() {
            this.f10773c.clear();
            this.f10774d.clear();
            this.f10775e.clear();
            this.f10776f.clear();
            this.f10777g.clear();
            this.f10778h = null;
            this.f10779i = null;
        }
    }

    public b(int i10, int i11) {
        Paint paint = new Paint();
        this.f10727a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.f10728b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect((PathEffect) null);
        this.f10732f = new h(i10, i11);
    }

    private static byte[] a(int i10, int i11, x xVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) xVar.h(i11);
        }
        return bArr;
    }

    private static int[] c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                int i11 = 127;
                int i12 = (i10 & 1) != 0 ? 127 : 0;
                int i13 = (i10 & 2) != 0 ? 127 : 0;
                if ((i10 & 4) == 0) {
                    i11 = 0;
                }
                iArr[i10] = f(255, i12, i13, i11);
            }
        }
        return iArr;
    }

    private static int[] e() {
        int[] iArr = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = 255;
            if (i10 < 8) {
                int i12 = (i10 & 1) != 0 ? 255 : 0;
                int i13 = (i10 & 2) != 0 ? 255 : 0;
                if ((i10 & 4) == 0) {
                    i11 = 0;
                }
                iArr[i10] = f(63, i12, i13, i11);
            } else {
                int i14 = i10 & 136;
                int i15 = 170;
                int i16 = 85;
                if (i14 == 0) {
                    int i17 = ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0);
                    int i18 = ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0);
                    if ((i10 & 4) == 0) {
                        i16 = 0;
                    }
                    if ((i10 & 64) == 0) {
                        i15 = 0;
                    }
                    iArr[i10] = f(255, i17, i18, i16 + i15);
                } else if (i14 != 8) {
                    int i19 = 43;
                    if (i14 == 128) {
                        int i20 = ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0);
                        int i21 = ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0);
                        if ((i10 & 4) == 0) {
                            i19 = 0;
                        }
                        int i22 = i19 + 127;
                        if ((i10 & 64) == 0) {
                            i16 = 0;
                        }
                        iArr[i10] = f(255, i20, i21, i22 + i16);
                    } else if (i14 == 136) {
                        int i23 = ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0);
                        int i24 = ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0);
                        if ((i10 & 4) == 0) {
                            i19 = 0;
                        }
                        if ((i10 & 64) == 0) {
                            i16 = 0;
                        }
                        iArr[i10] = f(255, i23, i24, i19 + i16);
                    }
                } else {
                    int i25 = ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0);
                    int i26 = ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0);
                    if ((i10 & 4) == 0) {
                        i16 = 0;
                    }
                    if ((i10 & 64) == 0) {
                        i15 = 0;
                    }
                    iArr[i10] = f(127, i25, i26, i16 + i15);
                }
            }
        }
        return iArr;
    }

    private static int f(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0083 A[LOOP:0: B:1:0x0009->B:31:0x0083, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int g(a6.x r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 2
            int r4 = r13.h(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0014
            r11 = r2
        L_0x0012:
            r12 = 1
            goto L_0x0061
        L_0x0014:
            boolean r4 = r13.g()
            r6 = 3
            if (r4 == 0) goto L_0x0028
            int r4 = r13.h(r6)
            int r4 = r4 + r6
            int r3 = r13.h(r3)
        L_0x0024:
            r11 = r2
            r12 = r4
            r4 = r3
            goto L_0x0061
        L_0x0028:
            boolean r4 = r13.g()
            if (r4 == 0) goto L_0x0031
            r11 = r2
            r4 = 0
            goto L_0x0012
        L_0x0031:
            int r4 = r13.h(r3)
            if (r4 == 0) goto L_0x005e
            if (r4 == r5) goto L_0x005a
            if (r4 == r3) goto L_0x004e
            if (r4 == r6) goto L_0x0041
            r11 = r2
            r4 = 0
        L_0x003f:
            r12 = 0
            goto L_0x0061
        L_0x0041:
            r4 = 8
            int r4 = r13.h(r4)
            int r4 = r4 + 29
            int r3 = r13.h(r3)
            goto L_0x0024
        L_0x004e:
            r4 = 4
            int r4 = r13.h(r4)
            int r4 = r4 + 12
            int r3 = r13.h(r3)
            goto L_0x0024
        L_0x005a:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L_0x0061
        L_0x005e:
            r4 = 0
            r11 = 1
            goto L_0x003f
        L_0x0061:
            if (r12 == 0) goto L_0x007f
            if (r8 == 0) goto L_0x007f
            if (r15 == 0) goto L_0x0069
            byte r4 = r15[r4]
        L_0x0069:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x007f:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0083
            return r10
        L_0x0083:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.b.g(a6.x, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e A[LOOP:0: B:1:0x0009->B:34:0x008e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int h(a6.x r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 4
            int r4 = r13.h(r3)
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0016
            r11 = r2
        L_0x0013:
            r12 = 1
            goto L_0x006e
        L_0x0016:
            boolean r4 = r13.g()
            r7 = 3
            if (r4 != 0) goto L_0x002c
            int r3 = r13.h(r7)
            if (r3 == 0) goto L_0x0029
            int r5 = r3 + 2
            r11 = r2
            r12 = r5
            r4 = 0
            goto L_0x006e
        L_0x0029:
            r4 = 0
            r11 = 1
            goto L_0x004d
        L_0x002c:
            boolean r4 = r13.g()
            if (r4 != 0) goto L_0x003f
            int r4 = r13.h(r5)
            int r5 = r4 + 4
            int r4 = r13.h(r3)
        L_0x003c:
            r11 = r2
            r12 = r5
            goto L_0x006e
        L_0x003f:
            int r4 = r13.h(r5)
            if (r4 == 0) goto L_0x006b
            if (r4 == r6) goto L_0x0067
            if (r4 == r5) goto L_0x005c
            if (r4 == r7) goto L_0x004f
            r11 = r2
            r4 = 0
        L_0x004d:
            r12 = 0
            goto L_0x006e
        L_0x004f:
            r4 = 8
            int r4 = r13.h(r4)
            int r5 = r4 + 25
            int r4 = r13.h(r3)
            goto L_0x003c
        L_0x005c:
            int r4 = r13.h(r3)
            int r5 = r4 + 9
            int r4 = r13.h(r3)
            goto L_0x003c
        L_0x0067:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L_0x006e
        L_0x006b:
            r11 = r2
            r4 = 0
            goto L_0x0013
        L_0x006e:
            if (r12 == 0) goto L_0x008a
            if (r8 == 0) goto L_0x008a
            if (r15 == 0) goto L_0x0076
            byte r4 = r15[r4]
        L_0x0076:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r5 = (float) r2
            int r2 = r1 + 1
            float r6 = (float) r2
            r2 = r19
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x008a:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x008e
            return r10
        L_0x008e:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.b.h(a6.x, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int i(a6.x r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 8
            int r4 = r13.h(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0015
            r11 = r2
            r12 = 1
            goto L_0x0035
        L_0x0015:
            boolean r4 = r13.g()
            r6 = 7
            if (r4 != 0) goto L_0x002a
            int r3 = r13.h(r6)
            if (r3 == 0) goto L_0x0026
            r11 = r2
            r12 = r3
            r4 = 0
            goto L_0x0035
        L_0x0026:
            r4 = 0
            r11 = 1
            r12 = 0
            goto L_0x0035
        L_0x002a:
            int r4 = r13.h(r6)
            int r3 = r13.h(r3)
            r11 = r2
            r12 = r4
            r4 = r3
        L_0x0035:
            if (r12 == 0) goto L_0x0053
            if (r8 == 0) goto L_0x0053
            if (r15 == 0) goto L_0x003d
            byte r4 = r15[r4]
        L_0x003d:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0053:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0057
            return r10
        L_0x0057:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.b.i(a6.x, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    private static void j(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        int i13 = i10;
        byte[] bArr5 = bArr;
        x xVar = new x(bArr);
        int i14 = i11;
        int i15 = i12;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        byte[] bArr8 = null;
        while (xVar.b() != 0) {
            int h10 = xVar.h(8);
            if (h10 != 240) {
                switch (h10) {
                    case 16:
                        if (i13 != 3) {
                            if (i13 != 2) {
                                bArr2 = null;
                                i14 = g(xVar, iArr, bArr2, i14, i15, paint, canvas);
                                xVar.c();
                                break;
                            } else {
                                bArr3 = bArr8 == null ? f10724h : bArr8;
                            }
                        } else {
                            bArr3 = bArr6 == null ? f10725i : bArr6;
                        }
                        bArr2 = bArr3;
                        i14 = g(xVar, iArr, bArr2, i14, i15, paint, canvas);
                        xVar.c();
                    case 17:
                        if (i13 == 3) {
                            bArr4 = bArr7 == null ? f10726j : bArr7;
                        } else {
                            bArr4 = null;
                        }
                        i14 = h(xVar, iArr, bArr4, i14, i15, paint, canvas);
                        xVar.c();
                        break;
                    case 18:
                        i14 = i(xVar, iArr, (byte[]) null, i14, i15, paint, canvas);
                        break;
                    default:
                        switch (h10) {
                            case 32:
                                bArr8 = a(4, 4, xVar);
                                break;
                            case 33:
                                bArr6 = a(4, 8, xVar);
                                break;
                            case 34:
                                bArr7 = a(16, 8, xVar);
                                break;
                        }
                }
            } else {
                i15 += 2;
                i14 = i11;
            }
        }
    }

    private static void k(c cVar, a aVar, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i10 == 3) {
            iArr = aVar.f10737d;
        } else if (i10 == 2) {
            iArr = aVar.f10736c;
        } else {
            iArr = aVar.f10735b;
        }
        int[] iArr2 = iArr;
        int i13 = i10;
        int i14 = i11;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        j(cVar.f10746c, iArr2, i13, i14, i12, paint2, canvas2);
        j(cVar.f10747d, iArr2, i13, i14, i12 + 1, paint2, canvas2);
    }

    private static a l(x xVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        x xVar2 = xVar;
        int i16 = 8;
        int h10 = xVar2.h(8);
        xVar2.r(8);
        int i17 = 2;
        int i18 = i10 - 2;
        int[] c10 = c();
        int[] d10 = d();
        int[] e10 = e();
        while (i18 > 0) {
            int h11 = xVar2.h(i16);
            int h12 = xVar2.h(i16);
            int i19 = i18 - 2;
            int[] iArr = (h12 & 128) != 0 ? c10 : (h12 & 64) != 0 ? d10 : e10;
            if ((h12 & 1) != 0) {
                i14 = xVar2.h(i16);
                i13 = xVar2.h(i16);
                i12 = xVar2.h(i16);
                i11 = xVar2.h(i16);
                i15 = i19 - 4;
            } else {
                i12 = xVar2.h(4) << 4;
                i15 = i19 - 2;
                int h13 = xVar2.h(4) << 4;
                i11 = xVar2.h(i17) << 6;
                i14 = xVar2.h(6) << i17;
                i13 = h13;
            }
            if (i14 == 0) {
                i13 = 0;
                i12 = 0;
                i11 = 255;
            }
            double d11 = (double) i14;
            double d12 = (double) (i13 - 128);
            double d13 = (double) (i12 - 128);
            iArr[h11] = f((byte) (255 - (i11 & 255)), m0.r((int) (d11 + (1.402d * d12)), 0, 255), m0.r((int) ((d11 - (0.34414d * d13)) - (d12 * 0.71414d)), 0, 255), m0.r((int) (d11 + (d13 * 1.772d)), 0, 255));
            i18 = i15;
            h10 = h10;
            i16 = 8;
            i17 = 2;
        }
        return new a(h10, c10, d10, e10);
    }

    private static C0186b m(x xVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        xVar.r(4);
        boolean g10 = xVar.g();
        xVar.r(3);
        int h10 = xVar.h(16);
        int h11 = xVar.h(16);
        if (g10) {
            int h12 = xVar.h(16);
            int h13 = xVar.h(16);
            int h14 = xVar.h(16);
            i10 = xVar.h(16);
            i12 = h13;
            i11 = h14;
            i13 = h12;
        } else {
            i12 = h10;
            i10 = h11;
            i13 = 0;
            i11 = 0;
        }
        return new C0186b(h10, h11, i13, i12, i11, i10);
    }

    private static c n(x xVar) {
        byte[] bArr;
        int h10 = xVar.h(16);
        xVar.r(4);
        int h11 = xVar.h(2);
        boolean g10 = xVar.g();
        xVar.r(1);
        byte[] bArr2 = m0.f210f;
        if (h11 == 1) {
            xVar.r(xVar.h(8) * 16);
        } else if (h11 == 0) {
            int h12 = xVar.h(16);
            int h13 = xVar.h(16);
            if (h12 > 0) {
                bArr2 = new byte[h12];
                xVar.k(bArr2, 0, h12);
            }
            if (h13 > 0) {
                bArr = new byte[h13];
                xVar.k(bArr, 0, h13);
                return new c(h10, g10, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(h10, g10, bArr2, bArr);
    }

    private static d o(x xVar, int i10) {
        int h10 = xVar.h(8);
        int h11 = xVar.h(4);
        int h12 = xVar.h(2);
        xVar.r(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int h13 = xVar.h(8);
            xVar.r(8);
            i11 -= 6;
            sparseArray.put(h13, new e(xVar.h(16), xVar.h(16)));
        }
        return new d(h10, h11, h12, sparseArray);
    }

    private static f p(x xVar, int i10) {
        int i11;
        int i12;
        x xVar2 = xVar;
        int h10 = xVar2.h(8);
        xVar2.r(4);
        boolean g10 = xVar.g();
        xVar2.r(3);
        int i13 = 16;
        int h11 = xVar2.h(16);
        int h12 = xVar2.h(16);
        int h13 = xVar2.h(3);
        int h14 = xVar2.h(3);
        int i14 = 2;
        xVar2.r(2);
        int h15 = xVar2.h(8);
        int h16 = xVar2.h(8);
        int h17 = xVar2.h(4);
        int h18 = xVar2.h(2);
        xVar2.r(2);
        int i15 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i15 > 0) {
            int h19 = xVar2.h(i13);
            int h20 = xVar2.h(i14);
            int h21 = xVar2.h(i14);
            int h22 = xVar2.h(12);
            int i16 = h18;
            xVar2.r(4);
            int h23 = xVar2.h(12);
            i15 -= 6;
            if (h20 == 1 || h20 == 2) {
                i15 -= 2;
                i12 = xVar2.h(8);
                i11 = xVar2.h(8);
            } else {
                i12 = 0;
                i11 = 0;
            }
            sparseArray.put(h19, new g(h20, h21, h22, h23, i12, i11));
            h18 = i16;
            i14 = 2;
            i13 = 16;
        }
        return new f(h10, g10, h11, h12, h13, h14, h15, h16, h17, h18, sparseArray);
    }

    private static void q(x xVar, h hVar) {
        f fVar;
        int h10 = xVar.h(8);
        int h11 = xVar.h(16);
        int h12 = xVar.h(16);
        int d10 = xVar.d() + h12;
        if (h12 * 8 > xVar.b()) {
            p.h("DvbParser", "Data field length exceeds limit");
            xVar.r(xVar.b());
            return;
        }
        switch (h10) {
            case 16:
                if (h11 == hVar.f10771a) {
                    d dVar = hVar.f10779i;
                    d o10 = o(xVar, h12);
                    if (o10.f10750c == 0) {
                        if (!(dVar == null || dVar.f10749b == o10.f10749b)) {
                            hVar.f10779i = o10;
                            break;
                        }
                    } else {
                        hVar.f10779i = o10;
                        hVar.f10773c.clear();
                        hVar.f10774d.clear();
                        hVar.f10775e.clear();
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f10779i;
                if (h11 == hVar.f10771a && dVar2 != null) {
                    f p10 = p(xVar, h12);
                    if (dVar2.f10750c == 0 && (fVar = hVar.f10773c.get(p10.f10754a)) != null) {
                        p10.a(fVar);
                    }
                    hVar.f10773c.put(p10.f10754a, p10);
                    break;
                }
            case 18:
                if (h11 != hVar.f10771a) {
                    if (h11 == hVar.f10772b) {
                        a l10 = l(xVar, h12);
                        hVar.f10776f.put(l10.f10734a, l10);
                        break;
                    }
                } else {
                    a l11 = l(xVar, h12);
                    hVar.f10774d.put(l11.f10734a, l11);
                    break;
                }
                break;
            case 19:
                if (h11 != hVar.f10771a) {
                    if (h11 == hVar.f10772b) {
                        c n10 = n(xVar);
                        hVar.f10777g.put(n10.f10744a, n10);
                        break;
                    }
                } else {
                    c n11 = n(xVar);
                    hVar.f10775e.put(n11.f10744a, n11);
                    break;
                }
                break;
            case 20:
                if (h11 == hVar.f10771a) {
                    hVar.f10778h = m(xVar);
                    break;
                }
                break;
        }
        xVar.s(d10 - xVar.d());
    }

    public List<o5.a> b(byte[] bArr, int i10) {
        int i11;
        int i12;
        SparseArray<g> sparseArray;
        x xVar = new x(bArr, i10);
        while (xVar.b() >= 48 && xVar.h(8) == 15) {
            q(xVar, this.f10732f);
        }
        h hVar = this.f10732f;
        d dVar = hVar.f10779i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C0186b bVar = hVar.f10778h;
        if (bVar == null) {
            bVar = this.f10730d;
        }
        Bitmap bitmap = this.f10733g;
        if (!(bitmap != null && bVar.f10738a + 1 == bitmap.getWidth() && bVar.f10739b + 1 == this.f10733g.getHeight())) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f10738a + 1, bVar.f10739b + 1, Bitmap.Config.ARGB_8888);
            this.f10733g = createBitmap;
            this.f10729c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = dVar.f10751d;
        for (int i13 = 0; i13 < sparseArray2.size(); i13++) {
            this.f10729c.save();
            e valueAt = sparseArray2.valueAt(i13);
            f fVar = this.f10732f.f10773c.get(sparseArray2.keyAt(i13));
            int i14 = valueAt.f10752a + bVar.f10740c;
            int i15 = valueAt.f10753b + bVar.f10742e;
            this.f10729c.clipRect(i14, i15, Math.min(fVar.f10756c + i14, bVar.f10741d), Math.min(fVar.f10757d + i15, bVar.f10743f));
            a aVar = this.f10732f.f10774d.get(fVar.f10760g);
            if (aVar == null && (aVar = this.f10732f.f10776f.get(fVar.f10760g)) == null) {
                aVar = this.f10731e;
            }
            SparseArray<g> sparseArray3 = fVar.f10764k;
            int i16 = 0;
            while (i16 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i16);
                g valueAt2 = sparseArray3.valueAt(i16);
                c cVar = this.f10732f.f10775e.get(keyAt);
                c cVar2 = cVar == null ? this.f10732f.f10777g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    Paint paint = cVar2.f10745b ? null : this.f10727a;
                    i12 = i16;
                    int i17 = i15 + valueAt2.f10768d;
                    sparseArray = sparseArray3;
                    k(cVar2, aVar, fVar.f10759f, valueAt2.f10767c + i14, i17, paint, this.f10729c);
                } else {
                    i12 = i16;
                    sparseArray = sparseArray3;
                }
                i16 = i12 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f10755b) {
                int i18 = fVar.f10759f;
                if (i18 == 3) {
                    i11 = aVar.f10737d[fVar.f10761h];
                } else if (i18 == 2) {
                    i11 = aVar.f10736c[fVar.f10762i];
                } else {
                    i11 = aVar.f10735b[fVar.f10763j];
                }
                this.f10728b.setColor(i11);
                this.f10729c.drawRect((float) i14, (float) i15, (float) (fVar.f10756c + i14), (float) (fVar.f10757d + i15), this.f10728b);
            }
            arrayList.add(new a.b().e(Bitmap.createBitmap(this.f10733g, i14, i15, fVar.f10756c, fVar.f10757d)).j(((float) i14) / ((float) bVar.f10738a)).k(0).g(((float) i15) / ((float) bVar.f10739b), 0).h(0).m(((float) fVar.f10756c) / ((float) bVar.f10738a)).f(((float) fVar.f10757d) / ((float) bVar.f10739b)).a());
            this.f10729c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f10729c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void r() {
        this.f10732f.a();
    }
}
