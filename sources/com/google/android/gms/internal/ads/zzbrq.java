package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.zzt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbrq extends zzbry {
    private final Map zza;
    /* access modifiers changed from: private */
    public final Context zzb;
    private final String zzc = zze("description");
    private final long zzd = zzd("start_ticks");
    private final long zze = zzd("end_ticks");
    private final String zzf = zze("summary");
    private final String zzg = zze(FirebaseAnalytics.Param.LOCATION);

    public zzbrq(zzcgb zzcgb, Map map) {
        super(zzcgb, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcgb.zzi();
    }

    private final long zzd(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private final String zze(String str) {
        return TextUtils.isEmpty((CharSequence) this.zza.get(str)) ? "" : (String) this.zza.get(str);
    }

    /* access modifiers changed from: package-private */
    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra(ShareConstants.WEB_DIALOG_PARAM_TITLE, this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j10 = this.zzd;
        if (j10 > -1) {
            data.putExtra("beginTime", j10);
        }
        long j11 = this.zze;
        if (j11 > -1) {
            data.putExtra("endTime", j11);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void zzc() {
        if (this.zzb == null) {
            zzg("Activity context is not available.");
            return;
        }
        zzt.zzp();
        if (!new zzbbs(this.zzb).zzb()) {
            zzg("This feature is not available on the device.");
            return;
        }
        zzt.zzp();
        AlertDialog.Builder zzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(this.zzb);
        Resources zzd2 = zzt.zzo().zzd();
        zzJ.setTitle(zzd2 != null ? zzd2.getString(R.string.f7871s5) : "Create calendar event");
        zzJ.setMessage(zzd2 != null ? zzd2.getString(R.string.f7872s6) : "Allow Ad to create a calendar event?");
        zzJ.setPositiveButton(zzd2 != null ? zzd2.getString(R.string.f7869s3) : "Accept", new zzbro(this));
        zzJ.setNegativeButton(zzd2 != null ? zzd2.getString(R.string.f7870s4) : "Decline", new zzbrp(this));
        zzJ.create().show();
    }
}
