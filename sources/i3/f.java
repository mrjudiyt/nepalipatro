package i3;

import com.facebook.internal.instrument.InstrumentUtility;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ f f14886a = new f();

    private /* synthetic */ f() {
    }

    public final boolean accept(File file, String str) {
        return InstrumentUtility.m118listExceptionAnalysisReportFiles$lambda2(file, str);
    }
}
