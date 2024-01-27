package androidx.media2.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.core.util.c;
import androidx.media2.session.SessionToken;

final class SessionTokenImplBase implements SessionToken.SessionTokenImpl {

    /* renamed from: a  reason: collision with root package name */
    int f3842a;

    /* renamed from: b  reason: collision with root package name */
    int f3843b;

    /* renamed from: c  reason: collision with root package name */
    String f3844c;

    /* renamed from: d  reason: collision with root package name */
    String f3845d;

    /* renamed from: e  reason: collision with root package name */
    IBinder f3846e;

    /* renamed from: f  reason: collision with root package name */
    ComponentName f3847f;

    /* renamed from: g  reason: collision with root package name */
    Bundle f3848g;

    SessionTokenImplBase() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SessionTokenImplBase)) {
            return false;
        }
        SessionTokenImplBase sessionTokenImplBase = (SessionTokenImplBase) obj;
        if (this.f3842a != sessionTokenImplBase.f3842a || !TextUtils.equals(this.f3844c, sessionTokenImplBase.f3844c) || !TextUtils.equals(this.f3845d, sessionTokenImplBase.f3845d) || this.f3843b != sessionTokenImplBase.f3843b || !c.a(this.f3846e, sessionTokenImplBase.f3846e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return c.b(Integer.valueOf(this.f3843b), Integer.valueOf(this.f3842a), this.f3844c, this.f3845d);
    }

    public String toString() {
        return "SessionToken {pkg=" + this.f3844c + " type=" + this.f3843b + " service=" + this.f3845d + " IMediaSession=" + this.f3846e + " extras=" + this.f3848g + "}";
    }
}
