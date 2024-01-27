package s0;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* compiled from: MultiDexExtractor */
final class b implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    private final File f11303h;

    /* renamed from: i  reason: collision with root package name */
    private final long f11304i;

    /* renamed from: j  reason: collision with root package name */
    private final File f11305j;

    /* renamed from: k  reason: collision with root package name */
    private final RandomAccessFile f11306k;

    /* renamed from: l  reason: collision with root package name */
    private final FileChannel f11307l;

    /* renamed from: m  reason: collision with root package name */
    private final FileLock f11308m;

    /* compiled from: MultiDexExtractor */
    class a implements FileFilter {
        a() {
        }

        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* renamed from: s0.b$b  reason: collision with other inner class name */
    /* compiled from: MultiDexExtractor */
    private static class C0196b extends File {

        /* renamed from: h  reason: collision with root package name */
        public long f11310h = -1;

        public C0196b(File file, String str) {
            super(file, str);
        }
    }

    b(File file, File file2) {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiDexExtractor(");
        sb.append(file.getPath());
        sb.append(", ");
        sb.append(file2.getPath());
        sb.append(")");
        this.f11303h = file;
        this.f11305j = file2;
        this.f11304i = w(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f11306k = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f11307l = channel;
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Blocking on lock ");
                sb2.append(file3.getPath());
                this.f11308m = channel.lock();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(file3.getPath());
                sb3.append(" locked");
            } catch (IOException e10) {
                e = e10;
                h(this.f11307l);
                throw e;
            } catch (RuntimeException e11) {
                e = e11;
                h(this.f11307l);
                throw e;
            } catch (Error e12) {
                e = e12;
                h(this.f11307l);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e13) {
            h(this.f11306k);
            throw e13;
        }
    }

    private static boolean E(Context context, File file, long j10, String str) {
        SharedPreferences q10 = q(context);
        if (q10.getLong(str + Constants.TIMESTAMP, -1) == u(file)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("crc");
            return q10.getLong(sb.toString(), -1) != j10;
        }
    }

    private List<C0196b> L(Context context, String str) {
        String str2 = str;
        String str3 = this.f11303h.getName() + ".classes";
        SharedPreferences q10 = q(context);
        int i10 = q10.getInt(str2 + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i10 + -1);
        int i11 = 2;
        while (i11 <= i10) {
            C0196b bVar = new C0196b(this.f11305j, str3 + i11 + ".zip");
            if (bVar.isFile()) {
                bVar.f11310h = w(bVar);
                long j10 = q10.getLong(str2 + "dex.crc." + i11, -1);
                long j11 = q10.getLong(str2 + "dex.time." + i11, -1);
                long lastModified = bVar.lastModified();
                if (j11 == lastModified) {
                    String str4 = str3;
                    SharedPreferences sharedPreferences = q10;
                    if (j10 == bVar.f11310h) {
                        arrayList.add(bVar);
                        i11++;
                        q10 = sharedPreferences;
                        str3 = str4;
                    }
                }
                throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str2 + "\"), expected modification time: " + j11 + ", modification time: " + lastModified + ", expected crc: " + j10 + ", file crc: " + bVar.f11310h);
            }
            throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
        }
        return arrayList;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r10 = new java.lang.StringBuilder();
        r10.append("Failed to read crc from ");
        r10.append(r8.getAbsolutePath());
        r10 = false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0083 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<s0.b.C0196b> W() {
        /*
            r14 = this;
            java.lang.String r0 = ".dex"
            java.lang.String r1 = "classes"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r3 = r14.f11303h
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = ".classes"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r14.a()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile
            java.io.File r5 = r14.f11303h
            r4.<init>(r5)
            r5 = 2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r6.<init>()     // Catch:{ all -> 0x0135 }
            r6.append(r1)     // Catch:{ all -> 0x0135 }
            r6.append(r5)     // Catch:{ all -> 0x0135 }
            r6.append(r0)     // Catch:{ all -> 0x0135 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0135 }
            java.util.zip.ZipEntry r6 = r4.getEntry(r6)     // Catch:{ all -> 0x0135 }
        L_0x0041:
            if (r6 == 0) goto L_0x0131
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r7.<init>()     // Catch:{ all -> 0x0135 }
            r7.append(r2)     // Catch:{ all -> 0x0135 }
            r7.append(r5)     // Catch:{ all -> 0x0135 }
            java.lang.String r8 = ".zip"
            r7.append(r8)     // Catch:{ all -> 0x0135 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0135 }
            s0.b$b r8 = new s0.b$b     // Catch:{ all -> 0x0135 }
            java.io.File r9 = r14.f11305j     // Catch:{ all -> 0x0135 }
            r8.<init>(r9, r7)     // Catch:{ all -> 0x0135 }
            r3.add(r8)     // Catch:{ all -> 0x0135 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r7.<init>()     // Catch:{ all -> 0x0135 }
            java.lang.String r9 = "Extraction is needed for file "
            r7.append(r9)     // Catch:{ all -> 0x0135 }
            r7.append(r8)     // Catch:{ all -> 0x0135 }
            r7 = 0
            r9 = 0
            r10 = 0
        L_0x0071:
            r11 = 3
            if (r9 >= r11) goto L_0x00ed
            if (r10 != 0) goto L_0x00ed
            int r9 = r9 + 1
            j(r4, r6, r8, r2)     // Catch:{ all -> 0x0135 }
            long r10 = w(r8)     // Catch:{ IOException -> 0x0083 }
            r8.f11310h = r10     // Catch:{ IOException -> 0x0083 }
            r10 = 1
            goto L_0x0095
        L_0x0083:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r10.<init>()     // Catch:{ all -> 0x0135 }
            java.lang.String r11 = "Failed to read crc from "
            r10.append(r11)     // Catch:{ all -> 0x0135 }
            java.lang.String r11 = r8.getAbsolutePath()     // Catch:{ all -> 0x0135 }
            r10.append(r11)     // Catch:{ all -> 0x0135 }
            r10 = 0
        L_0x0095:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r11.<init>()     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = "Extraction "
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            if (r10 == 0) goto L_0x00a4
            java.lang.String r12 = "succeeded"
            goto L_0x00a6
        L_0x00a4:
            java.lang.String r12 = "failed"
        L_0x00a6:
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = " '"
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = r8.getAbsolutePath()     // Catch:{ all -> 0x0135 }
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = "': length "
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            long r12 = r8.length()     // Catch:{ all -> 0x0135 }
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = " - crc: "
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            long r12 = r8.f11310h     // Catch:{ all -> 0x0135 }
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            if (r10 != 0) goto L_0x0071
            r8.delete()     // Catch:{ all -> 0x0135 }
            boolean r11 = r8.exists()     // Catch:{ all -> 0x0135 }
            if (r11 == 0) goto L_0x0071
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r11.<init>()     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = "Failed to delete corrupted secondary dex '"
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = r8.getPath()     // Catch:{ all -> 0x0135 }
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = "'"
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            goto L_0x0071
        L_0x00ed:
            if (r10 == 0) goto L_0x0109
            int r5 = r5 + 1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r6.<init>()     // Catch:{ all -> 0x0135 }
            r6.append(r1)     // Catch:{ all -> 0x0135 }
            r6.append(r5)     // Catch:{ all -> 0x0135 }
            r6.append(r0)     // Catch:{ all -> 0x0135 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0135 }
            java.util.zip.ZipEntry r6 = r4.getEntry(r6)     // Catch:{ all -> 0x0135 }
            goto L_0x0041
        L_0x0109:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0135 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r1.<init>()     // Catch:{ all -> 0x0135 }
            java.lang.String r2 = "Could not create zip file "
            r1.append(r2)     // Catch:{ all -> 0x0135 }
            java.lang.String r2 = r8.getAbsolutePath()     // Catch:{ all -> 0x0135 }
            r1.append(r2)     // Catch:{ all -> 0x0135 }
            java.lang.String r2 = " for secondary dex ("
            r1.append(r2)     // Catch:{ all -> 0x0135 }
            r1.append(r5)     // Catch:{ all -> 0x0135 }
            java.lang.String r2 = ")"
            r1.append(r2)     // Catch:{ all -> 0x0135 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0135 }
            r0.<init>(r1)     // Catch:{ all -> 0x0135 }
            throw r0     // Catch:{ all -> 0x0135 }
        L_0x0131:
            r4.close()     // Catch:{ IOException -> 0x0134 }
        L_0x0134:
            return r3
        L_0x0135:
            r0 = move-exception
            r4.close()     // Catch:{ IOException -> 0x0139 }
        L_0x0139:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.b.W():java.util.List");
    }

    private static void Y(Context context, String str, long j10, long j11, List<C0196b> list) {
        SharedPreferences.Editor edit = q(context).edit();
        edit.putLong(str + Constants.TIMESTAMP, j10);
        edit.putLong(str + "crc", j11);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i10 = 2;
        for (C0196b next : list) {
            edit.putLong(str + "dex.crc." + i10, next.f11310h);
            edit.putLong(str + "dex.time." + i10, next.lastModified());
            i10++;
        }
        edit.commit();
    }

    private void a() {
        File[] listFiles = this.f11305j.listFiles(new a());
        if (listFiles == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to list secondary dex dir content (");
            sb.append(this.f11305j.getPath());
            sb.append(").");
            return;
        }
        for (File file : listFiles) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Trying to delete old file ");
            sb2.append(file.getPath());
            sb2.append(" of size ");
            sb2.append(file.length());
            if (!file.delete()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Failed to delete old file ");
                sb3.append(file.getPath());
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Deleted old file ");
                sb4.append(file.getPath());
            }
        }
    }

    private static void h(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private static void j(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        ZipOutputStream zipOutputStream;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        StringBuilder sb = new StringBuilder();
        sb.append("Extracting ");
        sb.append(createTempFile.getPath());
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Renaming to ");
                sb2.append(file.getPath());
                if (createTempFile.renameTo(file)) {
                    h(inputStream);
                    createTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
        } catch (Throwable th) {
            h(inputStream);
            createTempFile.delete();
            throw th;
        }
    }

    private static SharedPreferences q(Context context) {
        return context.getSharedPreferences("multidex.version", Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    private static long u(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    private static long w(File file) {
        long c10 = c.c(file);
        return c10 == -1 ? c10 - 1 : c10;
    }

    /* access modifiers changed from: package-private */
    public List<? extends File> J(Context context, String str, boolean z10) {
        List<C0196b> list;
        List<C0196b> list2;
        StringBuilder sb = new StringBuilder();
        sb.append("MultiDexExtractor.load(");
        sb.append(this.f11303h.getPath());
        sb.append(", ");
        sb.append(z10);
        sb.append(", ");
        sb.append(str);
        sb.append(")");
        if (this.f11308m.isValid()) {
            if (z10 || E(context, this.f11303h, this.f11304i, str)) {
                list2 = W();
                Y(context, str, u(this.f11303h), this.f11304i, list2);
            } else {
                try {
                    list = L(context, str);
                } catch (IOException unused) {
                    list2 = W();
                    Y(context, str, u(this.f11303h), this.f11304i, list2);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("load found ");
                sb2.append(list.size());
                sb2.append(" secondary dex files");
                return list;
            }
            list = list2;
            StringBuilder sb22 = new StringBuilder();
            sb22.append("load found ");
            sb22.append(list.size());
            sb22.append(" secondary dex files");
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    public void close() {
        this.f11308m.release();
        this.f11307l.close();
        this.f11306k.close();
    }
}
