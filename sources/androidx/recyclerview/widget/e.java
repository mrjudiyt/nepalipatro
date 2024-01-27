package androidx.recyclerview.widget;

import androidx.core.os.p;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: GapWorker */
final class e implements Runnable {

    /* renamed from: l  reason: collision with root package name */
    static final ThreadLocal<e> f4284l = new ThreadLocal<>();

    /* renamed from: m  reason: collision with root package name */
    static Comparator<c> f4285m = new a();

    /* renamed from: h  reason: collision with root package name */
    ArrayList<RecyclerView> f4286h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    long f4287i;

    /* renamed from: j  reason: collision with root package name */
    long f4288j;

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<c> f4289k = new ArrayList<>();

    /* compiled from: GapWorker */
    static class a implements Comparator<c> {
        a() {
        }

        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f4297d;
            if ((recyclerView == null) != (cVar2.f4297d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f4294a;
            if (z10 == cVar2.f4294a) {
                int i10 = cVar2.f4295b - cVar.f4295b;
                if (i10 != 0) {
                    return i10;
                }
                int i11 = cVar.f4296c - cVar2.f4296c;
                if (i11 != 0) {
                    return i11;
                }
                return 0;
            } else if (z10) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    /* compiled from: GapWorker */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        int f4290a;

        /* renamed from: b  reason: collision with root package name */
        int f4291b;

        /* renamed from: c  reason: collision with root package name */
        int[] f4292c;

        /* renamed from: d  reason: collision with root package name */
        int f4293d;

        b() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int[] iArr = this.f4292c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4293d = 0;
        }

        /* access modifiers changed from: package-private */
        public void b(RecyclerView recyclerView, boolean z10) {
            this.f4293d = 0;
            int[] iArr = this.f4292c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.n nVar = recyclerView.f4034t;
        }

        /* access modifiers changed from: package-private */
        public boolean c(int i10) {
            if (this.f4292c != null) {
                int i11 = this.f4293d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f4292c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void d(int i10, int i11) {
            this.f4290a = i10;
            this.f4291b = i11;
        }
    }

    /* compiled from: GapWorker */
    static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f4294a;

        /* renamed from: b  reason: collision with root package name */
        public int f4295b;

        /* renamed from: c  reason: collision with root package name */
        public int f4296c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f4297d;

        /* renamed from: e  reason: collision with root package name */
        public int f4298e;

        c() {
        }

        public void a() {
            this.f4294a = false;
            this.f4295b = 0;
            this.f4296c = 0;
            this.f4297d = null;
            this.f4298e = 0;
        }
    }

    e() {
    }

    private void b() {
        c cVar;
        int size = this.f4286h.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = this.f4286h.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f4023n0.b(recyclerView, false);
                i10 += recyclerView.f4023n0.f4293d;
            }
        }
        this.f4289k.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = this.f4286h.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f4023n0;
                int abs = Math.abs(bVar.f4290a) + Math.abs(bVar.f4291b);
                for (int i14 = 0; i14 < bVar.f4293d * 2; i14 += 2) {
                    if (i12 >= this.f4289k.size()) {
                        cVar = new c();
                        this.f4289k.add(cVar);
                    } else {
                        cVar = this.f4289k.get(i12);
                    }
                    int[] iArr = bVar.f4292c;
                    int i15 = iArr[i14 + 1];
                    cVar.f4294a = i15 <= abs;
                    cVar.f4295b = abs;
                    cVar.f4296c = i15;
                    cVar.f4297d = recyclerView2;
                    cVar.f4298e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f4289k, f4285m);
    }

    private void c(c cVar, long j10) {
        RecyclerView.c0 i10 = i(cVar.f4297d, cVar.f4298e, cVar.f4294a ? Long.MAX_VALUE : j10);
        if (i10 != null && i10.f4059b != null && i10.p() && !i10.q()) {
            h((RecyclerView) i10.f4059b.get(), j10);
        }
    }

    private void d(long j10) {
        int i10 = 0;
        while (i10 < this.f4289k.size()) {
            c cVar = this.f4289k.get(i10);
            if (cVar.f4297d != null) {
                c(cVar, j10);
                cVar.a();
                i10++;
            } else {
                return;
            }
        }
    }

    static boolean e(RecyclerView recyclerView, int i10) {
        int g10 = recyclerView.f4018l.g();
        for (int i11 = 0; i11 < g10; i11++) {
            RecyclerView.c0 H = RecyclerView.H(recyclerView.f4018l.f(i11));
            if (H.f4060c == i10 && !H.q()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j10) {
        if (recyclerView != null) {
            if (recyclerView.K && recyclerView.f4018l.g() != 0) {
                recyclerView.m0();
            }
            b bVar = recyclerView.f4023n0;
            bVar.b(recyclerView, true);
            if (bVar.f4293d != 0) {
                try {
                    p.a("RV Nested Prefetch");
                    recyclerView.f4025o0.c(recyclerView.f4032s);
                    for (int i10 = 0; i10 < bVar.f4293d * 2; i10 += 2) {
                        i(recyclerView, bVar.f4292c[i10], j10);
                    }
                } finally {
                    p.b();
                }
            }
        }
    }

    private RecyclerView.c0 i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.u uVar = recyclerView.f4012i;
        try {
            recyclerView.b0();
            RecyclerView.c0 A = uVar.A(i10, false, j10);
            if (A != null) {
                if (!A.p() || A.q()) {
                    uVar.a(A, false);
                } else {
                    uVar.t(A.f4058a);
                }
            }
            return A;
        } finally {
            recyclerView.d0(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f4286h.add(recyclerView);
    }

    /* access modifiers changed from: package-private */
    public void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f4287i == 0) {
            this.f4287i = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f4023n0.d(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public void g(long j10) {
        b();
        d(j10);
    }

    public void j(RecyclerView recyclerView) {
        this.f4286h.remove(recyclerView);
    }

    public void run() {
        try {
            p.a("RV Prefetch");
            if (!this.f4286h.isEmpty()) {
                int size = this.f4286h.size();
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = this.f4286h.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j10 = Math.max(recyclerView.getDrawingTime(), j10);
                    }
                }
                if (j10 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j10) + this.f4288j);
                    this.f4287i = 0;
                    p.b();
                }
            }
        } finally {
            this.f4287i = 0;
            p.b();
        }
    }
}
