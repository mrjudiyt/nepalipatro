package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f3590a = (AudioAttributes) versionedParcel.A(audioAttributesImplApi21.f3590a, 1);
        audioAttributesImplApi21.f3591b = versionedParcel.v(audioAttributesImplApi21.f3591b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        versionedParcel.d0(audioAttributesImplApi21.f3590a, 1);
        versionedParcel.Y(audioAttributesImplApi21.f3591b, 2);
    }
}
