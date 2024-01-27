package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzbx;
import com.google.android.gms.internal.play_billing.zzcb;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public class zzbx<MessageType extends zzcb<MessageType, BuilderType>, BuilderType extends zzbx<MessageType, BuilderType>> extends zzaj<MessageType, BuilderType> {
    protected zzcb zza;
    private final zzcb zzb;

    protected zzbx(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzt()) {
            this.zza = messagetype.zzi();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* renamed from: zzb */
    public final zzbx zza() {
        zzbx zzbx = (zzbx) this.zzb.zzu(5, (Object) null, (Object) null);
        zzbx.zza = zze();
        return zzbx;
    }

    public final MessageType zzc() {
        MessageType zzd = zze();
        if (zzd.zzs()) {
            return zzd;
        }
        throw new zzef(zzd);
    }

    /* renamed from: zzd */
    public MessageType zze() {
        if (!this.zza.zzt()) {
            return this.zza;
        }
        this.zza.zzn();
        return this.zza;
    }

    public final /* bridge */ /* synthetic */ zzdf zzf() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void zzg() {
        if (!this.zza.zzt()) {
            zzh();
        }
    }

    /* access modifiers changed from: protected */
    public void zzh() {
        zzcb zzi = this.zzb.zzi();
        zzdn.zza().zzb(zzi.getClass()).zzg(zzi, this.zza);
        this.zza = zzi;
    }
}
