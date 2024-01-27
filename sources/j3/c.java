package j3;

import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.anrreport.ANRHandler;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Comparator {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ c f15366h = new c();

    private /* synthetic */ c() {
    }

    public final int compare(Object obj, Object obj2) {
        return ANRHandler.m121sendANRReports$lambda2((InstrumentData) obj, (InstrumentData) obj2);
    }
}
