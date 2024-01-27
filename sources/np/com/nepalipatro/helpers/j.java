package np.com.nepalipatro.helpers;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.m;

/* compiled from: LinkActions.kt */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f16076a = new j();

    private j() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0098 A[Catch:{ Exception -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009a A[Catch:{ Exception -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a8 A[Catch:{ Exception -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d1 A[Catch:{ Exception -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e2 A[Catch:{ Exception -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ef A[Catch:{ Exception -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00fc A[Catch:{ Exception -> 0x010a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r8 = this;
            java.lang.String r0 = "message_en"
            java.lang.String r1 = "message_np"
            java.lang.String r2 = "link"
            java.lang.String r3 = "linktype"
            java.lang.String r4 = "mActivity"
            kotlin.jvm.internal.m.f(r9, r4)
            java.lang.String r4 = "type"
            kotlin.jvm.internal.m.f(r10, r4)
            java.lang.String r4 = "args"
            kotlin.jvm.internal.m.f(r11, r4)
            java.lang.String r4 = r10.toString()     // Catch:{ Exception -> 0x010a }
            java.lang.String r5 = "amessage"
            r6 = 1
            boolean r4 = g9.p.m(r4, r5, r6)     // Catch:{ Exception -> 0x010a }
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x0085
            java.util.HashMap r11 = (java.util.HashMap) r11     // Catch:{ Exception -> 0x010a }
            boolean r10 = r11.containsKey(r3)     // Catch:{ Exception -> 0x007a }
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.String"
            if (r10 == 0) goto L_0x003a
            java.lang.Object r10 = r11.get(r3)     // Catch:{ Exception -> 0x007a }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x007a }
            kotlin.jvm.internal.m.d(r10, r4)     // Catch:{ Exception -> 0x007a }
            goto L_0x003b
        L_0x003a:
            r10 = r5
        L_0x003b:
            boolean r3 = r11.containsKey(r2)     // Catch:{ Exception -> 0x0073 }
            if (r3 == 0) goto L_0x004b
            java.lang.Object r2 = r11.get(r2)     // Catch:{ Exception -> 0x0073 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0073 }
            kotlin.jvm.internal.m.d(r2, r4)     // Catch:{ Exception -> 0x0073 }
            goto L_0x004c
        L_0x004b:
            r2 = r5
        L_0x004c:
            boolean r3 = r11.containsKey(r1)     // Catch:{ Exception -> 0x0070 }
            if (r3 == 0) goto L_0x005c
            java.lang.Object r1 = r11.get(r1)     // Catch:{ Exception -> 0x0070 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0070 }
            kotlin.jvm.internal.m.d(r1, r4)     // Catch:{ Exception -> 0x0070 }
            goto L_0x005d
        L_0x005c:
            r1 = r5
        L_0x005d:
            boolean r3 = r11.containsKey(r0)     // Catch:{ Exception -> 0x006e }
            if (r3 == 0) goto L_0x0082
            java.lang.Object r11 = r11.get(r0)     // Catch:{ Exception -> 0x006e }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x006e }
            kotlin.jvm.internal.m.d(r11, r4)     // Catch:{ Exception -> 0x006e }
            r5 = r11
            goto L_0x0082
        L_0x006e:
            r11 = move-exception
            goto L_0x0076
        L_0x0070:
            r11 = move-exception
            r1 = r5
            goto L_0x0076
        L_0x0073:
            r11 = move-exception
            r1 = r5
            r2 = r1
        L_0x0076:
            r7 = r11
            r11 = r10
            r10 = r7
            goto L_0x007e
        L_0x007a:
            r10 = move-exception
            r11 = r5
            r1 = r11
            r2 = r1
        L_0x007e:
            r10.printStackTrace()     // Catch:{ Exception -> 0x010a }
            r10 = r11
        L_0x0082:
            r11 = r5
            r5 = r2
            goto L_0x0091
        L_0x0085:
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x010a }
            java.lang.String r1 = r11.toString()     // Catch:{ Exception -> 0x010a }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x010a }
        L_0x0091:
            int r0 = r10.hashCode()     // Catch:{ Exception -> 0x010a }
            switch(r0) {
                case -1081306052: goto L_0x00fc;
                case -991745245: goto L_0x00ef;
                case 96801: goto L_0x00e2;
                case 116079: goto L_0x00d1;
                case 3343799: goto L_0x00a8;
                case 106642798: goto L_0x009a;
                default: goto L_0x0098;
            }     // Catch:{ Exception -> 0x010a }
        L_0x0098:
            goto L_0x010a
        L_0x009a:
            java.lang.String r11 = "phone"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x010a }
            if (r10 != 0) goto L_0x00a4
            goto L_0x010a
        L_0x00a4:
            r8.d(r9, r5)     // Catch:{ Exception -> 0x010a }
            goto L_0x010a
        L_0x00a8:
            java.lang.String r0 = "mail"
            boolean r10 = r10.equals(r0)     // Catch:{ Exception -> 0x010a }
            if (r10 != 0) goto L_0x00b1
            goto L_0x010a
        L_0x00b1:
            np.com.nepalipatro.helpers.k$a r10 = np.com.nepalipatro.helpers.k.f16077a     // Catch:{ Exception -> 0x010a }
            java.lang.String r0 = r10.k()     // Catch:{ Exception -> 0x010a }
            java.lang.String r2 = "ne"
            java.lang.String r10 = r10.w(r9, r0, r2)     // Catch:{ Exception -> 0x010a }
            np.com.nepalipatro.helpers.e$a r0 = np.com.nepalipatro.helpers.e.f15961a     // Catch:{ Exception -> 0x010a }
            java.lang.String r0 = r0.S()     // Catch:{ Exception -> 0x010a }
            if (r10 != r0) goto L_0x00cb
            np.com.nepalipatro.helpers.j r10 = f16076a     // Catch:{ Exception -> 0x010a }
            r10.c(r9, r5, r11)     // Catch:{ Exception -> 0x010a }
            goto L_0x010a
        L_0x00cb:
            np.com.nepalipatro.helpers.j r10 = f16076a     // Catch:{ Exception -> 0x010a }
            r10.c(r9, r5, r1)     // Catch:{ Exception -> 0x010a }
            goto L_0x010a
        L_0x00d1:
            java.lang.String r11 = "url"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x010a }
            if (r10 != 0) goto L_0x00da
            goto L_0x010a
        L_0x00da:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x010a }
            java.lang.Boolean r11 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x010a }
            r8.e(r9, r5, r10, r11)     // Catch:{ Exception -> 0x010a }
            goto L_0x010a
        L_0x00e2:
            java.lang.String r11 = "app"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x010a }
            if (r10 != 0) goto L_0x00eb
            goto L_0x010a
        L_0x00eb:
            r8.b(r9, r5)     // Catch:{ Exception -> 0x010a }
            goto L_0x010a
        L_0x00ef:
            java.lang.String r11 = "youtube"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x010a }
            if (r10 != 0) goto L_0x00f8
            goto L_0x010a
        L_0x00f8:
            r8.f(r9, r5)     // Catch:{ Exception -> 0x010a }
            goto L_0x010a
        L_0x00fc:
            java.lang.String r11 = "market"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x010a }
            if (r10 != 0) goto L_0x0105
            goto L_0x010a
        L_0x0105:
            np.com.nepalipatro.helpers.l$a r10 = np.com.nepalipatro.helpers.l.f16129a     // Catch:{ Exception -> 0x010a }
            r10.q(r9, r5)     // Catch:{ Exception -> 0x010a }
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: np.com.nepalipatro.helpers.j.a(android.content.Context, java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:7|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r7 = "https://play.google.com/store/apps/details?id=" + r7;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x004a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.Context r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.m.f(r6, r0)
            java.lang.String r0 = "link"
            kotlin.jvm.internal.m.f(r7, r0)
            np.com.nepalipatro.helpers.l$a r0 = np.com.nepalipatro.helpers.l.f16129a     // Catch:{ Exception -> 0x0069 }
            boolean r0 = r0.m(r6, r7)     // Catch:{ Exception -> 0x0069 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x0069 }
            java.lang.String r2 = "android.intent.action.VIEW"
            r1.<init>(r2)     // Catch:{ Exception -> 0x0069 }
            r2 = 335577088(0x14008000, float:6.487592E-27)
            if (r0 == 0) goto L_0x002e
            android.content.pm.PackageManager r0 = r6.getPackageManager()     // Catch:{ Exception -> 0x0069 }
            android.content.Intent r7 = r0.getLaunchIntentForPackage(r7)     // Catch:{ Exception -> 0x0069 }
            kotlin.jvm.internal.m.c(r7)     // Catch:{ Exception -> 0x0069 }
            r7.setFlags(r2)     // Catch:{ Exception -> 0x0069 }
            r6.startActivity(r7)     // Catch:{ Exception -> 0x0069 }
            goto L_0x006d
        L_0x002e:
            android.content.pm.PackageManager r0 = r6.getPackageManager()     // Catch:{ Exception -> 0x004a }
            java.lang.String r3 = "com.android.vending"
            r4 = 0
            r0.getPackageInfo(r3, r4)     // Catch:{ Exception -> 0x004a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004a }
            r0.<init>()     // Catch:{ Exception -> 0x004a }
            java.lang.String r3 = "market://details?id="
            r0.append(r3)     // Catch:{ Exception -> 0x004a }
            r0.append(r7)     // Catch:{ Exception -> 0x004a }
            java.lang.String r7 = r0.toString()     // Catch:{ Exception -> 0x004a }
            goto L_0x005b
        L_0x004a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0069 }
            r0.<init>()     // Catch:{ Exception -> 0x0069 }
            java.lang.String r3 = "https://play.google.com/store/apps/details?id="
            r0.append(r3)     // Catch:{ Exception -> 0x0069 }
            r0.append(r7)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r7 = r0.toString()     // Catch:{ Exception -> 0x0069 }
        L_0x005b:
            r1.setFlags(r2)     // Catch:{ Exception -> 0x0069 }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ Exception -> 0x0069 }
            r1.setData(r7)     // Catch:{ Exception -> 0x0069 }
            r6.startActivity(r1)     // Catch:{ Exception -> 0x0069 }
            goto L_0x006d
        L_0x0069:
            r6 = move-exception
            r6.printStackTrace()
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: np.com.nepalipatro.helpers.j.b(android.content.Context, java.lang.String):void");
    }

    public final void c(Context context, String str, String str2) {
        m.f(context, "context");
        m.f(str, "email");
        m.f(str2, "subject");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("mailto:" + str));
            intent.setFlags(335577088);
            intent.putExtra("android.intent.extra.SUBJECT", str2);
            context.startActivity(intent);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void d(Context context, String str) {
        m.f(context, "context");
        m.f(str, "number");
        try {
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse(str));
            intent.setFlags(335577088);
            context.startActivity(intent);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void e(Context context, String str, Boolean bool, Boolean bool2) {
        m.f(context, "context");
        m.f(str, "url");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void f(Context context, String str) {
        m.f(context, "context");
        m.f(str, "link");
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.setFlags(335577088);
            context.startActivity(intent);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
