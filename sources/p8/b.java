package p8;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: AbstractIterator.kt */
public abstract class b<T> implements Iterator<T>, z8.a {

    /* renamed from: h  reason: collision with root package name */
    private o0 f16197h = o0.NotReady;

    /* renamed from: i  reason: collision with root package name */
    private T f16198i;

    /* compiled from: AbstractIterator.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16199a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                p8.o0[] r0 = p8.o0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p8.o0 r1 = p8.o0.Done     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                p8.o0 r1 = p8.o0.Ready     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f16199a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p8.b.a.<clinit>():void");
        }
    }

    private final boolean e() {
        this.f16197h = o0.f16212k;
        b();
        return this.f16197h == o0.Ready;
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    /* access modifiers changed from: protected */
    public final void c() {
        this.f16197h = o0.Done;
    }

    /* access modifiers changed from: protected */
    public final void d(T t10) {
        this.f16198i = t10;
        this.f16197h = o0.Ready;
    }

    public boolean hasNext() {
        o0 o0Var = this.f16197h;
        if (o0Var != o0.f16212k) {
            int i10 = a.f16199a[o0Var.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 != 2) {
                return e();
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public T next() {
        if (hasNext()) {
            this.f16197h = o0.NotReady;
            return this.f16198i;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
