package com.facebook.appevents.ml;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.jvm.internal.m;

/* compiled from: Operator.kt */
public final class Operator {
    public static final Operator INSTANCE = new Operator();

    private Operator() {
    }

    public static final void addmv(MTensor mTensor, MTensor mTensor2) {
        Class<Operator> cls = Operator.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(mTensor, "x");
                m.f(mTensor2, "b");
                int shape = mTensor.getShape(0);
                int shape2 = mTensor.getShape(1);
                int shape3 = mTensor.getShape(2);
                float[] data = mTensor.getData();
                float[] data2 = mTensor2.getData();
                if (shape > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        if (shape2 > 0) {
                            int i12 = 0;
                            while (true) {
                                int i13 = i12 + 1;
                                if (shape3 > 0) {
                                    int i14 = 0;
                                    while (true) {
                                        int i15 = i14 + 1;
                                        int i16 = (i10 * shape2 * shape3) + (i12 * shape3) + i14;
                                        data[i16] = data[i16] + data2[i14];
                                        if (i15 >= shape3) {
                                            break;
                                        }
                                        i14 = i15;
                                    }
                                }
                                if (i13 >= shape2) {
                                    break;
                                }
                                i12 = i13;
                            }
                        }
                        if (i11 < shape) {
                            i10 = i11;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final MTensor concatenate(MTensor[] mTensorArr) {
        int i10;
        MTensor[] mTensorArr2 = mTensorArr;
        Class<Operator> cls = Operator.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            m.f(mTensorArr2, "tensors");
            int shape = mTensorArr2[0].getShape(0);
            int length = mTensorArr2.length - 1;
            if (length >= 0) {
                int i11 = 0;
                i10 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    i10 += mTensorArr2[i11].getShape(1);
                    if (i12 > length) {
                        break;
                    }
                    i11 = i12;
                }
            } else {
                i10 = 0;
            }
            MTensor mTensor = new MTensor(new int[]{shape, i10});
            float[] data = mTensor.getData();
            if (shape > 0) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    int i15 = i13 * i10;
                    int length2 = mTensorArr2.length - 1;
                    if (length2 >= 0) {
                        int i16 = 0;
                        while (true) {
                            int i17 = i16 + 1;
                            float[] data2 = mTensorArr2[i16].getData();
                            int shape2 = mTensorArr2[i16].getShape(1);
                            System.arraycopy(data2, i13 * shape2, data, i15, shape2);
                            i15 += shape2;
                            if (i17 > length2) {
                                break;
                            }
                            i16 = i17;
                        }
                    }
                    if (i14 >= shape) {
                        break;
                    }
                    i13 = i14;
                }
            }
            return mTensor;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final MTensor conv1D(MTensor mTensor, MTensor mTensor2) {
        Class<Operator> cls;
        MTensor mTensor3;
        Class<Operator> cls2;
        MTensor mTensor4 = mTensor;
        MTensor mTensor5 = mTensor2;
        Class<Operator> cls3 = Operator.class;
        if (CrashShieldHandler.isObjectCrashing(cls3)) {
            return null;
        }
        try {
            m.f(mTensor4, "x");
            m.f(mTensor5, "w");
            int shape = mTensor4.getShape(0);
            int shape2 = mTensor4.getShape(1);
            int shape3 = mTensor4.getShape(2);
            int shape4 = mTensor5.getShape(0);
            int i10 = (shape2 - shape4) + 1;
            int shape5 = mTensor5.getShape(2);
            MTensor mTensor6 = new MTensor(new int[]{shape, i10, shape5});
            float[] data = mTensor.getData();
            float[] data2 = mTensor6.getData();
            float[] data3 = mTensor2.getData();
            if (shape <= 0) {
                return mTensor6;
            }
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (shape5 > 0) {
                    int i13 = 0;
                    while (true) {
                        int i14 = i13 + 1;
                        if (i10 > 0) {
                            int i15 = 0;
                            while (true) {
                                int i16 = i15 + 1;
                                float f10 = 0.0f;
                                if (shape4 > 0) {
                                    int i17 = 0;
                                    while (true) {
                                        cls2 = cls3;
                                        int i18 = i17 + 1;
                                        if (shape3 > 0) {
                                            int i19 = 0;
                                            while (true) {
                                                mTensor3 = mTensor6;
                                                int i20 = i19 + 1;
                                                try {
                                                    f10 += data[(shape2 * shape3 * i11) + ((i17 + i15) * shape3) + i19] * data3[(((i17 * shape3) + i19) * shape5) + i13];
                                                    if (i20 >= shape3) {
                                                        break;
                                                    }
                                                    i19 = i20;
                                                    mTensor6 = mTensor3;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    cls = cls2;
                                                    CrashShieldHandler.handleThrowable(th, cls);
                                                    return null;
                                                }
                                            }
                                        } else {
                                            mTensor3 = mTensor6;
                                        }
                                        if (i18 >= shape4) {
                                            break;
                                        }
                                        i17 = i18;
                                        cls3 = cls2;
                                        mTensor6 = mTensor3;
                                    }
                                } else {
                                    cls2 = cls3;
                                    mTensor3 = mTensor6;
                                }
                                data2[(i10 * shape5 * i11) + (i15 * shape5) + i13] = f10;
                                if (i16 >= i10) {
                                    break;
                                }
                                i15 = i16;
                                cls3 = cls2;
                                mTensor6 = mTensor3;
                            }
                        } else {
                            cls2 = cls3;
                            mTensor3 = mTensor6;
                        }
                        if (i14 >= shape5) {
                            break;
                        }
                        i13 = i14;
                        cls3 = cls2;
                        mTensor6 = mTensor3;
                    }
                } else {
                    cls2 = cls3;
                    mTensor3 = mTensor6;
                }
                if (i12 >= shape) {
                    return mTensor3;
                }
                i11 = i12;
                cls3 = cls2;
                mTensor6 = mTensor3;
            }
        } catch (Throwable th2) {
            th = th2;
            cls = cls3;
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final MTensor dense(MTensor mTensor, MTensor mTensor2, MTensor mTensor3) {
        Class<Operator> cls = Operator.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            m.f(mTensor, "x");
            m.f(mTensor2, "w");
            m.f(mTensor3, "b");
            int shape = mTensor.getShape(0);
            int shape2 = mTensor3.getShape(0);
            MTensor mul = mul(mTensor, mTensor2);
            float[] data = mTensor3.getData();
            float[] data2 = mul.getData();
            if (shape > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (shape2 > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            int i14 = (i10 * shape2) + i12;
                            data2[i14] = data2[i14] + data[i12];
                            if (i13 >= shape2) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    if (i11 >= shape) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return mul;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final MTensor embedding(String[] strArr, int i10, MTensor mTensor) {
        String[] strArr2 = strArr;
        int i11 = i10;
        MTensor mTensor2 = mTensor;
        Class<Operator> cls = Operator.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            m.f(strArr2, "texts");
            m.f(mTensor2, "w");
            int length = strArr2.length;
            int shape = mTensor2.getShape(1);
            MTensor mTensor3 = new MTensor(new int[]{length, i11, shape});
            float[] data = mTensor3.getData();
            float[] data2 = mTensor.getData();
            if (length > 0) {
                int i12 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    int[] vectorize = Utils.INSTANCE.vectorize(strArr2[i12], i11);
                    if (i11 > 0) {
                        int i14 = 0;
                        while (true) {
                            int i15 = i14 + 1;
                            System.arraycopy(data2, vectorize[i14] * shape, data, (shape * i11 * i12) + (i14 * shape), shape);
                            if (i15 >= i11) {
                                break;
                            }
                            i14 = i15;
                        }
                    }
                    if (i13 >= length) {
                        break;
                    }
                    i12 = i13;
                }
            }
            return mTensor3;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final void flatten(MTensor mTensor, int i10) {
        Class<Operator> cls = Operator.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(mTensor, "x");
                if (i10 < mTensor.getShapeSize()) {
                    int shapeSize = mTensor.getShapeSize();
                    int i11 = 1;
                    if (i10 < shapeSize) {
                        int i12 = i10;
                        while (true) {
                            int i13 = i12 + 1;
                            i11 *= mTensor.getShape(i12);
                            if (i13 >= shapeSize) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    int[] iArr = new int[(i10 + 1)];
                    int i14 = 0;
                    if (i10 > 0) {
                        while (true) {
                            int i15 = i14 + 1;
                            iArr[i14] = mTensor.getShape(i14);
                            if (i15 >= i10) {
                                break;
                            }
                            i14 = i15;
                        }
                    }
                    iArr[i10] = i11;
                    mTensor.reshape(iArr);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final MTensor maxPool1D(MTensor mTensor, int i10) {
        int i11;
        MTensor mTensor2 = mTensor;
        int i12 = i10;
        Class<Operator> cls = Operator.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            m.f(mTensor2, "x");
            int shape = mTensor2.getShape(0);
            int shape2 = mTensor2.getShape(1);
            int shape3 = mTensor2.getShape(2);
            int i13 = (shape2 - i12) + 1;
            MTensor mTensor3 = new MTensor(new int[]{shape, i13, shape3});
            float[] data = mTensor.getData();
            float[] data2 = mTensor3.getData();
            if (shape > 0) {
                int i14 = 0;
                while (true) {
                    int i15 = i14 + 1;
                    if (shape3 > 0) {
                        int i16 = 0;
                        while (true) {
                            int i17 = i16 + 1;
                            if (i13 > 0) {
                                int i18 = 0;
                                while (true) {
                                    int i19 = i18 + 1;
                                    int i20 = i18 * shape3;
                                    int i21 = (i14 * i13 * shape3) + i20 + i16;
                                    int i22 = (i14 * shape2 * shape3) + i20 + i16;
                                    data2[i21] = Float.MIN_VALUE;
                                    if (i12 > 0) {
                                        int i23 = 0;
                                        while (true) {
                                            int i24 = i23 + 1;
                                            i11 = shape2;
                                            data2[i21] = Math.max(data2[i21], data[i22 + (i23 * shape3)]);
                                            if (i24 >= i12) {
                                                break;
                                            }
                                            i23 = i24;
                                            shape2 = i11;
                                        }
                                    } else {
                                        i11 = shape2;
                                    }
                                    if (i19 >= i13) {
                                        break;
                                    }
                                    i18 = i19;
                                    shape2 = i11;
                                }
                            } else {
                                i11 = shape2;
                            }
                            if (i17 >= shape3) {
                                break;
                            }
                            i16 = i17;
                            shape2 = i11;
                        }
                    } else {
                        i11 = shape2;
                    }
                    if (i15 >= shape) {
                        break;
                    }
                    i14 = i15;
                    shape2 = i11;
                }
            }
            return mTensor3;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final MTensor mul(MTensor mTensor, MTensor mTensor2) {
        MTensor mTensor3 = mTensor;
        MTensor mTensor4 = mTensor2;
        Class<Operator> cls = Operator.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            m.f(mTensor3, "x");
            m.f(mTensor4, "w");
            int shape = mTensor3.getShape(0);
            int shape2 = mTensor4.getShape(0);
            int shape3 = mTensor4.getShape(1);
            MTensor mTensor5 = new MTensor(new int[]{shape, shape3});
            float[] data = mTensor.getData();
            float[] data2 = mTensor2.getData();
            float[] data3 = mTensor5.getData();
            if (shape > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (shape3 > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            int i14 = (i10 * shape3) + i12;
                            data3[i14] = 0.0f;
                            if (shape2 > 0) {
                                int i15 = 0;
                                while (true) {
                                    int i16 = i15 + 1;
                                    data3[i14] = data3[i14] + (data[(i10 * shape2) + i15] * data2[(i15 * shape3) + i12]);
                                    if (i16 >= shape2) {
                                        break;
                                    }
                                    i15 = i16;
                                }
                            }
                            if (i13 >= shape3) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    if (i11 >= shape) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return mTensor5;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final void relu(MTensor mTensor) {
        Class<Operator> cls = Operator.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(mTensor, "x");
                float[] data = mTensor.getData();
                int i10 = 0;
                int length = data.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i11 = i10 + 1;
                        if (data[i10] < 0.0f) {
                            data[i10] = 0.0f;
                        }
                        if (i11 <= length) {
                            i10 = i11;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final void softmax(MTensor mTensor) {
        Class<Operator> cls = Operator.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(mTensor, "x");
                int i10 = 0;
                int shape = mTensor.getShape(0);
                int shape2 = mTensor.getShape(1);
                float[] data = mTensor.getData();
                if (shape > 0) {
                    while (true) {
                        int i11 = i10 + 1;
                        int i12 = i10 * shape2;
                        int i13 = i12 + shape2;
                        float f10 = Float.MIN_VALUE;
                        float f11 = 0.0f;
                        if (i12 < i13) {
                            int i14 = i12;
                            while (true) {
                                int i15 = i14 + 1;
                                if (data[i14] > f10) {
                                    f10 = data[i14];
                                }
                                if (i15 >= i13) {
                                    break;
                                }
                                i14 = i15;
                            }
                        }
                        if (i12 < i13) {
                            int i16 = i12;
                            while (true) {
                                int i17 = i16 + 1;
                                data[i16] = (float) Math.exp((double) (data[i16] - f10));
                                f11 += data[i16];
                                if (i17 >= i13) {
                                    break;
                                }
                                i16 = i17;
                            }
                        }
                        if (i12 < i13) {
                            while (true) {
                                int i18 = i12 + 1;
                                data[i12] = data[i12] / f11;
                                if (i18 >= i13) {
                                    break;
                                }
                                i12 = i18;
                            }
                        }
                        if (i11 < shape) {
                            i10 = i11;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final MTensor transpose2D(MTensor mTensor) {
        Class<Operator> cls = Operator.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            m.f(mTensor, "x");
            int shape = mTensor.getShape(0);
            int shape2 = mTensor.getShape(1);
            MTensor mTensor2 = new MTensor(new int[]{shape2, shape});
            float[] data = mTensor.getData();
            float[] data2 = mTensor2.getData();
            if (shape > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (shape2 > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            data2[(i12 * shape) + i10] = data[(i10 * shape2) + i12];
                            if (i13 >= shape2) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    if (i11 >= shape) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return mTensor2;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final MTensor transpose3D(MTensor mTensor) {
        MTensor mTensor2 = mTensor;
        Class<Operator> cls = Operator.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            m.f(mTensor2, "x");
            int shape = mTensor2.getShape(0);
            int shape2 = mTensor2.getShape(1);
            int shape3 = mTensor2.getShape(2);
            MTensor mTensor3 = new MTensor(new int[]{shape3, shape2, shape});
            float[] data = mTensor.getData();
            float[] data2 = mTensor3.getData();
            if (shape > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (shape2 > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            if (shape3 > 0) {
                                int i14 = 0;
                                while (true) {
                                    int i15 = i14 + 1;
                                    data2[(i14 * shape * shape2) + (i12 * shape) + i10] = data[(i10 * shape2 * shape3) + (i12 * shape3) + i14];
                                    if (i15 >= shape3) {
                                        break;
                                    }
                                    i14 = i15;
                                }
                            }
                            if (i13 >= shape2) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    if (i11 >= shape) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return mTensor3;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }
}
