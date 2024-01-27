package i3;

import com.facebook.internal.instrument.InstrumentUtility;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ e f14885a = new e();

    private /* synthetic */ e() {
    }

    public final boolean accept(File file, String str) {
        return InstrumentUtility.m117listAnrReportFiles$lambda1(file, str);
    }
}
