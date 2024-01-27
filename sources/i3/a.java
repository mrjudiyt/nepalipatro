package i3;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.instrument.ExceptionAnalyzer;
import com.facebook.internal.instrument.InstrumentData;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements GraphRequest.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InstrumentData f14881a;

    public /* synthetic */ a(InstrumentData instrumentData) {
        this.f14881a = instrumentData;
    }

    public final void onCompleted(GraphResponse graphResponse) {
        ExceptionAnalyzer.m113sendExceptionAnalysisReports$lambda1(this.f14881a, graphResponse);
    }
}
