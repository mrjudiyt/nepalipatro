package np.com.nepalipatro.notification;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.h;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.MainActivity;
import np.com.nepalipatro.helpers.e;
import np.com.nepalipatro.helpers.f;
import np.com.nepalipatro.helpers.g;
import np.com.nepalipatro.helpers.j;
import np.com.nepalipatro.helpers.k;
import np.com.nepalipatro.notification.AppNotifications;
import org.json.JSONObject;
import v9.a;
import w9.i;

/* compiled from: AppNotificationsActionJobIntentservice.kt */
public final class AppNotificationsActionJobIntentservice extends h {
    private final void j(Context context, Intent intent) {
        Intent intent2 = new Intent(context, MainActivity.class);
        try {
            if (intent.getExtras() != null) {
                Bundle extras = intent.getExtras();
                m.c(extras);
                intent2.putExtras(extras);
            }
        } catch (Exception e10) {
            if (g.f16048a.a()) {
                e10.printStackTrace();
            }
        }
        intent2.setFlags(335577088);
        context.startActivity(intent2);
        try {
            a aVar = new a(context.getApplicationContext());
            ca.a aVar2 = ca.a.f13428a;
            aVar.b(aVar2.g(), aVar2.b(), aVar2.f());
        } catch (Exception e11) {
            if (g.f16048a.a()) {
                e11.printStackTrace();
            }
        }
    }

    private final void k(Context context, Intent intent) {
        Intent intent2 = new Intent(context, MainActivity.class);
        try {
            if (intent.getExtras() != null) {
                Bundle extras = intent.getExtras();
                m.c(extras);
                intent2.putExtras(extras);
            }
        } catch (Exception e10) {
            if (g.f16048a.a()) {
                e10.printStackTrace();
            }
        }
        intent2.setFlags(335577088);
        context.startActivity(intent2);
        a aVar = new a(context.getApplicationContext());
        ca.a aVar2 = ca.a.f13428a;
        aVar.b(aVar2.g(), aVar2.b(), aVar2.o());
    }

