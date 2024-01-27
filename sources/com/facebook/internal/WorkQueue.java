package com.facebook.internal;

import com.facebook.FacebookException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import o8.q;

/* compiled from: WorkQueue.kt */
public final class WorkQueue {
    public static final Companion Companion = new Companion((g) null);
    public static final int DEFAULT_MAX_CONCURRENT = 8;
    private final Executor executor;
    private final int maxConcurrent;
    /* access modifiers changed from: private */
    public WorkNode pendingJobs;
    private int runningCount;
    private WorkNode runningJobs;
    /* access modifiers changed from: private */
    public final ReentrantLock workLock;

    /* compiled from: WorkQueue.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: assert  reason: not valid java name */
        public final void m112assert(boolean z10) {
            if (!z10) {
                throw new FacebookException("Validation failed");
            }
        }
    }

    /* compiled from: WorkQueue.kt */
    public interface WorkItem {
        boolean cancel();

        boolean isRunning();

        void moveToFront();
    }

    /* compiled from: WorkQueue.kt */
    private final class WorkNode implements WorkItem {
        private final Runnable callback;
        private boolean isRunning;
        private WorkNode next;
        private WorkNode prev;
        final /* synthetic */ WorkQueue this$0;

        public WorkNode(WorkQueue workQueue, Runnable runnable) {
            m.f(workQueue, "this$0");
            m.f(runnable, "callback");
            this.this$0 = workQueue;
            this.callback = runnable;
        }

        public final WorkNode addToList(WorkNode workNode, boolean z10) {
            Companion companion = WorkQueue.Companion;
            boolean z11 = true;
            companion.m112assert(this.next == null);
            if (this.prev != null) {
                z11 = false;
            }
            companion.m112assert(z11);
            if (workNode == null) {
                this.prev = this;
                this.next = this;
                workNode = this;
            } else {
                this.next = workNode;
                WorkNode workNode2 = workNode.prev;
                this.prev = workNode2;
                if (workNode2 != null) {
                    workNode2.next = this;
                }
                WorkNode workNode3 = this.next;
                if (workNode3 != null) {
                    workNode3.prev = workNode2 == null ? null : workNode2.next;
                }
            }
            return z10 ? this : workNode;
        }

        public boolean cancel() {
            ReentrantLock access$getWorkLock$p = this.this$0.workLock;
            WorkQueue workQueue = this.this$0;
            access$getWorkLock$p.lock();
            try {
                if (!isRunning()) {
                    workQueue.pendingJobs = removeFromList(workQueue.pendingJobs);
                    return true;
                }
                q qVar = q.f16189a;
                access$getWorkLock$p.unlock();
                return false;
            } finally {
                access$getWorkLock$p.unlock();
            }
        }

        public final Runnable getCallback() {
            return this.callback;
        }

        public final WorkNode getNext() {
            return this.next;
        }

        public boolean isRunning() {
            return this.isRunning;
        }

        public void moveToFront() {
            ReentrantLock access$getWorkLock$p = this.this$0.workLock;
            WorkQueue workQueue = this.this$0;
            access$getWorkLock$p.lock();
            try {
                if (!isRunning()) {
                    workQueue.pendingJobs = removeFromList(workQueue.pendingJobs);
                    workQueue.pendingJobs = addToList(workQueue.pendingJobs, true);
                }
                q qVar = q.f16189a;
            } finally {
                access$getWorkLock$p.unlock();
            }
        }

        public final WorkNode removeFromList(WorkNode workNode) {
            Companion companion = WorkQueue.Companion;
            boolean z10 = true;
            companion.m112assert(this.next != null);
            if (this.prev == null) {
                z10 = false;
            }
            companion.m112assert(z10);
            if (workNode == this && (workNode = this.next) == this) {
                workNode = null;
            }
            WorkNode workNode2 = this.next;
            if (workNode2 != null) {
                workNode2.prev = this.prev;
            }
            WorkNode workNode3 = this.prev;
            if (workNode3 != null) {
                workNode3.next = workNode2;
            }
            this.prev = null;
            this.next = null;
            return workNode;
        }

        public void setRunning(boolean z10) {
            this.isRunning = z10;
        }

        public final void verify(boolean z10) {
            WorkNode workNode;
            WorkNode workNode2;
            Companion companion = WorkQueue.Companion;
            WorkNode workNode3 = this.prev;
            if (workNode3 == null || (workNode = workNode3.next) == null) {
                workNode = this;
            }
            boolean z11 = true;
            companion.m112assert(workNode == this);
            WorkNode workNode4 = this.next;
            if (workNode4 == null || (workNode2 = workNode4.prev) == null) {
                workNode2 = this;
            }
            companion.m112assert(workNode2 == this);
            if (isRunning() != z10) {
                z11 = false;
            }
            companion.m112assert(z11);
        }
    }

    public WorkQueue() {
        this(0, (Executor) null, 3, (g) null);
    }

    public WorkQueue(int i10) {
        this(i10, (Executor) null, 2, (g) null);
    }

    public WorkQueue(int i10, Executor executor2) {
        m.f(executor2, "executor");
        this.maxConcurrent = i10;
        this.executor = executor2;
        this.workLock = new ReentrantLock();
    }

    public static /* synthetic */ WorkItem addActiveWorkItem$default(WorkQueue workQueue, Runnable runnable, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return workQueue.addActiveWorkItem(runnable, z10);
    }

    private final void execute(WorkNode workNode) {
        this.executor.execute(new w(workNode, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: execute$lambda-2  reason: not valid java name */
    public static final void m111execute$lambda2(WorkNode workNode, WorkQueue workQueue) {
        m.f(workNode, "$node");
        m.f(workQueue, "this$0");
        try {
            workNode.getCallback().run();
        } finally {
            workQueue.finishItemAndStartNew(workNode);
        }
    }

    private final void finishItemAndStartNew(WorkNode workNode) {
        WorkNode workNode2;
        this.workLock.lock();
        if (workNode != null) {
            this.runningJobs = workNode.removeFromList(this.runningJobs);
            this.runningCount--;
        }
        if (this.runningCount < this.maxConcurrent) {
            workNode2 = this.pendingJobs;
            if (workNode2 != null) {
                this.pendingJobs = workNode2.removeFromList(workNode2);
                this.runningJobs = workNode2.addToList(this.runningJobs, false);
                this.runningCount++;
                workNode2.setRunning(true);
            }
        } else {
            workNode2 = null;
        }
        this.workLock.unlock();
        if (workNode2 != null) {
            execute(workNode2);
        }
    }

    private final void startItem() {
        finishItemAndStartNew((WorkNode) null);
    }

    public final WorkItem addActiveWorkItem(Runnable runnable) {
        m.f(runnable, "callback");
        return addActiveWorkItem$default(this, runnable, false, 2, (Object) null);
    }

    /* JADX INFO: finally extract failed */
    public final WorkItem addActiveWorkItem(Runnable runnable, boolean z10) {
        m.f(runnable, "callback");
        WorkNode workNode = new WorkNode(this, runnable);
        ReentrantLock reentrantLock = this.workLock;
        reentrantLock.lock();
        try {
            this.pendingJobs = workNode.addToList(this.pendingJobs, z10);
            q qVar = q.f16189a;
            reentrantLock.unlock();
            startItem();
            return workNode;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void validate() {
        ReentrantLock reentrantLock = this.workLock;
        reentrantLock.lock();
        try {
            WorkNode workNode = this.runningJobs;
            boolean z10 = false;
            int i10 = 0;
            if (workNode != null) {
                while (workNode != null) {
                    workNode.verify(true);
                    i10++;
                    workNode = workNode.getNext();
                    if (workNode == this.runningJobs) {
                    }
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            Companion companion = Companion;
            if (this.runningCount == i10) {
                z10 = true;
            }
            companion.m112assert(z10);
            q qVar = q.f16189a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ WorkQueue(int r1, java.util.concurrent.Executor r2, int r3, kotlin.jvm.internal.g r4) {
        /*
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            r1 = 8
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0010
            com.facebook.FacebookSdk r2 = com.facebook.FacebookSdk.INSTANCE
            java.util.concurrent.Executor r2 = com.facebook.FacebookSdk.getExecutor()
        L_0x0010:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.WorkQueue.<init>(int, java.util.concurrent.Executor, int, kotlin.jvm.internal.g):void");
    }
}
