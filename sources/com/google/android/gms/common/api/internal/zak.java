package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zak extends zap {
    private final SparseArray<zaj> zad = new SparseArray<>();

    private zak(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.getInstance());
        this.mLifecycleFragment.addCallback("AutoManageHelper", this);
    }

    public static zak zaa(LifecycleActivity lifecycleActivity) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(lifecycleActivity);
        zak zak = (zak) fragment.getCallbackOrNull("AutoManageHelper", zak.class);
        if (zak != null) {
            return zak;
        }
        return new zak(fragment);
    }

    private final zaj zai(int i10) {
        if (this.zad.size() <= i10) {
            return null;
        }
        SparseArray<zaj> sparseArray = this.zad;
        return sparseArray.get(sparseArray.keyAt(i10));
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i10 = 0; i10 < this.zad.size(); i10++) {
            zaj zai = zai(i10);
            if (zai != null) {
                printWriter.append(str).append("GoogleApiClient #").print(zai.zaa);
                printWriter.println(CertificateUtil.DELIMITER);
                zai.zab.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        boolean z10 = this.zaa;
        String valueOf = String.valueOf(this.zad);
        StringBuilder sb = new StringBuilder(valueOf.length() + 14);
        sb.append("onStart ");
        sb.append(z10);
        sb.append(" ");
        sb.append(valueOf);
        if (this.zab.get() == null) {
            for (int i10 = 0; i10 < this.zad.size(); i10++) {
                zaj zai = zai(i10);
                if (zai != null) {
                    zai.zab.connect();
                }
            }
        }
    }

    public final void onStop() {
        super.onStop();
        for (int i10 = 0; i10 < this.zad.size(); i10++) {
            zaj zai = zai(i10);
            if (zai != null) {
                zai.zab.disconnect();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zab(ConnectionResult connectionResult, int i10) {
        if (i10 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        zaj zaj = this.zad.get(i10);
        if (zaj != null) {
            zae(i10);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = zaj.zac;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zac() {
        for (int i10 = 0; i10 < this.zad.size(); i10++) {
            zaj zai = zai(i10);
            if (zai != null) {
                zai.zab.connect();
            }
        }
    }

    public final void zad(int i10, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(googleApiClient, "GoogleApiClient instance cannot be null");
        boolean z10 = this.zad.indexOfKey(i10) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i10);
        Preconditions.checkState(z10, sb.toString());
        zam zam = this.zab.get();
        boolean z11 = this.zaa;
        String valueOf = String.valueOf(zam);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i10);
        sb2.append(" ");
        sb2.append(z11);
        sb2.append(" ");
        sb2.append(valueOf);
        zaj zaj = new zaj(this, i10, googleApiClient, onConnectionFailedListener);
        googleApiClient.registerConnectionFailedListener(zaj);
        this.zad.put(i10, zaj);
        if (this.zaa && zam == null) {
            "connecting ".concat(googleApiClient.toString());
            googleApiClient.connect();
        }
    }

    public final void zae(int i10) {
        zaj zaj = this.zad.get(i10);
        this.zad.remove(i10);
        if (zaj != null) {
            zaj.zab.unregisterConnectionFailedListener(zaj);
            zaj.zab.disconnect();
        }
    }
}
