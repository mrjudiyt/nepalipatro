package j4;

import android.util.Pair;
import com.google.android.exoplayer2.drm.DrmSession;
import java.util.Map;

/* compiled from: WidevineUtil */
public final class u {
    private static long a(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    public static Pair<Long, Long> b(DrmSession drmSession) {
        Map<String, String> f10 = drmSession.f();
        if (f10 == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(f10, "LicenseDurationRemaining")), Long.valueOf(a(f10, "PlaybackDurationRemaining")));
    }
}
