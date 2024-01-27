package i0;

import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.x0;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import i0.g;
import java.util.Objects;

/* compiled from: PreferencesProto */
public final class h extends x<h, a> implements q0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile x0<h> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    /* compiled from: PreferencesProto */
    public static final class a extends x.a<h, a> implements q0 {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a A(long j10) {
            r();
            ((h) this.f3003i).f0(j10);
            return this;
        }

        public a B(String str) {
            r();
            ((h) this.f3003i).g0(str);
            return this;
        }

        public a C(g.a aVar) {
            r();
            ((h) this.f3003i).h0(aVar);
            return this;
        }

        public a w(boolean z10) {
            r();
            ((h) this.f3003i).b0(z10);
            return this;
        }

        public a x(double d10) {
            r();
            ((h) this.f3003i).c0(d10);
            return this;
        }

        public a y(float f10) {
            r();
            ((h) this.f3003i).d0(f10);
            return this;
        }

        public a z(int i10) {
            r();
            ((h) this.f3003i).e0(i10);
            return this;
        }

        private a() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: PreferencesProto */
    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);
        

        /* renamed from: h  reason: collision with root package name */
        private final int f9079h;

        private b(int i10) {
            this.f9079h = i10;
        }

        public static b a(int i10) {
            switch (i10) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                default:
                    return null;
            }
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        x.H(h.class, hVar);
    }

    private h() {
    }

    public static h S() {
        return DEFAULT_INSTANCE;
    }

    public static a a0() {
        return (a) DEFAULT_INSTANCE.s();
    }

    /* access modifiers changed from: private */
    public void b0(boolean z10) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z10);
    }

    /* access modifiers changed from: private */
    public void c0(double d10) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d10);
    }

    /* access modifiers changed from: private */
    public void d0(float f10) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f10);
    }

    /* access modifiers changed from: private */
    public void e0(int i10) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i10);
    }

    /* access modifiers changed from: private */
    public void f0(long j10) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j10);
    }

    /* access modifiers changed from: private */
    public void g0(String str) {
        Objects.requireNonNull(str);
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* access modifiers changed from: private */
    public void h0(g.a aVar) {
        this.value_ = aVar.build();
        this.valueCase_ = 6;
    }

    public boolean R() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public double T() {
        return this.valueCase_ == 7 ? ((Double) this.value_).doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public float U() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int V() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long W() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0;
    }

    public String X() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public g Y() {
        if (this.valueCase_ == 6) {
            return (g) this.value_;
        }
        return g.N();
    }

    public b Z() {
        return b.a(this.valueCase_);
    }

    /* access modifiers changed from: protected */
    public final Object v(x.f fVar, Object obj, Object obj2) {
        switch (e.f9068a[fVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a((e) null);
            case 3:
                return x.E(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                x0<h> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (h.class) {
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
