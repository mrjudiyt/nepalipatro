package f2;

import com.bumptech.glide.f;

/* compiled from: DataFetcher */
public interface d<T> {

    /* compiled from: DataFetcher */
    public interface a<T> {
        void c(Exception exc);

        void f(T t10);
    }

    Class<T> a();

    void b();

    void cancel();

    void d(f fVar, a<? super T> aVar);

    e2.a e();
}
