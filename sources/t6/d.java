package t6;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import r6.b;
import r6.f;
import r6.s;
import r6.t;
import s6.e;
import y6.c;

/* compiled from: Excluder */
public final class d implements t, Cloneable {

    /* renamed from: n  reason: collision with root package name */
    public static final d f16508n = new d();

    /* renamed from: h  reason: collision with root package name */
    private double f16509h = -1.0d;

    /* renamed from: i  reason: collision with root package name */
    private int f16510i = 136;

    /* renamed from: j  reason: collision with root package name */
    private boolean f16511j = true;

    /* renamed from: k  reason: collision with root package name */
    private boolean f16512k;

    /* renamed from: l  reason: collision with root package name */
    private List<b> f16513l = Collections.emptyList();

    /* renamed from: m  reason: collision with root package name */
    private List<b> f16514m = Collections.emptyList();

    /* compiled from: Excluder */
    class a extends s<T> {

        /* renamed from: a  reason: collision with root package name */
        private s<T> f16515a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f16516b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f16517c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f16518d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ x6.a f16519e;

        a(boolean z10, boolean z11, f fVar, x6.a aVar) {
            this.f16516b = z10;
            this.f16517c = z11;
            this.f16518d = fVar;
            this.f16519e = aVar;
        }

        private s<T> e() {
            s<T> sVar = this.f16515a;
            if (sVar != null) {
                return sVar;
            }
            s<T> m10 = this.f16518d.m(d.this, this.f16519e);
            this.f16515a = m10;
            return m10;
        }

        public T b(y6.a aVar) {
            if (!this.f16516b) {
                return e().b(aVar);
            }
            aVar.T0();
            return null;
        }

        public void d(c cVar, T t10) {
            if (this.f16517c) {
                cVar.g0();
            } else {
                e().d(cVar, t10);
            }
        }
    }

    private boolean d(Class<?> cls) {
        if (this.f16509h != -1.0d && !n((s6.d) cls.getAnnotation(s6.d.class), (e) cls.getAnnotation(e.class))) {
            return true;
        }
        if ((this.f16511j || !i(cls)) && !g(cls)) {
            return false;
        }
        return true;
    }

    private boolean e(Class<?> cls, boolean z10) {
        for (b b10 : z10 ? this.f16513l : this.f16514m) {
            if (b10.b(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean g(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private boolean i(Class<?> cls) {
        return cls.isMemberClass() && !k(cls);
    }

    private boolean k(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean l(s6.d dVar) {
        return dVar == null || dVar.value() <= this.f16509h;
    }

    private boolean m(e eVar) {
        return eVar == null || eVar.value() > this.f16509h;
    }

    private boolean n(s6.d dVar, e eVar) {
        return l(dVar) && m(eVar);
    }

    public <T> s<T> a(f fVar, x6.a<T> aVar) {
        Class<? super T> c10 = aVar.c();
        boolean d10 = d(c10);
        boolean z10 = d10 || e(c10, true);
        boolean z11 = d10 || e(c10, false);
        if (z10 || z11) {
            return new a(z11, z10, fVar, aVar);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean c(Class<?> cls, boolean z10) {
        return d(cls) || e(cls, z10);
    }

    public boolean f(Field field, boolean z10) {
        s6.a aVar;
        if ((this.f16510i & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f16509h != -1.0d && !n((s6.d) field.getAnnotation(s6.d.class), (e) field.getAnnotation(e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f16512k && ((aVar = (s6.a) field.getAnnotation(s6.a.class)) == null || (!z10 ? !aVar.deserialize() : !aVar.serialize()))) {
            return true;
        }
        if ((!this.f16511j && i(field.getType())) || g(field.getType())) {
            return true;
        }
        List<b> list = z10 ? this.f16513l : this.f16514m;
        if (list.isEmpty()) {
            return false;
        }
        r6.c cVar = new r6.c(field);
        for (b a10 : list) {
            if (a10.a(cVar)) {
                return true;
            }
        }
        return false;
    }
}
