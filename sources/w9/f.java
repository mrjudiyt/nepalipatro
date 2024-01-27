package w9;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.plugin.common.MethodChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.m;

/* compiled from: InstallReferrerHelper.kt */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final MethodChannel.Result f17053a;

    /* renamed from: b  reason: collision with root package name */
    private final FlutterActivity f17054b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f17055c = Executors.newSingleThreadExecutor();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final String f17056d = "checkedInstallReferrer";

    /* compiled from: InstallReferrerHelper.kt */
    public static final class a implements InstallReferrerStateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InstallReferrerClient f17057a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f17058b;

        a(InstallReferrerClient installReferrerClient, f fVar) {
            this.f17057a = installReferrerClient;
            this.f17058b = fVar;
        }

        public void onInstallReferrerServiceDisconnected() {
            this.f17058b.g().success((Object) null);
        }

        public void onInstallReferrerSetupFinished(int i10) {
            String str = null;
            if (i10 == 0) {
                try {
                    ReferrerDetails b10 = this.f17057a.b();
                    if (b10 != null) {
                        str = b10.a();
                    }
                    if (str != null) {
                        f fVar = this.f17058b;
                        new v9.a(fVar.e().getApplicationContext()).a("INSTALL_EVENT", fVar.f17056d, "install_referrer", str);
                        fVar.e().getPreferences(0).edit().putBoolean(fVar.f17056d, true).apply();
                        fVar.g().success(str);
                    }
                    this.f17057a.a();
                } catch (RemoteException e10) {
                    e10.printStackTrace();
                    this.f17058b.g().success((Object) null);
                }
            } else if (i10 == 1) {
                this.f17058b.g().success((Object) null);
            } else if (i10 == 2) {
                this.f17058b.g().success((Object) null);
            }
        }
    }

    public f(MethodChannel.Result result, FlutterActivity flutterActivity) {
        m.f(result, "result");
        m.f(flutterActivity, "activity");
        this.f17053a = result;
        this.f17054b = flutterActivity;
    }

    /* access modifiers changed from: private */
    public static final void d(f fVar, InstallReferrerClient installReferrerClient) {
        m.f(fVar, "this$0");
        m.f(installReferrerClient, "$referrerClient");
        fVar.f(installReferrerClient);
    }

    private final void f(InstallReferrerClient installReferrerClient) {
        installReferrerClient.d(new a(installReferrerClient, this));
    }

    public final void c() {
        if (this.f17054b.getPreferences(0).getBoolean(this.f17056d, false)) {
            this.f17053a.success((Object) null);
            return;
        }
        InstallReferrerClient a10 = InstallReferrerClient.c(this.f17054b.getApplicationContext()).a();
        m.e(a10, "newBuilder(activity.applicationContext).build()");
        Executor executor = this.f17055c;
        m.c(executor);
        executor.execute(new e(this, a10));
    }

    public final FlutterActivity e() {
        return this.f17054b;
    }

    public final MethodChannel.Result g() {
        return this.f17053a;
    }
}
