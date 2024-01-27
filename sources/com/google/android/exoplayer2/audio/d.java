package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: BaseAudioProcessor */
public abstract class d implements AudioProcessor {

    /* renamed from: b  reason: collision with root package name */
    protected AudioProcessor.a f6370b;

    /* renamed from: c  reason: collision with root package name */
    protected AudioProcessor.a f6371c;

    /* renamed from: d  reason: collision with root package name */
    private AudioProcessor.a f6372d;

    /* renamed from: e  reason: collision with root package name */
    private AudioProcessor.a f6373e;

    /* renamed from: f  reason: collision with root package name */
    private ByteBuffer f6374f;

    /* renamed from: g  reason: collision with root package name */
    private ByteBuffer f6375g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6376h;

    public d() {
        ByteBuffer byteBuffer = AudioProcessor.f6262a;
        this.f6374f = byteBuffer;
        this.f6375g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f6263e;
        this.f6372d = aVar;
        this.f6373e = aVar;
        this.f6370b = aVar;
        this.f6371c = aVar;
    }

    public boolean a() {
        return this.f6373e != AudioProcessor.a.f6263e;
    }

    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f6375g;
        this.f6375g = AudioProcessor.f6262a;
        return byteBuffer;
    }

    public boolean c() {
        return this.f6376h && this.f6375g == AudioProcessor.f6262a;
    }

    public final AudioProcessor.a e(AudioProcessor.a aVar) {
        this.f6372d = aVar;
        this.f6373e = h(aVar);
        return a() ? this.f6373e : AudioProcessor.a.f6263e;
    }

    public final void f() {
        this.f6376h = true;
        j();
    }

    public final void flush() {
        this.f6375g = AudioProcessor.f6262a;
        this.f6376h = false;
        this.f6370b = this.f6372d;
        this.f6371c = this.f6373e;
        i();
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        return this.f6375g.hasRemaining();
    }

    /* access modifiers changed from: protected */
    public abstract AudioProcessor.a h(AudioProcessor.a aVar);

    /* access modifiers changed from: protected */
    public void i() {
    }

    /* access modifiers changed from: protected */
    public void j() {
    }

    /* access modifiers changed from: protected */
    public void k() {
    }

    /* access modifiers changed from: protected */
    public final ByteBuffer l(int i10) {
        if (this.f6374f.capacity() < i10) {
            this.f6374f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f6374f.clear();
        }
        ByteBuffer byteBuffer = this.f6374f;
        this.f6375g = byteBuffer;
        return byteBuffer;
    }

    public final void reset() {
        flush();
        this.f6374f = AudioProcessor.f6262a;
        AudioProcessor.a aVar = AudioProcessor.a.f6263e;
        this.f6372d = aVar;
        this.f6373e = aVar;
        this.f6370b = aVar;
        this.f6371c = aVar;
        k();
    }
}
