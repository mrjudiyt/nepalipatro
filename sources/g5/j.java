package g5;

/* compiled from: MediaPeriodId */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8900a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8901b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8902c;

    /* renamed from: d  reason: collision with root package name */
    public final long f8903d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8904e;

    public j(Object obj) {
        this(obj, -1);
    }

    public j a(Object obj) {
        if (this.f8900a.equals(obj)) {
            return this;
        }
        return new j(obj, this.f8901b, this.f8902c, this.f8903d, this.f8904e);
    }

    public boolean b() {
        return this.f8901b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f8900a.equals(jVar.f8900a) && this.f8901b == jVar.f8901b && this.f8902c == jVar.f8902c && this.f8903d == jVar.f8903d && this.f8904e == jVar.f8904e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f8900a.hashCode()) * 31) + this.f8901b) * 31) + this.f8902c) * 31) + ((int) this.f8903d)) * 31) + this.f8904e;
    }

    public j(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public j(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    public j(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    protected j(j jVar) {
        this.f8900a = jVar.f8900a;
        this.f8901b = jVar.f8901b;
        this.f8902c = jVar.f8902c;
        this.f8903d = jVar.f8903d;
        this.f8904e = jVar.f8904e;
    }

    private j(Object obj, int i10, int i11, long j10, int i12) {
        this.f8900a = obj;
        this.f8901b = i10;
        this.f8902c = i11;
        this.f8903d = j10;
        this.f8904e = i12;
    }
}
