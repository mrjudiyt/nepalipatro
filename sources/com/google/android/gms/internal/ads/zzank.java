package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzank extends zzamg {
    private final Object zza = new Object();
    private final zzaml zzb;

    public zzank(int i10, String str, zzaml zzaml, zzamk zzamk) {
        super(i10, str, zzamk);
        this.zzb = zzaml;
    }

    /* access modifiers changed from: protected */
    public final zzamm zzh(zzamc zzamc) {
        String str;
        try {
            byte[] bArr = zzamc.zzb;
            Map map = zzamc.zzc;
            String str2 = "ISO-8859-1";
            if (map != null) {
                String str3 = (String) map.get("Content-Type");
                if (str3 != null) {
                    String[] split = str3.split(";", 0);
                    int i10 = 1;
                    while (true) {
                        if (i10 >= split.length) {
                            break;
                        }
                        String[] split2 = split[i10].trim().split("=", 0);
                        if (split2.length == 2 && split2[0].equals("charset")) {
                            str2 = split2[1];
                            break;
                        }
                        i10++;
                    }
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzamc.zzb);
        }
        return zzamm.zzb(str, zzand.zzb(zzamc));
    }

    /* access modifiers changed from: protected */
    /* renamed from: zzz */
    public void zzo(String str) {
        zzaml zzaml;
        synchronized (this.zza) {
            zzaml = this.zzb;
        }
        zzaml.zza(str);
    }
}
