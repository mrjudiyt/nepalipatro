package androidx.room;

import android.content.Context;
import c1.a;
import c1.d;
import e1.b;
import e1.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/* compiled from: SQLiteCopyOpenHelper */
class j implements c {

    /* renamed from: h  reason: collision with root package name */
    private final Context f4437h;

    /* renamed from: i  reason: collision with root package name */
    private final String f4438i;

    /* renamed from: j  reason: collision with root package name */
    private final File f4439j;

    /* renamed from: k  reason: collision with root package name */
    private final int f4440k;

    /* renamed from: l  reason: collision with root package name */
    private final c f4441l;

    /* renamed from: m  reason: collision with root package name */
    private a f4442m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f4443n;

    j(Context context, String str, File file, int i10, c cVar) {
        this.f4437h = context;
        this.f4438i = str;
        this.f4439j = file;
        this.f4440k = i10;
        this.f4441l = cVar;
    }

    private void a(File file) {
        ReadableByteChannel readableByteChannel;
        if (this.f4438i != null) {
            readableByteChannel = Channels.newChannel(this.f4437h.getAssets().open(this.f4438i));
        } else if (this.f4439j != null) {
            readableByteChannel = new FileInputStream(this.f4439j).getChannel();
        } else {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f4437h.getCacheDir());
        createTempFile.deleteOnExit();
        d.a(readableByteChannel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        } else if (!createTempFile.renameTo(file)) {
            throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        }
    }

    private void j() {
        String databaseName = getDatabaseName();
        File databasePath = this.f4437h.getDatabasePath(databaseName);
        a aVar = this.f4442m;
        a aVar2 = new a(databaseName, this.f4437h.getFilesDir(), aVar == null || aVar.f4342j);
        try {
            aVar2.b();
            if (!databasePath.exists()) {
                a(databasePath);
                aVar2.c();
            } else if (this.f4442m == null) {
                aVar2.c();
            } else {
                try {
                    int c10 = c1.c.c(databasePath);
                    int i10 = this.f4440k;
                    if (c10 == i10) {
                        aVar2.c();
                    } else if (this.f4442m.a(c10, i10)) {
                        aVar2.c();
                    } else {
                        if (this.f4437h.deleteDatabase(databaseName)) {
                            try {
                                a(databasePath);
                            } catch (IOException unused) {
                            }
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Failed to delete database file (");
                            sb.append(databaseName);
                            sb.append(") for a copy destructive migration.");
                        }
                        aVar2.c();
                    }
                } catch (IOException unused2) {
                    aVar2.c();
                }
            }
        } catch (IOException e10) {
            throw new RuntimeException("Unable to copy database file.", e10);
        } catch (Throwable th) {
            aVar2.c();
            throw th;
        }
    }

    public synchronized b V() {
        if (!this.f4443n) {
            j();
            this.f4443n = true;
        }
        return this.f4441l.V();
    }

    public synchronized void close() {
        this.f4441l.close();
        this.f4443n = false;
    }

    public String getDatabaseName() {
        return this.f4441l.getDatabaseName();
    }

    /* access modifiers changed from: package-private */
    public void h(a aVar) {
        this.f4442m = aVar;
    }

    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f4441l.setWriteAheadLoggingEnabled(z10);
    }
}
