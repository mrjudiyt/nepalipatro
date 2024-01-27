package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.engine.q;
import e2.j;
import f2.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import l2.n;
import l2.o;
import l2.p;
import v2.a;
import v2.b;
import v2.c;
import v2.d;
import v2.e;
import v2.f;

public class Registry {

    /* renamed from: a  reason: collision with root package name */
    private final p f5549a;

    /* renamed from: b  reason: collision with root package name */
    private final a f5550b;

    /* renamed from: c  reason: collision with root package name */
    private final e f5551c;

    /* renamed from: d  reason: collision with root package name */
    private final f f5552d;

    /* renamed from: e  reason: collision with root package name */
    private final f2.f f5553e;

    /* renamed from: f  reason: collision with root package name */
    private final s2.f f5554f;

    /* renamed from: g  reason: collision with root package name */
    private final b f5555g;

    /* renamed from: h  reason: collision with root package name */
    private final d f5556h = new d();

    /* renamed from: i  reason: collision with root package name */
    private final c f5557i = new c();

    /* renamed from: j  reason: collision with root package name */
    private final androidx.core.util.e<List<Throwable>> f5558j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(M m10, List<n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m10);
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        androidx.core.util.e<List<Throwable>> e10 = b3.a.e();
        this.f5558j = e10;
        this.f5549a = new p(e10);
        this.f5550b = new a();
        this.f5551c = new e();
        this.f5552d = new f();
        this.f5553e = new f2.f();
        this.f5554f = new s2.f();
        this.f5555g = new b();
        r(Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"}));
    }

    private <Data, TResource, Transcode> List<i<Data, TResource, Transcode>> f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class next : this.f5551c.d(cls, cls2)) {
            for (Class next2 : this.f5554f.b(next, cls3)) {
                arrayList.add(new i(cls, next, next2, this.f5551c.b(cls, next), this.f5554f.a(next, next2), this.f5558j));
            }
        }
        return arrayList;
    }

    public <Data> Registry a(Class<Data> cls, e2.d<Data> dVar) {
        this.f5550b.a(cls, dVar);
        return this;
    }

    public <TResource> Registry b(Class<TResource> cls, j<TResource> jVar) {
        this.f5552d.a(cls, jVar);
        return this;
    }

    public <Data, TResource> Registry c(Class<Data> cls, Class<TResource> cls2, e2.i<Data, TResource> iVar) {
        e("legacy_append", cls, cls2, iVar);
        return this;
    }

    public <Model, Data> Registry d(Class<Model> cls, Class<Data> cls2, o<Model, Data> oVar) {
        this.f5549a.a(cls, cls2, oVar);
        return this;
    }

    public <Data, TResource> Registry e(String str, Class<Data> cls, Class<TResource> cls2, e2.i<Data, TResource> iVar) {
        this.f5551c.a(str, iVar, cls, cls2);
        return this;
    }

    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> b10 = this.f5555g.b();
        if (!b10.isEmpty()) {
            return b10;
        }
        throw new NoImageHeaderParserException();
    }

    public <Data, TResource, Transcode> q<Data, TResource, Transcode> h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        q<Data, TResource, Transcode> a10 = this.f5557i.a(cls, cls2, cls3);
        if (this.f5557i.c(a10)) {
            return null;
        }
        if (a10 == null) {
            List<i<Data, TResource, Transcode>> f10 = f(cls, cls2, cls3);
            if (f10.isEmpty()) {
                a10 = null;
            } else {
                a10 = new q<>(cls, cls2, cls3, f10, this.f5558j);
            }
            this.f5557i.d(cls, cls2, cls3, a10);
        }
        return a10;
    }

    public <Model> List<n<Model, ?>> i(Model model) {
        return this.f5549a.d(model);
    }

    public <Model, TResource, Transcode> List<Class<?>> j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a10 = this.f5556h.a(cls, cls2, cls3);
        if (a10 == null) {
            a10 = new ArrayList<>();
            for (Class<?> d10 : this.f5549a.c(cls)) {
                for (Class next : this.f5551c.d(d10, cls2)) {
                    if (!this.f5554f.b(next, cls3).isEmpty() && !a10.contains(next)) {
                        a10.add(next);
                    }
                }
            }
            this.f5556h.b(cls, cls2, cls3, Collections.unmodifiableList(a10));
        }
        return a10;
    }

    public <X> j<X> k(h2.c<X> cVar) {
        j<X> b10 = this.f5552d.b(cVar.c());
        if (b10 != null) {
            return b10;
        }
        throw new NoResultEncoderAvailableException(cVar.c());
    }

    public <X> f2.e<X> l(X x10) {
        return this.f5553e.a(x10);
    }

    public <X> e2.d<X> m(X x10) {
        e2.d<X> b10 = this.f5550b.b(x10.getClass());
        if (b10 != null) {
            return b10;
        }
        throw new NoSourceEncoderAvailableException(x10.getClass());
    }

    public boolean n(h2.c<?> cVar) {
        return this.f5552d.b(cVar.c()) != null;
    }

    public Registry o(ImageHeaderParser imageHeaderParser) {
        this.f5555g.a(imageHeaderParser);
        return this;
    }

    public Registry p(e.a<?> aVar) {
        this.f5553e.b(aVar);
        return this;
    }

    public <TResource, Transcode> Registry q(Class<TResource> cls, Class<Transcode> cls2, s2.e<TResource, Transcode> eVar) {
        this.f5554f.c(cls, cls2, eVar);
        return this;
    }

    public final Registry r(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f5551c.e(arrayList);
        return this;
    }
}
