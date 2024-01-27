package com.bumptech.glide.load.engine;

import a3.j;
import android.util.Log;
import e2.g;
import h2.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import s2.e;

/* compiled from: DecodePath */
public class i<DataType, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<DataType> f5738a;

    /* renamed from: b  reason: collision with root package name */
    private final List<? extends e2.i<DataType, ResourceType>> f5739b;

    /* renamed from: c  reason: collision with root package name */
    private final e<ResourceType, Transcode> f5740c;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.core.util.e<List<Throwable>> f5741d;

    /* renamed from: e  reason: collision with root package name */
    private final String f5742e;

    /* compiled from: DecodePath */
    interface a<ResourceType> {
        c<ResourceType> a(c<ResourceType> cVar);
    }

    public i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends e2.i<DataType, ResourceType>> list, e<ResourceType, Transcode> eVar, androidx.core.util.e<List<Throwable>> eVar2) {
        this.f5738a = cls;
        this.f5739b = list;
        this.f5740c = eVar;
        this.f5741d = eVar2;
        this.f5742e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private c<ResourceType> b(f2.e<DataType> eVar, int i10, int i11, g gVar) {
        List list = (List) j.d(this.f5741d.b());
        try {
            return c(eVar, i10, i11, gVar, list);
        } finally {
            this.f5741d.a(list);
        }
    }

    private c<ResourceType> c(f2.e<DataType> eVar, int i10, int i11, g gVar, List<Throwable> list) {
        int size = this.f5739b.size();
        c<ResourceType> cVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            e2.i iVar = (e2.i) this.f5739b.get(i12);
            try {
                if (iVar.b(eVar.a(), gVar)) {
                    cVar = iVar.a(eVar.a(), i10, i11, gVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to decode data for ");
                    sb.append(iVar);
                }
                list.add(e10);
            }
            if (cVar != null) {
                break;
            }
        }
        if (cVar != null) {
            return cVar;
        }
        throw new GlideException(this.f5742e, (List<Throwable>) new ArrayList(list));
    }

    public c<Transcode> a(f2.e<DataType> eVar, int i10, int i11, g gVar, a<ResourceType> aVar) {
        return this.f5740c.a(aVar.a(b(eVar, i10, i11, gVar)), gVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f5738a + ", decoders=" + this.f5739b + ", transcoder=" + this.f5740c + '}';
    }
}
