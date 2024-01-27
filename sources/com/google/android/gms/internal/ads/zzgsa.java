package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgrz;
import com.google.android.gms.internal.ads.zzgsa;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzgsa<MessageType extends zzgsa<MessageType, BuilderType>, BuilderType extends zzgrz<MessageType, BuilderType>> implements zzgvj {
    protected int zza = 0;

    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void zzav(java.lang.Iterable r5, java.util.List r6) {
        /*
            byte[] r0 = com.google.android.gms.internal.ads.zzguj.zzd
            java.util.Objects.requireNonNull(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgur
            java.lang.String r1 = " is null."
            java.lang.String r2 = "Element at index "
            if (r0 == 0) goto L_0x0063
            com.google.android.gms.internal.ads.zzgur r5 = (com.google.android.gms.internal.ads.zzgur) r5
            java.util.List r5 = r5.zzh()
            r0 = r6
            com.google.android.gms.internal.ads.zzgur r0 = (com.google.android.gms.internal.ads.zzgur) r0
            int r6 = r6.size()
            java.util.Iterator r5 = r5.iterator()
        L_0x001e:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x00bb
            java.lang.Object r3 = r5.next()
            if (r3 != 0) goto L_0x0053
            int r5 = r0.size()
            int r5 = r5 - r6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r5)
            r3.append(r1)
            java.lang.String r5 = r3.toString()
            int r1 = r0.size()
        L_0x0045:
            int r1 = r1 + -1
            if (r1 < r6) goto L_0x004d
            r0.remove(r1)
            goto L_0x0045
        L_0x004d:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            r6.<init>(r5)
            throw r6
        L_0x0053:
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzgsr
            if (r4 == 0) goto L_0x005d
            com.google.android.gms.internal.ads.zzgsr r3 = (com.google.android.gms.internal.ads.zzgsr) r3
            r0.zzi(r3)
            goto L_0x001e
        L_0x005d:
            java.lang.String r3 = (java.lang.String) r3
            r0.add(r3)
            goto L_0x001e
        L_0x0063:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgvq
            if (r0 != 0) goto L_0x00bc
            boolean r0 = r6 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x007a
            r0 = r6
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r3 = r6.size()
            int r4 = r5.size()
            int r3 = r3 + r4
            r0.ensureCapacity(r3)
        L_0x007a:
            int r0 = r6.size()
            java.util.Iterator r5 = r5.iterator()
        L_0x0082:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x00bb
            java.lang.Object r3 = r5.next()
            if (r3 != 0) goto L_0x00b7
            int r5 = r6.size()
            int r5 = r5 - r0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r5)
            r3.append(r1)
            java.lang.String r5 = r3.toString()
            int r1 = r6.size()
        L_0x00a9:
            int r1 = r1 + -1
            if (r1 < r0) goto L_0x00b1
            r6.remove(r1)
            goto L_0x00a9
        L_0x00b1:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            r6.<init>(r5)
            throw r6
        L_0x00b7:
            r6.add(r3)
            goto L_0x0082
        L_0x00bb:
            return
        L_0x00bc:
            r6.addAll(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgsa.zzav(java.lang.Iterable, java.util.List):void");
    }

    /* access modifiers changed from: package-private */
    public int zzat(zzgwc zzgwc) {
        throw null;
    }

    public final zzgsr zzau() {
        try {
            int zzaz = zzaz();
            zzgsr zzgsr = zzgsr.zzb;
            byte[] bArr = new byte[zzaz];
            zzgtg zzC = zzgtg.zzC(bArr, 0, zzaz);
            zzaW(zzC);
            zzC.zzD();
            return new zzgsn(bArr);
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    public final void zzaw(OutputStream outputStream) {
        int zzaz = zzaz();
        int i10 = zzgtg.zzf;
        if (zzaz > 4096) {
            zzaz = 4096;
        }
        zzgte zzgte = new zzgte(outputStream, zzaz);
        zzaW(zzgte);
        zzgte.zzI();
    }

    public final byte[] zzax() {
        try {
            int zzaz = zzaz();
            byte[] bArr = new byte[zzaz];
            zzgtg zzC = zzgtg.zzC(bArr, 0, zzaz);
            zzaW(zzC);
            zzC.zzD();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e10);
        }
    }
}
