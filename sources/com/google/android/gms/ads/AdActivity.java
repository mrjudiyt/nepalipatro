package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzcat;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class AdActivity extends Activity {
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private zzbsv zza;

    private final void zza() {
        zzbsv zzbsv = this.zza;
        if (zzbsv != null) {
            try {
                zzbsv.zzx();
            } catch (RemoteException e10) {
                zzcat.zzl("#007 Could not call remote method.", e10);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i10, int i11, Intent intent) {
        try {
            zzbsv zzbsv = this.zza;
            if (zzbsv != null) {
                zzbsv.zzh(i10, i11, intent);
            }
        } catch (Exception e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
        super.onActivityResult(i10, i11, intent);
    }

    public final void onBackPressed() {
        try {
            zzbsv zzbsv = this.zza;
            if (zzbsv != null && !zzbsv.zzH()) {
                return;
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
        super.onBackPressed();
        try {
            zzbsv zzbsv2 = this.zza;
            if (zzbsv2 != null) {
                zzbsv2.zzi();
            }
        } catch (RemoteException e11) {
            zzcat.zzl("#007 Could not call remote method.", e11);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbsv zzbsv = this.zza;
            if (zzbsv != null) {
                zzbsv.zzk(ObjectWrapper.wrap(configuration));
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzbsv zzo = zzay.zza().zzo(this);
        this.zza = zzo;
        if (zzo != null) {
            try {
                zzo.zzl(bundle);
            } catch (RemoteException e10) {
                zzcat.zzl("#007 Could not call remote method.", e10);
                finish();
            }
        } else {
            zzcat.zzl("#007 Could not call remote method.", (Throwable) null);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        try {
            zzbsv zzbsv = this.zza;
            if (zzbsv != null) {
                zzbsv.zzm();
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        try {
            zzbsv zzbsv = this.zza;
            if (zzbsv != null) {
                zzbsv.zzo();
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
            finish();
        }
        super.onPause();
    }

    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        try {
            zzbsv zzbsv = this.zza;
            if (zzbsv != null) {
                zzbsv.zzp(i10, strArr, iArr);
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestart() {
        super.onRestart();
        try {
            zzbsv zzbsv = this.zza;
            if (zzbsv != null) {
                zzbsv.zzq();
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        try {
            zzbsv zzbsv = this.zza;
            if (zzbsv != null) {
                zzbsv.zzr();
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbsv zzbsv = this.zza;
            if (zzbsv != null) {
                zzbsv.zzs(bundle);
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        try {
            zzbsv zzbsv = this.zza;
            if (zzbsv != null) {
                zzbsv.zzt();
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        try {
            zzbsv zzbsv = this.zza;
            if (zzbsv != null) {
                zzbsv.zzu();
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
            finish();
        }
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbsv zzbsv = this.zza;
            if (zzbsv != null) {
                zzbsv.zzv();
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void setContentView(int i10) {
        super.setContentView(i10);
        zza();
    }

    public final void setContentView(View view) {
        super.setContentView(view);
        zza();
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}
