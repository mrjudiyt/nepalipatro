package kotlin.jvm.internal;

import e9.c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import y8.b;
import y8.d;
import y8.f;
import y8.g;
import y8.h;
import y8.i;
import y8.j;
import y8.k;
import y8.l;
import y8.m;
import y8.n;
import y8.o;
import y8.p;
import y8.q;
import y8.r;
import y8.s;
import y8.t;
import y8.u;
import y8.v;
import y8.w;

/* compiled from: ClassReference.kt */
public final class e implements c<Object>, d {

    /* renamed from: i  reason: collision with root package name */
    public static final a f15561i = new a((g) null);

    /* renamed from: j  reason: collision with root package name */
    private static final Map<Class<? extends o8.c<?>>, Integer> f15562j;

    /* renamed from: k  reason: collision with root package name */
    private static final HashMap<String, String> f15563k;

    /* renamed from: l  reason: collision with root package name */
    private static final HashMap<String, String> f15564l;

    /* renamed from: m  reason: collision with root package name */
    private static final HashMap<String, String> f15565m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final Map<String, String> f15566n;

    /* renamed from: h  reason: collision with root package name */
    private final Class<?> f15567h;

    /* compiled from: ClassReference.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final String a(Class<?> cls) {
            String str;
            m.f(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        m.e(simpleName, "name");
                        String j02 = q.j0(simpleName, enclosingMethod.getName() + '$', (String) null, 2, (Object) null);
                        if (j02 != null) {
                            return j02;
                        }
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    if (enclosingConstructor != null) {
                        m.e(simpleName, "name");
                        return q.j0(simpleName, enclosingConstructor.getName() + '$', (String) null, 2, (Object) null);
                    }
                    m.e(simpleName, "name");
                    return q.i0(simpleName, '$', (String) null, 2, (Object) null);
                } else if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) e.f15566n.get(componentType.getName())) != null) {
                        str2 = str + "Array";
                    }
                    if (str2 == null) {
                        return "Array";
                    }
                } else {
                    String str3 = (String) e.f15566n.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
            }
            return str2;
        }
    }

    static {
        int i10 = 0;
        List g10 = p.g(y8.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, b.class, y8.c.class, d.class, y8.e.class, f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(q.l(g10, 10));
        for (Object next : g10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                p.k();
            }
            arrayList.add(o8.o.a((Class) next, Integer.valueOf(i10)));
            i10 = i11;
        }
        f15562j = h0.j(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f15563k = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f15564l = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        m.e(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            m.e(str, "kotlinName");
            sb.append(q.l0(str, '.', (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            o8.k a10 = o8.o.a(sb2, str + ".Companion");
            hashMap3.put(a10.c(), a10.d());
        }
        for (Map.Entry next2 : f15562j.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f15565m = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(g0.a(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), q.l0((String) entry.getValue(), '.', (String) null, 2, (Object) null));
        }
        f15566n = linkedHashMap;
    }

    public e(Class<?> cls) {
        m.f(cls, "jClass");
        this.f15567h = cls;
    }

    public String a() {
        return f15561i.a(c());
    }

    public Class<?> c() {
        return this.f15567h;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && m.a(x8.a.b(this), x8.a.b((c) obj));
    }

    public int hashCode() {
        return x8.a.b(this).hashCode();
    }

    public String toString() {
        return c().toString() + " (Kotlin reflection is not available)";
    }
}
