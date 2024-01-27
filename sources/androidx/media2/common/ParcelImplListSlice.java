package androidx.media2.common;

import android.annotation.SuppressLint;
import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.List;
import java.util.Objects;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImplListSlice implements Parcelable {
    public static final Parcelable.Creator<ParcelImplListSlice> CREATOR = new b();

    /* renamed from: h  reason: collision with root package name */
    final List<ParcelImpl> f3758h;

    class a extends Binder {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f3759h;

        a(int i10) {
            this.f3759h = i10;
        }

        /* access modifiers changed from: protected */
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            int readInt = parcel.readInt();
            while (readInt < this.f3759h && parcel2.dataSize() < 65536) {
                parcel2.writeInt(1);
                parcel2.writeParcelable(ParcelImplListSlice.this.f3758h.get(readInt), i11);
                readInt++;
            }
            if (readInt < this.f3759h) {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    class b implements Parcelable.Creator<ParcelImplListSlice> {
        b() {
        }

        /* renamed from: a */
        public ParcelImplListSlice createFromParcel(Parcel parcel) {
            return new ParcelImplListSlice(parcel);
        }

        /* renamed from: b */
        public ParcelImplListSlice[] newArray(int i10) {
            return new ParcelImplListSlice[i10];
        }
    }

    public ParcelImplListSlice(List<ParcelImpl> list) {
        Objects.requireNonNull(list, "list shouldn't be null");
        this.f3758h = list;
    }

    public List<ParcelImpl> b() {
        return this.f3758h;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f3758h.size();
        parcel.writeInt(size);
        if (size > 0) {
            int i11 = 0;
            while (i11 < size && i11 < 1 && parcel.dataSize() < 65536) {
                parcel.writeInt(1);
                parcel.writeParcelable(this.f3758h.get(i11), i10);
                i11++;
            }
            if (i11 < size) {
                parcel.writeInt(0);
                parcel.writeStrongBinder(new a(size));
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:25|26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r8 = new java.lang.StringBuilder();
        r8.append("Failure retrieving array; only received ");
        r8.append(r2);
        r8.append(" of ");
        r8.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        r4.recycle();
        r3.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    ParcelImplListSlice(android.os.Parcel r8) {
        /*
            r7 = this;
            r7.<init>()
            int r0 = r8.readInt()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r7.f3758h = r1
            if (r0 > 0) goto L_0x0011
            return
        L_0x0011:
            r1 = 0
            r2 = 0
        L_0x0013:
            if (r2 >= r0) goto L_0x0030
            int r3 = r8.readInt()
            if (r3 != 0) goto L_0x001c
            goto L_0x0030
        L_0x001c:
            java.lang.Class<androidx.versionedparcelable.ParcelImpl> r3 = androidx.versionedparcelable.ParcelImpl.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            android.os.Parcelable r3 = r8.readParcelable(r3)
            androidx.versionedparcelable.ParcelImpl r3 = (androidx.versionedparcelable.ParcelImpl) r3
            java.util.List<androidx.versionedparcelable.ParcelImpl> r4 = r7.f3758h
            r4.add(r3)
            int r2 = r2 + 1
            goto L_0x0013
        L_0x0030:
            if (r2 < r0) goto L_0x0033
            return
        L_0x0033:
            android.os.IBinder r8 = r8.readStrongBinder()
        L_0x0037:
            if (r2 >= r0) goto L_0x008f
            android.os.Parcel r3 = android.os.Parcel.obtain()
            android.os.Parcel r4 = android.os.Parcel.obtain()
            r3.writeInt(r2)     // Catch:{ all -> 0x0087 }
            r5 = 1
            r8.transact(r5, r3, r4, r1)     // Catch:{ RemoteException -> 0x006b }
        L_0x0048:
            if (r2 >= r0) goto L_0x0064
            int r5 = r4.readInt()     // Catch:{ all -> 0x0087 }
            if (r5 == 0) goto L_0x0064
            java.lang.Class<androidx.versionedparcelable.ParcelImpl> r5 = androidx.versionedparcelable.ParcelImpl.class
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ all -> 0x0087 }
            android.os.Parcelable r5 = r4.readParcelable(r5)     // Catch:{ all -> 0x0087 }
            androidx.versionedparcelable.ParcelImpl r5 = (androidx.versionedparcelable.ParcelImpl) r5     // Catch:{ all -> 0x0087 }
            java.util.List<androidx.versionedparcelable.ParcelImpl> r6 = r7.f3758h     // Catch:{ all -> 0x0087 }
            r6.add(r5)     // Catch:{ all -> 0x0087 }
            int r2 = r2 + 1
            goto L_0x0048
        L_0x0064:
            r4.recycle()
            r3.recycle()
            goto L_0x0037
        L_0x006b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            r8.<init>()     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = "Failure retrieving array; only received "
            r8.append(r1)     // Catch:{ all -> 0x0087 }
            r8.append(r2)     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = " of "
            r8.append(r1)     // Catch:{ all -> 0x0087 }
            r8.append(r0)     // Catch:{ all -> 0x0087 }
            r4.recycle()
            r3.recycle()
            return
        L_0x0087:
            r8 = move-exception
            r4.recycle()
            r3.recycle()
            throw r8
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media2.common.ParcelImplListSlice.<init>(android.os.Parcel):void");
    }
}
