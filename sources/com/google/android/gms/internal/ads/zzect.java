package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzect extends zzecu {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzcwp zzd;
    private final TelephonyManager zze;
    /* access modifiers changed from: private */
    public final zzecl zzf;
    private int zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbai.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbai zzbai = zzbai.CONNECTING;
        sparseArray.put(ordinal, zzbai);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzbai);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzbai);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbai.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbai zzbai2 = zzbai.DISCONNECTED;
        sparseArray.put(ordinal2, zzbai2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzbai2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzbai2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzbai2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzbai2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbai.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzbai);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzbai);
    }

    zzect(Context context, zzcwp zzcwp, zzecl zzecl, zzech zzech, zzg zzg2) {
        super(zzech, zzg2);
        this.zzc = context;
        this.zzd = zzcwp;
        this.zzf = zzecl;
        this.zze = (TelephonyManager) context.getSystemService("phone");
    }

    static /* bridge */ /* synthetic */ zzazz zza(zzect zzect, Bundle bundle) {
        zzazs zza = zzazz.zza();
        int i10 = bundle.getInt("cnt", -2);
        int i11 = bundle.getInt("gnt", 0);
        int i12 = 2;
        if (i10 == -1) {
            zzect.zzg = 2;
        } else {
            zzect.zzg = 1;
            if (i10 == 0) {
                zza.zzb(2);
            } else if (i10 != 1) {
                zza.zzb(1);
            } else {
                zza.zzb(3);
            }
            switch (i11) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i12 = 3;
                    break;
                case 13:
                    i12 = 5;
                    break;
                default:
                    i12 = 1;
                    break;
            }
            zza.zza(i12);
        }
        return (zzazz) zza.zzal();
    }

    static /* bridge */ /* synthetic */ zzbai zzb(zzect zzect, Bundle bundle) {
        return (zzbai) zzb.get(zzfdz.zza(zzfdz.zza(bundle, DeviceRequestsHelper.DEVICE_INFO_DEVICE), "network").getInt("active_network_state", -1), zzbai.UNSPECIFIED);
    }

    static /* bridge */ /* synthetic */ byte[] zze(zzect zzect, boolean z10, ArrayList arrayList, zzazz zzazz, zzbai zzbai) {
        zzbad zzg2 = zzbae.zzg();
        zzg2.zza(arrayList);
        boolean z11 = false;
        zzg2.zzi(zzg(Settings.Global.getInt(zzect.zzc.getContentResolver(), "airplane_mode_on", 0) != 0));
        zzg2.zzj(zzt.zzq().zzj(zzect.zzc, zzect.zze));
        zzg2.zzf(zzect.zzf.zze());
        zzg2.zze(zzect.zzf.zzb());
        zzg2.zzb(zzect.zzf.zza());
        zzg2.zzc(zzbai);
        zzg2.zzd(zzazz);
        zzg2.zzk(zzect.zzg);
        zzg2.zzl(zzg(z10));
        zzg2.zzh(zzect.zzf.zzd());
        zzg2.zzg(zzt.zzB().currentTimeMillis());
        if (Settings.Global.getInt(zzect.zzc.getContentResolver(), "wifi_on", 0) != 0) {
            z11 = true;
        }
        zzg2.zzm(zzg(z11));
        return ((zzbae) zzg2.zzal()).zzax();
    }

    private static final int zzg(boolean z10) {
        return z10 ? 2 : 1;
    }

    public final void zzd(boolean z10) {
        zzfzt.zzr(this.zzd.zzb(), new zzecs(this, z10), zzcbg.zzf);
    }
}
