package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f3588a = (AudioAttributesImpl) versionedParcel.I(audioAttributesCompat.f3588a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        versionedParcel.m0(audioAttributesCompat.f3588a, 1);
    }
}
