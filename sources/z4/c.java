package z4;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: EventMessageEncoder */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final ByteArrayOutputStream f13194a;

    /* renamed from: b  reason: collision with root package name */
    private final DataOutputStream f13195b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f13194a = byteArrayOutputStream;
        this.f13195b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.f13194a.reset();
        try {
            b(this.f13195b, aVar.f13188h);
            String str = aVar.f13189i;
            if (str == null) {
                str = "";
            }
            b(this.f13195b, str);
            this.f13195b.writeLong(aVar.f13190j);
            this.f13195b.writeLong(aVar.f13191k);
            this.f13195b.write(aVar.f13192l);
            this.f13195b.flush();
            return this.f13194a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
