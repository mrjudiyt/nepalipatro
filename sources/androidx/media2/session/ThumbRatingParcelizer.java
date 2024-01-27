package androidx.media2.session;

import androidx.versionedparcelable.VersionedParcel;

public final class ThumbRatingParcelizer {
    public static ThumbRating read(VersionedParcel versionedParcel) {
        ThumbRating thumbRating = new ThumbRating();
        thumbRating.f3858a = versionedParcel.i(thumbRating.f3858a, 1);
        thumbRating.f3859b = versionedParcel.i(thumbRating.f3859b, 2);
        return thumbRating;
    }

    public static void write(ThumbRating thumbRating, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        versionedParcel.M(thumbRating.f3858a, 1);
        versionedParcel.M(thumbRating.f3859b, 2);
    }
}
