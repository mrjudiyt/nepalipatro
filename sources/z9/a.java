package z9;

import android.content.Context;
import com.facebook.share.internal.ShareConstants;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.helpers.g;
import org.json.JSONObject;

/* compiled from: CacheLoader.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f17545a;

    /* renamed from: b  reason: collision with root package name */
    private u9.a f17546b;

    public a(Context context) {
        m.f(context, "context");
        this.f17545a = context;
        this.f17546b = new u9.a(context);
    }

    public final void a(boolean z10, String str) {
        m.f(str, "options");
        if (z10) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("dt") && jSONObject.has(ShareConstants.MEDIA_TYPE)) {
                    String obj = jSONObject.get("dt").toString();
                    String valueOf = String.valueOf(jSONObject.get(ShareConstants.MEDIA_TYPE));
                    boolean z11 = true;
                    if (!(obj.length() == 0)) {
                        if (valueOf.length() != 0) {
                            z11 = false;
                        }
                        if (!z11) {
                            u9.a aVar = this.f17546b;
                            if (aVar != null) {
                                aVar.K(obj, valueOf);
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                if (g.f16048a.a()) {
                    e10.printStackTrace();
                }
            }
        }
    }
}
