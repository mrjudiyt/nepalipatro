package z9;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.helpers.g;
import np.com.nepalipatro.helpers.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w9.w;

/* compiled from: DataLoaderNewsWidget.kt */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private Context f17604a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public u9.a f17605b;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f17606c = Boolean.FALSE;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<a> f17607d = new ArrayList<>();

    /* compiled from: DataLoaderNewsWidget.kt */
    public interface a {
        void a(i.f fVar);
    }

    /* compiled from: DataLoaderNewsWidget.kt */
    public static final class b implements i.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f17608a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f17609b;

        b(f fVar, i iVar) {
            this.f17608a = fVar;
            this.f17609b = iVar;
        }

        public void a(i.f fVar, String str) {
            if (fVar == i.f.HTTP_SUCCESS && w.f17100a.a(str)) {
                try {
                    Object obj = new JSONObject(str).get("feeds");
                    m.d(obj, "null cannot be cast to non-null type org.json.JSONArray");
                    JSONArray jSONArray = (JSONArray) obj;
                    u9.a b10 = this.f17608a.f17605b;
                    if (b10 == null) {
                        m.x("dbHelper");
                        b10 = null;
                    }
                    b10.a(jSONArray);
                } catch (JSONException e10) {
                    if (g.f16048a.a()) {
                        e10.printStackTrace();
                    }
                    this.f17609b.n(i.f.HTTP_OTHERS);
                }
            }
        }
    }

    /* compiled from: DataLoaderNewsWidget.kt */
    public static final class c implements i.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f17610a;

        c(f fVar) {
            this.f17610a = fVar;
        }

        public void a(i.f fVar, Bundle bundle) {
            this.f17610a.e(Boolean.FALSE);
            if (fVar != null) {
                this.f17610a.d(fVar);
            }
        }
    }

    public f(Context context) {
        m.f(context, "context");
        this.f17604a = context;
        this.f17605b = new u9.a(context);
    }

    /* access modifiers changed from: private */
    public final void d(i.f fVar) {
        int size = this.f17607d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f17607d.get(i10).a(fVar);
        }
    }

    public final void c() {
        Context context = this.f17604a;
        if (context == null) {
            m.x("context");
            context = null;
        }
        i iVar = new i(context, "https://timesofnepal.com.np/newsv4/feeds.php", (v7.w) null);
        iVar.e(false);
        iVar.l(new b(this, iVar));
        iVar.m(new c(this));
        iVar.execute(new Void[0]);
    }

    public final void e(Boolean bool) {
        this.f17606c = bool;
    }
}
