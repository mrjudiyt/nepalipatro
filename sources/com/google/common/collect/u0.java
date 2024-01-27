package com.google.common.collect;

import l6.p;

/* compiled from: ObjectArrays */
public final class u0 {
    static Object a(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i10);
        throw new NullPointerException(sb.toString());
    }

    static Object[] b(Object... objArr) {
        c(objArr, objArr.length);
        return objArr;
    }

    static Object[] c(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            a(objArr[i11], i11);
        }
        return objArr;
    }

    public static <T> T[] d(T[] tArr, int i10) {
        return w0.b(tArr, i10);
    }

    static <T> T[] e(Object[] objArr, int i10, int i11, T[] tArr) {
        p.n(i10, i10 + i11, objArr.length);
        if (tArr.length < i11) {
            tArr = d(tArr, i11);
        } else if (tArr.length > i11) {
            tArr[i11] = null;
        }
        System.arraycopy(objArr, i10, tArr, 0, i11);
        return tArr;
    }
}
