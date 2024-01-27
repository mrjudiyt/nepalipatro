package androidx.datastore.preferences.protobuf;

/* compiled from: ExtensionSchemas */
final class r {

    /* renamed from: a  reason: collision with root package name */
    private static final p<?> f2921a = new q();

    /* renamed from: b  reason: collision with root package name */
    private static final p<?> f2922b = c();

    static p<?> a() {
        p<?> pVar = f2922b;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static p<?> b() {
        return f2921a;
    }

    private static p<?> c() {
        try {
            return (p) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
