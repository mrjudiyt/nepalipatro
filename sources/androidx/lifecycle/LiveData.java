package androidx.lifecycle;

import androidx.lifecycle.h;
import java.util.Iterator;
import java.util.Map;

public abstract class LiveData<T> {
    static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private o.b<t<? super T>, LiveData<T>.c> mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    class LifecycleBoundObserver extends LiveData<T>.c implements k {

        /* renamed from: l  reason: collision with root package name */
        final m f3414l;

        LifecycleBoundObserver(m mVar, t<? super T> tVar) {
            super(tVar);
            this.f3414l = mVar;
        }

        /* access modifiers changed from: package-private */
        public void h() {
            this.f3414l.getLifecycle().c(this);
        }

        /* access modifiers changed from: package-private */
        public boolean i(m mVar) {
            return this.f3414l == mVar;
        }

        /* access modifiers changed from: package-private */
        public boolean j() {
            return this.f3414l.getLifecycle().b().d(h.b.STARTED);
        }

        public void onStateChanged(m mVar, h.a aVar) {
            h.b b10 = this.f3414l.getLifecycle().b();
            if (b10 == h.b.DESTROYED) {
                LiveData.this.removeObserver(this.f3418h);
                return;
            }
            h.b bVar = null;
            while (bVar != b10) {
                g(j());
                bVar = b10;
                b10 = this.f3414l.getLifecycle().b();
            }
        }
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.mDataLock) {
                obj = LiveData.this.mPendingData;
                LiveData.this.mPendingData = LiveData.NOT_SET;
            }
            LiveData.this.setValue(obj);
        }
    }

    private class b extends LiveData<T>.c {
        b(t<? super T> tVar) {
            super(tVar);
        }

        /* access modifiers changed from: package-private */
        public boolean j() {
            return true;
        }
    }

    private abstract class c {

        /* renamed from: h  reason: collision with root package name */
        final t<? super T> f3418h;

        /* renamed from: i  reason: collision with root package name */
        boolean f3419i;

        /* renamed from: j  reason: collision with root package name */
        int f3420j = -1;

        c(t<? super T> tVar) {
            this.f3418h = tVar;
        }

        /* access modifiers changed from: package-private */
        public void g(boolean z10) {
            if (z10 != this.f3419i) {
                this.f3419i = z10;
                LiveData.this.changeActiveCounter(z10 ? 1 : -1);
                if (this.f3419i) {
                    LiveData.this.dispatchingValue(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void h() {
        }

        /* access modifiers changed from: package-private */
        public boolean i(m mVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public abstract boolean j();
    }

    public LiveData(T t10) {
        this.mDataLock = new Object();
        this.mObservers = new o.b<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new a();
        this.mData = t10;
        this.mVersion = 0;
    }

    static void assertMainThread(String str) {
        if (!n.c.g().b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    private void considerNotify(LiveData<T>.c cVar) {
        if (cVar.f3419i) {
            if (!cVar.j()) {
                cVar.g(false);
                return;
            }
            int i10 = cVar.f3420j;
            int i11 = this.mVersion;
            if (i10 < i11) {
                cVar.f3420j = i11;
                cVar.f3418h.a(this.mData);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void changeActiveCounter(int i10) {
        int i11 = this.mActiveCount;
        this.mActiveCount = i10 + i11;
        if (!this.mChangingActiveState) {
            this.mChangingActiveState = true;
            while (true) {
                try {
                    int i12 = this.mActiveCount;
                    if (i11 != i12) {
                        boolean z10 = i11 == 0 && i12 > 0;
                        boolean z11 = i11 > 0 && i12 == 0;
                        if (z10) {
                            onActive();
                        } else if (z11) {
                            onInactive();
                        }
                        i11 = i12;
                    } else {
                        return;
                    }
                } finally {
                    this.mChangingActiveState = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchingValue(LiveData<T>.c cVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (cVar == null) {
                o.b<K, V>.d c10 = this.mObservers.c();
                while (c10.hasNext()) {
                    considerNotify((c) ((Map.Entry) c10.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            } else {
                considerNotify(cVar);
                cVar = null;
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public T getValue() {
        T t10 = this.mData;
        if (t10 != NOT_SET) {
            return t10;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.size() > 0;
    }

    public boolean isInitialized() {
        return this.mData != NOT_SET;
    }

    public void observe(m mVar, t<? super T> tVar) {
        assertMainThread("observe");
        if (mVar.getLifecycle().b() != h.b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(mVar, tVar);
            c f10 = this.mObservers.f(tVar, lifecycleBoundObserver);
            if (f10 != null && !f10.i(mVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (f10 == null) {
                mVar.getLifecycle().a(lifecycleBoundObserver);
            }
        }
    }

    public void observeForever(t<? super T> tVar) {
        assertMainThread("observeForever");
        b bVar = new b(tVar);
        c f10 = this.mObservers.f(tVar, bVar);
        if (f10 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (f10 == null) {
            bVar.g(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onActive() {
    }

    /* access modifiers changed from: protected */
    public void onInactive() {
    }

    /* access modifiers changed from: protected */
    public void postValue(T t10) {
        boolean z10;
        synchronized (this.mDataLock) {
            z10 = this.mPendingData == NOT_SET;
            this.mPendingData = t10;
        }
        if (z10) {
            n.c.g().c(this.mPostValueRunnable);
        }
    }

    public void removeObserver(t<? super T> tVar) {
        assertMainThread("removeObserver");
        c g10 = this.mObservers.g(tVar);
        if (g10 != null) {
            g10.h();
            g10.g(false);
        }
    }

    public void removeObservers(m mVar) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<t<? super T>, LiveData<T>.c>> it = this.mObservers.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (((c) next.getValue()).i(mVar)) {
                removeObserver((t) next.getKey());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setValue(T t10) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t10;
        dispatchingValue((LiveData<T>.c) null);
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new o.b<>();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new a();
        this.mData = obj;
        this.mVersion = -1;
    }
}
