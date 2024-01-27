package com.google.android.gms.ads.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import androidx.browser.customtabs.d;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.internal.ads.zzbca;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbdj;
import com.google.android.gms.internal.ads.zzbek;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzcam;
import com.google.android.gms.internal.ads.zzcas;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcfs;
import com.google.android.gms.internal.ads.zzcgy;
import com.google.android.gms.internal.ads.zzdpw;
import com.google.android.gms.internal.ads.zzfcr;
import com.google.android.gms.internal.ads.zzfcv;
import com.google.android.gms.internal.ads.zzfps;
import com.google.android.gms.internal.ads.zzfsh;
import com.google.android.gms.internal.ads.zzftj;
import com.google.android.gms.internal.ads.zzfzt;
import com.google.android.gms.internal.ads.zzhbq;
import com.google.common.util.concurrent.e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzt {
    public static final zzfps zza = new zzf(Looper.getMainLooper());
    private final AtomicReference zzb = new AtomicReference((Object) null);
    private final AtomicReference zzc = new AtomicReference((Object) null);
    private final AtomicReference zzd = new AtomicReference(new Bundle());
    private final AtomicBoolean zze = new AtomicBoolean();
    /* access modifiers changed from: private */
    public boolean zzf = true;
    private final Object zzg = new Object();
    private String zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private final Executor zzk = Executors.newSingleThreadExecutor();

    public static final boolean zzA(Context context) {
        try {
            return DeviceProperties.isBstar(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean zzB(String str) {
        if (!zzcas.zzk()) {
            return false;
        }
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzeO)).booleanValue()) {
            return false;
        }
        String str2 = (String) zzba.zzc().zzb(zzbci.zzeQ);
        if (!str2.isEmpty()) {
            for (String equals : str2.split(";")) {
                if (equals.equals(str)) {
                    return false;
                }
            }
        }
        String str3 = (String) zzba.zzc().zzb(zzbci.zzeP);
        if (str3.isEmpty()) {
            return true;
        }
        for (String equals2 : str3.split(";")) {
            if (equals2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean zzC(Context context) {
        KeyguardManager zzW;
        if (context == null || (zzW = zzW(context)) == null || !zzW.isKeyguardLocked()) {
            return false;
        }
        return true;
    }

    public static final boolean zzD(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            zzcat.zzh("Error loading class.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzE() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public static final boolean zzF(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                        if (Process.myPid() == next.pid) {
                            if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                                return true;
                            }
                            PowerManager powerManager = (PowerManager) context.getSystemService("power");
                            if (powerManager == null) {
                                return true;
                            }
                            if (powerManager.isScreenOn()) {
                                return false;
                            }
                            return true;
                        }
                    }
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzG(Context context) {
        Bundle zzX = zzX(context);
        return TextUtils.isEmpty(zzY(zzX)) && !TextUtils.isEmpty(zzX.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    public static final boolean zzH(Context context) {
        Window window;
        if (!(!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || window.getDecorView() == null)) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, (Point) null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final void zzI(View view, int i10, MotionEvent motionEvent) {
        int i11;
        String str;
        int i12;
        int i13;
        String str2;
        zzfcr zzD;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (view2 instanceof zzdpw) {
                view2 = ((zzdpw) view2).getChildAt(0);
            }
            if ((view2 instanceof zzg) || (view2 instanceof NativeAdView)) {
                str = "NATIVE";
                i11 = 1;
            } else {
                str = "UNKNOWN";
                i11 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i12 = rect.width();
                i13 = rect.height();
            } else {
                i13 = 0;
                i12 = 0;
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            long zzv = zzv(view2);
            view2.getLocationOnScreen(iArr);
            int i14 = iArr[0];
            int i15 = iArr[1];
            String str3 = "none";
            if (view2 instanceof zzcgy) {
                zzfcv zzP = ((zzcgy) view2).zzP();
                if (zzP != null) {
                    str2 = zzP.zzb;
                    int hashCode = view2.hashCode();
                    view2.setContentDescription(str2 + CertificateUtil.DELIMITER + hashCode);
                    if ((view2 instanceof zzcfs) && (zzD = ((zzcfs) view2).zzD()) != null) {
                        str = zzfcr.zza(zzD.zzb);
                        i11 = zzD.zzf;
                        str3 = zzD.zzG;
                    }
                    zzcat.zzi(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", new Object[]{Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i11), view2.getClass().getName(), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i12), Integer.valueOf(i13), Long.valueOf(zzv), Integer.toString(i10, 2)}));
                }
            }
            str2 = str3;
            str = zzfcr.zza(zzD.zzb);
            i11 = zzD.zzf;
            str3 = zzD.zzG;
            zzcat.zzi(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", new Object[]{Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i11), view2.getClass().getName(), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i12), Integer.valueOf(i13), Long.valueOf(zzv), Integer.toString(i10, 2)}));
        } catch (Exception e10) {
            zzcat.zzh("Failure getting view location.", e10);
        }
    }

    public static final AlertDialog.Builder zzJ(Context context) {
        return new AlertDialog.Builder(context, com.google.android.gms.ads.internal.zzt.zzq().zza());
    }

    public static final void zzK(Context context, String str, String str2) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str2);
        for (String zzca : arrayList) {
            new zzca(context, str, zzca).zzb();
        }
    }

    public static final void zzL(Context context, Throwable th) {
        if (context != null) {
            try {
                if (((Boolean) zzbek.zzb.zze()).booleanValue()) {
                    CrashUtils.addDynamiteErrorToDropBox(context, th);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final String zzM(InputStreamReader inputStreamReader) {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    public static final int zzN(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            zzcat.zzj("Could not parse value:".concat(e10.toString()));
            return 0;
        }
    }

    public static final Map zzO(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String next : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(next)) {
                hashMap.put(next, uri.getQueryParameter(next));
            }
        }
        return hashMap;
    }

    public static final int[] zzP(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        if (window == null || (findViewById = window.findViewById(16908290)) == null) {
            return zzt();
        }
        return new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.findViewById(16908290);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int[] zzQ(android.app.Activity r6) {
        /*
            android.view.Window r0 = r6.getWindow()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0021
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r4)
            if (r0 == 0) goto L_0x0021
            int[] r4 = new int[r1]
            int r5 = r0.getTop()
            r4[r3] = r5
            int r0 = r0.getBottom()
            r4[r2] = r0
            goto L_0x0025
        L_0x0021:
            int[] r4 = zzt()
        L_0x0025:
            int[] r0 = new int[r1]
            com.google.android.gms.internal.ads.zzcam r1 = com.google.android.gms.ads.internal.client.zzay.zzb()
            r5 = r4[r3]
            int r1 = r1.zzb(r6, r5)
            r0[r3] = r1
            com.google.android.gms.internal.ads.zzcam r1 = com.google.android.gms.ads.internal.client.zzay.zzb()
            r3 = r4[r2]
            int r6 = r1.zzb(r6, r3)
            r0[r2] = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzt.zzQ(android.app.Activity):int[]");
    }

    public static final boolean zzR(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z10 = com.google.android.gms.ads.internal.zzt.zzp().zzf || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzn(view);
        long zzv = zzv(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z10)) {
            if (!((Boolean) zzba.zzc().zzb(zzbci.zzbj)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) zzba.zzc().zzb(zzbci.zzjL)).booleanValue()) {
                    return true;
                }
                if (zzv < ((long) ((Integer) zzba.zzc().zzb(zzbci.zzjN)).intValue())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final void zzS(Context context, Intent intent) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzkd)).booleanValue()) {
            try {
                zzaa(context, intent);
            } catch (SecurityException e10) {
                zzcat.zzk("", e10);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "AdUtil.startActivityWithUnknownContext");
            }
        } else {
            zzaa(context, intent);
        }
    }

    public static final void zzT(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzo(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            zzcat.zze("Opening " + uri2 + " in a new browser.");
        } catch (ActivityNotFoundException e10) {
            zzcat.zzh("No browser is found.", e10);
        }
    }

    public static final int[] zzU(Activity activity) {
        int[] zzP = zzP(activity);
        return new int[]{zzay.zzb().zzb(activity, zzP[0]), zzay.zzb().zzb(activity, zzP[1])};
    }

    public static final boolean zzV(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zzR(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, zzW(context));
    }

    private static KeyguardManager zzW(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    private static Bundle zzX(Context context) {
        try {
            return Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            zze.zzb("Error getting metadata", e10);
            return null;
        }
    }

    private static String zzY(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        if (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) {
            return string;
        }
        return "";
    }

    private static boolean zzZ(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static int zza(int i10) {
        if (i10 >= 5000) {
            return i10;
        }
        if (i10 <= 0) {
            return 60000;
        }
        zzcat.zzj("HTTP timeout too low: " + i10 + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    private static final void zzaa(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static List zzd() {
        zzbca zzbca = zzbci.zza;
        List<String> zzb2 = zzba.zza().zzb();
        ArrayList arrayList = new ArrayList();
        for (String zzd2 : zzb2) {
            for (String valueOf : zzftj.zzc(zzfsh.zzc(',')).zzd(zzd2)) {
                try {
                    arrayList.add(Long.valueOf(valueOf));
                } catch (NumberFormatException unused) {
                    zze.zza("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean zzn(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L_0x0009
        L_0x0007:
            r2 = r0
            goto L_0x0013
        L_0x0009:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0007
            android.app.Activity r2 = (android.app.Activity) r2
        L_0x0013:
            r1 = 0
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x002d
            r2 = 1
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzt.zzn(android.view.View):boolean");
    }

    public static final void zzo(Context context, Intent intent) {
        Bundle bundle;
        if (intent != null) {
            if (intent.getExtras() != null) {
                bundle = intent.getExtras();
            } else {
                bundle = new Bundle();
            }
            bundle.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(bundle);
        }
    }

    public static final String zzp(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return zzY(zzX(context));
    }

    static final String zzq() {
        StringBuilder sb = new StringBuilder(UserVerificationMethods.USER_VERIFY_HANDPRINT);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final String zzr() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + " " + str2;
    }

    public static final DisplayMetrics zzs(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    protected static final int[] zzt() {
        return new int[]{0, 0};
    }

    public static final Map zzu(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                HashSet hashSet = new HashSet();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null) {
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        String optString = optJSONArray.optString(i10);
                        if (optString != null) {
                            hashSet.add(optString);
                        }
                    }
                    hashMap.put(next, hashSet);
                }
            }
            return hashMap;
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return hashMap;
        }
    }

    public static final long zzv(View view) {
        float f10;
        int i10;
        float f11 = Float.MAX_VALUE;
        Object obj = view;
        do {
            f10 = 0.0f;
            if (!(obj instanceof View)) {
                break;
            }
            View view2 = (View) obj;
            f11 = Math.min(f11, view2.getAlpha());
            i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            obj = view2.getParent();
        } while (i10 > 0);
        if (f11 >= 0.0f) {
            f10 = f11;
        }
        return (long) Math.round(f10 * 100.0f);
    }

    public static final WebResourceResponse zzw(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzp().zzc(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbq(context).zzb(0, str2, hashMap, (byte[]) null).get(60, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e10) {
            zzcat.zzk("Could not fetch MRAID JS.", e10);
        }
        return null;
    }

    public static final String zzx() {
        Resources zzd2 = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        return zzd2 != null ? zzd2.getString(R.string.f7873s7) : "Test Ad";
    }

    public static final zzbt zzy(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zzcat.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return queryLocalInterface instanceof zzbt ? (zzbt) queryLocalInterface : new zzbr(iBinder);
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean zzz(Context context, String str) {
        Context zza2 = zzbvu.zza(context);
        return Wrappers.packageManager(zza2).checkPermission(str, zza2.getPackageName()) == 0;
    }

    public final e zzb(Uri uri) {
        return zzfzt.zzj(new zzn(uri), this.zzk);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:11|12|(1:14)(3:15|(1:17)(1:18)|19)|20|21|22|(1:24)|25|(1:27)|28|(3:29|30|(1:32))|36|37|38) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0045 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d A[Catch:{ Exception -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b A[Catch:{ Exception -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0083 A[Catch:{ Exception -> 0x0099 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzc(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.zzg
            monitor-enter(r0)
            java.lang.String r1 = r4.zzh     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            return r1
        L_0x0009:
            if (r6 != 0) goto L_0x0011
            java.lang.String r5 = zzq()     // Catch:{ all -> 0x00ba }
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            return r5
        L_0x0011:
            com.google.android.gms.ads.internal.util.zzck r1 = com.google.android.gms.ads.internal.util.zzck.zza()     // Catch:{ Exception -> 0x0045 }
            java.lang.String r2 = r1.zza     // Catch:{ Exception -> 0x0045 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0045 }
            if (r2 != 0) goto L_0x001e
            goto L_0x0041
        L_0x001e:
            boolean r2 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()     // Catch:{ Exception -> 0x0045 }
            if (r2 == 0) goto L_0x0030
            com.google.android.gms.ads.internal.util.zzci r2 = new com.google.android.gms.ads.internal.util.zzci     // Catch:{ Exception -> 0x0045 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0045 }
            java.lang.Object r2 = com.google.android.gms.ads.internal.util.zzch.zza(r5, r2)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0045 }
            goto L_0x003f
        L_0x0030:
            android.content.Context r2 = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(r5)     // Catch:{ Exception -> 0x0045 }
            com.google.android.gms.ads.internal.util.zzcj r3 = new com.google.android.gms.ads.internal.util.zzcj     // Catch:{ Exception -> 0x0045 }
            r3.<init>(r2, r5)     // Catch:{ Exception -> 0x0045 }
            java.lang.Object r2 = com.google.android.gms.ads.internal.util.zzch.zza(r5, r3)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0045 }
        L_0x003f:
            r1.zza = r2     // Catch:{ Exception -> 0x0045 }
        L_0x0041:
            java.lang.String r1 = r1.zza     // Catch:{ Exception -> 0x0045 }
            r4.zzh = r1     // Catch:{ Exception -> 0x0045 }
        L_0x0045:
            java.lang.String r1 = r4.zzh     // Catch:{ all -> 0x00ba }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0053
            java.lang.String r1 = android.webkit.WebSettings.getDefaultUserAgent(r5)     // Catch:{ all -> 0x00ba }
            r4.zzh = r1     // Catch:{ all -> 0x00ba }
        L_0x0053:
            java.lang.String r1 = r4.zzh     // Catch:{ all -> 0x00ba }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0061
            java.lang.String r1 = zzq()     // Catch:{ all -> 0x00ba }
            r4.zzh = r1     // Catch:{ all -> 0x00ba }
        L_0x0061:
            java.lang.String r1 = r4.zzh     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r2.<init>()     // Catch:{ all -> 0x00ba }
            r2.append(r1)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = " (Mobile; "
            r2.append(r1)     // Catch:{ all -> 0x00ba }
            r2.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x00ba }
            r4.zzh = r6     // Catch:{ all -> 0x00ba }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r5 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r5)     // Catch:{ Exception -> 0x0099 }
            boolean r5 = r5.isCallerInstantApp()     // Catch:{ Exception -> 0x0099 }
            if (r5 == 0) goto L_0x00a3
            java.lang.String r5 = r4.zzh     // Catch:{ Exception -> 0x0099 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0099 }
            r6.<init>()     // Catch:{ Exception -> 0x0099 }
            r6.append(r5)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r5 = ";aia"
            r6.append(r5)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x0099 }
            r4.zzh = r5     // Catch:{ Exception -> 0x0099 }
            goto L_0x00a3
        L_0x0099:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzcac r6 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = "AdUtil.getUserAgent"
            r6.zzu(r5, r1)     // Catch:{ all -> 0x00ba }
        L_0x00a3:
            java.lang.String r5 = r4.zzh     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r6.<init>()     // Catch:{ all -> 0x00ba }
            r6.append(r5)     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = ")"
            r6.append(r5)     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x00ba }
            r4.zzh = r5     // Catch:{ all -> 0x00ba }
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            return r5
        L_0x00ba:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzt.zzc(android.content.Context, java.lang.String):java.lang.String");
    }

    public final void zzf(Context context, String str, boolean z10, HttpURLConnection httpURLConnection, boolean z11, int i10) {
        int zza2 = zza(i10);
        zzcat.zzi("HTTP timeout: " + zza2 + " milliseconds.");
        httpURLConnection.setConnectTimeout(zza2);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(zza2);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", zzc(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(Context context, String str, SharedPreferences sharedPreferences, String str2) {
        this.zzd.set(zzad.zzb(context, str));
    }

    public final void zzh(Context context, String str, String str2, Bundle bundle, boolean z10) {
        com.google.android.gms.ads.internal.zzt.zzp();
        bundle.putString(DeviceRequestsHelper.DEVICE_INFO_DEVICE, zzr());
        zzbca zzbca = zzbci.zza;
        bundle.putString("eids", TextUtils.join(",", zzba.zza().zza()));
        if (bundle.isEmpty()) {
            zzcat.zze("Empty or null bundle.");
        } else {
            String str3 = (String) zzba.zzc().zzb(zzbci.zzjI);
            if (!this.zze.getAndSet(true)) {
                this.zzd.set(zzad.zza(context, str3, new zzm(this, context, str3)));
            }
            bundle.putAll((Bundle) this.zzd.get());
        }
        zzay.zzb();
        zzcam.zzw(context, str, "gmob-apps", bundle, true, new zzl(context, str));
    }

    public final boolean zzi(String str) {
        zzbca zzbca = zzbci.zzab;
        return zzZ(str, this.zzb, (String) zzba.zzc().zzb(zzbca));
    }

    public final boolean zzj(String str) {
        zzbca zzbca = zzbci.zzac;
        return zzZ(str, this.zzc, (String) zzba.zzc().zzb(zzbca));
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzk(Context context) {
        if (this.zzj) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbci.zza(context);
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzkc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzq(this, (zzp) null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzq(this, (zzp) null), intentFilter, 4);
        }
        this.zzj = true;
        return true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzl(Context context) {
        if (this.zzi) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbci.zza(context);
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzkc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzs(this, (zzr) null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzs(this, (zzr) null), intentFilter, 4);
        }
        this.zzi = true;
        return true;
    }

    public final int zzm(Context context, Uri uri) {
        int i10;
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            zze.zza("Chrome Custom Tabs can only work with Activity context.");
            i10 = 2;
        } else {
            i10 = 0;
        }
        zzbca zzbca = zzbci.zzet;
        zzbca zzbca2 = zzbci.zzeu;
        if (true == ((Boolean) zzba.zzc().zzb(zzbca)).equals(zzba.zzc().zzb(zzbca2))) {
            i10 = 9;
        }
        if (i10 != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i10;
        }
        if (((Boolean) zzba.zzc().zzb(zzbca)).booleanValue()) {
            zzbdj zzbdj = new zzbdj();
            zzbdj.zze(new zzo(this, zzbdj, context, uri));
            zzbdj.zzb((Activity) context);
        }
        if (!((Boolean) zzba.zzc().zzb(zzbca2)).booleanValue()) {
            return 5;
        }
        d b10 = new d.b().b();
        b10.f1357a.setPackage(zzhbq.zza(context));
        b10.a(context, uri);
        return 5;
    }
}
