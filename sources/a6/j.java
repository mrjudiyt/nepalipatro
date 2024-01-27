package a6;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;

/* compiled from: GlUtil */
public final class j {
    public static void a() {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
                p.c("GlUtil", valueOf.length() != 0 ? "glError ".concat(valueOf) : new String("glError "));
            } else {
                return;
            }
        }
    }

    public static boolean b(Context context) {
        String eglQueryString;
        int i10 = m0.f205a;
        if (i10 < 24) {
            return false;
        }
        if (i10 < 26 && ("samsung".equals(m0.f207c) || "XT1650".equals(m0.f208d))) {
            return false;
        }
        if ((i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        String eglQueryString;
        if (m0.f205a >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context")) {
            return true;
        }
        return false;
    }
}
