package io.flutter.plugins.pathprovider;

import android.util.Log;
import io.flutter.plugin.common.StandardMessageCodec;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Messages {

    public interface PathProviderApi {
        String getApplicationDocumentsPath();

        String getApplicationSupportPath();

        List<String> getExternalCachePaths();

        String getExternalStoragePath();

        List<String> getExternalStoragePaths(StorageDirectory storageDirectory);

        String getTemporaryPath();
    }

    private static class PathProviderApiCodec extends StandardMessageCodec {
        public static final PathProviderApiCodec INSTANCE = new PathProviderApiCodec();

        private PathProviderApiCodec() {
        }
    }

    public enum StorageDirectory {
        root(0),
        music(1),
        podcasts(2),
        ringtones(3),
        alarms(4),
        notifications(5),
        pictures(6),
        movies(7),
        downloads(8),
        dcim(9),
        documents(10);
        
        private int index;

        private StorageDirectory(int i10) {
            this.index = i10;
        }
    }

    /* access modifiers changed from: private */
    public static Map<String, Object> wrapError(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
