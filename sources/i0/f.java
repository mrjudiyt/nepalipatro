package i0;

import androidx.datastore.preferences.protobuf.i0;
import androidx.datastore.preferences.protobuf.j0;
import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.q1;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.x0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: PreferencesProto */
public final class f extends x<f, a> implements q0 {
    /* access modifiers changed from: private */
    public static final f DEFAULT_INSTANCE;
    private static volatile x0<f> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private j0<String, h> preferences_ = j0.d();

    /* compiled from: PreferencesProto */
    public static final class a extends x.a<f, a> implements q0 {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a w(String str, h hVar) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(hVar);
            r();
            ((f) this.f3003i).L().put(str, hVar);
            return this;
        }

        private a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: PreferencesProto */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final i0<String, h> f9069a = i0.d(q1.b.STRING, "", q1.b.MESSAGE, h.S());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        x.H(f.class, fVar);
    }

    private f() {
    }

    /* access modifiers changed from: private */
    public Map<String, h> L() {
        return N();
    }

    private j0<String, h> N() {
        if (!this.preferences_.i()) {
            this.preferences_ = this.preferences_.m();
        }
        return this.preferences_;
    }

    private j0<String, h> O() {
        return this.preferences_;
    }

    public static a P() {
        return (a) DEFAULT_INSTANCE.s();
    }

    public static f Q(InputStream inputStream) {
        return (f) x.F(DEFAULT_INSTANCE, inputStream);
    }

    public Map<String, h> M() {
        return Collections.unmodifiableMap(O());
    }

    /* access modifiers changed from: protected */
    public final Object v(x.f fVar, Object obj, Object obj2) {
        switch (e.f9068a[fVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a((e) null);
            case 3:
                return x.E(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f9069a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                x0<f> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (f.class) {
                        x0Var = PARSER;
                        if (x0Var == null) {
                            x0Var = new x.b<>(DEFAULT_INSTANCE);
                            PARSER = x0Var;
                        }
                    }
                }
                return x0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
