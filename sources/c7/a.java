package c7;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* compiled from: GenericGF */
public final class a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f13348h = new a(4201, 4096, 1);

    /* renamed from: i  reason: collision with root package name */
    public static final a f13349i = new a(1033, 1024, 1);

    /* renamed from: j  reason: collision with root package name */
    public static final a f13350j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f13351k = new a(19, 16, 1);

    /* renamed from: l  reason: collision with root package name */
    public static final a f13352l = new a(285, UserVerificationMethods.USER_VERIFY_HANDPRINT, 0);

    /* renamed from: m  reason: collision with root package name */
    public static final a f13353m;

    /* renamed from: n  reason: collision with root package name */
    public static final a f13354n;

    /* renamed from: o  reason: collision with root package name */
    public static final a f13355o;

    /* renamed from: a  reason: collision with root package name */
    private final int[] f13356a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f13357b;

    /* renamed from: c  reason: collision with root package name */
    private final b f13358c;

    /* renamed from: d  reason: collision with root package name */
    private final b f13359d;

    /* renamed from: e  reason: collision with root package name */
    private final int f13360e;

    /* renamed from: f  reason: collision with root package name */
    private final int f13361f;

    /* renamed from: g  reason: collision with root package name */
    private final int f13362g;

    static {
        a aVar = new a(67, 64, 1);
        f13350j = aVar;
        a aVar2 = new a(301, UserVerificationMethods.USER_VERIFY_HANDPRINT, 1);
        f13353m = aVar2;
        f13354n = aVar2;
        f13355o = aVar;
    }

    public a(int i10, int i11, int i12) {
        this.f13361f = i10;
        this.f13360e = i11;
        this.f13362g = i12;
        this.f13356a = new int[i11];
        this.f13357b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f13356a[i14] = i13;
            i13 <<= 1;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f13357b[this.f13356a[i15]] = i15;
        }
        this.f13358c = new b(this, new int[]{0});
        this.f13359d = new b(this, new int[]{1});
    }

    static int a(int i10, int i11) {
        return i10 ^ i11;
    }

    /* access modifiers changed from: package-private */
    public b b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        } else if (i11 == 0) {
            return this.f13358c;
        } else {
            int[] iArr = new int[(i10 + 1)];
            iArr[0] = i11;
            return new b(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    public int c(int i10) {
        return this.f13356a[i10];
    }

    public int d() {
        return this.f13362g;
    }

    /* access modifiers changed from: package-private */
    public b e() {
        return this.f13358c;
    }

    /* access modifiers changed from: package-private */
    public int f(int i10) {
        if (i10 != 0) {
            return this.f13356a[(this.f13360e - this.f13357b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    public int g(int i10) {
        if (i10 != 0) {
            return this.f13357b[i10];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public int h(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f13356a;
        int[] iArr2 = this.f13357b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f13360e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f13361f) + ',' + this.f13360e + ')';
    }
}
