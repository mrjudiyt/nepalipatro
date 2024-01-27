package b2;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.List;

/* compiled from: ServiceManager */
final class p {

    @FunctionalInterface
    /* compiled from: ServiceManager */
    interface a {
        void onSuccess(int i10);
    }

    p() {
    }

    private List<ResolveInfo> b(PackageManager packageManager) {
        Intent intent = new Intent("android.intent.action.CALL");
        intent.setData(Uri.parse("tel:123123"));
        if (Build.VERSION.SDK_INT >= 33) {
            return packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0));
        }
        return packageManager.queryIntentActivities(intent, 0);
    }

    private boolean c(Context context) {
        if (Build.VERSION.SDK_INT < 18) {
            return BluetoothAdapter.getDefaultAdapter().isEnabled();
        }
        return ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter().isEnabled();
    }

    private static boolean d(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return false;
        }
        return !TextUtils.isEmpty(Settings.Secure.getString(context.getContentResolver(), "location_providers_allowed"));
    }

    private boolean e(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            LocationManager locationManager = (LocationManager) context.getSystemService(LocationManager.class);
            if (locationManager == null) {
                return false;
            }
            return locationManager.isLocationEnabled();
        } else if (i10 >= 19) {
            return f(context);
        } else {
            return d(context);
        }
    }

    private static boolean f(Context context) {
        if (Build.VERSION.SDK_INT < 19) {
            return false;
        }
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0) {
                return true;
            }
            return false;
        } catch (Settings.SettingNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i10, Context context, a aVar, b bVar) {
        if (context == null) {
            bVar.a("PermissionHandler.ServiceManager", "Android context cannot be null.");
        } else if (i10 == 3 || i10 == 4 || i10 == 5) {
            aVar.onSuccess(e(context) ? 1 : 0);
        } else {
            if (i10 == 21) {
                aVar.onSuccess(c(context) ? 1 : 0);
            }
            int i11 = 1;
            if (i10 == 8) {
                PackageManager packageManager = context.getPackageManager();
                if (!packageManager.hasSystemFeature("android.hardware.telephony")) {
                    aVar.onSuccess(2);
                    return;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null || telephonyManager.getPhoneType() == 0) {
                    aVar.onSuccess(2);
                } else if (b(packageManager).isEmpty()) {
                    aVar.onSuccess(2);
                } else if (telephonyManager.getSimState() != 5) {
                    aVar.onSuccess(0);
                } else {
                    aVar.onSuccess(1);
                }
            } else if (i10 == 16) {
                if (Build.VERSION.SDK_INT < 23) {
                    i11 = 2;
                }
                aVar.onSuccess(i11);
            } else {
                aVar.onSuccess(2);
            }
        }
    }
}
