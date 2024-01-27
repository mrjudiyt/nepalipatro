package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.room.b;
import androidx.room.c;
import androidx.room.e;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MultiInstanceInvalidationClient */
class f {

    /* renamed from: a  reason: collision with root package name */
    final Context f4376a;

    /* renamed from: b  reason: collision with root package name */
    final String f4377b;

    /* renamed from: c  reason: collision with root package name */
    int f4378c;

    /* renamed from: d  reason: collision with root package name */
    final e f4379d;

    /* renamed from: e  reason: collision with root package name */
    final e.c f4380e;

    /* renamed from: f  reason: collision with root package name */
    c f4381f;

    /* renamed from: g  reason: collision with root package name */
    final Executor f4382g;

    /* renamed from: h  reason: collision with root package name */
    final b f4383h = new a();

    /* renamed from: i  reason: collision with root package name */
    final AtomicBoolean f4384i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    final ServiceConnection f4385j;

    /* renamed from: k  reason: collision with root package name */
    final Runnable f4386k;

    /* renamed from: l  reason: collision with root package name */
    final Runnable f4387l;

    /* renamed from: m  reason: collision with root package name */
    private final Runnable f4388m;

    /* compiled from: MultiInstanceInvalidationClient */
    class a extends b.a {

        /* renamed from: androidx.room.f$a$a  reason: collision with other inner class name */
        /* compiled from: MultiInstanceInvalidationClient */
        class C0075a implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ String[] f4390h;

            C0075a(String[] strArr) {
                this.f4390h = strArr;
            }

            public void run() {
                f.this.f4379d.e(this.f4390h);
            }
        }

        a() {
        }

        public void s(String[] strArr) {
            f.this.f4382g.execute(new C0075a(strArr));
        }
    }

    /* compiled from: MultiInstanceInvalidationClient */
    class b implements ServiceConnection {
        b() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            f.this.f4381f = c.a.z0(iBinder);
            f fVar = f.this;
            fVar.f4382g.execute(fVar.f4386k);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            f fVar = f.this;
            fVar.f4382g.execute(fVar.f4387l);
            f.this.f4381f = null;
        }
    }

    /* compiled from: MultiInstanceInvalidationClient */
    class c implements Runnable {
        c() {
        }

        public void run() {
            try {
                f fVar = f.this;
                c cVar = fVar.f4381f;
                if (cVar != null) {
                    fVar.f4378c = cVar.x(fVar.f4383h, fVar.f4377b);
                    f fVar2 = f.this;
                    fVar2.f4379d.a(fVar2.f4380e);
                }
            } catch (RemoteException unused) {
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationClient */
    class d implements Runnable {
        d() {
        }

        public void run() {
            f fVar = f.this;
            fVar.f4379d.g(fVar.f4380e);
        }
    }

    /* compiled from: MultiInstanceInvalidationClient */
    class e implements Runnable {
        e() {
        }

        public void run() {
            f fVar = f.this;
            fVar.f4379d.g(fVar.f4380e);
            try {
                f fVar2 = f.this;
                c cVar = fVar2.f4381f;
                if (cVar != null) {
                    cVar.v0(fVar2.f4383h, fVar2.f4378c);
                }
            } catch (RemoteException unused) {
            }
            f fVar3 = f.this;
            fVar3.f4376a.unbindService(fVar3.f4385j);
        }
    }

    /* renamed from: androidx.room.f$f  reason: collision with other inner class name */
    /* compiled from: MultiInstanceInvalidationClient */
    class C0076f extends e.c {
        C0076f(String[] strArr) {
            super(strArr);
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return true;
        }

        public void b(Set<String> set) {
            if (!f.this.f4384i.get()) {
                try {
                    f fVar = f.this;
                    c cVar = fVar.f4381f;
                    if (cVar != null) {
                        cVar.q0(fVar.f4378c, (String[]) set.toArray(new String[0]));
                    }
                } catch (RemoteException unused) {
                }
            }
        }
    }

    f(Context context, String str, e eVar, Executor executor) {
        b bVar = new b();
        this.f4385j = bVar;
        this.f4386k = new c();
        this.f4387l = new d();
        this.f4388m = new e();
        Context applicationContext = context.getApplicationContext();
        this.f4376a = applicationContext;
        this.f4377b = str;
        this.f4379d = eVar;
        this.f4382g = executor;
        this.f4380e = new C0076f((String[]) eVar.f4353a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, MultiInstanceInvalidationService.class), bVar, 1);
    }
}
