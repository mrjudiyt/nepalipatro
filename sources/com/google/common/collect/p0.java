package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import l6.p;
import l6.u;

/* compiled from: MultimapBuilder */
public abstract class p0<K0, V0> {

    /* compiled from: MultimapBuilder */
    class a extends d<K0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Comparator f13686a;

        a(Comparator comparator) {
            this.f13686a = comparator;
        }

        /* access modifiers changed from: package-private */
        public <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.f13686a);
        }
    }

    /* compiled from: MultimapBuilder */
    private static final class b<V> implements u<List<V>>, Serializable {

        /* renamed from: h  reason: collision with root package name */
        private final int f13687h;

        b(int i10) {
            this.f13687h = i.b(i10, "expectedValuesPerKey");
        }

        /* renamed from: a */
        public List<V> get() {
            return new ArrayList(this.f13687h);
        }
    }

    /* compiled from: MultimapBuilder */
    public static abstract class c<K0, V0> extends p0<K0, V0> {
        c() {
            super((o0) null);
        }

        public abstract <K extends K0, V extends V0> h0<K, V> c();
    }

    /* compiled from: MultimapBuilder */
    public static abstract class d<K0> {

        /* compiled from: MultimapBuilder */
        class a extends c<K0, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f13688a;

            a(int i10) {
                this.f13688a = i10;
            }

            public <K extends K0, V> h0<K, V> c() {
                return q0.b(d.this.c(), new b(this.f13688a));
            }
        }

        d() {
        }

        public c<K0, Object> a() {
            return b(2);
        }

        public c<K0, Object> b(int i10) {
            i.b(i10, "expectedValuesPerKey");
            return new a(i10);
        }

        /* access modifiers changed from: package-private */
        public abstract <K extends K0, V> Map<K, Collection<V>> c();
    }

    /* synthetic */ p0(o0 o0Var) {
        this();
    }

    public static d<Comparable> a() {
        return b(v0.c());
    }

    public static <K0> d<K0> b(Comparator<K0> comparator) {
        p.j(comparator);
        return new a(comparator);
    }

    private p0() {
    }
}
