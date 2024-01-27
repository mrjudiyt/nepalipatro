package i3;

import com.facebook.internal.instrument.InstrumentUtility;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ g f14887a = new g();

    private /* synthetic */ g() {
    }

    public final boolean accept(File file, String str) {
        return InstrumentUtility.m119listExceptionReportFiles$lambda3(file, str);
    }
}
