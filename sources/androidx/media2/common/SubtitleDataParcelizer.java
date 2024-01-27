package androidx.media2.common;

import androidx.versionedparcelable.VersionedParcel;

public final class SubtitleDataParcelizer {
    public static SubtitleData read(VersionedParcel versionedParcel) {
        SubtitleData subtitleData = new SubtitleData();
        subtitleData.f3767a = versionedParcel.y(subtitleData.f3767a, 1);
        subtitleData.f3768b = versionedParcel.y(subtitleData.f3768b, 2);
        subtitleData.f3769c = versionedParcel.m(subtitleData.f3769c, 3);
        return subtitleData;
    }

    public static void write(SubtitleData subtitleData, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        versionedParcel.b0(subtitleData.f3767a, 1);
        versionedParcel.b0(subtitleData.f3768b, 2);
        versionedParcel.Q(subtitleData.f3769c, 3);
    }
}
