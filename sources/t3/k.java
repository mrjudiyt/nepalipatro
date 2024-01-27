package t3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MetadataBackendRegistry */
class k implements e {

    /* renamed from: a  reason: collision with root package name */
    private final a f11654a;

    /* renamed from: b  reason: collision with root package name */
    private final i f11655b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, m> f11656c;

    /* compiled from: MetadataBackendRegistry */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f11657a;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, String> f11658b = null;

        a(Context context) {
            this.f11657a = context;
        }

        private Map<String, String> a(Context context) {
            Bundle d10 = d(context);
            if (d10 == null) {
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d10.keySet()) {
                Object obj = d10.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String trim : ((String) obj).split(",", -1)) {
                        String trim2 = trim.trim();
                        if (!trim2.isEmpty()) {
                            hashMap.put(trim2, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        private Map<String, String> c() {
            if (this.f11658b == null) {
                this.f11658b = a(this.f11657a);
            }
            return this.f11658b;
        }

        private static Bundle d(Context context) {
            ServiceInfo serviceInfo;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128)) == null) {
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public d b(String str) {
            String str2 = c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str2).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                String.format("Class %s is not found.", new Object[]{str2});
                return null;
            } catch (IllegalAccessException unused2) {
                String.format("Could not instantiate %s.", new Object[]{str2});
                return null;
            } catch (InstantiationException unused3) {
                String.format("Could not instantiate %s.", new Object[]{str2});
                return null;
            } catch (NoSuchMethodException unused4) {
                String.format("Could not instantiate %s", new Object[]{str2});
                return null;
            } catch (InvocationTargetException unused5) {
                String.format("Could not instantiate %s", new Object[]{str2});
                return null;
            }
        }
    }

    k(Context context, i iVar) {
        this(new a(context), iVar);
    }

    public synchronized m a(String str) {
        if (this.f11656c.containsKey(str)) {
            return this.f11656c.get(str);
        }
        d b10 = this.f11654a.b(str);
        if (b10 == null) {
            return null;
        }
        m create = b10.create(this.f11655b.a(str));
        this.f11656c.put(str, create);
        return create;
    }

    k(a aVar, i iVar) {
        this.f11656c = new HashMap();
        this.f11654a = aVar;
        this.f11655b = iVar;
    }
}
