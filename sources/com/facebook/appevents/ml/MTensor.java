package com.facebook.appevents.ml;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: MTensor.kt */
public final class MTensor {
    public static final Companion Companion = new Companion((g) null);
    private int capacity;
    private float[] data;
    private int[] shape;

    /* compiled from: MTensor.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final int getCapacity(int[] iArr) {
            int i10 = 1;
            if (!(iArr.length == 0)) {
                int i11 = iArr[0];
                int q10 = k.q(iArr);
                if (1 <= q10) {
                    while (true) {
                        i11 *= iArr[i10];
                        if (i10 == q10) {
                            break;
                        }
                        i10++;
                    }
                }
                return i11;
            }
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
    }

    public MTensor(int[] iArr) {
        m.f(iArr, "shape");
        this.shape = iArr;
        int access$getCapacity = Companion.getCapacity(iArr);
        this.capacity = access$getCapacity;
        this.data = new float[access$getCapacity];
    }

    public final float[] getData() {
        return this.data;
    }

    public final int getShape(int i10) {
        return this.shape[i10];
    }

    public final int getShapeSize() {
        return this.shape.length;
    }

    public final void reshape(int[] iArr) {
        m.f(iArr, "shape");
        this.shape = iArr;
        int access$getCapacity = Companion.getCapacity(iArr);
        float[] fArr = new float[access$getCapacity];
        System.arraycopy(this.data, 0, fArr, 0, Math.min(this.capacity, access$getCapacity));
        this.data = fArr;
        this.capacity = access$getCapacity;
    }
}
