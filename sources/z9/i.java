package z9;

import android.content.Context;
import com.facebook.internal.NativeProtocol;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.App;
import np.com.nepalipatro.helpers.e;
import np.com.nepalipatro.helpers.g;
import np.com.nepalipatro.helpers.i;
import org.json.JSONObject;
import v7.w;

/* compiled from: DataLoaderTithiMap.kt */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private Context f17626a;

    /* renamed from: b  reason: collision with root package name */
    private j f17627b;

    /* renamed from: c  reason: collision with root package name */
    private String f17628c = "";

    /* compiled from: DataLoaderTithiMap.kt */
    public static final class a implements i.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f17629a;

        a(i iVar) {
            this.f17629a = iVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            r0 = r0.getApplicationInfo();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(np.com.nepalipatro.helpers.i.f r6, android.os.Bundle r7) {
            /*
                r5 = this;
                np.com.nepalipatro.helpers.i$f r7 = np.com.nepalipatro.helpers.i.f.HTTP_SUCCESS
                if (r6 != r7) goto L_0x0092
                np.com.nepalipatro.helpers.e$a$a r6 = np.com.nepalipatro.helpers.e.a.C0267a.SUCCESS
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                z9.i r0 = r5.f17629a
                android.content.Context r0 = r0.d()
                r1 = 0
                if (r0 == 0) goto L_0x001d
                android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
                if (r0 == 0) goto L_0x001d
                java.lang.String r0 = r0.dataDir
                goto L_0x001e
            L_0x001d:
                r0 = r1
            L_0x001e:
                r7.append(r0)
                java.lang.String r0 = "/app_flutter/"
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                np.com.nepalipatro.helpers.e$a r2 = np.com.nepalipatro.helpers.e.f15961a
                java.lang.String r3 = r2.Z()
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                np.com.nepalipatro.helpers.h r3 = np.com.nepalipatro.helpers.h.f16051a
                r3.a(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                z9.i r4 = r5.f17629a
                android.content.Context r4 = r4.d()
                if (r4 == 0) goto L_0x0055
                java.io.File r1 = r4.getCacheDir()
            L_0x0055:
                r0.append(r1)
                r1 = 47
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = r2.b0()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r3.c(r0, r1, r7)
                z9.i r7 = r5.f17629a
                java.lang.String r7 = r7.f()
                r0 = 1
                if (r7 == 0) goto L_0x007e
                int r7 = r7.length()
                if (r7 <= 0) goto L_0x007c
                goto L_0x007e
            L_0x007c:
                r7 = 0
                r0 = 0
            L_0x007e:
                if (r0 == 0) goto L_0x0086
                z9.i r6 = r5.f17629a
                r6.g()
                goto L_0x00b1
            L_0x0086:
                z9.i r7 = r5.f17629a
                z9.j r7 = r7.e()
                if (r7 == 0) goto L_0x00b1
                r7.b(r6)
                goto L_0x00b1
            L_0x0092:
                np.com.nepalipatro.helpers.i$f r7 = np.com.nepalipatro.helpers.i.f.HTTP_NO_NETWORK
                if (r6 != r7) goto L_0x00a4
                np.com.nepalipatro.helpers.e$a$a r6 = np.com.nepalipatro.helpers.e.a.C0267a.ERROR_NO_NETWORK
                z9.i r7 = r5.f17629a
                z9.j r7 = r7.e()
                if (r7 == 0) goto L_0x00b1
                r7.a(r6)
                goto L_0x00b1
            L_0x00a4:
                np.com.nepalipatro.helpers.e$a$a r6 = np.com.nepalipatro.helpers.e.a.C0267a.ERROR_DATA_FETCH
                z9.i r7 = r5.f17629a
                z9.j r7 = r7.e()
                if (r7 == 0) goto L_0x00b1
                r7.a(r6)
            L_0x00b1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z9.i.a.a(np.com.nepalipatro.helpers.i$f, android.os.Bundle):void");
        }
    }

    public i(Context context) {
        m.f(context, "context");
        this.f17626a = context;
    }

    /* access modifiers changed from: private */
    public final void g() {
        try {
            JSONObject jSONObject = new JSONObject(this.f17628c);
            if (jSONObject.has(NativeProtocol.WEB_DIALOG_ACTION)) {
                String obj = jSONObject.get(NativeProtocol.WEB_DIALOG_ACTION).toString();
                String str = "";
                if (obj == null) {
                    obj = str;
                }
                e.a aVar = e.f15961a;
                if (obj.equals(aVar.B()) && String.valueOf(jSONObject.get("link")).equals(aVar.D())) {
                    Context context = this.f17626a;
                    Context applicationContext = context != null ? context.getApplicationContext() : null;
                    m.d(applicationContext, "null cannot be cast to non-null type np.com.nepalipatro.App");
                    b b10 = ((App) applicationContext).b();
                    if (b10 != null) {
                        String str2 = this.f17628c;
                        if (str2 != null) {
                            str = str2;
                        }
                        b10.e(str);
                    }
                }
            }
        } catch (Exception e10) {
            if (g.f16048a.a()) {
                e10.printStackTrace();
            }
        }
    }

    public final void b(String str) {
        m.f(str, "url");
        try {
            Context context = this.f17626a;
            np.com.nepalipatro.helpers.i iVar = null;
            if (context != null) {
                iVar = new np.com.nepalipatro.helpers.i(context, str, (w) null);
            }
            if (iVar != null) {
                iVar.j(true);
            }
            if (iVar != null) {
                iVar.k(e.f15961a.b0());
            }
            if (iVar != null) {
                iVar.m(new a(this));
            }
            if (iVar != null) {
                iVar.execute(new Void[0]);
            }
        } catch (Exception e10) {
            if (g.f16048a.a()) {
                e10.printStackTrace();
            }
        }
    }

    public final void c(boolean z10, String str) {
        m.f(str, "options");
        this.f17628c = str;
        b(e.f15961a.a0());
    }

    public final Context d() {
        return this.f17626a;
    }

    public final j e() {
        return this.f17627b;
    }

    public final String f() {
        return this.f17628c;
    }
}
