package androidx.media2.session;

import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.VersionedParcel;

public final class PlaybackInfoParcelizer {
    public static MediaController$PlaybackInfo read(VersionedParcel versionedParcel) {
        MediaController$PlaybackInfo mediaController$PlaybackInfo = new MediaController$PlaybackInfo();
        mediaController$PlaybackInfo.f3811a = versionedParcel.v(mediaController$PlaybackInfo.f3811a, 1);
        mediaController$PlaybackInfo.f3812b = versionedParcel.v(mediaController$PlaybackInfo.f3812b, 2);
        mediaController$PlaybackInfo.f3813c = versionedParcel.v(mediaController$PlaybackInfo.f3813c, 3);
        mediaController$PlaybackInfo.f3814d = versionedParcel.v(mediaController$PlaybackInfo.f3814d, 4);
        mediaController$PlaybackInfo.f3815e = (AudioAttributesCompat) versionedParcel.I(mediaController$PlaybackInfo.f3815e, 5);
        return mediaController$PlaybackInfo;
    }

    public static void write(MediaController$PlaybackInfo mediaController$PlaybackInfo, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        versionedParcel.Y(mediaController$PlaybackInfo.f3811a, 1);
        versionedParcel.Y(mediaController$PlaybackInfo.f3812b, 2);
        versionedParcel.Y(mediaController$PlaybackInfo.f3813c, 3);
        versionedParcel.Y(mediaController$PlaybackInfo.f3814d, 4);
        versionedParcel.m0(mediaController$PlaybackInfo.f3815e, 5);
    }
}
