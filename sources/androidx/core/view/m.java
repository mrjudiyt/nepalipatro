package androidx.core.view;

import android.view.MotionEvent;

/* compiled from: MotionEventCompat */
public final class m {
    public static boolean a(MotionEvent motionEvent, int i10) {
        return (motionEvent.getSource() & i10) == i10;
    }
}
