package androidx.media2.session;

import androidx.versionedparcelable.VersionedParcel;

public final class ConnectionRequestParcelizer {
    public static ConnectionRequest read(VersionedParcel versionedParcel) {
        ConnectionRequest connectionRequest = new ConnectionRequest();
        connectionRequest.f3772a = versionedParcel.v(connectionRequest.f3772a, 0);
        connectionRequest.f3773b = versionedParcel.E(connectionRequest.f3773b, 1);
        connectionRequest.f3774c = versionedParcel.v(connectionRequest.f3774c, 2);
        connectionRequest.f3775d = versionedParcel.k(connectionRequest.f3775d, 3);
        return connectionRequest;
    }

    public static void write(ConnectionRequest connectionRequest, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        versionedParcel.Y(connectionRequest.f3772a, 0);
        versionedParcel.h0(connectionRequest.f3773b, 1);
        versionedParcel.Y(connectionRequest.f3774c, 2);
        versionedParcel.O(connectionRequest.f3775d, 3);
    }
}
