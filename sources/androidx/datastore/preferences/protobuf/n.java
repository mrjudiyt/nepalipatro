package androidx.datastore.preferences.protobuf;

/* compiled from: ExtensionRegistryFactory */
final class n {

    /* renamed from: a  reason: collision with root package name */
    static final Class<?> f2846a = c();

    public static o a() {
        if (f2846a != null) {
            try {
                return b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return o.f2856e;
    }

    private static final o b(String str) {
        return (o) f2846a.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
    }

    static Class<?> c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
