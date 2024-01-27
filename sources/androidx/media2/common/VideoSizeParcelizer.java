package androidx.media2.common;

import androidx.versionedparcelable.VersionedParcel;

public final class VideoSizeParcelizer {
    public static VideoSize read(VersionedParcel versionedParcel) {
        VideoSize videoSize = new VideoSize();
        videoSize.f3770a = versionedParcel.v(videoSize.f3770a, 1);
        videoSize.f3771b = versionedParcel.v(videoSize.f3771b, 2);
        return videoSize;
    }

    public static void write(VideoSize videoSize, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        versionedParcel.Y(videoSize.f3770a, 1);
        versionedParcel.Y(videoSize.f3771b, 2);
    }
}
