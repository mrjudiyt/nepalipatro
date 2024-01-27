package androidx.media2.session;

import androidx.versionedparcelable.VersionedParcel;

public final class SessionCommandGroupParcelizer {
    public static SessionCommandGroup read(VersionedParcel versionedParcel) {
        SessionCommandGroup sessionCommandGroup = new SessionCommandGroup();
        sessionCommandGroup.f3835a = versionedParcel.C(sessionCommandGroup.f3835a, 1);
        return sessionCommandGroup;
    }

    public static void write(SessionCommandGroup sessionCommandGroup, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        versionedParcel.f0(sessionCommandGroup.f3835a, 1);
    }
}
