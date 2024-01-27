package e8;

import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: BatchOperation */
public class c extends a {

    /* renamed from: a  reason: collision with root package name */
    final Map<String, Object> f14324a;

    /* renamed from: b  reason: collision with root package name */
    final a f14325b = new a();

    /* renamed from: c  reason: collision with root package name */
    final boolean f14326c;

    /* compiled from: BatchOperation */
    public class a implements f {

        /* renamed from: a  reason: collision with root package name */
        Object f14327a;

        /* renamed from: b  reason: collision with root package name */
        String f14328b;

        /* renamed from: c  reason: collision with root package name */
        String f14329c;

        /* renamed from: d  reason: collision with root package name */
        Object f14330d;

        public a() {
        }

        public void error(String str, String str2, Object obj) {
            this.f14328b = str;
            this.f14329c = str2;
            this.f14330d = obj;
        }

        public void success(Object obj) {
            this.f14327a = obj;
        }
    }

    public c(Map<String, Object> map, boolean z10) {
        this.f14324a = map;
        this.f14326c = z10;
    }

    public <T> T a(String str) {
        return this.f14324a.get(str);
    }

    public boolean c() {
        return this.f14326c;
    }

    public String f() {
        return (String) this.f14324a.get("method");
    }

    public boolean g(String str) {
        return this.f14324a.containsKey(str);
    }

    public f m() {
        return this.f14325b;
    }

    public Map<String, Object> n() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("code", this.f14325b.f14328b);
        hashMap2.put("message", this.f14325b.f14329c);
        hashMap2.put("data", this.f14325b.f14330d);
        hashMap.put("error", hashMap2);
        return hashMap;
    }

    public Map<String, Object> o() {
        HashMap hashMap = new HashMap();
        hashMap.put("result", this.f14325b.f14327a);
        return hashMap;
    }

    public void p(MethodChannel.Result result) {
        a aVar = this.f14325b;
        result.error(aVar.f14328b, aVar.f14329c, aVar.f14330d);
    }

    public void q(List<Map<String, Object>> list) {
        if (!c()) {
            list.add(n());
        }
    }

    public void r(List<Map<String, Object>> list) {
        if (!c()) {
            list.add(o());
        }
    }
}
