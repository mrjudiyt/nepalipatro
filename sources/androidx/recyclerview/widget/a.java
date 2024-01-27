package androidx.recyclerview.widget;

import androidx.core.util.e;
import androidx.core.util.f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AdapterHelper */
class a implements g.a {

    /* renamed from: a  reason: collision with root package name */
    private e<b> f4186a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<b> f4187b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<b> f4188c;

    /* renamed from: d  reason: collision with root package name */
    final C0069a f4189d;

    /* renamed from: e  reason: collision with root package name */
    Runnable f4190e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f4191f;

    /* renamed from: g  reason: collision with root package name */
    final g f4192g;

    /* renamed from: h  reason: collision with root package name */
    private int f4193h;

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    /* compiled from: AdapterHelper */
    interface C0069a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(int i10, int i11, Object obj);

        void d(b bVar);

        RecyclerView.c0 e(int i10);

        void f(int i10, int i11);

        void g(int i10, int i11);

        void h(int i10, int i11);
    }

    /* compiled from: AdapterHelper */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        int f4194a;

        /* renamed from: b  reason: collision with root package name */
        int f4195b;

        /* renamed from: c  reason: collision with root package name */
        Object f4196c;

        /* renamed from: d  reason: collision with root package name */
        int f4197d;

        b(int i10, int i11, int i12, Object obj) {
            this.f4194a = i10;
            this.f4195b = i11;
            this.f4197d = i12;
            this.f4196c = obj;
        }

        /* access modifiers changed from: package-private */
        public String a() {
            int i10 = this.f4194a;
            if (i10 == 1) {
                return ProductAction.ACTION_ADD;
            }
            if (i10 == 2) {
                return "rm";
            }
            if (i10 != 4) {
                return i10 != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f4194a;
            if (i10 != bVar.f4194a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f4197d - this.f4195b) == 1 && this.f4197d == bVar.f4195b && this.f4195b == bVar.f4197d) {
                return true;
            }
            if (this.f4197d != bVar.f4197d || this.f4195b != bVar.f4195b) {
                return false;
            }
            Object obj2 = this.f4196c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f4196c)) {
                    return false;
                }
            } else if (bVar.f4196c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f4194a * 31) + this.f4195b) * 31) + this.f4197d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f4195b + "c:" + this.f4197d + ",p:" + this.f4196c + "]";
        }
    }

    a(C0069a aVar) {
        this(aVar, false);
    }

    private void c(b bVar) {
        q(bVar);
    }

    private void d(b bVar) {
        q(bVar);
    }

    private void f(b bVar) {
        char c10;
        boolean z10;
        boolean z11;
        int i10 = bVar.f4195b;
        int i11 = bVar.f4197d + i10;
        char c11 = 65535;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f4189d.e(i12) != null || h(i12)) {
                if (c11 == 0) {
                    k(b(2, i10, i13, (Object) null));
                    z11 = true;
                } else {
                    z11 = false;
                }
                c10 = 1;
            } else {
                if (c11 == 1) {
                    q(b(2, i10, i13, (Object) null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            c11 = c10;
        }
        if (i13 != bVar.f4197d) {
            a(bVar);
            bVar = b(2, i10, i13, (Object) null);
        }
        if (c11 == 0) {
            k(bVar);
        } else {
            q(bVar);
        }
    }

    private void g(b bVar) {
        int i10 = bVar.f4195b;
        int i11 = bVar.f4197d + i10;
        int i12 = i10;
        char c10 = 65535;
        int i13 = 0;
        while (i10 < i11) {
            if (this.f4189d.e(i10) != null || h(i10)) {
                if (c10 == 0) {
                    k(b(4, i12, i13, bVar.f4196c));
                    i12 = i10;
                    i13 = 0;
                }
                c10 = 1;
            } else {
                if (c10 == 1) {
                    q(b(4, i12, i13, bVar.f4196c));
                    i12 = i10;
                    i13 = 0;
                }
                c10 = 0;
            }
            i13++;
            i10++;
        }
        if (i13 != bVar.f4197d) {
            Object obj = bVar.f4196c;
            a(bVar);
            bVar = b(4, i12, i13, obj);
        }
        if (c10 == 0) {
            k(bVar);
        } else {
            q(bVar);
        }
    }

    private boolean h(int i10) {
        int size = this.f4188c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f4188c.get(i11);
            int i12 = bVar.f4194a;
            if (i12 == 8) {
                if (n(bVar.f4197d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f4195b;
                int i14 = bVar.f4197d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i10;
        int i11 = bVar.f4194a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int u10 = u(bVar.f4195b, i11);
        int i12 = bVar.f4195b;
        int i13 = bVar.f4194a;
        if (i13 == 2) {
            i10 = 0;
        } else if (i13 == 4) {
            i10 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f4197d; i15++) {
            int u11 = u(bVar.f4195b + (i10 * i15), bVar.f4194a);
            int i16 = bVar.f4194a;
            if (i16 == 2 ? u11 == u10 : i16 == 4 && u11 == u10 + 1) {
                i14++;
            } else {
                b b10 = b(i16, u10, i14, bVar.f4196c);
                l(b10, i12);
                a(b10);
                if (bVar.f4194a == 4) {
                    i12 += i14;
                }
                u10 = u11;
                i14 = 1;
            }
        }
        Object obj = bVar.f4196c;
        a(bVar);
        if (i14 > 0) {
            b b11 = b(bVar.f4194a, u10, i14, obj);
            l(b11, i12);
            a(b11);
        }
    }

    private void q(b bVar) {
        this.f4188c.add(bVar);
        int i10 = bVar.f4194a;
        if (i10 == 1) {
            this.f4189d.g(bVar.f4195b, bVar.f4197d);
        } else if (i10 == 2) {
            this.f4189d.f(bVar.f4195b, bVar.f4197d);
        } else if (i10 == 4) {
            this.f4189d.c(bVar.f4195b, bVar.f4197d, bVar.f4196c);
        } else if (i10 == 8) {
            this.f4189d.a(bVar.f4195b, bVar.f4197d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int u(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f4188c.size() - 1; size >= 0; size--) {
            b bVar = this.f4188c.get(size);
            int i14 = bVar.f4194a;
            if (i14 == 8) {
                int i15 = bVar.f4195b;
                int i16 = bVar.f4197d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f4195b = i15 + 1;
                            bVar.f4197d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f4195b = i15 - 1;
                            bVar.f4197d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f4197d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f4197d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f4195b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f4195b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f4195b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f4197d;
                    } else if (i14 == 2) {
                        i10 += bVar.f4197d;
                    }
                } else if (i11 == 1) {
                    bVar.f4195b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f4195b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f4188c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f4188c.get(size2);
            if (bVar2.f4194a == 8) {
                int i18 = bVar2.f4197d;
                if (i18 == bVar2.f4195b || i18 < 0) {
                    this.f4188c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f4197d <= 0) {
                this.f4188c.remove(size2);
                a(bVar2);
            }
        }
        return i10;
    }

    public void a(b bVar) {
        if (!this.f4191f) {
            bVar.f4196c = null;
            this.f4186a.a(bVar);
        }
    }

    public b b(int i10, int i11, int i12, Object obj) {
        b b10 = this.f4186a.b();
        if (b10 == null) {
            return new b(i10, i11, i12, obj);
        }
        b10.f4194a = i10;
        b10.f4195b = i11;
        b10.f4197d = i12;
        b10.f4196c = obj;
        return b10;
    }

    public int e(int i10) {
        int size = this.f4187b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f4187b.get(i11);
            int i12 = bVar.f4194a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f4195b;
                    if (i13 <= i10) {
                        int i14 = bVar.f4197d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f4195b;
                    if (i15 == i10) {
                        i10 = bVar.f4197d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f4197d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f4195b <= i10) {
                i10 += bVar.f4197d;
            }
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        int size = this.f4188c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4189d.d(this.f4188c.get(i10));
        }
        s(this.f4188c);
        this.f4193h = 0;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        i();
        int size = this.f4187b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f4187b.get(i10);
            int i11 = bVar.f4194a;
            if (i11 == 1) {
                this.f4189d.d(bVar);
                this.f4189d.g(bVar.f4195b, bVar.f4197d);
            } else if (i11 == 2) {
                this.f4189d.d(bVar);
                this.f4189d.h(bVar.f4195b, bVar.f4197d);
            } else if (i11 == 4) {
                this.f4189d.d(bVar);
                this.f4189d.c(bVar.f4195b, bVar.f4197d, bVar.f4196c);
            } else if (i11 == 8) {
                this.f4189d.d(bVar);
                this.f4189d.a(bVar.f4195b, bVar.f4197d);
            }
            Runnable runnable = this.f4190e;
            if (runnable != null) {
                runnable.run();
            }
        }
        s(this.f4187b);
        this.f4193h = 0;
    }

    /* access modifiers changed from: package-private */
    public void l(b bVar, int i10) {
        this.f4189d.b(bVar);
        int i11 = bVar.f4194a;
        if (i11 == 2) {
            this.f4189d.h(i10, bVar.f4197d);
        } else if (i11 == 4) {
            this.f4189d.c(i10, bVar.f4197d, bVar.f4196c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    public int m(int i10) {
        return n(i10, 0);
    }

    /* access modifiers changed from: package-private */
    public int n(int i10, int i11) {
        int size = this.f4188c.size();
        while (i11 < size) {
            b bVar = this.f4188c.get(i11);
            int i12 = bVar.f4194a;
            if (i12 == 8) {
                int i13 = bVar.f4195b;
                if (i13 == i10) {
                    i10 = bVar.f4197d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f4197d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f4195b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f4197d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f4197d;
                }
            }
            i11++;
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public boolean o(int i10) {
        return (i10 & this.f4193h) != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.f4187b.size() > 0;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        this.f4192g.b(this.f4187b);
        int size = this.f4187b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f4187b.get(i10);
            int i11 = bVar.f4194a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f4190e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f4187b.clear();
    }

    /* access modifiers changed from: package-private */
    public void s(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(list.get(i10));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    public void t() {
        s(this.f4187b);
        s(this.f4188c);
        this.f4193h = 0;
    }

    a(C0069a aVar, boolean z10) {
        this.f4186a = new f(30);
        this.f4187b = new ArrayList<>();
        this.f4188c = new ArrayList<>();
        this.f4193h = 0;
        this.f4189d = aVar;
        this.f4191f = z10;
        this.f4192g = new g(this);
    }
}
