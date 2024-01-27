package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.zzb;
import java.util.Objects;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
public final class Preconditions {
    private Preconditions() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static void checkArgument(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    @KeepForSdk
    public static double checkArgumentInRange(double d10, double d11, double d12, String str) {
        if (d10 < d11) {
            throw new IllegalArgumentException(zza("%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d11), Double.valueOf(d12)));
        } else if (d10 <= d12) {
            return d10;
        } else {
            throw new IllegalArgumentException(zza("%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d11), Double.valueOf(d12)));
        }
    }

    @KeepForSdk
    public static void checkHandlerThread(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            throw new IllegalStateException("Must be called on " + name2 + " thread, but got " + name + ".");
        }
    }

    @KeepForSdk
    public static void checkMainThread() {
        checkMainThread("Must be called on the main application thread");
    }

    @KeepForSdk
    public static String checkNotEmpty(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    @KeepForSdk
    public static void checkNotMainThread() {
        checkNotMainThread("Must not be called on the main application thread");
    }

    @KeepForSdk
    public static <T> T checkNotNull(T t10) {
        Objects.requireNonNull(t10, "null reference");
        return t10;
    }

    @KeepForSdk
    public static int checkNotZero(int i10) {
        if (i10 != 0) {
            return i10;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    @KeepForSdk
    public static void checkState(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    static String zza(String str, Object... objArr) {
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + 48);
        int i10 = 0;
        int i11 = 0;
        while (i10 < 3 && (indexOf = str.indexOf("%s", i11)) != -1) {
            sb.append(str.substring(i11, indexOf));
            sb.append(objArr[i10]);
            int i12 = i10 + 1;
            i11 = indexOf + 2;
            i10 = i12;
        }
        sb.append(str.substring(i11));
        if (i10 < 3) {
            sb.append(" [");
            sb.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < 3; i13++) {
                sb.append(", ");
                sb.append(objArr[i13]);
            }
            sb.append("]");
        }
        return sb.toString();
    }

    @KeepForSdk
    public static void checkArgument(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @KeepForSdk
    public static void checkMainThread(String str) {
        if (!zzb.zza()) {
            throw new IllegalStateException(str);
        }
    }

    @KeepForSdk
    public static void checkNotMainThread(String str) {
        if (zzb.zza()) {
            throw new IllegalStateException(str);
        }
    }

    @KeepForSdk
    public static <T> T checkNotNull(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @KeepForSdk
    public static int checkNotZero(int i10, Object obj) {
        if (i10 != 0) {
            return i10;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @KeepForSdk
    public static void checkState(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @KeepForSdk
    public static void checkArgument(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @KeepForSdk
    public static String checkNotEmpty(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @KeepForSdk
    public static long checkNotZero(long j10) {
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    @KeepForSdk
    public static void checkState(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    @KeepForSdk
    public static float checkArgumentInRange(float f10, float f11, float f12, String str) {
        if (f10 < f11) {
            throw new IllegalArgumentException(zza("%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f11), Float.valueOf(f12)));
        } else if (f10 <= f12) {
            return f10;
        } else {
            throw new IllegalArgumentException(zza("%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f11), Float.valueOf(f12)));
        }
    }

    @KeepForSdk
    public static long checkNotZero(long j10, Object obj) {
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @KeepForSdk
    public static void checkHandlerThread(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    @KeepForSdk
    public static int checkArgumentInRange(int i10, int i11, int i12, String str) {
        if (i10 < i11) {
            throw new IllegalArgumentException(zza("%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i11), Integer.valueOf(i12)));
        } else if (i10 <= i12) {
            return i10;
        } else {
            throw new IllegalArgumentException(zza("%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i11), Integer.valueOf(i12)));
        }
    }

    @KeepForSdk
    public static long checkArgumentInRange(long j10, long j11, long j12, String str) {
        if (j10 < j11) {
            throw new IllegalArgumentException(zza("%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j11), Long.valueOf(j12)));
        } else if (j10 <= j12) {
            return j10;
        } else {
            throw new IllegalArgumentException(zza("%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j11), Long.valueOf(j12)));
        }
    }
}
