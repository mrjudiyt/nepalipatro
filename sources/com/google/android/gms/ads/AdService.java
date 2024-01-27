package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbou;
import com.google.android.gms.internal.ads.zzcat;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public class AdService extends IntentService {
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdService";

    public AdService() {
        super("AdService");
    }

    /* access modifiers changed from: protected */
    public final void onHandleIntent(Intent intent) {
        try {
            zzay.zza().zzm(this, new zzbou()).zze(intent);
        } catch (RemoteException e10) {
            zzcat.zzg("RemoteException calling handleNotificationIntent: ".concat(e10.toString()));
        }
    }
}
