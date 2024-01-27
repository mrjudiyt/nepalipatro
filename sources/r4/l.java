package r4;

import a6.p;
import a6.y;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: PsshAtomUtil */
public final class l {

    /* compiled from: PsshAtomUtil */
    private static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final UUID f11128a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final int f11129b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f11130c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f11128a = uuid;
            this.f11129b = i10;
            this.f11130c = bArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, (UUID[]) null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (!(bArr == null || bArr.length == 0)) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    private static a d(byte[] bArr) {
        y yVar = new y(bArr);
        if (yVar.f() < 32) {
            return null;
        }
        yVar.O(0);
        if (yVar.m() != yVar.a() + 4 || yVar.m() != 1886614376) {
            return null;
        }
        int c10 = a.c(yVar.m());
        if (c10 > 1) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Unsupported pssh version: ");
            sb.append(c10);
            p.h("PsshAtomUtil", sb.toString());
            return null;
        }
        UUID uuid = new UUID(yVar.v(), yVar.v());
        if (c10 == 1) {
            yVar.P(yVar.G() * 16);
        }
        int G = yVar.G();
        if (G != yVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[G];
        yVar.j(bArr2, 0, G);
        return new a(uuid, c10, bArr2);
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a d10 = d(bArr);
        if (d10 == null) {
            return null;
        }
        if (uuid.equals(d10.f11128a)) {
            return d10.f11130c;
        }
        String valueOf = String.valueOf(uuid);
        String valueOf2 = String.valueOf(d10.f11128a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 33 + valueOf2.length());
        sb.append("UUID mismatch. Expected: ");
        sb.append(valueOf);
        sb.append(", got: ");
        sb.append(valueOf2);
        sb.append(".");
        p.h("PsshAtomUtil", sb.toString());
        return null;
    }

    public static UUID f(byte[] bArr) {
        a d10 = d(bArr);
        if (d10 == null) {
            return null;
        }
        return d10.f11128a;
    }

    public static int g(byte[] bArr) {
        a d10 = d(bArr);
        if (d10 == null) {
            return -1;
        }
        return d10.f11129b;
    }
}
