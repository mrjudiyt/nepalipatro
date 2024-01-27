package com.google.android.gms.common.api;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataBuffer;
import java.util.Iterator;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class DataBufferResponse<T, R extends AbstractDataBuffer<T> & Result> extends Response<R> implements DataBuffer<T> {
    @KeepForSdk
    public DataBufferResponse() {
    }

    public final void close() {
        ((AbstractDataBuffer) getResult()).close();
    }

    public final T get(int i10) {
        return ((AbstractDataBuffer) getResult()).get(i10);
    }

    public final int getCount() {
        return ((AbstractDataBuffer) getResult()).getCount();
    }

    public final Bundle getMetadata() {
        return ((AbstractDataBuffer) getResult()).getMetadata();
    }

    public final boolean isClosed() {
        return ((AbstractDataBuffer) getResult()).isClosed();
    }

    public final Iterator<T> iterator() {
        return ((AbstractDataBuffer) getResult()).iterator();
    }

    public final void release() {
        ((AbstractDataBuffer) getResult()).release();
    }

    public final Iterator<T> singleRefIterator() {
        return ((AbstractDataBuffer) getResult()).singleRefIterator();
    }

    @KeepForSdk
    public DataBufferResponse(R r10) {
        super(r10);
    }
}
