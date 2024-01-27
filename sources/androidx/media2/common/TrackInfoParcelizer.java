package androidx.media2.common;

import androidx.versionedparcelable.VersionedParcel;

public final class TrackInfoParcelizer {
    public static SessionPlayer$TrackInfo read(VersionedParcel versionedParcel) {
        SessionPlayer$TrackInfo sessionPlayer$TrackInfo = new SessionPlayer$TrackInfo();
        sessionPlayer$TrackInfo.f3761a = versionedParcel.v(sessionPlayer$TrackInfo.f3761a, 1);
        sessionPlayer$TrackInfo.f3762b = versionedParcel.v(sessionPlayer$TrackInfo.f3762b, 3);
        sessionPlayer$TrackInfo.f3765e = versionedParcel.k(sessionPlayer$TrackInfo.f3765e, 4);
        sessionPlayer$TrackInfo.c();
        return sessionPlayer$TrackInfo;
    }

    public static void write(SessionPlayer$TrackInfo sessionPlayer$TrackInfo, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        sessionPlayer$TrackInfo.d(versionedParcel.g());
        versionedParcel.Y(sessionPlayer$TrackInfo.f3761a, 1);
        versionedParcel.Y(sessionPlayer$TrackInfo.f3762b, 3);
        versionedParcel.O(sessionPlayer$TrackInfo.f3765e, 4);
    }
}
