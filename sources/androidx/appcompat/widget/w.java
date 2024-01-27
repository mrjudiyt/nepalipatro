package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.content.res.h;
import androidx.core.widget.b;
import f.j;
import java.lang.ref.WeakReference;

/* compiled from: AppCompatTextHelper */
class w {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f1283a;

    /* renamed from: b  reason: collision with root package name */
    private s0 f1284b;

    /* renamed from: c  reason: collision with root package name */
    private s0 f1285c;

    /* renamed from: d  reason: collision with root package name */
    private s0 f1286d;

    /* renamed from: e  reason: collision with root package name */
    private s0 f1287e;

    /* renamed from: f  reason: collision with root package name */
    private s0 f1288f;

    /* renamed from: g  reason: collision with root package name */
    private s0 f1289g;

    /* renamed from: h  reason: collision with root package name */
    private s0 f1290h;

    /* renamed from: i  reason: collision with root package name */
    private final y f1291i;

    /* renamed from: j  reason: collision with root package name */
    private int f1292j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f1293k = -1;

    /* renamed from: l  reason: collision with root package name */
    private Typeface f1294l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1295m;

    /* compiled from: AppCompatTextHelper */
    class a extends h.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f1296a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1297b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WeakReference f1298c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f1296a = i10;
            this.f1297b = i11;
            this.f1298c = weakReference;
        }

        public void h(int i10) {
        }

        public void i(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1296a) != -1) {
                typeface = Typeface.create(typeface, i10, (this.f1297b & 2) != 0);
            }
            w.this.n(this.f1298c, typeface);
        }
    }

    w(TextView textView) {
        this.f1283a = textView;
        this.f1291i = new y(textView);
    }

    private void A(int i10, float f10) {
        this.f1291i.y(i10, f10);
    }

    private void B(Context context, u0 u0Var) {
        String n10;
        this.f1292j = u0Var.j(j.f8323a3, this.f1292j);
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 >= 28) {
            int j10 = u0Var.j(j.f8348f3, -1);
            this.f1293k = j10;
            if (j10 != -1) {
                this.f1292j = (this.f1292j & 2) | 0;
            }
        }
        int i11 = j.f8343e3;
        if (u0Var.r(i11) || u0Var.r(j.f8353g3)) {
            this.f1294l = null;
            int i12 = j.f8353g3;
            if (u0Var.r(i12)) {
                i11 = i12;
            }
            int i13 = this.f1293k;
            int i14 = this.f1292j;
            if (!context.isRestricted()) {
                try {
                    Typeface i15 = u0Var.i(i11, this.f1292j, new a(i13, i14, new WeakReference(this.f1283a)));
                    if (i15 != null) {
                        if (i10 < 28 || this.f1293k == -1) {
                            this.f1294l = i15;
                        } else {
                            this.f1294l = Typeface.create(Typeface.create(i15, 0), this.f1293k, (this.f1292j & 2) != 0);
                        }
                    }
                    this.f1295m = this.f1294l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1294l == null && (n10 = u0Var.n(i11)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f1293k == -1) {
                    this.f1294l = Typeface.create(n10, this.f1292j);
                    return;
                }
                Typeface create = Typeface.create(n10, 0);
                int i16 = this.f1293k;
                if ((this.f1292j & 2) != 0) {
                    z10 = true;
                }
                this.f1294l = Typeface.create(create, i16, z10);
                return;
            }
            return;
        }
        int i17 = j.Z2;
        if (u0Var.r(i17)) {
            this.f1295m = false;
            int j11 = u0Var.j(i17, 1);
            if (j11 == 1) {
                this.f1294l = Typeface.SANS_SERIF;
            } else if (j11 == 2) {
                this.f1294l = Typeface.SERIF;
            } else if (j11 == 3) {
                this.f1294l = Typeface.MONOSPACE;
            }
        }
    }

    private void a(Drawable drawable, s0 s0Var) {
        if (drawable != null && s0Var != null) {
            i.i(drawable, s0Var, this.f1283a.getDrawableState());
        }
    }

    private static s0 d(Context context, i iVar, int i10) {
        ColorStateList f10 = iVar.f(context, i10);
        if (f10 == null) {
            return null;
        }
        s0 s0Var = new s0();
        s0Var.f1224d = true;
        s0Var.f1221a = f10;
        return s0Var;
    }

    private void x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f1283a.getCompoundDrawablesRelative();
            TextView textView = this.f1283a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            if (i10 >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f1283a.getCompoundDrawablesRelative();
                if (!(compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null)) {
                    TextView textView2 = this.f1283a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f1283a.getCompoundDrawables();
            TextView textView3 = this.f1283a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    private void y() {
        s0 s0Var = this.f1290h;
        this.f1284b = s0Var;
        this.f1285c = s0Var;
        this.f1286d = s0Var;
        this.f1287e = s0Var;
        this.f1288f = s0Var;
        this.f1289g = s0Var;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (!(this.f1284b == null && this.f1285c == null && this.f1286d == null && this.f1287e == null)) {
            Drawable[] compoundDrawables = this.f1283a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1284b);
            a(compoundDrawables[1], this.f1285c);
            a(compoundDrawables[2], this.f1286d);
            a(compoundDrawables[3], this.f1287e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f1288f != null || this.f1289g != null) {
            Drawable[] compoundDrawablesRelative = this.f1283a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f1288f);
            a(compoundDrawablesRelative[2], this.f1289g);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f1291i.b();
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f1291i.j();
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f1291i.k();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f1291i.l();
    }

    /* access modifiers changed from: package-private */
    public int[] h() {
        return this.f1291i.m();
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.f1291i.n();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList j() {
        s0 s0Var = this.f1290h;
        if (s0Var != null) {
            return s0Var.f1221a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        s0 s0Var = this.f1290h;
        if (s0Var != null) {
            return s0Var.f1222b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.f1291i.s();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ce  */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(android.util.AttributeSet r24, int r25) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            r9 = r25
            android.widget.TextView r0 = r7.f1283a
            android.content.Context r10 = r0.getContext()
            androidx.appcompat.widget.i r11 = androidx.appcompat.widget.i.b()
            int[] r2 = f.j.f8320a0
            r12 = 0
            androidx.appcompat.widget.u0 r13 = androidx.appcompat.widget.u0.u(r10, r8, r2, r9, r12)
            android.widget.TextView r0 = r7.f1283a
            android.content.Context r1 = r0.getContext()
            android.content.res.TypedArray r4 = r13.q()
            r6 = 0
            r3 = r24
            r5 = r25
            androidx.core.view.z.Q(r0, r1, r2, r3, r4, r5, r6)
            int r0 = f.j.f8325b0
            r14 = -1
            int r0 = r13.m(r0, r14)
            int r1 = f.j.f8340e0
            boolean r2 = r13.r(r1)
            if (r2 == 0) goto L_0x0042
            int r1 = r13.m(r1, r12)
            androidx.appcompat.widget.s0 r1 = d(r10, r11, r1)
            r7.f1284b = r1
        L_0x0042:
            int r1 = f.j.f8330c0
            boolean r2 = r13.r(r1)
            if (r2 == 0) goto L_0x0054
            int r1 = r13.m(r1, r12)
            androidx.appcompat.widget.s0 r1 = d(r10, r11, r1)
            r7.f1285c = r1
        L_0x0054:
            int r1 = f.j.f8345f0
            boolean r2 = r13.r(r1)
            if (r2 == 0) goto L_0x0066
            int r1 = r13.m(r1, r12)
            androidx.appcompat.widget.s0 r1 = d(r10, r11, r1)
            r7.f1286d = r1
        L_0x0066:
            int r1 = f.j.f8335d0
            boolean r2 = r13.r(r1)
            if (r2 == 0) goto L_0x0078
            int r1 = r13.m(r1, r12)
            androidx.appcompat.widget.s0 r1 = d(r10, r11, r1)
            r7.f1287e = r1
        L_0x0078:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L_0x00a2
            int r2 = f.j.f8350g0
            boolean r3 = r13.r(r2)
            if (r3 == 0) goto L_0x0090
            int r2 = r13.m(r2, r12)
            androidx.appcompat.widget.s0 r2 = d(r10, r11, r2)
            r7.f1288f = r2
        L_0x0090:
            int r2 = f.j.f8355h0
            boolean r3 = r13.r(r2)
            if (r3 == 0) goto L_0x00a2
            int r2 = r13.m(r2, r12)
            androidx.appcompat.widget.s0 r2 = d(r10, r11, r2)
            r7.f1289g = r2
        L_0x00a2:
            r13.v()
            android.widget.TextView r2 = r7.f1283a
            android.text.method.TransformationMethod r2 = r2.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            r3 = 26
            r5 = 23
            if (r0 == r14) goto L_0x011e
            int[] r6 = f.j.X2
            androidx.appcompat.widget.u0 r0 = androidx.appcompat.widget.u0.s(r10, r0, r6)
            if (r2 != 0) goto L_0x00c9
            int r6 = f.j.f8363i3
            boolean r15 = r0.r(r6)
            if (r15 == 0) goto L_0x00c9
            boolean r6 = r0.a(r6, r12)
            r15 = 1
            goto L_0x00cb
        L_0x00c9:
            r6 = 0
            r15 = 0
        L_0x00cb:
            r7.B(r10, r0)
            if (r1 >= r5) goto L_0x00f9
            int r4 = f.j.f8328b3
            boolean r17 = r0.r(r4)
            if (r17 == 0) goto L_0x00dd
            android.content.res.ColorStateList r4 = r0.c(r4)
            goto L_0x00de
        L_0x00dd:
            r4 = 0
        L_0x00de:
            int r13 = f.j.f8333c3
            boolean r18 = r0.r(r13)
            if (r18 == 0) goto L_0x00eb
            android.content.res.ColorStateList r13 = r0.c(r13)
            goto L_0x00ec
        L_0x00eb:
            r13 = 0
        L_0x00ec:
            int r14 = f.j.f8338d3
            boolean r19 = r0.r(r14)
            if (r19 == 0) goto L_0x00fb
            android.content.res.ColorStateList r14 = r0.c(r14)
            goto L_0x00fc
        L_0x00f9:
            r4 = 0
            r13 = 0
        L_0x00fb:
            r14 = 0
        L_0x00fc:
            int r5 = f.j.f8368j3
            boolean r20 = r0.r(r5)
            if (r20 == 0) goto L_0x0109
            java.lang.String r5 = r0.n(r5)
            goto L_0x010a
        L_0x0109:
            r5 = 0
        L_0x010a:
            if (r1 < r3) goto L_0x0119
            int r3 = f.j.f8358h3
            boolean r21 = r0.r(r3)
            if (r21 == 0) goto L_0x0119
            java.lang.String r3 = r0.n(r3)
            goto L_0x011a
        L_0x0119:
            r3 = 0
        L_0x011a:
            r0.v()
            goto L_0x0125
        L_0x011e:
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0125:
            int[] r0 = f.j.X2
            androidx.appcompat.widget.u0 r0 = androidx.appcompat.widget.u0.u(r10, r8, r0, r9, r12)
            if (r2 != 0) goto L_0x0140
            int r12 = f.j.f8363i3
            boolean r22 = r0.r(r12)
            if (r22 == 0) goto L_0x0140
            r22 = r3
            r3 = 0
            boolean r6 = r0.a(r12, r3)
            r3 = 23
            r15 = 1
            goto L_0x0144
        L_0x0140:
            r22 = r3
            r3 = 23
        L_0x0144:
            if (r1 >= r3) goto L_0x016a
            int r3 = f.j.f8328b3
            boolean r12 = r0.r(r3)
            if (r12 == 0) goto L_0x0152
            android.content.res.ColorStateList r4 = r0.c(r3)
        L_0x0152:
            int r3 = f.j.f8333c3
            boolean r12 = r0.r(r3)
            if (r12 == 0) goto L_0x015e
            android.content.res.ColorStateList r13 = r0.c(r3)
        L_0x015e:
            int r3 = f.j.f8338d3
            boolean r12 = r0.r(r3)
            if (r12 == 0) goto L_0x016a
            android.content.res.ColorStateList r14 = r0.c(r3)
        L_0x016a:
            int r3 = f.j.f8368j3
            boolean r12 = r0.r(r3)
            if (r12 == 0) goto L_0x0176
            java.lang.String r5 = r0.n(r3)
        L_0x0176:
            r3 = 26
            if (r1 < r3) goto L_0x0187
            int r3 = f.j.f8358h3
            boolean r12 = r0.r(r3)
            if (r12 == 0) goto L_0x0187
            java.lang.String r3 = r0.n(r3)
            goto L_0x0189
        L_0x0187:
            r3 = r22
        L_0x0189:
            r12 = 28
            if (r1 < r12) goto L_0x01a6
            int r12 = f.j.Y2
            boolean r16 = r0.r(r12)
            if (r16 == 0) goto L_0x01a6
            r16 = r11
            r11 = -1
            int r12 = r0.e(r12, r11)
            if (r12 != 0) goto L_0x01a8
            android.widget.TextView r11 = r7.f1283a
            r12 = 0
            r8 = 0
            r11.setTextSize(r8, r12)
            goto L_0x01a8
        L_0x01a6:
            r16 = r11
        L_0x01a8:
            r7.B(r10, r0)
            r0.v()
            if (r4 == 0) goto L_0x01b5
            android.widget.TextView r0 = r7.f1283a
            r0.setTextColor(r4)
        L_0x01b5:
            if (r13 == 0) goto L_0x01bc
            android.widget.TextView r0 = r7.f1283a
            r0.setHintTextColor(r13)
        L_0x01bc:
            if (r14 == 0) goto L_0x01c3
            android.widget.TextView r0 = r7.f1283a
            r0.setLinkTextColor(r14)
        L_0x01c3:
            if (r2 != 0) goto L_0x01ca
            if (r15 == 0) goto L_0x01ca
            r7.r(r6)
        L_0x01ca:
            android.graphics.Typeface r0 = r7.f1294l
            if (r0 == 0) goto L_0x01e0
            int r2 = r7.f1293k
            r4 = -1
            if (r2 != r4) goto L_0x01db
            android.widget.TextView r2 = r7.f1283a
            int r4 = r7.f1292j
            r2.setTypeface(r0, r4)
            goto L_0x01e0
        L_0x01db:
            android.widget.TextView r2 = r7.f1283a
            r2.setTypeface(r0)
        L_0x01e0:
            if (r3 == 0) goto L_0x01e7
            android.widget.TextView r0 = r7.f1283a
            r0.setFontVariationSettings(r3)
        L_0x01e7:
            if (r5 == 0) goto L_0x020f
            r0 = 24
            if (r1 < r0) goto L_0x01f7
            android.widget.TextView r0 = r7.f1283a
            android.os.LocaleList r1 = android.os.LocaleList.forLanguageTags(r5)
            r0.setTextLocales(r1)
            goto L_0x020f
        L_0x01f7:
            r0 = 21
            if (r1 < r0) goto L_0x020f
            r0 = 44
            int r0 = r5.indexOf(r0)
            r1 = 0
            java.lang.String r0 = r5.substring(r1, r0)
            android.widget.TextView r1 = r7.f1283a
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            r1.setTextLocale(r0)
        L_0x020f:
            androidx.appcompat.widget.y r0 = r7.f1291i
            r1 = r24
            r0.t(r1, r9)
            boolean r0 = androidx.core.widget.b.f2665a
            if (r0 == 0) goto L_0x0257
            androidx.appcompat.widget.y r0 = r7.f1291i
            int r0 = r0.n()
            if (r0 == 0) goto L_0x0257
            androidx.appcompat.widget.y r0 = r7.f1291i
            int[] r0 = r0.m()
            int r2 = r0.length
            if (r2 <= 0) goto L_0x0257
            android.widget.TextView r2 = r7.f1283a
            int r2 = r2.getAutoSizeStepGranularity()
            float r2 = (float) r2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0251
            android.widget.TextView r0 = r7.f1283a
            androidx.appcompat.widget.y r2 = r7.f1291i
            int r2 = r2.k()
            androidx.appcompat.widget.y r3 = r7.f1291i
            int r3 = r3.j()
            androidx.appcompat.widget.y r4 = r7.f1291i
            int r4 = r4.l()
            r5 = 0
            r0.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            goto L_0x0257
        L_0x0251:
            r5 = 0
            android.widget.TextView r2 = r7.f1283a
            r2.setAutoSizeTextTypeUniformWithPresetSizes(r0, r5)
        L_0x0257:
            int[] r0 = f.j.f8360i0
            androidx.appcompat.widget.u0 r8 = androidx.appcompat.widget.u0.t(r10, r1, r0)
            int r0 = f.j.f8400q0
            r1 = -1
            int r0 = r8.m(r0, r1)
            r2 = r16
            if (r0 == r1) goto L_0x026e
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r3 = r0
            goto L_0x026f
        L_0x026e:
            r3 = 0
        L_0x026f:
            int r0 = f.j.f8425v0
            int r0 = r8.m(r0, r1)
            if (r0 == r1) goto L_0x027d
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r4 = r0
            goto L_0x027e
        L_0x027d:
            r4 = 0
        L_0x027e:
            int r0 = f.j.f8405r0
            int r0 = r8.m(r0, r1)
            if (r0 == r1) goto L_0x028c
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r5 = r0
            goto L_0x028d
        L_0x028c:
            r5 = 0
        L_0x028d:
            int r0 = f.j.f8390o0
            int r0 = r8.m(r0, r1)
            if (r0 == r1) goto L_0x029b
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r6 = r0
            goto L_0x029c
        L_0x029b:
            r6 = 0
        L_0x029c:
            int r0 = f.j.f8410s0
            int r0 = r8.m(r0, r1)
            if (r0 == r1) goto L_0x02aa
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r9 = r0
            goto L_0x02ab
        L_0x02aa:
            r9 = 0
        L_0x02ab:
            int r0 = f.j.f8395p0
            int r0 = r8.m(r0, r1)
            if (r0 == r1) goto L_0x02b9
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r10 = r0
            goto L_0x02ba
        L_0x02b9:
            r10 = 0
        L_0x02ba:
            r0 = r23
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r9
            r6 = r10
            r0.x(r1, r2, r3, r4, r5, r6)
            int r0 = f.j.f8415t0
            boolean r1 = r8.r(r0)
            if (r1 == 0) goto L_0x02d6
            android.content.res.ColorStateList r0 = r8.c(r0)
            android.widget.TextView r1 = r7.f1283a
            androidx.core.widget.i.f(r1, r0)
        L_0x02d6:
            int r0 = f.j.f8420u0
            boolean r1 = r8.r(r0)
            if (r1 == 0) goto L_0x02ee
            r1 = -1
            int r0 = r8.j(r0, r1)
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.c0.e(r0, r2)
            android.widget.TextView r2 = r7.f1283a
            androidx.core.widget.i.g(r2, r0)
            goto L_0x02ef
        L_0x02ee:
            r1 = -1
        L_0x02ef:
            int r0 = f.j.f8430w0
            int r0 = r8.e(r0, r1)
            int r2 = f.j.f8435x0
            int r2 = r8.e(r2, r1)
            int r3 = f.j.f8440y0
            int r3 = r8.e(r3, r1)
            r8.v()
            if (r0 == r1) goto L_0x030b
            android.widget.TextView r4 = r7.f1283a
            androidx.core.widget.i.h(r4, r0)
        L_0x030b:
            if (r2 == r1) goto L_0x0312
            android.widget.TextView r0 = r7.f1283a
            androidx.core.widget.i.i(r0, r2)
        L_0x0312:
            if (r3 == r1) goto L_0x0319
            android.widget.TextView r0 = r7.f1283a
            androidx.core.widget.i.j(r0, r3)
        L_0x0319:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w.m(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1295m) {
            this.f1294l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f1292j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (!b.f2665a) {
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        b();
    }

    /* access modifiers changed from: package-private */
    public void q(Context context, int i10) {
        String n10;
        ColorStateList c10;
        u0 s10 = u0.s(context, i10, j.X2);
        int i11 = j.f8363i3;
        if (s10.r(i11)) {
            r(s10.a(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 23) {
            int i13 = j.f8328b3;
            if (s10.r(i13) && (c10 = s10.c(i13)) != null) {
                this.f1283a.setTextColor(c10);
            }
        }
        int i14 = j.Y2;
        if (s10.r(i14) && s10.e(i14, -1) == 0) {
            this.f1283a.setTextSize(0, 0.0f);
        }
        B(context, s10);
        if (i12 >= 26) {
            int i15 = j.f8358h3;
            if (s10.r(i15) && (n10 = s10.n(i15)) != null) {
                this.f1283a.setFontVariationSettings(n10);
            }
        }
        s10.v();
        Typeface typeface = this.f1294l;
        if (typeface != null) {
            this.f1283a.setTypeface(typeface, this.f1292j);
        }
    }

    /* access modifiers changed from: package-private */
    public void r(boolean z10) {
        this.f1283a.setAllCaps(z10);
    }

    /* access modifiers changed from: package-private */
    public void s(int i10, int i11, int i12, int i13) {
        this.f1291i.u(i10, i11, i12, i13);
    }

    /* access modifiers changed from: package-private */
    public void t(int[] iArr, int i10) {
        this.f1291i.v(iArr, i10);
    }

    /* access modifiers changed from: package-private */
    public void u(int i10) {
        this.f1291i.w(i10);
    }

    /* access modifiers changed from: package-private */
    public void v(ColorStateList colorStateList) {
        if (this.f1290h == null) {
            this.f1290h = new s0();
        }
        s0 s0Var = this.f1290h;
        s0Var.f1221a = colorStateList;
        s0Var.f1224d = colorStateList != null;
        y();
    }

    /* access modifiers changed from: package-private */
    public void w(PorterDuff.Mode mode) {
        if (this.f1290h == null) {
            this.f1290h = new s0();
        }
        s0 s0Var = this.f1290h;
        s0Var.f1222b = mode;
        s0Var.f1223c = mode != null;
        y();
    }

    /* access modifiers changed from: package-private */
    public void z(int i10, float f10) {
        if (!b.f2665a && !l()) {
            A(i10, f10);
        }
    }
}
