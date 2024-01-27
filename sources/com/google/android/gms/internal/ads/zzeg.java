package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLU;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeg {
    public static void zza() {
        StringBuilder sb = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z10) {
                sb.append(10);
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(glGetError)));
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z10 = true;
        }
        if (z10) {
            throw new zzef(sb.toString());
        }
    }

    public static void zzb(boolean z10, String str) {
        if (!z10) {
            throw new zzef(str);
        }
    }

    public static boolean zzc(Context context) {
        int i10 = zzfk.zza;
        if (i10 < 24) {
            return false;
        }
        if (i10 < 26 && ("samsung".equals(zzfk.zzc) || "XT1650".equals(zzfk.zzd))) {
            return false;
        }
        if (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return zzee.zzk("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean zzd() {
        int i10 = zzfk.zza;
        return zzee.zzk("EGL_KHR_surfaceless_context");
    }
}
