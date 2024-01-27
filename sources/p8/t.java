package p8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: MutableCollectionsJVM.kt */
class t extends s {
    public static <T extends Comparable<? super T>> void m(List<T> list) {
        m.f(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static <T> void n(List<T> list, Comparator<? super T> comparator) {
        m.f(list, "<this>");
        m.f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
