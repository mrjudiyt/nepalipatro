package androidx.datastore.preferences.protobuf;

/* compiled from: NewInstanceSchemas */
final class w0 {

    /* renamed from: a  reason: collision with root package name */
    private static final u0 f3000a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final u0 f3001b = new v0();

    static u0 a() {
        return f3000a;
    }

    static u0 b() {
        return f3001b;
    }

    private static u0 c() {
        try {
            return (u0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
