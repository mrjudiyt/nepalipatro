package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.zzgtv;
import com.google.android.gms.internal.ads.zzgtz;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzgtz<MessageType extends zzgtz<MessageType, BuilderType>, BuilderType extends zzgtv<MessageType, BuilderType>> extends zzgsa<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzgwu zzc = zzgwu.zzc();
    private int zzd = -1;

    private final int zza(zzgwc zzgwc) {
        return zzgvr.zza().zzb(getClass()).zza(this);
    }

    static zzgtz zzaC(Class cls) {
        Map map = zzb;
        zzgtz zzgtz = (zzgtz) map.get(cls);
        if (zzgtz == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgtz = (zzgtz) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzgtz == null) {
            zzgtz = (zzgtz) ((zzgtz) zzgxd.zzg(cls)).zzb(6, (Object) null, (Object) null);
            if (zzgtz != null) {
                map.put(cls, zzgtz);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzgtz;
    }

    protected static zzgtz zzaE(zzgtz zzgtz, zzgsr zzgsr) {
        zzgtl zzgtl = zzgtl.zza;
        zzgsz zzl = zzgsr.zzl();
        zzgtz zzaD = zzgtz.zzaD();
        try {
            zzgwc zzb2 = zzgvr.zza().zzb(zzaD.getClass());
            zzb2.zzh(zzaD, zzgta.zzq(zzl), zzgtl);
            zzb2.zzf(zzaD);
            try {
                zzl.zzz(0);
                zzc(zzaD);
                zzc(zzaD);
                return zzaD;
            } catch (zzgul e10) {
                e10.zzh(zzaD);
                throw e10;
            }
        } catch (zzgul e11) {
            e = e11;
            if (e.zzl()) {
                e = new zzgul((IOException) e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzgws e12) {
            zzgul zza = e12.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e13) {
            if (e13.getCause() instanceof zzgul) {
                throw ((zzgul) e13.getCause());
            }
            zzgul zzgul = new zzgul(e13);
            zzgul.zzh(zzaD);
            throw zzgul;
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof zzgul) {
                throw ((zzgul) e14.getCause());
            }
            throw e14;
        }
    }

    protected static zzgtz zzaF(zzgtz zzgtz, byte[] bArr) {
        zzgtz zzd2 = zzd(zzgtz, bArr, 0, bArr.length, zzgtl.zza);
        zzc(zzd2);
        return zzd2;
    }

    protected static zzgtz zzaG(zzgtz zzgtz, zzgsr zzgsr, zzgtl zzgtl) {
        zzgsz zzl = zzgsr.zzl();
        zzgtz zzaD = zzgtz.zzaD();
        try {
            zzgwc zzb2 = zzgvr.zza().zzb(zzaD.getClass());
            zzb2.zzh(zzaD, zzgta.zzq(zzl), zzgtl);
            zzb2.zzf(zzaD);
            try {
                zzl.zzz(0);
                zzc(zzaD);
                return zzaD;
            } catch (zzgul e10) {
                e10.zzh(zzaD);
                throw e10;
            }
        } catch (zzgul e11) {
            e = e11;
            if (e.zzl()) {
                e = new zzgul((IOException) e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzgws e12) {
            zzgul zza = e12.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e13) {
            if (e13.getCause() instanceof zzgul) {
                throw ((zzgul) e13.getCause());
            }
            zzgul zzgul = new zzgul(e13);
            zzgul.zzh(zzaD);
            throw zzgul;
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof zzgul) {
                throw ((zzgul) e14.getCause());
            }
            throw e14;
        }
    }

    protected static zzgtz zzaH(zzgtz zzgtz, InputStream inputStream, zzgtl zzgtl) {
        zzgsz zzH = zzgsz.zzH(inputStream, 4096);
        zzgtz zzaD = zzgtz.zzaD();
        try {
            zzgwc zzb2 = zzgvr.zza().zzb(zzaD.getClass());
            zzb2.zzh(zzaD, zzgta.zzq(zzH), zzgtl);
            zzb2.zzf(zzaD);
            zzc(zzaD);
            return zzaD;
        } catch (zzgul e10) {
            e = e10;
            if (e.zzl()) {
                e = new zzgul((IOException) e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzgws e11) {
            zzgul zza = e11.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzgul) {
                throw ((zzgul) e12.getCause());
            }
            zzgul zzgul = new zzgul(e12);
            zzgul.zzh(zzaD);
            throw zzgul;
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzgul) {
                throw ((zzgul) e13.getCause());
            }
            throw e13;
        }
    }

    protected static zzgtz zzaI(zzgtz zzgtz, byte[] bArr, zzgtl zzgtl) {
        zzgtz zzd2 = zzd(zzgtz, bArr, 0, bArr.length, zzgtl);
        zzc(zzd2);
        return zzd2;
    }

    protected static zzgue zzaJ() {
        return zzgua.zzf();
    }

    protected static zzgue zzaK(zzgue zzgue) {
        int size = zzgue.size();
        return zzgue.zzg(size == 0 ? 10 : size + size);
    }

    protected static zzguh zzaL() {
        return zzguy.zzf();
    }

    protected static zzguh zzaM(zzguh zzguh) {
        int size = zzguh.size();
        return zzguh.zza(size == 0 ? 10 : size + size);
    }

    protected static zzgui zzaN() {
        return zzgvs.zze();
    }

    protected static zzgui zzaO(zzgui zzgui) {
        int size = zzgui.size();
        return zzgui.zzd(size == 0 ? 10 : size + size);
    }

    static Object zzaQ(Method method, Object obj, Object... objArr) {
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

    protected static Object zzaR(zzgvj zzgvj, String str, Object[] objArr) {
        return new zzgvt(zzgvj, str, objArr);
    }

    protected static void zzaU(Class cls, zzgtz zzgtz) {
        zzgtz.zzaT();
        zzb.put(cls, zzgtz);
    }

    private static zzgtz zzc(zzgtz zzgtz) {
        if (zzgtz == null || zzgtz.zzaX()) {
            return zzgtz;
        }
        zzgul zza = new zzgws(zzgtz).zza();
        zza.zzh(zzgtz);
        throw zza;
    }

    private static zzgtz zzd(zzgtz zzgtz, byte[] bArr, int i10, int i11, zzgtl zzgtl) {
        zzgtz zzaD = zzgtz.zzaD();
        try {
            zzgwc zzb2 = zzgvr.zza().zzb(zzaD.getClass());
            zzb2.zzi(zzaD, bArr, 0, i11, new zzgsd(zzgtl));
            zzb2.zzf(zzaD);
            return zzaD;
        } catch (zzgul e10) {
            e = e10;
            if (e.zzl()) {
                e = new zzgul((IOException) e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzgws e11) {
            zzgul zza = e11.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzgul) {
                throw ((zzgul) e12.getCause());
            }
            zzgul zzgul = new zzgul(e12);
            zzgul.zzh(zzaD);
            throw zzgul;
        } catch (IndexOutOfBoundsException unused) {
            zzgul zzj = zzgul.zzj();
            zzj.zzh(zzaD);
            throw zzj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzgvr.zza().zzb(getClass()).zzj(this, (zzgtz) obj);
    }

    public final int hashCode() {
        if (zzaY()) {
            return zzay();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int zzay = zzay();
        this.zza = zzay;
        return zzay;
    }

    public final String toString() {
        return zzgvl.zza(this, super.toString());
    }

    /* access modifiers changed from: protected */
    public final zzgtv zzaA() {
        return (zzgtv) zzb(5, (Object) null, (Object) null);
    }

    public final zzgtv zzaB() {
        zzgtv zzgtv = (zzgtv) zzb(5, (Object) null, (Object) null);
        zzgtv.zzaj(this);
        return zzgtv;
    }

    /* access modifiers changed from: package-private */
    public final zzgtz zzaD() {
        return (zzgtz) zzb(4, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzgvi zzaP() {
        return (zzgtv) zzb(5, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public final void zzaS() {
        zzgvr.zza().zzb(getClass()).zzf(this);
        zzaT();
    }

    /* access modifiers changed from: package-private */
    public final void zzaT() {
        this.zzd &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* access modifiers changed from: package-private */
    public final void zzaV(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final void zzaW(zzgtg zzgtg) {
        zzgvr.zza().zzb(getClass()).zzm(this, zzgth.zza(zzgtg));
    }

    public final boolean zzaX() {
        byte byteValue = ((Byte) zzb(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzgvr.zza().zzb(getClass()).zzk(this);
        zzb(2, true != zzk ? null : this, (Object) null);
        return zzk;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzaY() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* access modifiers changed from: package-private */
    public final int zzat(zzgwc zzgwc) {
        if (zzaY()) {
            int zza = zzgwc.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i10 = this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int zza2 = zzgwc.zza(this);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
    }

    /* access modifiers changed from: package-private */
    public final int zzay() {
        return zzgvr.zza().zzb(getClass()).zzb(this);
    }

    public final int zzaz() {
        int i10;
        if (zzaY()) {
            i10 = zza((zzgwc) null);
            if (i10 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i10);
            }
        } else {
            i10 = this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (i10 == Integer.MAX_VALUE) {
                i10 = zza((zzgwc) null);
                if (i10 >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i10;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i10);
                }
            }
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public abstract Object zzb(int i10, Object obj, Object obj2);

    public final /* synthetic */ zzgvj zzbf() {
        return (zzgtz) zzb(6, (Object) null, (Object) null);
    }
}
