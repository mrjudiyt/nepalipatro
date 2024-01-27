package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import g1.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: AppInitializer */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f4462d;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f4463e = new Object();

    /* renamed from: a  reason: collision with root package name */
    final Map<Class<?>, Object> f4464a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    final Set<Class<? extends g1.a<?>>> f4465b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    final Context f4466c;

    a(Context context) {
        this.f4466c = context.getApplicationContext();
    }

    private <T> T c(Class<? extends g1.a<?>> cls, Set<Class<?>> set) {
        T t10;
        if (h1.a.h()) {
            try {
                h1.a.c(cls.getSimpleName());
            } catch (Throwable th) {
                h1.a.f();
                throw th;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f4464a.containsKey(cls)) {
                set.add(cls);
                g1.a aVar = (g1.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends g1.a<?>>> a10 = aVar.a();
                if (!a10.isEmpty()) {
                    for (Class next : a10) {
                        if (!this.f4464a.containsKey(next)) {
                            c(next, set);
                        }
                    }
                }
                t10 = aVar.b(this.f4466c);
                set.remove(cls);
                this.f4464a.put(cls, t10);
            } else {
                t10 = this.f4464a.get(cls);
            }
            h1.a.f();
            return t10;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }

    public static a d(Context context) {
        if (f4462d == null) {
            synchronized (f4463e) {
                if (f4462d == null) {
                    f4462d = new a(context);
                }
            }
        }
        return f4462d;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        try {
            h1.a.c("Startup");
            b(this.f4466c.getPackageManager().getProviderInfo(new ComponentName(this.f4466c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            h1.a.f();
        } catch (PackageManager.NameNotFoundException e10) {
            throw new StartupException((Throwable) e10);
        } catch (Throwable th) {
            h1.a.f();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Bundle bundle) {
        String string = this.f4466c.getString(b.f8809a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, (String) null))) {
                        Class<?> cls = Class.forName(str);
                        if (g1.a.class.isAssignableFrom(cls)) {
                            this.f4465b.add(cls);
                        }
                    }
                }
                for (Class<? extends g1.a<?>> c10 : this.f4465b) {
                    c(c10, hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new StartupException((Throwable) e10);
            }
        }
    }

    public boolean e(Class<? extends g1.a<?>> cls) {
        return this.f4465b.contains(cls);
    }
}
