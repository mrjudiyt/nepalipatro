package androidx.media2.common;

import android.graphics.Bitmap;
import androidx.media2.common.MediaMetadata;
import androidx.versionedparcelable.VersionedParcel;

public final class BitmapEntryParcelizer {
    public static MediaMetadata.BitmapEntry read(VersionedParcel versionedParcel) {
        MediaMetadata.BitmapEntry bitmapEntry = new MediaMetadata.BitmapEntry();
        bitmapEntry.f3755a = versionedParcel.E(bitmapEntry.f3755a, 1);
        bitmapEntry.f3756b = (Bitmap) versionedParcel.A(bitmapEntry.f3756b, 2);
        return bitmapEntry;
    }

    public static void write(MediaMetadata.BitmapEntry bitmapEntry, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        versionedParcel.h0(bitmapEntry.f3755a, 1);
        versionedParcel.d0(bitmapEntry.f3756b, 2);
    }
}
