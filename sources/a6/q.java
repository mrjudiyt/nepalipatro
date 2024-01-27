package a6;

import java.util.Arrays;

/* compiled from: LongArray */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private int f235a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f236b;

    public q() {
        this(32);
    }

    public void a(long j10) {
        int i10 = this.f235a;
        long[] jArr = this.f236b;
        if (i10 == jArr.length) {
            this.f236b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f236b;
        int i11 = this.f235a;
        this.f235a = i11 + 1;
        jArr2[i11] = j10;
    }

    public long b(int i10) {
        if (i10 >= 0 && i10 < this.f235a) {
            return this.f236b[i10];
        }
        int i11 = this.f235a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i10);
        sb.append(", size is ");
        sb.append(i11);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public int c() {
        return this.f235a;
    }

    public long[] d() {
        return Arrays.copyOf(this.f236b, this.f235a);
    }

    public q(int i10) {
        this.f236b = new long[i10];
    }
}
