package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: ViewBoundsCheck */
class l {

    /* renamed from: a  reason: collision with root package name */
    final b f4314a;

    /* renamed from: b  reason: collision with root package name */
    a f4315b = new a();

    /* compiled from: ViewBoundsCheck */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f4316a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f4317b;

        /* renamed from: c  reason: collision with root package name */
        int f4318c;

        /* renamed from: d  reason: collision with root package name */
        int f4319d;

        /* renamed from: e  reason: collision with root package name */
        int f4320e;

        a() {
        }

        /* access modifiers changed from: package-private */
        public void a(int i10) {
            this.f4316a = i10 | this.f4316a;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            int i10 = this.f4316a;
            if ((i10 & 7) != 0 && (i10 & (c(this.f4319d, this.f4317b) << 0)) == 0) {
                return false;
            }
            int i11 = this.f4316a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f4319d, this.f4318c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f4316a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f4320e, this.f4317b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f4316a;
            if ((i13 & 28672) == 0 || (i13 & (c(this.f4320e, this.f4318c) << 12)) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f4316a = 0;
        }

        /* access modifiers changed from: package-private */
        public void e(int i10, int i11, int i12, int i13) {
            this.f4317b = i10;
            this.f4318c = i11;
            this.f4319d = i12;
            this.f4320e = i13;
        }
    }

    /* compiled from: ViewBoundsCheck */
    interface b {
        View a(int i10);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    l(b bVar) {
        this.f4314a = bVar;
    }

    /* access modifiers changed from: package-private */
    public View a(int i10, int i11, int i12, int i13) {
        int c10 = this.f4314a.c();
        int d10 = this.f4314a.d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View a10 = this.f4314a.a(i10);
            this.f4315b.e(c10, d10, this.f4314a.b(a10), this.f4314a.e(a10));
            if (i12 != 0) {
                this.f4315b.d();
                this.f4315b.a(i12);
                if (this.f4315b.b()) {
                    return a10;
                }
            }
            if (i13 != 0) {
                this.f4315b.d();
                this.f4315b.a(i13);
                if (this.f4315b.b()) {
                    view = a10;
                }
            }
            i10 += i14;
        }
        return view;
    }
}
