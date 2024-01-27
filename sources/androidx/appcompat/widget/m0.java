package androidx.appcompat.widget;

/* compiled from: RtlSpacingHelper */
class m0 {

    /* renamed from: a  reason: collision with root package name */
    private int f1153a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f1154b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f1155c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    private int f1156d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private int f1157e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f1158f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1159g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1160h = false;

    m0() {
    }

    public int a() {
        return this.f1159g ? this.f1153a : this.f1154b;
    }

    public int b() {
        return this.f1153a;
    }

    public int c() {
        return this.f1154b;
    }

    public int d() {
        return this.f1159g ? this.f1154b : this.f1153a;
    }

    public void e(int i10, int i11) {
        this.f1160h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f1157e = i10;
            this.f1153a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1158f = i11;
            this.f1154b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 != this.f1159g) {
            this.f1159g = z10;
            if (!this.f1160h) {
                this.f1153a = this.f1157e;
                this.f1154b = this.f1158f;
            } else if (z10) {
                int i10 = this.f1156d;
                if (i10 == Integer.MIN_VALUE) {
                    i10 = this.f1157e;
                }
                this.f1153a = i10;
                int i11 = this.f1155c;
                if (i11 == Integer.MIN_VALUE) {
                    i11 = this.f1158f;
                }
                this.f1154b = i11;
            } else {
                int i12 = this.f1155c;
                if (i12 == Integer.MIN_VALUE) {
                    i12 = this.f1157e;
                }
                this.f1153a = i12;
                int i13 = this.f1156d;
                if (i13 == Integer.MIN_VALUE) {
                    i13 = this.f1158f;
                }
                this.f1154b = i13;
            }
        }
    }

    public void g(int i10, int i11) {
        this.f1155c = i10;
        this.f1156d = i11;
        this.f1160h = true;
        if (this.f1159g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1153a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1154b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1153a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1154b = i11;
        }
    }
}
