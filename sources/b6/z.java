package b6;

import e4.b;

/* compiled from: VideoSize */
public final class z {

    /* renamed from: e  reason: collision with root package name */
    public static final z f5135e = new z(0, 0);

    /* renamed from: f  reason: collision with root package name */
    public static final b<z> f5136f = y.f5134a;

    /* renamed from: a  reason: collision with root package name */
    public final int f5137a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5138b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5139c;

    /* renamed from: d  reason: collision with root package name */
    public final float f5140d;

    public z(int i10, int i11) {
        this(i10, i11, 0, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f5137a == zVar.f5137a && this.f5138b == zVar.f5138b && this.f5139c == zVar.f5139c && this.f5140d == zVar.f5140d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((217 + this.f5137a) * 31) + this.f5138b) * 31) + this.f5139c) * 31) + Float.floatToRawIntBits(this.f5140d);
    }

    public z(int i10, int i11, int i12, float f10) {
        this.f5137a = i10;
        this.f5138b = i11;
        this.f5139c = i12;
        this.f5140d = f10;
    }
}
