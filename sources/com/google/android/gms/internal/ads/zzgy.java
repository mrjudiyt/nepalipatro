package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgy extends zzgc {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzgy() {
        super(false);
    }

    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zzc;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            int i12 = zzfk.zza;
            int read = randomAccessFile.read(bArr, i10, (int) Math.min(j10, (long) i11));
            if (read > 0) {
                this.zzc -= (long) read;
                zzg(read);
            }
            return read;
        } catch (IOException e10) {
            throw new zzgx(e10, 2000);
        }
    }

    public final long zzb(zzgn zzgn) {
        Uri uri = zzgn.zza;
        this.zzb = uri;
        zzi(zzgn);
        int i10 = AdError.INTERNAL_ERROR_2006;
        try {
            String path = uri.getPath();
            Objects.requireNonNull(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.zza = randomAccessFile;
            try {
                randomAccessFile.seek(zzgn.zzf);
                long j10 = zzgn.zzg;
                if (j10 == -1) {
                    j10 = this.zza.length() - zzgn.zzf;
                }
                this.zzc = j10;
                if (j10 >= 0) {
                    this.zzd = true;
                    zzj(zzgn);
                    return this.zzc;
                }
                throw new zzgx((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
            } catch (IOException e10) {
                throw new zzgx(e10, 2000);
            }
        } catch (FileNotFoundException e11) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new zzgx(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e11, 1004);
            }
            if (zzfk.zza < 21 || !zzgw.zzb(e11.getCause())) {
                i10 = 2005;
            }
            throw new zzgx(e11, i10);
        } catch (SecurityException e12) {
            throw new zzgx(e12, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e13) {
            throw new zzgx(e13, 2000);
        }
    }

    public final Uri zzc() {
        return this.zzb;
    }

    public final void zzd() {
        this.zzb = null;
        try {
            RandomAccessFile randomAccessFile = this.zza;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzh();
            }
        } catch (IOException e10) {
            throw new zzgx(e10, 2000);
        } catch (Throwable th) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzh();
            }
            throw th;
        }
    }
}
