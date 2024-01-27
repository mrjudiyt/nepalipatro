package androidx.media2.session;

import androidx.core.util.c;
import androidx.media2.common.Rating;

public final class HeartRating implements Rating {

    /* renamed from: a  reason: collision with root package name */
    boolean f3802a = false;

    /* renamed from: b  reason: collision with root package name */
    boolean f3803b;

    public boolean equals(Object obj) {
        if (!(obj instanceof HeartRating)) {
            return false;
        }
        HeartRating heartRating = (HeartRating) obj;
        if (this.f3803b == heartRating.f3803b && this.f3802a == heartRating.f3802a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return c.b(Boolean.valueOf(this.f3802a), Boolean.valueOf(this.f3803b));
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("HeartRating: ");
        if (this.f3802a) {
            str = "hasHeart=" + this.f3803b;
        } else {
            str = "unrated";
        }
        sb.append(str);
        return sb.toString();
    }
}
