package androidx.datastore.preferences.protobuf;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* compiled from: JavaType */
public enum a0 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(h.class, h.class, h.f2754i),
    ENUM(r1, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: h  reason: collision with root package name */
    private final Class<?> f2705h;

    /* renamed from: i  reason: collision with root package name */
    private final Class<?> f2706i;

    /* renamed from: j  reason: collision with root package name */
    private final Object f2707j;

    private a0(Class<?> cls, Class<?> cls2, Object obj) {
        this.f2705h = cls;
        this.f2706i = cls2;
        this.f2707j = obj;
    }

    public Class<?> a() {
        return this.f2706i;
    }
}
