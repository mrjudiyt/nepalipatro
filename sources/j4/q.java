package j4;

import a6.m0;
import java.util.UUID;

/* compiled from: FrameworkMediaCrypto */
public final class q implements p {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f9435d;

    /* renamed from: a  reason: collision with root package name */
    public final UUID f9436a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f9437b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f9438c;

    static {
        boolean z10;
        if ("Amazon".equals(m0.f207c)) {
            String str = m0.f208d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f9435d = z10;
            }
        }
        z10 = false;
        f9435d = z10;
    }

    public q(UUID uuid, byte[] bArr, boolean z10) {
        this.f9436a = uuid;
        this.f9437b = bArr;
        this.f9438c = z10;
    }
}
