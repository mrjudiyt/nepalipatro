package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.e;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzenn implements zzetw {
    private final zzgad zza;
    private final zzgad zzb;
    private final Context zzc;
    private final zzfdn zzd;
    private final View zze;

    public zzenn(zzgad zzgad, zzgad zzgad2, Context context, zzfdn zzfdn, ViewGroup viewGroup) {
        this.zza = zzgad;
        this.zzb = zzgad2;
        this.zzc = context;
        this.zzd = zzfdn;
        this.zze = viewGroup;
    }

    private final List zze() {
        ArrayList arrayList = new ArrayList();
        View view = this.zze;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString(ShareConstants.MEDIA_TYPE, parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    public final int zza() {
        return 3;
    }

    public final e zzb() {
        zzbci.zza(this.zzc);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzkg)).booleanValue()) {
            return this.zzb.zzb(new zzenl(this));
        }
        return this.zza.zzb(new zzenm(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeno zzc() {
        return new zzeno(this.zzc, this.zzd.zze, zze());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeno zzd() {
        return new zzeno(this.zzc, this.zzd.zze, zze());
    }
}
