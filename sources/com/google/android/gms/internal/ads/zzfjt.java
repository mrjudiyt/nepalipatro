package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfjt {
    private final zzeio zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfdf zzf;
    private final zzfdg zzg;
    private final Clock zzh;
    private final zzaro zzi;

    public zzfjt(zzeio zzeio, zzcaz zzcaz, String str, String str2, Context context, zzfdf zzfdf, zzfdg zzfdg, Clock clock, zzaro zzaro) {
        this.zza = zzeio;
        this.zzb = zzcaz.zza;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfdf;
        this.zzg = zzfdg;
        this.zzh = clock;
        this.zzi = zzaro;
    }

    public static final List zzf(int i10, int i11, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_mpe@", "2." + i11));
        }
        return arrayList;
    }

    public static final List zzg(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    public static final List zzh(List list, long j10) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_ttr@", Long.toString(j10, 10)));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static String zzi(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return zzcas.zzk() ? "fakeForAdDebugLog" : str;
    }

    private static String zzj(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List zzc(zzfde zzfde, zzfcr zzfcr, List list) {
        return zzd(zzfde, zzfcr, false, "", "", list);
    }

    public final List zzd(zzfde zzfde, zzfcr zzfcr, boolean z10, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z11 = true;
            String zzj = zzj(zzj(zzj((String) it.next(), "@gw_adlocid@", zzfde.zza.zza.zzf), "@gw_adnetrefresh@", true != z10 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES), "@gw_sdkver@", this.zzb);
            if (zzfcr != null) {
                zzj = zzbza.zzc(zzj(zzj(zzj(zzj, "@gw_qdata@", zzfcr.zzA), "@gw_adnetid@", zzfcr.zzz), "@gw_allocid@", zzfcr.zzy), this.zze, zzfcr.zzY);
            }
            String zzj2 = zzj(zzj(zzj(zzj(zzj, "@gw_adnetstatus@", this.zza.zzg()), "@gw_ttr@", Long.toString(this.zza.zza(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z12 = false;
            if (((Boolean) zzba.zzc().zzb(zzbci.zzdm)).booleanValue() && !TextUtils.isEmpty(str)) {
                z12 = true;
            }
            boolean z13 = !TextUtils.isEmpty(str2);
            if (z12) {
                z11 = z13;
            } else if (!z13) {
                arrayList.add(zzj2);
            }
            if (this.zzi.zzf(Uri.parse(zzj2))) {
                Uri.Builder buildUpon = Uri.parse(zzj2).buildUpon();
                if (z12) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z11) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                zzj2 = buildUpon.build().toString();
            }
            arrayList.add(zzj2);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005f A[LOOP:0: B:12:0x0059->B:14:0x005f, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zze(com.google.android.gms.internal.ads.zzfcr r10, java.util.List r11, com.google.android.gms.internal.ads.zzbvw r12) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.common.util.Clock r1 = r9.zzh
            long r1 = r1.currentTimeMillis()
            java.lang.String r3 = r12.zzc()     // Catch:{ RemoteException -> 0x00a8 }
            int r12 = r12.zzb()     // Catch:{ RemoteException -> 0x00a8 }
            java.lang.String r12 = java.lang.Integer.toString(r12)     // Catch:{ RemoteException -> 0x00a8 }
            com.google.android.gms.internal.ads.zzbca r4 = com.google.android.gms.internal.ads.zzbci.zzdn
            com.google.android.gms.internal.ads.zzbcg r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0035
            com.google.android.gms.internal.ads.zzfdg r4 = r9.zzg
            if (r4 != 0) goto L_0x0032
            com.google.android.gms.internal.ads.zzfss r4 = com.google.android.gms.internal.ads.zzfss.zzc()
            goto L_0x003b
        L_0x0032:
            com.google.android.gms.internal.ads.zzfdf r4 = r4.zza
            goto L_0x0037
        L_0x0035:
            com.google.android.gms.internal.ads.zzfdf r4 = r9.zzf
        L_0x0037:
            com.google.android.gms.internal.ads.zzfss r4 = com.google.android.gms.internal.ads.zzfss.zzd(r4)
        L_0x003b:
            com.google.android.gms.internal.ads.zzfjr r5 = com.google.android.gms.internal.ads.zzfjr.zza
            com.google.android.gms.internal.ads.zzfss r5 = r4.zza(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.zzb(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzfjs r7 = com.google.android.gms.internal.ads.zzfjs.zza
            com.google.android.gms.internal.ads.zzfss r4 = r4.zza(r7)
            java.lang.Object r4 = r4.zzb(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r11 = r11.iterator()
        L_0x0059:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x00a7
            java.lang.Object r6 = r11.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = zzj(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = zzj(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = zzj(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = zzj(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = zzj(r6, r7, r12)
            java.lang.String r7 = r9.zzb
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = zzj(r6, r8, r7)
            android.content.Context r7 = r9.zze
            boolean r8 = r10.zzY
            java.lang.String r6 = com.google.android.gms.internal.ads.zzbza.zzc(r6, r7, r8)
            r0.add(r6)
            goto L_0x0059
        L_0x00a7:
            return r0
        L_0x00a8:
            r10 = move-exception
            java.lang.String r11 = "Unable to determine award type and amount."
            com.google.android.gms.internal.ads.zzcat.zzh(r11, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjt.zze(com.google.android.gms.internal.ads.zzfcr, java.util.List, com.google.android.gms.internal.ads.zzbvw):java.util.List");
    }
}
