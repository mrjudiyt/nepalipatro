package i0;

import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.x0;
import androidx.datastore.preferences.protobuf.z;
import java.util.List;

/* compiled from: PreferencesProto */
public final class g extends x<g, a> implements q0 {
    /* access modifiers changed from: private */
    public static final g DEFAULT_INSTANCE;
    private static volatile x0<g> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private z.i<String> strings_ = x.w();

    /* compiled from: PreferencesProto */
    public static final class a extends x.a<g, a> implements q0 {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a w(Iterable<String> iterable) {
            r();
            ((g) this.f3003i).L(iterable);
            return this;
        }

        private a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        x.H(g.class, gVar);
    }

    private g() {
    }

    /* access modifiers changed from: private */
    public void L(Iterable<String> iterable) {
        M();
        androidx.datastore.preferences.protobuf.a.i(iterable, this.strings_);
    }

    private void M() {
        if (!this.strings_.Y()) {
            this.strings_ = x.C(this.strings_);
        }
    }

    public static g N() {
        return DEFAULT_INSTANCE;
    }

    public static a P() {
        return (a) DEFAULT_INSTANCE.s();
    }

    public List<String> O() {
        return this.strings_;
    }

    /* access modifiers changed from: protected */
    public final Object v(x.f fVar, Object obj, Object obj2) {
        switch (e.f9068a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a((e) null);
            case 3:
                return x.E(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                x0<g> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (g.class) {
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
