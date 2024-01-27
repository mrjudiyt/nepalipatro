package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzoc;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class zzfr extends zzic {
    /* access modifiers changed from: private */
    public char zza = 0;
    /* access modifiers changed from: private */
    public long zzb = -1;
    private String zzc;
    private final zzft zzd = new zzft(this, 6, false, false);
    private final zzft zze = new zzft(this, 6, true, false);
    private final zzft zzf = new zzft(this, 6, false, true);
    private final zzft zzg = new zzft(this, 5, false, false);
    private final zzft zzh = new zzft(this, 5, true, false);
    private final zzft zzi = new zzft(this, 5, false, true);
    private final zzft zzj = new zzft(this, 4, false, false);
    private final zzft zzk = new zzft(this, 3, false, false);
    private final zzft zzl = new zzft(this, 2, false, false);

    zzfr(zzhf zzhf) {
        super(zzhf);
    }

    private final String zzy() {
        String str;
        synchronized (this) {
            if (this.zzc == null) {
                this.zzc = this.zzu.zzw() != null ? this.zzu.zzw() : "FA";
            }
            Preconditions.checkNotNull(this.zzc);
            str = this.zzc;
        }
        return str;
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    public final zzft zzc() {
        return this.zzk;
    }

    public final /* bridge */ /* synthetic */ zzae zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ zzaf zze() {
        return super.zze();
    }

    public final /* bridge */ /* synthetic */ zzba zzf() {
        return super.zzf();
    }

    public final zzft zzg() {
        return this.zzd;
    }

    public final zzft zzh() {
        return this.zzf;
    }

    public final /* bridge */ /* synthetic */ zzfq zzi() {
        return super.zzi();
    }

    public final /* bridge */ /* synthetic */ zzfr zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ zzgd zzk() {
        return super.zzk();
    }

    public final /* bridge */ /* synthetic */ zzgy zzl() {
        return super.zzl();
    }

    public final zzft zzm() {
        return this.zze;
    }

    public final zzft zzn() {
        return this.zzj;
    }

    /* access modifiers changed from: protected */
    public final boolean zzo() {
        return false;
    }

    public final zzft zzp() {
        return this.zzl;
    }

    public final /* bridge */ /* synthetic */ zznd zzq() {
        return super.zzq();
    }

    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    public final zzft zzu() {
        return this.zzg;
    }

    public final zzft zzv() {
        return this.zzi;
    }

    public final zzft zzw() {
        return this.zzh;
    }

    public final String zzx() {
        Pair<String, Long> zza2;
        if (zzk().zzb == null || (zza2 = zzk().zzb.zza()) == null || zza2 == zzgd.zza) {
            return null;
        }
        String valueOf = String.valueOf(zza2.second);
        return valueOf + CertificateUtil.DELIMITER + ((String) zza2.first);
    }

    protected static Object zza(String str) {
        if (str == null) {
            return null;
        }
        return new zzfw(str);
    }

    private static String zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            return str.substring(0, lastIndexOf);
        }
        if (!zzoc.zza() || !zzbi.zzcb.zza(null).booleanValue()) {
            return str;
        }
        return "";
    }

    static String zza(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String zza2 = zza(z10, obj);
        String zza3 = zza(z10, obj2);
        String zza4 = zza(z10, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(zza2)) {
            sb.append(str2);
            sb.append(zza2);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(zza3)) {
            sb.append(str2);
            sb.append(zza3);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(zza4)) {
            sb.append(str3);
            sb.append(zza4);
        }
        return sb.toString();
    }

    private static String zza(boolean z10, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return String.valueOf(obj);
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            return str + round + "..." + str + round2;
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb = new StringBuilder(z10 ? th.getClass().getName() : th.toString());
                String zzb2 = zzb(zzhf.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i10];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzb(className).equals(zzb2)) {
                        sb.append(": ");
                        sb.append(stackTraceElement);
                        break;
                    }
                    i10++;
                }
                return sb.toString();
            } else if (obj instanceof zzfw) {
                return ((zzfw) obj).zza;
            } else {
                if (z10) {
                    return "-";
                }
                return String.valueOf(obj);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zza(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && zza(i10)) {
            zza(i10, zza(false, str, obj, obj2, obj3));
        }
        if (!z11 && i10 >= 5) {
            Preconditions.checkNotNull(str);
            zzgy zzo = this.zzu.zzo();
            if (zzo == null) {
                zza(6, "Scheduler not set. Not logging error/warn");
            } else if (!zzo.zzae()) {
                zza(6, "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i10 < 0) {
                    i10 = 0;
                }
                zzo.zzb((Runnable) new zzfu(this, i10 >= 9 ? 8 : i10, str, obj, obj2, obj3));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zza(int i10, String str) {
        Log.println(i10, zzy(), str);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i10) {
        return Log.isLoggable(zzy(), i10);
    }
}
