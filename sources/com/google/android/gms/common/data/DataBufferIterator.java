package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class DataBufferIterator<T> implements Iterator<T> {
    protected final DataBuffer<T> zaa;
    protected int zab = -1;

    public DataBufferIterator(DataBuffer<T> dataBuffer) {
        this.zaa = (DataBuffer) Preconditions.checkNotNull(dataBuffer);
    }

    public final boolean hasNext() {
        return this.zab < this.zaa.getCount() + -1;
    }

    public T next() {
        if (hasNext()) {
            DataBuffer<T> dataBuffer = this.zaa;
            int i10 = this.zab + 1;
            this.zab = i10;
            return dataBuffer.get(i10);
        }
        int i11 = this.zab;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Cannot advance the iterator beyond ");
        sb.append(i11);
        throw new NoSuchElementException(sb.toString());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
