package o8;

import d9.f;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: KotlinVersion.kt */
public final class e implements Comparable<e> {

    /* renamed from: l  reason: collision with root package name */
    public static final a f16174l = new a((g) null);

    /* renamed from: m  reason: collision with root package name */
    public static final e f16175m = f.a();

    /* renamed from: h  reason: collision with root package name */
    private final int f16176h;

    /* renamed from: i  reason: collision with root package name */
    private final int f16177i;

    /* renamed from: j  reason: collision with root package name */
    private final int f16178j;

    /* renamed from: k  reason: collision with root package name */
    private final int f16179k;

    /* compiled from: KotlinVersion.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public e(int i10, int i11, int i12) {
        this.f16176h = i10;
        this.f16177i = i11;
        this.f16178j = i12;
        this.f16179k = d(i10, i11, i12);
    }

    private final int d(int i10, int i11, int i12) {
        boolean z10 = false;
        if (new f(0, 255).f(i10) && new f(0, 255).f(i11) && new f(0, 255).f(i12)) {
            z10 = true;
        }
        if (z10) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    /* renamed from: a */
    public int compareTo(e eVar) {
        m.f(eVar, "other");
        return this.f16179k - eVar.f16179k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        e eVar = obj instanceof e ? (e) obj : null;
        if (eVar != null && this.f16179k == eVar.f16179k) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f16179k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16176h);
        sb.append('.');
        sb.append(this.f16177i);
        sb.append('.');
        sb.append(this.f16178j);
        return sb.toString();
    }
}
