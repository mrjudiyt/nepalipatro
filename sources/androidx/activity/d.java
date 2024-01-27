package androidx.activity;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f521h;

    public /* synthetic */ d(ComponentActivity componentActivity) {
        this.f521h = componentActivity;
    }

    public final void run() {
        this.f521h.invalidateMenu();
    }
}
