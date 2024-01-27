package a;

/* compiled from: CoroutineDebugging.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f2a = "_COROUTINE";

    /* access modifiers changed from: private */
    public static final StackTraceElement b(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(f2a + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static final String c() {
        return f2a;
    }
}
