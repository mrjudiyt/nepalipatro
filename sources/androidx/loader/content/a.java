package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.os.OperationCanceledException;
import androidx.core.util.i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* compiled from: AsyncTaskLoader */
public abstract class a<D> extends b<D> {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncTaskLoader";
    volatile a<D>.a mCancellingTask;
    private final Executor mExecutor;
    Handler mHandler;
    long mLastLoadCompleteTime;
    volatile a<D>.a mTask;
    long mUpdateThrottle;

    /* renamed from: androidx.loader.content.a$a  reason: collision with other inner class name */
    /* compiled from: AsyncTaskLoader */
    final class C0058a extends c<Void, Void, D> implements Runnable {

        /* renamed from: r  reason: collision with root package name */
        private final CountDownLatch f3561r = new CountDownLatch(1);

        /* renamed from: s  reason: collision with root package name */
        boolean f3562s;

        C0058a() {
        }

        /* access modifiers changed from: protected */
        public void h(D d10) {
            try {
                a.this.dispatchOnCancelled(this, d10);
            } finally {
                this.f3561r.countDown();
            }
        }

        /* access modifiers changed from: protected */
        public void i(D d10) {
            try {
                a.this.dispatchOnLoadComplete(this, d10);
            } finally {
                this.f3561r.countDown();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public D b(Void... voidArr) {
            try {
                return a.this.onLoadInBackground();
            } catch (OperationCanceledException e10) {
                if (f()) {
                    return null;
                }
                throw e10;
            }
        }

        public void o() {
            try {
                this.f3561r.await();
            } catch (InterruptedException unused) {
            }
        }

        public void run() {
            this.f3562s = false;
            a.this.executePendingTask();
        }
    }

    public a(Context context) {
        this(context, c.f3566o);
    }

    public void cancelLoadInBackground() {
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnCancelled(a<D>.a aVar, D d10) {
        onCanceled(d10);
        if (this.mCancellingTask == aVar) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnLoadComplete(a<D>.a aVar, D d10) {
        if (this.mTask != aVar) {
            dispatchOnCancelled(aVar, d10);
        } else if (isAbandoned()) {
            onCanceled(d10);
        } else {
            commitContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mTask = null;
            deliverResult(d10);
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.f3562s);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.f3562s);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            i.c(this.mUpdateThrottle, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            i.b(this.mLastLoadCompleteTime, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    /* access modifiers changed from: package-private */
    public void executePendingTask() {
        if (this.mCancellingTask == null && this.mTask != null) {
            if (this.mTask.f3562s) {
                this.mTask.f3562s = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            if (this.mUpdateThrottle <= 0 || SystemClock.uptimeMillis() >= this.mLastLoadCompleteTime + this.mUpdateThrottle) {
                this.mTask.c(this.mExecutor, (Params[]) null);
                return;
            }
            this.mTask.f3562s = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    public abstract D loadInBackground();

    /* access modifiers changed from: protected */
    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!this.mStarted) {
            this.mContentChanged = true;
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.f3562s) {
                this.mTask.f3562s = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        } else if (this.mTask.f3562s) {
            this.mTask.f3562s = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        } else {
            boolean a10 = this.mTask.a(false);
            if (a10) {
                this.mCancellingTask = this.mTask;
                cancelLoadInBackground();
            }
            this.mTask = null;
            return a10;
        }
    }

    public void onCanceled(D d10) {
    }

    /* access modifiers changed from: protected */
    public void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new C0058a();
        executePendingTask();
    }

    /* access modifiers changed from: protected */
    public D onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j10) {
        this.mUpdateThrottle = j10;
        if (j10 != 0) {
            this.mHandler = new Handler();
        }
    }

    public void waitForLoader() {
        a<D>.a aVar = this.mTask;
        if (aVar != null) {
            aVar.o();
        }
    }

    private a(Context context, Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000;
        this.mExecutor = executor;
    }
}
