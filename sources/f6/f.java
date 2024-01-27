package f6;

import java.util.Objects;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
public final class f {
    public static Object a(Object obj) {
        Objects.requireNonNull(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