    private final void l(Context context, Intent intent) {
        String str;
        String str2;
        String str3;
        String str4;
        Context context2 = context;
        Intent intent2 = intent;
        Class<MainActivity> cls = MainActivity.class;
        g.a aVar = g.f16048a;
        StringBuilder sb = new StringBuilder();
        sb.append("Received FCM Notification Action: ");
        String action = intent.getAction();
        m.c(action);
        sb.append(action);
        aVar.b(sb.toString());
        e.a aVar2 = e.f15961a;
        if (intent2.hasExtra(aVar2.c())) {
            aVar.b("   Intent has intent extra --" + aVar2.c());
            Serializable serializableExtra = intent2.getSerializableExtra(aVar2.c());
            m.d(serializableExtra, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
            HashMap hashMap = (HashMap) serializableExtra;
            if (hashMap.containsKey(aVar2.g())) {
                String str5 = (String) hashMap.get(aVar2.g());
            }
            String str6 = hashMap.containsKey(aVar2.t()) ? (String) hashMap.get(aVar2.t()) : "";
            if (hashMap.containsKey(aVar2.q())) {
                str = (String) hashMap.get(aVar2.q());
            } else {
                str = "";
            }
            String f10 = hashMap.containsKey(aVar2.d()) ? (String) hashMap.get(aVar2.d()) : aVar2.f();
            if (hashMap.containsKey(aVar2.u())) {
                str2 = (String) hashMap.get(aVar2.u());
            } else {
                str2 = "";
            }
            if (hashMap.containsKey(aVar2.h())) {
                str3 = (String) hashMap.get(aVar2.h());
            } else {
                str3 = "";
            }
            if (hashMap.containsKey(aVar2.r())) {
                str4 = (String) hashMap.get(aVar2.r());
            } else {
                str4 = "";
            }
            aVar.b("   Dumping " + aVar2.c());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("        ");
            String str7 = "id";
            sb2.append(aVar2.t());
            sb2.append(" = ");
            sb2.append(str6);
            aVar.b(sb2.toString());
            aVar.b("        " + aVar2.q() + " = " + str);
            aVar.b("        " + aVar2.d() + " = " + f10);
            aVar.b("        " + aVar2.u() + " = " + str2);
            aVar.b("        " + aVar2.h() + " = " + str3);
            aVar.b("        " + aVar2.r() + " = " + str4);
            if (!m.a(f10, aVar2.e())) {
                Intent intent3 = new Intent(context2, cls);
                try {
                    if (intent.getExtras() != null) {
                        Bundle extras = intent.getExtras();
                        m.c(extras);
                        intent3.putExtras(extras);
                    }
                    if (m.a(str3, aVar2.K())) {
                        JSONObject jSONObject = new JSONObject(str4);
                        String str8 = str7;
                        if (jSONObject.has(str8)) {
                            Object obj = jSONObject.get(str8);
                            a aVar3 = new a(context.getApplicationContext());
                            String l10 = ca.a.f13428a.l();
                            aVar3.c(l10, "https://nepalipatro.com.np/news/feeds/" + obj);
                        } else {
                            a aVar4 = new a(context.getApplicationContext());
                            String e10 = ca.a.f13428a.e();
                            aVar4.c(e10, "notification_" + str2);
                        }
                    } else {
                        a aVar5 = new a(context.getApplicationContext());
                        String e11 = ca.a.f13428a.e();
                        aVar5.c(e11, "notification_" + str2);
                    }
                    intent3.setFlags(335577088);
                    context2.startActivity(intent3);
                } catch (Exception e12) {
                    if (g.f16048a.a()) {
                        e12.printStackTrace();
                    }
                }
            } else if (m.a(str2, "") || m.a(str3, "")) {
                aVar.b("   Nothing done as direct action has no type and link");
            } else if (m.a(str2, aVar2.y())) {
                if (m.a(str3, aVar2.j()) && !i.f17064a.a(str4)) {
                    q(context2, hashMap);
                }
            } else if (m.a(str2, aVar2.x())) {
                q(context2, hashMap);
            } else if (m.a(str2, aVar2.P())) {
                q(context2, hashMap);
            } else if (m.a(str2, aVar2.w())) {
                q(context2, hashMap);
            } else if (m.a(str2, aVar2.A())) {
                q(context2, hashMap);
            } else if (m.a(str2, aVar2.Q())) {
                q(context2, hashMap);
            } else if (m.a(str2, aVar2.v())) {
                j jVar = j.f16076a;
                m.c(str3);
                jVar.b(context2, str3);
            } else {
                Intent intent4 = new Intent(context2, cls);
                intent4.putExtra(aVar2.c(), hashMap);
                intent4.putExtra(aVar2.U(), aVar2.W());
                intent4.setFlags(335577088);
                context2.startActivity(intent4);
            }
        } else {
            aVar.b("   Intent doesn't have intent extra data, opening app with empty intent");
            Intent intent5 = new Intent(context2, cls);
            intent5.setFlags(335577088);
            context2.startActivity(intent5);
        }
    }

    private final void m(Context context, Intent intent) {
        HashMap hashMap = new HashMap();
        e.a aVar = e.f15961a;
        hashMap.put(aVar.u(), aVar.y());
        hashMap.put(aVar.h(), aVar.l());
        try {
            new a(context.getApplicationContext()).d();
        } catch (Exception e10) {
            if (g.f16048a.a()) {
                e10.printStackTrace();
            }
        }
    }

    private final void n(Context context, Intent intent) {
        Class<MainActivity> cls = MainActivity.class;
        f.a aVar = f.f16022a;
        if (intent.hasExtra(aVar.c())) {
            intent.getStringExtra(aVar.c());
        }
        if (intent.hasExtra(aVar.b())) {
            intent.getStringExtra(aVar.b());
        }
        boolean z10 = false;
        if (intent.hasExtra("IS_REMINDER")) {
            z10 = intent.getBooleanExtra("IS_REMINDER", false);
        }
        HashMap hashMap = new HashMap();
        e.a aVar2 = e.f15961a;
        hashMap.put(aVar2.u(), aVar2.y());
        hashMap.put(aVar2.h(), aVar2.m());
        Intent intent2 = new Intent(context, cls);
        intent2.putExtra(aVar2.c(), hashMap);
        intent2.setFlags(335577088);
        context.startActivity(intent2);
        if (z10) {
            try {
                a aVar3 = new a(context.getApplicationContext());
                ca.a aVar4 = ca.a.f13428a;
                aVar3.b(aVar4.n(), aVar4.d(), aVar4.n());
            } catch (Exception e10) {
                if (g.f16048a.a()) {
                    e10.printStackTrace();
                    return;
                }
                return;
            }
        } else {
            a aVar5 = new a(context.getApplicationContext());
            ca.a aVar6 = ca.a.f13428a;
            aVar5.b(aVar6.j(), aVar6.d(), aVar6.j());
        }
        Intent intent3 = new Intent(context, cls);
        intent3.putExtra(aVar2.c(), hashMap);
        intent3.setFlags(335577088);
        context.startActivity(intent3);
    }

    private final void o(Context context, Intent intent) {
        if (intent != null) {
            Intent intent2 = new Intent();
            try {
                if (intent.getExtras() != null) {
                    Bundle extras = intent.getExtras();
                    m.c(extras);
                    intent2.putExtras(extras);
                }
            } catch (Exception e10) {
                if (g.f16048a.a()) {
                    e10.printStackTrace();
                }
            }
            if (m.a(intent.getAction(), AppNotifications.f16131h.f())) {
                e.a aVar = e.f15961a;
                intent2.putExtra(aVar.U(), aVar.X());
                a aVar2 = new a(context.getApplicationContext());
                ca.a aVar3 = ca.a.f13428a;
                aVar2.b(aVar3.k(), aVar3.b(), aVar3.h());
            } else {
                e.a aVar4 = e.f15961a;
                intent2.putExtra(aVar4.U(), aVar4.W());
                f.a aVar5 = f.f16022a;
                String stringExtra = intent.getStringExtra(aVar5.h());
                String valueOf = intent.hasExtra(aVar5.g()) ? String.valueOf(intent.getStringExtra(aVar5.g())) : "";
                if (valueOf.length() == 0) {
                    a aVar6 = new a(context.getApplicationContext());
                    ca.a aVar7 = ca.a.f13428a;
                    aVar6.b(aVar7.l(), aVar7.b(), String.valueOf(stringExtra));
                } else {
                    a aVar8 = new a(context.getApplicationContext());
                    ca.a aVar9 = ca.a.f13428a;
                    String l10 = aVar9.l();
                    String b10 = aVar9.b();
                    aVar8.b(l10, b10, valueOf + ' ' + stringExtra);
                }
            }
            intent2.setFlags(335577088);
            context.startActivity(intent2);
        }
    }

    private final void p(Context context, Intent intent) {
        HashMap hashMap = new HashMap();
        e.a aVar = e.f15961a;
        hashMap.put(aVar.u(), aVar.y());
        hashMap.put(aVar.h(), aVar.o());
        Intent intent2 = new Intent(context, MainActivity.class);
        intent2.putExtra(aVar.c(), hashMap);
        intent2.setFlags(335577088);
        if (context != null) {
            context.startActivity(intent2);
        }
        try {
            a aVar2 = new a(context.getApplicationContext());
            ca.a aVar3 = ca.a.f13428a;
            aVar2.b(aVar3.m(), aVar3.d(), aVar3.m());
        } catch (Exception e10) {
            if (g.f16048a.a()) {
                e10.printStackTrace();
            }
        }
    }

    private final void q(Context context, HashMap<String, String> hashMap) {
        try {
            Intent intent = new Intent(context, MainActivity.class);
            e.a aVar = e.f15961a;
            intent.putExtra(aVar.c(), hashMap);
            intent.putExtra(aVar.U(), aVar.W());
            intent.setFlags(335577088);
            context.startActivity(intent);
        } catch (Exception e10) {
            if (g.f16048a.a()) {
                e10.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void g(Intent intent) {
        m.f(intent, "intent");
        g.a aVar = g.f16048a;
        StringBuilder sb = new StringBuilder();
        sb.append("Received ");
        String action = intent.getAction();
        m.c(action);
        sb.append(action);
        aVar.b(sb.toString());
        try {
            String action2 = intent.getAction();
            AppNotifications.a aVar2 = AppNotifications.f16131h;
            if (m.a(action2, aVar2.a())) {
                Context applicationContext = getApplicationContext();
                m.e(applicationContext, "applicationContext");
                l(applicationContext, intent);
            } else if (m.a(action2, aVar2.l())) {
                Context applicationContext2 = getApplicationContext();
                m.e(applicationContext2, "applicationContext");
                k(applicationContext2, intent);
            } else if (m.a(action2, aVar2.i())) {
                Context applicationContext3 = getApplicationContext();
                m.e(applicationContext3, "applicationContext");
                j(applicationContext3, intent);
            } else if (m.a(action2, aVar2.k())) {
                aVar2.p(Boolean.FALSE);
            } else if (m.a(action2, aVar2.h())) {
                aVar2.p(Boolean.FALSE);
                k.a aVar3 = k.f16077a;
                Context applicationContext4 = getApplicationContext();
                m.e(applicationContext4, "applicationContext");
                aVar3.x(applicationContext4, aVar3.o(), false);
            } else if (m.a(action2, aVar2.j())) {
                Context applicationContext5 = getApplicationContext();
                m.e(applicationContext5, "applicationContext");
                p(applicationContext5, intent);
            } else if (m.a(action2, aVar2.d())) {
                Context applicationContext6 = getApplicationContext();
                m.e(applicationContext6, "applicationContext");
                n(applicationContext6, intent);
            } else if (m.a(action2, aVar2.f())) {
                aVar2.r(false);
                Context applicationContext7 = getApplicationContext();
                m.e(applicationContext7, "applicationContext");
                o(applicationContext7, intent);
            } else if (m.a(action2, aVar2.g())) {
                Context applicationContext8 = getApplicationContext();
                m.e(applicationContext8, "applicationContext");
                o(applicationContext8, intent);
            } else if (m.a(action2, aVar2.c())) {
                Context applicationContext9 = getApplicationContext();
                m.e(applicationContext9, "applicationContext");
                m(applicationContext9, intent);
            } else if (m.a(action2, aVar2.b())) {
                aVar2.q(Boolean.FALSE);
            } else if (m.a(action2, aVar2.e())) {
                aVar2.r(false);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
