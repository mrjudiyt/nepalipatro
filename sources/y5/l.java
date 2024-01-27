package y5;

import java.util.Arrays;

/* compiled from: TrackSelectionArray */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final int f13052a;

    /* renamed from: b  reason: collision with root package name */
    private final k[] f13053b;

    /* renamed from: c  reason: collision with root package name */
    private int f13054c;

    public l(k... kVarArr) {
        this.f13053b = kVarArr;
        this.f13052a = kVarArr.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f13053b, ((l) obj).f13053b);
    }

    public int hashCode() {
        if (this.f13054c == 0) {
            this.f13054c = 527 + Arrays.hashCode(this.f13053b);
        }
        return this.f13054c;
    }
}
