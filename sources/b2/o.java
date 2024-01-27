package b2;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import androidx.core.app.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PermissionUtils */
public class o {
    private static String a(Context context, String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && d(context, (ArrayList<String>) null, str)) {
            return str;
        }
        if (i10 < 29) {
            if (d(context, (ArrayList<String>) null, "android.permission.ACCESS_FINE_LOCATION")) {
                return "android.permission.ACCESS_FINE_LOCATION";
            }
            if (d(context, (ArrayList<String>) null, "android.permission.ACCESS_COARSE_LOCATION")) {
                return "android.permission.ACCESS_COARSE_LOCATION";
            }
            return null;
        } else if (i10 < 29 || !d(context, (ArrayList<String>) null, "android.permission.ACCESS_FINE_LOCATION")) {
            return null;
        } else {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
    }

    static List<String> b(Context context, int i10) {
        ArrayList arrayList = new ArrayList();
        switch (i10) {
            case 0:
                if (d(context, arrayList, "android.permission.READ_CALENDAR")) {
                    arrayList.add("android.permission.READ_CALENDAR");
                }
                if (d(context, arrayList, "android.permission.WRITE_CALENDAR")) {
                    arrayList.add("android.permission.WRITE_CALENDAR");
                    break;
                }
                break;
            case 1:
                if (d(context, arrayList, "android.permission.CAMERA")) {
                    arrayList.add("android.permission.CAMERA");
                    break;
                }
                break;
            case 2:
                if (d(context, arrayList, "android.permission.READ_CONTACTS")) {
                    arrayList.add("android.permission.READ_CONTACTS");
                }
                if (d(context, arrayList, "android.permission.WRITE_CONTACTS")) {
                    arrayList.add("android.permission.WRITE_CONTACTS");
                }
                if (d(context, arrayList, "android.permission.GET_ACCOUNTS")) {
                    arrayList.add("android.permission.GET_ACCOUNTS");
                    break;
                }
                break;
            case 4:
                if (Build.VERSION.SDK_INT >= 29) {
                    if (d(context, arrayList, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                        arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                        break;
                    }
                }
                break;
            case 3:
            case 5:
                if (d(context, arrayList, "android.permission.ACCESS_COARSE_LOCATION")) {
                    arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
                }
                if (d(context, arrayList, "android.permission.ACCESS_FINE_LOCATION")) {
                    arrayList.add("android.permission.ACCESS_FINE_LOCATION");
                    break;
                }
                break;
            case 6:
            case 11:
            case 20:
                return null;
            case 7:
            case 14:
                if (d(context, arrayList, "android.permission.RECORD_AUDIO")) {
                    arrayList.add("android.permission.RECORD_AUDIO");
                    break;
                }
                break;
            case 8:
                if (d(context, arrayList, "android.permission.READ_PHONE_STATE")) {
                    arrayList.add("android.permission.READ_PHONE_STATE");
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 > 29 && d(context, arrayList, "android.permission.READ_PHONE_NUMBERS")) {
                    arrayList.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (d(context, arrayList, "android.permission.CALL_PHONE")) {
                    arrayList.add("android.permission.CALL_PHONE");
                }
                if (d(context, arrayList, "android.permission.READ_CALL_LOG")) {
                    arrayList.add("android.permission.READ_CALL_LOG");
                }
                if (d(context, arrayList, "android.permission.WRITE_CALL_LOG")) {
                    arrayList.add("android.permission.WRITE_CALL_LOG");
                }
                if (d(context, arrayList, "com.android.voicemail.permission.ADD_VOICEMAIL")) {
                    arrayList.add("com.android.voicemail.permission.ADD_VOICEMAIL");
                }
                if (d(context, arrayList, "android.permission.USE_SIP")) {
                    arrayList.add("android.permission.USE_SIP");
                }
                if (i11 >= 29 && d(context, arrayList, "android.permission.BIND_CALL_REDIRECTION_SERVICE")) {
                    arrayList.add("android.permission.BIND_CALL_REDIRECTION_SERVICE");
                }
                if (i11 >= 26 && d(context, arrayList, "android.permission.ANSWER_PHONE_CALLS")) {
                    arrayList.add("android.permission.ANSWER_PHONE_CALLS");
                    break;
                }
            case 9:
                if (Build.VERSION.SDK_INT >= 33 && d(context, arrayList, "android.permission.READ_MEDIA_IMAGES")) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                    break;
                }
            case 12:
                if (Build.VERSION.SDK_INT >= 20 && d(context, arrayList, "android.permission.BODY_SENSORS")) {
                    arrayList.add("android.permission.BODY_SENSORS");
                    break;
                }
            case 13:
                if (d(context, arrayList, "android.permission.SEND_SMS")) {
                    arrayList.add("android.permission.SEND_SMS");
                }
                if (d(context, arrayList, "android.permission.RECEIVE_SMS")) {
                    arrayList.add("android.permission.RECEIVE_SMS");
                }
                if (d(context, arrayList, "android.permission.READ_SMS")) {
                    arrayList.add("android.permission.READ_SMS");
                }
                if (d(context, arrayList, "android.permission.RECEIVE_WAP_PUSH")) {
                    arrayList.add("android.permission.RECEIVE_WAP_PUSH");
                }
                if (d(context, arrayList, "android.permission.RECEIVE_MMS")) {
                    arrayList.add("android.permission.RECEIVE_MMS");
                    break;
                }
                break;
            case 15:
                if (d(context, arrayList, "android.permission.READ_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                }
                int i12 = Build.VERSION.SDK_INT;
                if ((i12 < 29 || (i12 == 29 && Environment.isExternalStorageLegacy())) && d(context, arrayList, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                    break;
                }
            case 16:
                if (Build.VERSION.SDK_INT >= 23 && d(context, arrayList, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS")) {
                    arrayList.add("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                    break;
                }
            case 17:
                if (Build.VERSION.SDK_INT >= 33 && d(context, arrayList, "android.permission.POST_NOTIFICATIONS")) {
                    arrayList.add("android.permission.POST_NOTIFICATIONS");
                    break;
                }
            case 18:
                if (Build.VERSION.SDK_INT >= 29) {
                    if (d(context, arrayList, "android.permission.ACCESS_MEDIA_LOCATION")) {
                        arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
                        break;
                    }
                } else {
                    return null;
                }
                break;
            case 19:
                if (Build.VERSION.SDK_INT >= 29) {
                    if (d(context, arrayList, "android.permission.ACTIVITY_RECOGNITION")) {
                        arrayList.add("android.permission.ACTIVITY_RECOGNITION");
                        break;
                    }
                } else {
                    return null;
                }
                break;
            case 21:
                if (d(context, arrayList, "android.permission.BLUETOOTH")) {
                    arrayList.add("android.permission.BLUETOOTH");
                    break;
                }
                break;
            case 22:
                if (Build.VERSION.SDK_INT >= 30 && d(context, arrayList, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                    break;
                }
            case 23:
                if (d(context, arrayList, "android.permission.SYSTEM_ALERT_WINDOW")) {
                    arrayList.add("android.permission.SYSTEM_ALERT_WINDOW");
                    break;
                }
                break;
            case 24:
                if (Build.VERSION.SDK_INT >= 23 && d(context, arrayList, "android.permission.REQUEST_INSTALL_PACKAGES")) {
                    arrayList.add("android.permission.REQUEST_INSTALL_PACKAGES");
                    break;
                }
            case 27:
                if (Build.VERSION.SDK_INT >= 23 && d(context, arrayList, "android.permission.ACCESS_NOTIFICATION_POLICY")) {
                    arrayList.add("android.permission.ACCESS_NOTIFICATION_POLICY");
                    break;
                }
            case 28:
                String a10 = a(context, "android.permission.BLUETOOTH_SCAN");
                if (a10 != null) {
                    arrayList.add(a10);
                    break;
                }
                break;
            case 29:
                String a11 = a(context, "android.permission.BLUETOOTH_ADVERTISE");
                if (a11 != null) {
                    arrayList.add(a11);
                    break;
                }
                break;
            case 30:
                String a12 = a(context, "android.permission.BLUETOOTH_CONNECT");
                if (a12 != null) {
                    arrayList.add(a12);
                    break;
                }
                break;
            case 31:
                if (Build.VERSION.SDK_INT >= 33 && d(context, arrayList, "android.permission.NEARBY_WIFI_DEVICES")) {
                    arrayList.add("android.permission.NEARBY_WIFI_DEVICES");
                    break;
                }
            case 32:
                if (Build.VERSION.SDK_INT >= 33 && d(context, arrayList, "android.permission.READ_MEDIA_VIDEO")) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                    break;
                }
            case 33:
                if (Build.VERSION.SDK_INT >= 33 && d(context, arrayList, "android.permission.READ_MEDIA_AUDIO")) {
                    arrayList.add("android.permission.READ_MEDIA_AUDIO");
                    break;
                }
            case 34:
                if (Build.VERSION.SDK_INT >= 31 && d(context, arrayList, "android.permission.SCHEDULE_EXACT_ALARM")) {
                    arrayList.add("android.permission.SCHEDULE_EXACT_ALARM");
                    break;
                }
        }
        return arrayList;
    }

    private static PackageInfo c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096));
        }
        return packageManager.getPackageInfo(context.getPackageName(), 4096);
    }

    private static boolean d(Context context, ArrayList<String> arrayList, String str) {
        PackageInfo c10;
        if (arrayList != null) {
            try {
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().equals(str)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        if (context == null || (c10 = c(context)) == null) {
            return false;
        }
        Iterator it2 = new ArrayList(Arrays.asList(c10.requestedPermissions)).iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    static boolean e(Activity activity, String str) {
        if (activity == null) {
            return false;
        }
        return !b.z(activity, str);
    }

    static int f(String str) {
        String str2 = str;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2062386608:
                if (str2.equals("android.permission.READ_SMS")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1928411001:
                if (str2.equals("android.permission.READ_CALENDAR")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1925850455:
                if (str2.equals("android.permission.POST_NOTIFICATIONS")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1921431796:
                if (str2.equals("android.permission.READ_CALL_LOG")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1888586689:
                if (str2.equals("android.permission.ACCESS_FINE_LOCATION")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1813079487:
                if (str2.equals("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1783097621:
                if (str2.equals("android.permission.ACCESS_NOTIFICATION_POLICY")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1561629405:
                if (str2.equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                    c10 = 7;
                    break;
                }
                break;
            case -1479758289:
                if (str2.equals("android.permission.RECEIVE_WAP_PUSH")) {
                    c10 = 8;
                    break;
                }
                break;
            case -1238066820:
                if (str2.equals("android.permission.BODY_SENSORS")) {
                    c10 = 9;
                    break;
                }
                break;
            case -1164582768:
                if (str2.equals("android.permission.READ_PHONE_NUMBERS")) {
                    c10 = 10;
                    break;
                }
                break;
            case -909527021:
                if (str2.equals("android.permission.NEARBY_WIFI_DEVICES")) {
                    c10 = 11;
                    break;
                }
                break;
            case -901151997:
                if (str2.equals("android.permission.BIND_CALL_REDIRECTION_SERVICE")) {
                    c10 = 12;
                    break;
                }
                break;
            case -895679497:
                if (str2.equals("android.permission.RECEIVE_MMS")) {
                    c10 = 13;
                    break;
                }
                break;
            case -895673731:
                if (str2.equals("android.permission.RECEIVE_SMS")) {
                    c10 = 14;
                    break;
                }
                break;
            case -798669607:
                if (str2.equals("android.permission.BLUETOOTH_CONNECT")) {
                    c10 = 15;
                    break;
                }
                break;
            case -406040016:
                if (str2.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                    c10 = 16;
                    break;
                }
                break;
            case -63024214:
                if (str2.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                    c10 = 17;
                    break;
                }
                break;
            case -5573545:
                if (str2.equals("android.permission.READ_PHONE_STATE")) {
                    c10 = 18;
                    break;
                }
                break;
            case 52602690:
                if (str2.equals("android.permission.SEND_SMS")) {
                    c10 = 19;
                    break;
                }
                break;
            case 112197485:
                if (str2.equals("android.permission.CALL_PHONE")) {
                    c10 = 20;
                    break;
                }
                break;
            case 175802396:
                if (str2.equals("android.permission.READ_MEDIA_IMAGES")) {
                    c10 = 21;
                    break;
                }
                break;
            case 214526995:
                if (str2.equals("android.permission.WRITE_CONTACTS")) {
                    c10 = 22;
                    break;
                }
                break;
            case 463403621:
                if (str2.equals("android.permission.CAMERA")) {
                    c10 = 23;
                    break;
                }
                break;
            case 603653886:
                if (str2.equals("android.permission.WRITE_CALENDAR")) {
                    c10 = 24;
                    break;
                }
                break;
            case 610633091:
                if (str2.equals("android.permission.WRITE_CALL_LOG")) {
                    c10 = 25;
                    break;
                }
                break;
            case 691260818:
                if (str2.equals("android.permission.READ_MEDIA_AUDIO")) {
                    c10 = 26;
                    break;
                }
                break;
            case 710297143:
                if (str2.equals("android.permission.READ_MEDIA_VIDEO")) {
                    c10 = 27;
                    break;
                }
                break;
            case 784519842:
                if (str2.equals("android.permission.USE_SIP")) {
                    c10 = 28;
                    break;
                }
                break;
            case 970694249:
                if (str2.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
                    c10 = 29;
                    break;
                }
                break;
            case 1166454870:
                if (str2.equals("android.permission.BLUETOOTH_ADVERTISE")) {
                    c10 = 30;
                    break;
                }
                break;
            case 1271781903:
                if (str2.equals("android.permission.GET_ACCOUNTS")) {
                    c10 = 31;
                    break;
                }
                break;
            case 1365911975:
                if (str2.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 1777263169:
                if (str2.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
                    c10 = '!';
                    break;
                }
                break;
            case 1780337063:
                if (str2.equals("android.permission.ACTIVITY_RECOGNITION")) {
                    c10 = '\"';
                    break;
                }
                break;
            case 1831139720:
                if (str2.equals("android.permission.RECORD_AUDIO")) {
                    c10 = '#';
                    break;
                }
                break;
            case 1977429404:
                if (str2.equals("android.permission.READ_CONTACTS")) {
                    c10 = '$';
                    break;
                }
                break;
            case 2024715147:
                if (str2.equals("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    c10 = '%';
                    break;
                }
                break;
            case 2062356686:
                if (str2.equals("android.permission.BLUETOOTH_SCAN")) {
                    c10 = '&';
                    break;
                }
                break;
            case 2114579147:
                if (str2.equals("android.permission.ACCESS_MEDIA_LOCATION")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 2133799037:
                if (str2.equals("com.android.voicemail.permission.ADD_VOICEMAIL")) {
                    c10 = '(';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 8:
            case 13:
            case 14:
            case 19:
                return 13;
            case 1:
            case 24:
                return 0;
            case 2:
                return 17;
            case 3:
            case 10:
            case 12:
            case 18:
            case 20:
            case 25:
            case 28:
            case '(':
                return 8;
            case 4:
            case 17:
                return 3;
            case 5:
                return 22;
            case 6:
                return 27;
            case 7:
                return 23;
            case 9:
                return 12;
            case 11:
                return 31;
            case 15:
                return 30;
            case 16:
            case ' ':
                return 15;
            case 21:
                return 9;
            case 22:
            case 31:
            case '$':
                return 2;
            case 23:
                return 1;
            case 26:
                return 33;
            case 27:
                return 32;
            case 29:
                return 34;
            case 30:
                return 29;
            case '!':
                return 24;
            case '\"':
                return 19;
            case '#':
                return 7;
            case '%':
                return 4;
            case '&':
                return 28;
            case '\'':
                return 18;
            default:
                return 20;
        }
    }

    static int g(Activity activity, String str, int i10) {
        if (i10 == -1) {
            return (Build.VERSION.SDK_INT < 23 || !e(activity, str)) ? 0 : 4;
        }
        return 1;
    }

    static void h(Activity activity, int i10) {
        List<String> b10;
        if (activity != null && (b10 = b(activity, i10)) != null) {
            b10.isEmpty();
        }
    }
}
