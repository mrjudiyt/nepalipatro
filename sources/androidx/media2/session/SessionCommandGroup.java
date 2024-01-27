package androidx.media2.session;

import androidx.core.util.c;
import j1.b;
import java.util.HashSet;
import java.util.Set;

public final class SessionCommandGroup implements b {

    /* renamed from: a  reason: collision with root package name */
    Set<SessionCommand> f3835a = new HashSet();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionCommandGroup)) {
            return false;
        }
        SessionCommandGroup sessionCommandGroup = (SessionCommandGroup) obj;
        Set<SessionCommand> set = this.f3835a;
        if (set != null) {
            return set.equals(sessionCommandGroup.f3835a);
        }
        if (sessionCommandGroup.f3835a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return c.c(this.f3835a);
    }
}
