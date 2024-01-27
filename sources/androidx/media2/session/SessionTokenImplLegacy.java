package androidx.media2.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.core.util.c;
import androidx.media2.session.SessionToken;
import androidx.versionedparcelable.CustomVersionedParcelable;
import j1.b;

final class SessionTokenImplLegacy extends CustomVersionedParcelable implements SessionToken.SessionTokenImpl {

    /* renamed from: a  reason: collision with root package name */
    private MediaSessionCompat.Token f3849a;

    /* renamed from: b  reason: collision with root package name */
    Bundle f3850b;

    /* renamed from: c  reason: collision with root package name */
    int f3851c;

    /* renamed from: d  reason: collision with root package name */
    int f3852d;

    /* renamed from: e  reason: collision with root package name */
    ComponentName f3853e;

    /* renamed from: f  reason: collision with root package name */
    String f3854f;

    /* renamed from: g  reason: collision with root package name */
    Bundle f3855g;

    SessionTokenImplLegacy() {
    }

    public void c() {
        this.f3849a = MediaSessionCompat.Token.b(this.f3850b);
    }

    public void d(boolean z10) {
        MediaSessionCompat.Token token = this.f3849a;
        if (token != null) {
            synchronized (token) {
                b f10 = this.f3849a.f();
                this.f3849a.i((b) null);
                this.f3850b = this.f3849a.j();
                this.f3849a.i(f10);
            }
            return;
        }
        this.f3850b = null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SessionTokenImplLegacy)) {
            return false;
        }
        SessionTokenImplLegacy sessionTokenImplLegacy = (SessionTokenImplLegacy) obj;
        int i10 = this.f3852d;
        if (i10 != sessionTokenImplLegacy.f3852d) {
            return false;
        }
        if (i10 == 100) {
            return c.a(this.f3849a, sessionTokenImplLegacy.f3849a);
        }
        if (i10 != 101) {
            return false;
        }
        return c.a(this.f3853e, sessionTokenImplLegacy.f3853e);
    }

    public int hashCode() {
        return c.b(Integer.valueOf(this.f3852d), this.f3853e, this.f3849a);
    }

    public String toString() {
        return "SessionToken {legacyToken=" + this.f3849a + "}";
    }
}
