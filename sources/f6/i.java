package f6;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final ClassLoader f14572a = i.class.getClassLoader();

    private i() {
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
        }
    }

    public static void c(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
