package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.play_billing.zzbx;
import com.google.android.gms.internal.play_billing.zzcb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public abstract class zzcb<MessageType extends zzcb<MessageType, BuilderType>, BuilderType extends zzbx<MessageType, BuilderType>> extends zzak<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzeh zzc = zzeh.zzc();
    private int zzd = -1;

    static zzcb zzh(Class cls) {
        Map map = zzb;
        zzcb zzcb = (zzcb) map.get(cls);
        if (zzcb == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzcb = (zzcb) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzcb == null) {
            zzcb = (zzcb) ((zzcb) zzeq.zze(cls)).zzu(6, (Object) null, (Object) null);
            if (zzcb != null) {
                map.put(cls, zzcb);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzcb;
    }

    protected static zzcb zzj(zzcb zzcb, byte[] bArr, zzbn zzbn) {
        zzcb zzw = zzw(zzcb, bArr, 0, bArr.length, zzbn);
        if (zzw == null || zzw.zzs()) {
            return zzw;
        }
        zzci zza = new zzef(zzw).zza();
        zza.zzf(zzw);
        throw zza;
    }

    static Object zzl(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static Object zzm(zzdf zzdf, String str, Object[] objArr) {
        return new zzdo(zzdf, str, objArr);
    }

    protected static void zzp(Class cls, zzcb zzcb) {
        zzcb.zzo();
        zzb.put(cls, zzcb);
    }

    private final int zzv(zzdp zzdp) {
        return zzdn.zza().zzb(getClass()).zza(this);
    }

    private static zzcb zzw(zzcb zzcb, byte[] bArr, int i10, int i11, zzbn zzbn) {
        zzcb zzi = zzcb.zzi();
        try {
            zzdp zzb2 = zzdn.zza().zzb(zzi.getClass());
            zzb2.zzh(zzi, bArr, 0, i11, new zzan(zzbn));
            zzb2.zzf(zzi);
            return zzi;
        } catch (zzci e10) {
            e10.zzf(zzi);
            throw e10;
        } catch (zzef e11) {
            zzci zza = e11.zza();
            zza.zzf(zzi);
            throw zza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzci) {
                throw ((zzci) e12.getCause());
            }
            zzci zzci = new zzci(e12);
            zzci.zzf(zzi);
            throw zzci;
        } catch (IndexOutOfBoundsException unused) {
            zzci zzg = zzci.zzg();
            zzg.zzf(zzi);
            throw zzg;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzdn.zza().zzb(getClass()).zzj(this, (zzcb) obj);
    }

    public final int hashCode() {
        if (zzt()) {
            return zzd();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int zzd2 = zzd();
        this.zza = zzd2;
        return zzd2;
    }

    public final String toString() {
        return zzdh.zza(this, super.toString());
    }

    /* access modifiers changed from: package-private */
    public final int zza(zzdp zzdp) {
        if (zzt()) {
            int zza = zzdp.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i10 = this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int zza2 = zzdp.zza(this);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
    }

    /* access modifiers changed from: package-private */
    public final int zzd() {
        return zzdn.zza().zzb(getClass()).zzb(this);
    }

    public final int zze() {
        int i10;
        if (zzt()) {
            i10 = zzv((zzdp) null);
            if (i10 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i10);
            }
        } else {
            i10 = this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (i10 == Integer.MAX_VALUE) {
                i10 = zzv((zzdp) null);
                if (i10 >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i10;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i10);
                }
            }
        }
        return i10;
    }

    public final /* synthetic */ zzdf zzf() {
        return (zzcb) zzu(6, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public final zzbx zzg() {
        return (zzbx) zzu(5, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final zzcb zzi() {
        return (zzcb) zzu(4, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzde zzk() {
        return (zzbx) zzu(5, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public final void zzn() {
        zzdn.zza().zzb(getClass()).zzf(this);
        zzo();
    }

    /* access modifiers changed from: package-private */
    public final void zzo() {
        this.zzd &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* access modifiers changed from: package-private */
    public final void zzq(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final void zzr(zzbi zzbi) {
        zzdn.zza().zzb(getClass()).zzi(this, zzbj.zza(zzbi));
    }

    public final boolean zzs() {
        byte byteValue = ((Byte) zzu(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzdn.zza().zzb(getClass()).zzk(this);
        zzu(2, true != zzk ? null : this, (Object) null);
        return zzk;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzt() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* access modifiers changed from: protected */
    public abstract Object zzu(int i10, Object obj, Object obj2);
}
