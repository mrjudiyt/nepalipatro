package p8;

import java.util.List;
import kotlin.jvm.internal.g;

/* compiled from: AbstractList.kt */
public abstract class c<E> extends a<E> implements List<E> {

    /* renamed from: h  reason: collision with root package name */
    public static final a f16201h = new a((g) null);

    /* compiled from: AbstractList.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void b(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }
    }
}
