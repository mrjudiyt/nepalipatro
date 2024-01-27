package l3;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements GraphRequest.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ArrayList f15583a;

    public /* synthetic */ a(ArrayList arrayList) {
        this.f15583a = arrayList;
    }

    public final void onCompleted(GraphResponse graphResponse) {
        ErrorReportHandler.m127sendErrorReports$lambda2(this.f15583a, graphResponse);
    }
}
