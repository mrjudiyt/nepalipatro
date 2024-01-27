package com.google.android.exoplayer2.util;

import a6.j;
import a6.m0;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

public final class EGLSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: o  reason: collision with root package name */
    private static final int[] f7774o = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: h  reason: collision with root package name */
    private final Handler f7775h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f7776i;

    /* renamed from: j  reason: collision with root package name */
    private final b f7777j;

    /* renamed from: k  reason: collision with root package name */
    private EGLDisplay f7778k;

    /* renamed from: l  reason: collision with root package name */
    private EGLContext f7779l;

    /* renamed from: m  reason: collision with root package name */
    private EGLSurface f7780m;

    /* renamed from: n  reason: collision with root package name */
    private SurfaceTexture f7781n;

    public static final class GlException extends RuntimeException {
        private GlException(String str) {
            super(str);
        }
    }

    public interface b {
        void a();
    }

    public EGLSurfaceTexture(Handler handler) {
        this(handler, (b) null);
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f7774o, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null) {
            return eGLConfigArr[0];
        }
        throw new GlException(m0.C("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    private static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new GlException("eglCreateContext failed");
    }

    private static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        EGLSurface eGLSurface;
        int[] iArr;
        if (i10 == 1) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i10 == 2) {
                iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            if (eGLSurface == null) {
                throw new GlException("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            return eGLSurface;
        }
        throw new GlException("eglMakeCurrent failed");
    }

    private void d() {
        b bVar = this.f7777j;
        if (bVar != null) {
            bVar.a();
        }
    }

    private static void e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        j.a();
    }

    private static EGLDisplay f() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new GlException("eglInitialize failed");
        }
        throw new GlException("eglGetDisplay failed");
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) a6.a.e(this.f7781n);
    }

    public void h(int i10) {
        EGLDisplay f10 = f();
        this.f7778k = f10;
        EGLConfig a10 = a(f10);
        EGLContext b10 = b(this.f7778k, a10, i10);
        this.f7779l = b10;
        this.f7780m = c(this.f7778k, a10, b10, i10);
        e(this.f7776i);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f7776i[0]);
        this.f7781n = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public void i() {
        this.f7775h.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f7781n;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f7776i, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f7778k;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f7778k;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f7780m;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f7778k, this.f7780m);
            }
            EGLContext eGLContext = this.f7779l;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f7778k, eGLContext);
            }
            if (m0.f205a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f7778k;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f7778k);
            }
            this.f7778k = null;
            this.f7779l = null;
            this.f7780m = null;
            this.f7781n = null;
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f7775h.post(this);
    }

    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f7781n;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public EGLSurfaceTexture(Handler handler, b bVar) {
        this.f7775h = handler;
        this.f7777j = bVar;
        this.f7776i = new int[1];
    }
}
