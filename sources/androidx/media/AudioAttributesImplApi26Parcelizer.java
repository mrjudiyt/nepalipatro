package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f3590a = (AudioAttributes) versionedParcel.A(audioAttributesImplApi26.f3590a, 1);
        audioAttributesImplApi26.f3591b = versionedParcel.v(audioAttributesImplApi26.f3591b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, VersionedParcel versionedParcel) {
        versionedParcel.K(false, false);
        versionedParcel.d0(audioAttributesImplApi26.f3590a, 1);
        versionedParcel.Y(audioAttributesImplApi26.f3591b, 2);
    }
}
