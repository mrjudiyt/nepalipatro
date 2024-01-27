package g8;

import com.google.android.gms.tasks.OnFailureListener;
import io.flutter.plugin.common.MethodChannel;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f14736a;

    public /* synthetic */ b(MethodChannel.Result result) {
        this.f14736a = result;
    }

    public final void onFailure(Exception exc) {
        e.o(this.f14736a, exc);
    }
}
