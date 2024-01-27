package y5;

import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.g;

/* compiled from: TrackSelectionUtil */
public final class n {
    public static g.a a(h hVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = hVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (hVar.f(i11, elapsedRealtime)) {
                i10++;
            }
        }
        return new g.a(1, 0, length, i10);
    }
}
