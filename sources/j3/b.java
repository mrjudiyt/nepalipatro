package j3;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.instrument.anrreport.ANRHandler;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements GraphRequest.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f15365a;

    public /* synthetic */ b(List list) {
        this.f15365a = list;
    }

    public final void onCompleted(GraphResponse graphResponse) {
        ANRHandler.m122sendANRReports$lambda5(this.f15365a, graphResponse);
    }
}
