package z9;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.helpers.g;
import np.com.nepalipatro.helpers.i;
import np.com.nepalipatro.helpers.l;
import org.json.JSONArray;
import org.json.JSONObject;
import w9.w;

/* compiled from: DataLoaderForex.kt */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private Context f17597a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public u9.a f17598b;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f17599c = Boolean.FALSE;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<a> f17600d = new ArrayList<>();

    /* compiled from: DataLoaderForex.kt */
    public interface a {
        void a(i.f fVar);
    }

    /* compiled from: DataLoaderForex.kt */
    public static final class b implements i.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f17601a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f17602b;

        b(e eVar, i iVar) {
            this.f17601a = eVar;
            this.f17602b = iVar;
        }

        public void a(i.f fVar, String str) {
            if (fVar == i.f.HTTP_SUCCESS && w.f17100a.b(str)) {
                try {
                    Object obj = new JSONObject(str).get("data");
                    m.d(obj, "null cannot be cast to non-null type org.json.JSONArray");
                    JSONArray jSONArray = (JSONArray) obj;
                    u9.a b10 = this.f17601a.f17598b;
                    if (b10 == null) {
                        m.x("dbHelper");
                        b10 = null;
                    }
                    b10.c(jSONArray);
                } catch (Exception e10) {
                    if (g.f16048a.a()) {
                        e10.printStackTrace();
                    }
                    this.f17602b.n(i.f.HTTP_OTHERS);
                }
            }
        }
    }

    /* compiled from: DataLoaderForex.kt */
    public static final class c implements i.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f17603a;

        c(e eVar) {
            this.f17603a = eVar;
        }

        public void a(i.f fVar, Bundle bundle) {
            this.f17603a.g(Boolean.FALSE);
            if (fVar != null) {
                this.f17603a.d(fVar);
            }
        }
    }

    public e(Context context) {
        m.f(context, "context");
        this.f17597a = context;
        this.f17598b = new u9.a(context);
    }

    /* access modifiers changed from: private */
    public final void d(i.f fVar) {
        int size = this.f17600d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f17600d.get(i10).a(fVar);
        }
    }

    private final String e(String str) {
        return np.com.nepalipatro.helpers.e.f15961a.e0() + "/dt/" + str;
    }

    public final void c(String str) {
        Boolean bool = this.f17599c;
        m.c(bool);
        if (!bool.booleanValue()) {
            this.f17599c = Boolean.TRUE;
            if (str == null) {
                str = l.f16129a.b("yyyy-MM-dd");
            }
            Context context = this.f17597a;
            if (context == null) {
                m.x("context");
                context = null;
            }
            i iVar = new i(context, e(str), (v7.w) null);
            iVar.e(true);
            iVar.l(new b(this, iVar));
            iVar.m(new c(this));
            iVar.execute(new Void[0]);
        }
    }

    public final Boolean f() {
        return this.f17599c;
    }

    public final void g(Boolean bool) {
        this.f17599c = bool;
    }
}
