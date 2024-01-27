package z9;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.App;
import np.com.nepalipatro.helpers.g;
import np.com.nepalipatro.helpers.i;
import np.com.nepalipatro.helpers.k;
import np.com.nepalipatro.models.Amessage;
import org.json.JSONArray;
import org.json.JSONObject;
import r6.f;
import v7.w;

/* compiled from: DataLoaderAmessages.kt */
public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final a f17569e = new a((g) null);

    /* renamed from: f  reason: collision with root package name */
    private static final String f17570f = "https://nepalipatro.com.np/amessage/getv2";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f17571a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f17572b = Boolean.FALSE;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public u9.a f17573c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<b> f17574d = new ArrayList<>();

    /* compiled from: DataLoaderAmessages.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* compiled from: DataLoaderAmessages.kt */
    public interface b {
        void a(i.f fVar);
    }

    /* renamed from: z9.c$c  reason: collision with other inner class name */
    /* compiled from: DataLoaderAmessages.kt */
    public static final class C0298c implements i.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f17575a;

        /* renamed from: z9.c$c$a */
        /* compiled from: DataLoaderAmessages.kt */
        public static final class a extends x6.a<List<? extends Amessage>> {
            a() {
            }
        }

        C0298c(c cVar) {
            this.f17575a = cVar;
        }

        public void a(i.f fVar, String str) {
            List<Amessage> list;
            if (fVar == i.f.HTTP_SUCCESS) {
                try {
                    f b10 = new r6.g().c("yyyy-MM-dd HH:mm:ss").b();
                    Object obj = new JSONObject(str).get(FirebaseAnalytics.Param.CONTENT);
                    m.d(obj, "null cannot be cast to non-null type org.json.JSONArray");
                    for (Amessage amessage : (List) b10.i(((JSONArray) obj).toString(), new a().e())) {
                        String id = amessage.getId();
                        u9.a aVar = null;
                        if (id != null) {
                            u9.a c10 = this.f17575a.f17573c;
                            if (c10 == null) {
                                m.x("dbHelper");
                                c10 = null;
                            }
                            list = c10.j(id);
                        } else {
                            list = null;
                        }
                        m.c(list);
                        if (list.size() > 0) {
                            Amessage amessage2 = list.get(0);
                            amessage2.setAflag(amessage.getAflag());
                            amessage2.setCreatedt(amessage.getCreatedt());
                            amessage2.setDorder(amessage.getDorder());
                            amessage2.setExpiry(amessage.getExpiry());
                            amessage2.setOptions(amessage.getOptions());
                            amessage2.setMessage_en(amessage.getMessage_en());
                            amessage2.setMessage_np(amessage.getMessage_np());
                            amessage2.setStdate(amessage.getStdate());
                            amessage2.setLink(amessage.getLink());
                            amessage2.setLinktype(amessage.getLinktype());
                            amessage2.setPin(amessage.getPin());
                            u9.a c11 = this.f17575a.f17573c;
                            if (c11 == null) {
                                m.x("dbHelper");
                            } else {
                                aVar = c11;
                            }
                            aVar.M(amessage2);
                        } else {
                            u9.a c12 = this.f17575a.f17573c;
                            if (c12 == null) {
                                m.x("dbHelper");
                            } else {
                                aVar = c12;
                            }
                            aVar.E(amessage);
                        }
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                k.a aVar2 = k.f16077a;
                k.a.z(aVar2, this.f17575a.f17571a, aVar2.e(), System.currentTimeMillis(), (String) null, 8, (Object) null);
            }
        }
    }

    /* compiled from: DataLoaderAmessages.kt */
    public static final class d implements i.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f17576a;

        d(c cVar) {
            this.f17576a = cVar;
        }

        public void a(i.f fVar, Bundle bundle) {
            this.f17576a.j(Boolean.FALSE);
            c cVar = this.f17576a;
            m.c(fVar);
            cVar.g(fVar);
        }
    }

    public c(Context context) {
        m.f(context, "context");
        this.f17571a = context;
        this.f17573c = new u9.a(context);
    }

    private final void e() {
        this.f17572b = Boolean.TRUE;
        i iVar = new i(this.f17571a, f17570f, (w) null);
        iVar.l(new C0298c(this));
        iVar.m(new d(this));
        iVar.e(true);
        iVar.execute(new Void[0]);
    }

    /* access modifiers changed from: private */
    public final void g(i.f fVar) {
        int size = this.f17574d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f17574d.get(i10).a(fVar);
        }
    }

    public final void d(Context context, int i10) {
        m.f(context, "context");
        u9.a aVar = this.f17573c;
        if (aVar == null) {
            m.x("dbHelper");
            aVar = null;
        }
        aVar.d(i10);
    }

    public final void f(Boolean bool) {
        g.a aVar = np.com.nepalipatro.helpers.g.f16048a;
        StringBuilder sb = new StringBuilder();
        sb.append("Amessage execute with ");
        m.c(bool);
        sb.append(bool.booleanValue());
        aVar.b(sb.toString());
        Boolean bool2 = this.f17572b;
        m.c(bool2);
        if (!bool2.booleanValue()) {
            if (bool.booleanValue()) {
                e();
                return;
            }
            Boolean i10 = i();
            m.c(i10);
            if (i10.booleanValue()) {
                e();
            }
        }
    }

    public final Boolean h() {
        return this.f17572b;
    }

    public final Boolean i() {
        k.a aVar = k.f16077a;
        long g10 = aVar.g(this.f17571a, aVar.e(), 0);
        Context context = this.f17571a;
        m.d(context, "null cannot be cast to non-null type np.com.nepalipatro.App");
        FirebaseRemoteConfig c10 = ((App) context).c();
        Long valueOf = c10 != null ? Long.valueOf(c10.getLong(np.com.nepalipatro.helpers.f.f16022a.d())) : null;
        m.c(valueOf);
        return Boolean.valueOf(g10 + (valueOf.longValue() * ((long) 1000)) < System.currentTimeMillis());
    }

    public final void j(Boolean bool) {
        this.f17572b = bool;
    }
}
