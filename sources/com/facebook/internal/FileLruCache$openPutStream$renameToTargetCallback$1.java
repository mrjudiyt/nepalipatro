package com.facebook.internal;

import com.facebook.internal.FileLruCache;
import java.io.File;

/* compiled from: FileLruCache.kt */
public final class FileLruCache$openPutStream$renameToTargetCallback$1 implements FileLruCache.StreamCloseCallback {
    final /* synthetic */ File $buffer;
    final /* synthetic */ long $bufferFileCreateTime;
    final /* synthetic */ String $key;
    final /* synthetic */ FileLruCache this$0;

    FileLruCache$openPutStream$renameToTargetCallback$1(long j10, FileLruCache fileLruCache, File file, String str) {
        this.$bufferFileCreateTime = j10;
        this.this$0 = fileLruCache;
        this.$buffer = file;
        this.$key = str;
    }

    public void onClose() {
        if (this.$bufferFileCreateTime < this.this$0.lastClearCacheTime.get()) {
            this.$buffer.delete();
        } else {
            this.this$0.renameToTargetAndTrim(this.$key, this.$buffer);
        }
    }
}
