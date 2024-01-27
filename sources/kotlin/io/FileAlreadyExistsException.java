package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.m;

/* compiled from: Exceptions.kt */
public final class FileAlreadyExistsException extends FileSystemException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileAlreadyExistsException(File file, File file2, String str) {
        super(file, file2, str);
        m.f(file, "file");
    }
}
