package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import androidx.collection.i;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.loader.app.a;
import androidx.loader.content.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* compiled from: LoaderManagerImpl */
class b extends a {

    /* renamed from: c  reason: collision with root package name */
    static boolean f3546c = false;

    /* renamed from: a  reason: collision with root package name */
    private final m f3547a;

    /* renamed from: b  reason: collision with root package name */
    private final c f3548b;

    /* compiled from: LoaderManagerImpl */
    public static class a<D> extends s<D> implements b.C0059b<D> {

        /* renamed from: a  reason: collision with root package name */
        private final int f3549a;

        /* renamed from: b  reason: collision with root package name */
        private final Bundle f3550b;

        /* renamed from: c  reason: collision with root package name */
        private final androidx.loader.content.b<D> f3551c;

        /* renamed from: d  reason: collision with root package name */
        private m f3552d;

        /* renamed from: e  reason: collision with root package name */
        private C0057b<D> f3553e;

        /* renamed from: f  reason: collision with root package name */
        private androidx.loader.content.b<D> f3554f;

        a(int i10, Bundle bundle, androidx.loader.content.b<D> bVar, androidx.loader.content.b<D> bVar2) {
            this.f3549a = i10;
            this.f3550b = bundle;
            this.f3551c = bVar;
            this.f3554f = bVar2;
            bVar.registerListener(i10, this);
        }

