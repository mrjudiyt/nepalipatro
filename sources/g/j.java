package g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.core.content.c;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Calendar;

/* compiled from: TwilightManager */
class j {

    /* renamed from: d  reason: collision with root package name */
    private static j f8632d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f8633a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f8634b;

    /* renamed from: c  reason: collision with root package name */
    private final a f8635c = new a();

    /* compiled from: TwilightManager */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f8636a;

        /* renamed from: b  reason: collision with root package name */
        long f8637b;

        /* renamed from: c  reason: collision with root package name */
        long f8638c;

        /* renamed from: d  reason: collision with root package name */
        long f8639d;

        /* renamed from: e  reason: collision with root package name */
        long f8640e;

        /* renamed from: f  reason: collision with root package name */
        long f8641f;

        a() {
        }
    }

    j(Context context, LocationManager locationManager) {
        this.f8633a = context;
        this.f8634b = locationManager;
    }

    static j a(Context context) {
        if (f8632d == null) {
            Context applicationContext = context.getApplicationContext();
            f8632d = new j(applicationContext, (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.Param.LOCATION));
        }
        return f8632d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location location = null;
        Location c10 = c.b(this.f8633a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        if (c.b(this.f8633a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = c("gps");
        }
        return (location == null || c10 == null) ? location != null ? location : c10 : location.getTime() > c10.getTime() ? location : c10;
    }

    private Location c(String str) {
        try {
            if (this.f8634b.isProviderEnabled(str)) {
                return this.f8634b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean e() {
        return this.f8635c.f8641f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j10;
        a aVar = this.f8635c;
        long currentTimeMillis = System.currentTimeMillis();
        i b10 = i.b();
        i iVar = b10;
        iVar.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j11 = b10.f8629a;
        iVar.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = b10.f8631c == 1;
        long j12 = b10.f8630b;
        long j13 = j11;
        long j14 = b10.f8629a;
        long j15 = j12;
        boolean z11 = z10;
        b10.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j16 = b10.f8630b;
        if (j15 == -1 || j14 == -1) {
            j10 = 43200000 + currentTimeMillis;
        } else {
            j10 = (currentTimeMillis > j14 ? 0 + j16 : currentTimeMillis > j15 ? 0 + j14 : 0 + j15) + 60000;
        }
        aVar.f8636a = z11;
        aVar.f8637b = j13;
        aVar.f8638c = j15;
        aVar.f8639d = j14;
        aVar.f8640e = j16;
        aVar.f8641f = j10;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.f8635c;
        if (e()) {
            return aVar.f8636a;
        }
        Location b10 = b();
        if (b10 != null) {
            f(b10);
            return aVar.f8636a;
        }
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
