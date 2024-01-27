package com.google.android.gms.internal.ads;

import android.os.IBinder;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfeo {
    public static zze zza(Throwable th) {
        if (th instanceof zzeey) {
            zzeey zzeey = (zzeey) th;
            return zzc(zzeey.zza(), zzeey.zzb());
        } else if (th instanceof zzdwm) {
            if (th.getMessage() == null) {
                return zzd(((zzdwm) th).zza(), (String) null, (zze) null);
            }
            return zzd(((zzdwm) th).zza(), th.getMessage(), (zze) null);
        } else if (!(th instanceof zzba)) {
            return zzd(1, (String) null, (zze) null);
        } else {
            zzba zzba = (zzba) th;
            return new zze(zzba.zza(), zzftl.zzc(zzba.getMessage()), MobileAds.ERROR_DOMAIN, (zze) null, (IBinder) null);
        }
    }

    public static zze zzb(Throwable th, zzeez zzeez) {
        zze zze;
        zze zza = zza(th);
        int i10 = zza.zza;
        if ((i10 == 3 || i10 == 0) && (zze = zza.zzd) != null && !zze.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zza.zzd = null;
        }
        if (zzeez != null) {
            zza.zze = zzeez.zzb();
        }
        return zza;
    }

    public static zze zzc(int i10, zze zze) {
        if (i10 != 0) {
            if (i10 == 8) {
                if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzia)).intValue() > 0) {
                    return zze;
                }
                i10 = 8;
            }
            return zzd(i10, (String) null, zze);
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        r5 = "No fill.";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.ads.internal.client.zze zzd(int r9, java.lang.String r10, com.google.android.gms.ads.internal.client.zze r11) {
        /*
            int r0 = r9 + -1
            java.lang.String r1 = "No fill."
            r2 = 0
            if (r10 != 0) goto L_0x0054
            if (r9 == 0) goto L_0x0053
            switch(r0) {
                case 1: goto L_0x0050;
                case 2: goto L_0x004e;
                case 3: goto L_0x004b;
                case 4: goto L_0x0048;
                case 5: goto L_0x0045;
                case 6: goto L_0x0042;
                case 7: goto L_0x003f;
                case 8: goto L_0x003c;
                case 9: goto L_0x0039;
                case 10: goto L_0x0036;
                case 11: goto L_0x000c;
                case 12: goto L_0x0021;
                case 13: goto L_0x001e;
                case 14: goto L_0x001b;
                case 15: goto L_0x0018;
                case 16: goto L_0x0015;
                case 17: goto L_0x0012;
                case 18: goto L_0x000f;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.String r10 = "Internal error."
            goto L_0x0054
        L_0x000f:
            java.lang.String r10 = "Ad inspector cannot be opened because it is already open."
            goto L_0x0054
        L_0x0012:
            java.lang.String r10 = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information."
            goto L_0x0054
        L_0x0015:
            java.lang.String r10 = "Ad inspector failed to load."
            goto L_0x0054
        L_0x0018:
            java.lang.String r10 = "Ad inspector had an internal error."
            goto L_0x0054
        L_0x001b:
            java.lang.String r10 = "Invalid ad string."
            goto L_0x0054
        L_0x001e:
            java.lang.String r10 = "Mismatch request IDs."
            goto L_0x0054
        L_0x0021:
            com.google.android.gms.internal.ads.zzbca r10 = com.google.android.gms.internal.ads.zzbci.zzid
            com.google.android.gms.internal.ads.zzbcg r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r10 = r3.zzb(r10)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r10 > 0) goto L_0x004e
            java.lang.String r10 = "The mediation adapter did not return an ad."
            goto L_0x0054
        L_0x0036:
            java.lang.String r10 = "The ad can not be shown when app is not in foreground."
            goto L_0x0054
        L_0x0039:
            java.lang.String r10 = "The ad has already been shown."
            goto L_0x0054
        L_0x003c:
            java.lang.String r10 = "The ad is not ready."
            goto L_0x0054
        L_0x003f:
            java.lang.String r10 = "A mediation adapter failed to show the ad."
            goto L_0x0054
        L_0x0042:
            java.lang.String r10 = "Invalid request: Invalid ad size."
            goto L_0x0054
        L_0x0045:
            java.lang.String r10 = "Invalid request: Invalid ad unit ID."
            goto L_0x0054
        L_0x0048:
            java.lang.String r10 = "Network error."
            goto L_0x0054
        L_0x004b:
            java.lang.String r10 = "App ID missing."
            goto L_0x0054
        L_0x004e:
            r5 = r1
            goto L_0x0055
        L_0x0050:
            java.lang.String r10 = "Invalid request."
            goto L_0x0054
        L_0x0053:
            throw r2
        L_0x0054:
            r5 = r10
        L_0x0055:
            com.google.android.gms.ads.internal.client.zze r10 = new com.google.android.gms.ads.internal.client.zze
            if (r9 == 0) goto L_0x00df
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = 3
            switch(r0) {
                case 0: goto L_0x0096;
                case 1: goto L_0x0094;
                case 2: goto L_0x0097;
                case 3: goto L_0x008f;
                case 4: goto L_0x008d;
                case 5: goto L_0x0094;
                case 6: goto L_0x0094;
                case 7: goto L_0x008a;
                case 8: goto L_0x008d;
                case 9: goto L_0x0094;
                case 10: goto L_0x0097;
                case 11: goto L_0x0096;
                case 12: goto L_0x0073;
                case 13: goto L_0x006e;
                case 14: goto L_0x0069;
                case 15: goto L_0x0096;
                case 16: goto L_0x0094;
                case 17: goto L_0x008d;
                case 18: goto L_0x0097;
                default: goto L_0x0060;
            }
        L_0x0060:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            switch(r9) {
                case 1: goto L_0x00d3;
                case 2: goto L_0x00d0;
                case 3: goto L_0x00cd;
                case 4: goto L_0x00ca;
                case 5: goto L_0x00c7;
                case 6: goto L_0x00c4;
                case 7: goto L_0x00c1;
                case 8: goto L_0x00be;
                case 9: goto L_0x00bb;
                case 10: goto L_0x00b8;
                case 11: goto L_0x00b5;
                case 12: goto L_0x00b2;
                case 13: goto L_0x00af;
                case 14: goto L_0x00ac;
                case 15: goto L_0x00a9;
                case 16: goto L_0x00a6;
                case 17: goto L_0x00a3;
                case 18: goto L_0x00a0;
                default: goto L_0x0065;
            }
        L_0x0065:
            java.lang.String r9 = "AD_INSPECTOR_ALREADY_OPEN"
            goto L_0x00d5
        L_0x0069:
            r9 = 11
            r4 = 11
            goto L_0x0097
        L_0x006e:
            r9 = 10
            r4 = 10
            goto L_0x0097
        L_0x0073:
            com.google.android.gms.internal.ads.zzbca r9 = com.google.android.gms.internal.ads.zzbci.zzid
            com.google.android.gms.internal.ads.zzbcg r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r9 = r0.zzb(r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r9 > 0) goto L_0x0097
            r9 = 9
            r4 = 9
            goto L_0x0097
        L_0x008a:
            r9 = 4
            r4 = 4
            goto L_0x0097
        L_0x008d:
            r4 = 2
            goto L_0x0097
        L_0x008f:
            r9 = 8
            r4 = 8
            goto L_0x0097
        L_0x0094:
            r4 = 1
            goto L_0x0097
        L_0x0096:
            r4 = 0
        L_0x0097:
            r8 = 0
            java.lang.String r6 = "com.google.android.gms.ads"
            r3 = r10
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        L_0x00a0:
            java.lang.String r9 = "AD_INSPECTOR_NOT_IN_TEST_MODE"
            goto L_0x00d5
        L_0x00a3:
            java.lang.String r9 = "AD_INSPECTOR_FAILED_TO_LOAD"
            goto L_0x00d5
        L_0x00a6:
            java.lang.String r9 = "AD_INSPECTOR_INTERNAL_ERROR"
            goto L_0x00d5
        L_0x00a9:
            java.lang.String r9 = "INVALID_AD_STRING"
            goto L_0x00d5
        L_0x00ac:
            java.lang.String r9 = "REQUEST_ID_MISMATCH"
            goto L_0x00d5
        L_0x00af:
            java.lang.String r9 = "MEDIATION_NO_FILL"
            goto L_0x00d5
        L_0x00b2:
            java.lang.String r9 = "INTERNAL_SHOW_ERROR"
            goto L_0x00d5
        L_0x00b5:
            java.lang.String r9 = "APP_NOT_FOREGROUND"
            goto L_0x00d5
        L_0x00b8:
            java.lang.String r9 = "AD_REUSED"
            goto L_0x00d5
        L_0x00bb:
            java.lang.String r9 = "NOT_READY"
            goto L_0x00d5
        L_0x00be:
            java.lang.String r9 = "MEDIATION_SHOW_ERROR"
            goto L_0x00d5
        L_0x00c1:
            java.lang.String r9 = "INVALID_AD_SIZE"
            goto L_0x00d5
        L_0x00c4:
            java.lang.String r9 = "INVALID_AD_UNIT_ID"
            goto L_0x00d5
        L_0x00c7:
            java.lang.String r9 = "NETWORK_ERROR"
            goto L_0x00d5
        L_0x00ca:
            java.lang.String r9 = "APP_ID_MISSING"
            goto L_0x00d5
        L_0x00cd:
            java.lang.String r9 = "NO_FILL"
            goto L_0x00d5
        L_0x00d0:
            java.lang.String r9 = "INVALID_REQUEST"
            goto L_0x00d5
        L_0x00d3:
            java.lang.String r9 = "INTERNAL_ERROR"
        L_0x00d5:
            java.lang.String r11 = "Unknown SdkError: "
            java.lang.String r9 = r11.concat(r9)
            r10.<init>(r9)
            throw r10
        L_0x00df:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfeo.zzd(int, java.lang.String, com.google.android.gms.ads.internal.client.zze):com.google.android.gms.ads.internal.client.zze");
    }
}
