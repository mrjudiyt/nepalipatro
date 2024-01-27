package l2;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LazyHeaders */
public final class j implements h {

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, List<i>> f9899c;

    /* renamed from: d  reason: collision with root package name */
    private volatile Map<String, String> f9900d;

    /* compiled from: LazyHeaders */
    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        private static final String f9901d;

        /* renamed from: e  reason: collision with root package name */
        private static final Map<String, List<i>> f9902e;

        /* renamed from: a  reason: collision with root package name */
        private boolean f9903a = true;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, List<i>> f9904b = f9902e;

        /* renamed from: c  reason: collision with root package name */
        private boolean f9905c = true;

        static {
            String b10 = b();
            f9901d = b10;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(b10)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(b10)));
            }
            f9902e = Collections.unmodifiableMap(hashMap);
        }

        static String b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = property.charAt(i10);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        public j a() {
            this.f9903a = true;
            return new j(this.f9904b);
        }
    }

    /* compiled from: LazyHeaders */
    static final class b implements i {

        /* renamed from: a  reason: collision with root package name */
        private final String f9906a;

        b(String str) {
            this.f9906a = str;
        }

        public String a() {
            return this.f9906a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f9906a.equals(((b) obj).f9906a);
            }
            return false;
        }

        public int hashCode() {
            return this.f9906a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f9906a + '\'' + '}';
        }
    }

    j(Map<String, List<i>> map) {
        this.f9899c = Collections.unmodifiableMap(map);
    }

    private String b(List<i> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String a10 = list.get(i10).a();
            if (!TextUtils.isEmpty(a10)) {
                sb.append(a10);
                if (i10 != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    private Map<String, String> c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f9899c.entrySet()) {
            String b10 = b((List) next.getValue());
            if (!TextUtils.isEmpty(b10)) {
                hashMap.put(next.getKey(), b10);
            }
        }
        return hashMap;
    }

    public Map<String, String> a() {
        if (this.f9900d == null) {
            synchronized (this) {
                if (this.f9900d == null) {
                    this.f9900d = Collections.unmodifiableMap(c());
                }
            }
        }
        return this.f9900d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f9899c.equals(((j) obj).f9899c);
        }
        return false;
    }

    public int hashCode() {
        return this.f9899c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f9899c + '}';
    }
}
