package w5;

import a6.m0;
import a6.p;
import a6.y;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.List;
import l6.e;
import o5.a;
import o5.c;

/* compiled from: Tx3gDecoder */
public final class a extends c {

    /* renamed from: o  reason: collision with root package name */
    private final y f12747o = new y();

    /* renamed from: p  reason: collision with root package name */
    private final boolean f12748p;

    /* renamed from: q  reason: collision with root package name */
    private final int f12749q;

    /* renamed from: r  reason: collision with root package name */
    private final int f12750r;

    /* renamed from: s  reason: collision with root package name */
    private final String f12751s;

    /* renamed from: t  reason: collision with root package name */
    private final float f12752t;

    /* renamed from: u  reason: collision with root package name */
    private final int f12753u;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        String str = "sans-serif";
        boolean z10 = true;
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f12749q = bArr[24];
            this.f12750r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f12751s = "Serif".equals(m0.E(bArr, 43, bArr.length - 43)) ? "serif" : str;
            int i10 = bArr[25] * 20;
            this.f12753u = i10;
            z10 = (bArr[0] & 32) == 0 ? false : z10;
            this.f12748p = z10;
            if (z10) {
                this.f12752t = m0.q(((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i10), 0.0f, 0.95f);
            } else {
                this.f12752t = 0.85f;
            }
        } else {
            this.f12749q = 0;
            this.f12750r = -1;
            this.f12751s = str;
            this.f12748p = false;
            this.f12752t = 0.85f;
            this.f12753u = -1;
        }
    }

    private void B(y yVar, SpannableStringBuilder spannableStringBuilder) {
        int i10;
        C(yVar.a() >= 12);
        int I = yVar.I();
        int I2 = yVar.I();
        yVar.P(2);
        int C = yVar.C();
        yVar.P(1);
        int m10 = yVar.m();
        if (I2 > spannableStringBuilder.length()) {
            int length = spannableStringBuilder.length();
            StringBuilder sb = new StringBuilder(68);
            sb.append("Truncating styl end (");
            sb.append(I2);
            sb.append(") to cueText.length() (");
            sb.append(length);
            sb.append(").");
            p.h("Tx3gDecoder", sb.toString());
            i10 = spannableStringBuilder.length();
        } else {
            i10 = I2;
        }
        if (I >= i10) {
            StringBuilder sb2 = new StringBuilder(60);
            sb2.append("Ignoring styl with start (");
            sb2.append(I);
            sb2.append(") >= end (");
            sb2.append(i10);
            sb2.append(").");
            p.h("Tx3gDecoder", sb2.toString());
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i11 = I;
        int i12 = i10;
        E(spannableStringBuilder2, C, this.f12749q, i11, i12, 0);
        D(spannableStringBuilder2, m10, this.f12750r, i11, i12, 0);
    }

    private static void C(boolean z10) {
        if (!z10) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    private static void D(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    private static void E(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = true;
            boolean z11 = (i10 & 1) != 0;
            boolean z12 = (i10 & 2) != 0;
            if (z11) {
                if (z12) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z12) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            if ((i10 & 4) == 0) {
                z10 = false;
            }
            if (z10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (!z10 && !z11 && !z12) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
            }
        }
    }

    private static void F(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    private static String G(y yVar) {
        char g10;
        C(yVar.a() >= 2);
        int I = yVar.I();
        if (I == 0) {
            return "";
        }
        if (yVar.a() < 2 || ((g10 = yVar.g()) != 65279 && g10 != 65534)) {
            return yVar.A(I, e.f15604c);
        }
        return yVar.A(I, e.f15607f);
    }

    /* access modifiers changed from: protected */
    public o5.e A(byte[] bArr, int i10, boolean z10) {
        this.f12747o.M(bArr, i10);
        String G = G(this.f12747o);
        if (G.isEmpty()) {
            return b.f12754i;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(G);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        E(spannableStringBuilder2, this.f12749q, 0, 0, spannableStringBuilder.length(), 16711680);
        D(spannableStringBuilder2, this.f12750r, -1, 0, spannableStringBuilder.length(), 16711680);
        F(spannableStringBuilder, this.f12751s, 0, spannableStringBuilder.length());
        float f10 = this.f12752t;
        while (this.f12747o.a() >= 8) {
            int e10 = this.f12747o.e();
            int m10 = this.f12747o.m();
            int m11 = this.f12747o.m();
            boolean z11 = true;
            if (m11 == 1937013100) {
                if (this.f12747o.a() < 2) {
                    z11 = false;
                }
                C(z11);
                int I = this.f12747o.I();
                for (int i11 = 0; i11 < I; i11++) {
                    B(this.f12747o, spannableStringBuilder);
                }
            } else if (m11 == 1952608120 && this.f12748p) {
                if (this.f12747o.a() < 2) {
                    z11 = false;
                }
                C(z11);
                f10 = m0.q(((float) this.f12747o.I()) / ((float) this.f12753u), 0.0f, 0.95f);
            }
            this.f12747o.O(e10 + m10);
        }
        return new b(new a.b().n(spannableStringBuilder).g(f10, 0).h(0).a());
    }
}
