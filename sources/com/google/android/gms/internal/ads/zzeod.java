package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeod implements zzetv {
    public final zzq zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final boolean zzi;

    public zzeod(zzq zzq, String str, boolean z10, String str2, float f10, int i10, int i11, String str3, boolean z11) {
        Preconditions.checkNotNull(zzq, "the adSize must not be null");
        this.zza = zzq;
        this.zzb = str;
        this.zzc = z10;
        this.zzd = str2;
        this.zze = f10;
        this.zzf = i10;
        this.zzg = i11;
        this.zzh = str3;
        this.zzi = z11;
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfdz.zzf(bundle, "smart_w", "full", this.zza.zze == -1);
        zzfdz.zzf(bundle, "smart_h", "auto", this.zza.zzb == -2);
        zzfdz.zzg(bundle, "ene", true, this.zza.zzj);
        zzfdz.zzf(bundle, "rafmt", "102", this.zza.zzm);
        zzfdz.zzf(bundle, "rafmt", "103", this.zza.zzn);
        zzfdz.zzf(bundle, "rafmt", "105", this.zza.zzo);
        zzfdz.zzg(bundle, "inline_adaptive_slot", true, this.zzi);
        zzfdz.zzg(bundle, "interscroller_slot", true, this.zza.zzo);
        zzfdz.zzc(bundle, "format", this.zzb);
        zzfdz.zzf(bundle, "fluid", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, this.zzc);
        zzfdz.zzf(bundle, "sz", this.zzd, !TextUtils.isEmpty(this.zzd));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        zzfdz.zzf(bundle, "sc", this.zzh, !TextUtils.isEmpty(this.zzh));
        ArrayList arrayList = new ArrayList();
        zzq[] zzqArr = this.zza.zzg;
        if (zzqArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, this.zza.zzb);
            bundle2.putInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, this.zza.zze);
            bundle2.putBoolean("is_fluid_height", this.zza.zzi);
            arrayList.add(bundle2);
        } else {
            for (zzq zzq : zzqArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzq.zzi);
                bundle3.putInt(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, zzq.zzb);
                bundle3.putInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, zzq.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
