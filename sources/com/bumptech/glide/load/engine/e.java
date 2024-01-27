package com.bumptech.glide.load.engine;

import e2.d;
import e2.g;
import j2.a;
import java.io.File;

/* compiled from: DataCacheWriter */
class e<DataType> implements a.b {

    /* renamed from: a  reason: collision with root package name */
    private final d<DataType> f5676a;

    /* renamed from: b  reason: collision with root package name */
    private final DataType f5677b;

    /* renamed from: c  reason: collision with root package name */
    private final g f5678c;

    e(d<DataType> dVar, DataType datatype, g gVar) {
        this.f5676a = dVar;
        this.f5677b = datatype;
        this.f5678c = gVar;
    }

    public boolean a(File file) {
        return this.f5676a.a(this.f5677b, file, this.f5678c);
    }
}
