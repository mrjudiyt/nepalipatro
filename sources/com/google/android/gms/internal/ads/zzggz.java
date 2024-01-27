package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
abstract class zzggz {
    private final zzggx zza;
    private final zzggx zzb;

    public zzggz(byte[] bArr) {
        if (zzghf.zza(1)) {
            this.zza = zza(bArr, 1);
            this.zzb = zza(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    /* access modifiers changed from: package-private */
    public abstract zzggx zza(byte[] bArr, int i10);

    public final byte[] zzb(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr4 = new byte[32];
                this.zzb.zzc(bArr, 0).get(bArr4);
                int length = bArr2.length;
                int i10 = length & 15;
                int i11 = i10 == 0 ? length : (length + 16) - i10;
                int remaining = byteBuffer.remaining();
                int i12 = remaining % 16;
                int i13 = (i12 == 0 ? remaining : (remaining + 16) - i12) + i11;
                ByteBuffer order = ByteBuffer.allocate(i13 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(i11);
                order.put(byteBuffer);
                order.position(i13);
                order.putLong((long) length);
                order.putLong((long) remaining);
                if (MessageDigest.isEqual(zzghc.zza(bArr4, order.array()), bArr3)) {
                    byteBuffer.position(position);
                    return this.zza.zzd(bArr, byteBuffer);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e10) {
                throw new AEADBadTagException(e10.toString());
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }
}
