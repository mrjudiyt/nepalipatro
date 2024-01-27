package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzqp {
    private static final byte[] zza = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    private static final byte[] zzb = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    private ByteBuffer zzc = zzdq.zza;
    private int zzd = 2;
    private int zze = 0;

    private static final void zzc(ByteBuffer byteBuffer, long j10, int i10, int i11, boolean z10) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z10 ? (byte) 0 : 2);
        byteBuffer.putLong(j10);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i10);
        byteBuffer.putInt(0);
        byteBuffer.put(zzfyc.zza((long) i11));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: byte[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzht r22, java.util.List r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            java.nio.ByteBuffer r2 = r1.zzc
            java.util.Objects.requireNonNull(r2)
            int r2 = r2.limit()
            java.nio.ByteBuffer r3 = r1.zzc
            int r3 = r3.position()
            int r2 = r2 - r3
            if (r2 != 0) goto L_0x0017
            return
        L_0x0017:
            int r2 = r0.zzd
            r3 = 0
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 != r5) goto L_0x0035
            int r2 = r23.size()
            if (r2 == r4) goto L_0x002c
            int r2 = r23.size()
            r7 = 3
            if (r2 != r7) goto L_0x0035
        L_0x002c:
            r2 = r23
            java.lang.Object r2 = r2.get(r6)
            r3 = r2
            byte[] r3 = (byte[]) r3
        L_0x0035:
            java.nio.ByteBuffer r2 = r1.zzc
            int r7 = r2.position()
            int r8 = r2.limit()
            int r9 = r8 - r7
            int r10 = r0.zzd
            int r11 = r9 + 255
            r12 = 255(0xff, float:3.57E-43)
            int r11 = r11 / r12
            int r13 = r11 + 27
            int r13 = r13 + r9
            if (r10 != r5) goto L_0x0059
            if (r3 == 0) goto L_0x0053
            int r10 = r3.length
            int r10 = r10 + 28
            goto L_0x0055
        L_0x0053:
            r10 = 47
        L_0x0055:
            int r14 = r10 + 44
            int r13 = r13 + r14
            goto L_0x005a
        L_0x0059:
            r10 = 0
        L_0x005a:
            java.nio.ByteBuffer r14 = r0.zzc
            int r14 = r14.capacity()
            if (r14 >= r13) goto L_0x006f
            java.nio.ByteBuffer r13 = java.nio.ByteBuffer.allocate(r13)
            java.nio.ByteOrder r14 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r13 = r13.order(r14)
            r0.zzc = r13
            goto L_0x0074
        L_0x006f:
            java.nio.ByteBuffer r13 = r0.zzc
            r13.clear()
        L_0x0074:
            java.nio.ByteBuffer r13 = r0.zzc
            int r14 = r0.zzd
            r15 = 22
            if (r14 != r5) goto L_0x00c1
            if (r3 == 0) goto L_0x00b7
            r16 = 0
            r18 = 0
            r19 = 1
            r20 = 1
            r14 = r13
            r4 = 22
            r15 = r16
            r17 = r18
            r18 = r19
            r19 = r20
            zzc(r14, r15, r17, r18, r19)
            int r14 = r3.length
            long r4 = (long) r14
            byte r4 = com.google.android.gms.internal.ads.zzfyc.zza(r4)
            r13.put(r4)
            r13.put(r3)
            byte[] r3 = r13.array()
            int r4 = r13.arrayOffset()
            int r14 = r14 + 28
            int r3 = com.google.android.gms.internal.ads.zzfk.zzd(r3, r4, r14, r6)
            r4 = 22
            r13.putInt(r4, r3)
            r13.position(r14)
            goto L_0x00bc
        L_0x00b7:
            byte[] r3 = zza
            r13.put(r3)
        L_0x00bc:
            byte[] r3 = zzb
            r13.put(r3)
        L_0x00c1:
            int r3 = com.google.android.gms.internal.ads.zzaci.zzc(r2)
            int r4 = r0.zze
            int r4 = r4 + r3
            r0.zze = r4
            int r3 = r0.zzd
            long r14 = (long) r4
            r18 = 0
            r4 = r13
            r16 = r3
            r17 = r11
            zzc(r13, r14, r16, r17, r18)
            r3 = 0
        L_0x00d8:
            if (r3 >= r11) goto L_0x00eb
            if (r9 < r12) goto L_0x00e3
            r5 = -1
            r4.put(r5)
            int r9 = r9 + -255
            goto L_0x00e8
        L_0x00e3:
            byte r5 = (byte) r9
            r4.put(r5)
            r9 = 0
        L_0x00e8:
            int r3 = r3 + 1
            goto L_0x00d8
        L_0x00eb:
            if (r7 >= r8) goto L_0x00f7
            byte r3 = r2.get(r7)
            r4.put(r3)
            int r7 = r7 + 1
            goto L_0x00eb
        L_0x00f7:
            int r3 = r2.limit()
            r2.position(r3)
            r4.flip()
            int r2 = r0.zzd
            r3 = 2
            if (r2 != r3) goto L_0x0124
            byte[] r2 = r4.array()
            int r3 = r4.arrayOffset()
            int r3 = r3 + r10
            int r3 = r3 + 44
            int r5 = r4.limit()
            int r7 = r4.position()
            int r5 = r5 - r7
            int r2 = com.google.android.gms.internal.ads.zzfk.zzd(r2, r3, r5, r6)
            int r10 = r10 + 66
            r4.putInt(r10, r2)
            goto L_0x013e
        L_0x0124:
            byte[] r2 = r4.array()
            int r3 = r4.arrayOffset()
            int r5 = r4.limit()
            int r7 = r4.position()
            int r5 = r5 - r7
            int r2 = com.google.android.gms.internal.ads.zzfk.zzd(r2, r3, r5, r6)
            r3 = 22
            r4.putInt(r3, r2)
        L_0x013e:
            int r2 = r0.zzd
            r3 = 1
            int r2 = r2 + r3
            r0.zzd = r2
            r0.zzc = r4
            r22.zzb()
            java.nio.ByteBuffer r2 = r0.zzc
            int r2 = r2.remaining()
            r1.zzi(r2)
            java.nio.ByteBuffer r2 = r1.zzc
            java.nio.ByteBuffer r3 = r0.zzc
            r2.put(r3)
            r22.zzj()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqp.zza(com.google.android.gms.internal.ads.zzht, java.util.List):void");
    }

    public final void zzb() {
        this.zzc = zzdq.zza;
        this.zze = 0;
        this.zzd = 2;
    }
}
