package np.com.nepalipatro.helpers;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.Service;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.format.DateFormat;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.widget.Toast;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import g9.d;
import java.io.File;
import java.nio.charset.Charset;
import java.text.DateFormatSymbols;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.R;
import np.com.nepalipatro.helpers.e;
import np.com.nepalipatro.helpers.k;
import np.com.nepalipatro.notification.AppNotifications;
import np.com.nepalipatro.notification.CalendarStickyNotificationService;
import np.com.nepalipatro.widget.CalendarWidget;
import np.com.nepalipatro.widget.Widget1x1;
import np.com.nepalipatro.widget.Widget1x4;
import np.com.nepalipatro.widget.Widget2x4;
import org.json.JSONObject;

/* compiled from: Utils.kt */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16129a = new a((g) null);

    /* compiled from: Utils.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void A(Context context, Class<?> cls) {
            m.f(context, "context");
            m.f(cls, "widget");
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, cls));
            if (appWidgetIds.length > 0) {
                Intent intent = new Intent(context, cls);
                intent.setAction(d.f15947a.c());
                intent.putExtra("appWidgetIds", appWidgetIds);
                context.sendBroadcast(intent);
            }
        }

        public final String a(String str, String str2) {
            m.f(str, "password");
            m.f(str2, "encrypted");
            try {
                byte[] decode = Base64.decode(str2, 0);
                m.e(decode, "b64");
                Charset charset = d.f14759b;
                JSONObject jSONObject = new JSONObject(new String(decode, charset));
                String string = jSONObject.getString("iv");
                String string2 = jSONObject.getString("value");
                byte[] decode2 = Base64.decode(str, 0);
                m.e(decode2, "decode(password, Base64.DEFAULT)");
                SecretKeySpec secretKeySpec = new SecretKeySpec(decode2, "AES");
                Cipher instance = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                instance.init(2, secretKeySpec, new IvParameterSpec(Base64.decode(string, 0)));
                byte[] doFinal = instance.doFinal(Base64.decode(string2, 0));
                m.e(doFinal, "byteArray");
                return new String(doFinal, charset);
            } catch (Exception unused) {
                return str2;
            }
        }

        public final String b(String str) {
            m.f(str, "format");
            if (m.a(str, "")) {
                str = "yyyyMMdd";
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, new Locale("en_US"));
            simpleDateFormat.setTimeZone(e.f15961a.T());
            String format = simpleDateFormat.format(new Date());
            m.e(format, "dateFormat.format(Date())");
            return format;
        }

        public final int c() {
            return Build.VERSION.SDK_INT;
        }

        public final e.a.b d(Context context) {
            m.f(context, "context");
            k.a aVar = k.f16077a;
            if (p.m(aVar.w(context, aVar.h(), "ne"), "en", true)) {
                return e.a.b.f16020i;
            }
            return e.a.b.NEPALI;
        }

        public final Locale e(Context context) {
            m.f(context, "context");
            k.a aVar = k.f16077a;
            if (m.a(aVar.w(context, aVar.h(), "ne"), "ne")) {
                return new Locale("ne", "");
            }
            return new Locale("en_US");
        }

        public final String f(int i10, boolean z10) {
            try {
                String str = i10 + "";
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                int i11 = 0;
                while (i11 < length) {
                    String[] i02 = e.f15961a.i0();
                    int i12 = i11 + 1;
                    String substring = str.substring(i11, i12);
                    m.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb.append(i02[Integer.parseInt(substring)]);
                    i11 = i12;
                }
                String sb2 = sb.toString();
                m.e(sb2, "nepNumString.toString()");
                return sb2;
            } catch (Exception e10) {
                if (g.f16048a.a()) {
                    e10.printStackTrace();
                }
                return i10 + "";
            }
        }

        public final CharSequence g(Context context, String str, Locale locale) {
            m.f(context, "context");
            m.f(str, "format");
            m.f(locale, "locale");
            Calendar instance = Calendar.getInstance();
            instance.setTimeZone(e.f15961a.T());
            instance.setTimeInMillis(System.currentTimeMillis());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
            simpleDateFormat.setCalendar(instance);
            String[] amPmStrings = DateFormatSymbols.getInstance(locale).getAmPmStrings();
            boolean z10 = false;
            String str2 = amPmStrings[0];
            m.e(str2, "ampm[0]");
            Locale locale2 = Locale.ROOT;
            m.e(locale2, "ROOT");
            String upperCase = str2.toUpperCase(locale2);
            m.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
            String str3 = amPmStrings[1];
            m.e(str3, "ampm[1]");
            m.e(locale2, "ROOT");
            String upperCase2 = str3.toUpperCase(locale2);
            m.e(upperCase2, "this as java.lang.String).toUpperCase(locale)");
            String format = simpleDateFormat.format(instance.getTime());
            m.e(format, "dateFormat.format(mCalendar.time)");
            if (DateFormat.is24HourFormat(context) || !q.y(str, ":mm", false, 2, (Object) null)) {
                return format;
            }
            if (instance.get(9) == 0) {
                z10 = true;
            }
            if (z10) {
                return format + ' ' + upperCase;
            }
            return format + ' ' + upperCase2;
        }

        public final String h(Integer num, Locale locale, Boolean bool) {
            Long l10;
            m.f(locale, "locale");
            if (Build.VERSION.SDK_INT >= 21 || !m.a(locale.getLanguage(), "ne")) {
                NumberFormat instance = NumberFormat.getInstance(locale);
                m.c(bool);
                instance.setGroupingUsed(bool.booleanValue());
                String str = null;
                if (num != null) {
                    try {
                        l10 = Long.valueOf((long) num.intValue());
                    } catch (Exception unused) {
                        return num + "";
                    }
                } else {
                    l10 = null;
                }
                String format = instance.format(l10);
                m.e(format, "nf_np.format(number?.toLong())");
                if (p.m(locale.getLanguage(), "ne", true)) {
                    if (num != null) {
                        str = num.toString();
                    }
                    if (p.m(format, str, true)) {
                        m.c(num);
                        return f(num.intValue(), bool.booleanValue());
                    }
                }
                return format;
            }
            m.c(num);
            int intValue = num.intValue();
            m.c(bool);
            return f(intValue, bool.booleanValue());
        }

        public final PendingIntent i(Context context, Intent intent, String str) {
            m.f(context, "context");
            m.f(intent, "intent");
            m.f(str, NativeProtocol.WEB_DIALOG_ACTION);
            Intent intent2 = new Intent(str);
            try {
                if (intent.getExtras() != null) {
                    Bundle extras = intent.getExtras();
                    m.c(extras);
                    intent2.putExtras(extras);
                }
            } catch (Exception e10) {
                if (g.f16048a.a()) {
                    e10.printStackTrace();
                }
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(context, l.f16129a.u(1, 1000000), intent2, 67108864);
            m.e(broadcast, "getBroadcast(context, Ut…ingIntent.FLAG_IMMUTABLE)");
            return broadcast;
        }

        public final String j(Context context) {
            SharedPreferences sharedPreferences = context != null ? context.getSharedPreferences("FlutterSharedPreferences", 0) : null;
            if (sharedPreferences != null) {
                return sharedPreferences.getString("flutter.PREFERRED_THEME", e.f15961a.a());
            }
            return null;
        }

        public final String k(Context context, Locale locale, int i10) {
            m.f(context, "context");
            m.f(locale, "locale");
            if (Build.VERSION.SDK_INT >= 17) {
                Configuration configuration = new Configuration(context.getResources().getConfiguration());
                configuration.setLocale(locale);
                return context.createConfigurationContext(configuration).getText(i10).toString();
            }
            Resources resources = context.getResources();
            Configuration configuration2 = resources.getConfiguration();
            Locale locale2 = configuration2.locale;
            configuration2.locale = locale;
            resources.updateConfiguration(configuration2, (DisplayMetrics) null);
            String string = resources.getString(i10);
            m.e(string, "resources.getString(resId)");
            configuration2.locale = locale2;
            resources.updateConfiguration(configuration2, (DisplayMetrics) null);
            return string;
        }

        public final String l() {
            return "";
        }

        public final boolean m(Context context, String str) {
            m.f(context, "context");
            m.f(str, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            try {
                PackageManager packageManager = context.getPackageManager();
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
                if (launchIntentForPackage == null) {
                    return false;
                }
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(launchIntentForPackage, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
                m.e(queryIntentActivities, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
                if (queryIntentActivities.size() > 0) {
                    return true;
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        public final boolean n(Context context, String str) {
            m.f(context, "context");
            m.f(str, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            try {
                PackageManager packageManager = context.getPackageManager();
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
                if (launchIntentForPackage == null) {
                    return false;
                }
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(launchIntentForPackage, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
                m.e(queryIntentActivities, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
                if (queryIntentActivities.size() > 0) {
                    return true;
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        public final boolean o(Context context) {
            m.f(context, "context");
            Object systemService = context.getSystemService("power");
            m.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            PowerManager powerManager = (PowerManager) systemService;
            if (Build.VERSION.SDK_INT >= 20) {
                return powerManager.isInteractive();
            }
            return powerManager.isScreenOn();
        }

        public final void p(Context context, String str) {
            m.f(context, "context");
            m.f(str, "link");
            try {
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(268435456);
                }
                context.startActivity(launchIntentForPackage);
            } catch (Exception unused) {
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:3|4) */
        /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
            r5 = "https://play.google.com/store/apps/details?id=" + r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x004f, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0050, code lost:
            r4.printStackTrace();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0026 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void q(android.content.Context r4, java.lang.String r5) {
            /*
                r3 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.m.f(r4, r0)
                java.lang.String r0 = "link"
                kotlin.jvm.internal.m.f(r5, r0)
                android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch:{ Exception -> 0x0026 }
                java.lang.String r1 = "com.android.vending"
                r2 = 0
                r0.getPackageInfo(r1, r2)     // Catch:{ Exception -> 0x0026 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0026 }
                r0.<init>()     // Catch:{ Exception -> 0x0026 }
                java.lang.String r1 = "market://details?id="
                r0.append(r1)     // Catch:{ Exception -> 0x0026 }
                r0.append(r5)     // Catch:{ Exception -> 0x0026 }
                java.lang.String r5 = r0.toString()     // Catch:{ Exception -> 0x0026 }
                goto L_0x0037
            L_0x0026:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004f }
                r0.<init>()     // Catch:{ Exception -> 0x004f }
                java.lang.String r1 = "https://play.google.com/store/apps/details?id="
                r0.append(r1)     // Catch:{ Exception -> 0x004f }
                r0.append(r5)     // Catch:{ Exception -> 0x004f }
                java.lang.String r5 = r0.toString()     // Catch:{ Exception -> 0x004f }
            L_0x0037:
                android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x004f }
                java.lang.String r1 = "android.intent.action.VIEW"
                r0.<init>(r1)     // Catch:{ Exception -> 0x004f }
                r1 = 335577088(0x14008000, float:6.487592E-27)
                r0.setFlags(r1)     // Catch:{ Exception -> 0x004f }
                android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x004f }
                r0.setData(r5)     // Catch:{ Exception -> 0x004f }
                r4.startActivity(r0)     // Catch:{ Exception -> 0x004f }
                goto L_0x0053
            L_0x004f:
                r4 = move-exception
                r4.printStackTrace()
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: np.com.nepalipatro.helpers.l.a.q(android.content.Context, java.lang.String):void");
        }

        public final void r(Activity activity, String str) {
            m.f(activity, "activity");
            m.f(str, "pkg");
            try {
                activity.getPackageManager().getPackageInfo("com.android.vending", 0);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(268435456);
                intent.setData(Uri.parse("market://details?id=" + str));
                activity.startActivity(intent);
            } catch (Exception unused) {
            }
        }

        public final void s(Activity activity, String str) {
            m.f(activity, "activity");
            m.f(str, "pkgName");
            try {
                activity.startActivity(activity.getPackageManager().getLaunchIntentForPackage(str));
            } catch (Exception e10) {
                e10.printStackTrace();
                Toast.makeText(activity, activity.getString(R.string.msg_something_snapped), 1).show();
            }
        }

        public final String t(int i10) {
            if (i10 > 9) {
                return String.valueOf(i10);
            }
            StringBuilder sb = new StringBuilder();
            sb.append('0');
            sb.append(i10);
            return sb.toString();
        }

        public final int u(int i10, int i11) {
            return new Random().nextInt((i11 - i10) + 1) + i10;
        }

        public final String v(File file) {
            m.f(file, "file");
            return file.exists() ? h.b(file, (Charset) null, 1, (Object) null) : "";
        }

        public final void w(Context context) {
            m.f(context, "context");
            AlarmHelper.f15890a.q(context);
        }

        public final void x(Context context) {
            m.f(context, "context");
            if (m.a(AppNotifications.f16131h.o(), Boolean.TRUE)) {
                k.a aVar = k.f16077a;
                if (!aVar.c(context, aVar.u(), true)) {
                    new AppNotifications(context, (Service) null, 2, (g) null).u(true);
                    return;
                }
                return;
            }
            k.a aVar2 = k.f16077a;
            if (!aVar2.c(context, aVar2.u(), true) && aVar2.c(context, aVar2.o(), false)) {
                new AppNotifications(context, (Service) null, 2, (g) null).u(true);
            }
        }

        public final void y(Context context) {
            m.f(context, "context");
            Intent intent = new Intent(context, CalendarStickyNotificationService.class);
            k.a aVar = k.f16077a;
            if (!aVar.c(context, aVar.u(), true)) {
                context.stopService(intent);
            } else if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
        }

        public final void z(Context context) {
            m.f(context, "context");
            A(context, Widget1x1.class);
            A(context, Widget1x4.class);
            A(context, Widget2x4.class);
            A(context, CalendarWidget.class);
        }
    }
}
