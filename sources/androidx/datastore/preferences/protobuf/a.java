package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.a.C0043a;
import androidx.datastore.preferences.protobuf.h;
import androidx.datastore.preferences.protobuf.p0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: AbstractMessageLite */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0043a<MessageType, BuilderType>> implements p0 {
    protected int memoizedHashCode = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.a$a  reason: collision with other inner class name */
    /* compiled from: AbstractMessageLite */
    public static abstract class C0043a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0043a<MessageType, BuilderType>> implements p0.a {
        protected static <T> void i(Iterable<T> iterable, List<? super T> list) {
            z.a(iterable);
            if (iterable instanceof e0) {
                List<?> E = ((e0) iterable).E();
                e0 e0Var = (e0) list;
                int size = list.size();
                for (Object next : E) {
                    if (next == null) {
                        String str = "Element at index " + (e0Var.size() - size) + " is null.";
                        for (int size2 = e0Var.size() - 1; size2 >= size; size2--) {
                            e0Var.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (next instanceof h) {
                        e0Var.w((h) next);
                    } else {
                        e0Var.add((String) next);
                    }
                }
            } else if (iterable instanceof y0) {
                list.addAll((Collection) iterable);
            } else {
                k(iterable, list);
            }
        }

        private static <T> void k(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T next : iterable) {
                if (next == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(next);
            }
        }

        protected static UninitializedMessageException n(p0 p0Var) {
            return new UninitializedMessageException(p0Var);
        }

        /* access modifiers changed from: protected */
        public abstract BuilderType l(MessageType messagetype);

        /* renamed from: m */
        public BuilderType h(p0 p0Var) {
            if (a().getClass().isInstance(p0Var)) {
                return l((a) p0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    protected static <T> void i(Iterable<T> iterable, List<? super T> list) {
        C0043a.i(iterable, list);
    }

    private String m(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public h c() {
        try {
            h.C0044h n10 = h.n(d());
            e(n10.b());
            return n10.a();
        } catch (IOException e10) {
            throw new RuntimeException(m("ByteString"), e10);
        }
    }

    /* access modifiers changed from: package-private */
    public int k() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int l(e1 e1Var) {
        int k10 = k();
        if (k10 != -1) {
            return k10;
        }
        int g10 = e1Var.g(this);
        o(g10);
        return g10;
    }

    /* access modifiers changed from: package-private */
    public UninitializedMessageException n() {
        return new UninitializedMessageException(this);
    }

    /* access modifiers changed from: package-private */
    public void o(int i10) {
        throw new UnsupportedOperationException();
    }

    public void p(OutputStream outputStream) {
        CodedOutputStream f02 = CodedOutputStream.f0(outputStream, CodedOutputStream.I(d()));
        e(f02);
        f02.c0();
    }
}
