package d3;

import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.d;
import com.facebook.share.internal.ShareConstants;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: CustomTabsLauncherImpl.kt */
public final class a {
    public final void a(Context context, d dVar, Uri uri, List<String> list, c3.a aVar) {
        m.f(context, "context");
        m.f(dVar, "customTabsIntent");
        m.f(uri, ShareConstants.MEDIA_URI);
        m.f(list, "expectCustomTabsPackages");
        String d10 = c.d(context, list);
        if (d10 != null || aVar == null) {
            dVar.f1357a.setPackage(d10);
            dVar.a(context, uri);
            return;
        }
        aVar.a(context, uri, dVar);
    }
}
