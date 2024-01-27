package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.c;
import com.google.common.util.concurrent.e;

public abstract class Worker extends ListenableWorker {
    c<ListenableWorker.a> mFuture;

    class a implements Runnable {
        a() {
        }

        public void run() {
            try {
                Worker.this.mFuture.o(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.mFuture.p(th);
            }
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.a doWork();

    public final e<ListenableWorker.a> startWork() {
        this.mFuture = c.s();
        getBackgroundExecutor().execute(new a());
        return this.mFuture;
    }
}
