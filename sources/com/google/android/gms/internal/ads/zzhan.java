package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzhan implements Iterator, Closeable, zzant {
    private static final zzans zza = new zzham("eof ");
    private static final zzhau zzb = zzhau.zzb(zzhan.class);
    protected zzanp zzc;
    protected zzhao zzd;
    zzans zze = null;
    long zzf = 0;
    long zzg = 0;
    private final List zzh = new ArrayList();

    public void close() {
    }

    public final boolean hasNext() {
        zzans zzans = this.zze;
        if (zzans == zza) {
            return false;
        }
        if (zzans != null) {
            return true;
        }
        try {
            this.zze = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zze = zza;
            return false;
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i10 = 0; i10 < this.zzh.size(); i10++) {
            if (i10 > 0) {
                sb.append(";");
            }
            sb.append(((zzans) this.zzh.get(i10)).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: zzd */
    public final zzans next() {
        zzans zzb2;
        zzans zzans = this.zze;
        if (zzans == null || zzans == zza) {
            zzhao zzhao = this.zzd;
            if (zzhao == null || this.zzf >= this.zzg) {
                this.zze = zza;
                throw new NoSuchElementException();
            }
            try {
                synchronized (zzhao) {
                    this.zzd.zze(this.zzf);
                    zzb2 = this.zzc.zzb(this.zzd, this);
                    this.zzf = this.zzd.zzb();
                }
                return zzb2;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        } else {
            this.zze = null;
            return zzans;
        }
    }

    public final List zze() {
        return (this.zzd == null || this.zze == zza) ? this.zzh : new zzhat(this.zzh, this);
    }

    public final void zzf(zzhao zzhao, long j10, zzanp zzanp) {
        this.zzd = zzhao;
        this.zzf = zzhao.zzb();
        zzhao.zze(zzhao.zzb() + j10);
        this.zzg = zzhao.zzb();
        this.zzc = zzanp;
    }
}
