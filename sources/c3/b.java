package c3;

import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.d;
import com.facebook.share.internal.ShareConstants;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: CustomTabsLauncher.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f5220a = new b();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final d3.a f5221b = new d3.a();

    private b() {
    }

    public static final void b(Context context, d dVar, Uri uri, a aVar) {
        m.f(context, "context");
        m.f(dVar, "customTabsIntent");
        m.f(uri, ShareConstants.MEDIA_URI);
        f5221b.a(context, dVar, uri, d3.b.f7944a.a(), aVar);
    }

    /* compiled from: CustomTabsLauncher.kt */
    public static final class a implements a {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f5222a;

        public a(List<String> list) {
            m.f(list, "customTabsPackages");
            this.f5222a = list;
        }

        public void a(Context context, Uri uri, d dVar) {
            m.f(context, "context");
            m.f(uri, ShareConstants.MEDIA_URI);
            m.f(dVar, "customTabsIntent");
            if (this.f5222a.isEmpty()) {
                dVar.a(context, uri);
                return;
            }
            b.f5221b.a(context, dVar, uri, this.f5222a, (a) null);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            this(d3.b.f7944a.b(context));
            m.f(context, "context");
        }
    }
}
