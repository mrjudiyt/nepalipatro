package a6;

/* compiled from: TimestampAdjuster */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    private long f194a;

    /* renamed from: b  reason: collision with root package name */
    private long f195b;

    /* renamed from: c  reason: collision with root package name */
    private long f196c;

    /* renamed from: d  reason: collision with root package name */
    private final ThreadLocal<Long> f197d = new ThreadLocal<>();

    public i0(long j10) {
        g(j10);
    }

    public static long f(long j10) {
        return (j10 * 1000000) / 90000;
    }

    public static long i(long j10) {
        return (j10 * 90000) / 1000000;
    }

    public static long j(long j10) {
        return i(j10) % 8589934592L;
    }

    public synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f195b == -9223372036854775807L) {
            long j11 = this.f194a;
            if (j11 == 9223372036854775806L) {
                j11 = ((Long) a.e(this.f197d.get())).longValue();
            }
            this.f195b = j11 - j10;
            notifyAll();
        }
        this.f196c = j10;
        return j10 + this.f195b;
    }

    public synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.f196c;
        if (j11 != -9223372036854775807L) {
            long i10 = i(j11);
            long j12 = (4294967296L + i10) / 8589934592L;
            long j13 = ((j12 - 1) * 8589934592L) + j10;
            j10 += j12 * 8589934592L;
            if (Math.abs(j13 - i10) < Math.abs(j10 - i10)) {
                j10 = j13;
            }
        }
        return a(f(j10));
    }

    public synchronized long c() {
        long j10;
        j10 = this.f194a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    public synchronized long d() {
        long j10;
        long j11 = this.f196c;
        if (j11 != -9223372036854775807L) {
            j10 = j11 + this.f195b;
        } else {
            j10 = c();
        }
        return j10;
    }

    public synchronized long e() {
        return this.f195b;
    }

    public synchronized void g(long j10) {
        this.f194a = j10;
        this.f195b = j10 == Long.MAX_VALUE ? 0 : -9223372036854775807L;
        this.f196c = -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void h(boolean r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.f194a     // Catch:{ all -> 0x0037 }
            r2 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            a6.a.f(r0)     // Catch:{ all -> 0x0037 }
            long r0 = r5.f195b     // Catch:{ all -> 0x0037 }
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            monitor-exit(r5)
            return
        L_0x001f:
            if (r6 == 0) goto L_0x002b
            java.lang.ThreadLocal<java.lang.Long> r6 = r5.f197d     // Catch:{ all -> 0x0037 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0037 }
            r6.set(r7)     // Catch:{ all -> 0x0037 }
            goto L_0x0035
        L_0x002b:
            long r6 = r5.f195b     // Catch:{ all -> 0x0037 }
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0035
            r5.wait()     // Catch:{ all -> 0x0037 }
            goto L_0x002b
        L_0x0035:
            monitor-exit(r5)
            return
        L_0x0037:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.i0.h(boolean, long):void");
    }
}
