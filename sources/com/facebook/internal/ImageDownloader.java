package com.facebook.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.ImageRequest;
import com.facebook.internal.WorkQueue;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.internal.ShareConstants;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import o8.q;

/* compiled from: ImageDownloader.kt */
public final class ImageDownloader {
    private static final int CACHE_READ_QUEUE_MAX_CONCURRENT = 2;
    private static final int DOWNLOAD_QUEUE_MAX_CONCURRENT = 8;
    public static final ImageDownloader INSTANCE = new ImageDownloader();
    private static final WorkQueue cacheReadQueue = new WorkQueue(2, (Executor) null, 2, (g) null);
    private static final WorkQueue downloadQueue = new WorkQueue(8, (Executor) null, 2, (g) null);
    private static Handler handler;
    private static final Map<RequestKey, DownloaderContext> pendingRequests = new HashMap();

    /* compiled from: ImageDownloader.kt */
    private static final class CacheReadWorkItem implements Runnable {
        private final boolean allowCachedRedirects;
        private final RequestKey key;

        public CacheReadWorkItem(RequestKey requestKey, boolean z10) {
            m.f(requestKey, Constants.KEY);
            this.key = requestKey;
            this.allowCachedRedirects = z10;
        }

        public void run() {
            if (!CrashShieldHandler.isObjectCrashing(this)) {
                try {
                    ImageDownloader.INSTANCE.readFromCache(this.key, this.allowCachedRedirects);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        }
    }

    /* compiled from: ImageDownloader.kt */
    private static final class DownloadImageWorkItem implements Runnable {
        private final RequestKey key;

        public DownloadImageWorkItem(RequestKey requestKey) {
            m.f(requestKey, Constants.KEY);
            this.key = requestKey;
        }

        public void run() {
            if (!CrashShieldHandler.isObjectCrashing(this)) {
                try {
                    ImageDownloader.INSTANCE.download(this.key);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        }
    }

    /* compiled from: ImageDownloader.kt */
    public static final class DownloaderContext {
        private boolean isCancelled;
        private ImageRequest request;
        private WorkQueue.WorkItem workItem;

        public DownloaderContext(ImageRequest imageRequest) {
            m.f(imageRequest, "request");
            this.request = imageRequest;
        }

        public final ImageRequest getRequest() {
            return this.request;
        }

        public final WorkQueue.WorkItem getWorkItem() {
            return this.workItem;
        }

        public final boolean isCancelled() {
            return this.isCancelled;
        }

        public final void setCancelled(boolean z10) {
            this.isCancelled = z10;
        }

        public final void setRequest(ImageRequest imageRequest) {
            m.f(imageRequest, "<set-?>");
            this.request = imageRequest;
        }

        public final void setWorkItem(WorkQueue.WorkItem workItem2) {
            this.workItem = workItem2;
        }
    }

    /* compiled from: ImageDownloader.kt */
    public static final class RequestKey {
        public static final Companion Companion = new Companion((g) null);
        private static final int HASH_MULTIPLIER = 37;
        private static final int HASH_SEED = 29;
        private Object tag;
        private Uri uri;

        /* compiled from: ImageDownloader.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }
        }

        public RequestKey(Uri uri2, Object obj) {
            m.f(uri2, ShareConstants.MEDIA_URI);
            m.f(obj, ViewHierarchyConstants.TAG_KEY);
            this.uri = uri2;
            this.tag = obj;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof RequestKey)) {
                return false;
            }
            RequestKey requestKey = (RequestKey) obj;
            if (requestKey.uri == this.uri && requestKey.tag == this.tag) {
                return true;
            }
            return false;
        }

        public final Object getTag() {
            return this.tag;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return ((1073 + this.uri.hashCode()) * 37) + this.tag.hashCode();
        }

        public final void setTag(Object obj) {
            m.f(obj, "<set-?>");
            this.tag = obj;
        }

        public final void setUri(Uri uri2) {
            m.f(uri2, "<set-?>");
            this.uri = uri2;
        }
    }

    private ImageDownloader() {
    }

    public static final boolean cancelRequest(ImageRequest imageRequest) {
        boolean z10;
        m.f(imageRequest, "request");
        RequestKey requestKey = new RequestKey(imageRequest.getImageUri(), imageRequest.getCallerTag());
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            DownloaderContext downloaderContext = map.get(requestKey);
            z10 = true;
            if (downloaderContext != null) {
                WorkQueue.WorkItem workItem = downloaderContext.getWorkItem();
                if (workItem == null || !workItem.cancel()) {
                    downloaderContext.setCancelled(true);
                } else {
                    map.remove(requestKey);
                }
            } else {
                z10 = false;
            }
            q qVar = q.f16189a;
        }
        return z10;
    }

    public static final void clearCache() {
        ImageResponseCache imageResponseCache = ImageResponseCache.INSTANCE;
        ImageResponseCache.clearCache();
        UrlRedirectCache urlRedirectCache = UrlRedirectCache.INSTANCE;
        UrlRedirectCache.clearCache();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.io.IOException} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c0, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c2, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c3, code lost:
        r4 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c0 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:5:0x0018] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void download(com.facebook.internal.ImageDownloader.RequestKey r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            java.net.URL r3 = new java.net.URL     // Catch:{ IOException -> 0x00d8, all -> 0x00cd }
            android.net.Uri r4 = r11.getUri()     // Catch:{ IOException -> 0x00d8, all -> 0x00cd }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x00d8, all -> 0x00cd }
            r3.<init>(r4)     // Catch:{ IOException -> 0x00d8, all -> 0x00cd }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ IOException -> 0x00d8, all -> 0x00cd }
            if (r3 == 0) goto L_0x00c5
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x00d8, all -> 0x00cd }
            r3.setInstanceFollowRedirects(r1)     // Catch:{ IOException -> 0x00c2, all -> 0x00c0 }
            int r4 = r3.getResponseCode()     // Catch:{ IOException -> 0x00c2, all -> 0x00c0 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 == r5) goto L_0x00aa
            r5 = 301(0x12d, float:4.22E-43)
            if (r4 == r5) goto L_0x0066
            r5 = 302(0x12e, float:4.23E-43)
            if (r4 == r5) goto L_0x0066
            java.io.InputStream r4 = r3.getErrorStream()     // Catch:{ IOException -> 0x00c2, all -> 0x00c0 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0063, all -> 0x005f }
            r5.<init>()     // Catch:{ IOException -> 0x0063, all -> 0x005f }
            if (r4 == 0) goto L_0x004f
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0063, all -> 0x005f }
            r6.<init>(r4)     // Catch:{ IOException -> 0x0063, all -> 0x005f }
            r7 = 128(0x80, float:1.794E-43)
            char[] r8 = new char[r7]     // Catch:{ IOException -> 0x0063, all -> 0x005f }
        L_0x003f:
            int r9 = r6.read(r8, r1, r7)     // Catch:{ IOException -> 0x0063, all -> 0x005f }
            if (r9 <= 0) goto L_0x0049
            r5.append(r8, r1, r9)     // Catch:{ IOException -> 0x0063, all -> 0x005f }
            goto L_0x003f
        L_0x0049:
            com.facebook.internal.Utility r7 = com.facebook.internal.Utility.INSTANCE     // Catch:{ IOException -> 0x0063, all -> 0x005f }
            com.facebook.internal.Utility.closeQuietly(r6)     // Catch:{ IOException -> 0x0063, all -> 0x005f }
            goto L_0x0054
        L_0x004f:
            java.lang.String r6 = "Unexpected error while downloading an image."
            r5.append(r6)     // Catch:{ IOException -> 0x0063, all -> 0x005f }
        L_0x0054:
            com.facebook.FacebookException r6 = new com.facebook.FacebookException     // Catch:{ IOException -> 0x0063, all -> 0x005f }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0063, all -> 0x005f }
            r6.<init>((java.lang.String) r5)     // Catch:{ IOException -> 0x0063, all -> 0x005f }
            r5 = r0
            goto L_0x00b5
        L_0x005f:
            r11 = move-exception
            r0 = r4
            goto L_0x00cf
        L_0x0063:
            r5 = move-exception
            goto L_0x00db
        L_0x0066:
            java.lang.String r2 = "location"
            java.lang.String r2 = r3.getHeaderField(r2)     // Catch:{ IOException -> 0x00a6, all -> 0x00c0 }
            com.facebook.internal.Utility r4 = com.facebook.internal.Utility.INSTANCE     // Catch:{ IOException -> 0x00a6, all -> 0x00c0 }
            boolean r4 = com.facebook.internal.Utility.isNullOrEmpty((java.lang.String) r2)     // Catch:{ IOException -> 0x00a6, all -> 0x00c0 }
            if (r4 != 0) goto L_0x00a2
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ IOException -> 0x00a6, all -> 0x00c0 }
            com.facebook.internal.UrlRedirectCache r4 = com.facebook.internal.UrlRedirectCache.INSTANCE     // Catch:{ IOException -> 0x00a6, all -> 0x00c0 }
            android.net.Uri r4 = r11.getUri()     // Catch:{ IOException -> 0x00a6, all -> 0x00c0 }
            com.facebook.internal.UrlRedirectCache.cacheUriRedirect(r4, r2)     // Catch:{ IOException -> 0x00a6, all -> 0x00c0 }
            com.facebook.internal.ImageDownloader$DownloaderContext r4 = r10.removePendingRequest(r11)     // Catch:{ IOException -> 0x00a6, all -> 0x00c0 }
            if (r4 == 0) goto L_0x00a2
            boolean r5 = r4.isCancelled()     // Catch:{ IOException -> 0x00a6, all -> 0x00c0 }
            if (r5 != 0) goto L_0x00a2
            com.facebook.internal.ImageRequest r4 = r4.getRequest()     // Catch:{ IOException -> 0x00a6, all -> 0x00c0 }
            com.facebook.internal.ImageDownloader$RequestKey r5 = new com.facebook.internal.ImageDownloader$RequestKey     // Catch:{ IOException -> 0x00a6, all -> 0x00c0 }
            java.lang.String r6 = "redirectUri"
            kotlin.jvm.internal.m.e(r2, r6)     // Catch:{ IOException -> 0x00a6, all -> 0x00c0 }
            java.lang.Object r6 = r11.getTag()     // Catch:{ IOException -> 0x00a6, all -> 0x00c0 }
            r5.<init>(r2, r6)     // Catch:{ IOException -> 0x00a6, all -> 0x00c0 }
            r10.enqueueCacheRead(r4, r5, r1)     // Catch:{ IOException -> 0x00a6, all -> 0x00c0 }
        L_0x00a2:
            r5 = r0
            r6 = r5
            r2 = 0
            goto L_0x00b6
        L_0x00a6:
            r5 = move-exception
            r4 = r0
            r2 = 0
            goto L_0x00db
        L_0x00aa:
            com.facebook.internal.ImageResponseCache r4 = com.facebook.internal.ImageResponseCache.INSTANCE     // Catch:{ IOException -> 0x00c2, all -> 0x00c0 }
            java.io.InputStream r4 = com.facebook.internal.ImageResponseCache.interceptAndCacheImageStream(r3)     // Catch:{ IOException -> 0x00c2, all -> 0x00c0 }
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r4)     // Catch:{ IOException -> 0x0063, all -> 0x005f }
            r6 = r0
        L_0x00b5:
            r0 = r4
        L_0x00b6:
            com.facebook.internal.Utility r4 = com.facebook.internal.Utility.INSTANCE
            com.facebook.internal.Utility.closeQuietly(r0)
            com.facebook.internal.Utility.disconnectQuietly(r3)
            r0 = r5
            goto L_0x00e4
        L_0x00c0:
            r11 = move-exception
            goto L_0x00cf
        L_0x00c2:
            r5 = move-exception
            r4 = r0
            goto L_0x00db
        L_0x00c5:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch:{ IOException -> 0x00d8, all -> 0x00cd }
            java.lang.String r4 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            r3.<init>(r4)     // Catch:{ IOException -> 0x00d8, all -> 0x00cd }
            throw r3     // Catch:{ IOException -> 0x00d8, all -> 0x00cd }
        L_0x00cd:
            r11 = move-exception
            r3 = r0
        L_0x00cf:
            com.facebook.internal.Utility r1 = com.facebook.internal.Utility.INSTANCE
            com.facebook.internal.Utility.closeQuietly(r0)
            com.facebook.internal.Utility.disconnectQuietly(r3)
            throw r11
        L_0x00d8:
            r5 = move-exception
            r3 = r0
            r4 = r3
        L_0x00db:
            com.facebook.internal.Utility r6 = com.facebook.internal.Utility.INSTANCE
            com.facebook.internal.Utility.closeQuietly(r4)
            com.facebook.internal.Utility.disconnectQuietly(r3)
            r6 = r5
        L_0x00e4:
            if (r2 == 0) goto L_0x00e9
            r10.issueResponse(r11, r6, r0, r1)
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.ImageDownloader.download(com.facebook.internal.ImageDownloader$RequestKey):void");
    }

    public static final void downloadAsync(ImageRequest imageRequest) {
        if (imageRequest != null) {
            RequestKey requestKey = new RequestKey(imageRequest.getImageUri(), imageRequest.getCallerTag());
            Map<RequestKey, DownloaderContext> map = pendingRequests;
            synchronized (map) {
                DownloaderContext downloaderContext = map.get(requestKey);
                if (downloaderContext != null) {
                    downloaderContext.setRequest(imageRequest);
                    downloaderContext.setCancelled(false);
                    WorkQueue.WorkItem workItem = downloaderContext.getWorkItem();
                    if (workItem != null) {
                        workItem.moveToFront();
                        q qVar = q.f16189a;
                    }
                } else {
                    INSTANCE.enqueueCacheRead(imageRequest, requestKey, imageRequest.isCachedRedirectAllowed());
                    q qVar2 = q.f16189a;
                }
            }
        }
    }

    private final void enqueueCacheRead(ImageRequest imageRequest, RequestKey requestKey, boolean z10) {
        enqueueRequest(imageRequest, requestKey, cacheReadQueue, new CacheReadWorkItem(requestKey, z10));
    }

    private final void enqueueDownload(ImageRequest imageRequest, RequestKey requestKey) {
        enqueueRequest(imageRequest, requestKey, downloadQueue, new DownloadImageWorkItem(requestKey));
    }

    private final void enqueueRequest(ImageRequest imageRequest, RequestKey requestKey, WorkQueue workQueue, Runnable runnable) {
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            DownloaderContext downloaderContext = new DownloaderContext(imageRequest);
            map.put(requestKey, downloaderContext);
            downloaderContext.setWorkItem(WorkQueue.addActiveWorkItem$default(workQueue, runnable, false, 2, (Object) null));
            q qVar = q.f16189a;
        }
    }

    private final synchronized Handler getHandler() {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        return handler;
    }

    private final void issueResponse(RequestKey requestKey, Exception exc, Bitmap bitmap, boolean z10) {
        ImageRequest.Callback callback;
        Handler handler2;
        DownloaderContext removePendingRequest = removePendingRequest(requestKey);
        if (removePendingRequest != null && !removePendingRequest.isCancelled()) {
            ImageRequest request = removePendingRequest.getRequest();
            if (request == null) {
                callback = null;
            } else {
                callback = request.getCallback();
            }
            ImageRequest.Callback callback2 = callback;
            if (callback2 != null && (handler2 = getHandler()) != null) {
                handler2.post(new n(request, exc, z10, bitmap, callback2));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: issueResponse$lambda-4  reason: not valid java name */
    public static final void m102issueResponse$lambda4(ImageRequest imageRequest, Exception exc, boolean z10, Bitmap bitmap, ImageRequest.Callback callback) {
        m.f(imageRequest, "$request");
        callback.onCompleted(new ImageResponse(imageRequest, exc, z10, bitmap));
    }

    public static final void prioritizeRequest(ImageRequest imageRequest) {
        m.f(imageRequest, "request");
        RequestKey requestKey = new RequestKey(imageRequest.getImageUri(), imageRequest.getCallerTag());
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            DownloaderContext downloaderContext = map.get(requestKey);
            if (downloaderContext != null) {
                WorkQueue.WorkItem workItem = downloaderContext.getWorkItem();
                if (workItem != null) {
                    workItem.moveToFront();
                }
            }
            q qVar = q.f16189a;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void readFromCache(com.facebook.internal.ImageDownloader.RequestKey r5, boolean r6) {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
            if (r6 == 0) goto L_0x001a
            com.facebook.internal.UrlRedirectCache r6 = com.facebook.internal.UrlRedirectCache.INSTANCE
            android.net.Uri r6 = r5.getUri()
            android.net.Uri r6 = com.facebook.internal.UrlRedirectCache.getRedirectedUri(r6)
            if (r6 == 0) goto L_0x001a
            com.facebook.internal.ImageResponseCache r2 = com.facebook.internal.ImageResponseCache.INSTANCE
            java.io.InputStream r6 = com.facebook.internal.ImageResponseCache.getCachedImageStream(r6)
            if (r6 == 0) goto L_0x001b
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r6 = r1
        L_0x001b:
            if (r0 != 0) goto L_0x0027
            com.facebook.internal.ImageResponseCache r6 = com.facebook.internal.ImageResponseCache.INSTANCE
            android.net.Uri r6 = r5.getUri()
            java.io.InputStream r6 = com.facebook.internal.ImageResponseCache.getCachedImageStream(r6)
        L_0x0027:
            if (r6 == 0) goto L_0x0036
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r6)
            com.facebook.internal.Utility r3 = com.facebook.internal.Utility.INSTANCE
            com.facebook.internal.Utility.closeQuietly(r6)
            r4.issueResponse(r5, r1, r2, r0)
            goto L_0x004e
        L_0x0036:
            com.facebook.internal.ImageDownloader$DownloaderContext r6 = r4.removePendingRequest(r5)
            if (r6 != 0) goto L_0x003d
            goto L_0x0041
        L_0x003d:
            com.facebook.internal.ImageRequest r1 = r6.getRequest()
        L_0x0041:
            if (r6 == 0) goto L_0x004e
            boolean r6 = r6.isCancelled()
            if (r6 != 0) goto L_0x004e
            if (r1 == 0) goto L_0x004e
            r4.enqueueDownload(r1, r5)
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.ImageDownloader.readFromCache(com.facebook.internal.ImageDownloader$RequestKey, boolean):void");
    }

    private final DownloaderContext removePendingRequest(RequestKey requestKey) {
        DownloaderContext remove;
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            remove = map.remove(requestKey);
        }
        return remove;
    }

    public final Map<RequestKey, DownloaderContext> getPendingRequests() {
        return pendingRequests;
    }
}
