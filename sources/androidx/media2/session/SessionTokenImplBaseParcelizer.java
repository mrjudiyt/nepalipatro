package androidx.media2.session;

import android.content.ComponentName;
import androidx.versionedparcelable.VersionedParcel;

public final class SessionTokenImplBaseParcelizer {
    public static SessionTokenImplBase read(VersionedParcel versionedParcel) {
        SessionTokenImplBase sessionTokenImplBase = new SessionTokenImplBase();
        sessionTokenImplBase.f3842a = versionedParcel.v(sessionTokenImplBase.f3842a, 1);
        sessionTokenImplBase.f3843b = versionedParcel.v(sessionTokenImplBase.f3843b, 2);
        sessionTokenImplBase.f3844c = versionedParcel.E(sessionTokenImplBase.f3844c, 3);
        sessionTokenImplBase.f3845d = versionedParcel.E(sessionTokenImplBase.f3845d, 4);
        sessionTokenImplBase.f3846e = versionedParcel.G(sessionTokenImplBase.f3846e, 5);
        sessionTokenImplBase.f3847f = (ComponentName) versionedParcel.A(sessionTokenImplBase.f3847f, 6);
        sessionTokenImplBase.f3848g = versionedParcel.k(sessionTokenImplBase.f3848g, 7);
        return sessionTokenImplBase;
    }

    public static void write(SessionTokenImplBase sessionTokenImplBase, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        versionedParcel.Y(sessionTokenImplBase.f3842a, 1);
        versionedParcel.Y(sessionTokenImplBase.f3843b, 2);
        versionedParcel.h0(sessionTokenImplBase.f3844c, 3);
        versionedParcel.h0(sessionTokenImplBase.f3845d, 4);
        versionedParcel.j0(sessionTokenImplBase.f3846e, 5);
        versionedParcel.d0(sessionTokenImplBase.f3847f, 6);
        versionedParcel.O(sessionTokenImplBase.f3848g, 7);
    }
}
