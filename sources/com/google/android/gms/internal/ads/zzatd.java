package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzatd extends zzaud {
    private static final zzaue zzi = new zzaue();
    private final Context zzj;

    public zzatd(zzasp zzasp, String str, String str2, zzaom zzaom, int i10, int i11, Context context, zzaof zzaof) {
        super(zzasp, "p0JEft1H0Ux+/zQoofBGK8/hHhAdN3veKIjNmetX6I2+7J67s0tf2NBKaWy11XvI", "yaxGJhC1WxugM+8EfEc/xAIuDWtPkz77G//hU7f/vWw=", zzaom, i10, 27);
        this.zzj = context;
    }

    private final String zzc() {
        try {
            if (this.zzb.zzl() != null) {
                this.zzb.zzl().get();
            }
            zzapj zzc = this.zzb.zzc();
            if (zzc == null || !zzc.zzaj()) {
                return null;
            }
            return zzc.zzh();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void zza() {
        zzaqa zzaqa;
        int i10;
        Boolean bool;
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        synchronized (zza) {
            zzaqa zzaqa2 = (zzaqa) zza.get();
            if (zzaqa2 == null || zzass.zzd(zzaqa2.zza) || zzaqa2.zza.equals("E") || zzaqa2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (!zzass.zzd((String) null)) {
                    i10 = 5;
                } else {
                    if (!zzass.zzd((String) null)) {
                        bool = Boolean.FALSE;
                    } else {
                        bool = Boolean.FALSE;
                    }
                    bool.booleanValue();
                    i10 = 3;
                }
                Boolean valueOf = Boolean.valueOf(i10 == 3);
                Boolean bool2 = (Boolean) zzba.zzc().zzb(zzbci.zzcj);
                String zzb = ((Boolean) zzba.zzc().zzb(zzbci.zzci)).booleanValue() ? zzb() : null;
                if (bool2.booleanValue() && this.zzb.zzp() && zzass.zzd(zzb)) {
                    zzb = zzc();
                }
                zzaqa zzaqa3 = new zzaqa((String) this.zzf.invoke((Object) null, new Object[]{this.zzj, valueOf, zzb}));
                if (zzass.zzd(zzaqa3.zza) || zzaqa3.zza.equals("E")) {
                    int i11 = i10 - 1;
                    if (i11 == 3) {
                        String zzc = zzc();
                        if (!zzass.zzd(zzc)) {
                            zzaqa3.zza = zzc;
                        }
                    } else if (i11 == 4) {
                        throw null;
                    }
                }
                zza.set(zzaqa3);
            }
            zzaqa = (zzaqa) zza.get();
        }
        synchronized (this.zze) {
            if (zzaqa != null) {
                this.zze.zzx(zzaqa.zza);
                this.zze.zzX(zzaqa.zzb);
                this.zze.zzZ(zzaqa.zzc);
                this.zze.zzi(zzaqa.zzd);
                this.zze.zzw(zzaqa.zze);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final String zzb() {
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            byte[] zzf = zzass.zzf((String) zzba.zzc().zzb(zzbci.zzck));
            ArrayList arrayList = new ArrayList();
            arrayList.add(instance.generateCertificate(new ByteArrayInputStream(zzf)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(instance.generateCertificate(new ByteArrayInputStream(zzass.zzf((String) zzba.zzc().zzb(zzbci.zzcl)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zzb.zzk();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            zzgal zze = zzgal.zze();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new zzauf(zze));
            return (String) zze.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
