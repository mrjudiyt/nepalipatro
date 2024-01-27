package k3;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.instrument.crashreport.CrashHandler;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements GraphRequest.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f15429a;

    public /* synthetic */ a(List list) {
        this.f15429a = list;
    }

    public final void onCompleted(GraphResponse graphResponse) {
        CrashHandler.Companion.m124sendExceptionReports$lambda5(this.f15429a, graphResponse);
    }
}
