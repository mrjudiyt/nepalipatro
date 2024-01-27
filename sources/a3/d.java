package a3;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: ExceptionCatchingInputStream */
public class d extends InputStream {

    /* renamed from: j  reason: collision with root package name */
    private static final Queue<d> f24j = k.f(0);

    /* renamed from: h  reason: collision with root package name */
    private InputStream f25h;

    /* renamed from: i  reason: collision with root package name */
    private IOException f26i;

    d() {
    }

    public static d h(InputStream inputStream) {
        d poll;
        Queue<d> queue = f24j;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new d();
        }
        poll.j(inputStream);
        return poll;
    }

    public IOException a() {
        return this.f26i;
    }

    public int available() {
        return this.f25h.available();
    }

    public void close() {
        this.f25h.close();
    }

    /* access modifiers changed from: package-private */
    public void j(InputStream inputStream) {
        this.f25h = inputStream;
    }

    public void mark(int i10) {
        this.f25h.mark(i10);
    }

    public boolean markSupported() {
        return this.f25h.markSupported();
    }

    public int read(byte[] bArr) {
        try {
            return this.f25h.read(bArr);
        } catch (IOException e10) {
            this.f26i = e10;
            return -1;
        }
    }

    public void release() {
        this.f26i = null;
        this.f25h = null;
        Queue<d> queue = f24j;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public synchronized void reset() {
        this.f25h.reset();
    }

    public long skip(long j10) {
        try {
            return this.f25h.skip(j10);
        } catch (IOException e10) {
            this.f26i = e10;
            return 0;
        }
    }

    public int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f25h.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f26i = e10;
            return -1;
        }
    }

    public int read() {
        try {
            return this.f25h.read();
        } catch (IOException e10) {
            this.f26i = e10;
            return -1;
        }
    }
}
