package p8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: CollectionsJVM.kt */
class o {
    public static final <T> Object[] a(T[] tArr, boolean z10) {
        Class<Object[]> cls = Object[].class;
        m.f(tArr, "<this>");
        if (z10 && m.a(tArr.getClass(), cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        m.e(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public static <T> List<T> b(T t10) {
        List<T> singletonList = Collections.singletonList(t10);
        m.e(singletonList, "singletonList(element)");
        return singletonList;
    }
}
