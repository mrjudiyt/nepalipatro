package u6;

import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import r6.e;
import r6.f;
import r6.s;
import r6.t;
import t6.d;
import t6.k;

/* compiled from: ReflectiveTypeAdapterFactory */
public final class i implements t {

    /* renamed from: h  reason: collision with root package name */
    private final t6.c f16635h;

    /* renamed from: i  reason: collision with root package name */
    private final e f16636i;

    /* renamed from: j  reason: collision with root package name */
    private final d f16637j;

    /* renamed from: k  reason: collision with root package name */
    private final d f16638k;

    /* renamed from: l  reason: collision with root package name */
    private final w6.b f16639l = w6.b.a();

    /* compiled from: ReflectiveTypeAdapterFactory */
    class a extends c {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Field f16640d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f16641e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ s f16642f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f16643g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ x6.a f16644h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f16645i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, boolean z10, boolean z11, Field field, boolean z12, s sVar, f fVar, x6.a aVar, boolean z13) {
            super(str, z10, z11);
            this.f16640d = field;
            this.f16641e = z12;
            this.f16642f = sVar;
            this.f16643g = fVar;
            this.f16644h = aVar;
            this.f16645i = z13;
        }

        /* access modifiers changed from: package-private */
        public void a(y6.a aVar, Object obj) {
            Object b10 = this.f16642f.b(aVar);
            if (b10 != null || !this.f16645i) {
                this.f16640d.set(obj, b10);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(y6.c cVar, Object obj) {
            s sVar;
            Object obj2 = this.f16640d.get(obj);
            if (this.f16641e) {
                sVar = this.f16642f;
            } else {
                sVar = new m(this.f16643g, this.f16642f, this.f16644h.e());
            }
            sVar.d(cVar, obj2);
        }

        public boolean c(Object obj) {
            if (this.f16650b && this.f16640d.get(obj) != obj) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: ReflectiveTypeAdapterFactory */
    public static final class b<T> extends s<T> {

        /* renamed from: a  reason: collision with root package name */
        private final t6.i<T> f16647a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, c> f16648b;

        b(t6.i<T> iVar, Map<String, c> map) {
            this.f16647a = iVar;
            this.f16648b = map;
        }

        public T b(y6.a aVar) {
            if (aVar.I0() == y6.b.NULL) {
                aVar.s0();
                return null;
            }
            T a10 = this.f16647a.a();
            try {
                aVar.h();
                while (aVar.L()) {
                    c cVar = this.f16648b.get(aVar.o0());
                    if (cVar != null) {
                        if (cVar.f16651c) {
                            cVar.a(aVar, a10);
                        }
                    }
                    aVar.T0();
                }
                aVar.E();
                return a10;
            } catch (IllegalStateException e10) {
                throw new JsonSyntaxException((Throwable) e10);
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            }
        }

        public void d(y6.c cVar, T t10) {
            if (t10 == null) {
                cVar.g0();
                return;
            }
            cVar.q();
            try {
                for (c next : this.f16648b.values()) {
                    if (next.c(t10)) {
                        cVar.Y(next.f16649a);
                        next.b(cVar, t10);
                    }
                }
                cVar.E();
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* compiled from: ReflectiveTypeAdapterFactory */
    static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final String f16649a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f16650b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f16651c;

        protected c(String str, boolean z10, boolean z11) {
            this.f16649a = str;
            this.f16650b = z10;
            this.f16651c = z11;
        }

        /* access modifiers changed from: package-private */
        public abstract void a(y6.a aVar, Object obj);

        /* access modifiers changed from: package-private */
        public abstract void b(y6.c cVar, Object obj);

        /* access modifiers changed from: package-private */
        public abstract boolean c(Object obj);
    }

    public i(t6.c cVar, e eVar, d dVar, d dVar2) {
        this.f16635h = cVar;
        this.f16636i = eVar;
        this.f16637j = dVar;
        this.f16638k = dVar2;
    }

    private c b(f fVar, Field field, String str, x6.a<?> aVar, boolean z10, boolean z11) {
        f fVar2 = fVar;
        x6.a<?> aVar2 = aVar;
        boolean b10 = k.b(aVar.c());
        Field field2 = field;
        s6.b bVar = (s6.b) field.getAnnotation(s6.b.class);
        s<?> b11 = bVar != null ? this.f16638k.b(this.f16635h, fVar, aVar2, bVar) : null;
        boolean z12 = b11 != null;
        if (b11 == null) {
            b11 = fVar.l(aVar2);
        }
        return new a(str, z10, z11, field, z12, b11, fVar, aVar, b10);
    }

    static boolean d(Field field, boolean z10, d dVar) {
        return !dVar.c(field.getType(), z10) && !dVar.f(field, z10);
    }

    private Map<String, c> e(f fVar, x6.a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type e10 = aVar.e();
        x6.a<?> aVar2 = aVar;
        Class<? super Object> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z10 = false;
            int i10 = 0;
            while (i10 < length) {
                Field field = declaredFields[i10];
                boolean c10 = c(field, true);
                boolean c11 = c(field, z10);
                if (c10 || c11) {
                    this.f16639l.b(field);
                    Type p10 = t6.b.p(aVar2.e(), cls2, field.getGenericType());
                    List<String> f10 = f(field);
                    int size = f10.size();
                    c cVar = null;
                    int i11 = 0;
                    while (i11 < size) {
                        String str = f10.get(i11);
                        boolean z11 = i11 != 0 ? false : c10;
                        String str2 = str;
                        int i12 = i11;
                        c cVar2 = cVar;
                        int i13 = size;
                        List<String> list = f10;
                        Field field2 = field;
                        cVar = cVar2 == null ? (c) linkedHashMap.put(str2, b(fVar, field, str2, x6.a.b(p10), z11, c11)) : cVar2;
                        i11 = i12 + 1;
                        c10 = z11;
                        f10 = list;
                        size = i13;
                        field = field2;
                    }
                    c cVar3 = cVar;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException(e10 + " declares multiple JSON fields named " + cVar3.f16649a);
                    }
                }
                i10++;
                z10 = false;
            }
            aVar2 = x6.a.b(t6.b.p(aVar2.e(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.c();
        }
        return linkedHashMap;
    }

    private List<String> f(Field field) {
        s6.c cVar = (s6.c) field.getAnnotation(s6.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f16636i.a(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String add : alternate) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public <T> s<T> a(f fVar, x6.a<T> aVar) {
        Class<? super T> c10 = aVar.c();
        if (!Object.class.isAssignableFrom(c10)) {
            return null;
        }
        return new b(this.f16635h.a(aVar), e(fVar, aVar, c10));
    }

    public boolean c(Field field, boolean z10) {
        return d(field, z10, this.f16637j);
    }
}
