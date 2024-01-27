package io.flutter.plugins.sharedpreferences;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Messages {

    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(String str, String str2, Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    public interface SharedPreferencesApi {
        Boolean clearWithPrefix(String str);

        Map<String, Object> getAllWithPrefix(String str);

        Boolean remove(String str);

        Boolean setBool(String str, Boolean bool);

        Boolean setDouble(String str, Double d10);

        Boolean setInt(String str, Long l10);

        Boolean setString(String str, String str2);

        Boolean setStringList(String str, List<String> list);
    }

    protected static ArrayList<Object> wrapError(Throwable th) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.details);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
