package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzabj {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, UserVerificationMethods.USER_VERIFY_HANDPRINT, 384, 448, 512, 640, 768, 896, 1024, 1152, PlatformPlugin.DEFAULT_SYSTEM_UI, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static zzam zza(byte[] bArr, String str, String str2, zzad zzad) {
        zzfa zzfa;
        int i10 = 0;
        int i11 = -1;
        if (bArr[0] == Byte.MAX_VALUE) {
            zzfa = new zzfa(bArr, bArr.length);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b10 = copyOf[0];
            if (b10 == -2 || b10 == -1) {
                for (int i12 = 0; i12 < copyOf.length - 1; i12 += 2) {
                    byte b11 = copyOf[i12];
                    int i13 = i12 + 1;
                    copyOf[i12] = copyOf[i13];
                    copyOf[i13] = b11;
                }
            }
            int length = copyOf.length;
            zzfa = new zzfa(copyOf, length);
            if (copyOf[0] == 31) {
                zzfa zzfa2 = new zzfa(copyOf, length);
                while (zzfa2.zza() >= 16) {
                    zzfa2.zzl(2);
                    zzfa.zzf(zzfa2.zzd(14), 14);
                }
            }
            zzfa.zzi(copyOf, copyOf.length);
        }
        zzfa.zzl(60);
        int i14 = zzb[zzfa.zzd(6)];
        int i15 = zzc[zzfa.zzd(4)];
        int zzd2 = zzfa.zzd(5);
        if (zzd2 < 29) {
            i11 = (zzd[zzd2] * 1000) / 2;
        }
        zzfa.zzl(10);
        if (zzfa.zzd(2) > 0) {
            i10 = 1;
        }
        int i16 = i14 + i10;
        zzak zzak = new zzak();
        zzak.zzJ(str);
        zzak.zzU("audio/vnd.dts");
        zzak.zzx(i11);
        zzak.zzy(i16);
        zzak.zzV(i15);
        zzak.zzD((zzad) null);
        zzak.zzM(str2);
        return zzak.zzac();
    }
}
