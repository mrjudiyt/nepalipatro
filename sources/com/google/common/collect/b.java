package com.google.common.collect;

import java.util.NoSuchElementException;
import l6.p;

/* compiled from: AbstractIterator */
public abstract class b<T> extends k1<T> {

    /* renamed from: h  reason: collision with root package name */
    private C0232b f13504h = C0232b.NOT_READY;

    /* renamed from: i  reason: collision with root package name */
    private T f13505i;

    /* compiled from: AbstractIterator */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f13506a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.collect.b$b[] r0 = com.google.common.collect.b.C0232b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13506a = r0
                com.google.common.collect.b$b r1 = com.google.common.collect.b.C0232b.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13506a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.collect.b$b r1 = com.google.common.collect.b.C0232b.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.b.a.<clinit>():void");
        }
    }

    /* renamed from: com.google.common.collect.b$b  reason: collision with other inner class name */
    /* compiled from: AbstractIterator */
    private enum C0232b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected b() {
    }

    private boolean d() {
        this.f13504h = C0232b.FAILED;
        this.f13505i = b();
        if (this.f13504h == C0232b.DONE) {
            return false;
        }
        this.f13504h = C0232b.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract T b();

    /* access modifiers changed from: protected */
    public final T c() {
        this.f13504h = C0232b.DONE;
        return null;
    }

    public final boolean hasNext() {
        p.o(this.f13504h != C0232b.FAILED);
        int i10 = a.f13506a[this.f13504h.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return d();
        }
        return true;
    }

    public final T next() {
        if (hasNext()) {
            this.f13504h = C0232b.NOT_READY;
            T a10 = t0.a(this.f13505i);
            this.f13505i = null;
            return a10;
        }
        throw new NoSuchElementException();
    }
}
