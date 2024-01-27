package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzfeo;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzm extends WebViewClient {
    final /* synthetic */ zzs zza;

    zzm(zzs zzs) {
        this.zza = zzs;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzs zzs = this.zza;
        if (zzs.zzg != null) {
            try {
                zzs.zzg.zzf(zzfeo.zzd(1, (String) null, (zze) null));
            } catch (RemoteException e10) {
                zzcat.zzl("#007 Could not call remote method.", e10);
            }
        }
        zzs zzs2 = this.zza;
        if (zzs2.zzg != null) {
            try {
                zzs2.zzg.zze(0);
            } catch (RemoteException e11) {
                zzcat.zzl("#007 Could not call remote method.", e11);
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.zza.zzq())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            zzs zzs = this.zza;
            if (zzs.zzg != null) {
                try {
                    zzs.zzg.zzf(zzfeo.zzd(3, (String) null, (zze) null));
                } catch (RemoteException e10) {
                    zzcat.zzl("#007 Could not call remote method.", e10);
                }
            }
            zzs zzs2 = this.zza;
            if (zzs2.zzg != null) {
                try {
                    zzs2.zzg.zze(3);
                } catch (RemoteException e11) {
                    zzcat.zzl("#007 Could not call remote method.", e11);
                }
            }
            this.zza.zzV(0);
            return true;
        } else if (str.startsWith("gmsg://scriptLoadFailed")) {
            zzs zzs3 = this.zza;
            if (zzs3.zzg != null) {
                try {
                    zzs3.zzg.zzf(zzfeo.zzd(1, (String) null, (zze) null));
                } catch (RemoteException e12) {
                    zzcat.zzl("#007 Could not call remote method.", e12);
                }
            }
            zzs zzs4 = this.zza;
            if (zzs4.zzg != null) {
                try {
                    zzs4.zzg.zze(0);
                } catch (RemoteException e13) {
                    zzcat.zzl("#007 Could not call remote method.", e13);
                }
            }
            this.zza.zzV(0);
            return true;
        } else if (str.startsWith("gmsg://adResized")) {
            zzs zzs5 = this.zza;
            if (zzs5.zzg != null) {
                try {
                    zzs5.zzg.zzi();
                } catch (RemoteException e14) {
                    zzcat.zzl("#007 Could not call remote method.", e14);
                }
            }
            this.zza.zzV(this.zza.zzb(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            zzs zzs6 = this.zza;
            if (zzs6.zzg != null) {
                try {
                    zzs6.zzg.zzc();
                    this.zza.zzg.zzh();
                } catch (RemoteException e15) {
                    zzcat.zzl("#007 Could not call remote method.", e15);
                }
            }
            zzs.zzw(this.zza, zzs.zzo(this.zza, str));
            return true;
        }
    }
}
