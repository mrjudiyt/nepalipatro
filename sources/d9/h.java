package d9;

import java.util.NoSuchElementException;
import p8.d0;

/* compiled from: ProgressionIterators.kt */
public final class h extends d0 {

    /* renamed from: h  reason: collision with root package name */
    private final long f14185h;

    /* renamed from: i  reason: collision with root package name */
    private final long f14186i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f14187j;

    /* renamed from: k  reason: collision with root package name */
    private long f14188k;

    public h(long j10, long j11, long j12) {
        this.f14185h = j12;
        this.f14186i = j11;
        boolean z10 = true;
        int i10 = (j12 > 0 ? 1 : (j12 == 0 ? 0 : -1));
        int i11 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 <= 0 ? i11 < 0 : i11 > 0) {
            z10 = false;
        }
        this.f14187j = z10;
        this.f14188k = !z10 ? j11 : j10;
    }

    public long b() {
        long j10 = this.f14188k;
        if (j10 != this.f14186i) {
            this.f14188k = this.f14185h + j10;
        } else if (this.f14187j) {
            this.f14187j = false;
        } else {
            throw new NoSuchElementException();
        }
        return j10;
    }

    public boolean hasNext() {
        return this.f14187j;
    }
}
