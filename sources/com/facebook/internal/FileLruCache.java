package com.facebook.internal;

import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import com.google.android.gms.common.api.Api;
import g9.d;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidParameterException;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import o8.q;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: FileLruCache.kt */
public final class FileLruCache {
    public static final Companion Companion = new Companion((g) null);
    private static final String HEADER_CACHEKEY_KEY = "key";
    private static final String HEADER_CACHE_CONTENT_TAG_KEY = "tag";
    /* access modifiers changed from: private */
    public static final String TAG = FileLruCache.class.getSimpleName();
    /* access modifiers changed from: private */
    public static final AtomicLong bufferIndex = new AtomicLong();
    private final Condition condition;
    private final File directory;
    private boolean isTrimInProgress;
    private boolean isTrimPending;
    /* access modifiers changed from: private */
    public final AtomicLong lastClearCacheTime = new AtomicLong(0);
    private final Limits limits;
    private final ReentrantLock lock;
    private final String tag;

    /* compiled from: FileLruCache.kt */
    private static final class BufferFile {
        private static final String FILE_NAME_PREFIX = "buffer";
        public static final BufferFile INSTANCE = new BufferFile();
        private static final FilenameFilter filterExcludeBufferFiles = m.f6078a;
        private static final FilenameFilter filterExcludeNonBufferFiles = l.f6077a;

        private BufferFile() {
        }

        /* access modifiers changed from: private */
        /* renamed from: filterExcludeBufferFiles$lambda-0  reason: not valid java name */
        public static final boolean m100filterExcludeBufferFiles$lambda0(File file, String str) {
            m.e(str, "filename");
            return !p.v(str, FILE_NAME_PREFIX, false, 2, (Object) null);
        }

        /* access modifiers changed from: private */
        /* renamed from: filterExcludeNonBufferFiles$lambda-1  reason: not valid java name */
        public static final boolean m101filterExcludeNonBufferFiles$lambda1(File file, String str) {
            m.e(str, "filename");
            return p.v(str, FILE_NAME_PREFIX, false, 2, (Object) null);
        }

        public final void deleteAll(File file) {
            m.f(file, "root");
            File[] listFiles = file.listFiles(excludeNonBufferFiles());
            if (listFiles != null) {
                int i10 = 0;
                int length = listFiles.length;
                while (i10 < length) {
                    File file2 = listFiles[i10];
                    i10++;
                    file2.delete();
                }
            }
        }

        public final FilenameFilter excludeBufferFiles() {
            return filterExcludeBufferFiles;
        }

        public final FilenameFilter excludeNonBufferFiles() {
            return filterExcludeNonBufferFiles;
        }

        public final File newFile(File file) {
            return new File(file, m.o(FILE_NAME_PREFIX, Long.valueOf(FileLruCache.bufferIndex.incrementAndGet())));
        }
    }

    /* compiled from: FileLruCache.kt */
    private static final class CloseCallbackOutputStream extends OutputStream {
        private final StreamCloseCallback callback;
        private final OutputStream innerStream;

        public CloseCallbackOutputStream(OutputStream outputStream, StreamCloseCallback streamCloseCallback) {
            m.f(outputStream, "innerStream");
            m.f(streamCloseCallback, "callback");
            this.innerStream = outputStream;
            this.callback = streamCloseCallback;
        }

        public void close() {
            try {
                this.innerStream.close();
            } finally {
                this.callback.onClose();
            }
        }

        public void flush() {
            this.innerStream.flush();
        }

        public final StreamCloseCallback getCallback() {
            return this.callback;
        }

        public final OutputStream getInnerStream() {
            return this.innerStream;
        }

        public void write(byte[] bArr, int i10, int i11) {
            m.f(bArr, "buffer");
            this.innerStream.write(bArr, i10, i11);
        }

        public void write(byte[] bArr) {
            m.f(bArr, "buffer");
            this.innerStream.write(bArr);
        }

        public void write(int i10) {
            this.innerStream.write(i10);
        }
    }

