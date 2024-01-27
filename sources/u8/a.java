package u8;

import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.m;

/* compiled from: JDK7PlatformImplementations.kt */
public class a extends t8.a {

    /* renamed from: u8.a$a  reason: collision with other inner class name */
    /* compiled from: JDK7PlatformImplementations.kt */
    private static final class C0288a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0288a f16714a = new C0288a();

        /* renamed from: b  reason: collision with root package name */
        public static final Integer f16715b;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        static {
            /*
                u8.a$a r0 = new u8.a$a
                r0.<init>()
                f16714a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x001f }
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ all -> 0x001f }
                java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x001f }
                boolean r2 = r1 instanceof java.lang.Integer     // Catch:{ all -> 0x001f }
                if (r2 == 0) goto L_0x001f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x001f }
                goto L_0x0020
            L_0x001f:
                r1 = r0
            L_0x0020:
                if (r1 == 0) goto L_0x002e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L_0x002a
                r2 = 1
                goto L_0x002b
            L_0x002a:
                r2 = 0
            L_0x002b:
                if (r2 == 0) goto L_0x002e
                r0 = r1
            L_0x002e:
                f16715b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u8.a.C0288a.<clinit>():void");
        }

        private C0288a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C0288a.f16715b;
        return num == null || num.intValue() >= i10;
    }

    public void a(Throwable th, Throwable th2) {
        m.f(th, "cause");
        m.f(th2, Constants.EXCEPTION);
        if (c(19)) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
