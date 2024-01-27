package y7;

import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import v7.b;
import v7.p;
import v7.v;
import v7.x;
import w7.f;

/* compiled from: OkHeaders */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator<String> f17420a = new a();

    /* renamed from: b  reason: collision with root package name */
    static final String f17421b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f17422c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f17423d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f17424e;

    /* renamed from: f  reason: collision with root package name */
    public static final String f17425f;

    /* compiled from: OkHeaders */
    static class a implements Comparator<String> {
        a() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return String.CASE_INSENSITIVE_ORDER.compare(str, str2);
        }
    }

    static {
        String g10 = f.f().g();
        f17421b = g10;
        f17422c = g10 + "-Sent-Millis";
        f17423d = g10 + "-Received-Millis";
        f17424e = g10 + "-Selected-Protocol";
        f17425f = g10 + "-Response-Source";
    }

    public static void a(v.b bVar, Map<String, List<String>> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            if (("Cookie".equalsIgnoreCase(str) || "Cookie2".equalsIgnoreCase(str)) && !((List) next.getValue()).isEmpty()) {
                bVar.f(str, b((List) next.getValue()));
            }
        }
    }

    private static String b(List<String> list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                sb.append("; ");
            }
            sb.append(list.get(i10));
        }
        return sb.toString();
    }

    public static long c(p pVar) {
        return i(pVar.a("Content-Length"));
    }

    public static long d(v vVar) {
        return c(vVar.i());
    }

    public static long e(x xVar) {
        return c(xVar.r());
    }

    static boolean f(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    public static List<v7.f> g(p pVar, String str) {
        ArrayList arrayList = new ArrayList();
        int f10 = pVar.f();
        for (int i10 = 0; i10 < f10; i10++) {
            if (str.equalsIgnoreCase(pVar.d(i10))) {
                String g10 = pVar.g(i10);
                int i11 = 0;
                while (i11 < g10.length()) {
                    int b10 = d.b(g10, i11, " ");
                    String trim = g10.substring(i11, b10).trim();
                    int c10 = d.c(g10, b10);
                    if (!g10.regionMatches(true, c10, "realm=\"", 0, 7)) {
                        break;
                    }
                    int i12 = c10 + 7;
                    int b11 = d.b(g10, i12, "\"");
                    String substring = g10.substring(i12, b11);
                    i11 = d.c(g10, d.b(g10, b11 + 1, ",") + 1);
                    arrayList.add(new v7.f(trim, substring));
                }
            }
        }
        return arrayList;
    }

    public static v h(b bVar, x xVar, Proxy proxy) {
        if (xVar.n() == 407) {
            return bVar.b(proxy, xVar);
        }
        return bVar.a(proxy, xVar);
    }

    private static long i(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static Map<String, List<String>> j(p pVar, String str) {
        TreeMap treeMap = new TreeMap(f17420a);
        int f10 = pVar.f();
        for (int i10 = 0; i10 < f10; i10++) {
            String d10 = pVar.d(i10);
            String g10 = pVar.g(i10);
            ArrayList arrayList = new ArrayList();
            List list = (List) treeMap.get(d10);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(g10);
            treeMap.put(d10, Collections.unmodifiableList(arrayList));
        }
        if (str != null) {
            treeMap.put((Object) null, Collections.unmodifiableList(Collections.singletonList(str)));
        }
        return Collections.unmodifiableMap(treeMap);
    }
}