    /* compiled from: FileLruCache.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final String getTAG() {
            return FileLruCache.TAG;
        }
    }

    /* compiled from: FileLruCache.kt */
    public static final class Limits {
        private int byteCount = 1048576;
        private int fileCount = 1024;

        public final int getByteCount() {
            return this.byteCount;
        }

        public final int getFileCount() {
            return this.fileCount;
        }

        public final void setByteCount(int i10) {
            if (i10 >= 0) {
                this.byteCount = i10;
                return;
            }
            throw new InvalidParameterException("Cache byte-count limit must be >= 0");
        }

        public final void setFileCount(int i10) {
            if (i10 >= 0) {
                this.fileCount = i10;
                return;
            }
            throw new InvalidParameterException("Cache file count limit must be >= 0");
        }
    }

    /* compiled from: FileLruCache.kt */
    private static final class ModifiedFile implements Comparable<ModifiedFile> {
        public static final Companion Companion = new Companion((g) null);
        private static final int HASH_MULTIPLIER = 37;
        private static final int HASH_SEED = 29;
        private final File file;
        private final long modified;

        /* compiled from: FileLruCache.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }
        }

        public ModifiedFile(File file2) {
            m.f(file2, "file");
            this.file = file2;
            this.modified = file2.lastModified();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ModifiedFile) && compareTo((ModifiedFile) obj) == 0;
        }

        public final File getFile() {
            return this.file;
        }

        public final long getModified() {
            return this.modified;
        }

        public int hashCode() {
            return ((1073 + this.file.hashCode()) * 37) + ((int) (this.modified % ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)));
        }

        public int compareTo(ModifiedFile modifiedFile) {
            m.f(modifiedFile, "another");
            long j10 = this.modified;
            long j11 = modifiedFile.modified;
            if (j10 < j11) {
                return -1;
            }
            if (j10 > j11) {
                return 1;
            }
            return this.file.compareTo(modifiedFile.file);
        }
    }

    /* compiled from: FileLruCache.kt */
    private interface StreamCloseCallback {
        void onClose();
    }

    /* compiled from: FileLruCache.kt */
    private static final class StreamHeader {
        private static final int HEADER_VERSION = 0;
        public static final StreamHeader INSTANCE = new StreamHeader();

        private StreamHeader() {
        }

