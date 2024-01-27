package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgtv;
import com.google.android.gms.internal.ads.zzgtz;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzgtv<MessageType extends zzgtz<MessageType, BuilderType>, BuilderType extends zzgtv<MessageType, BuilderType>> extends zzgrz<MessageType, BuilderType> {
    protected zzgtz zza;
    private final zzgtz zzb;

    protected zzgtv(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzaY()) {
            this.zza = messagetype.zzaD();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private static void zza(Object obj, Object obj2) {
        zzgvr.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    /* renamed from: zzai */
    public final zzgtv zzah() {
        zzgtv zzgtv = (zzgtv) this.zzb.zzb(5, (Object) null, (Object) null);
        zzgtv.zza = zzan();
        return zzgtv;
    }

    public final zzgtv zzaj(zzgtz zzgtz) {
        if (!this.zzb.equals(zzgtz)) {
            if (!this.zza.zzaY()) {
                zzaq();
            }
            zza(this.zza, zzgtz);
        }
        return this;
    }

    public final zzgtv zzak(byte[] bArr, int i10, int i11, zzgtl zzgtl) {
        if (!this.zza.zzaY()) {
            zzaq();
        }
        try {
            zzgvr.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, 0, i11, new zzgsd(zzgtl));
            return this;
        } catch (zzgul e10) {
            throw e10;
        } catch (IndexOutOfBoundsException unused) {
            throw zzgul.zzj();
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        }
    }

    public final MessageType zzal() {
        MessageType zzam = zzan();
        if (zzam.zzaX()) {
            return zzam;
        }
        throw new zzgws(zzam);
    }

    /* renamed from: zzam */
    public MessageType zzan() {
        if (!this.zza.zzaY()) {
            return this.zza;
        }
        this.zza.zzaS();
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final void zzap() {
        if (!this.zza.zzaY()) {
            zzaq();
        }
    }

    /* access modifiers changed from: protected */
    public void zzaq() {
        zzgtz zzaD = this.zzb.zzaD();
        zza(zzaD, this.zza);
        this.zza = zzaD;
    }

    public final /* synthetic */ zzgvj zzbf() {
        throw null;
    }
}
