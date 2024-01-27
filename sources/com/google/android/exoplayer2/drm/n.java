package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.h;
import j4.p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: ExoMediaDrm */
public interface n {

    /* compiled from: ExoMediaDrm */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f6583a;

        /* renamed from: b  reason: collision with root package name */
        private final String f6584b;

        /* renamed from: c  reason: collision with root package name */
        private final int f6585c;

        public a(byte[] bArr, String str, int i10) {
            this.f6583a = bArr;
            this.f6584b = str;
            this.f6585c = i10;
        }

        public byte[] a() {
            return this.f6583a;
        }

        public String b() {
            return this.f6584b;
        }
    }

    /* compiled from: ExoMediaDrm */
    public interface b {
        void a(n nVar, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    /* compiled from: ExoMediaDrm */
    public interface c {
        n a(UUID uuid);
    }

    /* compiled from: ExoMediaDrm */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f6586a;

        /* renamed from: b  reason: collision with root package name */
        private final String f6587b;

        public d(byte[] bArr, String str) {
            this.f6586a = bArr;
            this.f6587b = str;
        }

        public byte[] a() {
            return this.f6586a;
        }

        public String b() {
            return this.f6587b;
        }
    }

    Class<? extends p> a();

    Map<String, String> b(byte[] bArr);

    p c(byte[] bArr);

    d d();

    byte[] e();

    void f(byte[] bArr, byte[] bArr2);

    void g(byte[] bArr);

    void h(b bVar);

    byte[] i(byte[] bArr, byte[] bArr2);

    void j(byte[] bArr);

    a k(byte[] bArr, List<h.b> list, int i10, HashMap<String, String> hashMap);

    void release();
}
