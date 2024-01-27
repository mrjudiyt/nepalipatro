package ea;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: Segment.kt */
public final class u {

    /* renamed from: h  reason: collision with root package name */
    public static final a f14392h = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f14393a;

    /* renamed from: b  reason: collision with root package name */
    public int f14394b;

    /* renamed from: c  reason: collision with root package name */
    public int f14395c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14396d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14397e;

    /* renamed from: f  reason: collision with root package name */
    public u f14398f;

    /* renamed from: g  reason: collision with root package name */
    public u f14399g;

    /* compiled from: Segment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public u() {
        this.f14393a = new byte[8192];
        this.f14397e = true;
        this.f14396d = false;
    }

    public final void a() {
        u uVar = this.f14399g;
        int i10 = 0;
        if (uVar != this) {
            if (uVar == null) {
                m.r();
            }
            if (uVar.f14397e) {
                int i11 = this.f14395c - this.f14394b;
                u uVar2 = this.f14399g;
                if (uVar2 == null) {
                    m.r();
                }
                int i12 = 8192 - uVar2.f14395c;
                u uVar3 = this.f14399g;
                if (uVar3 == null) {
                    m.r();
                }
                if (!uVar3.f14396d) {
                    u uVar4 = this.f14399g;
                    if (uVar4 == null) {
                        m.r();
                    }
                    i10 = uVar4.f14394b;
                }
                if (i11 <= i12 + i10) {
                    u uVar5 = this.f14399g;
                    if (uVar5 == null) {
                        m.r();
                    }
                    f(uVar5, i11);
                    b();
                    v.b(this);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    public final u b() {
        u uVar = this.f14398f;
        if (uVar == this) {
            uVar = null;
        }
        u uVar2 = this.f14399g;
        if (uVar2 == null) {
            m.r();
        }
        uVar2.f14398f = this.f14398f;
        u uVar3 = this.f14398f;
        if (uVar3 == null) {
            m.r();
        }
        uVar3.f14399g = this.f14399g;
        this.f14398f = null;
        this.f14399g = null;
        return uVar;
    }

    public final u c(u uVar) {
        m.g(uVar, "segment");
        uVar.f14399g = this;
        uVar.f14398f = this.f14398f;
        u uVar2 = this.f14398f;
        if (uVar2 == null) {
            m.r();
        }
        uVar2.f14399g = uVar;
        this.f14398f = uVar;
        return uVar;
    }

    public final u d() {
        this.f14396d = true;
        return new u(this.f14393a, this.f14394b, this.f14395c, true, false);
    }

    public final u e(int i10) {
        u uVar;
        if (i10 > 0 && i10 <= this.f14395c - this.f14394b) {
            if (i10 >= 1024) {
                uVar = d();
            } else {
                uVar = v.c();
                byte[] bArr = this.f14393a;
                byte[] bArr2 = uVar.f14393a;
                int i11 = this.f14394b;
                byte[] unused = j.f(bArr, bArr2, 0, i11, i11 + i10, 2, (Object) null);
            }
            uVar.f14395c = uVar.f14394b + i10;
            this.f14394b += i10;
            u uVar2 = this.f14399g;
            if (uVar2 == null) {
                m.r();
            }
            uVar2.c(uVar);
            return uVar;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    public final void f(u uVar, int i10) {
        m.g(uVar, "sink");
        if (uVar.f14397e) {
            int i11 = uVar.f14395c;
            if (i11 + i10 > 8192) {
                if (!uVar.f14396d) {
                    int i12 = uVar.f14394b;
                    if ((i11 + i10) - i12 <= 8192) {
                        byte[] bArr = uVar.f14393a;
                        byte[] unused = j.f(bArr, bArr, 0, i12, i11, 2, (Object) null);
                        uVar.f14395c -= uVar.f14394b;
                        uVar.f14394b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f14393a;
            byte[] bArr3 = uVar.f14393a;
            int i13 = uVar.f14395c;
            int i14 = this.f14394b;
            byte[] unused2 = j.d(bArr2, bArr3, i13, i14, i14 + i10);
            uVar.f14395c += i10;
            this.f14394b += i10;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public u(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        m.g(bArr, "data");
        this.f14393a = bArr;
        this.f14394b = i10;
        this.f14395c = i11;
        this.f14396d = z10;
        this.f14397e = z11;
    }
}
