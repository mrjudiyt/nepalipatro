package o5;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import b6.y;
import l6.l;

/* compiled from: Cue */
public final class a {

    /* renamed from: r  reason: collision with root package name */
    public static final a f10394r = new b().n("").a();

    /* renamed from: s  reason: collision with root package name */
    public static final e4.b<a> f10395s = y.f5134a;

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f10396a;

    /* renamed from: b  reason: collision with root package name */
    public final Layout.Alignment f10397b;

    /* renamed from: c  reason: collision with root package name */
    public final Layout.Alignment f10398c;

    /* renamed from: d  reason: collision with root package name */
    public final Bitmap f10399d;

    /* renamed from: e  reason: collision with root package name */
    public final float f10400e;

    /* renamed from: f  reason: collision with root package name */
    public final int f10401f;

    /* renamed from: g  reason: collision with root package name */
    public final int f10402g;

    /* renamed from: h  reason: collision with root package name */
    public final float f10403h;

    /* renamed from: i  reason: collision with root package name */
    public final int f10404i;

    /* renamed from: j  reason: collision with root package name */
    public final float f10405j;

    /* renamed from: k  reason: collision with root package name */
    public final float f10406k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f10407l;

    /* renamed from: m  reason: collision with root package name */
    public final int f10408m;

    /* renamed from: n  reason: collision with root package name */
    public final int f10409n;

    /* renamed from: o  reason: collision with root package name */
    public final float f10410o;

    /* renamed from: p  reason: collision with root package name */
    public final int f10411p;

    /* renamed from: q  reason: collision with root package name */
    public final float f10412q;

    /* compiled from: Cue */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private CharSequence f10413a;

        /* renamed from: b  reason: collision with root package name */
        private Bitmap f10414b;

        /* renamed from: c  reason: collision with root package name */
        private Layout.Alignment f10415c;

        /* renamed from: d  reason: collision with root package name */
        private Layout.Alignment f10416d;

        /* renamed from: e  reason: collision with root package name */
        private float f10417e;

        /* renamed from: f  reason: collision with root package name */
        private int f10418f;

        /* renamed from: g  reason: collision with root package name */
        private int f10419g;

        /* renamed from: h  reason: collision with root package name */
        private float f10420h;

        /* renamed from: i  reason: collision with root package name */
        private int f10421i;

        /* renamed from: j  reason: collision with root package name */
        private int f10422j;

        /* renamed from: k  reason: collision with root package name */
        private float f10423k;

        /* renamed from: l  reason: collision with root package name */
        private float f10424l;

        /* renamed from: m  reason: collision with root package name */
        private float f10425m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f10426n;

        /* renamed from: o  reason: collision with root package name */
        private int f10427o;

        /* renamed from: p  reason: collision with root package name */
        private int f10428p;

        /* renamed from: q  reason: collision with root package name */
        private float f10429q;

        public a a() {
            return new a(this.f10413a, this.f10415c, this.f10416d, this.f10414b, this.f10417e, this.f10418f, this.f10419g, this.f10420h, this.f10421i, this.f10422j, this.f10423k, this.f10424l, this.f10425m, this.f10426n, this.f10427o, this.f10428p, this.f10429q);
        }

        public int b() {
            return this.f10419g;
        }

        public int c() {
            return this.f10421i;
        }

        public CharSequence d() {
            return this.f10413a;
        }

        public b e(Bitmap bitmap) {
            this.f10414b = bitmap;
            return this;
        }

        public b f(float f10) {
            this.f10425m = f10;
            return this;
        }

        public b g(float f10, int i10) {
            this.f10417e = f10;
            this.f10418f = i10;
            return this;
        }

        public b h(int i10) {
            this.f10419g = i10;
            return this;
        }

        public b i(Layout.Alignment alignment) {
            this.f10416d = alignment;
            return this;
        }

        public b j(float f10) {
            this.f10420h = f10;
            return this;
        }

        public b k(int i10) {
            this.f10421i = i10;
            return this;
        }

        public b l(float f10) {
            this.f10429q = f10;
            return this;
        }

        public b m(float f10) {
            this.f10424l = f10;
            return this;
        }

        public b n(CharSequence charSequence) {
            this.f10413a = charSequence;
            return this;
        }

        public b o(Layout.Alignment alignment) {
            this.f10415c = alignment;
            return this;
        }

