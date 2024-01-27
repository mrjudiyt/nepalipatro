package androidx.concurrent.futures;

import java.util.concurrent.Executor;

/* compiled from: DirectExecutor */
public enum d implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}
