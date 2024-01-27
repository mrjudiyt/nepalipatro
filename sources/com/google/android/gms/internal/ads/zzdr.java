package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzdr implements zzdq {
    protected zzdo zzb;
    protected zzdo zzc;
    private zzdo zzd;
    private zzdo zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzdr() {
        ByteBuffer byteBuffer = zzdq.zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        zzdo zzdo = zzdo.zza;
        this.zzd = zzdo;
        this.zze = zzdo;
        this.zzb = zzdo;
        this.zzc = zzdo;
    }

    public final zzdo zza(zzdo zzdo) {
        this.zzd = zzdo;
        this.zze = zzi(zzdo);
        return zzg() ? this.zze : zzdo.zza;
    }

    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zzdq.zza;
        return byteBuffer;
    }

    public final void zzc() {
        this.zzg = zzdq.zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    public final void zzf() {
        zzc();
        this.zzf = zzdq.zza;
        zzdo zzdo = zzdo.zza;
        this.zzd = zzdo;
        this.zze = zzdo;
        this.zzb = zzdo;
        this.zzc = zzdo;
        zzm();
    }

    public boolean zzg() {
        return this.zze != zzdo.zza;
    }

    public boolean zzh() {
        return this.zzh && this.zzg == zzdq.zza;
    }

    /* access modifiers changed from: protected */
    public zzdo zzi(zzdo zzdo) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final ByteBuffer zzj(int i10) {
        if (this.zzf.capacity() < i10) {
            this.zzf = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    /* access modifiers changed from: protected */
    public void zzk() {
    }

    /* access modifiers changed from: protected */
    public void zzl() {
    }

    /* access modifiers changed from: protected */
    public void zzm() {
    }

    /* access modifiers changed from: protected */
    public final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}
