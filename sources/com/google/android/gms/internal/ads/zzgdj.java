package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgdj extends zzghv {
    zzgdj() {
        super(zzgnc.class, new zzgdh(zzgrp.class));
    }

    public static final void zzh(zzgnc zzgnc) {
        zzgrv.zzb(zzgnc.zza(), 0);
        zzgrv.zza(zzgnc.zzh().zzd());
        zzm(zzgnc.zzg());
    }

    /* access modifiers changed from: private */
    public static final void zzm(zzgni zzgni) {
        if (zzgni.zza() < 12 || zzgni.zza() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public final zzghu zza() {
        return new zzgdi(this, zzgnf.class);
    }

    public final zzgoy zzb() {
        return zzgoy.SYMMETRIC;
    }

    public final /* synthetic */ zzgvj zzc(zzgsr zzgsr) {
        return zzgnc.zzf(zzgsr, zzgtl.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgvj zzgvj) {
        zzh((zzgnc) zzgvj);
    }
}
