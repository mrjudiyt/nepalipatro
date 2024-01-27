package l6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/* compiled from: MoreObjects */
public final class j {

    /* compiled from: MoreObjects */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f15611a;

        /* renamed from: b  reason: collision with root package name */
        private final C0262b f15612b;

        /* renamed from: c  reason: collision with root package name */
        private C0262b f15613c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f15614d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f15615e;

        /* compiled from: MoreObjects */
        private static final class a extends C0262b {
            private a() {
                super();
            }
        }

        /* renamed from: l6.j$b$b  reason: collision with other inner class name */
        /* compiled from: MoreObjects */
        private static class C0262b {

            /* renamed from: a  reason: collision with root package name */
            String f15616a;

            /* renamed from: b  reason: collision with root package name */
            Object f15617b;

            /* renamed from: c  reason: collision with root package name */
            C0262b f15618c;

            private C0262b() {
            }
        }

        private C0262b c() {
            C0262b bVar = new C0262b();
            this.f15613c.f15618c = bVar;
            this.f15613c = bVar;
            return bVar;
        }

        private b d(Object obj) {
            c().f15617b = obj;
            return this;
        }

        private b e(String str, Object obj) {
            C0262b c10 = c();
            c10.f15617b = obj;
            c10.f15616a = (String) p.j(str);
            return this;
        }

        private a f() {
            a aVar = new a();
            this.f15613c.f15618c = aVar;
            this.f15613c = aVar;
            return aVar;
        }

        private b g(String str, Object obj) {
            a f10 = f();
            f10.f15617b = obj;
            f10.f15616a = (String) p.j(str);
            return this;
        }

        private static boolean i(Object obj) {
            if (obj instanceof CharSequence) {
                if (((CharSequence) obj).length() == 0) {
                    return true;
                }
                return false;
            } else if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            } else {
                if (obj instanceof Map) {
                    return ((Map) obj).isEmpty();
                }
                if (obj instanceof m) {
                    return !((m) obj).c();
                }
                if (!obj.getClass().isArray() || Array.getLength(obj) != 0) {
                    return false;
                }
                return true;
            }
        }

        public b a(String str, int i10) {
            return g(str, String.valueOf(i10));
        }

        public b b(String str, Object obj) {
            return e(str, obj);
        }

        public b h(Object obj) {
            return d(obj);
        }

        public String toString() {
            boolean z10 = this.f15614d;
            boolean z11 = this.f15615e;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f15611a);
            sb.append('{');
            String str = "";
            for (C0262b bVar = this.f15612b.f15618c; bVar != null; bVar = bVar.f15618c) {
                Object obj = bVar.f15617b;
                if (!(bVar instanceof a)) {
                    if (obj == null) {
                        if (z10) {
                        }
                    } else if (z11 && i(obj)) {
                    }
                }
                sb.append(str);
                String str2 = bVar.f15616a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append(deepToString, 1, deepToString.length() - 1);
                }
                str = ", ";
            }
            sb.append('}');
            return sb.toString();
        }

        private b(String str) {
            C0262b bVar = new C0262b();
            this.f15612b = bVar;
            this.f15613c = bVar;
            this.f15614d = false;
            this.f15615e = false;
            this.f15611a = (String) p.j(str);
        }
    }

    public static <T> T a(T t10, T t11) {
        if (t10 != null) {
            return t10;
        }
        Objects.requireNonNull(t11, "Both parameters are null");
        return t11;
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
