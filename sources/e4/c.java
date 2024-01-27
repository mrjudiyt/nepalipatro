package e4;

import android.content.Context;
import android.media.AudioManager;
import com.facebook.ads.AdError;
import java.util.UUID;

/* compiled from: C */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final UUID f8045a = new UUID(0, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final UUID f8046b = new UUID(1186680826959645954L, -5988876978535335093L);

    /* renamed from: c  reason: collision with root package name */
    public static final UUID f8047c = new UUID(-2129748144642739255L, 8654423357094679310L);

    /* renamed from: d  reason: collision with root package name */
    public static final UUID f8048d = new UUID(-1301668207276963122L, -6645017420763422227L);

    /* renamed from: e  reason: collision with root package name */
    public static final UUID f8049e = new UUID(-7348484286925749626L, -6083546864340672619L);

    public static int a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static int b(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        switch (i10) {
            case 15:
                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i10) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return AdError.ICONVIEW_MISSING_ERROR_CODE;
                    default:
                        return 6006;
                }
        }
    }

    public static String c(int i10) {
        if (i10 == 0) {
            return "NO";
        }
        if (i10 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i10 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i10 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i10 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static long d(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static long e(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }
}
