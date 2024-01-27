package n3;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import androidx.browser.customtabs.d;
import c3.b;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: CustomTabsFactory */
class a {

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f10268b = Pattern.compile("^.+:.+/");

    /* renamed from: a  reason: collision with root package name */
    private final Context f10269a;

    a(Context context) {
        this.f10269a = context;
    }

    private void a(d.b bVar, Map<String, String> map) {
        int e10 = map.containsKey("startEnter") ? e(map.get("startEnter")) : -1;
        int e11 = map.containsKey("startExit") ? e(map.get("startExit")) : -1;
        int e12 = map.containsKey("endEnter") ? e(map.get("endEnter")) : -1;
        int e13 = map.containsKey("endExit") ? e(map.get("endExit")) : -1;
        if (!(e10 == -1 || e11 == -1)) {
            bVar.k(this.f10269a, e10, e11);
        }
        if (e12 != -1 && e13 != -1) {
            bVar.e(this.f10269a, e12, e13);
        }
    }

    private void d(Intent intent, Map<String, Object> map) {
        if (map.containsKey("headers")) {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : ((Map) map.get("headers")).entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            intent.putExtra("com.android.browser.headers", bundle);
        }
    }

    private int e(String str) {
        if (f10268b.matcher(str).find()) {
            return this.f10269a.getResources().getIdentifier(str, (String) null, (String) null);
        }
        return this.f10269a.getResources().getIdentifier(str, "anim", this.f10269a.getPackageName());
    }

    /* access modifiers changed from: package-private */
    public c3.a b(Map<String, Object> map) {
        List list = map.containsKey("extraCustomTabs") ? (List) map.get("extraCustomTabs") : null;
        if (list == null || list.isEmpty()) {
            return new b.a(this.f10269a);
        }
        return new b.a((List<String>) list);
    }

    /* access modifiers changed from: package-private */
    public d c(Map<String, Object> map) {
        d.b bVar = new d.b();
        if (map.containsKey("toolbarColor")) {
            bVar.l(Color.parseColor((String) map.get("toolbarColor")));
        }
        if (map.containsKey("enableUrlBarHiding") && ((Boolean) map.get("enableUrlBarHiding")).booleanValue()) {
            bVar.c();
        }
        if (map.containsKey("enableDefaultShare") && ((Boolean) map.get("enableDefaultShare")).booleanValue()) {
            bVar.a();
        }
        if (map.containsKey("showPageTitle")) {
            bVar.j(((Boolean) map.get("showPageTitle")).booleanValue());
        }
        if (map.containsKey("enableInstantApps")) {
            bVar.f(((Boolean) map.get("enableInstantApps")).booleanValue());
        }
        if (map.containsKey("animations")) {
            a(bVar, (Map) map.get("animations"));
        }
        d b10 = bVar.b();
        d(b10.f1357a, map);
        return b10;
    }
}
