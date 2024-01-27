package androidx.media2.common;

import androidx.versionedparcelable.VersionedParcel;

public final class MediaMetadataParcelizer {
    public static MediaMetadata read(VersionedParcel versionedParcel) {
        MediaMetadata mediaMetadata = new MediaMetadata();
        mediaMetadata.f3753b = versionedParcel.k(mediaMetadata.f3753b, 1);
        mediaMetadata.f3754c = (ParcelImplListSlice) versionedParcel.A(mediaMetadata.f3754c, 2);
        mediaMetadata.c();
        return mediaMetadata;
    }

    public static void write(MediaMetadata mediaMetadata, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        mediaMetadata.d(versionedParcel.g());
        versionedParcel.O(mediaMetadata.f3753b, 1);
        versionedParcel.d0(mediaMetadata.f3754c, 2);
    }
}
