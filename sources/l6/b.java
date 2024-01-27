package l6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: AbstractIterator */
abstract class b<T> implements Iterator<T> {

    /* renamed from: h  reason: collision with root package name */
    private C0260b f15591h = C0260b.NOT_READY;

    /* renamed from: i  reason: collision with root package name */
    private T f15592i;

    /* compiled from: AbstractIterator */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15593a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                l6.b$b[] r0 = l6.b.C0260b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15593a = r0
                l6.b$b r1 = l6.b.C0260b.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15593a     // Catch:{ NoSuchFieldError -> 0x001d }
                l6.b$b r1 = l6.b.C0260b.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l6.b.a.<clinit>():void");
        }
    }

    /* renamed from: l6.b$b  reason: collision with other inner class name */
    /* compiled from: AbstractIterator */
    private enum C0260b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected b() {
    }

    private boolean d() {
        this.f15591h = C0260b.FAILED;
        this.f15592i = b();
        if (this.f15591h == C0260b.DONE) {
            return false;
        }
        this.f15591h = C0260b.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract T b();

    /* access modifiers changed from: protected */
    public final T c() {
        this.f15591h = C0260b.DONE;
        return null;
    }

    public final boolean hasNext() {
        p.o(this.f15591h != C0260b.FAILED);
        int i10 = a.f15593a[this.f15591h.ordinal()];
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
            this.f15591h = C0260b.NOT_READY;
            T a10 = k.a(this.f15592i);
            this.f15592i = null;
            return a10;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
