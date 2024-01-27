package np.com.nepalipatro.helpers;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import ea.j;
import ea.o;
import ea.z;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import v7.r;
import v7.s;
import v7.t;
import v7.v;
import v7.w;
import v7.x;
import v7.y;

/* compiled from: HttpRequest.kt */
public final class i extends AsyncTask<Void, Long, Void> {

    /* renamed from: n  reason: collision with root package name */
    public static final a f16052n = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final Context f16053a;

    /* renamed from: b  reason: collision with root package name */
    private String f16054b;

    /* renamed from: c  reason: collision with root package name */
    private final w f16055c;

    /* renamed from: d  reason: collision with root package name */
    private String f16056d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f16057e = "";

    /* renamed from: f  reason: collision with root package name */
    private f f16058f;

    /* renamed from: g  reason: collision with root package name */
    private Bundle f16059g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f16060h;

    /* renamed from: i  reason: collision with root package name */
    private String f16061i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f16062j;

    /* renamed from: k  reason: collision with root package name */
    private d f16063k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public c f16064l;

    /* renamed from: m  reason: collision with root package name */
    private b f16065m;

    /* compiled from: HttpRequest.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean c(Context context) {
            Object systemService = context.getSystemService("connectivity");
            m.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }

        public final String b(Context context) {
            m.f(context, "context");
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (Build.VERSION.SDK_INT < 28) {
                    return "";
                }
                return "/vd/" + Build.VERSION.RELEASE + "/vn/" + packageInfo.versionName + "/vc/" + packageInfo.getLongVersionCode() + "/tz/" + TimeZone.getDefault().getDisplayName(false, 0);
            } catch (Exception e10) {
                if (!g.f16048a.a()) {
                    return "";
                }
                e10.printStackTrace();
                return "";
            }
        }
    }

    /* compiled from: HttpRequest.kt */
    public interface b {
        void a(f fVar, String str);
    }

    /* compiled from: HttpRequest.kt */
    public interface c {
        void a(long j10, long j11, boolean z10);
    }

    /* compiled from: HttpRequest.kt */
    public interface d {
        void a(f fVar, Bundle bundle);
    }

    /* compiled from: HttpRequest.kt */
    private final class e extends y {
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public final y f16066h;

        /* renamed from: i  reason: collision with root package name */
        private ea.g f16067i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ i f16068j;

        /* compiled from: HttpRequest.kt */
        public static final class a extends j {

            /* renamed from: i  reason: collision with root package name */
            private long f16069i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ i f16070j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ e f16071k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(z zVar, i iVar, e eVar) {
                super(zVar);
                this.f16070j = iVar;
                this.f16071k = eVar;
            }

            public long S(ea.e eVar, long j10) {
                m.f(eVar, "sink");
                long S = super.S(eVar, j10);
                int i10 = (S > -1 ? 1 : (S == -1 ? 0 : -1));
                this.f16069i += i10 != 0 ? S : 0;
                if (this.f16070j.f16064l != null) {
                    c b10 = this.f16070j.f16064l;
                    m.c(b10);
                    b10.a(this.f16069i, this.f16071k.f16066h.j(), i10 == 0);
                    this.f16070j.publishProgress(new Long[]{Long.valueOf((((long) 100) * S) / this.f16071k.f16066h.j())});
                }
                return S;
            }
        }

        public e(i iVar, y yVar) {
            m.f(yVar, "responseBody");
            this.f16068j = iVar;
            this.f16066h = yVar;
        }

        private final z J(z zVar) {
            return new a(zVar, this.f16068j, this);
        }

        public long j() {
            return this.f16066h.j();
        }

        public s q() {
            s q10 = this.f16066h.q();
            m.e(q10, "responseBody.contentType()");
            return q10;
        }

        public ea.g u() {
            if (this.f16067i == null) {
                ea.g u10 = this.f16066h.u();
                m.e(u10, "responseBody.source()");
                this.f16067i = o.b(J(u10));
            }
            ea.g gVar = this.f16067i;
            m.d(gVar, "null cannot be cast to non-null type okio.BufferedSource");
            return gVar;
        }
    }

    /* compiled from: HttpRequest.kt */
    public enum f {
        HTTP_NO_NETWORK,
        HTTP_OTHERS,
        HTTP_SUCCESS
    }

