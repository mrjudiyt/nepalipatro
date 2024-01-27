package c8;

import io.flutter.plugin.common.MethodCall;

/* compiled from: LogLevel */
public class r {
    static Integer a(MethodCall methodCall) {
        return (Integer) methodCall.argument("logLevel");
    }

    static boolean b(int i10) {
        return i10 >= 1;
    }

    static boolean c(int i10) {
        return i10 >= 2;
    }
}
