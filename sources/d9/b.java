package d9;

import java.util.NoSuchElementException;
import p8.m;

/* compiled from: ProgressionIterators.kt */
public final class b extends m {

    /* renamed from: h  reason: collision with root package name */
    private final int f14165h;

    /* renamed from: i  reason: collision with root package name */
    private final int f14166i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f14167j;

    /* renamed from: k  reason: collision with root package name */
    private int f14168k;

    public b(char c10, char c11, int i10) {
        this.f14165h = i10;
        this.f14166i = c11;
        boolean z10 = true;
        if (i10 <= 0 ? kotlin.jvm.internal.m.h(c10, c11) < 0 : kotlin.jvm.internal.m.h(c10, c11) > 0) {
            z10 = false;
        }
        this.f14167j = z10;
        this.f14168k = !z10 ? c11 : c10;
    }

    public char b() {
        int i10 = this.f14168k;
        if (i10 != this.f14166i) {
            this.f14168k = this.f14165h + i10;
        } else if (this.f14167j) {
            this.f14167j = false;
        } else {
            throw new NoSuchElementException();
        }
        return (char) i10;
    }

    public boolean hasNext() {
        return this.f14167j;
    }
}
