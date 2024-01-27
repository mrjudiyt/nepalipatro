package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbty implements zzbua {
    static zzbua zza;
    static zzbua zzb;
    private static final Object zzc = new Object();
    private final Object zzd = new Object();
    private final Context zze;
    private final WeakHashMap zzf = new WeakHashMap();
    private final ExecutorService zzg;
    private final zzcaz zzh;

    protected zzbty(Context context, zzcaz zzcaz) {
        zzfpr.zza();
        this.zzg = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zze = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzh = zzcaz;
    }

    public static zzbua zza(Context context) {
        synchronized (zzc) {
            if (zza == null) {
                if (((Boolean) zzbek.zze.zze()).booleanValue()) {
                    if (!((Boolean) zzba.zzc().zzb(zzbci.zzhB)).booleanValue()) {
                        zza = new zzbty(context, zzcaz.zza());
                    }
                }
                zza = new zzbtz();
            }
        }
        return zza;
    }

    public static zzbua zzb(Context context, zzcaz zzcaz) {
        synchronized (zzc) {
            if (zzb == null) {
                if (((Boolean) zzbek.zze.zze()).booleanValue()) {
                    if (!((Boolean) zzba.zzc().zzb(zzbci.zzhB)).booleanValue()) {
                        zzbty zzbty = new zzbty(context, zzcaz);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzbty.zzd) {
                                zzbty.zzf.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new zzbtx(zzbty, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new zzbtw(zzbty, Thread.getDefaultUncaughtExceptionHandler()));
                        zzb = zzbty;
                    }
                }
                zzb = new zzbtz();
            }
        }
        return zzb;
    }

    public static String zzc(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzd(Throwable th) {
        return zzftl.zzc(zzcam.zzf(zzc(th)));
    }

    /* access modifiers changed from: protected */
    public final void zze(Thread thread, Throwable th) {
        if (th != null) {
            boolean z10 = false;
            boolean z11 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z10 |= zzcam.zzo(stackTraceElement.getClassName());
                    z11 |= zzbty.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (z10 && !z11) {
                zzg(th, "", 1.0f);
            }
        }
    }

    public final void zzf(Throwable th, String str) {
        zzg(th, str, 1.0f);
    }

    public final void zzg(Throwable th, String str, float f10) {
        Throwable th2;
        String str2;
        Throwable th3;
        float f11 = f10;
        Handler handler = zzcam.zza;
        boolean z10 = false;
        if (((Boolean) zzbek.zzf.zze()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable th4 = th; th4 != null; th4 = th4.getCause()) {
                linkedList.push(th4);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th5 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th5.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th5.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z11 = false;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (zzcam.zzo(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z11 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z11) {
                    if (th2 == null) {
                        th3 = new Throwable(th5.getMessage());
                    } else {
                        th3 = new Throwable(th5.getMessage(), th2);
                    }
                    th2 = th3;
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String zzc2 = zzc(th);
            String zzd2 = ((Boolean) zzba.zzc().zzb(zzbci.zziA)).booleanValue() ? zzd(th) : "";
            double d10 = (double) f11;
            int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            double random = Math.random();
            int i11 = i10 > 0 ? (int) (1.0f / f11) : 1;
            if (random < d10) {
                ArrayList<String> arrayList2 = new ArrayList<>();
                try {
                    z10 = Wrappers.packageManager(this.zze).isCallerInstantApp();
                } catch (Throwable th6) {
                    zzcat.zzh("Error fetching instant app info", th6);
                }
                try {
                    str2 = this.zze.getPackageName();
                } catch (Throwable unused) {
                    zzcat.zzj("Cannot obtain package name, proceeding.");
                    str2 = "unknown";
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z10)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
                String str3 = Build.MANUFACTURER;
                String str4 = Build.MODEL;
                if (!str4.startsWith(str3)) {
                    str4 = str3 + " " + str4;
                }
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter(DeviceRequestsHelper.DEVICE_INFO_DEVICE, str4).appendQueryParameter("js", this.zzh.zza).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", zzc2).appendQueryParameter("eids", TextUtils.join(",", zzba.zza().zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "575948185").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i11)).appendQueryParameter("pb_tm", String.valueOf(zzbek.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze))).appendQueryParameter("lite", true != this.zzh.zze ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
                if (!TextUtils.isEmpty(zzd2)) {
                    appendQueryParameter2.appendQueryParameter("hash", zzd2);
                }
                arrayList2.add(appendQueryParameter2.toString());
                for (String zzbtv : arrayList2) {
                    this.zzg.execute(new zzbtv(new zzcay((String) null), zzbtv));
                }
            }
        }
    }
}
