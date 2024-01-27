package i1;

import android.view.View;
import android.view.WindowId;

/* compiled from: WindowIdApi18 */
class l0 implements m0 {

    /* renamed from: a  reason: collision with root package name */
    private final WindowId f9168a;

    l0(View view) {
        this.f9168a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof l0) && ((l0) obj).f9168a.equals(this.f9168a);
    }

    public int hashCode() {
        return this.f9168a.hashCode();
    }
}
