package com.google.android.exoplayer2.util;

import a6.m0;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

public final class PriorityTaskManager {

    /* renamed from: a  reason: collision with root package name */
    private final Object f7782a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final PriorityQueue<Integer> f7783b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c  reason: collision with root package name */
    private int f7784c = Integer.MIN_VALUE;

    public static class PriorityTooLowException extends IOException {
    }

    public void a(int i10) {
        synchronized (this.f7782a) {
            this.f7783b.add(Integer.valueOf(i10));
            this.f7784c = Math.max(this.f7784c, i10);
        }
    }

    public void b(int i10) {
        synchronized (this.f7782a) {
            this.f7783b.remove(Integer.valueOf(i10));
            this.f7784c = this.f7783b.isEmpty() ? Integer.MIN_VALUE : ((Integer) m0.j(this.f7783b.peek())).intValue();
            this.f7782a.notifyAll();
        }
    }
}
