package androidx.media2.session;

import androidx.core.util.c;
import androidx.media2.common.Rating;

public final class PercentageRating implements Rating {

    /* renamed from: a  reason: collision with root package name */
    float f3826a = -1.0f;

    public boolean c() {
        return this.f3826a != -1.0f;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof PercentageRating) && this.f3826a == ((PercentageRating) obj).f3826a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return c.b(Float.valueOf(this.f3826a));
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("PercentageRating: ");
        if (c()) {
            str = "percentage=" + this.f3826a;
        } else {
            str = "unrated";
        }
        sb.append(str);
        return sb.toString();
    }
}
