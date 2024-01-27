package androidx.media2.session;

import androidx.versionedparcelable.VersionedParcel;

public final class LibraryParamsParcelizer {
    public static MediaLibraryService$LibraryParams read(VersionedParcel versionedParcel) {
        MediaLibraryService$LibraryParams mediaLibraryService$LibraryParams = new MediaLibraryService$LibraryParams();
        mediaLibraryService$LibraryParams.f3817a = versionedParcel.k(mediaLibraryService$LibraryParams.f3817a, 1);
        mediaLibraryService$LibraryParams.f3818b = versionedParcel.v(mediaLibraryService$LibraryParams.f3818b, 2);
        mediaLibraryService$LibraryParams.f3819c = versionedParcel.v(mediaLibraryService$LibraryParams.f3819c, 3);
        mediaLibraryService$LibraryParams.f3820d = versionedParcel.v(mediaLibraryService$LibraryParams.f3820d, 4);
        return mediaLibraryService$LibraryParams;
    }

    public static void write(MediaLibraryService$LibraryParams mediaLibraryService$LibraryParams, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        versionedParcel.O(mediaLibraryService$LibraryParams.f3817a, 1);
        versionedParcel.Y(mediaLibraryService$LibraryParams.f3818b, 2);
        versionedParcel.Y(mediaLibraryService$LibraryParams.f3819c, 3);
        versionedParcel.Y(mediaLibraryService$LibraryParams.f3820d, 4);
    }
}
