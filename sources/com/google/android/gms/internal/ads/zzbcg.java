package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbcg implements SharedPreferences.OnSharedPreferenceChangeListener {
    volatile boolean zza = false;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    /* access modifiers changed from: private */
    public SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private Context zzg;
    private JSONObject zzh = new JSONObject();

    private final void zzf() {
        if (this.zze != null) {
            try {
                this.zzh = new JSONObject((String) zzbcn.zza(new zzbce(this)));
            } catch (JSONException unused) {
            }
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzf();
        }
    }

    public final Object zzb(zzbca zzbca) {
        if (!this.zzc.block(5000)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null) {
            synchronized (this.zzb) {
                if (this.zzd) {
                    if (this.zze == null) {
                    }
                }
                Object zzm = zzbca.zzm();
                return zzm;
            }
        }
        if (zzbca.zze() == 2) {
            Bundle bundle = this.zzf;
            if (bundle == null) {
                return zzbca.zzm();
            }
            return zzbca.zzb(bundle);
        } else if (zzbca.zze() != 1 || !this.zzh.has(zzbca.zzn())) {
            return zzbcn.zza(new zzbcd(this, zzbca));
        } else {
            return zzbca.zza(this.zzh);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzc(zzbca zzbca) {
        return zzbca.zzc(this.zze);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String zzd() {
        return this.zze.getString("flag_configuration", "{}");
    }

    public final void zze(Context context) {
        if (!this.zzd) {
            synchronized (this.zzb) {
                if (!this.zzd) {
                    if (!this.zza) {
                        this.zza = true;
                    }
                    Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
                    this.zzg = applicationContext;
                    try {
                        this.zzf = Wrappers.packageManager(applicationContext).getApplicationInfo(this.zzg.getPackageName(), 128).metaData;
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    }
                    try {
                        Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                        if (!(remoteContext == null && (remoteContext = context.getApplicationContext()) == null)) {
                            context = remoteContext;
                        }
                        if (context != null) {
                            zzba.zzb();
                            SharedPreferences zza2 = zzbcc.zza(context);
                            this.zze = zza2;
                            if (zza2 != null) {
                                zza2.registerOnSharedPreferenceChangeListener(this);
                            }
                            zzbet.zzc(new zzbcf(this));
                            zzf();
                            this.zzd = true;
                            this.zza = false;
                            this.zzc.open();
                        }
                    } finally {
                        this.zza = false;
                        this.zzc.open();
                    }
                }
            }
        }
    }
}
