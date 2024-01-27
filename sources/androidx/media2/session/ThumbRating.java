package androidx.media2.session;

import androidx.core.util.c;
import androidx.media2.common.Rating;

public final class ThumbRating implements Rating {

    /* renamed from: a  reason: collision with root package name */
    boolean f3858a = false;

    /* renamed from: b  reason: collision with root package name */
    boolean f3859b;

    public boolean equals(Object obj) {
        if (!(obj instanceof ThumbRating)) {
            return false;
        }
        ThumbRating thumbRating = (ThumbRating) obj;
        if (this.f3859b == thumbRating.f3859b && this.f3858a == thumbRating.f3858a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return c.b(Boolean.valueOf(this.f3858a), Boolean.valueOf(this.f3859b));
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ThumbRating: ");
        if (this.f3858a) {
            str = "isThumbUp=" + this.f3859b;
        } else {
            str = "unrated";
        }
        sb.append(str);
        return sb.toString();
    }
}
