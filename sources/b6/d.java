package b6;

import a6.j;
import a6.p;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;

/* compiled from: DummySurface */
public final class d extends Surface {

    /* renamed from: k  reason: collision with root package name */
    private static int f5022k;

    /* renamed from: l  reason: collision with root package name */
    private static boolean f5023l;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5024h;

    /* renamed from: i  reason: collision with root package name */
    private final b f5025i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5026j;

    /* compiled from: DummySurface */
    private static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: h  reason: collision with root package name */
        private EGLSurfaceTexture f5027h;

        /* renamed from: i  reason: collision with root package name */
        private Handler f5028i;

        /* renamed from: j  reason: collision with root package name */
        private Error f5029j;

        /* renamed from: k  reason: collision with root package name */
        private RuntimeException f5030k;

        /* renamed from: l  reason: collision with root package name */
        private d f5031l;

        public b() {
            super("ExoPlayer:DummySurface");
        }

        private void b(int i10) {
            a6.a.e(this.f5027h);
            this.f5027h.h(i10);
            this.f5031l = new d(this, this.f5027h.g(), i10 != 0);
        }

        private void d() {
            a6.a.e(this.f5027h);
            this.f5027h.i();
        }

        public d a(int i10) {
            boolean z10;
            start();
            this.f5028i = new Handler(getLooper(), this);
            this.f5027h = new EGLSurfaceTexture(this.f5028i);
            synchronized (this) {
                z10 = false;
                this.f5028i.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f5031l == null && this.f5030k == null && this.f5029j == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f5030k;
            if (runtimeException == null) {
                Error error = this.f5029j;
                if (error == null) {
                    return (d) a6.a.e(this.f5031l);
                }
                throw error;
            }
            throw runtimeException;
        }

        public void c() {
            a6.a.e(this.f5028i);
            this.f5028i.sendEmptyMessage(2);
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e10) {
                    p.d("DummySurface", "Failed to initialize dummy surface", e10);
                    this.f5030k = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    try {
                        p.d("DummySurface", "Failed to initialize dummy surface", e11);
                        this.f5029j = e11;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
                return true;
            } else if (i10 != 2) {
                return true;
            } else {
                try {
                    d();
                } catch (Throwable th2) {
                    quit();
                    throw th2;
                }
                quit();
                return true;
            }
        }
    }

    private static int b(Context context) {
        if (j.b(context)) {
            return j.c() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean c(Context context) {
        boolean z10;
        synchronized (d.class) {
            z10 = true;
            if (!f5023l) {
                f5022k = b(context);
                f5023l = true;
            }
            if (f5022k == 0) {
                z10 = false;
            }
        }
        return z10;
    }

    public static d d(Context context, boolean z10) {
        int i10 = 0;
        a6.a.f(!z10 || c(context));
        b bVar = new b();
        if (z10) {
            i10 = f5022k;
        }
        return bVar.a(i10);
    }

    public void release() {
        super.release();
        synchronized (this.f5025i) {
            if (!this.f5026j) {
                this.f5025i.c();
                this.f5026j = true;
            }
        }
    }

    private d(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f5025i = bVar;
        this.f5024h = z10;
    }
}
