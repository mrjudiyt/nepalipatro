package androidx.core.view;

import android.os.Build;
import android.view.Gravity;

/* compiled from: GravityCompat */
public final class d {
    public static int a(int i10, int i11) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i10, i11) : i10 & -8388609;
    }
}
