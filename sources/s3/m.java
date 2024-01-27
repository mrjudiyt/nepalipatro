package s3;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import v3.a;

@Encodable
/* compiled from: ProtoEncoderDoNotUse */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    private static final ProtobufEncoder f11397a = ProtobufEncoder.builder().configureWith(a.f11330a).build();

    private m() {
    }

    public static byte[] a(Object obj) {
        return f11397a.encode(obj);
    }

    public abstract a b();
}
