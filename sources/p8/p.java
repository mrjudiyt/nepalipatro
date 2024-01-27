package p8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: Collections.kt */
class p extends o {
    public static <T> ArrayList<T> c(T... tArr) {
        m.f(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new e(tArr, true));
    }

    public static final <T> Collection<T> d(T[] tArr) {
        m.f(tArr, "<this>");
        return new e(tArr, false);
    }

    public static <T> List<T> e() {
        return z.f16217h;
    }

    public static <T> int f(List<? extends T> list) {
        m.f(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> g(T... tArr) {
        m.f(tArr, "elements");
        return tArr.length > 0 ? j.c(tArr) : e();
    }

    public static <T> List<T> h(T... tArr) {
        m.f(tArr, "elements");
        return k.n(tArr);
    }

    public static <T> List<T> i(T... tArr) {
        m.f(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new e(tArr, true));
    }

    public static <T> List<T> j(List<? extends T> list) {
        m.f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            return e();
        }
        if (size != 1) {
            return list;
        }
        return o.b(list.get(0));
    }

    public static void k() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
