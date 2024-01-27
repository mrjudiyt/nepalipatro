package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfea {
    public zzfea() {
        try {
            zzgcj.zza();
        } catch (GeneralSecurityException e10) {
            zze.zza("Failed to Configure Aead. ".concat(e10.toString()));
            zzt.zzo().zzu(e10, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        zzgso zzt = zzgsr.zzt();
        try {
            zzgba.zzb(zzgbs.zzc(zzgbl.zza("AES128_GCM").zzb()), zzgaz.zzb(zzt));
        } catch (IOException | GeneralSecurityException e10) {
            zze.zza("Failed to generate key".concat(e10.toString()));
            zzt.zzo().zzu(e10, "CryptoUtils.generateKey");
        }
        String encodeToString = Base64.encodeToString(zzt.zzb().zzA(), 11);
        zzt.zzc();
        return encodeToString;
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdsj zzdsj) {
        zzgbs zzc = zzc(str);
        if (zzc == null) {
            return null;
        }
        try {
            byte[] zza = ((zzgax) zzc.zze(zzgjg.zza(), zzgax.class)).zza(bArr, bArr2);
            zzdsj.zza().put("ds", AppEventsConstants.EVENT_PARAM_VALUE_YES);
            return new String(zza, "UTF-8");
        } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
            zze.zza("Failed to decrypt ".concat(e10.toString()));
            zzt.zzo().zzu(e10, "CryptoUtils.decrypt");
            zzdsj.zza().put("dsf", e10.toString());
            return null;
        }
    }

    private static final zzgbs zzc(String str) {
        try {
            return zzgba.zza(zzgay.zzb(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e10) {
            zze.zza("Failed to get keysethandle".concat(e10.toString()));
            zzt.zzo().zzu(e10, "CryptoUtils.getHandle");
            return null;
        }
    }
}
