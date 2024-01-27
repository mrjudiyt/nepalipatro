package androidx.media2.session;

import androidx.media2.common.MediaItem;
import androidx.media2.common.ParcelImplListSlice;
import androidx.versionedparcelable.VersionedParcel;

public final class LibraryResultParcelizer {
    public static LibraryResult read(VersionedParcel versionedParcel) {
        LibraryResult libraryResult = new LibraryResult();
        libraryResult.f3804a = versionedParcel.v(libraryResult.f3804a, 1);
        libraryResult.f3805b = versionedParcel.y(libraryResult.f3805b, 2);
        libraryResult.f3807d = (MediaItem) versionedParcel.I(libraryResult.f3807d, 3);
        libraryResult.f3808e = (MediaLibraryService$LibraryParams) versionedParcel.I(libraryResult.f3808e, 4);
        libraryResult.f3810g = (ParcelImplListSlice) versionedParcel.A(libraryResult.f3810g, 5);
        libraryResult.c();
        return libraryResult;
    }

    public static void write(LibraryResult libraryResult, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        libraryResult.d(versionedParcel.g());
        versionedParcel.Y(libraryResult.f3804a, 1);
        versionedParcel.b0(libraryResult.f3805b, 2);
        versionedParcel.m0(libraryResult.f3807d, 3);
        versionedParcel.m0(libraryResult.f3808e, 4);
        versionedParcel.d0(libraryResult.f3810g, 5);
    }
}
