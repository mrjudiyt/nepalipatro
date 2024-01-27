package e4;

import a6.a;
import a6.m0;
import b6.y;

/* compiled from: PlaybackParameters */
public final class m {

    /* renamed from: d  reason: collision with root package name */
    public static final m f8132d = new m(1.0f);

    /* renamed from: e  reason: collision with root package name */
    public static final b<m> f8133e = y.f5134a;

    /* renamed from: a  reason: collision with root package name */
    public final float f8134a;

    /* renamed from: b  reason: collision with root package name */
    public final float f8135b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8136c;

    public m(float f10) {
        this(f10, 1.0f);
    }

    public long a(long j10) {
        return j10 * ((long) this.f8136c);
    }

    public m b(float f10) {
        return new m(f10, this.f8135b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f8134a == mVar.f8134a && this.f8135b == mVar.f8135b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f8134a)) * 31) + Float.floatToRawIntBits(this.f8135b);
    }

    public String toString() {
        return m0.C("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f8134a), Float.valueOf(this.f8135b));
    }

    public m(float f10, float f11) {
        boolean z10 = true;
        a.a(f10 > 0.0f);
        a.a(f11 <= 0.0f ? false : z10);
        this.f8134a = f10;
        this.f8135b = f11;
        this.f8136c = Math.round(f10 * 1000.0f);
    }
}
