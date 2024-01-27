package androidx.datastore.preferences.protobuf;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* compiled from: WireFormat */
public final class q1 {

    /* renamed from: a  reason: collision with root package name */
    static final int f2887a = c(1, 3);

    /* renamed from: b  reason: collision with root package name */
    static final int f2888b = c(1, 4);

    /* renamed from: c  reason: collision with root package name */
    static final int f2889c = c(2, 0);

    /* renamed from: d  reason: collision with root package name */
    static final int f2890d = c(3, 2);

    /* compiled from: WireFormat */
    public enum b {
        DOUBLE(c.DOUBLE, 1),
        FLOAT(c.FLOAT, 5),
        INT64(r5, 0),
        UINT64(r5, 0),
        INT32(r11, 0),
        FIXED64(r5, 1),
        FIXED32(r11, 5),
        BOOL(c.BOOLEAN, 0),
        STRING(c.STRING, 2) {
        },
        GROUP(r13, 3) {
        },
        MESSAGE(r13, 2) {
        },
        BYTES(c.BYTE_STRING, 2) {
        },
        UINT32(r11, 0),
        ENUM(c.ENUM, 0),
        SFIXED32(r11, 5),
        SFIXED64(r5, 1),
        SINT32(r11, 0),
        SINT64(r5, 0);
        

        /* renamed from: h  reason: collision with root package name */
        private final c f2908h;

        /* renamed from: i  reason: collision with root package name */
        private final int f2909i;

        public c a() {
            return this.f2908h;
        }

        public int d() {
            return this.f2909i;
        }

        private b(c cVar, int i10) {
            this.f2908h = cVar;
            this.f2909i = i10;
        }
    }

    /* compiled from: WireFormat */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(h.f2754i),
        ENUM((String) null),
        MESSAGE((String) null);
        

        /* renamed from: h  reason: collision with root package name */
        private final Object f2920h;

        private c(Object obj) {
            this.f2920h = obj;
        }
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    public static int b(int i10) {
        return i10 & 7;
    }

    static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }
}
