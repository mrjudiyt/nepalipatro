package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class zzfq {
    private static final AtomicReference<String[]> zza = new AtomicReference<>();
    private static final AtomicReference<String[]> zzb = new AtomicReference<>();
    private static final AtomicReference<String[]> zzc = new AtomicReference<>();
    private final zzfp zzd;

    public zzfq(zzfp zzfp) {
        this.zzd = zzfp;
    }

    private final String zza(Object[] objArr) {
        String str;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Bundle bundle : objArr) {
            if (bundle instanceof Bundle) {
                str = zza(bundle);
            } else {
                str = String.valueOf(bundle);
            }
            if (str != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(str);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String zzb(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        return zza(str, zzik.zzb, zzik.zza, zzb);
    }

    /* access modifiers changed from: protected */
    public final String zzc(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return zza(str, zzij.zzb, zzij.zza, zzc);
        }
        return "experiment_id" + "(" + str + ")";
    }

    /* access modifiers changed from: protected */
    public final String zza(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str2 : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(zzb(str2));
            sb.append("=");
            Object obj = bundle.get(str2);
            if (obj instanceof Bundle) {
                str = zza(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                str = zza((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                str = zza(((ArrayList) obj).toArray());
            } else {
                str = String.valueOf(obj);
            }
            sb.append(str);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String zza(zzbg zzbg) {
        String str = null;
        if (zzbg == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return zzbg.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(zzbg.zzc);
        sb.append(",name=");
        sb.append(zza(zzbg.zza));
        sb.append(",params=");
        zzbb zzbb = zzbg.zzb;
        if (zzbb != null) {
            if (!this.zzd.zza()) {
                str = zzbb.toString();
            } else {
                str = zza(zzbb.zzb());
            }
        }
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String zza(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        return zza(str, zzii.zzc, zzii.zza, zza);
    }

    private static String zza(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str3 = strArr[i10];
            if (str == str3 || (str != null && str.equals(str3))) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i10] == null) {
                        strArr3[i10] = strArr2[i10] + "(" + strArr[i10] + ")";
                    }
                    str2 = strArr3[i10];
                }
                return str2;
            }
        }
        return str;
    }
}
