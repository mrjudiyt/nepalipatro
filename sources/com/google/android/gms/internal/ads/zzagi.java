package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzagi {
    public int zzA = 1000;
    public int zzB = 200;
    public float zzC = -1.0f;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public byte[] zzM;
    public int zzN = 1;
    public int zzO = -1;
    public int zzP = 8000;
    public long zzQ = 0;
    public long zzR = 0;
    public zzact zzS;
    public boolean zzT;
    public boolean zzU = true;
    public zzacs zzV;
    public int zzW;
    /* access modifiers changed from: private */
    public int zzX;
    /* access modifiers changed from: private */
    public String zzY = "eng";
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzacr zzi;
    public byte[] zzj;
    public zzad zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = 0;
    public int zzq = -1;
    public float zzr = 0.0f;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public byte[] zzu = null;
    public int zzv = -1;
    public boolean zzw = false;
    public int zzx = -1;
    public int zzy = -1;
    public int zzz = -1;

    protected zzagi() {
    }

    private static Pair zzf(zzfb zzfb) {
        try {
            zzfb.zzH(16);
            long zzr2 = zzfb.zzr();
            if (zzr2 == 1482049860) {
                return new Pair("video/divx", (Object) null);
            }
            if (zzr2 == 859189832) {
                return new Pair("video/3gpp", (Object) null);
            }
            if (zzr2 == 826496599) {
                int zzc2 = zzfb.zzc() + 20;
                byte[] zzI2 = zzfb.zzI();
                while (true) {
                    int length = zzI2.length;
                    if (zzc2 < length - 4) {
                        int i10 = zzc2 + 1;
                        if (zzI2[zzc2] == 0 && zzI2[i10] == 0 && zzI2[zzc2 + 2] == 1 && zzI2[zzc2 + 3] == 15) {
                            return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(zzI2, zzc2, length)));
                        }
                        zzc2 = i10;
                    } else {
                        throw zzcc.zza("Failed to find FourCC VC1 initialization data", (Throwable) null);
                    }
                }
            } else {
                zzer.zzf("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", (Object) null);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzcc.zza("Error parsing FourCC private data", (Throwable) null);
        }
    }

    private static List zzg(byte[] bArr) {
        byte b10;
        byte b11;
        try {
            if (bArr[0] == 2) {
                int i10 = 1;
                int i11 = 0;
                while (true) {
                    byte b12 = bArr[i10];
                    i10++;
                    b10 = b12 & 255;
                    if (b10 != 255) {
                        break;
                    }
                    i11 += 255;
                }
                int i12 = i11 + b10;
                int i13 = 0;
                while (true) {
                    byte b13 = bArr[i10];
                    i10++;
                    b11 = b13 & 255;
                    if (b11 != 255) {
                        break;
                    }
                    i13 += 255;
                }
                int i14 = i13 + b11;
                if (bArr[i10] == 1) {
                    byte[] bArr2 = new byte[i12];
                    System.arraycopy(bArr, i10, bArr2, 0, i12);
                    int i15 = i10 + i12;
                    if (bArr[i15] == 3) {
                        int i16 = i15 + i14;
                        if (bArr[i16] == 5) {
                            int length = bArr.length - i16;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i16, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw zzcc.zza("Error parsing vorbis codec private", (Throwable) null);
                    }
                    throw zzcc.zza("Error parsing vorbis codec private", (Throwable) null);
                }
                throw zzcc.zza("Error parsing vorbis codec private", (Throwable) null);
            }
            throw zzcc.zza("Error parsing vorbis codec private", (Throwable) null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzcc.zza("Error parsing vorbis codec private", (Throwable) null);
        }
    }

    private static boolean zzh(zzfb zzfb) {
        try {
            int zzj2 = zzfb.zzj();
            if (zzj2 == 1) {
                return true;
            }
            if (zzj2 == 65534) {
                zzfb.zzG(24);
                return zzfb.zzs() == zzagj.zzf.getMostSignificantBits() && zzfb.zzs() == zzagj.zzf.getLeastSignificantBits();
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzcc.zza("Error parsing MS/ACM codec private", (Throwable) null);
        }
    }

    private final byte[] zzi(String str) {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzcc.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), (Throwable) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: com.google.android.gms.internal.ads.zzs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v16, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r13v0 */
    /* JADX WARNING: type inference failed for: r13v3 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x025c, code lost:
        r1 = null;
        r2 = null;
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0299, code lost:
        r1 = null;
        r2 = null;
        r17 = "audio/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02cb, code lost:
        r1 = null;
        r2 = null;
        r3 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x035e, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0393, code lost:
        r3 = -1;
        r10 = -1;
        r19 = r2;
        r2 = r1;
        r1 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03b3, code lost:
        r1 = null;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03b5, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03b6, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03b9, code lost:
        if (r0.zzM == null) goto L_0x03cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03bb, code lost:
        r4 = com.google.android.gms.internal.ads.zzabi.zza(new com.google.android.gms.internal.ads.zzfb(r0.zzM));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03c6, code lost:
        if (r4 == null) goto L_0x03cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03c8, code lost:
        r2 = r4.zza;
        r17 = "video/dolby-vision";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03cc, code lost:
        r4 = r17;
        r5 = r0.zzU;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03d2, code lost:
        if (true == r0.zzT) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03d4, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03d6, code lost:
        r8 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03d7, code lost:
        r5 = r5 | r8;
        r8 = new com.google.android.gms.internal.ads.zzak();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03e1, code lost:
        if (com.google.android.gms.internal.ads.zzcb.zzf(r4) == false) goto L_0x03f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03e3, code lost:
        r8.zzy(r0.zzN);
        r8.zzV(r0.zzP);
        r8.zzP(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03f6, code lost:
        if (com.google.android.gms.internal.ads.zzcb.zzg(r4) == false) goto L_0x0588;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03fa, code lost:
        if (r0.zzp != 0) goto L_0x040e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03fc, code lost:
        r6 = r0.zzn;
        r7 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03ff, code lost:
        if (r6 != -1) goto L_0x0403;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0401, code lost:
        r6 = r0.zzl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0403, code lost:
        r0.zzn = r6;
        r6 = r0.zzo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0407, code lost:
        if (r6 != -1) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0409, code lost:
        r6 = r0.zzm;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x040b, code lost:
        r0.zzo = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x040e, code lost:
        r7 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x040f, code lost:
        r6 = r0.zzn;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0413, code lost:
        if (r6 == r7) goto L_0x0425;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0415, code lost:
        r10 = r0.zzo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0417, code lost:
        if (r10 == r7) goto L_0x0425;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0419, code lost:
        r10 = ((float) (r0.zzm * r6)) / ((float) (r0.zzl * r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0425, code lost:
        r10 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0429, code lost:
        if (r0.zzw == false) goto L_0x04f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x042f, code lost:
        if (r0.zzC == -1.0f) goto L_0x04eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0435, code lost:
        if (r0.zzD == -1.0f) goto L_0x04eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x043b, code lost:
        if (r0.zzE == -1.0f) goto L_0x04eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0441, code lost:
        if (r0.zzF == -1.0f) goto L_0x04eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0447, code lost:
        if (r0.zzG == -1.0f) goto L_0x04eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x044d, code lost:
        if (r0.zzH == -1.0f) goto L_0x04eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0453, code lost:
        if (r0.zzI == -1.0f) goto L_0x04eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0459, code lost:
        if (r0.zzJ == -1.0f) goto L_0x04eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x045f, code lost:
        if (r0.zzK == -1.0f) goto L_0x04eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0465, code lost:
        if (r0.zzL != -1.0f) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0469, code lost:
        r13 = new byte[25];
        r6 = java.nio.ByteBuffer.wrap(r13).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r6.put((byte) 0);
        r6.putShort((short) ((int) ((r0.zzC * 50000.0f) + 0.5f)));
        r6.putShort((short) ((int) ((r0.zzD * 50000.0f) + 0.5f)));
        r6.putShort((short) ((int) ((r0.zzE * 50000.0f) + 0.5f)));
        r6.putShort((short) ((int) ((r0.zzF * 50000.0f) + 0.5f)));
        r6.putShort((short) ((int) ((r0.zzG * 50000.0f) + 0.5f)));
        r6.putShort((short) ((int) ((r0.zzH * 50000.0f) + 0.5f)));
        r6.putShort((short) ((int) ((r0.zzI * 50000.0f) + 0.5f)));
        r6.putShort((short) ((int) ((r0.zzJ * 50000.0f) + 0.5f)));
        r6.putShort((short) ((int) (r0.zzK + 0.5f)));
        r6.putShort((short) ((int) (r0.zzL + 0.5f)));
        r6.putShort((short) r0.zzA);
        r6.putShort((short) r0.zzB);
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04eb, code lost:
        r13 = new com.google.android.gms.internal.ads.zzs(r0.zzx, r0.zzz, r0.zzy, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04f9, code lost:
        if (r0.zza == null) goto L_0x0518;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0505, code lost:
        if (com.google.android.gms.internal.ads.zzagj.zzg.containsKey(r0.zza) == false) goto L_0x0518;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0507, code lost:
        r7 = ((java.lang.Integer) com.google.android.gms.internal.ads.zzagj.zzg.get(r0.zza)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x051a, code lost:
        if (r0.zzq != 0) goto L_0x0568;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0523, code lost:
        if (java.lang.Float.compare(r0.zzr, 0.0f) != 0) goto L_0x0568;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x052b, code lost:
        if (java.lang.Float.compare(r0.zzs, 0.0f) != 0) goto L_0x0568;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0533, code lost:
        if (java.lang.Float.compare(r0.zzt, 0.0f) != 0) goto L_0x0536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x053e, code lost:
        if (java.lang.Float.compare(r0.zzt, 90.0f) != 0) goto L_0x0543;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0540, code lost:
        r11 = 90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x054b, code lost:
        if (java.lang.Float.compare(r0.zzt, -180.0f) == 0) goto L_0x0565;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0555, code lost:
        if (java.lang.Float.compare(r0.zzt, 180.0f) != 0) goto L_0x0558;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0560, code lost:
        if (java.lang.Float.compare(r0.zzt, -90.0f) != 0) goto L_0x0568;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0562, code lost:
        r11 = 270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0565, code lost:
        r11 = 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0568, code lost:
        r11 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0569, code lost:
        r8.zzab(r0.zzl);
        r8.zzH(r0.zzm);
        r8.zzR(r10);
        r8.zzT(r11);
        r8.zzS(r0.zzu);
        r8.zzX(r0.zzv);
        r8.zzA(r13);
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x058c, code lost:
        if ("application/x-subrip".equals(r4) != false) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0592, code lost:
        if ("text/x-ssa".equals(r4) != false) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x059a, code lost:
        if ("text/vtt".equals(r4) != false) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05a2, code lost:
        if ("application/vobsub".equals(r4) != false) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05aa, code lost:
        if ("application/pgs".equals(r4) != false) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x05b2, code lost:
        if ("application/dvbsubs".equals(r4) == false) goto L_0x05b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05bb, code lost:
        throw com.google.android.gms.internal.ads.zzcc.zza("Unexpected MIME type.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05bc, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05bf, code lost:
        if (r0.zza == null) goto L_0x05d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x05cb, code lost:
        if (com.google.android.gms.internal.ads.zzagj.zzg.containsKey(r0.zza) != false) goto L_0x05d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x05cd, code lost:
        r8.zzL(r0.zza);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x05d2, code lost:
        r8.zzI(r22);
        r8.zzU(r4);
        r8.zzN(r3);
        r8.zzM(r0.zzY);
        r8.zzW(r5);
        r8.zzK(r1);
        r8.zzz(r2);
        r8.zzD(r0.zzk);
        r1 = r8.zzac();
        r2 = r21.zzw(r0.zzc, r6);
        r0.zzV = r2;
        r2.zzl(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0601, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zze(com.google.android.gms.internal.ads.zzabp r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            java.lang.String r1 = r0.zzb
            int r2 = r1.hashCode()
            r3 = 24
            r5 = 16
            r6 = 1
            r8 = 32
            r9 = 8
            r10 = 4
            r11 = 0
            r12 = 3
            switch(r2) {
                case -2095576542: goto L_0x018a;
                case -2095575984: goto L_0x0180;
                case -1985379776: goto L_0x0175;
                case -1784763192: goto L_0x016a;
                case -1730367663: goto L_0x015f;
                case -1482641358: goto L_0x0154;
                case -1482641357: goto L_0x0149;
                case -1373388978: goto L_0x013e;
                case -933872740: goto L_0x0133;
                case -538363189: goto L_0x0128;
                case -538363109: goto L_0x011d;
                case -425012669: goto L_0x0111;
                case -356037306: goto L_0x0105;
                case 62923557: goto L_0x00f9;
                case 62923603: goto L_0x00ed;
                case 62927045: goto L_0x00e1;
                case 82318131: goto L_0x00d6;
                case 82338133: goto L_0x00cb;
                case 82338134: goto L_0x00c0;
                case 99146302: goto L_0x00b4;
                case 444813526: goto L_0x00a8;
                case 542569478: goto L_0x009c;
                case 635596514: goto L_0x0090;
                case 725948237: goto L_0x0084;
                case 725957860: goto L_0x0078;
                case 738597099: goto L_0x006c;
                case 855502857: goto L_0x0060;
                case 1045209816: goto L_0x0054;
                case 1422270023: goto L_0x0048;
                case 1809237540: goto L_0x003d;
                case 1950749482: goto L_0x0031;
                case 1950789798: goto L_0x0025;
                case 1951062397: goto L_0x0019;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x0194
        L_0x0019:
            java.lang.String r2 = "A_OPUS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 12
            goto L_0x0195
        L_0x0025:
            java.lang.String r2 = "A_FLAC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 22
            goto L_0x0195
        L_0x0031:
            java.lang.String r2 = "A_EAC3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 17
            goto L_0x0195
        L_0x003d:
            java.lang.String r2 = "V_MPEG2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 3
            goto L_0x0195
        L_0x0048:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 27
            goto L_0x0195
        L_0x0054:
            java.lang.String r2 = "S_TEXT/WEBVTT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 29
            goto L_0x0195
        L_0x0060:
            java.lang.String r2 = "V_MPEGH/ISO/HEVC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 8
            goto L_0x0195
        L_0x006c:
            java.lang.String r2 = "S_TEXT/ASS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 28
            goto L_0x0195
        L_0x0078:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 24
            goto L_0x0195
        L_0x0084:
            java.lang.String r2 = "A_PCM/INT/BIG"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 25
            goto L_0x0195
        L_0x0090:
            java.lang.String r2 = "A_PCM/FLOAT/IEEE"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 26
            goto L_0x0195
        L_0x009c:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 20
            goto L_0x0195
        L_0x00a8:
            java.lang.String r2 = "V_THEORA"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 10
            goto L_0x0195
        L_0x00b4:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 31
            goto L_0x0195
        L_0x00c0:
            java.lang.String r2 = "V_VP9"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 1
            goto L_0x0195
        L_0x00cb:
            java.lang.String r2 = "V_VP8"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 0
            goto L_0x0195
        L_0x00d6:
            java.lang.String r2 = "V_AV1"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 2
            goto L_0x0195
        L_0x00e1:
            java.lang.String r2 = "A_DTS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 19
            goto L_0x0195
        L_0x00ed:
            java.lang.String r2 = "A_AC3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 16
            goto L_0x0195
        L_0x00f9:
            java.lang.String r2 = "A_AAC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 13
            goto L_0x0195
        L_0x0105:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 21
            goto L_0x0195
        L_0x0111:
            java.lang.String r2 = "S_VOBSUB"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 30
            goto L_0x0195
        L_0x011d:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 7
            goto L_0x0195
        L_0x0128:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 5
            goto L_0x0195
        L_0x0133:
            java.lang.String r2 = "S_DVBSUB"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 32
            goto L_0x0195
        L_0x013e:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 9
            goto L_0x0195
        L_0x0149:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 15
            goto L_0x0195
        L_0x0154:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 14
            goto L_0x0195
        L_0x015f:
            java.lang.String r2 = "A_VORBIS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 11
            goto L_0x0195
        L_0x016a:
            java.lang.String r2 = "A_TRUEHD"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 18
            goto L_0x0195
        L_0x0175:
            java.lang.String r2 = "A_MS/ACM"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 23
            goto L_0x0195
        L_0x0180:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 4
            goto L_0x0195
        L_0x018a:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0194
            r2 = 6
            goto L_0x0195
        L_0x0194:
            r2 = -1
        L_0x0195:
            java.lang.String r14 = ". Setting mimeType to audio/x-unknown"
            java.lang.String r15 = "text/x-ssa"
            java.lang.String r7 = "application/x-subrip"
            r16 = 4096(0x1000, float:5.74E-42)
            java.lang.String r17 = "audio/raw"
            java.lang.String r18 = "audio/x-unknown"
            java.lang.String r4 = "MatroskaExtractor"
            r13 = 0
            switch(r2) {
                case 0: goto L_0x03b1;
                case 1: goto L_0x03ae;
                case 2: goto L_0x03ab;
                case 3: goto L_0x03a8;
                case 4: goto L_0x039b;
                case 5: goto L_0x039b;
                case 6: goto L_0x039b;
                case 7: goto L_0x037a;
                case 8: goto L_0x0360;
                case 9: goto L_0x0345;
                case 10: goto L_0x0341;
                case 11: goto L_0x0330;
                case 12: goto L_0x02ed;
                case 13: goto L_0x02d1;
                case 14: goto L_0x02c9;
                case 15: goto L_0x02c6;
                case 16: goto L_0x02c2;
                case 17: goto L_0x02be;
                case 18: goto L_0x02b3;
                case 19: goto L_0x02af;
                case 20: goto L_0x02af;
                case 21: goto L_0x02ab;
                case 22: goto L_0x029f;
                case 23: goto L_0x0261;
                case 24: goto L_0x023a;
                case 25: goto L_0x0209;
                case 26: goto L_0x01ea;
                case 27: goto L_0x01e6;
                case 28: goto L_0x01d3;
                case 29: goto L_0x01cf;
                case 30: goto L_0x01c3;
                case 31: goto L_0x01bf;
                case 32: goto L_0x01ae;
                default: goto L_0x01a7;
            }
        L_0x01a7:
            java.lang.String r1 = "Unrecognized codec identifier."
            com.google.android.gms.internal.ads.zzcc r1 = com.google.android.gms.internal.ads.zzcc.zza(r1, r13)
            throw r1
        L_0x01ae:
            byte[] r2 = new byte[r10]
            byte[] r1 = r0.zzi(r1)
            java.lang.System.arraycopy(r1, r11, r2, r11, r10)
            com.google.android.gms.internal.ads.zzfvs r1 = com.google.android.gms.internal.ads.zzfvs.zzm(r2)
            java.lang.String r17 = "application/dvbsubs"
            goto L_0x035e
        L_0x01bf:
            java.lang.String r17 = "application/pgs"
            goto L_0x03b3
        L_0x01c3:
            byte[] r1 = r0.zzi(r1)
            com.google.android.gms.internal.ads.zzfvs r1 = com.google.android.gms.internal.ads.zzfvs.zzm(r1)
            java.lang.String r17 = "application/vobsub"
            goto L_0x035e
        L_0x01cf:
            java.lang.String r17 = "text/vtt"
            goto L_0x03b3
        L_0x01d3:
            byte[] r1 = com.google.android.gms.internal.ads.zzagj.zzc
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            com.google.android.gms.internal.ads.zzfvs r1 = com.google.android.gms.internal.ads.zzfvs.zzn(r1, r2)
            r2 = r13
            r17 = r15
            goto L_0x03b5
        L_0x01e6:
            r17 = r7
            goto L_0x03b3
        L_0x01ea:
            int r1 = r0.zzO
            if (r1 != r8) goto L_0x01f0
            goto L_0x025c
        L_0x01f0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unsupported floating point PCM bit depth: "
            r2.append(r3)
            r2.append(r1)
            r2.append(r14)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzer.zzf(r4, r1)
            goto L_0x0299
        L_0x0209:
            int r1 = r0.zzO
            if (r1 != r9) goto L_0x0213
            r1 = r13
            r2 = r1
            r3 = -1
            r10 = 3
            goto L_0x03b7
        L_0x0213:
            if (r1 != r5) goto L_0x0218
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x025c
        L_0x0218:
            if (r1 != r3) goto L_0x021d
            r10 = 1342177280(0x50000000, float:8.5899346E9)
            goto L_0x025c
        L_0x021d:
            if (r1 != r8) goto L_0x0222
            r10 = 1610612736(0x60000000, float:3.6893488E19)
            goto L_0x025c
        L_0x0222:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unsupported big endian PCM bit depth: "
            r2.append(r3)
            r2.append(r1)
            r2.append(r14)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzer.zzf(r4, r1)
            goto L_0x0299
        L_0x023a:
            int r1 = r0.zzO
            int r10 = com.google.android.gms.internal.ads.zzfk.zzk(r1)
            if (r10 != 0) goto L_0x025c
            int r1 = r0.zzO
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unsupported little endian PCM bit depth: "
            r2.append(r3)
            r2.append(r1)
            r2.append(r14)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzer.zzf(r4, r1)
            goto L_0x0299
        L_0x025c:
            r1 = r13
            r2 = r1
            r3 = -1
            goto L_0x03b7
        L_0x0261:
            com.google.android.gms.internal.ads.zzfb r1 = new com.google.android.gms.internal.ads.zzfb
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            r1.<init>((byte[]) r2)
            boolean r1 = zzh(r1)
            if (r1 == 0) goto L_0x0294
            int r1 = r0.zzO
            int r10 = com.google.android.gms.internal.ads.zzfk.zzk(r1)
            if (r10 != 0) goto L_0x025c
            int r1 = r0.zzO
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unsupported PCM bit depth: "
            r2.append(r3)
            r2.append(r1)
            r2.append(r14)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzer.zzf(r4, r1)
            goto L_0x0299
        L_0x0294:
            java.lang.String r1 = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown"
            com.google.android.gms.internal.ads.zzer.zzf(r4, r1)
        L_0x0299:
            r1 = r13
            r2 = r1
            r17 = r18
            goto L_0x03b5
        L_0x029f:
            byte[] r1 = r0.zzi(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r17 = "audio/flac"
            goto L_0x035e
        L_0x02ab:
            java.lang.String r17 = "audio/vnd.dts.hd"
            goto L_0x03b3
        L_0x02af:
            java.lang.String r17 = "audio/vnd.dts"
            goto L_0x03b3
        L_0x02b3:
            com.google.android.gms.internal.ads.zzact r1 = new com.google.android.gms.internal.ads.zzact
            r1.<init>()
            r0.zzS = r1
            java.lang.String r17 = "audio/true-hd"
            goto L_0x03b3
        L_0x02be:
            java.lang.String r17 = "audio/eac3"
            goto L_0x03b3
        L_0x02c2:
            java.lang.String r17 = "audio/ac3"
            goto L_0x03b3
        L_0x02c6:
            java.lang.String r17 = "audio/mpeg"
            goto L_0x02cb
        L_0x02c9:
            java.lang.String r17 = "audio/mpeg-L2"
        L_0x02cb:
            r1 = r13
            r2 = r1
            r3 = 4096(0x1000, float:5.74E-42)
            goto L_0x03b6
        L_0x02d1:
            byte[] r1 = r0.zzi(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            byte[] r2 = r0.zzj
            com.google.android.gms.internal.ads.zzaaj r2 = com.google.android.gms.internal.ads.zzaak.zza(r2)
            int r3 = r2.zza
            r0.zzP = r3
            int r3 = r2.zzb
            r0.zzN = r3
            java.lang.String r2 = r2.zzc
            java.lang.String r17 = "audio/mp4a-latm"
            goto L_0x03b5
        L_0x02ed:
            r16 = 5760(0x1680, float:8.071E-42)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r12)
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r9)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r3)
            long r4 = r0.zzQ
            java.nio.ByteBuffer r2 = r2.putLong(r4)
            byte[] r2 = r2.array()
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r9)
            java.nio.ByteBuffer r2 = r2.order(r3)
            long r3 = r0.zzR
            java.nio.ByteBuffer r2 = r2.putLong(r3)
            byte[] r2 = r2.array()
            r1.add(r2)
            java.lang.String r17 = "audio/opus"
            r2 = r13
            r3 = 5760(0x1680, float:8.071E-42)
            goto L_0x03b6
        L_0x0330:
            r16 = 8192(0x2000, float:1.14794E-41)
            byte[] r1 = r0.zzi(r1)
            java.util.List r1 = zzg(r1)
            java.lang.String r17 = "audio/vorbis"
            r2 = r13
            r3 = 8192(0x2000, float:1.14794E-41)
            goto L_0x03b6
        L_0x0341:
            java.lang.String r17 = "video/x-unknown"
            goto L_0x03b3
        L_0x0345:
            com.google.android.gms.internal.ads.zzfb r1 = new com.google.android.gms.internal.ads.zzfb
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            r1.<init>((byte[]) r2)
            android.util.Pair r1 = zzf(r1)
            java.lang.Object r2 = r1.first
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
            java.lang.Object r1 = r1.second
            java.util.List r1 = (java.util.List) r1
        L_0x035e:
            r2 = r13
            goto L_0x03b5
        L_0x0360:
            com.google.android.gms.internal.ads.zzfb r1 = new com.google.android.gms.internal.ads.zzfb
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            r1.<init>((byte[]) r2)
            com.google.android.gms.internal.ads.zzacd r1 = com.google.android.gms.internal.ads.zzacd.zza(r1)
            java.util.List r2 = r1.zza
            int r3 = r1.zzb
            r0.zzW = r3
            java.lang.String r1 = r1.zzg
            java.lang.String r17 = "video/hevc"
            goto L_0x0393
        L_0x037a:
            com.google.android.gms.internal.ads.zzfb r1 = new com.google.android.gms.internal.ads.zzfb
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            r1.<init>((byte[]) r2)
            com.google.android.gms.internal.ads.zzaar r1 = com.google.android.gms.internal.ads.zzaar.zza(r1)
            java.util.List r2 = r1.zza
            int r3 = r1.zzb
            r0.zzW = r3
            java.lang.String r1 = r1.zzi
            java.lang.String r17 = "video/avc"
        L_0x0393:
            r3 = -1
            r10 = -1
            r19 = r2
            r2 = r1
            r1 = r19
            goto L_0x03b7
        L_0x039b:
            byte[] r1 = r0.zzj
            if (r1 != 0) goto L_0x03a1
            r1 = r13
            goto L_0x03a5
        L_0x03a1:
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L_0x03a5:
            java.lang.String r17 = "video/mp4v-es"
            goto L_0x035e
        L_0x03a8:
            java.lang.String r17 = "video/mpeg2"
            goto L_0x03b3
        L_0x03ab:
            java.lang.String r17 = "video/av01"
            goto L_0x03b3
        L_0x03ae:
            java.lang.String r17 = "video/x-vnd.on2.vp9"
            goto L_0x03b3
        L_0x03b1:
            java.lang.String r17 = "video/x-vnd.on2.vp8"
        L_0x03b3:
            r1 = r13
            r2 = r1
        L_0x03b5:
            r3 = -1
        L_0x03b6:
            r10 = -1
        L_0x03b7:
            byte[] r4 = r0.zzM
            if (r4 == 0) goto L_0x03cc
            com.google.android.gms.internal.ads.zzfb r4 = new com.google.android.gms.internal.ads.zzfb
            byte[] r5 = r0.zzM
            r4.<init>((byte[]) r5)
            com.google.android.gms.internal.ads.zzabi r4 = com.google.android.gms.internal.ads.zzabi.zza(r4)
            if (r4 == 0) goto L_0x03cc
            java.lang.String r2 = r4.zza
            java.lang.String r17 = "video/dolby-vision"
        L_0x03cc:
            r4 = r17
            boolean r5 = r0.zzU
            boolean r8 = r0.zzT
            if (r6 == r8) goto L_0x03d6
            r8 = 0
            goto L_0x03d7
        L_0x03d6:
            r8 = 2
        L_0x03d7:
            r5 = r5 | r8
            com.google.android.gms.internal.ads.zzak r8 = new com.google.android.gms.internal.ads.zzak
            r8.<init>()
            boolean r9 = com.google.android.gms.internal.ads.zzcb.zzf(r4)
            if (r9 == 0) goto L_0x03f2
            int r7 = r0.zzN
            r8.zzy(r7)
            int r7 = r0.zzP
            r8.zzV(r7)
            r8.zzP(r10)
            goto L_0x05bd
        L_0x03f2:
            boolean r6 = com.google.android.gms.internal.ads.zzcb.zzg(r4)
            if (r6 == 0) goto L_0x0588
            int r6 = r0.zzp
            if (r6 != 0) goto L_0x040e
            int r6 = r0.zzn
            r7 = -1
            if (r6 != r7) goto L_0x0403
            int r6 = r0.zzl
        L_0x0403:
            r0.zzn = r6
            int r6 = r0.zzo
            if (r6 != r7) goto L_0x040b
            int r6 = r0.zzm
        L_0x040b:
            r0.zzo = r6
            goto L_0x040f
        L_0x040e:
            r7 = -1
        L_0x040f:
            int r6 = r0.zzn
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r6 == r7) goto L_0x0425
            int r10 = r0.zzo
            if (r10 == r7) goto L_0x0425
            int r12 = r0.zzm
            int r12 = r12 * r6
            int r6 = r0.zzl
            int r6 = r6 * r10
            float r10 = (float) r12
            float r6 = (float) r6
            float r10 = r10 / r6
            goto L_0x0427
        L_0x0425:
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0427:
            boolean r6 = r0.zzw
            if (r6 == 0) goto L_0x04f7
            float r6 = r0.zzC
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x04eb
            float r6 = r0.zzD
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x04eb
            float r6 = r0.zzE
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x04eb
            float r6 = r0.zzF
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x04eb
            float r6 = r0.zzG
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x04eb
            float r6 = r0.zzH
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x04eb
            float r6 = r0.zzI
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x04eb
            float r6 = r0.zzJ
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x04eb
            float r6 = r0.zzK
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x04eb
            float r6 = r0.zzL
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x0469
            goto L_0x04eb
        L_0x0469:
            r6 = 25
            byte[] r13 = new byte[r6]
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r13)
            java.nio.ByteOrder r9 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r6 = r6.order(r9)
            r6.put(r11)
            float r9 = r0.zzC
            r12 = 1195593728(0x47435000, float:50000.0)
            float r9 = r9 * r12
            r14 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzD
            float r9 = r9 * r12
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzE
            float r9 = r9 * r12
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzF
            float r9 = r9 * r12
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzG
            float r9 = r9 * r12
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzH
            float r9 = r9 * r12
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzI
            float r9 = r9 * r12
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzJ
            float r9 = r9 * r12
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzK
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzL
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            int r9 = r0.zzA
            short r9 = (short) r9
            r6.putShort(r9)
            int r9 = r0.zzB
            short r9 = (short) r9
            r6.putShort(r9)
        L_0x04eb:
            com.google.android.gms.internal.ads.zzs r6 = new com.google.android.gms.internal.ads.zzs
            int r9 = r0.zzx
            int r12 = r0.zzz
            int r14 = r0.zzy
            r6.<init>(r9, r12, r14, r13)
            r13 = r6
        L_0x04f7:
            java.lang.String r6 = r0.zza
            if (r6 == 0) goto L_0x0518
            java.util.Map r6 = com.google.android.gms.internal.ads.zzagj.zzg
            java.lang.String r9 = r0.zza
            boolean r6 = r6.containsKey(r9)
            if (r6 == 0) goto L_0x0518
            java.util.Map r6 = com.google.android.gms.internal.ads.zzagj.zzg
            java.lang.String r7 = r0.zza
            java.lang.Object r6 = r6.get(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r7 = r6
        L_0x0518:
            int r6 = r0.zzq
            if (r6 != 0) goto L_0x0568
            float r6 = r0.zzr
            r9 = 0
            int r6 = java.lang.Float.compare(r6, r9)
            if (r6 != 0) goto L_0x0568
            float r6 = r0.zzs
            int r6 = java.lang.Float.compare(r6, r9)
            if (r6 != 0) goto L_0x0568
            float r6 = r0.zzt
            int r6 = java.lang.Float.compare(r6, r9)
            if (r6 != 0) goto L_0x0536
            goto L_0x0569
        L_0x0536:
            float r6 = r0.zzt
            r9 = 1119092736(0x42b40000, float:90.0)
            int r6 = java.lang.Float.compare(r6, r9)
            if (r6 != 0) goto L_0x0543
            r11 = 90
            goto L_0x0569
        L_0x0543:
            float r6 = r0.zzt
            r9 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r6 = java.lang.Float.compare(r6, r9)
            if (r6 == 0) goto L_0x0565
            float r6 = r0.zzt
            r9 = 1127481344(0x43340000, float:180.0)
            int r6 = java.lang.Float.compare(r6, r9)
            if (r6 != 0) goto L_0x0558
            goto L_0x0565
        L_0x0558:
            float r6 = r0.zzt
            r9 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r6 = java.lang.Float.compare(r6, r9)
            if (r6 != 0) goto L_0x0568
            r11 = 270(0x10e, float:3.78E-43)
            goto L_0x0569
        L_0x0565:
            r11 = 180(0xb4, float:2.52E-43)
            goto L_0x0569
        L_0x0568:
            r11 = r7
        L_0x0569:
            int r6 = r0.zzl
            r8.zzab(r6)
            int r6 = r0.zzm
            r8.zzH(r6)
            r8.zzR(r10)
            r8.zzT(r11)
            byte[] r6 = r0.zzu
            r8.zzS(r6)
            int r6 = r0.zzv
            r8.zzX(r6)
            r8.zzA(r13)
            r6 = 2
            goto L_0x05bd
        L_0x0588:
            boolean r6 = r7.equals(r4)
            if (r6 != 0) goto L_0x05bc
            boolean r6 = r15.equals(r4)
            if (r6 != 0) goto L_0x05bc
            java.lang.String r6 = "text/vtt"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x05bc
            java.lang.String r6 = "application/vobsub"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x05bc
            java.lang.String r6 = "application/pgs"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x05bc
            java.lang.String r6 = "application/dvbsubs"
            boolean r6 = r6.equals(r4)
            if (r6 == 0) goto L_0x05b5
            goto L_0x05bc
        L_0x05b5:
            java.lang.String r1 = "Unexpected MIME type."
            com.google.android.gms.internal.ads.zzcc r1 = com.google.android.gms.internal.ads.zzcc.zza(r1, r13)
            throw r1
        L_0x05bc:
            r6 = 3
        L_0x05bd:
            java.lang.String r7 = r0.zza
            if (r7 == 0) goto L_0x05d2
            java.util.Map r7 = com.google.android.gms.internal.ads.zzagj.zzg
            java.lang.String r9 = r0.zza
            boolean r7 = r7.containsKey(r9)
            if (r7 != 0) goto L_0x05d2
            java.lang.String r7 = r0.zza
            r8.zzL(r7)
        L_0x05d2:
            r7 = r22
            r8.zzI(r7)
            r8.zzU(r4)
            r8.zzN(r3)
            java.lang.String r3 = r0.zzY
            r8.zzM(r3)
            r8.zzW(r5)
            r8.zzK(r1)
            r8.zzz(r2)
            com.google.android.gms.internal.ads.zzad r1 = r0.zzk
            r8.zzD(r1)
            com.google.android.gms.internal.ads.zzam r1 = r8.zzac()
            int r2 = r0.zzc
            r3 = r21
            com.google.android.gms.internal.ads.zzacs r2 = r3.zzw(r2, r6)
            r0.zzV = r2
            r2.zzl(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagi.zze(com.google.android.gms.internal.ads.zzabp, int):void");
    }
}
