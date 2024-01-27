package com.google.common.collect;

import java.util.Collection;
import l6.p;

/* compiled from: Collections2 */
public final class j {
    static StringBuilder a(int i10) {
        i.b(i10, "size");
        return new StringBuilder((int) Math.min(((long) i10) * 8, 1073741824));
    }

    static boolean b(Collection<?> collection, Object obj) {
        p.j(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
