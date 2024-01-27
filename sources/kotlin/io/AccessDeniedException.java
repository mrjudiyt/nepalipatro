package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: Exceptions.kt */
public final class AccessDeniedException extends FileSystemException {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccessDeniedException(File file, File file2, String str, int i10, g gVar) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccessDeniedException(File file, File file2, String str) {
        super(file, file2, str);
        m.f(file, "file");
    }
}
