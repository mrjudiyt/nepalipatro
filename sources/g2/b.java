package g2;

import android.net.Uri;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: MediaStoreUtil */
public final class b {
    public static boolean a(Uri uri) {
        return b(uri) && !e(uri);
    }

    public static boolean b(Uri uri) {
        return uri != null && FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme()) && ShareConstants.WEB_DIALOG_PARAM_MEDIA.equals(uri.getAuthority());
    }

    public static boolean c(Uri uri) {
        return b(uri) && e(uri);
    }

    public static boolean d(int i10, int i11) {
        return i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384;
    }

    private static boolean e(Uri uri) {
        return uri.getPathSegments().contains(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO);
    }
}