        public b p(float f10, int i10) {
            this.f10423k = f10;
            this.f10422j = i10;
            return this;
        }

        public b q(int i10) {
            this.f10428p = i10;
            return this;
        }

        public b r(int i10) {
            this.f10427o = i10;
            this.f10426n = true;
            return this;
        }

        public b() {
            this.f10413a = null;
            this.f10414b = null;
            this.f10415c = null;
            this.f10416d = null;
            this.f10417e = -3.4028235E38f;
            this.f10418f = Integer.MIN_VALUE;
            this.f10419g = Integer.MIN_VALUE;
            this.f10420h = -3.4028235E38f;
            this.f10421i = Integer.MIN_VALUE;
            this.f10422j = Integer.MIN_VALUE;
            this.f10423k = -3.4028235E38f;
            this.f10424l = -3.4028235E38f;
            this.f10425m = -3.4028235E38f;
            this.f10426n = false;
            this.f10427o = -16777216;
            this.f10428p = Integer.MIN_VALUE;
        }

        private b(a aVar) {
            this.f10413a = aVar.f10396a;
            this.f10414b = aVar.f10399d;
            this.f10415c = aVar.f10397b;
            this.f10416d = aVar.f10398c;
            this.f10417e = aVar.f10400e;
            this.f10418f = aVar.f10401f;
            this.f10419g = aVar.f10402g;
            this.f10420h = aVar.f10403h;
            this.f10421i = aVar.f10404i;
            this.f10422j = aVar.f10409n;
            this.f10423k = aVar.f10410o;
            this.f10424l = aVar.f10405j;
            this.f10425m = aVar.f10406k;
            this.f10426n = aVar.f10407l;
            this.f10427o = aVar.f10408m;
            this.f10428p = aVar.f10411p;
            this.f10429q = aVar.f10412q;
        }
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (TextUtils.equals(this.f10396a, aVar.f10396a) && this.f10397b == aVar.f10397b && this.f10398c == aVar.f10398c && ((bitmap = this.f10399d) != null ? !((bitmap2 = aVar.f10399d) == null || !bitmap.sameAs(bitmap2)) : aVar.f10399d == null) && this.f10400e == aVar.f10400e && this.f10401f == aVar.f10401f && this.f10402g == aVar.f10402g && this.f10403h == aVar.f10403h && this.f10404i == aVar.f10404i && this.f10405j == aVar.f10405j && this.f10406k == aVar.f10406k && this.f10407l == aVar.f10407l && this.f10408m == aVar.f10408m && this.f10409n == aVar.f10409n && this.f10410o == aVar.f10410o && this.f10411p == aVar.f10411p && this.f10412q == aVar.f10412q) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return l.b(this.f10396a, this.f10397b, this.f10398c, this.f10399d, Float.valueOf(this.f10400e), Integer.valueOf(this.f10401f), Integer.valueOf(this.f10402g), Float.valueOf(this.f10403h), Integer.valueOf(this.f10404i), Float.valueOf(this.f10405j), Float.valueOf(this.f10406k), Boolean.valueOf(this.f10407l), Integer.valueOf(this.f10408m), Integer.valueOf(this.f10409n), Float.valueOf(this.f10410o), Integer.valueOf(this.f10411p), Float.valueOf(this.f10412q));
    }

    private a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        CharSequence charSequence2 = charSequence;
        Bitmap bitmap2 = bitmap;
        if (charSequence2 == null) {
            a6.a.e(bitmap);
        } else {
            a6.a.a(bitmap2 == null);
        }
        if (charSequence2 instanceof Spanned) {
            this.f10396a = SpannedString.valueOf(charSequence);
        } else if (charSequence2 != null) {
            this.f10396a = charSequence.toString();
        } else {
            this.f10396a = null;
        }
        this.f10397b = alignment;
        this.f10398c = alignment2;
        this.f10399d = bitmap2;
        this.f10400e = f10;
        this.f10401f = i10;
        this.f10402g = i11;
        this.f10403h = f11;
        this.f10404i = i12;
        this.f10405j = f13;
        this.f10406k = f14;
        this.f10407l = z10;
        this.f10408m = i14;
        this.f10409n = i13;
        this.f10410o = f12;
        this.f10411p = i15;
        this.f10412q = f15;
    }
}
