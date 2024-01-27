package androidx.datastore.preferences.protobuf;

/* compiled from: ManifestSchemaFactory */
final class h0 implements f1 {

    /* renamed from: b  reason: collision with root package name */
    private static final o0 f2766b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final o0 f2767a;

    /* compiled from: ManifestSchemaFactory */
    static class a implements o0 {
        a() {
        }

        public n0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        public boolean b(Class<?> cls) {
            return false;
        }
    }

    /* compiled from: ManifestSchemaFactory */
    private static class b implements o0 {

        /* renamed from: a  reason: collision with root package name */
        private o0[] f2768a;

        b(o0... o0VarArr) {
            this.f2768a = o0VarArr;
        }

        public n0 a(Class<?> cls) {
            for (o0 o0Var : this.f2768a) {
                if (o0Var.b(cls)) {
                    return o0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        public boolean b(Class<?> cls) {
            for (o0 b10 : this.f2768a) {
                if (b10.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public h0() {
        this(b());
    }

    private static o0 b() {
        return new b(w.c(), c());
    }

    private static o0 c() {
        try {
            return (o0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f2766b;
        }
    }

    private static boolean d(n0 n0Var) {
        return n0Var.c() == z0.PROTO2;
    }

    private static <T> e1<T> e(Class<T> cls, n0 n0Var) {
        if (x.class.isAssignableFrom(cls)) {
            if (d(n0Var)) {
                return s0.N(cls, n0Var, w0.b(), f0.b(), g1.M(), r.b(), m0.b());
            }
            return s0.N(cls, n0Var, w0.b(), f0.b(), g1.M(), (p<?>) null, m0.b());
        } else if (d(n0Var)) {
            return s0.N(cls, n0Var, w0.a(), f0.a(), g1.H(), r.a(), m0.a());
        } else {
            return s0.N(cls, n0Var, w0.a(), f0.a(), g1.I(), (p<?>) null, m0.a());
        }
    }

    public <T> e1<T> a(Class<T> cls) {
        g1.J(cls);
        n0 a10 = this.f2767a.a(cls);
        if (!a10.a()) {
            return e(cls, a10);
        }
        if (x.class.isAssignableFrom(cls)) {
            return t0.l(g1.M(), r.b(), a10.b());
        }
        return t0.l(g1.H(), r.a(), a10.b());
    }

    private h0(o0 o0Var) {
        this.f2767a = (o0) z.b(o0Var, "messageInfoFactory");
    }
}
