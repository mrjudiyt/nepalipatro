package i0;

import android.content.Context;
import f0.a;
import java.io.File;
import kotlin.jvm.internal.m;

/* compiled from: PreferenceDataStoreFile.kt */
public final class b {
    public static final File a(Context context, String str) {
        m.f(context, "<this>");
        m.f(str, "name");
        return a.a(context, m.o(str, ".preferences_pb"));
    }
}
