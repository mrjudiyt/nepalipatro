package f3;

import android.view.View;
import com.facebook.appevents.aam.MetadataViewObserver;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ View f14410h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ MetadataViewObserver f14411i;

    public /* synthetic */ b(View view, MetadataViewObserver metadataViewObserver) {
        this.f14410h = view;
        this.f14411i = metadataViewObserver;
    }

    public final void run() {
        MetadataViewObserver.m43process$lambda0(this.f14410h, this.f14411i);
    }
}
