package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.m;
import w8.c;

/* compiled from: Exceptions.kt */
public class FileSystemException extends IOException {

    /* renamed from: h  reason: collision with root package name */
    private final File f15554h;

    /* renamed from: i  reason: collision with root package name */
    private final File f15555i;

    /* renamed from: j  reason: collision with root package name */
    private final String f15556j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileSystemException(File file, File file2, String str) {
        super(c.a(file, file2, str));
        m.f(file, "file");
        this.f15554h = file;
        this.f15555i = file2;
        this.f15556j = str;
    }
}
