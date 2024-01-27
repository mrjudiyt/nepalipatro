package com.bumptech.glide.load.engine;

import a3.j;
import androidx.core.util.e;
import com.bumptech.glide.load.engine.i;
import e2.g;
import h2.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: LoadPath */
public class q<Data, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<Data> f5813a;

    /* renamed from: b  reason: collision with root package name */
    private final e<List<Throwable>> f5814b;

    /* renamed from: c  reason: collision with root package name */
    private final List<? extends i<Data, ResourceType, Transcode>> f5815c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5816d;

    public q(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<i<Data, ResourceType, Transcode>> list, e<List<Throwable>> eVar) {
        this.f5813a = cls;
        this.f5814b = eVar;
        this.f5815c = (List) j.c(list);
        this.f5816d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private c<Transcode> b(f2.e<Data> eVar, g gVar, int i10, int i11, i.a<ResourceType> aVar, List<Throwable> list) {
        List<Throwable> list2 = list;
        int size = this.f5815c.size();
        c<Transcode> cVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                cVar = ((i) this.f5815c.get(i12)).a(eVar, i10, i11, gVar, aVar);
            } catch (GlideException e10) {
                list2.add(e10);
            }
            if (cVar != null) {
                break;
            }
        }
        if (cVar != null) {
            return cVar;
        }
        throw new GlideException(this.f5816d, (List<Throwable>) new ArrayList(list2));
    }

    public c<Transcode> a(f2.e<Data> eVar, g gVar, int i10, int i11, i.a<ResourceType> aVar) {
        List list = (List) j.d(this.f5814b.b());
        try {
            return b(eVar, gVar, i10, i11, aVar, list);
        } finally {
            this.f5814b.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f5815c.toArray()) + '}';
    }
}
