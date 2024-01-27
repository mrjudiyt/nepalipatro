package androidx.media2.common;

import androidx.versionedparcelable.VersionedParcel;

public final class MediaItemParcelizer {
    public static MediaItem read(VersionedParcel versionedParcel) {
        MediaItem mediaItem = new MediaItem();
        mediaItem.f3744b = (MediaMetadata) versionedParcel.I(mediaItem.f3744b, 1);
        mediaItem.f3745c = versionedParcel.y(mediaItem.f3745c, 2);
        mediaItem.f3746d = versionedParcel.y(mediaItem.f3746d, 3);
        mediaItem.c();
        return mediaItem;
    }

    public static void write(MediaItem mediaItem, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        mediaItem.d(versionedParcel.g());
        versionedParcel.m0(mediaItem.f3744b, 1);
        versionedParcel.b0(mediaItem.f3745c, 2);
        versionedParcel.b0(mediaItem.f3746d, 3);
    }
}
