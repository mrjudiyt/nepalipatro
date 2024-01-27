package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
abstract class zzp<T> {
    final int zza;
    final TaskCompletionSource<T> zzb = new TaskCompletionSource<>();
    final int zzc;
    final Bundle zzd;

    zzp(int i10, int i11, Bundle bundle) {
        this.zza = i10;
        this.zzc = i11;
        this.zzd = bundle;
    }

    public final String toString() {
        int i10 = this.zzc;
        int i11 = this.zza;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i10);
        sb.append(" id=");
        sb.append(i11);
        sb.append(" oneWay=");
        sb.append(zzb());
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public abstract void zza(Bundle bundle);

    /* access modifiers changed from: package-private */
    public abstract boolean zzb();

    /* access modifiers changed from: package-private */
    public final void zzc(zzq zzq) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzq);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
        }
        this.zzb.setException(zzq);
    }

    /* access modifiers changed from: package-private */
    public final void zzd(T t10) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t10);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
        }
        this.zzb.setResult(t10);
    }
}
