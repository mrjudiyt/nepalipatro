package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.facebook.internal.NativeProtocol;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public abstract class ActivityResultRegistry {

    /* renamed from: a  reason: collision with root package name */
    private Random f523a = new Random();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, String> f524b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final Map<String, Integer> f525c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, d> f526d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    ArrayList<String> f527e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    final transient Map<String, c<?>> f528f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    final Map<String, Object> f529g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    final Bundle f530h = new Bundle();

    class a extends c<I> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f535a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e.a f536b;

        a(String str, e.a aVar) {
            this.f535a = str;
            this.f536b = aVar;
        }

        public e.a<I, ?> a() {
            return this.f536b;
        }

        public void c(I i10, androidx.core.app.c cVar) {
            Integer num = ActivityResultRegistry.this.f525c.get(this.f535a);
            if (num != null) {
                ActivityResultRegistry.this.f527e.add(this.f535a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f536b, i10, cVar);
                } catch (Exception e10) {
                    ActivityResultRegistry.this.f527e.remove(this.f535a);
                    throw e10;
                }
            } else {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f536b + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
        }

        public void d() {
            ActivityResultRegistry.this.l(this.f535a);
        }
    }

    class b extends c<I> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f538a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e.a f539b;

        b(String str, e.a aVar) {
            this.f538a = str;
            this.f539b = aVar;
        }

        public e.a<I, ?> a() {
            return this.f539b;
        }

        public void c(I i10, androidx.core.app.c cVar) {
            Integer num = ActivityResultRegistry.this.f525c.get(this.f538a);
            if (num != null) {
                ActivityResultRegistry.this.f527e.add(this.f538a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f539b, i10, cVar);
                } catch (Exception e10) {
                    ActivityResultRegistry.this.f527e.remove(this.f538a);
                    throw e10;
                }
            } else {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f539b + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
        }

        public void d() {
            ActivityResultRegistry.this.l(this.f538a);
        }
    }

    private static class c<O> {

        /* renamed from: a  reason: collision with root package name */
        final b<O> f541a;

        /* renamed from: b  reason: collision with root package name */
        final e.a<?, O> f542b;

        c(b<O> bVar, e.a<?, O> aVar) {
            this.f541a = bVar;
            this.f542b = aVar;
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        final h f543a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<k> f544b = new ArrayList<>();

        d(h hVar) {
            this.f543a = hVar;
        }

        /* access modifiers changed from: package-private */
        public void a(k kVar) {
            this.f543a.a(kVar);
            this.f544b.add(kVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Iterator<k> it = this.f544b.iterator();
            while (it.hasNext()) {
                this.f543a.c(it.next());
            }
            this.f544b.clear();
        }
    }

    private void a(int i10, String str) {
        this.f524b.put(Integer.valueOf(i10), str);
        this.f525c.put(str, Integer.valueOf(i10));
    }

    private <O> void d(String str, int i10, Intent intent, c<O> cVar) {
        if (cVar == null || cVar.f541a == null || !this.f527e.contains(str)) {
            this.f529g.remove(str);
            this.f530h.putParcelable(str, new a(i10, intent));
            return;
        }
        cVar.f541a.a(cVar.f542b.parseResult(i10, intent));
        this.f527e.remove(str);
    }

    private int e() {
        int nextInt = this.f523a.nextInt(2147418112);
        while (true) {
            int i10 = nextInt + NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
            if (!this.f524b.containsKey(Integer.valueOf(i10))) {
                return i10;
            }
            nextInt = this.f523a.nextInt(2147418112);
        }
    }

    private void k(String str) {
        if (this.f525c.get(str) == null) {
            a(e(), str);
        }
    }

    public final boolean b(int i10, int i11, Intent intent) {
        String str = this.f524b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        d(str, i11, intent, this.f528f.get(str));
        return true;
    }

    public final <O> boolean c(int i10, @SuppressLint({"UnknownNullness"}) O o10) {
        b<O> bVar;
        String str = this.f524b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        c cVar = this.f528f.get(str);
        if (cVar == null || (bVar = cVar.f541a) == null) {
            this.f530h.remove(str);
            this.f529g.put(str, o10);
            return true;
        } else if (!this.f527e.remove(str)) {
            return true;
        } else {
            bVar.a(o10);
            return true;
        }
    }

    public abstract <I, O> void f(int i10, e.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i11, androidx.core.app.c cVar);

    public final void g(Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                this.f527e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                this.f523a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                this.f530h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                    String str = stringArrayList.get(i10);
                    if (this.f525c.containsKey(str)) {
                        Integer remove = this.f525c.remove(str);
                        if (!this.f530h.containsKey(str)) {
                            this.f524b.remove(remove);
                        }
                    }
                    a(integerArrayList.get(i10).intValue(), stringArrayList.get(i10));
                }
            }
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.f525c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.f525c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(this.f527e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f530h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f523a);
    }

    public final <I, O> c<I> i(final String str, m mVar, final e.a<I, O> aVar, final b<O> bVar) {
        h lifecycle = mVar.getLifecycle();
        if (!lifecycle.b().d(h.b.STARTED)) {
            k(str);
            d dVar = this.f526d.get(str);
            if (dVar == null) {
                dVar = new d(lifecycle);
            }
            dVar.a(new k() {
                public void onStateChanged(m mVar, h.a aVar) {
                    if (h.a.ON_START.equals(aVar)) {
                        ActivityResultRegistry.this.f528f.put(str, new c(bVar, aVar));
                        if (ActivityResultRegistry.this.f529g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f529g.get(str);
                            ActivityResultRegistry.this.f529g.remove(str);
                            bVar.a(obj);
                        }
                        a aVar2 = (a) ActivityResultRegistry.this.f530h.getParcelable(str);
                        if (aVar2 != null) {
                            ActivityResultRegistry.this.f530h.remove(str);
                            bVar.a(aVar.parseResult(aVar2.c(), aVar2.b()));
                        }
                    } else if (h.a.ON_STOP.equals(aVar)) {
                        ActivityResultRegistry.this.f528f.remove(str);
                    } else if (h.a.ON_DESTROY.equals(aVar)) {
                        ActivityResultRegistry.this.l(str);
                    }
                }
            });
            this.f526d.put(str, dVar);
            return new a(str, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + mVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final <I, O> c<I> j(String str, e.a<I, O> aVar, b<O> bVar) {
        k(str);
        this.f528f.put(str, new c(bVar, aVar));
        if (this.f529g.containsKey(str)) {
            Object obj = this.f529g.get(str);
            this.f529g.remove(str);
            bVar.a(obj);
        }
        a aVar2 = (a) this.f530h.getParcelable(str);
        if (aVar2 != null) {
            this.f530h.remove(str);
            bVar.a(aVar.parseResult(aVar2.c(), aVar2.b()));
        }
        return new b(str, aVar);
    }

    /* access modifiers changed from: package-private */
    public final void l(String str) {
        Integer remove;
        if (!this.f527e.contains(str) && (remove = this.f525c.remove(str)) != null) {
            this.f524b.remove(remove);
        }
        this.f528f.remove(str);
        if (this.f529g.containsKey(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Dropping pending result for request ");
            sb.append(str);
            sb.append(": ");
            sb.append(this.f529g.get(str));
            this.f529g.remove(str);
        }
        if (this.f530h.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Dropping pending result for request ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(this.f530h.getParcelable(str));
            this.f530h.remove(str);
        }
        d dVar = this.f526d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f526d.remove(str);
        }
    }
}
