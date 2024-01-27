package k2;

import android.os.Build;
import android.os.StrictMode;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* compiled from: RuntimeCompat */
final class b {

    /* compiled from: RuntimeCompat */
    class a implements FilenameFilter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Pattern f9511a;

        a(Pattern pattern) {
            this.f9511a = pattern;
        }

        public boolean accept(File file, String str) {
            return this.f9511a.matcher(str).matches();
        }
    }

    static int a() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        return Build.VERSION.SDK_INT < 17 ? Math.max(b(), availableProcessors) : availableProcessors;
    }

    /* JADX INFO: finally extract failed */
    private static int b() {
        File[] fileArr;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArr = new File("/sys/devices/system/cpu/").listFiles(new a(Pattern.compile("cpu[0-9]+")));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        return Math.max(1, fileArr != null ? fileArr.length : 0);
    }
}
