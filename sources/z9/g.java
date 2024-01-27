package z9;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.App;
import np.com.nepalipatro.helpers.f;
import np.com.nepalipatro.helpers.g;
import np.com.nepalipatro.helpers.i;
import np.com.nepalipatro.helpers.k;
import org.json.JSONObject;
import v7.w;

/* compiled from: DataLoaderPanchanga.kt */
public final class g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f17611a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f17612b;

    /* renamed from: c  reason: collision with root package name */
    private final String f17613c = "https://api.nepalipatro.com.np/fetch/panchanga/format/html/";

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<a> f17614d = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final u9.a f17615e;

    /* compiled from: DataLoaderPanchanga.kt */
    public interface a {
        void a(i.f fVar);
    }

    /* compiled from: DataLoaderPanchanga.kt */
    public static final class b implements i.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f17616a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f17617b;

        b(g gVar, String str) {
            this.f17616a = gVar;
            this.f17617b = str;
        }

        public void a(i.f fVar, String str) {
            if (fVar == i.f.HTTP_SUCCESS) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    u9.a b10 = this.f17616a.f17615e;
                    if (b10 != null) {
                        b10.h(this.f17617b);
                    }
                    u9.a b11 = this.f17616a.f17615e;
                    if (b11 != null) {
                        b11.H(jSONObject, this.f17617b);
                    }
                    boolean a10 = np.com.nepalipatro.helpers.g.f16048a.a();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                k.a aVar = k.f16077a;
                k.a.z(aVar, this.f17616a.f17611a, aVar.f(), System.currentTimeMillis(), (String) null, 8, (Object) null);
            }
        }
    }

    /* compiled from: DataLoaderPanchanga.kt */
    public static final class c implements i.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f17618a;

        c(g gVar) {
            this.f17618a = gVar;
        }

        public void a(i.f fVar, Bundle bundle) {
            this.f17618a.f17612b = false;
            if (fVar != null) {
                this.f17618a.g(fVar);
            }
        }
    }

    public g(Context context) {
        m.f(context, "mContext");
        this.f17611a = context;
        this.f17615e = new u9.a(context);
    }

    private final void e(String str) {
        this.f17612b = true;
        this.f17612b = true;
        Context context = this.f17611a;
        i iVar = new i(context, this.f17613c + "/bs/" + str, (w) null);
        iVar.l(new b(this, str));
        iVar.m(new c(this));
        iVar.e(true);
        iVar.execute(new Void[0]);
    }

    /* access modifiers changed from: private */
    public final void g(i.f fVar) {
        int size = this.f17614d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f17614d.get(i10).a(fVar);
        }
    }

    public final void f(Boolean bool, String str) {
        m.f(str, "bsDate");
        g.a aVar = np.com.nepalipatro.helpers.g.f16048a;
        StringBuilder sb = new StringBuilder();
        sb.append("Amessage execute with ");
        m.c(bool);
        sb.append(bool.booleanValue());
        aVar.b(sb.toString());
        if (!this.f17612b) {
            if (bool.booleanValue()) {
                e(str);
                return;
            }
            Boolean h10 = h();
            m.c(h10);
            if (h10.booleanValue()) {
                e(str);
            }
        }
    }

    public final Boolean h() {
        k.a aVar = k.f16077a;
        long g10 = aVar.g(this.f17611a, aVar.f(), 0);
        Context context = this.f17611a;
        m.d(context, "null cannot be cast to non-null type np.com.nepalipatro.App");
        FirebaseRemoteConfig c10 = ((App) context).c();
        Long valueOf = c10 != null ? Long.valueOf(c10.getLong(f.f16022a.d())) : null;
        m.c(valueOf);
        return Boolean.valueOf(g10 + (valueOf.longValue() * ((long) 1000)) < System.currentTimeMillis());
    }
}
