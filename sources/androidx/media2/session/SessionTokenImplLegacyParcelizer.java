package androidx.media2.session;

import android.content.ComponentName;
import androidx.versionedparcelable.VersionedParcel;

public final class SessionTokenImplLegacyParcelizer {
    public static SessionTokenImplLegacy read(VersionedParcel versionedParcel) {
        SessionTokenImplLegacy sessionTokenImplLegacy = new SessionTokenImplLegacy();
        sessionTokenImplLegacy.f3850b = versionedParcel.k(sessionTokenImplLegacy.f3850b, 1);
        sessionTokenImplLegacy.f3851c = versionedParcel.v(sessionTokenImplLegacy.f3851c, 2);
        sessionTokenImplLegacy.f3852d = versionedParcel.v(sessionTokenImplLegacy.f3852d, 3);
        sessionTokenImplLegacy.f3853e = (ComponentName) versionedParcel.A(sessionTokenImplLegacy.f3853e, 4);
        sessionTokenImplLegacy.f3854f = versionedParcel.E(sessionTokenImplLegacy.f3854f, 5);
        sessionTokenImplLegacy.f3855g = versionedParcel.k(sessionTokenImplLegacy.f3855g, 6);
        sessionTokenImplLegacy.c();
        return sessionTokenImplLegacy;
    }

    public static void write(SessionTokenImplLegacy sessionTokenImplLegacy, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        sessionTokenImplLegacy.d(versionedParcel.g());
        versionedParcel.O(sessionTokenImplLegacy.f3850b, 1);
        versionedParcel.Y(sessionTokenImplLegacy.f3851c, 2);
        versionedParcel.Y(sessionTokenImplLegacy.f3852d, 3);
        versionedParcel.d0(sessionTokenImplLegacy.f3853e, 4);
        versionedParcel.h0(sessionTokenImplLegacy.f3854f, 5);
        versionedParcel.O(sessionTokenImplLegacy.f3855g, 6);
    }
}
