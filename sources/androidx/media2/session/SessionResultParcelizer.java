package androidx.media2.session;

import androidx.media2.common.MediaItem;
import androidx.versionedparcelable.VersionedParcel;

public final class SessionResultParcelizer {
    public static SessionResult read(VersionedParcel versionedParcel) {
        SessionResult sessionResult = new SessionResult();
        sessionResult.f3836a = versionedParcel.v(sessionResult.f3836a, 1);
        sessionResult.f3837b = versionedParcel.y(sessionResult.f3837b, 2);
        sessionResult.f3838c = versionedParcel.k(sessionResult.f3838c, 3);
        sessionResult.f3840e = (MediaItem) versionedParcel.I(sessionResult.f3840e, 4);
        sessionResult.c();
        return sessionResult;
    }

    public static void write(SessionResult sessionResult, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        sessionResult.d(versionedParcel.g());
        versionedParcel.Y(sessionResult.f3836a, 1);
        versionedParcel.b0(sessionResult.f3837b, 2);
        versionedParcel.O(sessionResult.f3838c, 3);
        versionedParcel.m0(sessionResult.f3840e, 4);
    }
}
