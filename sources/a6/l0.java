package a6;

import java.util.concurrent.ThreadFactory;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l0 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f203a;

    public /* synthetic */ l0(String str) {
        this.f203a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return m0.n0(this.f203a, runnable);
    }
}
