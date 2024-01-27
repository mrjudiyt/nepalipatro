package k8;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;
import kotlin.jvm.internal.m;

/* compiled from: MethodCallHandler.kt */
public final class a implements MethodChannel.MethodCallHandler {

    /* renamed from: h  reason: collision with root package name */
    private final b f15466h;

    /* renamed from: i  reason: collision with root package name */
    private final dev.fluttercommunity.plus.share.a f15467i;

    public a(b bVar, dev.fluttercommunity.plus.share.a aVar) {
        m.f(bVar, "share");
        m.f(aVar, "manager");
        this.f15466h = bVar;
        this.f15467i = aVar;
    }

    private final void a(MethodCall methodCall) {
        if (!(methodCall.arguments instanceof Map)) {
            throw new IllegalArgumentException("Map arguments expected".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        if (r1.equals("share") != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        if (r1.equals("shareFilesWithResult") == false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
        if (r1.equals("shareWithResult") == false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        a(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (r2 == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        if (r12.f15467i.b(r14) != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        r1 = r12.f15466h;
        r3 = r13.argument(com.facebook.appevents.internal.ViewHierarchyConstants.TEXT_KEY);
        kotlin.jvm.internal.m.d(r3, "null cannot be cast to non-null type kotlin.String");
        r1.m((java.lang.String) r3, (java.lang.String) r13.argument("subject"), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        if (r2 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        if (r0 == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
        r14.success("dev.fluttercommunity.plus/share/unavailable");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        r14.success((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0089, code lost:
        if (r1.equals("shareFiles") == false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008c, code lost:
        a(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008f, code lost:
        if (r2 == false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0097, code lost:
        if (r12.f15467i.b(r14) != false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0099, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r1 = r12.f15466h;
        r3 = r13.argument("paths");
        kotlin.jvm.internal.m.c(r3);
        r1.n((java.util.List) r3, (java.util.List) r13.argument("mimeTypes"), (java.lang.String) r13.argument(com.facebook.appevents.internal.ViewHierarchyConstants.TEXT_KEY), (java.lang.String) r13.argument("subject"), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c3, code lost:
        if (r2 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c5, code lost:
        if (r0 == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c7, code lost:
        r14.success("dev.fluttercommunity.plus/share/unavailable");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cb, code lost:
        r14.success((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cf, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d0, code lost:
        r14.error("Share failed", r13.getMessage(), (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r13, io.flutter.plugin.common.MethodChannel.Result r14) {
        /*
            r12 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.m.f(r13, r0)
            java.lang.String r0 = "result"
            kotlin.jvm.internal.m.f(r14, r0)
            java.lang.String r0 = r13.method
            java.lang.String r1 = "call.method"
            kotlin.jvm.internal.m.e(r0, r1)
            java.lang.String r1 = "WithResult"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r0 = g9.p.l(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L_0x0023
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 22
            if (r1 < r3) goto L_0x0023
            r2 = 1
        L_0x0023:
            java.lang.String r1 = r13.method
            if (r1 == 0) goto L_0x00da
            int r3 = r1.hashCode()
            java.lang.String r11 = "dev.fluttercommunity.plus/share/unavailable"
            java.lang.String r5 = "subject"
            java.lang.String r6 = "text"
            switch(r3) {
                case -1811378728: goto L_0x0083;
                case -1594861118: goto L_0x0049;
                case -1212337029: goto L_0x003f;
                case 109400031: goto L_0x0036;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x00da
        L_0x0036:
            java.lang.String r3 = "share"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00da
            goto L_0x0053
        L_0x003f:
            java.lang.String r3 = "shareFilesWithResult"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x008c
            goto L_0x00da
        L_0x0049:
            java.lang.String r3 = "shareWithResult"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0053
            goto L_0x00da
        L_0x0053:
            r12.a(r13)
            if (r2 == 0) goto L_0x0061
            dev.fluttercommunity.plus.share.a r1 = r12.f15467i
            boolean r1 = r1.b(r14)
            if (r1 != 0) goto L_0x0061
            return
        L_0x0061:
            k8.b r1 = r12.f15466h
            java.lang.Object r3 = r13.argument(r6)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.m.d(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r13 = r13.argument(r5)
            java.lang.String r13 = (java.lang.String) r13
            r1.m(r3, r13, r2)
            if (r2 != 0) goto L_0x00dd
            if (r0 == 0) goto L_0x007f
            r14.success(r11)
            goto L_0x00dd
        L_0x007f:
            r14.success(r4)
            goto L_0x00dd
        L_0x0083:
            java.lang.String r3 = "shareFiles"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x008c
            goto L_0x00da
        L_0x008c:
            r12.a(r13)
            if (r2 == 0) goto L_0x009a
            dev.fluttercommunity.plus.share.a r1 = r12.f15467i
            boolean r1 = r1.b(r14)
            if (r1 != 0) goto L_0x009a
            return
        L_0x009a:
            k8.b r1 = r12.f15466h     // Catch:{ IOException -> 0x00cf }
            java.lang.String r3 = "paths"
            java.lang.Object r3 = r13.argument(r3)     // Catch:{ IOException -> 0x00cf }
            kotlin.jvm.internal.m.c(r3)     // Catch:{ IOException -> 0x00cf }
            java.util.List r3 = (java.util.List) r3     // Catch:{ IOException -> 0x00cf }
            java.lang.String r7 = "mimeTypes"
            java.lang.Object r7 = r13.argument(r7)     // Catch:{ IOException -> 0x00cf }
            java.util.List r7 = (java.util.List) r7     // Catch:{ IOException -> 0x00cf }
            java.lang.Object r6 = r13.argument(r6)     // Catch:{ IOException -> 0x00cf }
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x00cf }
            java.lang.Object r13 = r13.argument(r5)     // Catch:{ IOException -> 0x00cf }
            r9 = r13
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ IOException -> 0x00cf }
            r5 = r1
            r6 = r3
            r10 = r2
            r5.n(r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x00cf }
            if (r2 != 0) goto L_0x00dd
            if (r0 == 0) goto L_0x00cb
            r14.success(r11)     // Catch:{ IOException -> 0x00cf }
            goto L_0x00dd
        L_0x00cb:
            r14.success(r4)     // Catch:{ IOException -> 0x00cf }
            goto L_0x00dd
        L_0x00cf:
            r13 = move-exception
            java.lang.String r13 = r13.getMessage()
            java.lang.String r0 = "Share failed"
            r14.error(r0, r13, r4)
            goto L_0x00dd
        L_0x00da:
            r14.notImplemented()
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.a.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }
}
