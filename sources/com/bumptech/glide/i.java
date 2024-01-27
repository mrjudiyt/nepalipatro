package com.bumptech.glide;

import com.bumptech.glide.i;
import y2.a;
import y2.c;

/* compiled from: TransitionOptions */
public abstract class i<CHILD extends i<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: h  reason: collision with root package name */
    private c<? super TranscodeType> f5632h = a.a();

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (i) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final c<? super TranscodeType> b() {
        return this.f5632h;
    }
}
