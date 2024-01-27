package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.concurrent.futures.e;
import com.facebook.internal.NativeProtocol;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* compiled from: ProfileVerifier */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final e<c> f3957a = e.a();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f3958b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static c f3959c = null;

    /* compiled from: ProfileVerifier */
    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0));
        }
    }

    /* compiled from: ProfileVerifier */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        final int f3960a;

        /* renamed from: b  reason: collision with root package name */
        final int f3961b;

        /* renamed from: c  reason: collision with root package name */
        final long f3962c;

        /* renamed from: d  reason: collision with root package name */
        final long f3963d;

        b(int i10, int i11, long j10, long j11) {
            this.f3960a = i10;
            this.f3961b = i11;
            this.f3962c = j10;
            this.f3963d = j11;
        }

        static b a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        /* access modifiers changed from: package-private */
        public void b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f3960a);
                dataOutputStream.writeInt(this.f3961b);
                dataOutputStream.writeLong(this.f3962c);
                dataOutputStream.writeLong(this.f3963d);
                dataOutputStream.close();
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f3961b == bVar.f3961b && this.f3962c == bVar.f3962c && this.f3960a == bVar.f3960a && this.f3963d == bVar.f3963d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.f3961b), Long.valueOf(this.f3962c), Integer.valueOf(this.f3960a), Long.valueOf(this.f3963d)});
        }
    }

    /* compiled from: ProfileVerifier */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final int f3964a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f3965b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f3966c;

        c(int i10, boolean z10, boolean z11) {
            this.f3964a = i10;
            this.f3966c = z11;
            this.f3965b = z10;
        }
    }

    private static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return a.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c b(int i10, boolean z10, boolean z11) {
        c cVar = new c(i10, z10, z11);
        f3959c = cVar;
        f3957a.set(cVar);
        return f3959c;
    }

    static c c(Context context, boolean z10) {
        b bVar;
        c cVar;
        if (!z10 && (cVar = f3959c) != null) {
            return cVar;
        }
        synchronized (f3958b) {
            if (!z10) {
                c cVar2 = f3959c;
                if (cVar2 != null) {
                    return cVar2;
                }
            }
            int i10 = Build.VERSION.SDK_INT;
            int i11 = 0;
            if (i10 >= 28) {
                if (i10 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z11 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z12 = file2.exists() && length2 > 0;
                    try {
                        long a10 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        b bVar2 = null;
                        if (file3.exists()) {
                            try {
                                bVar2 = b.a(file3);
                            } catch (IOException unused) {
                                return b(131072, z11, z12);
                            }
                        }
                        if (bVar2 != null && bVar2.f3962c == a10) {
                            int i12 = bVar2.f3961b;
                            if (i12 != 2) {
                                i11 = i12;
                                if (z10 && z12 && i11 != 1) {
                                    i11 = 2;
                                }
                                if (bVar2 != null && bVar2.f3961b == 2 && i11 == 1 && length < bVar2.f3963d) {
                                    i11 = 3;
                                }
                                bVar = new b(1, i11, a10, length2);
                                if (bVar2 == null || !bVar2.equals(bVar)) {
                                    bVar.b(file3);
                                }
                                c b10 = b(i11, z11, z12);
                                return b10;
                            }
                        }
                        if (z11) {
                            i11 = 1;
                        } else if (z12) {
                            i11 = 2;
                        }
                        i11 = 2;
                        i11 = 3;
                        bVar = new b(1, i11, a10, length2);
                        try {
                            bVar.b(file3);
                        } catch (IOException unused2) {
                            i11 = 196608;
                        }
                        c b102 = b(i11, z11, z12);
                        return b102;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        return b(NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST, z11, z12);
                    }
                }
            }
            c b11 = b(262144, false, false);
            return b11;
        }
    }
}
