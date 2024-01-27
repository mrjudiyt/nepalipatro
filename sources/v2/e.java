package v2;

import e2.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ResourceDecoderRegistry */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f12318a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, List<a<?, ?>>> f12319b = new HashMap();

    /* compiled from: ResourceDecoderRegistry */
    private static class a<T, R> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f12320a;

        /* renamed from: b  reason: collision with root package name */
        final Class<R> f12321b;

        /* renamed from: c  reason: collision with root package name */
        final i<T, R> f12322c;

        public a(Class<T> cls, Class<R> cls2, i<T, R> iVar) {
            this.f12320a = cls;
            this.f12321b = cls2;
            this.f12322c = iVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f12320a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f12321b);
        }
    }

    private synchronized List<a<?, ?>> c(String str) {
        List<a<?, ?>> list;
        if (!this.f12318a.contains(str)) {
            this.f12318a.add(str);
        }
        list = this.f12319b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f12319b.put(str, list);
        }
        return list;
    }

    public synchronized <T, R> void a(String str, i<T, R> iVar, Class<T> cls, Class<R> cls2) {
        c(str).add(new a(cls, cls2, iVar));
    }

    public synchronized <T, R> List<i<T, R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f12318a) {
            List<a> list = this.f12319b.get(str);
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f12322c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> List<Class<R>> d(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f12318a) {
            List<a> list = this.f12319b.get(str);
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f12321b)) {
                        arrayList.add(aVar.f12321b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>(this.f12318a);
        this.f12318a.clear();
        for (String add : list) {
            this.f12318a.add(add);
        }
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f12318a.add(str);
            }
        }
    }
}
