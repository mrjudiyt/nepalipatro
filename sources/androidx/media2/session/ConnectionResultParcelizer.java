package androidx.media2.session;

import android.app.PendingIntent;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.ParcelImplListSlice;
import androidx.media2.common.SessionPlayer$TrackInfo;
import androidx.media2.common.VideoSize;
import androidx.versionedparcelable.VersionedParcel;

public final class ConnectionResultParcelizer {
    public static ConnectionResult read(VersionedParcel versionedParcel) {
        ConnectionResult connectionResult = new ConnectionResult();
        connectionResult.f3776a = versionedParcel.v(connectionResult.f3776a, 0);
        connectionResult.f3778c = versionedParcel.G(connectionResult.f3778c, 1);
        connectionResult.f3788m = versionedParcel.v(connectionResult.f3788m, 10);
        connectionResult.f3789n = versionedParcel.v(connectionResult.f3789n, 11);
        connectionResult.f3790o = (ParcelImplListSlice) versionedParcel.A(connectionResult.f3790o, 12);
        connectionResult.f3791p = (SessionCommandGroup) versionedParcel.I(connectionResult.f3791p, 13);
        connectionResult.f3792q = versionedParcel.v(connectionResult.f3792q, 14);
        connectionResult.f3793r = versionedParcel.v(connectionResult.f3793r, 15);
        connectionResult.f3794s = versionedParcel.v(connectionResult.f3794s, 16);
        connectionResult.f3795t = versionedParcel.k(connectionResult.f3795t, 17);
        connectionResult.f3796u = (VideoSize) versionedParcel.I(connectionResult.f3796u, 18);
        connectionResult.f3797v = versionedParcel.w(connectionResult.f3797v, 19);
        connectionResult.f3779d = (PendingIntent) versionedParcel.A(connectionResult.f3779d, 2);
        connectionResult.f3798w = (SessionPlayer$TrackInfo) versionedParcel.I(connectionResult.f3798w, 20);
        connectionResult.f3799x = (SessionPlayer$TrackInfo) versionedParcel.I(connectionResult.f3799x, 21);
        connectionResult.f3800y = (SessionPlayer$TrackInfo) versionedParcel.I(connectionResult.f3800y, 23);
        connectionResult.f3801z = (SessionPlayer$TrackInfo) versionedParcel.I(connectionResult.f3801z, 24);
        connectionResult.A = (MediaMetadata) versionedParcel.I(connectionResult.A, 25);
        connectionResult.B = versionedParcel.v(connectionResult.B, 26);
        connectionResult.f3780e = versionedParcel.v(connectionResult.f3780e, 3);
        connectionResult.f3782g = (MediaItem) versionedParcel.I(connectionResult.f3782g, 4);
        connectionResult.f3783h = versionedParcel.y(connectionResult.f3783h, 5);
        connectionResult.f3784i = versionedParcel.y(connectionResult.f3784i, 6);
        connectionResult.f3785j = versionedParcel.s(connectionResult.f3785j, 7);
        connectionResult.f3786k = versionedParcel.y(connectionResult.f3786k, 8);
        connectionResult.f3787l = (MediaController$PlaybackInfo) versionedParcel.I(connectionResult.f3787l, 9);
        connectionResult.c();
        return connectionResult;
    }

    public static void write(ConnectionResult connectionResult, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        connectionResult.d(versionedParcel.g());
        versionedParcel.Y(connectionResult.f3776a, 0);
        versionedParcel.j0(connectionResult.f3778c, 1);
        versionedParcel.Y(connectionResult.f3788m, 10);
        versionedParcel.Y(connectionResult.f3789n, 11);
        versionedParcel.d0(connectionResult.f3790o, 12);
        versionedParcel.m0(connectionResult.f3791p, 13);
        versionedParcel.Y(connectionResult.f3792q, 14);
        versionedParcel.Y(connectionResult.f3793r, 15);
        versionedParcel.Y(connectionResult.f3794s, 16);
        versionedParcel.O(connectionResult.f3795t, 17);
        versionedParcel.m0(connectionResult.f3796u, 18);
        versionedParcel.Z(connectionResult.f3797v, 19);
        versionedParcel.d0(connectionResult.f3779d, 2);
        versionedParcel.m0(connectionResult.f3798w, 20);
        versionedParcel.m0(connectionResult.f3799x, 21);
        versionedParcel.m0(connectionResult.f3800y, 23);
        versionedParcel.m0(connectionResult.f3801z, 24);
        versionedParcel.m0(connectionResult.A, 25);
        versionedParcel.Y(connectionResult.B, 26);
        versionedParcel.Y(connectionResult.f3780e, 3);
        versionedParcel.m0(connectionResult.f3782g, 4);
        versionedParcel.b0(connectionResult.f3783h, 5);
        versionedParcel.b0(connectionResult.f3784i, 6);
        versionedParcel.W(connectionResult.f3785j, 7);
        versionedParcel.b0(connectionResult.f3786k, 8);
        versionedParcel.m0(connectionResult.f3787l, 9);
    }
}
