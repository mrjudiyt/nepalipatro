package f2;

import android.content.res.AssetManager;
import com.bumptech.glide.f;
import e2.a;
import f2.d;
import java.io.IOException;

/* compiled from: AssetPathFetcher */
public abstract class b<T> implements d<T> {

    /* renamed from: h  reason: collision with root package name */
    private final String f8470h;

    /* renamed from: i  reason: collision with root package name */
    private final AssetManager f8471i;

    /* renamed from: j  reason: collision with root package name */
    private T f8472j;

    public b(AssetManager assetManager, String str) {
        this.f8471i = assetManager;
        this.f8470h = str;
    }

    public void b() {
        T t10 = this.f8472j;
        if (t10 != null) {
            try {
                c(t10);
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void c(T t10);

    public void cancel() {
    }

    public void d(f fVar, d.a<? super T> aVar) {
        try {
            T f10 = f(this.f8471i, this.f8470h);
            this.f8472j = f10;
            aVar.f(f10);
        } catch (IOException e10) {
            aVar.c(e10);
        }
    }

    public a e() {
        return a.LOCAL;
    }

    /* access modifiers changed from: protected */
    public abstract T f(AssetManager assetManager, String str);
}
