package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbxw implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final zzg zzc;
    private final zzbyy zzd;
    private String zze = "-1";
    private int zzf = -1;

    zzbxw(Context context, zzg zzg, zzbyy zzbyy) {
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = zzg;
        this.zza = context;
        this.zzd = zzbyy;
    }

    private final void zzb() {
        this.zzc.zzH(true);
        new Bundle();
        throw null;
    }

    private final void zzc(String str, int i10) {
        Context context;
        boolean z10 = false;
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzav)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i10 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) {
            z10 = true;
        }
        this.zzc.zzH(z10);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzgf)).booleanValue() && z10 && (context = this.zza) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        this.zzd.zzt();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r9, java.lang.String r10) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzax
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "-1"
            java.lang.String r2 = "IABTCF_PurposeConsents"
            r3 = -1
            java.lang.String r4 = "gad_has_consent_for_cookies"
            if (r0 == 0) goto L_0x0065
            boolean r0 = com.google.android.gms.internal.ads.zzbxv.zza(r10, r4)
            if (r0 == 0) goto L_0x0034
            int r9 = r9.getInt(r4, r3)
            com.google.android.gms.ads.internal.util.zzg r10 = r8.zzc
            int r10 = r10.zzb()
            if (r9 == r10) goto L_0x002e
            r8.zzb()
        L_0x002e:
            com.google.android.gms.ads.internal.util.zzg r10 = r8.zzc
            r10.zzE(r9)
            return
        L_0x0034:
            java.lang.String r0 = "IABTCF_gdprApplies"
            boolean r0 = com.google.android.gms.internal.ads.zzbxv.zza(r10, r0)
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "IABTCF_TCString"
            boolean r0 = com.google.android.gms.internal.ads.zzbxv.zza(r10, r0)
            if (r0 != 0) goto L_0x004a
            boolean r0 = com.google.android.gms.internal.ads.zzbxv.zza(r10, r2)
            if (r0 == 0) goto L_0x00c8
        L_0x004a:
            java.lang.String r9 = r9.getString(r10, r1)
            if (r9 == 0) goto L_0x005f
            com.google.android.gms.ads.internal.util.zzg r0 = r8.zzc
            java.lang.String r0 = r0.zzn(r10)
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x005f
            r8.zzb()
        L_0x005f:
            com.google.android.gms.ads.internal.util.zzg r0 = r8.zzc
            r0.zzF(r10, r9)
            return
        L_0x0065:
            java.lang.String r0 = r9.getString(r2, r1)
            int r9 = r9.getInt(r4, r3)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            int r5 = r10.hashCode()
            r6 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r7 = 1
            if (r5 == r6) goto L_0x0089
            r2 = -527267622(0xffffffffe09288da, float:-8.447143E19)
            if (r5 == r2) goto L_0x0081
            goto L_0x0091
        L_0x0081:
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L_0x0091
            r10 = 1
            goto L_0x0092
        L_0x0089:
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0091
            r10 = 0
            goto L_0x0092
        L_0x0091:
            r10 = -1
        L_0x0092:
            if (r10 == 0) goto L_0x00b5
            if (r10 == r7) goto L_0x0097
            return
        L_0x0097:
            com.google.android.gms.internal.ads.zzbca r10 = com.google.android.gms.internal.ads.zzbci.zzav
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r10 = r1.zzb(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00c8
            if (r9 == r3) goto L_0x00c8
            int r10 = r8.zzf
            if (r10 == r9) goto L_0x00c8
            r8.zzf = r9
            r8.zzc(r0, r9)
            return
        L_0x00b5:
            boolean r10 = r0.equals(r1)
            if (r10 != 0) goto L_0x00c8
            java.lang.String r10 = r8.zze
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x00c8
            r8.zze = r0
            r8.zzc(r0, r9)
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbxw.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        this.zzb.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.zzb, "gad_has_consent_for_cookies");
        if (((Boolean) zzba.zzc().zzb(zzbci.zzax)).booleanValue()) {
            onSharedPreferenceChanged(this.zzb, "IABTCF_gdprApplies");
            onSharedPreferenceChanged(this.zzb, "IABTCF_TCString");
            return;
        }
        onSharedPreferenceChanged(this.zzb, "IABTCF_PurposeConsents");
    }
}
