package androidx.media2.session;

import androidx.versionedparcelable.VersionedParcel;

public final class PercentageRatingParcelizer {
    public static PercentageRating read(VersionedParcel versionedParcel) {
        PercentageRating percentageRating = new PercentageRating();
        percentageRating.f3826a = versionedParcel.s(percentageRating.f3826a, 1);
        return percentageRating;
    }

    public static void write(PercentageRating percentageRating, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        versionedParcel.W(percentageRating.f3826a, 1);
    }
}
