package androidx.media2.session;

import j1.b;

public final class SessionToken implements b {

    /* renamed from: a  reason: collision with root package name */
    SessionTokenImpl f3841a;

    interface SessionTokenImpl extends b {
    }

    SessionToken() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SessionToken)) {
            return false;
        }
        return this.f3841a.equals(((SessionToken) obj).f3841a);
    }

    public int hashCode() {
        return this.f3841a.hashCode();
    }

    public String toString() {
        return this.f3841a.toString();
    }
}
