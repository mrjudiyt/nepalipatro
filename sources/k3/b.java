package k3;

import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.crashreport.CrashHandler;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ b f15430h = new b();

    private /* synthetic */ b() {
    }

    public final int compare(Object obj, Object obj2) {
        return CrashHandler.Companion.m123sendExceptionReports$lambda2((InstrumentData) obj, (InstrumentData) obj2);
    }
}
