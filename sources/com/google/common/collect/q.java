package com.google.common.collect;

import java.util.Comparator;

/* compiled from: EmptyImmutableSetMultimap */
class q extends c0<Object, Object> {

    /* renamed from: n  reason: collision with root package name */
    static final q f13690n = new q();

    private q() {
        super(z.j(), 0, (Comparator) null);
    }

    private Object readResolve() {
        return f13690n;
    }
}
