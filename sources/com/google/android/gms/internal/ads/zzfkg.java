package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfkg extends zzfkc {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final zzfke zzb;
    private final zzfkd zzc;
    private final List zzd = new ArrayList();
    private zzfmj zze;
    private zzflh zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final String zzi;

    zzfkg(zzfkd zzfkd, zzfke zzfke) {
        this.zzc = zzfkd;
        this.zzb = zzfke;
        this.zzi = UUID.randomUUID().toString();
        zzk((View) null);
        if (zzfke.zzd() == zzfkf.HTML || zzfke.zzd() == zzfkf.JAVASCRIPT) {
            this.zzf = new zzfli(zzfke.zza());
        } else {
            this.zzf = new zzfll(zzfke.zzi(), (String) null);
        }
        this.zzf.zzk();
        zzfku.zza().zzd(this);
        zzfla.zza().zzd(this.zzf.zza(), zzfkd.zzb());
    }

    private final void zzk(View view) {
        this.zze = new zzfmj(view);
    }

    public final void zzb(View view, zzfkj zzfkj, String str) {
        zzfkx zzfkx;
        if (this.zzh) {
            return;
        }
        if (zza.matcher("Ad overlay").matches()) {
            Iterator it = this.zzd.iterator();
            while (true) {
                if (!it.hasNext()) {
                    zzfkx = null;
                    break;
                }
                zzfkx = (zzfkx) it.next();
                if (zzfkx.zzb().get() == view) {
                    break;
                }
            }
            if (zzfkx == null) {
                this.zzd.add(new zzfkx(view, zzfkj, "Ad overlay"));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
    }

    public final void zzc() {
        if (!this.zzh) {
            this.zze.clear();
            if (!this.zzh) {
                this.zzd.clear();
            }
            this.zzh = true;
            zzfla.zza().zzc(this.zzf.zza());
            zzfku.zza().zze(this);
            this.zzf.zzc();
            this.zzf = null;
        }
    }

    public final void zzd(View view) {
        if (!this.zzh && zzf() != view) {
            zzk(view);
            this.zzf.zzb();
            Collection<zzfkg> zzc2 = zzfku.zza().zzc();
            if (zzc2 != null && !zzc2.isEmpty()) {
                for (zzfkg zzfkg : zzc2) {
                    if (zzfkg != this && zzfkg.zzf() == view) {
                        zzfkg.zze.clear();
                    }
                }
            }
        }
    }

    public final void zze() {
        if (!this.zzg) {
            this.zzg = true;
            zzfku.zza().zzf(this);
            this.zzf.zzi(zzflb.zzb().zza());
            this.zzf.zze(zzfks.zza().zzb());
            this.zzf.zzg(this, this.zzb);
        }
    }

    public final View zzf() {
        return (View) this.zze.get();
    }

    public final zzflh zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zzi;
    }

    public final List zzi() {
        return this.zzd;
    }

    public final boolean zzj() {
        return this.zzg && !this.zzh;
    }
}
