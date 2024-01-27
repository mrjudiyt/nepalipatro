package p5;

import a6.p;
import a6.x;
import a6.y;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o5.a;
import o5.e;
import o5.h;
import o5.i;

/* compiled from: Cea708Decoder */
public final class c extends e {

    /* renamed from: g  reason: collision with root package name */
    private final y f10599g = new y();

    /* renamed from: h  reason: collision with root package name */
    private final x f10600h = new x();

    /* renamed from: i  reason: collision with root package name */
    private int f10601i = -1;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f10602j;

    /* renamed from: k  reason: collision with root package name */
    private final int f10603k;

    /* renamed from: l  reason: collision with root package name */
    private final b[] f10604l;

    /* renamed from: m  reason: collision with root package name */
    private b f10605m;

    /* renamed from: n  reason: collision with root package name */
    private List<o5.a> f10606n;

    /* renamed from: o  reason: collision with root package name */
    private List<o5.a> f10607o;

    /* renamed from: p  reason: collision with root package name */
    private C0183c f10608p;

    /* renamed from: q  reason: collision with root package name */
    private int f10609q;

    /* compiled from: Cea708Decoder */
    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final Comparator<a> f10610c = b.f16191h;

        /* renamed from: a  reason: collision with root package name */
        public final o5.a f10611a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10612b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            a.b m10 = new a.b().n(charSequence).o(alignment).g(f10, i10).h(i11).j(f11).k(i12).m(f12);
            if (z10) {
                m10.r(i13);
            }
            this.f10611a = m10.a();
            this.f10612b = i14;
        }
    }

    /* compiled from: Cea708Decoder */
    private static final class b {
        private static final int[] A = {0, 0, 0, 0, 0, 0, 2};
        private static final int[] B = {3, 3, 3, 3, 3, 3, 1};
        private static final boolean[] C = {false, false, false, true, true, true, false};
        private static final int[] D;
        private static final int[] E = {0, 1, 2, 3, 4, 3, 4};
        private static final int[] F = {0, 0, 0, 0, 0, 3, 3};
        private static final int[] G;

        /* renamed from: w  reason: collision with root package name */
        public static final int f10613w = h(2, 2, 2, 0);

        /* renamed from: x  reason: collision with root package name */
        public static final int f10614x;

        /* renamed from: y  reason: collision with root package name */
        public static final int f10615y;

        /* renamed from: z  reason: collision with root package name */
        private static final int[] f10616z = {0, 0, 0, 0, 0, 2, 0};

        /* renamed from: a  reason: collision with root package name */
        private final List<SpannableString> f10617a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final SpannableStringBuilder f10618b = new SpannableStringBuilder();

        /* renamed from: c  reason: collision with root package name */
        private boolean f10619c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f10620d;

        /* renamed from: e  reason: collision with root package name */
        private int f10621e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f10622f;

        /* renamed from: g  reason: collision with root package name */
        private int f10623g;

        /* renamed from: h  reason: collision with root package name */
        private int f10624h;

        /* renamed from: i  reason: collision with root package name */
        private int f10625i;

        /* renamed from: j  reason: collision with root package name */
        private int f10626j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f10627k;

        /* renamed from: l  reason: collision with root package name */
        private int f10628l;

        /* renamed from: m  reason: collision with root package name */
        private int f10629m;

        /* renamed from: n  reason: collision with root package name */
        private int f10630n;

        /* renamed from: o  reason: collision with root package name */
        private int f10631o;

        /* renamed from: p  reason: collision with root package name */
        private int f10632p;

        /* renamed from: q  reason: collision with root package name */
        private int f10633q;

        /* renamed from: r  reason: collision with root package name */
        private int f10634r;

        /* renamed from: s  reason: collision with root package name */
        private int f10635s;

        /* renamed from: t  reason: collision with root package name */
        private int f10636t;

        /* renamed from: u  reason: collision with root package name */
        private int f10637u;

        /* renamed from: v  reason: collision with root package name */
        private int f10638v;

        static {
            int h10 = h(0, 0, 0, 0);
            f10614x = h10;
            int h11 = h(0, 0, 0, 3);
            f10615y = h11;
            D = new int[]{h10, h11, h10, h10, h11, h10, h10};
            G = new int[]{h10, h10, h10, h10, h10, h11, h11};
        }

        public b() {
            l();
        }

        public static int g(int i10, int i11, int i12) {
            return h(i10, i11, i12, 0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                a6.a.c(r4, r0, r1)
                a6.a.c(r5, r0, r1)
                a6.a.c(r6, r0, r1)
                a6.a.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L_0x0021
                if (r7 == r1) goto L_0x0021
                r3 = 2
                if (r7 == r3) goto L_0x001e
                r3 = 3
                if (r7 == r3) goto L_0x001c
                goto L_0x0021
            L_0x001c:
                r7 = 0
                goto L_0x0023
            L_0x001e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L_0x0023
            L_0x0021:
                r7 = 255(0xff, float:3.57E-43)
            L_0x0023:
                if (r4 <= r1) goto L_0x0028
                r4 = 255(0xff, float:3.57E-43)
                goto L_0x0029
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r5 <= r1) goto L_0x002e
                r5 = 255(0xff, float:3.57E-43)
                goto L_0x002f
            L_0x002e:
                r5 = 0
            L_0x002f:
                if (r6 <= r1) goto L_0x0033
                r0 = 255(0xff, float:3.57E-43)
            L_0x0033:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p5.c.b.h(int, int, int, int):int");
        }

        public void a(char c10) {
            if (c10 == 10) {
                this.f10617a.add(d());
                this.f10618b.clear();
                if (this.f10632p != -1) {
                    this.f10632p = 0;
                }
                if (this.f10633q != -1) {
                    this.f10633q = 0;
                }
                if (this.f10634r != -1) {
                    this.f10634r = 0;
                }
                if (this.f10636t != -1) {
                    this.f10636t = 0;
                }
                while (true) {
                    if ((this.f10627k && this.f10617a.size() >= this.f10626j) || this.f10617a.size() >= 15) {
                        this.f10617a.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.f10618b.append(c10);
            }
        }

        public void b() {
            int length = this.f10618b.length();
            if (length > 0) {
                this.f10618b.delete(length - 1, length);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0095  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a2  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ae  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p5.c.a c() {
            /*
                r15 = this;
                boolean r0 = r15.j()
                if (r0 == 0) goto L_0x0008
                r0 = 0
                return r0
            L_0x0008:
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>()
                r0 = 0
                r1 = 0
            L_0x000f:
                java.util.List<android.text.SpannableString> r3 = r15.f10617a
                int r3 = r3.size()
                if (r1 >= r3) goto L_0x002a
                java.util.List<android.text.SpannableString> r3 = r15.f10617a
                java.lang.Object r3 = r3.get(r1)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r2.append(r3)
                r3 = 10
                r2.append(r3)
                int r1 = r1 + 1
                goto L_0x000f
            L_0x002a:
                android.text.SpannableString r1 = r15.d()
                r2.append(r1)
                int r1 = r15.f10628l
                r3 = 2
                r4 = 3
                r5 = 1
                if (r1 == 0) goto L_0x0060
                if (r1 == r5) goto L_0x005d
                if (r1 == r3) goto L_0x005a
                if (r1 != r4) goto L_0x003f
                goto L_0x0060
            L_0x003f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                int r1 = r15.f10628l
                r2 = 43
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                java.lang.String r2 = "Unexpected justification value: "
                r3.append(r2)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                r0.<init>(r1)
                throw r0
            L_0x005a:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L_0x0062
            L_0x005d:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L_0x0062
            L_0x0060:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            L_0x0062:
                r6 = r1
                boolean r1 = r15.f10622f
                if (r1 == 0) goto L_0x0072
                int r1 = r15.f10624h
                float r1 = (float) r1
                r7 = 1120272384(0x42c60000, float:99.0)
                float r1 = r1 / r7
                int r8 = r15.f10623g
                float r8 = (float) r8
                float r8 = r8 / r7
                goto L_0x007f
            L_0x0072:
                int r1 = r15.f10624h
                float r1 = (float) r1
                r7 = 1129381888(0x43510000, float:209.0)
                float r1 = r1 / r7
                int r7 = r15.f10623g
                float r7 = (float) r7
                r8 = 1116995584(0x42940000, float:74.0)
                float r8 = r7 / r8
            L_0x007f:
                r7 = 1063675494(0x3f666666, float:0.9)
                float r1 = r1 * r7
                r9 = 1028443341(0x3d4ccccd, float:0.05)
                float r10 = r1 + r9
                float r8 = r8 * r7
                float r7 = r8 + r9
                int r1 = r15.f10625i
                int r8 = r1 / 3
                if (r8 != 0) goto L_0x0095
                r8 = 0
                goto L_0x009c
            L_0x0095:
                int r8 = r1 / 3
                if (r8 != r5) goto L_0x009b
                r8 = 1
                goto L_0x009c
            L_0x009b:
                r8 = 2
            L_0x009c:
                int r9 = r1 % 3
                if (r9 != 0) goto L_0x00a2
                r9 = 0
                goto L_0x00a8
            L_0x00a2:
                int r1 = r1 % r4
                if (r1 != r5) goto L_0x00a7
                r9 = 1
                goto L_0x00a8
            L_0x00a7:
                r9 = 2
            L_0x00a8:
                int r1 = r15.f10631o
                int r3 = f10614x
                if (r1 == r3) goto L_0x00af
                r0 = 1
            L_0x00af:
                p5.c$a r13 = new p5.c$a
                r5 = 0
                r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                int r12 = r15.f10631o
                int r14 = r15.f10621e
                r1 = r13
                r3 = r6
                r4 = r7
                r6 = r8
                r7 = r10
                r8 = r9
                r9 = r11
                r10 = r0
                r11 = r12
                r12 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p5.c.b.c():p5.c$a");
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f10618b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f10632p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f10632p, length, 33);
                }
                if (this.f10633q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f10633q, length, 33);
                }
                if (this.f10634r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f10635s), this.f10634r, length, 33);
                }
                if (this.f10636t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f10637u), this.f10636t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f10617a.clear();
            this.f10618b.clear();
            this.f10632p = -1;
            this.f10633q = -1;
            this.f10634r = -1;
            this.f10636t = -1;
            this.f10638v = 0;
        }

        public void f(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            boolean z14 = z11;
            int i18 = i16;
            int i19 = i17;
            this.f10619c = true;
            this.f10620d = z10;
            this.f10627k = z14;
            this.f10621e = i10;
            this.f10622f = z13;
            this.f10623g = i11;
            this.f10624h = i12;
            this.f10625i = i15;
            int i20 = i13 + 1;
            if (this.f10626j != i20) {
                this.f10626j = i20;
                while (true) {
                    if ((!z14 || this.f10617a.size() < this.f10626j) && this.f10617a.size() < 15) {
                        break;
                    }
                    this.f10617a.remove(0);
                }
            }
            if (!(i18 == 0 || this.f10629m == i18)) {
                this.f10629m = i18;
                int i21 = i18 - 1;
                q(D[i21], f10615y, C[i21], 0, A[i21], B[i21], f10616z[i21]);
            }
            if (i19 != 0 && this.f10630n != i19) {
                this.f10630n = i19;
                int i22 = i19 - 1;
                m(0, 1, 1, false, false, F[i22], E[i22]);
                n(f10613w, G[i22], f10614x);
            }
        }

        public boolean i() {
            return this.f10619c;
        }

        public boolean j() {
            return !i() || (this.f10617a.isEmpty() && this.f10618b.length() == 0);
        }

        public boolean k() {
            return this.f10620d;
        }

        public void l() {
            e();
            this.f10619c = false;
            this.f10620d = false;
            this.f10621e = 4;
            this.f10622f = false;
            this.f10623g = 0;
            this.f10624h = 0;
            this.f10625i = 0;
            this.f10626j = 15;
            this.f10627k = true;
            this.f10628l = 0;
            this.f10629m = 0;
            this.f10630n = 0;
            int i10 = f10614x;
            this.f10631o = i10;
            this.f10635s = f10613w;
            this.f10637u = i10;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f10632p != -1) {
                if (!z10) {
                    this.f10618b.setSpan(new StyleSpan(2), this.f10632p, this.f10618b.length(), 33);
                    this.f10632p = -1;
                }
            } else if (z10) {
                this.f10632p = this.f10618b.length();
            }
            if (this.f10633q != -1) {
                if (!z11) {
                    this.f10618b.setSpan(new UnderlineSpan(), this.f10633q, this.f10618b.length(), 33);
                    this.f10633q = -1;
                }
            } else if (z11) {
                this.f10633q = this.f10618b.length();
            }
        }

        public void n(int i10, int i11, int i12) {
            if (!(this.f10634r == -1 || this.f10635s == i10)) {
                this.f10618b.setSpan(new ForegroundColorSpan(this.f10635s), this.f10634r, this.f10618b.length(), 33);
            }
            if (i10 != f10613w) {
                this.f10634r = this.f10618b.length();
                this.f10635s = i10;
            }
            if (!(this.f10636t == -1 || this.f10637u == i11)) {
                this.f10618b.setSpan(new BackgroundColorSpan(this.f10637u), this.f10636t, this.f10618b.length(), 33);
            }
            if (i11 != f10614x) {
                this.f10636t = this.f10618b.length();
                this.f10637u = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f10638v != i10) {
                a(10);
            }
            this.f10638v = i10;
        }

        public void p(boolean z10) {
            this.f10620d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f10631o = i10;
            this.f10628l = i15;
        }
    }

    /* renamed from: p5.c$c  reason: collision with other inner class name */
    /* compiled from: Cea708Decoder */
    private static final class C0183c {

        /* renamed from: a  reason: collision with root package name */
        public final int f10639a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10640b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f10641c;

        /* renamed from: d  reason: collision with root package name */
        int f10642d = 0;

        public C0183c(int i10, int i11) {
            this.f10639a = i10;
            this.f10640b = i11;
            this.f10641c = new byte[((i11 * 2) - 1)];
        }
    }

    public c(int i10, List<byte[]> list) {
        boolean z10 = true;
        this.f10603k = i10 == -1 ? 1 : i10;
        this.f10602j = (list == null || !a6.c.f(list)) ? false : z10;
        this.f10604l = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f10604l[i11] = new b();
        }
        this.f10605m = this.f10604l[0];
    }

    private void A() {
        int h10 = b.h(this.f10600h.h(2), this.f10600h.h(2), this.f10600h.h(2), this.f10600h.h(2));
        int h11 = b.h(this.f10600h.h(2), this.f10600h.h(2), this.f10600h.h(2), this.f10600h.h(2));
        this.f10600h.r(2);
        this.f10605m.n(h10, h11, b.g(this.f10600h.h(2), this.f10600h.h(2), this.f10600h.h(2)));
    }

    private void B() {
        this.f10600h.r(4);
        int h10 = this.f10600h.h(4);
        this.f10600h.r(2);
        this.f10605m.o(h10, this.f10600h.h(6));
    }

    private void C() {
        int h10 = b.h(this.f10600h.h(2), this.f10600h.h(2), this.f10600h.h(2), this.f10600h.h(2));
        int h11 = this.f10600h.h(2);
        int g10 = b.g(this.f10600h.h(2), this.f10600h.h(2), this.f10600h.h(2));
        if (this.f10600h.g()) {
            h11 |= 4;
        }
        boolean g11 = this.f10600h.g();
        int h12 = this.f10600h.h(2);
        int h13 = this.f10600h.h(2);
        int h14 = this.f10600h.h(2);
        this.f10600h.r(8);
        this.f10605m.q(h10, g10, g11, h11, h12, h13, h14);
    }

    private void D() {
        C0183c cVar = this.f10608p;
        int i10 = cVar.f10642d;
        int i11 = cVar.f10640b;
        if (i10 != (i11 * 2) - 1) {
            int i12 = cVar.f10639a;
            StringBuilder sb = new StringBuilder(115);
            sb.append("DtvCcPacket ended prematurely; size is ");
            sb.append((i11 * 2) - 1);
            sb.append(", but current index is ");
            sb.append(i10);
            sb.append(" (sequence number ");
            sb.append(i12);
            sb.append(");");
            p.b("Cea708Decoder", sb.toString());
        }
        x xVar = this.f10600h;
        C0183c cVar2 = this.f10608p;
        xVar.o(cVar2.f10641c, cVar2.f10642d);
        int h10 = this.f10600h.h(3);
        int h11 = this.f10600h.h(5);
        if (h10 == 7) {
            this.f10600h.r(2);
            h10 = this.f10600h.h(6);
            if (h10 < 7) {
                StringBuilder sb2 = new StringBuilder(44);
                sb2.append("Invalid extended service number: ");
                sb2.append(h10);
                p.h("Cea708Decoder", sb2.toString());
            }
        }
        if (h11 == 0) {
            if (h10 != 0) {
                StringBuilder sb3 = new StringBuilder(59);
                sb3.append("serviceNumber is non-zero (");
                sb3.append(h10);
                sb3.append(") when blockSize is 0");
                p.h("Cea708Decoder", sb3.toString());
            }
        } else if (h10 == this.f10603k) {
            boolean z10 = false;
            while (this.f10600h.b() > 0) {
                int h12 = this.f10600h.h(8);
                if (h12 == 16) {
                    int h13 = this.f10600h.h(8);
                    if (h13 <= 31) {
                        s(h13);
                    } else if (h13 <= 127) {
                        x(h13);
                    } else if (h13 <= 159) {
                        t(h13);
                    } else if (h13 <= 255) {
                        y(h13);
                    } else {
                        StringBuilder sb4 = new StringBuilder(37);
                        sb4.append("Invalid extended command: ");
                        sb4.append(h13);
                        p.h("Cea708Decoder", sb4.toString());
                    }
                } else if (h12 <= 31) {
                    q(h12);
                } else if (h12 <= 127) {
                    v(h12);
                } else if (h12 <= 159) {
                    r(h12);
                } else if (h12 <= 255) {
                    w(h12);
                } else {
                    StringBuilder sb5 = new StringBuilder(33);
                    sb5.append("Invalid base command: ");
                    sb5.append(h12);
                    p.h("Cea708Decoder", sb5.toString());
                }
                z10 = true;
            }
            if (z10) {
                this.f10606n = p();
            }
        }
    }

    private void E() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f10604l[i10].l();
        }
    }

    private void o() {
        if (this.f10608p != null) {
            D();
            this.f10608p = null;
        }
    }

    private List<o5.a> p() {
        a c10;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f10604l[i10].j() && this.f10604l[i10].k() && (c10 = this.f10604l[i10].c()) != null) {
                arrayList.add(c10);
            }
        }
        Collections.sort(arrayList, a.f10610c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f10611a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void q(int i10) {
        if (i10 == 0) {
            return;
        }
        if (i10 == 3) {
            this.f10606n = p();
        } else if (i10 != 8) {
            switch (i10) {
                case 12:
                    E();
                    return;
                case 13:
                    this.f10605m.a(10);
                    return;
                case 14:
                    return;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        StringBuilder sb = new StringBuilder(55);
                        sb.append("Currently unsupported COMMAND_EXT1 Command: ");
                        sb.append(i10);
                        p.h("Cea708Decoder", sb.toString());
                        this.f10600h.r(8);
                        return;
                    } else if (i10 < 24 || i10 > 31) {
                        StringBuilder sb2 = new StringBuilder(31);
                        sb2.append("Invalid C0 command: ");
                        sb2.append(i10);
                        p.h("Cea708Decoder", sb2.toString());
                        return;
                    } else {
                        StringBuilder sb3 = new StringBuilder(54);
                        sb3.append("Currently unsupported COMMAND_P16 Command: ");
                        sb3.append(i10);
                        p.h("Cea708Decoder", sb3.toString());
                        this.f10600h.r(16);
                        return;
                    }
            }
        } else {
            this.f10605m.b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0095, code lost:
        if (r2 > 8) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009d, code lost:
        if (r4.f10600h.g() == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009f, code lost:
        r4.f10604l[8 - r2].l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a8, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c7, code lost:
        if (r2 > 8) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cf, code lost:
        if (r4.f10600h.g() == false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d1, code lost:
        r4.f10604l[8 - r2].p(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00db, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f5, code lost:
        if (r2 > 8) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fd, code lost:
        if (r4.f10600h.g() == false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ff, code lost:
        r4.f10604l[8 - r2].e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0108, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r(int r5) {
        /*
            r4 = this;
            r0 = 16
            r1 = 8
            r2 = 1
            switch(r5) {
                case 128: goto L_0x010b;
                case 129: goto L_0x010b;
                case 130: goto L_0x010b;
                case 131: goto L_0x010b;
                case 132: goto L_0x010b;
                case 133: goto L_0x010b;
                case 134: goto L_0x010b;
                case 135: goto L_0x010b;
                case 136: goto L_0x00f5;
                case 137: goto L_0x00de;
                case 138: goto L_0x00c7;
                case 139: goto L_0x00ab;
                case 140: goto L_0x0095;
                case 141: goto L_0x008e;
                case 142: goto L_0x0119;
                case 143: goto L_0x0089;
                case 144: goto L_0x0075;
                case 145: goto L_0x005f;
                case 146: goto L_0x004b;
                case 147: goto L_0x0008;
                case 148: goto L_0x0008;
                case 149: goto L_0x0008;
                case 150: goto L_0x0008;
                case 151: goto L_0x0035;
                case 152: goto L_0x0022;
                case 153: goto L_0x0022;
                case 154: goto L_0x0022;
                case 155: goto L_0x0022;
                case 156: goto L_0x0022;
                case 157: goto L_0x0022;
                case 158: goto L_0x0022;
                case 159: goto L_0x0022;
                default: goto L_0x0008;
            }
        L_0x0008:
            r0 = 31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Invalid C1 command: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r0 = "Cea708Decoder"
            a6.p.h(r0, r5)
            goto L_0x0119
        L_0x0022:
            int r5 = r5 + -152
            r4.u(r5)
            int r0 = r4.f10609q
            if (r0 == r5) goto L_0x0119
            r4.f10609q = r5
            p5.c$b[] r0 = r4.f10604l
            r5 = r0[r5]
            r4.f10605m = r5
            goto L_0x0119
        L_0x0035:
            p5.c$b r5 = r4.f10605m
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x0046
            a6.x r5 = r4.f10600h
            r0 = 32
            r5.r(r0)
            goto L_0x0119
        L_0x0046:
            r4.C()
            goto L_0x0119
        L_0x004b:
            p5.c$b r5 = r4.f10605m
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x005a
            a6.x r5 = r4.f10600h
            r5.r(r0)
            goto L_0x0119
        L_0x005a:
            r4.B()
            goto L_0x0119
        L_0x005f:
            p5.c$b r5 = r4.f10605m
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x0070
            a6.x r5 = r4.f10600h
            r0 = 24
            r5.r(r0)
            goto L_0x0119
        L_0x0070:
            r4.A()
            goto L_0x0119
        L_0x0075:
            p5.c$b r5 = r4.f10605m
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x0084
            a6.x r5 = r4.f10600h
            r5.r(r0)
            goto L_0x0119
        L_0x0084:
            r4.z()
            goto L_0x0119
        L_0x0089:
            r4.E()
            goto L_0x0119
        L_0x008e:
            a6.x r5 = r4.f10600h
            r5.r(r1)
            goto L_0x0119
        L_0x0095:
            if (r2 > r1) goto L_0x0119
            a6.x r5 = r4.f10600h
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x00a8
            p5.c$b[] r5 = r4.f10604l
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.l()
        L_0x00a8:
            int r2 = r2 + 1
            goto L_0x0095
        L_0x00ab:
            r5 = 1
        L_0x00ac:
            if (r5 > r1) goto L_0x0119
            a6.x r0 = r4.f10600h
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x00c4
            p5.c$b[] r0 = r4.f10604l
            int r3 = 8 - r5
            r0 = r0[r3]
            boolean r3 = r0.k()
            r3 = r3 ^ r2
            r0.p(r3)
        L_0x00c4:
            int r5 = r5 + 1
            goto L_0x00ac
        L_0x00c7:
            if (r2 > r1) goto L_0x0119
            a6.x r5 = r4.f10600h
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x00db
            p5.c$b[] r5 = r4.f10604l
            int r0 = 8 - r2
            r5 = r5[r0]
            r0 = 0
            r5.p(r0)
        L_0x00db:
            int r2 = r2 + 1
            goto L_0x00c7
        L_0x00de:
            r5 = 1
        L_0x00df:
            if (r5 > r1) goto L_0x0119
            a6.x r0 = r4.f10600h
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x00f2
            p5.c$b[] r0 = r4.f10604l
            int r3 = 8 - r5
            r0 = r0[r3]
            r0.p(r2)
        L_0x00f2:
            int r5 = r5 + 1
            goto L_0x00df
        L_0x00f5:
            if (r2 > r1) goto L_0x0119
            a6.x r5 = r4.f10600h
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x0108
            p5.c$b[] r5 = r4.f10604l
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.e()
        L_0x0108:
            int r2 = r2 + 1
            goto L_0x00f5
        L_0x010b:
            int r5 = r5 + -128
            int r0 = r4.f10609q
            if (r0 == r5) goto L_0x0119
            r4.f10609q = r5
            p5.c$b[] r0 = r4.f10604l
            r5 = r0[r5]
            r4.f10605m = r5
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.c.r(int):void");
    }

    private void s(int i10) {
        if (i10 > 7) {
            if (i10 <= 15) {
                this.f10600h.r(8);
            } else if (i10 <= 23) {
                this.f10600h.r(16);
            } else if (i10 <= 31) {
                this.f10600h.r(24);
            }
        }
    }

    private void t(int i10) {
        if (i10 <= 135) {
            this.f10600h.r(32);
        } else if (i10 <= 143) {
            this.f10600h.r(40);
        } else if (i10 <= 159) {
            this.f10600h.r(2);
            this.f10600h.r(this.f10600h.h(6) * 8);
        }
    }

    private void u(int i10) {
        b bVar = this.f10604l[i10];
        this.f10600h.r(2);
        boolean g10 = this.f10600h.g();
        boolean g11 = this.f10600h.g();
        boolean g12 = this.f10600h.g();
        int h10 = this.f10600h.h(3);
        boolean g13 = this.f10600h.g();
        int h11 = this.f10600h.h(7);
        int h12 = this.f10600h.h(8);
        int h13 = this.f10600h.h(4);
        int h14 = this.f10600h.h(4);
        this.f10600h.r(2);
        int h15 = this.f10600h.h(6);
        this.f10600h.r(2);
        bVar.f(g10, g11, g12, h10, g13, h11, h12, h14, h15, h13, this.f10600h.h(3), this.f10600h.h(3));
    }

    private void v(int i10) {
        if (i10 == 127) {
            this.f10605m.a(9835);
        } else {
            this.f10605m.a((char) (i10 & 255));
        }
    }

    private void w(int i10) {
        this.f10605m.a((char) (i10 & 255));
    }

    private void x(int i10) {
        if (i10 == 32) {
            this.f10605m.a(' ');
        } else if (i10 == 33) {
            this.f10605m.a(160);
        } else if (i10 == 37) {
            this.f10605m.a(8230);
        } else if (i10 == 42) {
            this.f10605m.a(352);
        } else if (i10 == 44) {
            this.f10605m.a(338);
        } else if (i10 == 63) {
            this.f10605m.a(376);
        } else if (i10 == 57) {
            this.f10605m.a(8482);
        } else if (i10 == 58) {
            this.f10605m.a(353);
        } else if (i10 == 60) {
            this.f10605m.a(339);
        } else if (i10 != 61) {
            switch (i10) {
                case 48:
                    this.f10605m.a(9608);
                    return;
                case 49:
                    this.f10605m.a(8216);
                    return;
                case 50:
                    this.f10605m.a(8217);
                    return;
                case 51:
                    this.f10605m.a(8220);
                    return;
                case 52:
                    this.f10605m.a(8221);
                    return;
                case 53:
                    this.f10605m.a(8226);
                    return;
                default:
                    switch (i10) {
                        case 118:
                            this.f10605m.a(8539);
                            return;
                        case 119:
                            this.f10605m.a(8540);
                            return;
                        case 120:
                            this.f10605m.a(8541);
                            return;
                        case 121:
                            this.f10605m.a(8542);
                            return;
                        case 122:
                            this.f10605m.a(9474);
                            return;
                        case 123:
                            this.f10605m.a(9488);
                            return;
                        case 124:
                            this.f10605m.a(9492);
                            return;
                        case 125:
                            this.f10605m.a(9472);
                            return;
                        case 126:
                            this.f10605m.a(9496);
                            return;
                        case 127:
                            this.f10605m.a(9484);
                            return;
                        default:
                            StringBuilder sb = new StringBuilder(33);
                            sb.append("Invalid G2 character: ");
                            sb.append(i10);
                            p.h("Cea708Decoder", sb.toString());
                            return;
                    }
            }
        } else {
            this.f10605m.a(8480);
        }
    }

    private void y(int i10) {
        if (i10 == 160) {
            this.f10605m.a(13252);
            return;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Invalid G3 character: ");
        sb.append(i10);
        p.h("Cea708Decoder", sb.toString());
        this.f10605m.a('_');
    }

    private void z() {
        this.f10605m.m(this.f10600h.h(4), this.f10600h.h(2), this.f10600h.h(2), this.f10600h.g(), this.f10600h.g(), this.f10600h.h(3), this.f10600h.h(3));
    }

    public /* bridge */ /* synthetic */ void a(long j10) {
        super.a(j10);
    }

    /* access modifiers changed from: protected */
    public e e() {
        List<o5.a> list = this.f10606n;
        this.f10607o = list;
        return new f((List) a6.a.e(list));
    }

    /* access modifiers changed from: protected */
    public void f(h hVar) {
        ByteBuffer byteBuffer = (ByteBuffer) a6.a.e(hVar.f6469j);
        this.f10599g.M(byteBuffer.array(), byteBuffer.limit());
        while (this.f10599g.a() >= 3) {
            int C = this.f10599g.C() & 7;
            int i10 = C & 3;
            boolean z10 = false;
            boolean z11 = (C & 4) == 4;
            byte C2 = (byte) this.f10599g.C();
            byte C3 = (byte) this.f10599g.C();
            if ((i10 == 2 || i10 == 3) && z11) {
                if (i10 == 3) {
                    o();
                    int i11 = (C2 & 192) >> 6;
                    int i12 = this.f10601i;
                    if (!(i12 == -1 || i11 == (i12 + 1) % 4)) {
                        E();
                        int i13 = this.f10601i;
                        StringBuilder sb = new StringBuilder(71);
                        sb.append("Sequence number discontinuity. previous=");
                        sb.append(i13);
                        sb.append(" current=");
                        sb.append(i11);
                        p.h("Cea708Decoder", sb.toString());
                    }
                    this.f10601i = i11;
                    byte b10 = C2 & 63;
                    if (b10 == 0) {
                        b10 = 64;
                    }
                    C0183c cVar = new C0183c(i11, b10);
                    this.f10608p = cVar;
                    byte[] bArr = cVar.f10641c;
                    int i14 = cVar.f10642d;
                    cVar.f10642d = i14 + 1;
                    bArr[i14] = C3;
                } else {
                    if (i10 == 2) {
                        z10 = true;
                    }
                    a6.a.a(z10);
                    C0183c cVar2 = this.f10608p;
                    if (cVar2 == null) {
                        p.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        byte[] bArr2 = cVar2.f10641c;
                        int i15 = cVar2.f10642d;
                        int i16 = i15 + 1;
                        cVar2.f10642d = i16;
                        bArr2[i15] = C2;
                        cVar2.f10642d = i16 + 1;
                        bArr2[i16] = C3;
                    }
                }
                C0183c cVar3 = this.f10608p;
                if (cVar3.f10642d == (cVar3.f10640b * 2) - 1) {
                    o();
                }
            }
        }
    }

    public void flush() {
        super.flush();
        this.f10606n = null;
        this.f10607o = null;
        this.f10609q = 0;
        this.f10605m = this.f10604l[0];
        E();
        this.f10608p = null;
    }

    public /* bridge */ /* synthetic */ h g() {
        return super.c();
    }

    public /* bridge */ /* synthetic */ i h() {
        return super.b();
    }

    /* access modifiers changed from: protected */
    public boolean k() {
        return this.f10606n != this.f10607o;
    }

    public /* bridge */ /* synthetic */ void l(h hVar) {
        super.d(hVar);
    }

    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }
}
