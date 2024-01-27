package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import androidx.core.app.l;
import androidx.core.app.o;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzedz extends zzbsn {
    private final Context zza;
    private final zzdso zzb;
    private final zzcay zzc;
    private final zzedo zzd;
    private final zzfib zze;
    private String zzf;
    private String zzg;

    public zzedz(Context context, zzedo zzedo, zzcay zzcay, zzdso zzdso, zzfib zzfib) {
        this.zza = context;
        this.zzb = zzdso;
        this.zzc = zzcay;
        this.zzd = zzedo;
        this.zze = zzfib;
    }

    public static void zzc(Context context, zzdso zzdso, zzfib zzfib, zzedo zzedo, String str, String str2, Map map) {
        String str3;
        String str4 = true != zzt.zzo().zzx(context) ? "offline" : "online";
        if (((Boolean) zzba.zzc().zzb(zzbci.zzir)).booleanValue() || zzdso == null) {
            zzfia zzb2 = zzfia.zzb(str2);
            zzb2.zza("gqi", str);
            zzb2.zza("device_connectivity", str4);
            zzb2.zza("event_timestamp", String.valueOf(zzt.zzB().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zzb2.zza((String) entry.getKey(), (String) entry.getValue());
            }
            str3 = zzfib.zza(zzb2);
        } else {
            zzdsn zza2 = zzdso.zza();
            zza2.zzb("gqi", str);
            zza2.zzb(NativeProtocol.WEB_DIALOG_ACTION, str2);
            zza2.zzb("device_connectivity", str4);
            zza2.zzb("event_timestamp", String.valueOf(zzt.zzB().currentTimeMillis()));
            for (Map.Entry entry2 : map.entrySet()) {
                zza2.zzb((String) entry2.getKey(), (String) entry2.getValue());
            }
            str3 = zza2.zzf();
        }
        zzedo.zzd(new zzedq(zzt.zzB().currentTimeMillis(), str, str3, 2));
    }

    private static String zzo(int i10, String str) {
        Resources zzd2 = zzt.zzo().zzd();
        if (zzd2 == null) {
            return str;
        }
        return zzd2.getString(i10);
    }

    private final void zzp(String str, String str2, Map map) {
        zzc(this.zza, this.zzb, this.zze, this.zzd, str, str2, map);
    }

    private final void zzq() {
        try {
            zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzy(this.zza).zzf(ObjectWrapper.wrap(this.zza), this.zzg, this.zzf)) {
                return;
            }
        } catch (RemoteException e10) {
            zzcat.zzh("Failed to schedule offline notification poster.", e10);
        }
        this.zzd.zzc(this.zzf);
        zzp(this.zzf, "offline_notification_worker_not_scheduled", zzfvv.zzd());
    }

    private final void zzr(Activity activity, zzl zzl) {
        zzt.zzp();
        if (o.b(activity).a()) {
            zzq();
            zzs(activity, zzl);
        } else if (Build.VERSION.SDK_INT < 33) {
            zzt.zzp();
            AlertDialog.Builder zzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(activity);
            zzJ.setTitle(zzo(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzo(R.string.notifications_permission_confirm, "Allow"), new zzedr(this, activity, zzl)).setNegativeButton(zzo(R.string.notifications_permission_decline, "Don't allow"), new zzeds(this, zzl)).setOnCancelListener(new zzedt(this, zzl));
            zzJ.create().show();
            zzp(this.zzf, "rtsdi", zzfvv.zzd());
        } else {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            zzp(this.zzf, "asnpdi", zzfvv.zzd());
        }
    }

    private final void zzs(Activity activity, zzl zzl) {
        String zzo = zzo(R.string.offline_opt_in_confirmation, "You'll get a notification with the link when you're back online");
        zzt.zzp();
        AlertDialog.Builder zzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(activity);
        zzJ.setMessage(zzo).setOnCancelListener(new zzedx(zzl));
        AlertDialog create = zzJ.create();
        create.show();
        Timer timer = new Timer();
        timer.schedule(new zzedy(this, create, timer, zzl), 3000);
    }

    private static final PendingIntent zzt(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setClassName(context, AdService.CLASS_NAME);
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra(ShareConstants.MEDIA_URI, str3);
        return zzfqb.zza(context, 0, intent, zzfqb.zza | 1073741824, 0);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Activity activity, zzl zzl, DialogInterface dialogInterface, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzp(this.zzf, "rtsdc", hashMap);
        activity.startActivity(zzt.zzq().zzg(activity));
        zzq();
        if (zzl != null) {
            zzl.zzb();
        }
    }

    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra(ShareConstants.MEDIA_URI);
            boolean zzx = zzt.zzo().zzx(this.zza);
            HashMap hashMap = new HashMap();
            char c10 = 2;
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                if (true == zzx) {
                    c10 = 1;
                }
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Intent launchIntentForPackage = this.zza.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    this.zza.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            zzp(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.zzd.getWritableDatabase();
                if (c10 == 1) {
                    this.zzd.zzg(writableDatabase, this.zzc, stringExtra2);
                } else {
                    zzedo.zzi(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e10) {
                zzcat.zzg("Failed to get writable offline buffering database: ".concat(e10.toString()));
            }
        }
    }

    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        int i10 = 0;
        while (i10 < strArr.length) {
            if (!strArr[i10].equals("android.permission.POST_NOTIFICATIONS")) {
                i10++;
            } else {
                zzeeb zzeeb = (zzeeb) ObjectWrapper.unwrap(iObjectWrapper);
                Activity zza2 = zzeeb.zza();
                zzl zzb2 = zzeeb.zzb();
                HashMap hashMap = new HashMap();
                if (iArr[i10] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    zzq();
                    zzs(zza2, zzb2);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (zzb2 != null) {
                        zzb2.zzb();
                    }
                }
                zzp(this.zzf, "asnpdc", hashMap);
                return;
            }
        }
    }

    public final void zzg(IObjectWrapper iObjectWrapper) {
        zzeeb zzeeb = (zzeeb) ObjectWrapper.unwrap(iObjectWrapper);
        Activity zza2 = zzeeb.zza();
        zzl zzb2 = zzeeb.zzb();
        this.zzf = zzeeb.zzc();
        this.zzg = zzeeb.zzd();
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzik)).booleanValue()) {
            zzp(this.zzf, "dialog_impression", zzfvv.zzd());
            zzt.zzp();
            AlertDialog.Builder zzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(zza2);
            zzJ.setTitle(zzo(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzo(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzo(R.string.offline_opt_in_confirm, "OK"), new zzedu(this, zza2, zzb2)).setNegativeButton(zzo(R.string.offline_opt_in_decline, "No thanks"), new zzedv(this, zzb2)).setOnCancelListener(new zzedw(this, zzb2));
            zzJ.create().show();
            return;
        }
        zzr(zza2, zzb2);
    }

    public final void zzh() {
        this.zzd.zze(new zzedh(this.zzc));
    }

    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) {
        String str3;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzt.zzq().zzh(context, "offline_notification_channel", "AdMob Offline Notifications");
        l.e J = new l.e(context, "offline_notification_channel").r(zzo(R.string.offline_notification_title, "View the ad you saved when you were offline")).q(zzo(R.string.offline_notification_text, "Tap to open ad")).l(true).v(zzt(context, "offline_notification_dismissed", str2, str)).p(zzt(context, "offline_notification_clicked", str2, str)).J(context.getApplicationInfo().icon);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap hashMap = new HashMap();
        try {
            notificationManager.notify(str2, 54321, J.c());
            str3 = "offline_notification_impression";
        } catch (IllegalArgumentException e10) {
            hashMap.put("notification_not_shown_reason", e10.getMessage());
            str3 = "offline_notification_failed";
        }
        zzp(str2, str3, hashMap);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(zzl zzl, DialogInterface dialogInterface, int i10) {
        this.zzd.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzp(this.zzf, "rtsdc", hashMap);
        if (zzl != null) {
            zzl.zzb();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(zzl zzl, DialogInterface dialogInterface) {
        this.zzd.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzp(this.zzf, "rtsdc", hashMap);
        if (zzl != null) {
            zzl.zzb();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(Activity activity, zzl zzl, DialogInterface dialogInterface, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzp(this.zzf, "dialog_click", hashMap);
        zzr(activity, zzl);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(zzl zzl, DialogInterface dialogInterface, int i10) {
        this.zzd.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzp(this.zzf, "dialog_click", hashMap);
        if (zzl != null) {
            zzl.zzb();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(zzl zzl, DialogInterface dialogInterface) {
        this.zzd.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzp(this.zzf, "dialog_click", hashMap);
        if (zzl != null) {
            zzl.zzb();
        }
    }
}
