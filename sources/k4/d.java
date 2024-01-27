package k4;

import a6.m0;
import java.util.Arrays;
import k4.y;

/* compiled from: ChunkIndex */
public final class d implements y {

    /* renamed from: a  reason: collision with root package name */
    public final int f9543a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f9544b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f9545c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f9546d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f9547e;

    /* renamed from: f  reason: collision with root package name */
    private final long f9548f;

    public d(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f9544b = iArr;
        this.f9545c = jArr;
        this.f9546d = jArr2;
        this.f9547e = jArr3;
        int length = iArr.length;
        this.f9543a = length;
        if (length > 0) {
            this.f9548f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f9548f = 0;
        }
    }

    public int b(long j10) {
        return m0.i(this.f9547e, j10, true, true);
    }

    public boolean f() {
        return true;
    }

    public y.a h(long j10) {
        int b10 = b(j10);
        z zVar = new z(this.f9547e[b10], this.f9545c[b10]);
        if (zVar.f9633a >= j10 || b10 == this.f9543a - 1) {
            return new y.a(zVar);
        }
        int i10 = b10 + 1;
        return new y.a(zVar, new z(this.f9547e[i10], this.f9545c[i10]));
    }

    public long i() {
        return this.f9548f;
    }

    public String toString() {
        int i10 = this.f9543a;
        String arrays = Arrays.toString(this.f9544b);
        String arrays2 = Arrays.toString(this.f9545c);
        String arrays3 = Arrays.toString(this.f9547e);
        String arrays4 = Arrays.toString(this.f9546d);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 71 + String.valueOf(arrays2).length() + String.valueOf(arrays3).length() + String.valueOf(arrays4).length());
        sb.append("ChunkIndex(length=");
        sb.append(i10);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        sb.append(arrays2);
        sb.append(", timeUs=");
        sb.append(arrays3);
        sb.append(", durationsUs=");
        sb.append(arrays4);
        sb.append(")");
        return sb.toString();
    }
}
