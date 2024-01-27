package c1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: CopyLock */
public class a {

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, Lock> f5151e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final File f5152a;

    /* renamed from: b  reason: collision with root package name */
    private final Lock f5153b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f5154c;

    /* renamed from: d  reason: collision with root package name */
    private FileChannel f5155d;

    public a(String str, File file, boolean z10) {
        File file2 = new File(file, str + ".lck");
        this.f5152a = file2;
        this.f5153b = a(file2.getAbsolutePath());
        this.f5154c = z10;
    }

    private static Lock a(String str) {
        Lock lock;
        Map<String, Lock> map = f5151e;
        synchronized (map) {
            lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
        }
        return lock;
    }

    public void b() {
        this.f5153b.lock();
        if (this.f5154c) {
            try {
                FileChannel channel = new FileOutputStream(this.f5152a).getChannel();
                this.f5155d = channel;
                channel.lock();
            } catch (IOException e10) {
                throw new IllegalStateException("Unable to grab copy lock.", e10);
            }
        }
    }

    public void c() {
        FileChannel fileChannel = this.f5155d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f5153b.unlock();
    }
}
