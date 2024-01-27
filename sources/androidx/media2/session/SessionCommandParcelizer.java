package androidx.media2.session;

import androidx.versionedparcelable.VersionedParcel;

public final class SessionCommandParcelizer {
    public static SessionCommand read(VersionedParcel versionedParcel) {
        SessionCommand sessionCommand = new SessionCommand();
        sessionCommand.f3832a = versionedParcel.v(sessionCommand.f3832a, 1);
        sessionCommand.f3833b = versionedParcel.E(sessionCommand.f3833b, 2);
        sessionCommand.f3834c = versionedParcel.k(sessionCommand.f3834c, 3);
        return sessionCommand;
    }

    public static void write(SessionCommand sessionCommand, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        versionedParcel.Y(sessionCommand.f3832a, 1);
        versionedParcel.h0(sessionCommand.f3833b, 2);
        versionedParcel.O(sessionCommand.f3834c, 3);
    }
}
