package i1;

import android.os.IBinder;

/* compiled from: WindowIdApi14 */
class k0 implements m0 {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f9165a;

    k0(IBinder iBinder) {
        this.f9165a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k0) && ((k0) obj).f9165a.equals(this.f9165a);
    }

    public int hashCode() {
        return this.f9165a.hashCode();
    }
}
