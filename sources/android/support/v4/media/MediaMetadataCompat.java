package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.Set;

@SuppressLint({"BanParcelableUsage"})
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new a();

    /* renamed from: k  reason: collision with root package name */
    static final androidx.collection.a<String, Integer> f352k;

    /* renamed from: l  reason: collision with root package name */
    private static final String[] f353l = {"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};

    /* renamed from: m  reason: collision with root package name */
    private static final String[] f354m = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};

    /* renamed from: n  reason: collision with root package name */
    private static final String[] f355n = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};

    /* renamed from: h  reason: collision with root package name */
    final Bundle f356h;

    /* renamed from: i  reason: collision with root package name */
    private MediaMetadata f357i;

    /* renamed from: j  reason: collision with root package name */
    private MediaDescriptionCompat f358j;

    class a implements Parcelable.Creator<MediaMetadataCompat> {
        a() {
        }

        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        /* renamed from: b */
        public MediaMetadataCompat[] newArray(int i10) {
            return new MediaMetadataCompat[i10];
        }
    }

    static {
        androidx.collection.a<String, Integer> aVar = new androidx.collection.a<>();
        f352k = aVar;
        aVar.put("android.media.metadata.TITLE", 1);
        aVar.put("android.media.metadata.ARTIST", 1);
        aVar.put("android.media.metadata.DURATION", 0);
        aVar.put("android.media.metadata.ALBUM", 1);
        aVar.put("android.media.metadata.AUTHOR", 1);
        aVar.put("android.media.metadata.WRITER", 1);
        aVar.put("android.media.metadata.COMPOSER", 1);
        aVar.put("android.media.metadata.COMPILATION", 1);
        aVar.put("android.media.metadata.DATE", 1);
        aVar.put("android.media.metadata.YEAR", 0);
        aVar.put("android.media.metadata.GENRE", 1);
        aVar.put("android.media.metadata.TRACK_NUMBER", 0);
        aVar.put("android.media.metadata.NUM_TRACKS", 0);
        aVar.put("android.media.metadata.DISC_NUMBER", 0);
        aVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        aVar.put("android.media.metadata.ART", 2);
        aVar.put("android.media.metadata.ART_URI", 1);
        aVar.put("android.media.metadata.ALBUM_ART", 2);
        aVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        aVar.put("android.media.metadata.USER_RATING", 3);
        aVar.put("android.media.metadata.RATING", 3);
        aVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        aVar.put("android.media.metadata.DISPLAY_ICON", 2);
        aVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        aVar.put("android.media.metadata.MEDIA_ID", 1);
        aVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        aVar.put("android.media.metadata.MEDIA_URI", 1);
        aVar.put("android.media.metadata.ADVERTISEMENT", 0);
        aVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f356h = bundle2;
        MediaSessionCompat.a(bundle2);
    }

    public static MediaMetadataCompat c(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f357i = mediaMetadata;
        return createFromParcel;
    }

    public boolean b(String str) {
        return this.f356h.containsKey(str);
    }

    public Bitmap d(String str) {
        try {
            return (Bitmap) this.f356h.getParcelable(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public Bundle e() {
        return new Bundle(this.f356h);
    }

    public MediaDescriptionCompat f() {
        Uri uri;
        Bitmap bitmap;
        Uri uri2;
        MediaDescriptionCompat mediaDescriptionCompat = this.f358j;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String j10 = j("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence k10 = k("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(k10)) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < 3) {
                String[] strArr = f353l;
                if (i11 >= strArr.length) {
                    break;
                }
                int i12 = i11 + 1;
                CharSequence k11 = k(strArr[i11]);
                if (!TextUtils.isEmpty(k11)) {
                    charSequenceArr[i10] = k11;
                    i10++;
                }
                i11 = i12;
            }
        } else {
            charSequenceArr[0] = k10;
            charSequenceArr[1] = k("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = k("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i13 = 0;
        while (true) {
            String[] strArr2 = f354m;
            uri = null;
            if (i13 >= strArr2.length) {
                bitmap = null;
                break;
            }
            bitmap = d(strArr2[i13]);
            if (bitmap != null) {
                break;
            }
            i13++;
        }
        int i14 = 0;
        while (true) {
            String[] strArr3 = f355n;
            if (i14 >= strArr3.length) {
                uri2 = null;
                break;
            }
            String j11 = j(strArr3[i14]);
            if (!TextUtils.isEmpty(j11)) {
                uri2 = Uri.parse(j11);
                break;
            }
            i14++;
        }
        String j12 = j("android.media.metadata.MEDIA_URI");
        if (!TextUtils.isEmpty(j12)) {
            uri = Uri.parse(j12);
        }
        MediaDescriptionCompat.d dVar = new MediaDescriptionCompat.d();
        dVar.f(j10);
        dVar.i(charSequenceArr[0]);
        dVar.h(charSequenceArr[1]);
        dVar.b(charSequenceArr[2]);
        dVar.d(bitmap);
        dVar.e(uri2);
        dVar.g(uri);
        Bundle bundle = new Bundle();
        if (this.f356h.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", g("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (this.f356h.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", g("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if (!bundle.isEmpty()) {
            dVar.c(bundle);
        }
        MediaDescriptionCompat a10 = dVar.a();
        this.f358j = a10;
        return a10;
    }

    public long g(String str) {
        return this.f356h.getLong(str, 0);
    }

    public Object h() {
        if (this.f357i == null && Build.VERSION.SDK_INT >= 21) {
            Parcel obtain = Parcel.obtain();
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.f357i = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        return this.f357i;
    }

    public RatingCompat i(String str) {
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                return RatingCompat.b(this.f356h.getParcelable(str));
            }
            return (RatingCompat) this.f356h.getParcelable(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public String j(String str) {
        CharSequence charSequence = this.f356h.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public CharSequence k(String str) {
        return this.f356h.getCharSequence(str);
    }

    public Set<String> l() {
        return this.f356h.keySet();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.f356h);
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Bundle f359a;

        public b() {
            this.f359a = new Bundle();
        }

        private Bitmap f(Bitmap bitmap, int i10) {
            float f10 = (float) i10;
            float min = Math.min(f10 / ((float) bitmap.getWidth()), f10 / ((float) bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), true);
        }

        public MediaMetadataCompat a() {
            return new MediaMetadataCompat(this.f359a);
        }

        public b b(String str, Bitmap bitmap) {
            androidx.collection.a<String, Integer> aVar = MediaMetadataCompat.f352k;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 2) {
                this.f359a.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
        }

        public b c(String str, long j10) {
            androidx.collection.a<String, Integer> aVar = MediaMetadataCompat.f352k;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 0) {
                this.f359a.putLong(str, j10);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
        }

        public b d(String str, RatingCompat ratingCompat) {
            androidx.collection.a<String, Integer> aVar = MediaMetadataCompat.f352k;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 3) {
                if (Build.VERSION.SDK_INT >= 19) {
                    this.f359a.putParcelable(str, (Parcelable) ratingCompat.d());
                } else {
                    this.f359a.putParcelable(str, ratingCompat);
                }
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Rating");
        }

        public b e(String str, String str2) {
            androidx.collection.a<String, Integer> aVar = MediaMetadataCompat.f352k;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 1) {
                this.f359a.putCharSequence(str, str2);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
        }

        public b(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.f356h);
            this.f359a = bundle;
            MediaSessionCompat.a(bundle);
        }

        public b(MediaMetadataCompat mediaMetadataCompat, int i10) {
            this(mediaMetadataCompat);
            for (String str : this.f359a.keySet()) {
                Object obj = this.f359a.get(str);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i10 || bitmap.getWidth() > i10) {
                        b(str, f(bitmap, i10));
                    }
                }
            }
        }
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f356h = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}
