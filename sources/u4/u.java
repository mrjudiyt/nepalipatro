package u4;

import a6.a;
import java.util.Arrays;

/* compiled from: NalUnitTargetBuffer */
final class u {

    /* renamed from: a  reason: collision with root package name */
    private final int f12065a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f12066b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12067c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f12068d;

    /* renamed from: e  reason: collision with root package name */
    public int f12069e;

    public u(int i10, int i11) {
        this.f12065a = i10;
        byte[] bArr = new byte[(i11 + 3)];
        this.f12068d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f12066b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f12068d;
            int length = bArr2.length;
            int i13 = this.f12069e;
            if (length < i13 + i12) {
                this.f12068d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f12068d, this.f12069e, i12);
            this.f12069e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f12066b) {
            return false;
        }
        this.f12069e -= i10;
        this.f12066b = false;
        this.f12067c = true;
        return true;
    }

    public boolean c() {
        return this.f12067c;
    }

    public void d() {
        this.f12066b = false;
        this.f12067c = false;
    }

    public void e(int i10) {
        boolean z10 = true;
        a.f(!this.f12066b);
        if (i10 != this.f12065a) {
            z10 = false;
        }
        this.f12066b = z10;
        if (z10) {
            this.f12069e = 3;
            this.f12067c = false;
        }
    }
}