        public final JSONObject readHeader(InputStream inputStream) {
            m.f(inputStream, "stream");
            if (inputStream.read() != 0) {
                return null;
            }
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < 3; i12++) {
                int read = inputStream.read();
                if (read == -1) {
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                    String tag = FileLruCache.Companion.getTAG();
                    m.e(tag, "TAG");
                    companion.log(loggingBehavior, tag, "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i11 = (i11 << 8) + (read & 255);
            }
            byte[] bArr = new byte[i11];
            while (i10 < i11) {
                int read2 = inputStream.read(bArr, i10, i11 - i10);
                if (read2 < 1) {
                    Logger.Companion companion2 = Logger.Companion;
                    LoggingBehavior loggingBehavior2 = LoggingBehavior.CACHE;
                    String tag2 = FileLruCache.Companion.getTAG();
                    m.e(tag2, "TAG");
                    companion2.log(loggingBehavior2, tag2, "readHeader: stream.read stopped at " + Integer.valueOf(i10) + " when expected " + i11);
                    return null;
                }
                i10 += read2;
            }
            try {
                Object nextValue = new JSONTokener(new String(bArr, d.f14759b)).nextValue();
                if (nextValue instanceof JSONObject) {
                    return (JSONObject) nextValue;
                }
                Logger.Companion companion3 = Logger.Companion;
                LoggingBehavior loggingBehavior3 = LoggingBehavior.CACHE;
                String tag3 = FileLruCache.Companion.getTAG();
                m.e(tag3, "TAG");
                companion3.log(loggingBehavior3, tag3, m.o("readHeader: expected JSONObject, got ", nextValue.getClass().getCanonicalName()));
                return null;
            } catch (JSONException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final void writeHeader(OutputStream outputStream, JSONObject jSONObject) {
            m.f(outputStream, "stream");
            m.f(jSONObject, "header");
            String jSONObject2 = jSONObject.toString();
            m.e(jSONObject2, "header.toString()");
            byte[] bytes = jSONObject2.getBytes(d.f14759b);
            m.e(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(0);
            outputStream.write((bytes.length >> 16) & 255);
            outputStream.write((bytes.length >> 8) & 255);
            outputStream.write((bytes.length >> 0) & 255);
            outputStream.write(bytes);
        }
    }

    public FileLruCache(String str, Limits limits2) {
        m.f(str, "tag");
        m.f(limits2, "limits");
        this.tag = str;
        this.limits = limits2;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        File file = new File(FacebookSdk.getCacheDir(), str);
        this.directory = file;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        if (file.mkdirs() || file.isDirectory()) {
            BufferFile.INSTANCE.deleteAll(file);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: clearCache$lambda-1  reason: not valid java name */
    public static final void m98clearCache$lambda1(File[] fileArr) {
        m.e(fileArr, "filesToDelete");
        int length = fileArr.length;
        int i10 = 0;
        while (i10 < length) {
            File file = fileArr[i10];
            i10++;
            file.delete();
        }
    }

    public static /* synthetic */ InputStream get$default(FileLruCache fileLruCache, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return fileLruCache.get(str, str2);
    }

    public static /* synthetic */ OutputStream openPutStream$default(FileLruCache fileLruCache, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return fileLruCache.openPutStream(str, str2);
    }

    private final void postTrim() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!this.isTrimPending) {
                this.isTrimPending = true;
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                FacebookSdk.getExecutor().execute(new j(this));
            }
            q qVar = q.f16189a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: postTrim$lambda-3$lambda-2  reason: not valid java name */
    public static final void m99postTrim$lambda3$lambda2(FileLruCache fileLruCache) {
        m.f(fileLruCache, "this$0");
        fileLruCache.trim();
    }

    /* access modifiers changed from: private */
    public final void renameToTargetAndTrim(String str, File file) {
        File file2 = this.directory;
        Utility utility = Utility.INSTANCE;
        if (!file.renameTo(new File(file2, Utility.md5hash(str)))) {
            file.delete();
        }
        postTrim();
    }

    private final void trim() {
        ReentrantLock reentrantLock;
        long j10;
        ReentrantLock reentrantLock2 = this.lock;
        reentrantLock2.lock();
        try {
            this.isTrimPending = false;
            this.isTrimInProgress = true;
            q qVar = q.f16189a;
            try {
                Logger.Companion companion = Logger.Companion;
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String str = TAG;
                m.e(str, "TAG");
                companion.log(loggingBehavior, str, "trim started");
                PriorityQueue priorityQueue = new PriorityQueue();
                File[] listFiles = this.directory.listFiles(BufferFile.INSTANCE.excludeBufferFiles());
                long j11 = 0;
                if (listFiles != null) {
                    int length = listFiles.length;
                    j10 = 0;
                    int i10 = 0;
                    while (i10 < length) {
                        File file = listFiles[i10];
                        i10++;
                        m.e(file, "file");
                        ModifiedFile modifiedFile = new ModifiedFile(file);
                        priorityQueue.add(modifiedFile);
                        Logger.Companion companion2 = Logger.Companion;
                        LoggingBehavior loggingBehavior2 = LoggingBehavior.CACHE;
                        String str2 = TAG;
                        m.e(str2, "TAG");
                        companion2.log(loggingBehavior2, str2, "  trim considering time=" + Long.valueOf(modifiedFile.getModified()) + " name=" + modifiedFile.getFile().getName());
                        j11 += file.length();
                        j10++;
                        listFiles = listFiles;
                    }
                } else {
                    j10 = 0;
                }
                while (true) {
                    if (j11 > ((long) this.limits.getByteCount()) || j10 > ((long) this.limits.getFileCount())) {
                        File file2 = ((ModifiedFile) priorityQueue.remove()).getFile();
                        Logger.Companion companion3 = Logger.Companion;
                        LoggingBehavior loggingBehavior3 = LoggingBehavior.CACHE;
                        String str3 = TAG;
                        m.e(str3, "TAG");
                        companion3.log(loggingBehavior3, str3, m.o("  trim removing ", file2.getName()));
                        j11 -= file2.length();
                        j10--;
                        file2.delete();
                    } else {
                        reentrantLock = this.lock;
                        reentrantLock.lock();
                        try {
                            this.isTrimInProgress = false;
                            this.condition.signalAll();
                            q qVar2 = q.f16189a;
                            return;
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                }
            } catch (Throwable th) {
                reentrantLock = this.lock;
                reentrantLock.lock();
                this.isTrimInProgress = false;
                this.condition.signalAll();
                q qVar3 = q.f16189a;
                throw th;
            } finally {
                reentrantLock.unlock();
            }
        } finally {
            reentrantLock2.unlock();
        }
    }

    public final void clearCache() {
        File[] listFiles = this.directory.listFiles(BufferFile.INSTANCE.excludeBufferFiles());
        this.lastClearCacheTime.set(System.currentTimeMillis());
        if (listFiles != null) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            FacebookSdk.getExecutor().execute(new k(listFiles));
        }
    }

    public final InputStream get(String str) {
        m.f(str, "key");
        return get$default(this, str, (String) null, 2, (Object) null);
    }

    public final InputStream get(String str, String str2) {
        m.f(str, "key");
        File file = this.directory;
        Utility utility = Utility.INSTANCE;
        File file2 = new File(file, Utility.md5hash(str));
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2), 8192);
            try {
                JSONObject readHeader = StreamHeader.INSTANCE.readHeader(bufferedInputStream);
                if (readHeader == null) {
                    return null;
                }
                if (!m.a(readHeader.optString("key"), str)) {
                    bufferedInputStream.close();
                    return null;
                }
                String optString = readHeader.optString("tag", (String) null);
                if (str2 != null || m.a(str2, optString)) {
                    long time = new Date().getTime();
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                    String str3 = TAG;
                    m.e(str3, "TAG");
                    companion.log(loggingBehavior, str3, "Setting lastModified to " + Long.valueOf(time) + " for " + file2.getName());
                    file2.setLastModified(time);
                    return bufferedInputStream;
                }
                bufferedInputStream.close();
                return null;
            } finally {
                bufferedInputStream.close();
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getLocation() {
        String path = this.directory.getPath();
        m.e(path, "directory.path");
        return path;
    }

    public final InputStream interceptAndPut(String str, InputStream inputStream) {
        m.f(str, "key");
        m.f(inputStream, "input");
        return new CopyingInputStream(inputStream, openPutStream$default(this, str, (String) null, 2, (Object) null));
    }

    public final OutputStream openPutStream(String str) {
        m.f(str, "key");
        return openPutStream$default(this, str, (String) null, 2, (Object) null);
    }

    public final OutputStream openPutStream(String str, String str2) {
        m.f(str, "key");
        File newFile = BufferFile.INSTANCE.newFile(this.directory);
        newFile.delete();
        if (newFile.createNewFile()) {
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new CloseCallbackOutputStream(new FileOutputStream(newFile), new FileLruCache$openPutStream$renameToTargetCallback$1(System.currentTimeMillis(), this, newFile, str)), 8192);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key", str);
                    Utility utility = Utility.INSTANCE;
                    if (!Utility.isNullOrEmpty(str2)) {
                        jSONObject.put("tag", str2);
                    }
                    StreamHeader.INSTANCE.writeHeader(bufferedOutputStream, jSONObject);
                    return bufferedOutputStream;
                } catch (JSONException e10) {
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                    String str3 = TAG;
                    m.e(str3, "TAG");
                    companion.log(loggingBehavior, 5, str3, m.o("Error creating JSON header for cache file: ", e10));
                    throw new IOException(e10.getMessage());
                } catch (Throwable th) {
                    bufferedOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e11) {
                Logger.Companion companion2 = Logger.Companion;
                LoggingBehavior loggingBehavior2 = LoggingBehavior.CACHE;
                String str4 = TAG;
                m.e(str4, "TAG");
                companion2.log(loggingBehavior2, 5, str4, m.o("Error creating buffer output stream: ", e11));
                throw new IOException(e11.getMessage());
            }
        } else {
            throw new IOException(m.o("Could not create file at ", newFile.getAbsolutePath()));
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:1|2|(2:4|(1:6)(1:20))|14|15|21|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        r0.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0005 */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0005 A[LOOP:0: B:1:0x0005->B:19:0x0005, LOOP_START, SYNTHETIC, Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long sizeInBytesForTest() {
        /*
            r7 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r7.lock
            r0.lock()
        L_0x0005:
            boolean r1 = r7.isTrimPending     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x002c
            boolean r1 = r7.isTrimInProgress     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x000e
            goto L_0x002c
        L_0x000e:
            o8.q r1 = o8.q.f16189a     // Catch:{ all -> 0x0032 }
            r0.unlock()
            java.io.File r0 = r7.directory
            java.io.File[] r0 = r0.listFiles()
            r1 = 0
            if (r0 == 0) goto L_0x002b
            r3 = 0
            int r4 = r0.length
        L_0x001f:
            if (r3 >= r4) goto L_0x002b
            r5 = r0[r3]
            int r3 = r3 + 1
            long r5 = r5.length()
            long r1 = r1 + r5
            goto L_0x001f
        L_0x002b:
            return r1
        L_0x002c:
            java.util.concurrent.locks.Condition r1 = r7.condition     // Catch:{ InterruptedException -> 0x0005 }
            r1.await()     // Catch:{ InterruptedException -> 0x0005 }
            goto L_0x0005
        L_0x0032:
            r1 = move-exception
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.FileLruCache.sizeInBytesForTest():long");
    }

    public String toString() {
        return "{FileLruCache: tag:" + this.tag + " file:" + this.directory.getName() + '}';
    }

    /* compiled from: FileLruCache.kt */
    private static final class CopyingInputStream extends InputStream {
        private final InputStream input;
        private final OutputStream output;

        public CopyingInputStream(InputStream inputStream, OutputStream outputStream) {
            m.f(inputStream, "input");
            m.f(outputStream, "output");
            this.input = inputStream;
            this.output = outputStream;
        }

        public int available() {
            return this.input.available();
        }

        public void close() {
            try {
                this.input.close();
            } finally {
                this.output.close();
            }
        }

        public final InputStream getInput() {
            return this.input;
        }

        public final OutputStream getOutput() {
            return this.output;
        }

        public void mark(int i10) {
            throw new UnsupportedOperationException();
        }

        public boolean markSupported() {
            return false;
        }

        public int read(byte[] bArr) {
            m.f(bArr, "buffer");
            int read = this.input.read(bArr);
            if (read > 0) {
                this.output.write(bArr, 0, read);
            }
            return read;
        }

        public synchronized void reset() {
            throw new UnsupportedOperationException();
        }

        public long skip(long j10) {
            int read;
            byte[] bArr = new byte[1024];
            long j11 = 0;
            while (j11 < j10 && (read = read(bArr, 0, (int) Math.min(j10 - j11, (long) 1024))) >= 0) {
                j11 += (long) read;
            }
            return j11;
        }

        public int read() {
            int read = this.input.read();
            if (read >= 0) {
                this.output.write(read);
            }
            return read;
        }

        public int read(byte[] bArr, int i10, int i11) {
            m.f(bArr, "buffer");
            int read = this.input.read(bArr, i10, i11);
            if (read > 0) {
                this.output.write(bArr, i10, read);
            }
            return read;
        }
    }
}
