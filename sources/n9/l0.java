package n9;

/* compiled from: SystemProps.kt */
final /* synthetic */ class l0 {

    /* renamed from: a  reason: collision with root package name */
    private static final int f15816a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f15816a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
