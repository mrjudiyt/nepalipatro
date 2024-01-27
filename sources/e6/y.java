package e6;

import android.content.Context;
import java.io.File;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
final class y {

    /* renamed from: a  reason: collision with root package name */
    private final Context f14291a;

    y(Context context) {
        this.f14291a = context;
    }

    private static long b(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j10 = 0;
        if (listFiles != null) {
            for (File b10 : listFiles) {
                j10 += b(b10);
            }
        }
        return j10;
    }

    /* access modifiers changed from: package-private */
    public final long a() {
        return b(new File(this.f14291a.getFilesDir(), "assetpacks"));
    }
}
