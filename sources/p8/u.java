package p8;

import java.util.Collection;
import kotlin.jvm.internal.m;

/* compiled from: MutableCollections.kt */
class u extends t {
    public static <T> boolean o(Collection<? super T> collection, Iterable<? extends T> iterable) {
        m.f(collection, "<this>");
        m.f(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z10 = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z10 = true;
            }
        }
        return z10;
    }
}
