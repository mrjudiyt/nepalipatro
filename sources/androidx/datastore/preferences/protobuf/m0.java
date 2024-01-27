package androidx.datastore.preferences.protobuf;

/* compiled from: MapFieldSchemas */
final class m0 {

    /* renamed from: a  reason: collision with root package name */
    private static final k0 f2844a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final k0 f2845b = new l0();

    static k0 a() {
        return f2844a;
    }

    static k0 b() {
        return f2845b;
    }

    private static k0 c() {
        try {
            return (k0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
