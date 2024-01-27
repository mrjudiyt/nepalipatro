package np.com.nepalipatro.helpers;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;

/* compiled from: FileIO.kt */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f16051a = new h();

    private h() {
    }

    private final void b(File file, String str) {
        String canonicalPath = new File(str).getCanonicalPath();
        String canonicalPath2 = file.getCanonicalPath();
        m.e(canonicalPath2, "outputFilecanonicalPath");
        m.e(canonicalPath, "destDirCanonicalPath");
        if (!p.v(canonicalPath2, canonicalPath, false, 2, (Object) null)) {
            b0 b0Var = b0.f15559a;
            String format = String.format("Found Zip Path Traversal Vulnerability with %s", Arrays.copyOf(new Object[]{canonicalPath}, 1));
            m.e(format, "format(format, *args)");
            throw new Exception(format);
        }
    }

    public final boolean a(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return file.delete();
            }
            return false;
        } catch (Exception e10) {
            if (!g.f16048a.a()) {
                return false;
            }
            e10.printStackTrace();
            return false;
        }
    }

    public final boolean c(String str, String str2, String str3) {
        m.f(str, "path");
        m.f(str2, "zipname");
        m.f(str3, "outputPath");
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str + str2)));
            byte[] bArr = new byte[1024];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                m.e(nextEntry, "it");
                if (nextEntry != null) {
                    try {
                        b(new File(str3, nextEntry.getName()), str3);
                        FileOutputStream fileOutputStream = new FileOutputStream(str3 + nextEntry.getName());
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.close();
                        zipInputStream.closeEntry();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        return false;
                    }
                } else {
                    zipInputStream.close();
                    return true;
                }
            }
        } catch (IOException e11) {
            e11.printStackTrace();
            return false;
        }
    }
}
