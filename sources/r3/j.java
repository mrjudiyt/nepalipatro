package r3;

import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.util.List;

@AutoValue
@Encodable
/* compiled from: BatchedLogRequest */
public abstract class j {
    public static j a(List<m> list) {
        return new d(list);
    }

    public static DataEncoder b() {
        return new JsonDataEncoderBuilder().configureWith(b.f10867a).ignoreNullValues(true).build();
    }

    @Encodable.Field(name = "logRequest")
    public abstract List<m> c();
}
