package g3;

import com.facebook.appevents.internal.FileDownloadTask;
import com.facebook.appevents.ml.Model;
import com.facebook.appevents.ml.ModelManager;
import java.io.File;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements FileDownloadTask.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ModelManager.TaskHandler f14678a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Model f14679b;

    public /* synthetic */ d(ModelManager.TaskHandler taskHandler, Model model) {
        this.f14678a = taskHandler;
        this.f14679b = model;
    }

    public final void onComplete(File file) {
        ModelManager.TaskHandler.Companion.m68execute$lambda1$lambda0(this.f14678a, this.f14679b, file);
    }
}
