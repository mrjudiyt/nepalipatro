package l3;

import com.facebook.internal.instrument.errorreport.ErrorReportData;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Comparator {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ c f15585h = new c();

    private /* synthetic */ c() {
    }

    public final int compare(Object obj, Object obj2) {
        return ErrorReportHandler.m126sendErrorReports$lambda0((ErrorReportData) obj, (ErrorReportData) obj2);
    }
}
