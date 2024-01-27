package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    private final String f335h;

    /* renamed from: i  reason: collision with root package name */
    private final CharSequence f336i;

    /* renamed from: j  reason: collision with root package name */
    private final CharSequence f337j;

    /* renamed from: k  reason: collision with root package name */
    private final CharSequence f338k;

    /* renamed from: l  reason: collision with root package name */
    private final Bitmap f339l;

    /* renamed from: m  reason: collision with root package name */
    private final Uri f340m;

    /* renamed from: n  reason: collision with root package name */
    private final Bundle f341n;

    /* renamed from: o  reason: collision with root package name */
    private final Uri f342o;

    /* renamed from: p  reason: collision with root package name */
    private MediaDescription f343p;

    class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (Build.VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.b(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    private static class b {
        static MediaDescription a(MediaDescription.Builder builder) {
            return builder.build();
        }

        static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        static CharSequence c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        static Bundle d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        static Bitmap e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        static Uri f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        static String g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        static CharSequence h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        static CharSequence i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        static void j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        static void m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        static void n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        static void o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    private static class c {
        static Uri a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private String f344a;

        /* renamed from: b  reason: collision with root package name */
        private CharSequence f345b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f346c;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f347d;

        /* renamed from: e  reason: collision with root package name */
        private Bitmap f348e;

        /* renamed from: f  reason: collision with root package name */
        private Uri f349f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f350g;

        /* renamed from: h  reason: collision with root package name */
        private Uri f351h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f344a, this.f345b, this.f346c, this.f347d, this.f348e, this.f349f, this.f350g, this.f351h);
        }

        public d b(CharSequence charSequence) {
            this.f347d = charSequence;
            return this;
        }

        public d c(Bundle bundle) {
            this.f350g = bundle;
            return this;
        }

        public d d(Bitmap bitmap) {
            this.f348e = bitmap;
            return this;
        }

        public d e(Uri uri) {
            this.f349f = uri;
            return this;
        }

        public d f(String str) {
            this.f344a = str;
            return this;
        }

        public d g(Uri uri) {
            this.f351h = uri;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.f346c = charSequence;
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f345b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f335h = str;
        this.f336i = charSequence;
        this.f337j = charSequence2;
        this.f338k = charSequence3;
        this.f339l = bitmap;
        this.f340m = uri;
        this.f341n = bundle;
        this.f342o = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat b(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L_0x0083
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0083
            android.support.v4.media.MediaDescriptionCompat$d r2 = new android.support.v4.media.MediaDescriptionCompat$d
            r2.<init>()
            android.media.MediaDescription r9 = (android.media.MediaDescription) r9
            java.lang.String r3 = android.support.v4.media.MediaDescriptionCompat.b.g(r9)
            r2.f(r3)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.b.i(r9)
            r2.i(r3)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.b.h(r9)
            r2.h(r3)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.b.c(r9)
            r2.b(r3)
            android.graphics.Bitmap r3 = android.support.v4.media.MediaDescriptionCompat.b.e(r9)
            r2.d(r3)
            android.net.Uri r3 = android.support.v4.media.MediaDescriptionCompat.b.f(r9)
            r2.e(r3)
            android.os.Bundle r3 = android.support.v4.media.MediaDescriptionCompat.b.d(r9)
            if (r3 == 0) goto L_0x0044
            android.os.Bundle r3 = android.support.v4.media.session.MediaSessionCompat.p(r3)
        L_0x0044:
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L_0x004f
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L_0x0050
        L_0x004f:
            r5 = r0
        L_0x0050:
            if (r5 == 0) goto L_0x0068
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L_0x0062
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L_0x0062
            goto L_0x0069
        L_0x0062:
            r3.remove(r4)
            r3.remove(r6)
        L_0x0068:
            r0 = r3
        L_0x0069:
            r2.c(r0)
            if (r5 == 0) goto L_0x0072
            r2.g(r5)
            goto L_0x007d
        L_0x0072:
            r0 = 23
            if (r1 < r0) goto L_0x007d
            android.net.Uri r0 = android.support.v4.media.MediaDescriptionCompat.c.a(r9)
            r2.g(r0)
        L_0x007d:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.a()
            r0.f343p = r9
        L_0x0083:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.b(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public CharSequence c() {
        return this.f338k;
    }

    public Bitmap d() {
        return this.f339l;
    }

    public int describeContents() {
        return 0;
    }

    public Uri e() {
        return this.f340m;
    }

    public Object f() {
        int i10;
        MediaDescription mediaDescription = this.f343p;
        if (mediaDescription != null || (i10 = Build.VERSION.SDK_INT) < 21) {
            return mediaDescription;
        }
        MediaDescription.Builder b10 = b.b();
        b.n(b10, this.f335h);
        b.p(b10, this.f336i);
        b.o(b10, this.f337j);
        b.j(b10, this.f338k);
        b.l(b10, this.f339l);
        b.m(b10, this.f340m);
        Bundle bundle = this.f341n;
        if (i10 < 23 && this.f342o != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f342o);
        }
        b.k(b10, bundle);
        if (i10 >= 23) {
            c.b(b10, this.f342o);
        }
        MediaDescription a10 = b.a(b10);
        this.f343p = a10;
        return a10;
    }

    public String g() {
        return this.f335h;
    }

    public CharSequence h() {
        return this.f337j;
    }

    public CharSequence i() {
        return this.f336i;
    }

    public String toString() {
        return this.f336i + ", " + this.f337j + ", " + this.f338k;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f335h);
            TextUtils.writeToParcel(this.f336i, parcel, i10);
            TextUtils.writeToParcel(this.f337j, parcel, i10);
            TextUtils.writeToParcel(this.f338k, parcel, i10);
            parcel.writeParcelable(this.f339l, i10);
            parcel.writeParcelable(this.f340m, i10);
            parcel.writeBundle(this.f341n);
            parcel.writeParcelable(this.f342o, i10);
            return;
        }
        ((MediaDescription) f()).writeToParcel(parcel, i10);
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f335h = parcel.readString();
        this.f336i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f337j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f338k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f339l = (Bitmap) parcel.readParcelable(classLoader);
        this.f340m = (Uri) parcel.readParcelable(classLoader);
        this.f341n = parcel.readBundle(classLoader);
        this.f342o = (Uri) parcel.readParcelable(classLoader);
    }
}
