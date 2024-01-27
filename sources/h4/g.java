package h4;

import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import h4.f;
import java.util.ArrayDeque;

/* compiled from: SimpleDecoder */
public abstract class g<I extends DecoderInputBuffer, O extends f, E extends DecoderException> implements c<I, O, E> {

    /* renamed from: a  reason: collision with root package name */
    private final Thread f8972a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f8973b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque<I> f8974c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayDeque<O> f8975d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    private final I[] f8976e;

    /* renamed from: f  reason: collision with root package name */
    private final O[] f8977f;

    /* renamed from: g  reason: collision with root package name */
    private int f8978g;

    /* renamed from: h  reason: collision with root package name */
    private int f8979h;

    /* renamed from: i  reason: collision with root package name */
    private I f8980i;

    /* renamed from: j  reason: collision with root package name */
    private E f8981j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f8982k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f8983l;

    /* renamed from: m  reason: collision with root package name */
    private int f8984m;

    /* compiled from: SimpleDecoder */
    class a extends Thread {
        a(String str) {
            super(str);
        }

        public void run() {
            g.this.t();
        }
    }

    protected g(I[] iArr, O[] oArr) {
        this.f8976e = iArr;
        this.f8978g = iArr.length;
        for (int i10 = 0; i10 < this.f8978g; i10++) {
            this.f8976e[i10] = g();
        }
        this.f8977f = oArr;
        this.f8979h = oArr.length;
        for (int i11 = 0; i11 < this.f8979h; i11++) {
            this.f8977f[i11] = h();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f8972a = aVar;
        aVar.start();
    }

    private boolean f() {
        return !this.f8974c.isEmpty() && this.f8979h > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r1.p() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r3.g(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r1.o() == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r3.g(Integer.MIN_VALUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0 = j(r1, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        r0 = i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        r0 = i(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean k() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f8973b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r6.f8983l     // Catch:{ all -> 0x0090 }
            if (r1 != 0) goto L_0x0013
            boolean r1 = r6.f()     // Catch:{ all -> 0x0090 }
            if (r1 != 0) goto L_0x0013
            java.lang.Object r1 = r6.f8973b     // Catch:{ all -> 0x0090 }
            r1.wait()     // Catch:{ all -> 0x0090 }
            goto L_0x0003
        L_0x0013:
            boolean r1 = r6.f8983l     // Catch:{ all -> 0x0090 }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            return r2
        L_0x001a:
            java.util.ArrayDeque<I> r1 = r6.f8974c     // Catch:{ all -> 0x0090 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x0090 }
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r1 = (com.google.android.exoplayer2.decoder.DecoderInputBuffer) r1     // Catch:{ all -> 0x0090 }
            O[] r3 = r6.f8977f     // Catch:{ all -> 0x0090 }
            int r4 = r6.f8979h     // Catch:{ all -> 0x0090 }
            r5 = 1
            int r4 = r4 - r5
            r6.f8979h = r4     // Catch:{ all -> 0x0090 }
            r3 = r3[r4]     // Catch:{ all -> 0x0090 }
            boolean r4 = r6.f8982k     // Catch:{ all -> 0x0090 }
            r6.f8982k = r2     // Catch:{ all -> 0x0090 }
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            boolean r0 = r1.p()
            if (r0 == 0) goto L_0x003c
            r0 = 4
            r3.g(r0)
            goto L_0x0063
        L_0x003c:
            boolean r0 = r1.o()
            if (r0 == 0) goto L_0x0047
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.g(r0)
        L_0x0047:
            com.google.android.exoplayer2.decoder.DecoderException r0 = r6.j(r1, r3, r4)     // Catch:{ RuntimeException -> 0x0052, OutOfMemoryError -> 0x004c }
            goto L_0x0057
        L_0x004c:
            r0 = move-exception
            com.google.android.exoplayer2.decoder.DecoderException r0 = r6.i(r0)
            goto L_0x0057
        L_0x0052:
            r0 = move-exception
            com.google.android.exoplayer2.decoder.DecoderException r0 = r6.i(r0)
        L_0x0057:
            if (r0 == 0) goto L_0x0063
            java.lang.Object r4 = r6.f8973b
            monitor-enter(r4)
            r6.f8981j = r0     // Catch:{ all -> 0x0060 }
            monitor-exit(r4)     // Catch:{ all -> 0x0060 }
            return r2
        L_0x0060:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0060 }
            throw r0
        L_0x0063:
            java.lang.Object r4 = r6.f8973b
            monitor-enter(r4)
            boolean r0 = r6.f8982k     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x006e
            r3.s()     // Catch:{ all -> 0x008d }
            goto L_0x0088
        L_0x006e:
            boolean r0 = r3.o()     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x007d
            int r0 = r6.f8984m     // Catch:{ all -> 0x008d }
            int r0 = r0 + r5
            r6.f8984m = r0     // Catch:{ all -> 0x008d }
            r3.s()     // Catch:{ all -> 0x008d }
            goto L_0x0088
        L_0x007d:
            int r0 = r6.f8984m     // Catch:{ all -> 0x008d }
            r3.f8971j = r0     // Catch:{ all -> 0x008d }
            r6.f8984m = r2     // Catch:{ all -> 0x008d }
            java.util.ArrayDeque<O> r0 = r6.f8975d     // Catch:{ all -> 0x008d }
            r0.addLast(r3)     // Catch:{ all -> 0x008d }
        L_0x0088:
            r6.q(r1)     // Catch:{ all -> 0x008d }
            monitor-exit(r4)     // Catch:{ all -> 0x008d }
            return r5
        L_0x008d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x008d }
            throw r0
        L_0x0090:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.g.k():boolean");
    }

    private void n() {
        if (f()) {
            this.f8973b.notify();
        }
    }

    private void o() {
        E e10 = this.f8981j;
        if (e10 != null) {
            throw e10;
        }
    }

    private void q(I i10) {
        i10.k();
        I[] iArr = this.f8976e;
        int i11 = this.f8978g;
        this.f8978g = i11 + 1;
        iArr[i11] = i10;
    }

    private void s(O o10) {
        o10.k();
        O[] oArr = this.f8977f;
        int i10 = this.f8979h;
        this.f8979h = i10 + 1;
        oArr[i10] = o10;
    }

    /* access modifiers changed from: private */
    public void t() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (k());
    }

    public final void flush() {
        synchronized (this.f8973b) {
            this.f8982k = true;
            this.f8984m = 0;
            I i10 = this.f8980i;
            if (i10 != null) {
                q(i10);
                this.f8980i = null;
            }
            while (!this.f8974c.isEmpty()) {
                q((DecoderInputBuffer) this.f8974c.removeFirst());
            }
            while (!this.f8975d.isEmpty()) {
                ((f) this.f8975d.removeFirst()).s();
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract I g();

    /* access modifiers changed from: protected */
    public abstract O h();

    /* access modifiers changed from: protected */
    public abstract E i(Throwable th);

    /* access modifiers changed from: protected */
    public abstract E j(I i10, O o10, boolean z10);

    /* renamed from: l */
    public final I c() {
        I i10;
        synchronized (this.f8973b) {
            o();
            a6.a.f(this.f8980i == null);
            int i11 = this.f8978g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f8976e;
                int i12 = i11 - 1;
                this.f8978g = i12;
                i10 = iArr[i12];
            }
            this.f8980i = i10;
        }
        return i10;
    }

    /* renamed from: m */
    public final O b() {
        synchronized (this.f8973b) {
            o();
            if (this.f8975d.isEmpty()) {
                return null;
            }
            O o10 = (f) this.f8975d.removeFirst();
            return o10;
        }
    }

    /* renamed from: p */
    public final void d(I i10) {
        synchronized (this.f8973b) {
            o();
            a6.a.a(i10 == this.f8980i);
            this.f8974c.addLast(i10);
            n();
            this.f8980i = null;
        }
    }

    /* access modifiers changed from: protected */
    public void r(O o10) {
        synchronized (this.f8973b) {
            s(o10);
            n();
        }
    }

    public void release() {
        synchronized (this.f8973b) {
            this.f8983l = true;
            this.f8973b.notify();
        }
        try {
            this.f8972a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* access modifiers changed from: protected */
    public final void u(int i10) {
        a6.a.f(this.f8978g == this.f8976e.length);
        for (I t10 : this.f8976e) {
            t10.t(i10);
        }
    }
}
