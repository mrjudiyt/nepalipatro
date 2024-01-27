package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzaqd {
    static boolean zza = false;
    static final CountDownLatch zzb = new CountDownLatch(1);
    public static final /* synthetic */ int zzc = 0;
    /* access modifiers changed from: private */
    public static MessageDigest zzd;
    private static final Object zze = new Object();
    private static final Object zzf = new Object();

    static String zza(byte[] bArr, String str) {
        byte[] bArr2;
        Vector zzb2 = zzb(bArr, 255);
        if (zzb2 == null || zzb2.isEmpty()) {
            bArr2 = zzg(zzf(4096).zzax(), str, true);
        } else {
            zzapv zza2 = zzapw.zza();
            int size = zzb2.size();
            for (int i10 = 0; i10 < size; i10++) {
                zza2.zza(zzgsr.zzv(zzg((byte[]) zzb2.get(i10), str, false), 0, UserVerificationMethods.USER_VERIFY_HANDPRINT));
            }
            byte[] zze2 = zze(bArr);
            zzgsr zzgsr = zzgsr.zzb;
            zza2.zzb(zzgsr.zzv(zze2, 0, zze2.length));
            bArr2 = ((zzapw) zza2.zzal()).zzax();
        }
        return zzapz.zza(bArr2, true);
    }

    static Vector zzb(byte[] bArr, int i10) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i11 = length + 254;
        Vector vector = new Vector();
        int i12 = 0;
        while (i12 < i11 / 255) {
            int i13 = i12 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i13 > 255) {
                    length2 = i13 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i13, length2));
                i12++;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    static void zzd() {
        synchronized (zzf) {
            if (!zza) {
                zza = true;
                new Thread(new zzaqc((zzaqb) null)).start();
            }
        }
    }

    public static byte[] zze(byte[] bArr) {
        byte[] digest;
        synchronized (zze) {
            zzd();
            MessageDigest messageDigest = null;
            try {
                if (zzb.await(2, TimeUnit.SECONDS)) {
                    MessageDigest messageDigest2 = zzd;
                    if (messageDigest2 != null) {
                        messageDigest = messageDigest2;
                    }
                }
            } catch (InterruptedException unused) {
            }
            if (messageDigest != null) {
                messageDigest.reset();
                messageDigest.update(bArr);
                digest = zzd.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return digest;
    }

    static zzapj zzf(int i10) {
        zzaom zza2 = zzapj.zza();
        zza2.zzD(4096);
        return (zzapj) zza2.zzal();
    }

    private static byte[] zzg(byte[] bArr, String str, boolean z10) {
        byte[] bArr2;
        int length = bArr.length;
        int i10 = true != z10 ? 255 : 239;
        if (length > i10) {
            bArr = zzf(4096).zzax();
        }
        int i11 = i10 + 1;
        int length2 = bArr.length;
        byte b10 = (byte) length2;
        if (length2 < i10) {
            byte[] bArr3 = new byte[(i10 - length2)];
            new SecureRandom().nextBytes(bArr3);
            bArr2 = ByteBuffer.allocate(i11).put(b10).put(bArr).put(bArr3).array();
        } else {
            bArr2 = ByteBuffer.allocate(i11).put(b10).put(bArr).array();
        }
        if (z10) {
            bArr2 = ByteBuffer.allocate(UserVerificationMethods.USER_VERIFY_HANDPRINT).put(zze(bArr2)).put(bArr2).array();
        }
        byte[] bArr4 = new byte[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        zzaqe[] zzaqeArr = new zzard().zzcG;
        int length3 = zzaqeArr.length;
        for (int i12 = 0; i12 < 12; i12++) {
            zzaqeArr[i12].zza(bArr2, bArr4);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzapx(str.getBytes("UTF-8")).zza(bArr4);
        }
        return bArr4;
    }
}
