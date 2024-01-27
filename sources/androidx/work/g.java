package androidx.work;

import android.app.Notification;

/* compiled from: ForegroundInfo */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final int f4761a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4762b;

    /* renamed from: c  reason: collision with root package name */
    private final Notification f4763c;

    public g(int i10, Notification notification, int i11) {
        this.f4761a = i10;
        this.f4763c = notification;
        this.f4762b = i11;
    }

    public int a() {
        return this.f4762b;
    }

    public Notification b() {
        return this.f4763c;
    }

    public int c() {
        return this.f4761a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f4761a == gVar.f4761a && this.f4762b == gVar.f4762b) {
            return this.f4763c.equals(gVar.f4763c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f4761a * 31) + this.f4762b) * 31) + this.f4763c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{" + "mNotificationId=" + this.f4761a + ", mForegroundServiceType=" + this.f4762b + ", mNotification=" + this.f4763c + '}';
    }
}