        public void a(androidx.loader.content.b<D> bVar, D d10) {
            if (b.f3546c) {
                StringBuilder sb = new StringBuilder();
                sb.append("onLoadComplete: ");
                sb.append(this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setValue(d10);
                return;
            }
            boolean z10 = b.f3546c;
            postValue(d10);
        }

        /* access modifiers changed from: package-private */
        public androidx.loader.content.b<D> b(boolean z10) {
            if (b.f3546c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Destroying: ");
                sb.append(this);
            }
            this.f3551c.cancelLoad();
            this.f3551c.abandon();
            C0057b<D> bVar = this.f3553e;
            if (bVar != null) {
                removeObserver(bVar);
                if (z10) {
                    bVar.d();
                }
            }
            this.f3551c.unregisterListener(this);
            if ((bVar == null || bVar.c()) && !z10) {
                return this.f3551c;
            }
            this.f3551c.reset();
            return this.f3554f;
        }

        public void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f3549a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f3550b);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f3551c);
            androidx.loader.content.b<D> bVar = this.f3551c;
            bVar.dump(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f3553e != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f3553e);
                C0057b<D> bVar2 = this.f3553e;
                bVar2.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(d().dataToString(getValue()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }

        /* access modifiers changed from: package-private */
        public androidx.loader.content.b<D> d() {
            return this.f3551c;
        }

        /* access modifiers changed from: package-private */
        public void e() {
            m mVar = this.f3552d;
            C0057b<D> bVar = this.f3553e;
            if (mVar != null && bVar != null) {
                super.removeObserver(bVar);
                observe(mVar, bVar);
            }
        }

        /* access modifiers changed from: package-private */
        public androidx.loader.content.b<D> f(m mVar, a.C0056a<D> aVar) {
            C0057b<D> bVar = new C0057b<>(this.f3551c, aVar);
            observe(mVar, bVar);
            C0057b<D> bVar2 = this.f3553e;
            if (bVar2 != null) {
                removeObserver(bVar2);
            }
            this.f3552d = mVar;
            this.f3553e = bVar;
            return this.f3551c;
        }

        /* access modifiers changed from: protected */
        public void onActive() {
            if (b.f3546c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Starting: ");
                sb.append(this);
            }
            this.f3551c.startLoading();
        }

        /* access modifiers changed from: protected */
        public void onInactive() {
            if (b.f3546c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Stopping: ");
                sb.append(this);
            }
            this.f3551c.stopLoading();
        }

        public void removeObserver(t<? super D> tVar) {
            super.removeObserver(tVar);
            this.f3552d = null;
            this.f3553e = null;
        }

        public void setValue(D d10) {
            super.setValue(d10);
            androidx.loader.content.b<D> bVar = this.f3554f;
            if (bVar != null) {
                bVar.reset();
                this.f3554f = null;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f3549a);
            sb.append(" : ");
            androidx.core.util.b.a(this.f3551c, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$b  reason: collision with other inner class name */
    /* compiled from: LoaderManagerImpl */
    static class C0057b<D> implements t<D> {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.loader.content.b<D> f3555a;

        /* renamed from: b  reason: collision with root package name */
        private final a.C0056a<D> f3556b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f3557c = false;

        C0057b(androidx.loader.content.b<D> bVar, a.C0056a<D> aVar) {
            this.f3555a = bVar;
            this.f3556b = aVar;
        }

        public void a(D d10) {
            if (b.f3546c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  onLoadFinished in ");
                sb.append(this.f3555a);
                sb.append(": ");
                sb.append(this.f3555a.dataToString(d10));
            }
            this.f3556b.onLoadFinished(this.f3555a, d10);
            this.f3557c = true;
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f3557c);
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return this.f3557c;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            if (this.f3557c) {
                if (b.f3546c) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("  Resetting: ");
                    sb.append(this.f3555a);
                }
                this.f3556b.onLoaderReset(this.f3555a);
            }
        }

        public String toString() {
            return this.f3556b.toString();
        }
    }

    /* compiled from: LoaderManagerImpl */
    static class c extends g0 {

        /* renamed from: f  reason: collision with root package name */
        private static final h0.b f3558f = new a();

        /* renamed from: d  reason: collision with root package name */
        private i<a> f3559d = new i<>();

        /* renamed from: e  reason: collision with root package name */
        private boolean f3560e = false;

        /* compiled from: LoaderManagerImpl */
        static class a implements h0.b {
            a() {
            }

            public <T extends g0> T a(Class<T> cls) {
                return new c();
            }

            public /* synthetic */ g0 b(Class cls, p0.a aVar) {
                return i0.b(this, cls, aVar);
            }
        }

        c() {
        }

        static c h(k0 k0Var) {
            return (c) new h0(k0Var, f3558f).a(c.class);
        }

        /* access modifiers changed from: protected */
        public void d() {
            super.d();
            int k10 = this.f3559d.k();
            for (int i10 = 0; i10 < k10; i10++) {
                this.f3559d.l(i10).b(true);
            }
            this.f3559d.b();
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f3559d.k() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f3559d.k(); i10++) {
                    a l10 = this.f3559d.l(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f3559d.g(i10));
                    printWriter.print(": ");
                    printWriter.println(l10.toString());
                    l10.c(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void g() {
            this.f3560e = false;
        }

        /* access modifiers changed from: package-private */
        public <D> a<D> i(int i10) {
            return this.f3559d.e(i10);
        }

        /* access modifiers changed from: package-private */
        public boolean j() {
            return this.f3560e;
        }

        /* access modifiers changed from: package-private */
        public void k() {
            int k10 = this.f3559d.k();
            for (int i10 = 0; i10 < k10; i10++) {
                this.f3559d.l(i10).e();
            }
        }

        /* access modifiers changed from: package-private */
        public void l(int i10, a aVar) {
            this.f3559d.i(i10, aVar);
        }

        /* access modifiers changed from: package-private */
        public void m() {
            this.f3560e = true;
        }
    }

    b(m mVar, k0 k0Var) {
        this.f3547a = mVar;
        this.f3548b = c.h(k0Var);
    }

    /* JADX INFO: finally extract failed */
    private <D> androidx.loader.content.b<D> e(int i10, Bundle bundle, a.C0056a<D> aVar, androidx.loader.content.b<D> bVar) {
        try {
            this.f3548b.m();
            androidx.loader.content.b<D> onCreateLoader = aVar.onCreateLoader(i10, bundle);
            if (onCreateLoader != null) {
                if (onCreateLoader.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + onCreateLoader);
                    }
                }
                a aVar2 = new a(i10, bundle, onCreateLoader, bVar);
                if (f3546c) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("  Created new loader ");
                    sb.append(aVar2);
                }
                this.f3548b.l(i10, aVar2);
                this.f3548b.g();
                return aVar2.f(this.f3547a, aVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f3548b.g();
            throw th;
        }
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f3548b.f(str, fileDescriptor, printWriter, strArr);
    }

    public <D> androidx.loader.content.b<D> c(int i10, Bundle bundle, a.C0056a<D> aVar) {
        if (this.f3548b.j()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            a i11 = this.f3548b.i(i10);
            if (f3546c) {
                StringBuilder sb = new StringBuilder();
                sb.append("initLoader in ");
                sb.append(this);
                sb.append(": args=");
                sb.append(bundle);
            }
            if (i11 == null) {
                return e(i10, bundle, aVar, (androidx.loader.content.b) null);
            }
            if (f3546c) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("  Re-using existing loader ");
                sb2.append(i11);
            }
            return i11.f(this.f3547a, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    public void d() {
        this.f3548b.k();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        androidx.core.util.b.a(this.f3547a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
