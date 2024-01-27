package d9;

import java.util.NoSuchElementException;
import p8.c0;

/* compiled from: ProgressionIterators.kt */
public final class e extends c0 {

    /* renamed from: h  reason: collision with root package name */
    private final int f14175h;

    /* renamed from: i  reason: collision with root package name */
    private final int f14176i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f14177j;

    /* renamed from: k  reason: collision with root package name */
    private int f14178k;

    public e(int i10, int i11, int i12) {
        this.f14175h = i12;
        this.f14176i = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f14177j = z10;
        this.f14178k = !z10 ? i11 : i10;
    }

    public int b() {
        int i10 = this.f14178k;
        if (i10 != this.f14176i) {
            this.f14178k = this.f14175h + i10;
        } else if (this.f14177j) {
            this.f14177j = false;
        } else {
            throw new NoSuchElementException();
        }
        return i10;
    }

    public boolean hasNext() {
        return this.f14177j;
    }
}
