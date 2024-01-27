package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2326a = versionedParcel.v(iconCompat.f2326a, 1);
        iconCompat.f2328c = versionedParcel.m(iconCompat.f2328c, 2);
        iconCompat.f2329d = versionedParcel.A(iconCompat.f2329d, 3);
        iconCompat.f2330e = versionedParcel.v(iconCompat.f2330e, 4);
        iconCompat.f2331f = versionedParcel.v(iconCompat.f2331f, 5);
        iconCompat.f2332g = (ColorStateList) versionedParcel.A(iconCompat.f2332g, 6);
        iconCompat.f2334i = versionedParcel.E(iconCompat.f2334i, 7);
        iconCompat.f2335j = versionedParcel.E(iconCompat.f2335j, 8);
        iconCompat.c();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.K(true, true);
        iconCompat.d(versionedParcel.g());
        int i10 = iconCompat.f2326a;
        if (-1 != i10) {
            versionedParcel.Y(i10, 1);
        }
        byte[] bArr = iconCompat.f2328c;
        if (bArr != null) {
            versionedParcel.Q(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2329d;
        if (parcelable != null) {
            versionedParcel.d0(parcelable, 3);
        }
        int i11 = iconCompat.f2330e;
        if (i11 != 0) {
            versionedParcel.Y(i11, 4);
        }
        int i12 = iconCompat.f2331f;
        if (i12 != 0) {
            versionedParcel.Y(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f2332g;
        if (colorStateList != null) {
            versionedParcel.d0(colorStateList, 6);
        }
        String str = iconCompat.f2334i;
        if (str != null) {
            versionedParcel.h0(str, 7);
        }
        String str2 = iconCompat.f2335j;
        if (str2 != null) {
            versionedParcel.h0(str2, 8);
        }
    }
}
