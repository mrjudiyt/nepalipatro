package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzajb implements zzakp {
    private final List zza;

    public zzajb() {
        this(0);
    }

    public zzajb(int i10, List list) {
        this.zza = list;
    }

    private final zzakf zzb(zzako zzako) {
        return new zzakf(zzd(zzako));
    }

    private final zzakt zzc(zzako zzako) {
        return new zzakt(zzd(zzako));
    }

    private final List zzd(zzako zzako) {
        String str;
        int i10;
        List list;
        zzfb zzfb = new zzfb(zzako.zzd);
        List list2 = this.zza;
        while (zzfb.zza() > 0) {
            int zzl = zzfb.zzl();
            int zzc = zzfb.zzc() + zzfb.zzl();
            if (zzl == 134) {
                list2 = new ArrayList();
                int zzl2 = zzfb.zzl() & 31;
                for (int i11 = 0; i11 < zzl2; i11++) {
                    String zzy = zzfb.zzy(3, zzfsi.zzc);
                    int zzl3 = zzfb.zzl();
                    boolean z10 = (zzl3 & 128) != 0;
                    if (z10) {
                        i10 = zzl3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte zzl4 = (byte) zzfb.zzl();
                    zzfb.zzH(1);
                    if (z10) {
                        byte b10 = zzl4 & 64;
                        int i12 = zzdz.zza;
                        list = Collections.singletonList(b10 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzak zzak = new zzak();
                    zzak.zzU(str);
                    zzak.zzM(zzy);
                    zzak.zzw(i10);
                    zzak.zzK(list);
                    list2.add(zzak.zzac());
                }
            }
            zzfb.zzG(zzc);
        }
        return list2;
    }

    public final zzakr zza(int i10, zzako zzako) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new zzajv(new zzajs(zzako.zzb));
            }
            if (i10 == 21) {
                return new zzajv(new zzajq());
            }
            if (i10 == 27) {
                return new zzajv(new zzajn(zzb(zzako), false, false));
            }
            if (i10 == 36) {
                return new zzajv(new zzajp(zzb(zzako)));
            }
            if (i10 == 89) {
                return new zzajv(new zzajd(zzako.zzc));
            }
            if (i10 == 138) {
                return new zzajv(new zzajc(zzako.zzb));
            }
            if (i10 == 172) {
                return new zzajv(new zzaix(zzako.zzb));
            }
            if (i10 == 257) {
                return new zzake(new zzaju("application/vnd.dvb.ait"));
            }
            if (i10 != 128) {
                if (i10 != 129) {
                    if (i10 == 134) {
                        return new zzake(new zzaju("application/x-scte35"));
                    }
                    if (i10 != 135) {
                        switch (i10) {
                            case 15:
                                return new zzajv(new zzaja(false, zzako.zzb));
                            case 16:
                                return new zzajv(new zzajj(zzc(zzako)));
                            case 17:
                                return new zzajv(new zzajr(zzako.zzb));
                            default:
                                return null;
                        }
                    }
                }
                return new zzajv(new zzaiu(zzako.zzb));
            }
        }
        return new zzajv(new zzajg(zzc(zzako)));
    }

    public zzajb(int i10) {
        this.zza = zzfvs.zzl();
    }
}
