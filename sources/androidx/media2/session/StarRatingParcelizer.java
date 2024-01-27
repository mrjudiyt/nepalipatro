package androidx.media2.session;

import androidx.versionedparcelable.VersionedParcel;

public final class StarRatingParcelizer {
    public static StarRating read(VersionedParcel versionedParcel) {
        StarRating starRating = new StarRating();
        starRating.f3856a = versionedParcel.v(starRating.f3856a, 1);
        starRating.f3857b = versionedParcel.s(starRating.f3857b, 2);
        return starRating;
    }

    public static void write(StarRating starRating, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        versionedParcel.Y(starRating.f3856a, 1);
        versionedParcel.W(starRating.f3857b, 2);
    }
}
