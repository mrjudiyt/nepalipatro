package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzecs implements zzfzp {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzect zzb;

    zzecs(zzect zzect, boolean z10) {
        this.zzb = zzect;
        this.zza = z10;
    }

    public final void zza(Throwable th) {
        zzcat.zzg("Failed to get signals bundle");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzect r0 = r7.zzb
            android.os.Bundle r8 = (android.os.Bundle) r8
            boolean r0 = r0.zzf()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            java.lang.String r0 = "ad_types"
            java.lang.Object r0 = r8.get(r0)
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L_0x0018
            java.util.List r0 = (java.util.List) r0
            goto L_0x0022
        L_0x0018:
            boolean r1 = r0 instanceof java.lang.String[]
            if (r1 == 0) goto L_0x0048
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
        L_0x0022:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x002f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = r0.next()
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L_0x002f
            java.lang.String r2 = (java.lang.String) r2
            r1.add(r2)
            goto L_0x002f
        L_0x0043:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            goto L_0x004c
        L_0x0048:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x004c:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0055:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00af
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.hashCode()
            r3 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1396342996: goto L_0x008a;
                case -1052618729: goto L_0x0080;
                case -239580146: goto L_0x0076;
                case 604727084: goto L_0x006c;
                default: goto L_0x006b;
            }
        L_0x006b:
            goto L_0x0094
        L_0x006c:
            java.lang.String r2 = "interstitial"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0094
            r1 = 1
            goto L_0x0095
        L_0x0076:
            java.lang.String r2 = "rewarded"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0094
            r1 = 3
            goto L_0x0095
        L_0x0080:
            java.lang.String r2 = "native"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0094
            r1 = 2
            goto L_0x0095
        L_0x008a:
            java.lang.String r2 = "banner"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0094
            r1 = 0
            goto L_0x0095
        L_0x0094:
            r1 = -1
        L_0x0095:
            if (r1 == 0) goto L_0x00a9
            if (r1 == r6) goto L_0x00a6
            if (r1 == r5) goto L_0x00a3
            if (r1 == r3) goto L_0x00a0
            com.google.android.gms.internal.ads.zzayt r1 = com.google.android.gms.internal.ads.zzayt.AD_FORMAT_TYPE_UNSPECIFIED
            goto L_0x00ab
        L_0x00a0:
            com.google.android.gms.internal.ads.zzayt r1 = com.google.android.gms.internal.ads.zzayt.REWARD_BASED_VIDEO_AD
            goto L_0x00ab
        L_0x00a3:
            com.google.android.gms.internal.ads.zzayt r1 = com.google.android.gms.internal.ads.zzayt.NATIVE_APP_INSTALL
            goto L_0x00ab
        L_0x00a6:
            com.google.android.gms.internal.ads.zzayt r1 = com.google.android.gms.internal.ads.zzayt.INTERSTITIAL
            goto L_0x00ab
        L_0x00a9:
            com.google.android.gms.internal.ads.zzayt r1 = com.google.android.gms.internal.ads.zzayt.BANNER
        L_0x00ab:
            r4.add(r1)
            goto L_0x0055
        L_0x00af:
            com.google.android.gms.internal.ads.zzect r0 = r7.zzb
            com.google.android.gms.internal.ads.zzbai r6 = com.google.android.gms.internal.ads.zzect.zzb(r0, r8)
            com.google.android.gms.internal.ads.zzect r0 = r7.zzb
            com.google.android.gms.internal.ads.zzazz r5 = com.google.android.gms.internal.ads.zzect.zza(r0, r8)
            com.google.android.gms.internal.ads.zzect r8 = r7.zzb
            boolean r3 = r7.zza
            com.google.android.gms.internal.ads.zzecr r0 = new com.google.android.gms.internal.ads.zzecr
            r1 = r0
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.android.gms.internal.ads.zzech r8 = r8.zza
            r8.zza(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzecs.zzb(java.lang.Object):void");
    }
}
