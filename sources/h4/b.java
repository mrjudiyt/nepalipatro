package h4;

import a6.m0;
import android.media.MediaCodec;

/* compiled from: CryptoInfo */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f8942a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f8943b;

    /* renamed from: c  reason: collision with root package name */
    public int f8944c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f8945d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f8946e;

    /* renamed from: f  reason: collision with root package name */
    public int f8947f;

    /* renamed from: g  reason: collision with root package name */
    public int f8948g;

    /* renamed from: h  reason: collision with root package name */
    public int f8949h;

    /* renamed from: i  reason: collision with root package name */
    private final MediaCodec.CryptoInfo f8950i;

    /* renamed from: j  reason: collision with root package name */
    private final C0144b f8951j;

    /* renamed from: h4.b$b  reason: collision with other inner class name */
    /* compiled from: CryptoInfo */
    private static final class C0144b {

        /* renamed from: a  reason: collision with root package name */
        private final MediaCodec.CryptoInfo f8952a;

        /* renamed from: b  reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f8953b;

        /* access modifiers changed from: private */
        public void b(int i10, int i11) {
            this.f8953b.set(i10, i11);
            this.f8952a.setPattern(this.f8953b);
        }

        private C0144b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f8952a = cryptoInfo;
            this.f8953b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public b() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f8950i = cryptoInfo;
        this.f8951j = m0.f205a >= 24 ? new C0144b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f8950i;
    }

    public void b(int i10) {
        if (i10 != 0) {
            if (this.f8945d == null) {
                int[] iArr = new int[1];
                this.f8945d = iArr;
                this.f8950i.numBytesOfClearData = iArr;
            }
            int[] iArr2 = this.f8945d;
            iArr2[0] = iArr2[0] + i10;
        }
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f8947f = i10;
        this.f8945d = iArr;
        this.f8946e = iArr2;
        this.f8943b = bArr;
        this.f8942a = bArr2;
        this.f8944c = i11;
        this.f8948g = i12;
        this.f8949h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f8950i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (m0.f205a >= 24) {
            ((C0144b) a6.a.e(this.f8951j)).b(i12, i13);
        }
    }
}
