package androidx.profileinstaller;

import android.content.Context;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ProfileInstallerInitializer f3952h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Context f3953i;

    public /* synthetic */ k(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f3952h = profileInstallerInitializer;
        this.f3953i = context;
    }

    public final void run() {
        this.f3952h.i(this.f3953i);
    }
}
