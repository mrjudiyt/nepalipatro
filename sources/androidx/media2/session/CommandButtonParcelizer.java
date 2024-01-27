package androidx.media2.session;

import androidx.versionedparcelable.VersionedParcel;

public final class CommandButtonParcelizer {
    public static MediaSession$CommandButton read(VersionedParcel versionedParcel) {
        MediaSession$CommandButton mediaSession$CommandButton = new MediaSession$CommandButton();
        mediaSession$CommandButton.f3821a = (SessionCommand) versionedParcel.I(mediaSession$CommandButton.f3821a, 1);
        mediaSession$CommandButton.f3822b = versionedParcel.v(mediaSession$CommandButton.f3822b, 2);
        mediaSession$CommandButton.f3823c = versionedParcel.o(mediaSession$CommandButton.f3823c, 3);
        mediaSession$CommandButton.f3824d = versionedParcel.k(mediaSession$CommandButton.f3824d, 4);
        mediaSession$CommandButton.f3825e = versionedParcel.i(mediaSession$CommandButton.f3825e, 5);
        return mediaSession$CommandButton;
    }

    public static void write(MediaSession$CommandButton mediaSession$CommandButton, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        versionedParcel.m0(mediaSession$CommandButton.f3821a, 1);
        versionedParcel.Y(mediaSession$CommandButton.f3822b, 2);
        versionedParcel.S(mediaSession$CommandButton.f3823c, 3);
        versionedParcel.O(mediaSession$CommandButton.f3824d, 4);
        versionedParcel.M(mediaSession$CommandButton.f3825e, 5);
    }
}
