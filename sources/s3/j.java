package s3;

import android.annotation.SuppressLint;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: ExecutionModule */
abstract class j {
    @SuppressLint({"ThreadPoolCreation"})
    static Executor a() {
        return new n(Executors.newSingleThreadExecutor());
    }
}
