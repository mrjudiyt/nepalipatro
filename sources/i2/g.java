package i2;

/* compiled from: ByteArrayAdapter */
public final class g implements a<byte[]> {
    public String a() {
        return "ByteArrayPool";
    }

    public int b() {
        return 1;
    }

    /* renamed from: d */
    public int c(byte[] bArr) {
        return bArr.length;
    }

    /* renamed from: e */
    public byte[] newArray(int i10) {
        return new byte[i10];
    }
}
