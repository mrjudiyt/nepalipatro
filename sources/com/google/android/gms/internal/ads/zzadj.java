package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzadj implements zzadb {
    public final zzfvs zza;
    private final int zzb;

    private zzadj(int i10, zzfvs zzfvs) {
        this.zzb = i10;
        this.zza = zzfvs;
    }

    public static zzadj zzc(int i10, zzfb zzfb) {
        String str;
        zzfb zzfb2 = zzfb;
        zzfvp zzfvp = new zzfvp();
        int zzd = zzfb.zzd();
        int i11 = -2;
        while (zzfb.zza() > 8) {
            int zzh = zzfb.zzh();
            int zzc = zzfb.zzc() + zzfb.zzh();
            zzfb2.zzF(zzc);
            zzadb zzadb = null;
            if (zzh != 1414744396) {
                switch (zzh) {
                    case 1718776947:
                        if (i11 != 2) {
                            if (i11 != 1) {
                                zzer.zzf("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzfk.zzA(i11)));
                                break;
                            } else {
                                int zzj = zzfb.zzj();
                                String str2 = zzj != 1 ? zzj != 85 ? zzj != 255 ? zzj != 8192 ? zzj != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int zzj2 = zzfb.zzj();
                                    int zzh2 = zzfb.zzh();
                                    zzfb2.zzH(6);
                                    int zzk = zzfk.zzk(zzfb.zzp());
                                    int zzj3 = zzfb.zzj();
                                    byte[] bArr = new byte[zzj3];
                                    zzfb2.zzC(bArr, 0, zzj3);
                                    zzak zzak = new zzak();
                                    zzak.zzU(str2);
                                    zzak.zzy(zzj2);
                                    zzak.zzV(zzh2);
                                    if ("audio/raw".equals(str2) && zzk != 0) {
                                        zzak.zzP(zzk);
                                    }
                                    if ("audio/mp4a-latm".equals(str2) && zzj3 > 0) {
                                        zzak.zzK(zzfvs.zzm(bArr));
                                    }
                                    zzadb = new zzadk(zzak.zzac());
                                    break;
                                } else {
                                    zzer.zzf("StreamFormatChunk", "Ignoring track with unsupported format tag " + zzj);
                                    break;
                                }
                            }
                        } else {
                            zzfb2.zzH(4);
                            int zzh3 = zzfb.zzh();
                            int zzh4 = zzfb.zzh();
                            zzfb2.zzH(4);
                            int zzh5 = zzfb.zzh();
                            switch (zzh5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                zzak zzak2 = new zzak();
                                zzak2.zzab(zzh3);
                                zzak2.zzH(zzh4);
                                zzak2.zzU(str);
                                zzadb = new zzadk(zzak2.zzac());
                                break;
                            } else {
                                zzer.zzf("StreamFormatChunk", "Ignoring track with unsupported compression " + zzh5);
                                break;
                            }
                        }
                    case 1751742049:
                        zzadb = zzadg.zzb(zzfb);
                        break;
                    case 1752331379:
                        zzadb = zzadh.zzb(zzfb);
                        break;
                    case 1852994675:
                        zzadb = zzadl.zzb(zzfb);
                        break;
                }
            } else {
                zzadb = zzc(zzfb.zzh(), zzfb2);
            }
            if (zzadb != null) {
                if (zzadb.zza() == 1752331379) {
                    int i12 = ((zzadh) zzadb).zza;
                    if (i12 == 1935960438) {
                        i11 = 2;
                    } else if (i12 == 1935963489) {
                        i11 = 1;
                    } else if (i12 != 1937012852) {
                        zzer.zzf("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i12))));
                        i11 = -1;
                    } else {
                        i11 = 3;
                    }
                }
                zzfvp.zzf(zzadb);
            }
            zzfb2.zzG(zzc);
            zzfb2.zzF(zzd);
        }
        return new zzadj(i10, zzfvp.zzi());
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzadb zzb(Class cls) {
        zzfvs zzfvs = this.zza;
        int size = zzfvs.size();
        int i10 = 0;
        while (i10 < size) {
            zzadb zzadb = (zzadb) zzfvs.get(i10);
            i10++;
            if (zzadb.getClass() == cls) {
                return zzadb;
            }
        }
        return null;
    }
}
