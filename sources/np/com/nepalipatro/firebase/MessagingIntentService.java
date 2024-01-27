package np.com.nepalipatro.firebase;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.h;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.y;
import np.com.nepalipatro.App;
import np.com.nepalipatro.helpers.e;
import np.com.nepalipatro.helpers.g;
import np.com.nepalipatro.helpers.i;
import np.com.nepalipatro.helpers.k;
import np.com.nepalipatro.notification.AppNotifications;
import o8.q;
import org.json.JSONArray;
import org.json.JSONObject;
import r6.f;
import r6.n;
import v7.s;
import v7.w;
import y8.l;
import z9.d;

/* compiled from: MessagingIntentService.kt */
public final class MessagingIntentService extends h {

    /* renamed from: q  reason: collision with root package name */
    private HashMap<String, String> f15886q;

    /* compiled from: MessagingIntentService.kt */
    public static final class a implements i.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y<u9.a> f15887a;

        a(y<u9.a> yVar) {
            this.f15887a = yVar;
        }

        public void a(i.f fVar, Bundle bundle) {
            Bundle bundle2 = bundle;
            Object obj = bundle2 != null ? bundle2.get("RESPONSE_TEXT") : null;
            m.d(obj, "null cannot be cast to non-null type kotlin.String");
            JSONObject jSONObject = new JSONObject().getJSONObject((String) obj);
            JSONArray jSONArray = jSONObject.getJSONArray("events");
            JSONArray jSONArray2 = jSONObject.getJSONArray("exceptions");
            JSONArray jSONArray3 = jSONObject.getJSONArray("reminders");
            JSONArray jSONArray4 = jSONObject.getJSONArray("calendars");
            JSONArray jSONArray5 = jSONObject.getJSONArray("deleted_calendar");
            JSONArray jSONArray6 = jSONObject.getJSONArray("deleted_events");
            JSONArray jSONArray7 = jSONObject.getJSONArray("deleted_reminders");
            int length = jSONArray6.length();
            int i10 = 0;
            while (i10 < length) {
                Object obj2 = jSONArray6.get(i10);
                m.d(obj2, "null cannot be cast to non-null type com.google.gson.JsonObject");
                JSONArray jSONArray8 = jSONArray6;
                String lVar = ((n) obj2).l("event_id").toString();
                m.e(lVar, "deletedEve[\"event_id\"].toString()");
                ((u9.a) this.f15887a.f15575h).f(lVar);
                i10++;
                jSONArray6 = jSONArray8;
            }
            int length2 = jSONArray7.length();
            int i11 = 0;
            while (i11 < length2) {
                Object obj3 = jSONArray7.get(i11);
                m.d(obj3, "null cannot be cast to non-null type com.google.gson.JsonObject");
                JSONArray jSONArray9 = jSONArray7;
                String lVar2 = ((n) obj3).l("reminder_id").toString();
                m.e(lVar2, "deletedRem[\"reminder_id\"].toString()");
                ((u9.a) this.f15887a.f15575h).i(lVar2);
                i11++;
                jSONArray7 = jSONArray9;
            }
            m.e(jSONArray4, "calendars");
            ((u9.a) this.f15887a.f15575h).F(jSONArray4, false);
            m.e(jSONArray5, "deleted_calendar");
            ((u9.a) this.f15887a.f15575h).F(jSONArray5, true);
            m.e(jSONArray3, "reminders");
            ((u9.a) this.f15887a.f15575h).I(jSONArray3);
            m.e(jSONArray, "event");
            ((u9.a) this.f15887a.f15575h).G(jSONArray);
            m.e(jSONArray2, "exceptions");
            ((u9.a) this.f15887a.f15575h).g(jSONArray2);
        }
    }

    /* compiled from: MessagingIntentService.kt */
    public static final class b implements i.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MessagingIntentService f15888a;

        b(MessagingIntentService messagingIntentService) {
            this.f15888a = messagingIntentService;
        }

        public void a(i.f fVar, String str) {
            if (fVar == i.f.HTTP_SUCCESS) {
                try {
                    JSONArray jSONArray = new JSONObject(String.valueOf(str)).getJSONArray("services_jwt");
                    m.e(jSONArray, "jsonObj.getJSONArray(\"services_jwt\")");
                    if (jSONArray.length() > 0) {
                        k.a aVar = k.f16077a;
                        Context baseContext = this.f15888a.getBaseContext();
                        m.e(baseContext, "baseContext");
                        aVar.A(baseContext, aVar.i(), jSONArray.get(0).toString());
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* compiled from: MessagingIntentService.kt */
    static final class c extends kotlin.jvm.internal.n implements l<Void, q> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ FirebaseRemoteConfig f15889h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(FirebaseRemoteConfig firebaseRemoteConfig) {
            super(1);
            this.f15889h = firebaseRemoteConfig;
        }

        public final void a(Void voidR) {
            FirebaseRemoteConfig firebaseRemoteConfig = this.f15889h;
            if (firebaseRemoteConfig != null) {
                firebaseRemoteConfig.fetchAndActivate();
            }
            g.f16048a.b("Firebase config fetch completed");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Void) obj);
            return q.f16189a;
        }
    }

    private final void k(String str, String str2) {
        d m10;
        d m11;
        d m12;
        z9.c k10;
        z9.c k11;
        Task<Void> fetch;
        y yVar = new y();
        Context baseContext = getBaseContext();
        m.e(baseContext, "baseContext");
        yVar.f15575h = new u9.a(baseContext);
        g.a aVar = g.f16048a;
        aVar.b("Executing handle reload for link: " + str);
        e.a aVar2 = e.f15961a;
        String str3 = "";
        boolean z10 = false;
        boolean z11 = true;
        if (m.a(str, aVar2.F())) {
            try {
                k.a aVar3 = k.f16077a;
                Context baseContext2 = getBaseContext();
                m.c(baseContext2);
                String w10 = aVar3.w(baseContext2, aVar3.l(), str3);
                if (w10 != null) {
                    str3 = w10;
                }
                if (str3.length() <= 0) {
                    z11 = false;
                }
                if (z11) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("calendars", ((u9.a) yVar.f15575h).y());
                    hashMap.put("events", ((u9.a) yVar.f15575h).A());
                    hashMap.put("exceptions", ((u9.a) yVar.f15575h).z());
                    hashMap.put("reminders", ((u9.a) yVar.f15575h).B());
                    hashMap.put("deleted_events", ((u9.a) yVar.f15575h).w());
                    hashMap.put("deleted_reminders", ((u9.a) yVar.f15575h).x());
                    w d10 = w.d(s.c("application/json; charset=utf-8"), new f().q(hashMap));
                    Context baseContext3 = getBaseContext();
                    m.e(baseContext3, "baseContext");
                    i iVar = new i(baseContext3, aVar2.h0(), d10);
                    iVar.m(new a(yVar));
                    iVar.d(str3);
                    iVar.execute(new Void[0]);
                }
            } catch (Exception e10) {
                if (g.f16048a.a()) {
                    e10.printStackTrace();
                }
            }
        } else if (m.a(str, aVar2.N())) {
            try {
                k.a aVar4 = k.f16077a;
                Context baseContext4 = getBaseContext();
                m.c(baseContext4);
                String w11 = aVar4.w(baseContext4, aVar4.l(), str3);
                if (w11 != null) {
                    str3 = w11;
                }
                if (str3.length() <= 0) {
                    z11 = false;
                }
                if (z11) {
                    Context baseContext5 = getBaseContext();
                    m.e(baseContext5, "baseContext");
                    i iVar2 = new i(baseContext5, aVar2.g0(), (w) null);
                    iVar2.l(new b(this));
                    iVar2.d(str3);
                    iVar2.execute(new Void[0]);
                }
            } catch (Exception e11) {
                if (g.f16048a.a()) {
                    e11.printStackTrace();
                }
            }
        } else if (m.a(str, aVar2.G())) {
            try {
                Context applicationContext = getApplicationContext();
                m.d(applicationContext, "null cannot be cast to non-null type np.com.nepalipatro.App");
                FirebaseRemoteConfig c10 = ((App) applicationContext).c();
                if (c10 != null && (fetch = c10.fetch(TimeUnit.HOURS.toSeconds(12))) != null) {
                    fetch.addOnSuccessListener(new v9.b(new c(c10)));
                }
            } catch (Exception e12) {
                if (g.f16048a.a()) {
                    e12.printStackTrace();
                }
            }
        } else if (m.a(str, aVar2.E())) {
        } else {
            if (m.a(str, aVar2.O())) {
                try {
                    Context applicationContext2 = getApplicationContext();
                    m.d(applicationContext2, "null cannot be cast to non-null type np.com.nepalipatro.App");
                    z9.b b10 = ((App) applicationContext2).b();
                    if (b10 != null) {
                        b10.j(true, str2);
                    }
                } catch (Exception e13) {
                    if (g.f16048a.a()) {
                        e13.printStackTrace();
                    }
                }
            } else if (m.a(str, aVar2.L())) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    if (jSONObject.has("dt")) {
                        String obj = jSONObject.get("dt").toString();
                        if (obj.length() == 0) {
                            z10 = true;
                        }
                        if (!z10) {
                            Context applicationContext3 = getApplicationContext();
                            m.d(applicationContext3, "null cannot be cast to non-null type np.com.nepalipatro.App");
                            z9.b b11 = ((App) applicationContext3).b();
                            if (b11 != null) {
                                b11.h(true, obj);
                            }
                        }
                    }
                } catch (Exception e14) {
                    if (g.f16048a.a()) {
                        e14.printStackTrace();
                    }
                }
            } else if (m.a(str, aVar2.D())) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str2);
                    if (jSONObject2.has("dt") && jSONObject2.has(NativeProtocol.WEB_DIALOG_ACTION)) {
                        String obj2 = jSONObject2.get("dt").toString();
                        String valueOf = String.valueOf(jSONObject2.get(NativeProtocol.WEB_DIALOG_ACTION));
                        if (!(obj2.length() == 0)) {
                            if (valueOf.length() == 0) {
                                z10 = true;
                            }
                            if (!z10) {
                                Context applicationContext4 = getApplicationContext();
                                m.d(applicationContext4, "null cannot be cast to non-null type np.com.nepalipatro.App");
                                z9.b b12 = ((App) applicationContext4).b();
                                if (b12 != null) {
                                    b12.e(str2);
                                }
                            }
                        }
                    }
                } catch (Exception e15) {
                    if (g.f16048a.a()) {
                        e15.printStackTrace();
                    }
                }
            } else if (m.a(str, aVar2.M())) {
                Context applicationContext5 = getApplicationContext();
                m.d(applicationContext5, "null cannot be cast to non-null type np.com.nepalipatro.App");
                z9.b b13 = ((App) applicationContext5).b();
                if (b13 != null) {
                    b13.i(Boolean.TRUE);
                }
                aVar.b("     Reloaded " + aVar2.M());
            } else if (m.a(str, aVar2.H())) {
                Context applicationContext6 = getApplicationContext();
                m.d(applicationContext6, "null cannot be cast to non-null type np.com.nepalipatro.App");
                z9.b b14 = ((App) applicationContext6).b();
                if (b14 != null) {
                    b14.g(Boolean.TRUE);
                }
                aVar.b("     Reloaded " + aVar2.H());
            } else if (m.a(str, aVar2.J())) {
                try {
                    JSONObject jSONObject3 = new JSONObject(str2);
                    if (jSONObject3.getBoolean("delete")) {
                        if (jSONObject3.has("id")) {
                            long j10 = jSONObject3.getLong("id");
                            Context applicationContext7 = getApplicationContext();
                            m.d(applicationContext7, "null cannot be cast to non-null type np.com.nepalipatro.App");
                            z9.b b15 = ((App) applicationContext7).b();
                            if (!(b15 == null || (k11 = b15.k()) == null)) {
                                Context applicationContext8 = getApplicationContext();
                                m.e(applicationContext8, "applicationContext");
                                k11.d(applicationContext8, (int) j10);
                            }
                        } else {
                            Context applicationContext9 = getApplicationContext();
                            m.d(applicationContext9, "null cannot be cast to non-null type np.com.nepalipatro.App");
                            z9.b b16 = ((App) applicationContext9).b();
                            if (!(b16 == null || (k10 = b16.k()) == null)) {
                                Context applicationContext10 = getApplicationContext();
                                m.e(applicationContext10, "applicationContext");
                                k10.d(applicationContext10, -1);
                            }
                        }
                    }
                } catch (Exception e16) {
                    if (g.f16048a.a()) {
                        e16.printStackTrace();
                    }
                }
                Context applicationContext11 = getApplicationContext();
                m.d(applicationContext11, "null cannot be cast to non-null type np.com.nepalipatro.App");
                z9.b b17 = ((App) applicationContext11).b();
                if (b17 != null) {
                    b17.c(Boolean.TRUE);
                }
                g.a aVar5 = g.f16048a;
                aVar5.b("     Reloaded " + e.f15961a.J());
            } else if (m.a(str, aVar2.K())) {
                w9.h hVar = w9.h.f17060a;
                Context applicationContext12 = getApplicationContext();
                m.e(applicationContext12, "applicationContext");
                if (hVar.c(applicationContext12, hVar.b())) {
                    aVar.b("     Reloaded " + aVar2.K());
                    return;
                }
                aVar.b("     News module reload stopped as news module is disabled");
            } else if (m.a(str, aVar2.I())) {
                w9.h hVar2 = w9.h.f17060a;
                Context applicationContext13 = getApplicationContext();
                m.e(applicationContext13, "applicationContext");
                if (hVar2.c(applicationContext13, hVar2.a())) {
                    aVar.b("     Reloaded " + aVar2.I());
                    return;
                }
                aVar.b("     LS module reload stopped as LS module is disabled");
            } else if (!m.a(str, aVar2.C())) {
                Context applicationContext14 = getApplicationContext();
                m.d(applicationContext14, "null cannot be cast to non-null type np.com.nepalipatro.App");
                z9.b b18 = ((App) applicationContext14).b();
                if (b18 != null) {
                    b18.b(Boolean.TRUE);
                }
                aVar.b("     All dataloader reloads are executed as link doesn't matched with any of case matched");
            } else if (w9.i.f17064a.a(str2)) {
                Context applicationContext15 = getApplicationContext();
                m.d(applicationContext15, "null cannot be cast to non-null type np.com.nepalipatro.App");
                z9.b b19 = ((App) applicationContext15).b();
                if (b19 != null && (m12 = b19.m()) != null) {
                    m12.g(true, d.b.NONE, 0);
                }
            } else {
                try {
                    JSONObject jSONObject4 = new JSONObject(str2);
                    if (jSONObject4.has("id")) {
                        long parseLong = Long.parseLong(jSONObject4.get("id").toString());
                        if (jSONObject4.has("delete")) {
                            Context applicationContext16 = getApplicationContext();
                            m.d(applicationContext16, "null cannot be cast to non-null type np.com.nepalipatro.App");
                            z9.b b20 = ((App) applicationContext16).b();
                            if (b20 != null && (m11 = b20.m()) != null) {
                                m11.e(parseLong);
                                return;
                            }
                            return;
                        }
                        Context applicationContext17 = getApplicationContext();
                        m.d(applicationContext17, "null cannot be cast to non-null type np.com.nepalipatro.App");
                        z9.b b21 = ((App) applicationContext17).b();
                        if (b21 != null && (m10 = b21.m()) != null) {
                            m10.g(false, d.b.ID_IGNORE, parseLong);
                        }
                    }
                } catch (Exception e17) {
                    if (g.f16048a.a()) {
                        e17.printStackTrace();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void l(l lVar, Object obj) {
        m.f(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: protected */
    public void g(Intent intent) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i10;
        m.f(intent, "intent");
        e.a aVar = e.f15961a;
        if (intent.hasExtra(aVar.c())) {
            Serializable serializableExtra = intent.getSerializableExtra(aVar.c());
            m.d(serializableExtra, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
            HashMap<String, String> hashMap = (HashMap) serializableExtra;
            this.f15886q = hashMap;
            m.c(hashMap);
            if (hashMap.containsKey(aVar.g())) {
                HashMap<String, String> hashMap2 = this.f15886q;
                m.c(hashMap2);
                str = hashMap2.get(aVar.g());
            } else {
                str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
            }
            HashMap<String, String> hashMap3 = this.f15886q;
            m.c(hashMap3);
            String str8 = "";
            if (hashMap3.containsKey(aVar.t())) {
                HashMap<String, String> hashMap4 = this.f15886q;
                m.c(hashMap4);
                str2 = hashMap4.get(aVar.t());
            } else {
                str2 = str8;
            }
            HashMap<String, String> hashMap5 = this.f15886q;
            m.c(hashMap5);
            if (hashMap5.containsKey(aVar.q())) {
                HashMap<String, String> hashMap6 = this.f15886q;
                m.c(hashMap6);
                str3 = hashMap6.get(aVar.q());
            } else {
                str3 = str8;
            }
            HashMap<String, String> hashMap7 = this.f15886q;
            m.c(hashMap7);
            if (hashMap7.containsKey(aVar.d())) {
                HashMap<String, String> hashMap8 = this.f15886q;
                m.c(hashMap8);
                str4 = hashMap8.get(aVar.d());
            } else {
                str4 = aVar.f();
            }
            HashMap<String, String> hashMap9 = this.f15886q;
            m.c(hashMap9);
            if (hashMap9.containsKey(aVar.u())) {
                HashMap<String, String> hashMap10 = this.f15886q;
                m.c(hashMap10);
                str5 = hashMap10.get(aVar.u());
            } else {
                str5 = str8;
            }
            HashMap<String, String> hashMap11 = this.f15886q;
            m.c(hashMap11);
            if (hashMap11.containsKey(aVar.h())) {
                HashMap<String, String> hashMap12 = this.f15886q;
                m.c(hashMap12);
                str6 = hashMap12.get(aVar.h());
            } else {
                str6 = str8;
            }
            HashMap<String, String> hashMap13 = this.f15886q;
            m.c(hashMap13);
            if (hashMap13.containsKey(aVar.r())) {
                HashMap<String, String> hashMap14 = this.f15886q;
                m.c(hashMap14);
                str7 = hashMap14.get(aVar.r());
            } else {
                str7 = str8;
            }
            g.a aVar2 = g.f16048a;
            aVar2.b("   Dumping " + aVar.c());
            aVar2.b("        " + aVar.g() + " = " + str);
            aVar2.b("        " + aVar.t() + " = " + str2);
            aVar2.b("        " + aVar.q() + " = " + str3);
            aVar2.b("        " + aVar.d() + " = " + str4);
            aVar2.b("        " + aVar.u() + " = " + str5);
            aVar2.b("        " + aVar.h() + " = " + str6);
            aVar2.b("        " + aVar.r() + " = " + str7);
            if (m.a(str5, aVar.y()) && m.a(str6, aVar.n())) {
                Context applicationContext = getApplicationContext();
                m.e(applicationContext, "applicationContext");
                AppNotifications appNotifications = new AppNotifications(applicationContext, (Service) null, 2, (kotlin.jvm.internal.g) null);
                HashMap<String, String> hashMap15 = this.f15886q;
                m.c(hashMap15);
                appNotifications.v(hashMap15, str6);
            } else if (m.a(str5, aVar.B())) {
                m.c(str6);
                if (str7 != null) {
                    str8 = str7;
                }
                k(str6, str8);
            } else {
                if (m.a(str5, aVar.z()) && (m.a(str6, aVar.n()) || m.a(str6, aVar.l()))) {
                    try {
                        i10 = Integer.parseInt(new JSONObject(str7).get("enabled").toString());
                    } catch (Exception e10) {
                        if (g.f16048a.a()) {
                            e10.printStackTrace();
                        }
                        i10 = 2;
                    }
                    if (i10 <= 2) {
                        e.a aVar3 = e.f15961a;
                        if (m.a(str6, aVar3.l())) {
                            w9.h hVar = w9.h.f17060a;
                            Context applicationContext2 = getApplicationContext();
                            m.e(applicationContext2, "applicationContext");
                            if (!hVar.c(applicationContext2, hVar.a()) || i10 != 0) {
                                Context applicationContext3 = getApplicationContext();
                                m.e(applicationContext3, "applicationContext");
                                if (!hVar.c(applicationContext3, hVar.a()) && i10 == 1) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (m.a(str6, aVar3.n())) {
                            w9.h hVar2 = w9.h.f17060a;
                            Context applicationContext4 = getApplicationContext();
                            m.e(applicationContext4, "applicationContext");
                            if (!hVar2.c(applicationContext4, hVar2.b()) || i10 != 0) {
                                Context applicationContext5 = getApplicationContext();
                                m.e(applicationContext5, "applicationContext");
                                if (!hVar2.c(applicationContext5, hVar2.b()) && i10 == 1) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                e.a aVar4 = e.f15961a;
                if (m.a(str5, aVar4.y()) && m.a(str6, aVar4.i())) {
                    try {
                        JSONObject jSONObject = new JSONObject(str7);
                        String obj = jSONObject.get("module").toString();
                        int parseInt = Integer.parseInt(jSONObject.get(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS).toString());
                        if (m.a(obj, aVar4.l())) {
                            w9.h hVar3 = w9.h.f17060a;
                            Context applicationContext6 = getApplicationContext();
                            m.e(applicationContext6, "applicationContext");
                            if (!hVar3.c(applicationContext6, hVar3.a()) || parseInt != 0) {
                                Context applicationContext7 = getApplicationContext();
                                m.e(applicationContext7, "applicationContext");
                                if (!hVar3.c(applicationContext7, hVar3.a()) && parseInt == 1) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (m.a(obj, aVar4.n())) {
                            w9.h hVar4 = w9.h.f17060a;
                            Context applicationContext8 = getApplicationContext();
                            m.e(applicationContext8, "applicationContext");
                            if (!hVar4.c(applicationContext8, hVar4.b()) || parseInt != 0) {
                                Context applicationContext9 = getApplicationContext();
                                m.e(applicationContext9, "applicationContext");
                                if (!hVar4.c(applicationContext9, hVar4.b()) && parseInt == 1) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    } catch (Exception e11) {
                        if (g.f16048a.a()) {
                            e11.printStackTrace();
                        }
                    }
                }
                e.a aVar5 = e.f15961a;
                if (!m.a(str5, aVar5.y()) || !m.a(str6, aVar5.o())) {
                    Context applicationContext10 = getApplicationContext();
                    m.e(applicationContext10, "applicationContext");
                    AppNotifications appNotifications2 = new AppNotifications(applicationContext10, (Service) null, 2, (kotlin.jvm.internal.g) null);
                    HashMap<String, String> hashMap16 = this.f15886q;
                    m.c(hashMap16);
                    AppNotifications.w(appNotifications2, hashMap16, (String) null, 2, (Object) null);
                    return;
                }
                k.a aVar6 = k.f16077a;
                Context applicationContext11 = getApplicationContext();
                m.e(applicationContext11, "applicationContext");
                if (aVar6.c(applicationContext11, aVar6.s(), false)) {
                    Context applicationContext12 = getApplicationContext();
                    m.e(applicationContext12, "applicationContext");
                    AppNotifications appNotifications3 = new AppNotifications(applicationContext12, (Service) null, 2, (kotlin.jvm.internal.g) null);
                    HashMap<String, String> hashMap17 = this.f15886q;
                    m.c(hashMap17);
                    AppNotifications.w(appNotifications3, hashMap17, (String) null, 2, (Object) null);
                }
            }
        }
    }
}
