package w8;

import java.io.File;
import kotlin.jvm.internal.m;

/* compiled from: FileTreeWalk.kt */
class i extends h {
    public static final d c(File file, e eVar) {
        m.f(file, "<this>");
        m.f(eVar, "direction");
        return new d(file, eVar);
    }

    public static final d d(File file) {
        m.f(file, "<this>");
        return c(file, e.BOTTOM_UP);
    }
}
