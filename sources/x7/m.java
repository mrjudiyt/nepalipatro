package x7;

import ea.g;
import java.util.List;

/* compiled from: PushObserver */
public interface m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f17270a = new a();

    /* compiled from: PushObserver */
    static class a implements m {
        a() {
        }

        public boolean a(int i10, g gVar, int i11, boolean z10) {
            gVar.skip((long) i11);
            return true;
        }

        public boolean b(int i10, List<f> list) {
            return true;
        }

        public boolean c(int i10, List<f> list, boolean z10) {
            return true;
        }

        public void d(int i10, a aVar) {
        }
    }

    boolean a(int i10, g gVar, int i11, boolean z10);

    boolean b(int i10, List<f> list);

    boolean c(int i10, List<f> list, boolean z10);

    void d(int i10, a aVar);
}
