package r5;

import a6.m0;
import a6.y;
import android.graphics.Bitmap;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import o5.a;
import o5.c;
import o5.e;

/* compiled from: PgsDecoder */
public final class a extends c {

    /* renamed from: o  reason: collision with root package name */
    private final y f11183o = new y();

    /* renamed from: p  reason: collision with root package name */
    private final y f11184p = new y();

    /* renamed from: q  reason: collision with root package name */
    private final C0193a f11185q = new C0193a();

    /* renamed from: r  reason: collision with root package name */
    private Inflater f11186r;

    /* renamed from: r5.a$a  reason: collision with other inner class name */
    /* compiled from: PgsDecoder */
    private static final class C0193a {

        /* renamed from: a  reason: collision with root package name */
        private final y f11187a = new y();

        /* renamed from: b  reason: collision with root package name */
        private final int[] f11188b = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];

        /* renamed from: c  reason: collision with root package name */
        private boolean f11189c;

        /* renamed from: d  reason: collision with root package name */
        private int f11190d;

        /* renamed from: e  reason: collision with root package name */
        private int f11191e;

        /* renamed from: f  reason: collision with root package name */
        private int f11192f;

        /* renamed from: g  reason: collision with root package name */
        private int f11193g;

        /* renamed from: h  reason: collision with root package name */
        private int f11194h;

        /* renamed from: i  reason: collision with root package name */
        private int f11195i;

        /* access modifiers changed from: private */
        public void e(y yVar, int i10) {
            int F;
            if (i10 >= 4) {
                yVar.P(3);
                int i11 = i10 - 4;
                if ((yVar.C() & 128) != 0) {
                    if (i11 >= 7 && (F = yVar.F()) >= 4) {
                        this.f11194h = yVar.I();
                        this.f11195i = yVar.I();
                        this.f11187a.K(F - 4);
                        i11 -= 7;
                    } else {
                        return;
                    }
                }
                int e10 = this.f11187a.e();
                int f10 = this.f11187a.f();
                if (e10 < f10 && i11 > 0) {
                    int min = Math.min(i11, f10 - e10);
                    yVar.j(this.f11187a.d(), e10, min);
                    this.f11187a.O(e10 + min);
                }
            }
        }

        /* access modifiers changed from: private */
        public void f(y yVar, int i10) {
            if (i10 >= 19) {
                this.f11190d = yVar.I();
                this.f11191e = yVar.I();
                yVar.P(11);
                this.f11192f = yVar.I();
                this.f11193g = yVar.I();
            }
        }

        /* access modifiers changed from: private */
        public void g(y yVar, int i10) {
            if (i10 % 5 == 2) {
                yVar.P(2);
                Arrays.fill(this.f11188b, 0);
                int i11 = i10 / 5;
                int i12 = 0;
                while (i12 < i11) {
                    int C = yVar.C();
                    int C2 = yVar.C();
                    int C3 = yVar.C();
                    int C4 = yVar.C();
                    int C5 = yVar.C();
                    double d10 = (double) C2;
                    double d11 = (double) (C3 - 128);
                    int i13 = i12;
                    double d12 = (double) (C4 - 128);
                    int[] iArr = this.f11188b;
                    int r10 = m0.r((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8;
                    iArr[C] = m0.r((int) (d10 + (d12 * 1.772d)), 0, 255) | r10 | (C5 << 24) | (m0.r((int) ((1.402d * d11) + d10), 0, 255) << 16);
                    i12 = i13 + 1;
                }
                this.f11189c = true;
            }
        }

        public o5.a d() {
            int i10;
            int i11;
            int i12;
            if (this.f11190d == 0 || this.f11191e == 0 || this.f11194h == 0 || this.f11195i == 0 || this.f11187a.f() == 0 || this.f11187a.e() != this.f11187a.f() || !this.f11189c) {
                return null;
            }
            this.f11187a.O(0);
            int i13 = this.f11194h * this.f11195i;
            int[] iArr = new int[i13];
            int i14 = 0;
            while (i14 < i13) {
                int C = this.f11187a.C();
                if (C != 0) {
                    i12 = i14 + 1;
                    iArr[i14] = this.f11188b[C];
                } else {
                    int C2 = this.f11187a.C();
                    if (C2 != 0) {
                        if ((C2 & 64) == 0) {
                            i10 = C2 & 63;
                        } else {
                            i10 = ((C2 & 63) << 8) | this.f11187a.C();
                        }
                        if ((C2 & 128) == 0) {
                            i11 = 0;
                        } else {
                            i11 = this.f11188b[this.f11187a.C()];
                        }
                        i12 = i10 + i14;
                        Arrays.fill(iArr, i14, i12, i11);
                    }
                }
                i14 = i12;
            }
            return new a.b().e(Bitmap.createBitmap(iArr, this.f11194h, this.f11195i, Bitmap.Config.ARGB_8888)).j(((float) this.f11192f) / ((float) this.f11190d)).k(0).g(((float) this.f11193g) / ((float) this.f11191e), 0).h(0).m(((float) this.f11194h) / ((float) this.f11190d)).f(((float) this.f11195i) / ((float) this.f11191e)).a();
        }

        public void h() {
            this.f11190d = 0;
            this.f11191e = 0;
            this.f11192f = 0;
            this.f11193g = 0;
            this.f11194h = 0;
            this.f11195i = 0;
            this.f11187a.K(0);
            this.f11189c = false;
        }
    }

    public a() {
        super("PgsDecoder");
    }

    private void B(y yVar) {
        if (yVar.a() > 0 && yVar.h() == 120) {
            if (this.f11186r == null) {
                this.f11186r = new Inflater();
            }
            if (m0.h0(yVar, this.f11184p, this.f11186r)) {
                yVar.M(this.f11184p.d(), this.f11184p.f());
            }
        }
    }

    private static o5.a C(y yVar, C0193a aVar) {
        int f10 = yVar.f();
        int C = yVar.C();
        int I = yVar.I();
        int e10 = yVar.e() + I;
        o5.a aVar2 = null;
        if (e10 > f10) {
            yVar.O(f10);
            return null;
        }
        if (C != 128) {
            switch (C) {
                case 20:
                    aVar.g(yVar, I);
                    break;
                case 21:
                    aVar.e(yVar, I);
                    break;
                case 22:
                    aVar.f(yVar, I);
                    break;
            }
        } else {
            aVar2 = aVar.d();
            aVar.h();
        }
        yVar.O(e10);
        return aVar2;
    }

    /* access modifiers changed from: protected */
    public e A(byte[] bArr, int i10, boolean z10) {
        this.f11183o.M(bArr, i10);
        B(this.f11183o);
        this.f11185q.h();
        ArrayList arrayList = new ArrayList();
        while (this.f11183o.a() >= 3) {
            o5.a C = C(this.f11183o, this.f11185q);
            if (C != null) {
                arrayList.add(C);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }
}
