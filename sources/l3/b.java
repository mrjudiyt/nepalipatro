package l3;

import com.facebook.internal.instrument.errorreport.ErrorReportHandler;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ b f15584a = new b();

    private /* synthetic */ b() {
    }

    public final boolean accept(File file, String str) {
        return ErrorReportHandler.m125listErrorReportFiles$lambda3(file, str);
    }
}
