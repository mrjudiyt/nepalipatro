package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzano implements zzanp {
    private static final Logger zzb = Logger.getLogger(zzano.class.getName());
    final ThreadLocal zza = new zzann(this);

    public abstract zzans zza(String str, byte[] bArr, String str2);

    public final zzans zzb(zzhao zzhao, zzant zzant) {
        int zza2;
        long j10;
        long zzb2 = zzhao.zzb();
        ((ByteBuffer) this.zza.get()).rewind().limit(8);
        do {
            zza2 = zzhao.zza((ByteBuffer) this.zza.get());
            if (zza2 == 8) {
                ((ByteBuffer) this.zza.get()).rewind();
                long zze = zzanr.zze((ByteBuffer) this.zza.get());
                byte[] bArr = null;
                if (zze >= 8 || zze <= 1) {
                    byte[] bArr2 = new byte[4];
                    ((ByteBuffer) this.zza.get()).get(bArr2);
                    try {
                        String str = new String(bArr2, "ISO-8859-1");
                        if (zze == 1) {
                            ((ByteBuffer) this.zza.get()).limit(16);
                            zzhao.zza((ByteBuffer) this.zza.get());
                            ((ByteBuffer) this.zza.get()).position(8);
                            j10 = zzanr.zzf((ByteBuffer) this.zza.get()) - 16;
                        } else {
                            j10 = zze == 0 ? zzhao.zzc() - zzhao.zzb() : zze - 8;
                        }
                        if ("uuid".equals(str)) {
                            ((ByteBuffer) this.zza.get()).limit(((ByteBuffer) this.zza.get()).limit() + 16);
                            zzhao.zza((ByteBuffer) this.zza.get());
                            bArr = new byte[16];
                            for (int position = ((ByteBuffer) this.zza.get()).position() - 16; position < ((ByteBuffer) this.zza.get()).position(); position++) {
                                bArr[position - (((ByteBuffer) this.zza.get()).position() - 16)] = ((ByteBuffer) this.zza.get()).get(position);
                            }
                            j10 -= 16;
                        }
                        long j11 = j10;
                        zzans zza3 = zza(str, bArr, zzant instanceof zzans ? ((zzans) zzant).zza() : "");
                        zza3.zzc(zzant);
                        ((ByteBuffer) this.zza.get()).rewind();
                        zza3.zzb(zzhao, (ByteBuffer) this.zza.get(), j11, this);
                        return zza3;
                    } catch (UnsupportedEncodingException e10) {
                        throw new RuntimeException(e10);
                    }
                } else {
                    Logger logger = zzb;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(zze);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
            }
        } while (zza2 >= 0);
        zzhao.zze(zzb2);
        throw new EOFException();
    }
}
