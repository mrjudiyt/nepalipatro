package com.facebook;

import com.facebook.GraphRequest;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;

/* compiled from: GraphRequest.kt */
public final class GraphRequest$serializeToBatch$1 implements GraphRequest.KeyValueSerializer {
    final /* synthetic */ ArrayList<String> $keysAndValues;

    GraphRequest$serializeToBatch$1(ArrayList<String> arrayList) {
        this.$keysAndValues = arrayList;
    }

    public void writeString(String str, String str2) {
        m.f(str, Constants.KEY);
        m.f(str2, "value");
        ArrayList<String> arrayList = this.$keysAndValues;
        b0 b0Var = b0.f15559a;
        String format = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(str2, "UTF-8")}, 2));
        m.e(format, "java.lang.String.format(locale, format, *args)");
        arrayList.add(format);
    }
}
