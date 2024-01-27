package c6;

import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.view.Surface;
import b6.h;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: SphericalGLSurfaceView */
public final class f extends GLSurfaceView {

    /* renamed from: h  reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f5275h;

    /* renamed from: i  reason: collision with root package name */
    private final SensorManager f5276i;

    /* renamed from: j  reason: collision with root package name */
    private final Sensor f5277j;

    /* renamed from: k  reason: collision with root package name */
    private final c f5278k;

    /* renamed from: l  reason: collision with root package name */
    private final Handler f5279l;

    /* renamed from: m  reason: collision with root package name */
    private final d f5280m;

    /* renamed from: n  reason: collision with root package name */
    private SurfaceTexture f5281n;

    /* renamed from: o  reason: collision with root package name */
    private Surface f5282o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f5283p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f5284q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f5285r;

    /* compiled from: SphericalGLSurfaceView */
    public interface a {
        void A(Surface surface);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        Surface surface = this.f5282o;
        if (surface != null) {
            Iterator<a> it = this.f5275h.iterator();
            while (it.hasNext()) {
                it.next().A(surface);
            }
        }
        c(this.f5281n, surface);
        this.f5281n = null;
        this.f5282o = null;
    }

    private static void c(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void e() {
        boolean z10 = this.f5283p && this.f5284q;
        Sensor sensor = this.f5277j;
        if (sensor != null && z10 != this.f5285r) {
            if (z10) {
                this.f5276i.registerListener(this.f5278k, sensor, 0);
            } else {
                this.f5276i.unregisterListener(this.f5278k);
            }
            this.f5285r = z10;
        }
    }

    public void d(a aVar) {
        this.f5275h.remove(aVar);
    }

    public a getCameraMotionListener() {
        return this.f5280m;
    }

    public h getVideoFrameMetadataListener() {
        return this.f5280m;
    }

    public Surface getVideoSurface() {
        return this.f5282o;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5279l.post(new e(this));
    }

    public void onPause() {
        this.f5284q = false;
        e();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f5284q = true;
        e();
    }

    public void setDefaultStereoMode(int i10) {
        throw null;
    }

    public void setUseSensorRotation(boolean z10) {
        this.f5283p = z10;
        e();
    }
}
