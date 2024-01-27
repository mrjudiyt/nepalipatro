package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzabh implements zzabt {
    private static final int[] zza = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19};
    private static final zzabg zzc = new zzabg(zzabd.zza);
    private static final zzabg zzd = new zzabg(zzabe.zza);
    private zzfvs zze;
    private final zzair zzf = new zzair();

    private final void zzb(int i10, List list) {
        switch (i10) {
            case 0:
                list.add(new zzait());
                return;
            case 1:
                list.add(new zzaiw());
                return;
            case 2:
                list.add(new zzaiz(0));
                return;
            case 3:
                list.add(new zzada(0));
                return;
            case 4:
                zzabm zza2 = zzc.zza(0);
                if (zza2 != null) {
                    list.add(zza2);
                    return;
                } else {
                    list.add(new zzads(0));
                    return;
                }
            case 5:
                list.add(new zzadv());
                return;
            case 6:
                list.add(new zzagj(0));
                return;
            case 7:
                list.add(new zzagr(0));
                return;
            case 8:
                list.add(new zzahm(0, (zzfi) null));
                list.add(new zzahr(0));
                return;
            case 9:
                list.add(new zzaif());
                return;
            case 10:
                list.add(new zzakc());
                return;
            case 11:
                if (this.zze == null) {
                    this.zze = zzfvs.zzl();
                }
                list.add(new zzakm(1, new zzfi(0), new zzajb(0, this.zze), 112800));
                return;
            case 12:
                list.add(new zzaky());
                return;
            case 14:
                list.add(new zzaea());
                return;
            case 15:
                zzabm zza3 = zzd.zza(new Object[0]);
                if (zza3 != null) {
                    list.add(zza3);
                    return;
                }
                return;
            case 16:
                list.add(new zzadf());
                return;
            case 17:
                list.add(new zzaiq());
                return;
            case 18:
                list.add(new zzald());
                return;
            case 19:
                list.add(new zzadm());
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01db, code lost:
        r3 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01dc, code lost:
        switch(r3) {
            case 0: goto L_0x0211;
            case 1: goto L_0x0211;
            case 2: goto L_0x0211;
            case 3: goto L_0x020f;
            case 4: goto L_0x020d;
            case 5: goto L_0x020d;
            case 6: goto L_0x020d;
            case 7: goto L_0x020b;
            case 8: goto L_0x0209;
            case 9: goto L_0x0206;
            case 10: goto L_0x0204;
            case 11: goto L_0x0204;
            case 12: goto L_0x0204;
            case 13: goto L_0x0204;
            case 14: goto L_0x0204;
            case 15: goto L_0x0202;
            case 16: goto L_0x01ff;
            case 17: goto L_0x01ff;
            case 18: goto L_0x01ff;
            case 19: goto L_0x01fc;
            case 20: goto L_0x01f9;
            case 21: goto L_0x01f6;
            case 22: goto L_0x01f3;
            case 23: goto L_0x01f0;
            case 24: goto L_0x01ed;
            case 25: goto L_0x01ea;
            case 26: goto L_0x01e7;
            case 27: goto L_0x01e4;
            case 28: goto L_0x01e1;
            default: goto L_0x01df;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01e1, code lost:
        r3 = 19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01e4, code lost:
        r3 = 18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01e7, code lost:
        r3 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01ea, code lost:
        r3 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01ed, code lost:
        r3 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01f0, code lost:
        r3 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01f3, code lost:
        r3 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01f6, code lost:
        r3 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01f9, code lost:
        r3 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01fc, code lost:
        r3 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01ff, code lost:
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0202, code lost:
        r3 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0204, code lost:
        r3 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0206, code lost:
        r3 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0209, code lost:
        r3 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x020b, code lost:
        r3 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x020d, code lost:
        r3 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x020f, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0211, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x016e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.zzabm[] zza(android.net.Uri r23, java.util.Map r24) {
        /*
            r22 = this;
            r1 = r22
            monitor-enter(r22)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x03e8 }
            r2 = 19
            r0.<init>(r2)     // Catch:{ all -> 0x03e8 }
            java.lang.String r3 = "Content-Type"
            r4 = r24
            java.lang.Object r3 = r4.get(r3)     // Catch:{ all -> 0x03e8 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x03e8 }
            r4 = 0
            if (r3 == 0) goto L_0x0025
            boolean r5 = r3.isEmpty()     // Catch:{ all -> 0x03e8 }
            if (r5 == 0) goto L_0x001e
            goto L_0x0025
        L_0x001e:
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x03e8 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x03e8 }
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            r9 = 5
            r10 = 4
            r11 = 3
            r12 = 14
            r13 = 13
            r14 = 12
            r15 = 11
            r16 = 9
            r17 = 6
            r18 = 15
            r4 = 2
            r19 = 10
            r20 = 8
            r5 = 1
            r6 = -1
            if (r3 != 0) goto L_0x0043
        L_0x0040:
            r3 = -1
            goto L_0x0212
        L_0x0043:
            int r21 = com.google.android.gms.internal.ads.zzcb.zza     // Catch:{ all -> 0x03e8 }
            int r7 = r3.hashCode()     // Catch:{ all -> 0x03e8 }
            r8 = -1007807498(0xffffffffc3ee13f6, float:-476.15594)
            if (r7 == r8) goto L_0x006d
            r8 = -586683234(0xffffffffdd07ec9e, float:-6.1214856E17)
            if (r7 == r8) goto L_0x0063
            r8 = 187090231(0xb26c537, float:3.2118805E-32)
            if (r7 == r8) goto L_0x0059
            goto L_0x0077
        L_0x0059:
            java.lang.String r7 = "audio/mp3"
            boolean r7 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r7 == 0) goto L_0x0077
            r7 = 1
            goto L_0x0078
        L_0x0063:
            java.lang.String r7 = "audio/x-wav"
            boolean r7 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r7 == 0) goto L_0x0077
            r7 = 2
            goto L_0x0078
        L_0x006d:
            java.lang.String r7 = "audio/x-flac"
            boolean r7 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r7 == 0) goto L_0x0077
            r7 = 0
            goto L_0x0078
        L_0x0077:
            r7 = -1
        L_0x0078:
            if (r7 == 0) goto L_0x0085
            if (r7 == r5) goto L_0x0082
            if (r7 == r4) goto L_0x007f
            goto L_0x0087
        L_0x007f:
            java.lang.String r3 = "audio/wav"
            goto L_0x0087
        L_0x0082:
            java.lang.String r3 = "audio/mpeg"
            goto L_0x0087
        L_0x0085:
            java.lang.String r3 = "audio/flac"
        L_0x0087:
            int r7 = r3.hashCode()     // Catch:{ all -> 0x03e8 }
            switch(r7) {
                case -2123537834: goto L_0x01d1;
                case -1662384011: goto L_0x01c6;
                case -1662384007: goto L_0x01bb;
                case -1662095187: goto L_0x01b0;
                case -1606874997: goto L_0x01a6;
                case -1487394660: goto L_0x019b;
                case -1487018032: goto L_0x0190;
                case -1248337486: goto L_0x0185;
                case -1079884372: goto L_0x017a;
                case -1004728940: goto L_0x016e;
                case -879272239: goto L_0x0162;
                case -879258763: goto L_0x0156;
                case -387023398: goto L_0x014a;
                case -43467528: goto L_0x013e;
                case 13915911: goto L_0x0132;
                case 187078296: goto L_0x0127;
                case 187078297: goto L_0x011c;
                case 187078669: goto L_0x0111;
                case 187090232: goto L_0x0105;
                case 187091926: goto L_0x00f9;
                case 187099443: goto L_0x00ed;
                case 1331848029: goto L_0x00e1;
                case 1503095341: goto L_0x00d6;
                case 1504578661: goto L_0x00cb;
                case 1504619009: goto L_0x00c0;
                case 1504824762: goto L_0x00b4;
                case 1504831518: goto L_0x00a8;
                case 1505118770: goto L_0x009c;
                case 2039520277: goto L_0x0090;
                default: goto L_0x008e;
            }     // Catch:{ all -> 0x03e8 }
        L_0x008e:
            goto L_0x01db
        L_0x0090:
            java.lang.String r7 = "video/x-matroska"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 10
            goto L_0x01dc
        L_0x009c:
            java.lang.String r7 = "audio/webm"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 13
            goto L_0x01dc
        L_0x00a8:
            java.lang.String r7 = "audio/mpeg"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 15
            goto L_0x01dc
        L_0x00b4:
            java.lang.String r7 = "audio/midi"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 9
            goto L_0x01dc
        L_0x00c0:
            java.lang.String r7 = "audio/flac"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 7
            goto L_0x01dc
        L_0x00cb:
            java.lang.String r7 = "audio/eac3"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 1
            goto L_0x01dc
        L_0x00d6:
            java.lang.String r7 = "audio/3gpp"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 5
            goto L_0x01dc
        L_0x00e1:
            java.lang.String r7 = "video/mp4"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 16
            goto L_0x01dc
        L_0x00ed:
            java.lang.String r7 = "audio/wav"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 22
            goto L_0x01dc
        L_0x00f9:
            java.lang.String r7 = "audio/ogg"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 19
            goto L_0x01dc
        L_0x0105:
            java.lang.String r7 = "audio/mp4"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 17
            goto L_0x01dc
        L_0x0111:
            java.lang.String r7 = "audio/amr"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 4
            goto L_0x01dc
        L_0x011c:
            java.lang.String r7 = "audio/ac4"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 3
            goto L_0x01dc
        L_0x0127:
            java.lang.String r7 = "audio/ac3"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 0
            goto L_0x01dc
        L_0x0132:
            java.lang.String r7 = "video/x-flv"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 8
            goto L_0x01dc
        L_0x013e:
            java.lang.String r7 = "application/webm"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 14
            goto L_0x01dc
        L_0x014a:
            java.lang.String r7 = "audio/x-matroska"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 11
            goto L_0x01dc
        L_0x0156:
            java.lang.String r7 = "image/png"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 26
            goto L_0x01dc
        L_0x0162:
            java.lang.String r7 = "image/bmp"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 28
            goto L_0x01dc
        L_0x016e:
            java.lang.String r7 = "text/vtt"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 23
            goto L_0x01dc
        L_0x017a:
            java.lang.String r7 = "video/x-msvideo"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 25
            goto L_0x01dc
        L_0x0185:
            java.lang.String r7 = "application/mp4"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 18
            goto L_0x01dc
        L_0x0190:
            java.lang.String r7 = "image/webp"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 27
            goto L_0x01dc
        L_0x019b:
            java.lang.String r7 = "image/jpeg"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 24
            goto L_0x01dc
        L_0x01a6:
            java.lang.String r7 = "audio/amr-wb"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 6
            goto L_0x01dc
        L_0x01b0:
            java.lang.String r7 = "video/webm"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 12
            goto L_0x01dc
        L_0x01bb:
            java.lang.String r7 = "video/mp2t"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 21
            goto L_0x01dc
        L_0x01c6:
            java.lang.String r7 = "video/mp2p"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 20
            goto L_0x01dc
        L_0x01d1:
            java.lang.String r7 = "audio/eac3-joc"
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x01db
            r3 = 2
            goto L_0x01dc
        L_0x01db:
            r3 = -1
        L_0x01dc:
            switch(r3) {
                case 0: goto L_0x0211;
                case 1: goto L_0x0211;
                case 2: goto L_0x0211;
                case 3: goto L_0x020f;
                case 4: goto L_0x020d;
                case 5: goto L_0x020d;
                case 6: goto L_0x020d;
                case 7: goto L_0x020b;
                case 8: goto L_0x0209;
                case 9: goto L_0x0206;
                case 10: goto L_0x0204;
                case 11: goto L_0x0204;
                case 12: goto L_0x0204;
                case 13: goto L_0x0204;
                case 14: goto L_0x0204;
                case 15: goto L_0x0202;
                case 16: goto L_0x01ff;
                case 17: goto L_0x01ff;
                case 18: goto L_0x01ff;
                case 19: goto L_0x01fc;
                case 20: goto L_0x01f9;
                case 21: goto L_0x01f6;
                case 22: goto L_0x01f3;
                case 23: goto L_0x01f0;
                case 24: goto L_0x01ed;
                case 25: goto L_0x01ea;
                case 26: goto L_0x01e7;
                case 27: goto L_0x01e4;
                case 28: goto L_0x01e1;
                default: goto L_0x01df;
            }     // Catch:{ all -> 0x03e8 }
        L_0x01df:
            goto L_0x0040
        L_0x01e1:
            r3 = 19
            goto L_0x0212
        L_0x01e4:
            r3 = 18
            goto L_0x0212
        L_0x01e7:
            r3 = 17
            goto L_0x0212
        L_0x01ea:
            r3 = 16
            goto L_0x0212
        L_0x01ed:
            r3 = 14
            goto L_0x0212
        L_0x01f0:
            r3 = 13
            goto L_0x0212
        L_0x01f3:
            r3 = 12
            goto L_0x0212
        L_0x01f6:
            r3 = 11
            goto L_0x0212
        L_0x01f9:
            r3 = 10
            goto L_0x0212
        L_0x01fc:
            r3 = 9
            goto L_0x0212
        L_0x01ff:
            r3 = 8
            goto L_0x0212
        L_0x0202:
            r3 = 7
            goto L_0x0212
        L_0x0204:
            r3 = 6
            goto L_0x0212
        L_0x0206:
            r3 = 15
            goto L_0x0212
        L_0x0209:
            r3 = 5
            goto L_0x0212
        L_0x020b:
            r3 = 4
            goto L_0x0212
        L_0x020d:
            r3 = 3
            goto L_0x0212
        L_0x020f:
            r3 = 1
            goto L_0x0212
        L_0x0211:
            r3 = 0
        L_0x0212:
            if (r3 == r6) goto L_0x0217
            r1.zzb(r3, r0)     // Catch:{ all -> 0x03e8 }
        L_0x0217:
            java.lang.String r7 = r23.getLastPathSegment()     // Catch:{ all -> 0x03e8 }
            if (r7 != 0) goto L_0x0220
        L_0x021d:
            r5 = -1
            goto L_0x03b6
        L_0x0220:
            java.lang.String r8 = ".ac3"
            boolean r8 = r7.endsWith(r8)     // Catch:{ all -> 0x03e8 }
            if (r8 != 0) goto L_0x03b5
            java.lang.String r8 = ".ec3"
            boolean r8 = r7.endsWith(r8)     // Catch:{ all -> 0x03e8 }
            if (r8 == 0) goto L_0x0232
            goto L_0x03b5
        L_0x0232:
            java.lang.String r8 = ".ac4"
            boolean r8 = r7.endsWith(r8)     // Catch:{ all -> 0x03e8 }
            if (r8 == 0) goto L_0x023c
            goto L_0x03b6
        L_0x023c:
            java.lang.String r5 = ".adts"
            boolean r5 = r7.endsWith(r5)     // Catch:{ all -> 0x03e8 }
            if (r5 != 0) goto L_0x03b3
            java.lang.String r5 = ".aac"
            boolean r5 = r7.endsWith(r5)     // Catch:{ all -> 0x03e8 }
            if (r5 == 0) goto L_0x024e
            goto L_0x03b3
        L_0x024e:
            java.lang.String r4 = ".amr"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 == 0) goto L_0x0259
            r5 = 3
            goto L_0x03b6
        L_0x0259:
            java.lang.String r4 = ".flac"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 == 0) goto L_0x0264
            r5 = 4
            goto L_0x03b6
        L_0x0264:
            java.lang.String r4 = ".flv"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 == 0) goto L_0x026f
            r5 = 5
            goto L_0x03b6
        L_0x026f:
            java.lang.String r4 = ".mid"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 != 0) goto L_0x03b0
            java.lang.String r4 = ".midi"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 != 0) goto L_0x03b0
            java.lang.String r4 = ".smf"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 == 0) goto L_0x0289
            goto L_0x03b0
        L_0x0289:
            int r4 = r7.length()     // Catch:{ all -> 0x03e8 }
            java.lang.String r5 = ".mk"
            int r4 = r4 + -4
            boolean r4 = r7.startsWith(r5, r4)     // Catch:{ all -> 0x03e8 }
            if (r4 != 0) goto L_0x03ae
            java.lang.String r4 = ".webm"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 == 0) goto L_0x02a1
            goto L_0x03ae
        L_0x02a1:
            java.lang.String r4 = ".mp3"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 == 0) goto L_0x02ac
            r5 = 7
            goto L_0x03b6
        L_0x02ac:
            java.lang.String r4 = ".mp4"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 != 0) goto L_0x03ab
            int r4 = r7.length()     // Catch:{ all -> 0x03e8 }
            int r4 = r4 + -4
            java.lang.String r5 = ".m4"
            boolean r4 = r7.startsWith(r5, r4)     // Catch:{ all -> 0x03e8 }
            if (r4 != 0) goto L_0x03ab
            int r4 = r7.length()     // Catch:{ all -> 0x03e8 }
            java.lang.String r5 = ".mp4"
            int r4 = r4 + -5
            boolean r4 = r7.startsWith(r5, r4)     // Catch:{ all -> 0x03e8 }
            if (r4 != 0) goto L_0x03ab
            int r4 = r7.length()     // Catch:{ all -> 0x03e8 }
            int r4 = r4 + -5
            java.lang.String r5 = ".cmf"
            boolean r4 = r7.startsWith(r5, r4)     // Catch:{ all -> 0x03e8 }
            if (r4 == 0) goto L_0x02e0
            goto L_0x03ab
        L_0x02e0:
            int r4 = r7.length()     // Catch:{ all -> 0x03e8 }
            int r4 = r4 + -4
            java.lang.String r5 = ".og"
            boolean r4 = r7.startsWith(r5, r4)     // Catch:{ all -> 0x03e8 }
            if (r4 != 0) goto L_0x03a8
            java.lang.String r4 = ".opus"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 == 0) goto L_0x02f8
            goto L_0x03a8
        L_0x02f8:
            java.lang.String r4 = ".ps"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 != 0) goto L_0x03a5
            java.lang.String r4 = ".mpeg"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 != 0) goto L_0x03a5
            java.lang.String r4 = ".mpg"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 != 0) goto L_0x03a5
            java.lang.String r4 = ".m2p"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 == 0) goto L_0x031a
            goto L_0x03a5
        L_0x031a:
            java.lang.String r4 = ".ts"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 != 0) goto L_0x03a2
            int r4 = r7.length()     // Catch:{ all -> 0x03e8 }
            int r4 = r4 + -4
            java.lang.String r5 = ".ts"
            boolean r4 = r7.startsWith(r5, r4)     // Catch:{ all -> 0x03e8 }
            if (r4 == 0) goto L_0x0332
            goto L_0x03a2
        L_0x0332:
            java.lang.String r4 = ".wav"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 != 0) goto L_0x039f
            java.lang.String r4 = ".wave"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 == 0) goto L_0x0343
            goto L_0x039f
        L_0x0343:
            java.lang.String r4 = ".vtt"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 != 0) goto L_0x039c
            java.lang.String r4 = ".webvtt"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 == 0) goto L_0x0354
            goto L_0x039c
        L_0x0354:
            java.lang.String r4 = ".jpg"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 != 0) goto L_0x0399
            java.lang.String r4 = ".jpeg"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 == 0) goto L_0x0365
            goto L_0x0399
        L_0x0365:
            java.lang.String r4 = ".avi"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 == 0) goto L_0x0370
            r5 = 16
            goto L_0x03b6
        L_0x0370:
            java.lang.String r4 = ".png"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 == 0) goto L_0x037b
            r5 = 17
            goto L_0x03b6
        L_0x037b:
            java.lang.String r4 = ".webp"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 == 0) goto L_0x0386
            r5 = 18
            goto L_0x03b6
        L_0x0386:
            java.lang.String r4 = ".bmp"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 != 0) goto L_0x0396
            java.lang.String r4 = ".dib"
            boolean r4 = r7.endsWith(r4)     // Catch:{ all -> 0x03e8 }
            if (r4 == 0) goto L_0x021d
        L_0x0396:
            r5 = 19
            goto L_0x03b6
        L_0x0399:
            r5 = 14
            goto L_0x03b6
        L_0x039c:
            r5 = 13
            goto L_0x03b6
        L_0x039f:
            r5 = 12
            goto L_0x03b6
        L_0x03a2:
            r5 = 11
            goto L_0x03b6
        L_0x03a5:
            r5 = 10
            goto L_0x03b6
        L_0x03a8:
            r5 = 9
            goto L_0x03b6
        L_0x03ab:
            r5 = 8
            goto L_0x03b6
        L_0x03ae:
            r5 = 6
            goto L_0x03b6
        L_0x03b0:
            r5 = 15
            goto L_0x03b6
        L_0x03b3:
            r5 = 2
            goto L_0x03b6
        L_0x03b5:
            r5 = 0
        L_0x03b6:
            if (r5 == r6) goto L_0x03bd
            if (r5 == r3) goto L_0x03bd
            r1.zzb(r5, r0)     // Catch:{ all -> 0x03e8 }
        L_0x03bd:
            int[] r4 = zza     // Catch:{ all -> 0x03e8 }
            r6 = 0
        L_0x03c0:
            if (r6 >= r2) goto L_0x03ce
            r7 = r4[r6]     // Catch:{ all -> 0x03e8 }
            if (r7 == r3) goto L_0x03cb
            if (r7 == r5) goto L_0x03cb
            r1.zzb(r7, r0)     // Catch:{ all -> 0x03e8 }
        L_0x03cb:
            int r6 = r6 + 1
            goto L_0x03c0
        L_0x03ce:
            int r2 = r0.size()     // Catch:{ all -> 0x03e8 }
            com.google.android.gms.internal.ads.zzabm[] r2 = new com.google.android.gms.internal.ads.zzabm[r2]     // Catch:{ all -> 0x03e8 }
            r4 = 0
        L_0x03d5:
            int r3 = r0.size()     // Catch:{ all -> 0x03e8 }
            if (r4 >= r3) goto L_0x03e6
            java.lang.Object r3 = r0.get(r4)     // Catch:{ all -> 0x03e8 }
            com.google.android.gms.internal.ads.zzabm r3 = (com.google.android.gms.internal.ads.zzabm) r3     // Catch:{ all -> 0x03e8 }
            r2[r4] = r3     // Catch:{ all -> 0x03e8 }
            int r4 = r4 + 1
            goto L_0x03d5
        L_0x03e6:
            monitor-exit(r22)
            return r2
        L_0x03e8:
            r0 = move-exception
            monitor-exit(r22)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabh.zza(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.zzabm[]");
    }
}
