package j2;

import a3.j;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: DiskCacheWriteLocker */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, a> f9401a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final b f9402b = new b();

    /* compiled from: DiskCacheWriteLocker */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        final Lock f9403a = new ReentrantLock();

        /* renamed from: b  reason: collision with root package name */
        int f9404b;

        a() {
        }
    }

    /* compiled from: DiskCacheWriteLocker */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Queue<a> f9405a = new ArrayDeque();

        b() {
        }

        /* access modifiers changed from: package-private */
        public a a() {
            a poll;
            synchronized (this.f9405a) {
                poll = this.f9405a.poll();
            }
            return poll == null ? new a() : poll;
        }

        /* access modifiers changed from: package-private */
        public void b(a aVar) {
            synchronized (this.f9405a) {
                if (this.f9405a.size() < 10) {
                    this.f9405a.offer(aVar);
                }
            }
        }
    }

    c() {
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        a aVar;
        synchronized (this) {
            aVar = this.f9401a.get(str);
            if (aVar == null) {
                aVar = this.f9402b.a();
                this.f9401a.put(str, aVar);
            }
            aVar.f9404b++;
        }
        aVar.f9403a.lock();
    }

    /* access modifiers changed from: package-private */
    public void b(String str) {
        a aVar;
        synchronized (this) {
            aVar = (a) j.d(this.f9401a.get(str));
            int i10 = aVar.f9404b;
            if (i10 >= 1) {
                int i11 = i10 - 1;
                aVar.f9404b = i11;
                if (i11 == 0) {
                    a remove = this.f9401a.remove(str);
                    if (remove.equals(aVar)) {
                        this.f9402b.b(remove);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f9404b);
            }
        }
        aVar.f9403a.unlock();
    }
}
