package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzxi extends zzxn implements zzls {
    public static final /* synthetic */ int zzb = 0;
    /* access modifiers changed from: private */
    public static final zzfxb zzc = zzfxb.zzb(zzwh.zza);
    /* access modifiers changed from: private */
    public static final zzfxb zzd = zzfxb.zzb(zzwi.zza);
    public final Context zza;
    private final Object zze = new Object();
    private final boolean zzf;
    private zzww zzg;
    private zzxb zzh;
    private zzk zzi;
    private final zzwd zzj;

    public zzxi(Context context) {
        zzwd zzwd = new zzwd();
        zzww zzd2 = zzww.zzd(context);
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzwd;
        this.zzg = zzd2;
        this.zzi = zzk.zza;
        boolean z10 = false;
        if (context != null && zzfk.zzH(context)) {
            z10 = true;
        }
        this.zzf = z10;
        if (!z10 && context != null && zzfk.zza >= 32) {
            this.zzh = zzxb.zza(context);
        }
        if (this.zzg.zzQ && context == null) {
            zzer.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    protected static int zza(zzam zzam, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(zzam.zzd)) {
            return 4;
        }
        String zzg2 = zzg(str);
        String zzg3 = zzg(zzam.zzd);
        if (zzg3 == null || zzg2 == null) {
            if (!z10 || zzg3 != null) {
                return 0;
            }
            return 1;
        } else if (zzg3.startsWith(zzg2) || zzg2.startsWith(zzg3)) {
            return 3;
        } else {
            int i10 = zzfk.zza;
            if (zzg3.split("-", 2)[0].equals(zzg2.split("-", 2)[0])) {
                return 2;
            }
            return 0;
        }
    }

    protected static String zzg(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0089, code lost:
        if (r8.zzh.zzd(r8.zzi, r9) != false) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ boolean zzl(com.google.android.gms.internal.ads.zzxi r8, com.google.android.gms.internal.ads.zzam r9) {
        /*
            java.lang.Object r0 = r8.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzww r1 = r8.zzg     // Catch:{ all -> 0x008e }
            boolean r1 = r1.zzQ     // Catch:{ all -> 0x008e }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x008b
            boolean r1 = r8.zzf     // Catch:{ all -> 0x008e }
            if (r1 != 0) goto L_0x008b
            int r1 = r9.zzz     // Catch:{ all -> 0x008e }
            r4 = 2
            if (r1 <= r4) goto L_0x008b
            java.lang.String r1 = r9.zzm     // Catch:{ all -> 0x008e }
            r5 = 32
            if (r1 != 0) goto L_0x001b
            goto L_0x0065
        L_0x001b:
            int r6 = r1.hashCode()     // Catch:{ all -> 0x008e }
            r7 = 3
            switch(r6) {
                case -2123537834: goto L_0x0042;
                case 187078296: goto L_0x0038;
                case 187078297: goto L_0x002e;
                case 1504578661: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x004c
        L_0x0024:
            java.lang.String r6 = "audio/eac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x004c
            r1 = 1
            goto L_0x004d
        L_0x002e:
            java.lang.String r6 = "audio/ac4"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x004c
            r1 = 3
            goto L_0x004d
        L_0x0038:
            java.lang.String r6 = "audio/ac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x004c
            r1 = 0
            goto L_0x004d
        L_0x0042:
            java.lang.String r6 = "audio/eac3-joc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x004c
            r1 = 2
            goto L_0x004d
        L_0x004c:
            r1 = -1
        L_0x004d:
            if (r1 == 0) goto L_0x0056
            if (r1 == r3) goto L_0x0056
            if (r1 == r4) goto L_0x0056
            if (r1 == r7) goto L_0x0056
            goto L_0x0065
        L_0x0056:
            int r1 = com.google.android.gms.internal.ads.zzfk.zza     // Catch:{ all -> 0x008e }
            if (r1 < r5) goto L_0x008b
            com.google.android.gms.internal.ads.zzxb r1 = r8.zzh     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008b
            boolean r1 = r1.zzg()     // Catch:{ all -> 0x008e }
            if (r1 != 0) goto L_0x0065
            goto L_0x008b
        L_0x0065:
            int r1 = com.google.android.gms.internal.ads.zzfk.zza     // Catch:{ all -> 0x008e }
            if (r1 < r5) goto L_0x008c
            com.google.android.gms.internal.ads.zzxb r1 = r8.zzh     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008c
            boolean r4 = r1.zzg()     // Catch:{ all -> 0x008e }
            if (r4 == 0) goto L_0x008c
            boolean r1 = r1.zze()     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.zzxb r1 = r8.zzh     // Catch:{ all -> 0x008e }
            boolean r1 = r1.zzf()     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.zzxb r1 = r8.zzh     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.ads.zzk r8 = r8.zzi     // Catch:{ all -> 0x008e }
            boolean r8 = r1.zzd(r8, r9)     // Catch:{ all -> 0x008e }
            if (r8 == 0) goto L_0x008c
        L_0x008b:
            r2 = 1
        L_0x008c:
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            return r2
        L_0x008e:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxi.zzl(com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzam):boolean");
    }

    protected static boolean zzn(int i10, boolean z10) {
        int i11 = i10 & 7;
        return i11 == 4 || (z10 && i11 == 3);
    }

    private static void zzt(zzvx zzvx, zzdc zzdc, Map map) {
        int i10 = 0;
        while (i10 < zzvx.zzc) {
            if (((zzcz) zzdc.zzC.get(zzvx.zzb(i10))) == null) {
                i10++;
            } else {
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void zzu() {
        boolean z10;
        zzxb zzxb;
        synchronized (this.zze) {
            z10 = false;
            if (this.zzg.zzQ && !this.zzf && zzfk.zza >= 32 && (zzxb = this.zzh) != null && zzxb.zzg()) {
                z10 = true;
            }
        }
        if (z10) {
            zzs();
        }
    }

    private static final Pair zzv(int i10, zzxm zzxm, int[][][] iArr, zzxd zzxd, Comparator comparator) {
        List arrayList;
        zzxm zzxm2 = zzxm;
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < 2; i11++) {
            if (i10 == zzxm2.zzc(i11)) {
                zzvx zzd2 = zzxm2.zzd(i11);
                for (int i12 = 0; i12 < zzd2.zzc; i12++) {
                    zzcx zzb2 = zzd2.zzb(i12);
                    List zza2 = zzxd.zza(i11, zzb2, iArr[i11][i12]);
                    int i13 = zzb2.zzb;
                    int i14 = 1;
                    boolean[] zArr = new boolean[1];
                    int i15 = 0;
                    while (i15 <= 0) {
                        int i16 = i15 + 1;
                        zzxe zzxe = (zzxe) zza2.get(i15);
                        int zzb3 = zzxe.zzb();
                        if (!zArr[i15] && zzb3 != 0) {
                            if (zzb3 == i14) {
                                arrayList = zzfvs.zzm(zzxe);
                            } else {
                                arrayList = new ArrayList();
                                arrayList.add(zzxe);
                                for (int i17 = i16; i17 <= 0; i17++) {
                                    zzxe zzxe2 = (zzxe) zza2.get(i17);
                                    if (zzxe2.zzb() == 2 && zzxe.zzc(zzxe2)) {
                                        arrayList.add(zzxe2);
                                        zArr[i17] = true;
                                    }
                                }
                            }
                            arrayList2.add(arrayList);
                        }
                        i15 = i16;
                        i14 = 1;
                    }
                }
            }
            zzxd zzxd2 = zzxd;
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList2, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i18 = 0; i18 < list.size(); i18++) {
            iArr2[i18] = ((zzxe) list.get(i18)).zzc;
        }
        zzxe zzxe3 = (zzxe) list.get(0);
        return Pair.create(new zzxj(zzxe3.zzb, iArr2, 0), Integer.valueOf(zzxe3.zza));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: com.google.android.gms.internal.ads.zzxk[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.google.android.gms.internal.ads.zzwe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: com.google.android.gms.internal.ads.zzxl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: com.google.android.gms.internal.ads.zzxl} */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair zzb(com.google.android.gms.internal.ads.zzxm r23, int[][][] r24, int[] r25, com.google.android.gms.internal.ads.zztw r26, com.google.android.gms.internal.ads.zzcv r27) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            r2 = r24
            java.lang.Object r3 = r1.zze
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzww r4 = r1.zzg     // Catch:{ all -> 0x020d }
            boolean r5 = r4.zzQ     // Catch:{ all -> 0x020d }
            if (r5 == 0) goto L_0x0023
            int r5 = com.google.android.gms.internal.ads.zzfk.zza     // Catch:{ all -> 0x020d }
            r6 = 32
            if (r5 < r6) goto L_0x0023
            com.google.android.gms.internal.ads.zzxb r5 = r1.zzh     // Catch:{ all -> 0x020d }
            if (r5 == 0) goto L_0x0023
            android.os.Looper r6 = android.os.Looper.myLooper()     // Catch:{ all -> 0x020d }
            com.google.android.gms.internal.ads.zzdx.zzb(r6)     // Catch:{ all -> 0x020d }
            r5.zzb(r1, r6)     // Catch:{ all -> 0x020d }
        L_0x0023:
            monitor-exit(r3)     // Catch:{ all -> 0x020d }
            r3 = 2
            com.google.android.gms.internal.ads.zzxj[] r5 = new com.google.android.gms.internal.ads.zzxj[r3]
            com.google.android.gms.internal.ads.zzwm r6 = new com.google.android.gms.internal.ads.zzwm
            r7 = r25
            r6.<init>(r4, r7)
            com.google.android.gms.internal.ads.zzwn r7 = com.google.android.gms.internal.ads.zzwn.zza
            android.util.Pair r6 = zzv(r3, r0, r2, r6, r7)
            r7 = 0
            if (r6 == 0) goto L_0x0045
            java.lang.Object r8 = r6.second
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r6 = r6.first
            com.google.android.gms.internal.ads.zzxj r6 = (com.google.android.gms.internal.ads.zzxj) r6
            r5[r8] = r6
        L_0x0045:
            r6 = 0
        L_0x0046:
            r8 = 1
            if (r6 >= r3) goto L_0x005c
            int r9 = r0.zzc(r6)
            if (r9 != r3) goto L_0x0059
            com.google.android.gms.internal.ads.zzvx r9 = r0.zzd(r6)
            int r9 = r9.zzc
            if (r9 <= 0) goto L_0x0059
            r6 = 1
            goto L_0x005d
        L_0x0059:
            int r6 = r6 + 1
            goto L_0x0046
        L_0x005c:
            r6 = 0
        L_0x005d:
            com.google.android.gms.internal.ads.zzwk r9 = new com.google.android.gms.internal.ads.zzwk
            r9.<init>(r1, r4, r6)
            com.google.android.gms.internal.ads.zzwl r6 = com.google.android.gms.internal.ads.zzwl.zza
            android.util.Pair r6 = zzv(r8, r0, r2, r9, r6)
            if (r6 == 0) goto L_0x0078
            java.lang.Object r9 = r6.second
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r10 = r6.first
            com.google.android.gms.internal.ads.zzxj r10 = (com.google.android.gms.internal.ads.zzxj) r10
            r5[r9] = r10
        L_0x0078:
            if (r6 != 0) goto L_0x007c
            r6 = 0
            goto L_0x008f
        L_0x007c:
            java.lang.Object r6 = r6.first
            r10 = r6
            com.google.android.gms.internal.ads.zzxj r10 = (com.google.android.gms.internal.ads.zzxj) r10
            com.google.android.gms.internal.ads.zzcx r10 = r10.zza
            com.google.android.gms.internal.ads.zzxj r6 = (com.google.android.gms.internal.ads.zzxj) r6
            int[] r6 = r6.zzb
            r6 = r6[r7]
            com.google.android.gms.internal.ads.zzam r6 = r10.zzb(r6)
            java.lang.String r6 = r6.zzd
        L_0x008f:
            com.google.android.gms.internal.ads.zzwo r10 = new com.google.android.gms.internal.ads.zzwo
            r10.<init>(r4, r6)
            com.google.android.gms.internal.ads.zzwp r6 = com.google.android.gms.internal.ads.zzwp.zza
            r11 = 3
            android.util.Pair r6 = zzv(r11, r0, r2, r10, r6)
            if (r6 == 0) goto L_0x00ab
            java.lang.Object r10 = r6.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.Object r6 = r6.first
            com.google.android.gms.internal.ads.zzxj r6 = (com.google.android.gms.internal.ads.zzxj) r6
            r5[r10] = r6
        L_0x00ab:
            r6 = 0
        L_0x00ac:
            if (r6 >= r3) goto L_0x0110
            int r10 = r0.zzc(r6)
            if (r10 == r3) goto L_0x010a
            if (r10 == r8) goto L_0x010a
            if (r10 == r11) goto L_0x010a
            com.google.android.gms.internal.ads.zzvx r10 = r0.zzd(r6)
            r12 = r2[r6]
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x00c1:
            int r11 = r10.zzc
            if (r13 >= r11) goto L_0x00fa
            com.google.android.gms.internal.ads.zzcx r11 = r10.zzb(r13)
            r16 = r12[r13]
            r17 = 0
        L_0x00cd:
            int r9 = r11.zzb
            if (r17 > 0) goto L_0x00f5
            r9 = r16[r7]
            boolean r3 = r4.zzR
            boolean r3 = zzn(r9, r3)
            if (r3 == 0) goto L_0x00f0
            com.google.android.gms.internal.ads.zzam r3 = r11.zzb(r7)
            com.google.android.gms.internal.ads.zzwr r9 = new com.google.android.gms.internal.ads.zzwr
            r8 = r16[r7]
            r9.<init>(r3, r8)
            if (r15 == 0) goto L_0x00ee
            int r3 = r9.compareTo(r15)
            if (r3 <= 0) goto L_0x00f0
        L_0x00ee:
            r15 = r9
            r14 = r11
        L_0x00f0:
            r3 = 2
            r8 = 1
            r17 = 1
            goto L_0x00cd
        L_0x00f5:
            int r13 = r13 + 1
            r3 = 2
            r8 = 1
            goto L_0x00c1
        L_0x00fa:
            if (r14 != 0) goto L_0x00fe
            r3 = 0
            goto L_0x0108
        L_0x00fe:
            com.google.android.gms.internal.ads.zzxj r3 = new com.google.android.gms.internal.ads.zzxj
            r8 = 1
            int[] r9 = new int[r8]
            r9[r7] = r7
            r3.<init>(r14, r9, r7)
        L_0x0108:
            r5[r6] = r3
        L_0x010a:
            int r6 = r6 + 1
            r3 = 2
            r8 = 1
            r11 = 3
            goto L_0x00ac
        L_0x0110:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = 0
            r6 = 2
        L_0x0117:
            if (r3 >= r6) goto L_0x0123
            com.google.android.gms.internal.ads.zzvx r8 = r0.zzd(r3)
            zzt(r8, r4, r2)
            int r3 = r3 + 1
            goto L_0x0117
        L_0x0123:
            com.google.android.gms.internal.ads.zzvx r3 = r23.zze()
            zzt(r3, r4, r2)
            r3 = 0
        L_0x012b:
            if (r3 >= r6) goto L_0x0142
            int r8 = r0.zzc(r3)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r8 = r2.get(r8)
            com.google.android.gms.internal.ads.zzcz r8 = (com.google.android.gms.internal.ads.zzcz) r8
            if (r8 != 0) goto L_0x0140
            int r3 = r3 + 1
            goto L_0x012b
        L_0x0140:
            r3 = 0
            throw r3
        L_0x0142:
            r3 = 0
            r2 = 0
        L_0x0144:
            if (r2 >= r6) goto L_0x015e
            com.google.android.gms.internal.ads.zzvx r6 = r0.zzd(r2)
            boolean r8 = r4.zzg(r2, r6)
            if (r8 != 0) goto L_0x0151
            goto L_0x0159
        L_0x0151:
            com.google.android.gms.internal.ads.zzwy r6 = r4.zze(r2, r6)
            if (r6 != 0) goto L_0x015d
            r5[r2] = r3
        L_0x0159:
            int r2 = r2 + 1
            r6 = 2
            goto L_0x0144
        L_0x015d:
            throw r3
        L_0x015e:
            r2 = 0
        L_0x015f:
            r3 = 2
            if (r2 >= r3) goto L_0x0181
            int r3 = r0.zzc(r2)
            boolean r6 = r4.zzf(r2)
            if (r6 != 0) goto L_0x017b
            com.google.android.gms.internal.ads.zzfvx r6 = r4.zzD
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r6.contains(r3)
            if (r3 == 0) goto L_0x0179
            goto L_0x017b
        L_0x0179:
            r3 = 0
            goto L_0x017e
        L_0x017b:
            r3 = 0
            r5[r2] = r3
        L_0x017e:
            int r2 = r2 + 1
            goto L_0x015f
        L_0x0181:
            r3 = 0
            com.google.android.gms.internal.ads.zzwd r2 = r1.zzj
            com.google.android.gms.internal.ads.zzxy r6 = r22.zzq()
            com.google.android.gms.internal.ads.zzfvs r14 = com.google.android.gms.internal.ads.zzwe.zzf(r5)
            r8 = 2
            com.google.android.gms.internal.ads.zzxk[] r15 = new com.google.android.gms.internal.ads.zzxk[r8]
            r13 = 0
        L_0x0190:
            if (r13 >= r8) goto L_0x01d9
            r8 = r5[r13]
            if (r8 == 0) goto L_0x01d1
            int[] r10 = r8.zzb
            int r9 = r10.length
            if (r9 != 0) goto L_0x019c
            goto L_0x01d1
        L_0x019c:
            r12 = 1
            if (r9 != r12) goto L_0x01b7
            com.google.android.gms.internal.ads.zzcx r8 = r8.zza
            com.google.android.gms.internal.ads.zzxl r9 = new com.google.android.gms.internal.ads.zzxl
            r18 = r10[r7]
            r19 = 0
            r20 = 0
            r21 = 0
            r16 = r9
            r17 = r8
            r16.<init>(r17, r18, r19, r20, r21)
            r18 = r13
            r17 = 1
            goto L_0x01ce
        L_0x01b7:
            com.google.android.gms.internal.ads.zzcx r9 = r8.zza
            r11 = 0
            java.lang.Object r8 = r14.get(r13)
            r16 = r8
            com.google.android.gms.internal.ads.zzfvs r16 = (com.google.android.gms.internal.ads.zzfvs) r16
            r8 = r2
            r17 = 1
            r12 = r6
            r18 = r13
            r13 = r16
            com.google.android.gms.internal.ads.zzwe r9 = r8.zza(r9, r10, r11, r12, r13)
        L_0x01ce:
            r15[r18] = r9
            goto L_0x01d5
        L_0x01d1:
            r18 = r13
            r17 = 1
        L_0x01d5:
            int r13 = r18 + 1
            r8 = 2
            goto L_0x0190
        L_0x01d9:
            com.google.android.gms.internal.ads.zzlu[] r2 = new com.google.android.gms.internal.ads.zzlu[r8]
        L_0x01db:
            if (r7 >= r8) goto L_0x0208
            int r5 = r0.zzc(r7)
            boolean r6 = r4.zzf(r7)
            if (r6 != 0) goto L_0x0202
            com.google.android.gms.internal.ads.zzfvx r6 = r4.zzD
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L_0x01f4
            goto L_0x0202
        L_0x01f4:
            int r5 = r0.zzc(r7)
            r6 = -2
            if (r5 == r6) goto L_0x01ff
            r5 = r15[r7]
            if (r5 == 0) goto L_0x0202
        L_0x01ff:
            com.google.android.gms.internal.ads.zzlu r5 = com.google.android.gms.internal.ads.zzlu.zza
            goto L_0x0203
        L_0x0202:
            r5 = r3
        L_0x0203:
            r2[r7] = r5
            int r7 = r7 + 1
            goto L_0x01db
        L_0x0208:
            android.util.Pair r0 = android.util.Pair.create(r2, r15)
            return r0
        L_0x020d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x020d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxi.zzb(com.google.android.gms.internal.ads.zzxm, int[][][], int[], com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzcv):android.util.Pair");
    }

    public final zzls zzc() {
        return this;
    }

    public final zzww zzd() {
        zzww zzww;
        synchronized (this.zze) {
            zzww = this.zzg;
        }
        return zzww;
    }

    public final void zzi() {
        zzxb zzxb;
        synchronized (this.zze) {
            if (zzfk.zza >= 32 && (zzxb = this.zzh) != null) {
                zzxb.zzc();
            }
        }
        super.zzi();
    }

    public final void zzj(zzk zzk) {
        boolean z10;
        synchronized (this.zze) {
            z10 = !this.zzi.equals(zzk);
            this.zzi = zzk;
        }
        if (z10) {
            zzu();
        }
    }

    public final void zzk(zzwu zzwu) {
        boolean z10;
        zzww zzww = new zzww(zzwu);
        synchronized (this.zze) {
            z10 = !this.zzg.equals(zzww);
            this.zzg = zzww;
        }
        if (z10) {
            if (zzww.zzQ && this.zza == null) {
                zzer.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzs();
        }
    }

    public final boolean zzm() {
        return true;
    }
}
