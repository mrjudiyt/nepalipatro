package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2078a = (IconCompat) versionedParcel.I(remoteActionCompat.f2078a, 1);
        remoteActionCompat.f2079b = versionedParcel.o(remoteActionCompat.f2079b, 2);
        remoteActionCompat.f2080c = versionedParcel.o(remoteActionCompat.f2080c, 3);
        remoteActionCompat.f2081d = (PendingIntent) versionedParcel.A(remoteActionCompat.f2081d, 4);
        remoteActionCompat.f2082e = versionedParcel.i(remoteActionCompat.f2082e, 5);
        remoteActionCompat.f2083f = versionedParcel.i(remoteActionCompat.f2083f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        versionedParcel.m0(remoteActionCompat.f2078a, 1);
        versionedParcel.S(remoteActionCompat.f2079b, 2);
        versionedParcel.S(remoteActionCompat.f2080c, 3);
        versionedParcel.d0(remoteActionCompat.f2081d, 4);
        versionedParcel.M(remoteActionCompat.f2082e, 5);
        versionedParcel.M(remoteActionCompat.f2083f, 6);
    }
}
