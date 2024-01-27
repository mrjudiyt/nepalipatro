package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzcam {
    public static final Handler zza = new zzfps(Looper.getMainLooper());
    private static final String zzb = AdView.class.getName();
    private static final String zzc = InterstitialAd.class.getName();
    private static final String zzd = AdManagerAdView.class.getName();
    private static final String zze = AdManagerInterstitialAd.class.getName();
    private static final String zzf = SearchAdView.class.getName();
    private static final String zzg = AdLoader.class.getName();
    private float zzh = -1.0f;

    private final JSONArray zzA(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        for (Object zzB : collection) {
            zzB(jSONArray, zzB);
        }
        return jSONArray;
    }

    private final void zzB(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(zzh((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(zzi((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(zzA((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(zzg((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    private final void zzC(JSONObject jSONObject, String str, Object obj) {
        Boolean[] boolArr;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzt)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, zzh((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, zzi((Map) obj));
        } else if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), zzA((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, zzA(Arrays.asList((Object[]) obj)));
        } else {
            int i10 = 0;
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    numArr = new Integer[0];
                } else {
                    int length = iArr.length;
                    Integer[] numArr2 = new Integer[length];
                    while (i10 < length) {
                        numArr2[i10] = Integer.valueOf(iArr[i10]);
                        i10++;
                    }
                    numArr = numArr2;
                }
                jSONObject.put(str, zzg(numArr));
            } else if (obj instanceof double[]) {
                double[] dArr2 = (double[]) obj;
                if (dArr2 == null) {
                    dArr = new Double[0];
                } else {
                    int length2 = dArr2.length;
                    Double[] dArr3 = new Double[length2];
                    while (i10 < length2) {
                        dArr3[i10] = Double.valueOf(dArr2[i10]);
                        i10++;
                    }
                    dArr = dArr3;
                }
                jSONObject.put(str, zzg(dArr));
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    lArr = new Long[0];
                } else {
                    int length3 = jArr.length;
                    Long[] lArr2 = new Long[length3];
                    while (i10 < length3) {
                        lArr2[i10] = Long.valueOf(jArr[i10]);
                        i10++;
                    }
                    lArr = lArr2;
                }
                jSONObject.put(str, zzg(lArr));
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    boolArr = new Boolean[0];
                } else {
                    int length4 = zArr.length;
                    Boolean[] boolArr2 = new Boolean[length4];
                    while (i10 < length4) {
                        boolArr2[i10] = Boolean.valueOf(zArr[i10]);
                        i10++;
                    }
                    boolArr = boolArr2;
                }
                jSONObject.put(str, zzg(boolArr));
            } else {
                jSONObject.put(str, obj);
            }
        }
    }

    private static final void zzD(ViewGroup viewGroup, zzq zzq, String str, int i10, int i11) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i10);
            textView.setBackgroundColor(i11);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i10);
            int zzx = zzx(context, 3);
            frameLayout.addView(textView, new FrameLayout.LayoutParams(zzq.zzf - zzx, zzq.zzc - zzx, 17));
            viewGroup.addView(frameLayout, zzq.zzf, zzq.zzc);
        }
    }

    public static int zza(Context context, int i10) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i11 = configuration.orientation;
        if (i10 == 0) {
            i10 = i11;
        }
        if (i10 == i11) {
            return Math.round(((float) displayMetrics.heightPixels) / displayMetrics.density);
        }
        return Math.round(((float) displayMetrics.widthPixels) / displayMetrics.density);
    }

    public static AdSize zzc(Context context, int i10, int i11, int i12) {
        int zza2 = zza(context, i12);
        if (zza2 == -1) {
            return AdSize.INVALID;
        }
        return new AdSize(i10, Math.max(Math.min(i10 > 655 ? Math.round((((float) i10) / 728.0f) * 90.0f) : i10 > 632 ? 81 : i10 > 526 ? Math.round((((float) i10) / 468.0f) * 60.0f) : i10 > 432 ? 68 : Math.round((((float) i10) / 320.0f) * 50.0f), Math.min(90, Math.round(((float) zza2) * 0.15f))), 50));
    }

    public static String zzd() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(byteArray);
                instance.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(instance.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    public static String zze(String str) {
        return zzz(str, "MD5");
    }

    public static String zzf(String str) {
        return zzz(str, "SHA-256");
    }

    public static boolean zzo(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) zzbek.zzd.zze());
    }

    public static final int zzp(DisplayMetrics displayMetrics, int i10) {
        return (int) TypedValue.applyDimension(1, (float) i10, displayMetrics);
    }

    public static final String zzq(StackTraceElement[] stackTraceElementArr, String str) {
        int i10;
        String str2;
        int i11 = 0;
        while (true) {
            i10 = i11 + 1;
            if (i10 >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i11];
            String className = stackTraceElement.getClassName();
            if (!"loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) || (!zzb.equalsIgnoreCase(className) && !zzc.equalsIgnoreCase(className) && !zzd.equalsIgnoreCase(className) && !zze.equalsIgnoreCase(className) && !zzf.equalsIgnoreCase(className) && !zzg.equalsIgnoreCase(className))) {
                i11 = i10;
            }
        }
        str2 = stackTraceElementArr[i10].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                for (int i12 = 2; i12 > 0 && stringTokenizer.hasMoreElements(); i12--) {
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                }
                str = sb.toString();
            }
            if (str2 == null || str2.contains(str)) {
                return null;
            }
            return str2;
        }
        return null;
    }

    public static final boolean zzr() {
        boolean booleanValue = ((Boolean) zzba.zzc().zzb(zzbci.zzks)).booleanValue();
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        if (str.contains("generic") || str.contains("emulator") || (booleanValue && Build.HARDWARE.contains("ranchu"))) {
            return true;
        }
        return false;
    }

    public static final boolean zzs(Context context, int i10) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i10) == 0;
    }

    public static final boolean zzt(Context context) {
        int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        return isGooglePlayServicesAvailable == 0 || isGooglePlayServicesAvailable == 2;
    }

    public static final boolean zzu() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final int zzv(DisplayMetrics displayMetrics, int i10) {
        return Math.round(((float) i10) / displayMetrics.density);
    }

    public static final void zzw(Context context, String str, String str2, Bundle bundle, boolean z10, zzcal zzcal) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            str = GoogleApiAvailabilityLight.getInstance().getApkVersion(context) + ".233702000";
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        zzcal.zza(appendQueryParameter.toString());
    }

    public static final int zzx(Context context, int i10) {
        return zzp(context.getResources().getDisplayMetrics(), i10);
    }

    public static final String zzy(Context context) {
        String str;
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            str = null;
        } else {
            str = Settings.Secure.getString(contentResolver, "android_id");
        }
        if (str == null || zzr()) {
            str = "emulator";
        }
        return zzz(str, "MD5");
    }

    private static String zzz(String str, String str2) {
        int i10 = 0;
        while (i10 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str2);
                instance.update(str.getBytes());
                return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, instance.digest())});
            } catch (NoSuchAlgorithmException unused) {
                i10++;
            } catch (ArithmeticException unused2) {
                return null;
            }
        }
        return null;
    }

    public final int zzb(Context context, int i10) {
        if (this.zzh < 0.0f) {
            synchronized (this) {
                if (this.zzh < 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.zzh = displayMetrics.density;
                }
            }
        }
        return Math.round(((float) i10) / this.zzh);
    }

    /* access modifiers changed from: package-private */
    public final JSONArray zzg(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object zzB : objArr) {
            zzB(jSONArray, zzB);
        }
        return jSONArray;
    }

    public final JSONObject zzh(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            zzC(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject zzi(Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                zzC(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e10) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e10.getMessage())));
        }
    }

    public final JSONObject zzj(Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return zzh(bundle);
        } catch (JSONException e10) {
            zzcat.zzh("Error converting Bundle to JSON", e10);
            return null;
        }
    }

    public final void zzk(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject2.get(next);
            try {
                Object obj2 = jSONObject.get(next);
                if (JSONObject.class.isInstance(obj2) && JSONObject.class.isInstance(obj)) {
                    zzk((JSONObject) obj2, (JSONObject) obj);
                }
            } catch (JSONException unused) {
                jSONObject.put(next, obj);
            }
        }
    }

    public final void zzl(ViewGroup viewGroup, zzq zzq, String str, String str2) {
        if (str2 != null) {
            zzcat.zzj(str2);
        }
        zzD(viewGroup, zzq, str, -65536, -16777216);
    }

    public final void zzm(ViewGroup viewGroup, zzq zzq, String str) {
        zzD(viewGroup, zzq, "Ads by Google", -16777216, -1);
    }

    public final void zzn(Context context, String str, String str2, Bundle bundle, boolean z10) {
        zzw(context, str, "gmob-apps", bundle, true, new zzcaj(this));
    }
}
