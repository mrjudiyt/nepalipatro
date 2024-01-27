package androidx.media2.session;

import androidx.core.util.c;
import androidx.media2.common.Rating;

public final class StarRating implements Rating {

    /* renamed from: a  reason: collision with root package name */
    int f3856a;

    /* renamed from: b  reason: collision with root package name */
    float f3857b;

    StarRating() {
    }

    public boolean c() {
        return this.f3857b >= 0.0f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StarRating)) {
            return false;
        }
        StarRating starRating = (StarRating) obj;
        if (this.f3856a == starRating.f3856a && this.f3857b == starRating.f3857b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return c.b(Integer.valueOf(this.f3856a), Float.valueOf(this.f3857b));
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("StarRating: maxStars=");
        sb.append(this.f3856a);
        if (c()) {
            str = ", starRating=" + this.f3857b;
        } else {
            str = ", unrated";
        }
        sb.append(str);
        return sb.toString();
    }
}
