package v9;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import java.util.TimeZone;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.helpers.g;
import np.com.nepalipatro.helpers.i;
import np.com.nepalipatro.helpers.k;
import np.com.nepalipatro.helpers.l;
import v7.n;
import v7.w;

/* compiled from: SaveRegistration.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private String f16972a;

    /* renamed from: b  reason: collision with root package name */
    private Context f16973b;

    /* compiled from: SaveRegistration.kt */
    public static final class a implements i.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f16974a;

        a(Context context) {
            this.f16974a = context;
        }

        public void a(i.f fVar, Bundle bundle) {
            if (i.f.HTTP_SUCCESS == fVar) {
                g.f16048a.b("FCM Registration sent successfully");
                k.a aVar = k.f16077a;
                aVar.x(this.f16974a, aVar.d(), true);
                return;
            }
            g.f16048a.b("FCM Registration sent failed");
        }
    }

    public c(Context context, String str) {
        this.f16973b = context;
        this.f16972a = str;
    }

    @SuppressLint({"HardwareIds"})
    private final void b(String str) {
        long j10;
        String str2;
        String str3;
        Context context = this.f16973b;
        if (context != null) {
            PackageInfo packageInfo = null;
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e10) {
                if (g.f16048a.a()) {
                    e10.printStackTrace();
                }
            }
            if (packageInfo != null) {
                str2 = packageInfo.versionName;
                m.e(str2, "info.versionName");
                j10 = androidx.core.content.pm.a.a(packageInfo);
            } else {
                j10 = 0;
                str2 = "";
            }
            if (Build.VERSION.SDK_INT >= 23) {
                g.f16048a.b("FCM update - build sdk version is greater or equals to M, using newer method to get MAC address");
                str3 = l.f16129a.l();
            } else {
                g.f16048a.b("FCM update - build sdk version is less than M, using traditional method to get MAC address");
                str3 = "";
            }
            n nVar = new n();
            String str4 = this.f16972a;
            if (str4 == null) {
                str4 = "";
            }
            n a10 = nVar.a("regid", str4);
            n a11 = a10.a(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, Build.VERSION.RELEASE + "");
            n a12 = a11.a(DeviceRequestsHelper.DEVICE_INFO_DEVICE, Build.MODEL + "");
            n a13 = a12.a("vname", str2 + "");
            n a14 = a13.a("vcode", j10 + "");
            n a15 = a14.a("tz", TimeZone.getDefault().getDisplayName(false, 0) + "");
            n a16 = a15.a("mac", str3 + "");
            w9.i.f17064a.a("");
            w b10 = a16.a("email", "").b();
            g.a aVar = g.f16048a;
            aVar.b("my email is " + "");
            aVar.b("url is " + str);
            Context applicationContext = context.getApplicationContext();
            m.e(applicationContext, "it.applicationContext");
            i iVar = new i(applicationContext, str, b10);
            iVar.e(true);
            iVar.m(new a(context));
            iVar.execute(new Void[0]);
        }
    }

    public final void a() {
        try {
            b("https://nepalipatro.com.np/gcm/register");
        } catch (Exception e10) {
            if (g.f16048a.a()) {
                e10.printStackTrace();
            }
        }
    }
}
