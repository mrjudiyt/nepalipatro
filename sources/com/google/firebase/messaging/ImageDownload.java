package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class ImageDownload implements Closeable {
    private static final int MAX_IMAGE_SIZE_BYTES = 1048576;
    private volatile Future<?> future;
    private Task<Bitmap> task;
    private final URL url;

    private ImageDownload(URL url2) {
        this.url = url2;
    }

    private byte[] blockingDownloadBytes() {
        URLConnection openConnection = this.url.openConnection();
        if (openConnection.getContentLength() <= MAX_IMAGE_SIZE_BYTES) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] byteArray = ByteStreams.toByteArray(ByteStreams.limit(inputStream, 1048577));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable(Constants.TAG, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Downloaded ");
                    sb.append(byteArray.length);
                    sb.append(" bytes from ");
                    sb.append(this.url);
                }
                if (byteArray.length <= MAX_IMAGE_SIZE_BYTES) {
                    return byteArray;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    public static ImageDownload create(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new ImageDownload(new URL(str));
        } catch (MalformedURLException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Not downloading image, bad URL: ");
            sb.append(str);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(blockingDownload());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public Bitmap blockingDownload() {
        if (Log.isLoggable(Constants.TAG, 4)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Starting download of: ");
            sb.append(this.url);
        }
        byte[] blockingDownloadBytes = blockingDownloadBytes();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(blockingDownloadBytes, 0, blockingDownloadBytes.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Successfully downloaded image: ");
                sb2.append(this.url);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.url);
    }

    public void close() {
        this.future.cancel(true);
    }

    public Task<Bitmap> getTask() {
        return (Task) Preconditions.checkNotNull(this.task);
    }

    public void start(ExecutorService executorService) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.future = executorService.submit(new w(this, taskCompletionSource));
        this.task = taskCompletionSource.getTask();
    }
}