    public i(Context context, String str, w wVar) {
        m.f(context, "mContext");
        m.f(str, "mUrl");
        this.f16053a = context;
        this.f16054b = str;
        this.f16055c = wVar;
    }

    /* access modifiers changed from: private */
    public static final x g(i iVar, r.a aVar) {
        m.f(iVar, "this$0");
        x a10 = aVar.a(aVar.b());
        x.b t10 = a10.t();
        y k10 = a10.k();
        m.e(k10, "originalResponse.body()");
        return t10.l(new e(iVar, k10)).m();
    }

    public final void d(String str) {
        m.f(str, "token");
        this.f16057e = str;
    }

    public final void e(boolean z10) {
        this.f16062j = z10;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Void doInBackground(Void... voidArr) {
        v vVar;
        String str;
        m.f(voidArr, NativeProtocol.WEB_DIALOG_PARAMS);
        if (this.f16062j) {
            this.f16054b += f16052n.b(this.f16053a);
        }
        if (f16052n.c(this.f16053a)) {
            t tVar = new t();
            long j10 = (long) 20;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            tVar.C(j10, timeUnit);
            tVar.D(j10, timeUnit);
            if (this.f16055c == null) {
                vVar = new v.b().n(this.f16054b).h(v7.c.f16756m).g();
            } else {
                vVar = new v.b().n(this.f16054b).l(this.f16055c).h(v7.c.f16756m).g();
            }
            if ((this.f16057e.length() == 0) || this.f16055c == null) {
                if (!(this.f16057e.length() == 0) && this.f16055c == null) {
                    vVar = new v.b().n(this.f16054b).i().h(v7.c.f16756m).f("Authorization", "Bearer " + this.f16057e).g();
                }
            } else {
                vVar = new v.b().n(this.f16054b).l(this.f16055c).h(v7.c.f16756m).f("Authorization", "Bearer " + this.f16057e).g();
            }
            tVar.A().add(new w9.c(this));
            try {
                x b10 = tVar.B(vVar).b();
                if (b10.s()) {
                    if (this.f16060h) {
                        ea.f a10 = o.a(p.e(new File(this.f16053a.getCacheDir(), this.f16061i), false, 1, (Object) null));
                        ea.g u10 = b10.k().u();
                        m.e(u10, "response.body().source()");
                        a10.o(u10);
                        a10.close();
                        str = "";
                    } else {
                        str = b10.k().w();
                        m.e(str, "{\n                    re…tring()\n                }");
                    }
                    this.f16056d = str;
                    b10.k().close();
                    this.f16058f = f.HTTP_SUCCESS;
                } else {
                    throw new IOException("Unexpected code " + b10);
                }
            } catch (Exception e10) {
                if (g.f16048a.a()) {
                    e10.printStackTrace();
                }
                this.f16058f = f.HTTP_OTHERS;
            }
        } else {
            this.f16058f = f.HTTP_NO_NETWORK;
        }
        b bVar = this.f16065m;
        if (bVar != null) {
            m.c(bVar);
            bVar.a(this.f16058f, this.f16056d);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void onPostExecute(Void voidR) {
        super.onPostExecute(voidR);
        try {
            if (!isCancelled() && this.f16063k != null) {
                if (this.f16059g == null) {
                    this.f16059g = new Bundle();
                }
                Bundle bundle = this.f16059g;
                m.c(bundle);
                bundle.putString("RESPONSE_TEXT", this.f16056d);
                d dVar = this.f16063k;
                m.c(dVar);
                dVar.a(this.f16058f, this.f16059g);
            }
        } catch (Exception e10) {
            if (g.f16048a.a()) {
                e10.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void onProgressUpdate(Long... lArr) {
        m.f(lArr, "values");
        super.onProgressUpdate(Arrays.copyOf(lArr, lArr.length));
    }

    public final void j(boolean z10) {
        this.f16060h = z10;
    }

    public final void k(String str) {
        this.f16061i = str;
    }

    public final void l(b bVar) {
        this.f16065m = bVar;
    }

    public final void m(d dVar) {
        this.f16063k = dVar;
    }

    public final void n(f fVar) {
        this.f16058f = fVar;
    }
}
