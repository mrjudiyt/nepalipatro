package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import e2.g;
import e2.i;
import h2.c;

/* compiled from: ParcelFileDescriptorBitmapDecoder */
public final class s implements i<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final k f5915a;

    public s(k kVar) {
        this.f5915a = kVar;
    }

    /* renamed from: c */
    public c<Bitmap> a(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, g gVar) {
        return this.f5915a.d(parcelFileDescriptor, i10, i11, gVar);
    }

    /* renamed from: d */
    public boolean b(ParcelFileDescriptor parcelFileDescriptor, g gVar) {
        return this.f5915a.o(parcelFileDescriptor);
    }
}
