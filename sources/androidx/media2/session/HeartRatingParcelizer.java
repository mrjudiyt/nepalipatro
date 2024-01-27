package androidx.media2.session;

import androidx.versionedparcelable.VersionedParcel;

public final class HeartRatingParcelizer {
    public static HeartRating read(VersionedParcel versionedParcel) {
        HeartRating heartRating = new HeartRating();
        heartRating.f3802a = versionedParcel.i(heartRating.f3802a, 1);
        heartRating.f3803b = versionedParcel.i(heartRating.f3803b, 2);
        return heartRating;
    }

    public static void write(HeartRating heartRating, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        versionedParcel.M(heartRating.f3802a, 1);
        versionedParcel.M(heartRating.f3803b, 2);
    }
}
