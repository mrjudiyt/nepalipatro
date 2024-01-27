package p8;

import d9.f;
import f9.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import o8.k;
import o8.o;
import y8.l;

/* compiled from: _Collections.kt */
class x extends w {

    /* compiled from: Sequences.kt */
    public static final class a implements c<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterable f16214a;

        public a(Iterable iterable) {
            this.f16214a = iterable;
        }

        public Iterator<T> iterator() {
            return this.f16214a.iterator();
        }
    }

    /* compiled from: _Collections.kt */
    static final class b extends n implements l<Integer, T> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f16215h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(1);
            this.f16215h = i10;
        }

        public final T a(int i10) {
            throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f16215h + '.');
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final <T, A extends Appendable> A A(Iterable<? extends T> iterable, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        m.f(iterable, "<this>");
        m.f(a10, "buffer");
        m.f(charSequence, "separator");
        m.f(charSequence2, "prefix");
        m.f(charSequence3, "postfix");
        m.f(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (Object next : iterable) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            h.a(a10, next, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static /* synthetic */ Appendable B(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar, int i11, Object obj) {
        String str = (i11 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return A(iterable, appendable, str, charSequence6, charSequence5, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
    }

    public static final <T> String C(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        m.f(iterable, "<this>");
        m.f(charSequence, "separator");
        m.f(charSequence2, "prefix");
        m.f(charSequence3, "postfix");
        m.f(charSequence4, "truncated");
        String sb = ((StringBuilder) A(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        m.e(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String D(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i12 = (i11 & 8) != 0 ? -1 : i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return C(iterable, charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
    }

    public static final <T> T E(Iterable<? extends T> iterable) {
        m.f(iterable, "<this>");
        if (iterable instanceof List) {
            return F((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T F(List<? extends T> list) {
        m.f(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(p.f(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T extends Comparable<? super T>> T G(Iterable<? extends T> iterable) {
        m.f(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t10 = (Comparable) it.next();
        while (it.hasNext()) {
            T t11 = (Comparable) it.next();
            if (t10.compareTo(t11) > 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    public static <T> List<T> H(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        m.f(iterable, "<this>");
        m.f(iterable2, "elements");
        if (iterable instanceof Collection) {
            return I((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        boolean unused = u.o(arrayList, iterable);
        boolean unused2 = u.o(arrayList, iterable2);
        return arrayList;
    }

    public static <T> List<T> I(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        m.f(collection, "<this>");
        m.f(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        boolean unused = u.o(arrayList2, iterable);
        return arrayList2;
    }

    public static <T> List<T> J(Collection<? extends T> collection, T t10) {
        m.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    public static <T> T K(Collection<? extends T> collection, b9.c cVar) {
        m.f(collection, "<this>");
        m.f(cVar, "random");
        if (!collection.isEmpty()) {
            return s(collection, cVar.d(collection.size()));
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T L(Iterable<? extends T> iterable) {
        m.f(iterable, "<this>");
        if (iterable instanceof List) {
            return M((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T M(List<? extends T> list) {
        m.f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    public static <T> List<T> N(List<? extends T> list, f fVar) {
        m.f(list, "<this>");
        m.f(fVar, "indices");
        if (fVar.isEmpty()) {
            return p.e();
        }
        return R(list.subList(fVar.i().intValue(), fVar.g().intValue() + 1));
    }

    public static <T> List<T> O(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        m.f(iterable, "<this>");
        m.f(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return R(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            j.k(array, comparator);
            return j.c(array);
        }
        List<T> S = S(iterable);
        t.n(S, comparator);
        return S;
    }

    public static <T> List<T> P(Iterable<? extends T> iterable, int i10) {
        m.f(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return p.e();
        } else {
            if (iterable instanceof Collection) {
                if (i10 >= ((Collection) iterable).size()) {
                    return R(iterable);
                }
                if (i10 == 1) {
                    return o.b(w(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i10);
            for (Object add : iterable) {
                arrayList.add(add);
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return p.j(arrayList);
        }
    }

    public static final <T, C extends Collection<? super T>> C Q(Iterable<? extends T> iterable, C c10) {
        m.f(iterable, "<this>");
        m.f(c10, "destination");
        for (Object add : iterable) {
            c10.add(add);
        }
        return c10;
    }

    public static <T> List<T> R(Iterable<? extends T> iterable) {
        m.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return p.j(S(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return p.e();
        }
        if (size != 1) {
            return T(collection);
        }
        return o.b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <T> List<T> S(Iterable<? extends T> iterable) {
        m.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return T((Collection) iterable);
        }
        return (List) Q(iterable, new ArrayList());
    }

    public static <T> List<T> T(Collection<? extends T> collection) {
        m.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> Set<T> U(Iterable<? extends T> iterable) {
        m.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        return (Set) Q(iterable, new LinkedHashSet());
    }

    public static <T> Set<T> V(Iterable<? extends T> iterable) {
        m.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m0.e((Set) Q(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m0.b();
        }
        if (size != 1) {
            return (Set) Q(iterable, new LinkedHashSet(g0.a(collection.size())));
        }
        return l0.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static <T, R> List<k<T, R>> W(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        m.f(iterable, "<this>");
        m.f(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(q.l(iterable, 10), q.l(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(o.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static <T> c<T> p(Iterable<? extends T> iterable) {
        m.f(iterable, "<this>");
        return new a(iterable);
    }

    public static <T> boolean q(Iterable<? extends T> iterable, T t10) {
        m.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t10);
        }
        return z(iterable, t10) >= 0;
    }

    public static <T> List<T> r(Iterable<? extends T> iterable, int i10) {
        ArrayList arrayList;
        m.f(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return R(iterable);
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i10;
                if (size <= 0) {
                    return p.e();
                }
                if (size == 1) {
                    return o.b(E(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i10 < size2) {
                            arrayList.add(((List) iterable).get(i10));
                            i10++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i10);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            for (Object next : iterable) {
                if (i11 >= i10) {
                    arrayList.add(next);
                } else {
                    i11++;
                }
            }
            return p.j(arrayList);
        }
    }

    public static final <T> T s(Iterable<? extends T> iterable, int i10) {
        m.f(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).get(i10);
        }
        return t(iterable, i10, new b(i10));
    }

    public static final <T> T t(Iterable<? extends T> iterable, int i10, l<? super Integer, ? extends T> lVar) {
        m.f(iterable, "<this>");
        m.f(lVar, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i10 < 0 || i10 > p.f(list)) ? lVar.invoke(Integer.valueOf(i10)) : list.get(i10);
        } else if (i10 < 0) {
            return lVar.invoke(Integer.valueOf(i10));
        } else {
            int i11 = 0;
            for (T next : iterable) {
                int i12 = i11 + 1;
                if (i10 == i11) {
                    return next;
                }
                i11 = i12;
            }
            return lVar.invoke(Integer.valueOf(i10));
        }
    }

    public static <T> List<T> u(Iterable<? extends T> iterable) {
        m.f(iterable, "<this>");
        return (List) v(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C v(Iterable<? extends T> iterable, C c10) {
        m.f(iterable, "<this>");
        m.f(c10, "destination");
        for (Object next : iterable) {
            if (next != null) {
                c10.add(next);
            }
        }
        return c10;
    }

    public static final <T> T w(Iterable<? extends T> iterable) {
        m.f(iterable, "<this>");
        if (iterable instanceof List) {
            return x((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T x(List<? extends T> list) {
        m.f(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T y(List<? extends T> list) {
        m.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final <T> int z(Iterable<? extends T> iterable, T t10) {
        m.f(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t10);
        }
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 < 0) {
                p.k();
            }
            if (m.a(t10, next)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
