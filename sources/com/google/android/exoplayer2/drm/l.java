package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.drm.n;
import j4.p;
import j4.t;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: DummyExoMediaDrm */
public final class l implements n {
    public Class<t> a() {
        return t.class;
    }

    public Map<String, String> b(byte[] bArr) {
        throw new IllegalStateException();
    }

    public p c(byte[] bArr) {
        throw new IllegalStateException();
    }

    public n.d d() {
        throw new IllegalStateException();
    }

    public byte[] e() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    public void f(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    public void g(byte[] bArr) {
    }

    public void h(n.b bVar) {
    }

    public byte[] i(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    public void j(byte[] bArr) {
        throw new IllegalStateException();
    }

    public n.a k(byte[] bArr, List<h.b> list, int i10, HashMap<String, String> hashMap) {
        throw new IllegalStateException();
    }

    public void release() {
    }
}
