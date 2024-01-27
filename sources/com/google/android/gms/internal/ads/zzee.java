package com.google.android.gms.internal.ads;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzee {
    public static int zza() {
        int[] iArr = new int[1];
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 12440, iArr, 0);
        zzeg.zza();
        return iArr[0];
    }

    public static EGLContext zzb(EGLContext eGLContext, EGLDisplay eGLDisplay, int i10, int[] iArr) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, zzl(eGLDisplay, iArr), eGLContext, new int[]{12440, i10, 12344}, 0);
        if (eglCreateContext != null) {
            zzeg.zza();
            return eglCreateContext;
        }
        EGL14.eglTerminate(eGLDisplay);
        throw new zzef("eglCreateContext() failed to create a valid context. The device may not support EGL version " + i10);
    }

    public static EGLContext zzc() {
        return EGL14.eglGetCurrentContext();
    }

    public static EGLDisplay zzd() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        zzeg.zzb(!eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        zzeg.zzb(EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        zzeg.zza();
        return eglGetDisplay;
    }

    public static EGLSurface zze(EGLDisplay eGLDisplay, int[] iArr, int[] iArr2) {
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, zzl(eGLDisplay, iArr), iArr2, 0);
        zzg("Error creating a new EGL Pbuffer surface");
        return eglCreatePbufferSurface;
    }

    public static EGLSurface zzf(EGLDisplay eGLDisplay, Object obj, int[] iArr, int[] iArr2) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, zzl(eGLDisplay, iArr), obj, iArr2, 0);
        zzg("Error creating a new EGL surface");
        return eglCreateWindowSurface;
    }

    public static void zzg(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            String hexString = Integer.toHexString(eglGetError);
            throw new zzef(str + ", error code: 0x" + hexString);
        }
    }

    public static void zzh(EGLDisplay eGLDisplay, EGLContext eGLContext) {
        if (eGLDisplay != null) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            zzg("Error releasing context");
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                zzg("Error destroying context");
            }
            EGL14.eglReleaseThread();
            zzg("Error releasing thread");
            EGL14.eglTerminate(eGLDisplay);
            zzg("Error terminating display");
        }
    }

    public static void zzi(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        if (eGLDisplay != null && eGLSurface != null) {
            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
            zzg("Error destroying surface");
        }
    }

    public static void zzj(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i10, int i11, int i12) {
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        zzg("Error making context current");
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i10) {
            GLES20.glBindFramebuffer(36160, i10);
        }
        zzeg.zza();
        GLES20.glViewport(0, 0, i11, i12);
        zzeg.zza();
    }

    public static boolean zzk(String str) {
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        if (eglQueryString == null || !eglQueryString.contains(str)) {
            return false;
        }
        return true;
    }

    private static EGLConfig zzl(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new zzef("eglChooseConfig failed.");
    }
}
