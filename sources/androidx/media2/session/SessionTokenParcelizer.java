package androidx.media2.session;

import androidx.media2.session.SessionToken;
import androidx.versionedparcelable.VersionedParcel;

public final class SessionTokenParcelizer {
    public static SessionToken read(VersionedParcel versionedParcel) {
        SessionToken sessionToken = new SessionToken();
        sessionToken.f3841a = (SessionToken.SessionTokenImpl) versionedParcel.I(sessionToken.f3841a, 1);
        return sessionToken;
    }

    public static void write(SessionToken sessionToken, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        versionedParcel.m0(sessionToken.f3841a, 1);
    }
}
