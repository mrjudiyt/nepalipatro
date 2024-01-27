package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f3593a = versionedParcel.v(audioAttributesImplBase.f3593a, 1);
        audioAttributesImplBase.f3594b = versionedParcel.v(audioAttributesImplBase.f3594b, 2);
        audioAttributesImplBase.f3595c = versionedParcel.v(audioAttributesImplBase.f3595c, 3);
        audioAttributesImplBase.f3596d = versionedParcel.v(audioAttributesImplBase.f3596d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        versionedParcel.Y(audioAttributesImplBase.f3593a, 1);
        versionedParcel.Y(audioAttributesImplBase.f3594b, 2);
        versionedParcel.Y(audioAttributesImplBase.f3595c, 3);
        versionedParcel.Y(audioAttributesImplBase.f3596d, 4);
    }
}
