package androidx.datastore.preferences.protobuf;

/* compiled from: RawMessageInfo */
final class c1 implements n0 {

    /* renamed from: a  reason: collision with root package name */
    private final p0 f2724a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2725b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f2726c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2727d;

    c1(p0 p0Var, String str, Object[] objArr) {
        this.f2724a = p0Var;
        this.f2725b = str;
        this.f2726c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f2727d = charAt;
            return;
        }
        char c10 = charAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 >= 55296) {
                c10 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            } else {
                this.f2727d = c10 | (charAt2 << i10);
                return;
            }
        }
    }

    public boolean a() {
        return (this.f2727d & 2) == 2;
    }

    public p0 b() {
        return this.f2724a;
    }

    public z0 c() {
        return (this.f2727d & 1) == 1 ? z0.PROTO2 : z0.PROTO3;
    }

    /* access modifiers changed from: package-private */
    public Object[] d() {
        return this.f2726c;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return this.f2725b;
    }
}
