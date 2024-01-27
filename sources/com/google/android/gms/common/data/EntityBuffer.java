package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {
    private boolean zaa = false;
    private ArrayList<Integer> zab;

    @KeepForSdk
    protected EntityBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    private final void zab() {
        synchronized (this) {
            if (!this.zaa) {
                int count = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                ArrayList<Integer> arrayList = new ArrayList<>();
                this.zab = arrayList;
                if (count > 0) {
                    arrayList.add(0);
                    String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                    String string = this.mDataHolder.getString(primaryDataMarkerColumn, 0, this.mDataHolder.getWindowIndex(0));
                    int i10 = 1;
                    while (i10 < count) {
                        int windowIndex = this.mDataHolder.getWindowIndex(i10);
                        String string2 = this.mDataHolder.getString(primaryDataMarkerColumn, i10, windowIndex);
                        if (string2 != null) {
                            if (!string2.equals(string)) {
                                this.zab.add(Integer.valueOf(i10));
                                string = string2;
                            }
                            i10++;
                        } else {
                            StringBuilder sb = new StringBuilder(String.valueOf(primaryDataMarkerColumn).length() + 78);
                            sb.append("Missing value for markerColumn: ");
                            sb.append(primaryDataMarkerColumn);
                            sb.append(", at row: ");
                            sb.append(i10);
                            sb.append(", for window: ");
                            sb.append(windowIndex);
                            throw new NullPointerException(sb.toString());
                        }
                    }
                }
                this.zaa = true;
            }
        }
    }

    @KeepForSdk
    public final T get(int i10) {
        int i11;
        int i12;
        zab();
        int zaa2 = zaa(i10);
        int i13 = 0;
        if (i10 >= 0 && i10 != this.zab.size()) {
            if (i10 == this.zab.size() - 1) {
                i12 = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                i11 = this.zab.get(i10).intValue();
            } else {
                i12 = this.zab.get(i10 + 1).intValue();
                i11 = this.zab.get(i10).intValue();
            }
            int i14 = i12 - i11;
            if (i14 == 1) {
                int zaa3 = zaa(i10);
                int windowIndex = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getWindowIndex(zaa3);
                String childDataMarkerColumn = getChildDataMarkerColumn();
                if (childDataMarkerColumn == null || this.mDataHolder.getString(childDataMarkerColumn, zaa3, windowIndex) != null) {
                    i13 = 1;
                }
            } else {
                i13 = i14;
            }
        }
        return getEntry(zaa2, i13);
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public String getChildDataMarkerColumn() {
        return null;
    }

    @KeepForSdk
    public int getCount() {
        zab();
        return this.zab.size();
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public abstract T getEntry(int i10, int i11);

    /* access modifiers changed from: protected */
    @KeepForSdk
    public abstract String getPrimaryDataMarkerColumn();

    /* access modifiers changed from: package-private */
    public final int zaa(int i10) {
        if (i10 >= 0 && i10 < this.zab.size()) {
            return this.zab.get(i10).intValue();
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Position ");
        sb.append(i10);
        sb.append(" is out of bounds for this buffer");
        throw new IllegalArgumentException(sb.toString());
    }
}
