package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
public final class zzaa extends GmsClient {
    public zzaa(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 262, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.sourcedevice.internal.ISourceDirectTransferService");
        return queryLocalInterface instanceof zzt ? (zzt) queryLocalInterface : new zzt(iBinder);
    }

    public final int getMinApkVersion() {
        return 203000000;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.fido.sourcedevice.internal.ISourceDirectTransferService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.fido.sourcedevice.service.START";
    }

    /* access modifiers changed from: protected */
    public final boolean getUseDynamicLookup() {
        return true;
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}
