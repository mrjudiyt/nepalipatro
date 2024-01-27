package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeuh implements zzetw {
    private final zzgad zza;
    private final Context zzb;

    public zzeuh(zzgad zzgad, Context context) {
        this.zza = zzgad;
        this.zzb = context;
    }

    public final int zza() {
        return 39;
    }

    public final e zzb() {
        return this.zza.zzb(new zzeug(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeuf zzc() {
        int i10;
        boolean z10;
        int i11;
        TelephonyManager telephonyManager = (TelephonyManager) this.zzb.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        zzt.zzp();
        int i12 = -1;
        if (com.google.android.gms.ads.internal.util.zzt.zzz(this.zzb, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.zzb.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i11 = type;
                i12 = ordinal;
            } else {
                i11 = -1;
            }
            z10 = connectivityManager.isActiveNetworkMetered();
            i10 = i12;
        } else {
            i11 = -2;
            z10 = false;
            i10 = -1;
        }
        return new zzeuf(networkOperator, i11, zzt.zzq().zzn(this.zzb), phoneType, z10, i10);
    }
}
