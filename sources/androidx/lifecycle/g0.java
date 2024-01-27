package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: ViewModel */
public abstract class g0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f3478a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Set<Closeable> f3479b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f3480c = false;

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f3480c = true;
        Map<String, Object> map = this.f3478a;
        if (map != null) {
            synchronized (map) {
                for (Object b10 : this.f3478a.values()) {
                    b(b10);
                }
            }
        }
        Set<Closeable> set = this.f3479b;
        if (set != null) {
            synchronized (set) {
                for (Closeable b11 : this.f3479b) {
                    b(b11);
                }
            }
        }
        d();
    }

    /* access modifiers changed from: package-private */
    public <T> T c(String str) {
        T t10;
        Map<String, Object> map = this.f3478a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t10 = this.f3478a.get(str);
        }
        return t10;
    }

    /* access modifiers changed from: protected */
    public void d() {
    }

    /* access modifiers changed from: package-private */
    public <T> T e(String str, T t10) {
        T t11;
        synchronized (this.f3478a) {
            t11 = this.f3478a.get(str);
            if (t11 == null) {
                this.f3478a.put(str, t10);
            }
        }
        if (t11 != null) {
            t10 = t11;
        }
        if (this.f3480c) {
            b(t10);
        }
        return t10;
    }
}
