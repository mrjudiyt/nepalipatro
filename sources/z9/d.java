package z9;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.App;
import np.com.nepalipatro.helpers.f;
import np.com.nepalipatro.helpers.i;
import np.com.nepalipatro.helpers.k;
import org.json.JSONArray;
import org.json.JSONObject;
import v7.w;

/* compiled from: DataLoaderBlogs.kt */
public final class d {

    /* renamed from: f  reason: collision with root package name */
    public static final a f17577f = new a((g) null);

    /* renamed from: g  reason: collision with root package name */
    private static final String f17578g = "https://nepalipatro.com.np/blog/mappedblogs";

    /* renamed from: h  reason: collision with root package name */
    private static final String f17579h = "https://blog.nepalipatro.com.np/?json=respond.submit_comment";
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static String f17580i = "LUBT";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f17581a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f17582b;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f17583c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public u9.a f17584d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList<c> f17585e = new ArrayList<>();

    /* compiled from: DataLoaderBlogs.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final String a() {
            return d.f17580i;
        }
    }

    /* compiled from: DataLoaderBlogs.kt */
    public enum b {
        NONE,
        MAX_ID,
        ID,
        ID_IGNORE,
        OFFSET,
        DATE_GT,
        DATE_LT
    }

    /* compiled from: DataLoaderBlogs.kt */
    public interface c {
        void a(i.f fVar);
    }

    /* renamed from: z9.d$d  reason: collision with other inner class name */
    /* compiled from: DataLoaderBlogs.kt */
    public static final class C0299d implements i.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f17594a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f17595b;

        C0299d(d dVar, b bVar) {
            this.f17594a = dVar;
            this.f17595b = bVar;
        }

        public void a(i.f fVar, String str) {
            if (fVar == i.f.HTTP_SUCCESS) {
                try {
                    new r6.g().c("yyyy-MM-dd HH:mm:ss").b();
                    Object obj = new JSONObject(str).get("posts");
                    m.d(obj, "null cannot be cast to non-null type org.json.JSONArray");
                    JSONArray jSONArray = (JSONArray) obj;
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            jSONArray.getJSONObject(i10).put(next, jSONObject.get(next).toString());
                        }
                    }
                    u9.a c10 = this.f17594a.f17584d;
                    if (c10 == null) {
                        m.x("dbHelper");
                        c10 = null;
                    }
                    c10.J(jSONArray);
                } catch (Exception e10) {
                    if (np.com.nepalipatro.helpers.g.f16048a.a()) {
                        e10.printStackTrace();
                    }
                }
                if (this.f17595b == b.NONE) {
                    k.a.z(k.f16077a, this.f17594a.f17581a, d.f17577f.a(), System.currentTimeMillis(), (String) null, 8, (Object) null);
                }
            }
        }
    }

    /* compiled from: DataLoaderBlogs.kt */
    public static final class e implements i.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f17596a;

        e(d dVar) {
            this.f17596a = dVar;
        }

        public void a(i.f fVar, Bundle bundle) {
            this.f17596a.k(Boolean.FALSE);
            d dVar = this.f17596a;
            m.c(fVar);
            dVar.h(fVar);
        }
    }

    public d(Context context) {
        m.f(context, "context");
        this.f17581a = context;
        Boolean bool = Boolean.FALSE;
        this.f17582b = bool;
        this.f17583c = bool;
        this.f17584d = new u9.a(context);
    }

    /* access modifiers changed from: private */
    public final void h(i.f fVar) {
        int size = this.f17585e.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f17585e.get(i10).a(fVar);
        }
    }

    public final void e(long j10) {
        u9.a aVar = this.f17584d;
        if (aVar == null) {
            m.x("dbHelper");
            aVar = null;
        }
        aVar.e(j10);
    }

    public final void f(b bVar, long j10) {
        m.f(bVar, "filter");
        this.f17583c = Boolean.TRUE;
        String str = f17578g;
        if (bVar == b.MAX_ID) {
            str = str + "/offset/" + j10;
        } else if (bVar == b.DATE_LT) {
            str = str + "/datelt/" + j10;
        } else if (bVar == b.DATE_GT) {
            str = str + "/dategt/" + j10;
        } else if (bVar == b.ID) {
            str = str + "/id/" + j10;
        } else if (bVar == b.ID_IGNORE) {
            str = str + "/id/" + j10 + "/ignore/1";
        }
        np.com.nepalipatro.helpers.g.f16048a.b("Download Url is " + str);
        i iVar = new i(this.f17581a, str, (w) null);
        iVar.l(new C0299d(this, bVar));
        iVar.m(new e(this));
        iVar.execute(new Void[0]);
    }

    public final void g(boolean z10, b bVar, long j10) {
        m.f(bVar, "filter");
        if (z10) {
            f(b.NONE, 0);
        } else {
            f(bVar, j10);
        }
    }

    public final Boolean i() {
        return this.f17583c;
    }

    public final boolean j() {
        long g10 = k.f16077a.g(this.f17581a, f17580i, 0);
        Context context = this.f17581a;
        m.d(context, "null cannot be cast to non-null type np.com.nepalipatro.App");
        FirebaseRemoteConfig c10 = ((App) context).c();
        Long valueOf = c10 != null ? Long.valueOf(c10.getLong(f.f16022a.e())) : null;
        m.c(valueOf);
        return g10 + (valueOf.longValue() * ((long) 1000)) < System.currentTimeMillis();
    }

    public final void k(Boolean bool) {
        this.f17583c = bool;
    }
}
