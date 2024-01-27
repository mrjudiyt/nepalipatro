package g3;

import com.facebook.appevents.internal.FileDownloadTask;
import com.facebook.appevents.ml.ModelManager;
import java.io.File;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements FileDownloadTask.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f14680a;

    public /* synthetic */ e(List list) {
        this.f14680a = list;
    }

    public final void onComplete(File file) {
        ModelManager.TaskHandler.Companion.m67execute$lambda1(this.f14680a, file);
    }
}
