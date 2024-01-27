package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.jvm.internal.m;
import o8.q;

/* compiled from: ExtensionWindowLayoutInfoBackend.kt */
public final class h implements p {

    /* renamed from: a  reason: collision with root package name */
    private final WindowLayoutComponent f4603a;

    /* renamed from: b  reason: collision with root package name */
    private final ReentrantLock f4604b = new ReentrantLock();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Activity, a> f4605c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<androidx.core.util.a<u>, Activity> f4606d = new LinkedHashMap();

    @SuppressLint({"NewApi"})
    /* compiled from: ExtensionWindowLayoutInfoBackend.kt */
    private static final class a implements Consumer<WindowLayoutInfo> {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f4607a;

        /* renamed from: b  reason: collision with root package name */
        private final ReentrantLock f4608b = new ReentrantLock();

        /* renamed from: c  reason: collision with root package name */
        private u f4609c;

        /* renamed from: d  reason: collision with root package name */
        private final Set<androidx.core.util.a<u>> f4610d = new LinkedHashSet();

        public a(Activity activity) {
            m.f(activity, "activity");
            this.f4607a = activity;
        }

        /* renamed from: a */
        public void accept(WindowLayoutInfo windowLayoutInfo) {
            m.f(windowLayoutInfo, "value");
            ReentrantLock reentrantLock = this.f4608b;
            reentrantLock.lock();
            try {
                this.f4609c = i.f4611a.b(this.f4607a, windowLayoutInfo);
                for (androidx.core.util.a accept : this.f4610d) {
                    accept.accept(this.f4609c);
                }
                q qVar = q.f16189a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void b(androidx.core.util.a<u> aVar) {
            m.f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            ReentrantLock reentrantLock = this.f4608b;
            reentrantLock.lock();
            try {
                u uVar = this.f4609c;
                if (uVar != null) {
                    aVar.accept(uVar);
                }
                this.f4610d.add(aVar);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final boolean c() {
            return this.f4610d.isEmpty();
        }

        public final void d(androidx.core.util.a<u> aVar) {
            m.f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            ReentrantLock reentrantLock = this.f4608b;
            reentrantLock.lock();
            try {
                this.f4610d.remove(aVar);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public h(WindowLayoutComponent windowLayoutComponent) {
        m.f(windowLayoutComponent, "component");
        this.f4603a = windowLayoutComponent;
    }

    public void a(androidx.core.util.a<u> aVar) {
        m.f(aVar, "callback");
        ReentrantLock reentrantLock = this.f4604b;
        reentrantLock.lock();
        try {
            Activity activity = this.f4606d.get(aVar);
            if (activity != null) {
                a aVar2 = this.f4605c.get(activity);
                if (aVar2 == null) {
                    reentrantLock.unlock();
                    return;
                }
                aVar2.d(aVar);
                if (aVar2.c()) {
                    this.f4603a.removeWindowLayoutInfoListener(aVar2);
                }
                q qVar = q.f16189a;
                reentrantLock.unlock();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void b(Activity activity, Executor executor, androidx.core.util.a<u> aVar) {
        q qVar;
        m.f(activity, "activity");
        m.f(executor, "executor");
        m.f(aVar, "callback");
        ReentrantLock reentrantLock = this.f4604b;
        reentrantLock.lock();
        try {
            a aVar2 = this.f4605c.get(activity);
            if (aVar2 == null) {
                qVar = null;
            } else {
                aVar2.b(aVar);
                this.f4606d.put(aVar, activity);
                qVar = q.f16189a;
            }
            if (qVar == null) {
                a aVar3 = new a(activity);
                this.f4605c.put(activity, aVar3);
                this.f4606d.put(aVar, activity);
                aVar3.b(aVar);
                this.f4603a.addWindowLayoutInfoListener(activity, aVar3);
            }
            q qVar2 = q.f16189a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
