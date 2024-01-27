package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ChildHelper */
class b {

    /* renamed from: a  reason: collision with root package name */
    final C0070b f4198a;

    /* renamed from: b  reason: collision with root package name */
    final a f4199b = new a();

    /* renamed from: c  reason: collision with root package name */
    final List<View> f4200c = new ArrayList();

    /* compiled from: ChildHelper */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        long f4201a = 0;

        /* renamed from: b  reason: collision with root package name */
        a f4202b;

        a() {
        }

        private void c() {
            if (this.f4202b == null) {
                this.f4202b = new a();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i10) {
            if (i10 >= 64) {
                a aVar = this.f4202b;
                if (aVar != null) {
                    aVar.a(i10 - 64);
                    return;
                }
                return;
            }
            this.f4201a &= ~(1 << i10);
        }

        /* access modifiers changed from: package-private */
        public int b(int i10) {
            a aVar = this.f4202b;
            if (aVar == null) {
                if (i10 >= 64) {
                    return Long.bitCount(this.f4201a);
                }
                return Long.bitCount(this.f4201a & ((1 << i10) - 1));
            } else if (i10 < 64) {
                return Long.bitCount(this.f4201a & ((1 << i10) - 1));
            } else {
                return aVar.b(i10 - 64) + Long.bitCount(this.f4201a);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i10) {
            if (i10 < 64) {
                return (this.f4201a & (1 << i10)) != 0;
            }
            c();
            return this.f4202b.d(i10 - 64);
        }

        /* access modifiers changed from: package-private */
        public boolean e(int i10) {
            if (i10 >= 64) {
                c();
                return this.f4202b.e(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f4201a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f4201a = j12;
            long j13 = j10 - 1;
            this.f4201a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f4202b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    g(63);
                }
                this.f4202b.e(0);
            }
            return z10;
        }

        /* access modifiers changed from: package-private */
        public void f() {
            this.f4201a = 0;
            a aVar = this.f4202b;
            if (aVar != null) {
                aVar.f();
            }
        }

        /* access modifiers changed from: package-private */
        public void g(int i10) {
            if (i10 >= 64) {
                c();
                this.f4202b.g(i10 - 64);
                return;
            }
            this.f4201a |= 1 << i10;
        }

        public String toString() {
            if (this.f4202b == null) {
                return Long.toBinaryString(this.f4201a);
            }
            return this.f4202b.toString() + "xx" + Long.toBinaryString(this.f4201a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b  reason: collision with other inner class name */
    /* compiled from: ChildHelper */
    interface C0070b {
        View a(int i10);

        int b();

        void c();

        int d(View view);

        RecyclerView.c0 e(View view);

        void f(int i10);

        void g(View view);

        void h(int i10);
    }

    b(C0070b bVar) {
        this.f4198a = bVar;
    }

    private int e(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int b10 = this.f4198a.b();
        int i11 = i10;
        while (i11 < b10) {
            int b11 = i10 - (i11 - this.f4199b.b(i11));
            if (b11 == 0) {
                while (this.f4199b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += b11;
        }
        return -1;
    }

    private boolean n(View view) {
        if (!this.f4200c.remove(view)) {
            return false;
        }
        this.f4198a.g(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a(int i10) {
        int e10 = e(i10);
        this.f4199b.e(e10);
        this.f4198a.f(e10);
    }

    /* access modifiers changed from: package-private */
    public View b(int i10) {
        int size = this.f4200c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f4200c.get(i11);
            RecyclerView.c0 e10 = this.f4198a.e(view);
            if (e10.k() == i10 && !e10.q() && !e10.s()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View c(int i10) {
        return this.f4198a.a(e(i10));
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f4198a.b() - this.f4200c.size();
    }

    /* access modifiers changed from: package-private */
    public View f(int i10) {
        return this.f4198a.a(i10);
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f4198a.b();
    }

    /* access modifiers changed from: package-private */
    public int h(View view) {
        int d10 = this.f4198a.d(view);
        if (d10 != -1 && !this.f4199b.d(d10)) {
            return d10 - this.f4199b.b(d10);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public boolean i(View view) {
        return this.f4200c.contains(view);
    }

    /* access modifiers changed from: package-private */
    public void j() {
        this.f4199b.f();
        for (int size = this.f4200c.size() - 1; size >= 0; size--) {
            this.f4198a.g(this.f4200c.get(size));
            this.f4200c.remove(size);
        }
        this.f4198a.c();
    }

    /* access modifiers changed from: package-private */
    public void k(int i10) {
        int e10 = e(i10);
        View a10 = this.f4198a.a(e10);
        if (a10 != null) {
            if (this.f4199b.e(e10)) {
                n(a10);
            }
            this.f4198a.h(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean l(View view) {
        int d10 = this.f4198a.d(view);
        if (d10 == -1) {
            n(view);
            return true;
        } else if (!this.f4199b.d(d10)) {
            return false;
        } else {
            this.f4199b.e(d10);
            n(view);
            this.f4198a.h(d10);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void m(View view) {
        int d10 = this.f4198a.d(view);
        if (d10 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f4199b.d(d10)) {
            this.f4199b.a(d10);
            n(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f4199b.toString() + ", hidden list:" + this.f4200c.size();
    }
}
