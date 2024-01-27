package androidx.media2.common;

import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.collection.a;
import androidx.versionedparcelable.CustomVersionedParcelable;
import androidx.versionedparcelable.ParcelImpl;
import j1.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class MediaMetadata extends CustomVersionedParcelable {

    /* renamed from: d  reason: collision with root package name */
    static final a<String, Integer> f3751d;

    /* renamed from: a  reason: collision with root package name */
    Bundle f3752a;

    /* renamed from: b  reason: collision with root package name */
    Bundle f3753b;

    /* renamed from: c  reason: collision with root package name */
    ParcelImplListSlice f3754c;

    static final class BitmapEntry implements b {

        /* renamed from: a  reason: collision with root package name */
        String f3755a;

        /* renamed from: b  reason: collision with root package name */
        Bitmap f3756b;

        BitmapEntry() {
        }

        private int d(Bitmap bitmap) {
            return androidx.core.graphics.a.a(bitmap);
        }

        /* access modifiers changed from: package-private */
        public Bitmap c() {
            return this.f3756b;
        }

        /* access modifiers changed from: package-private */
        public String e() {
            return this.f3755a;
        }

        BitmapEntry(String str, Bitmap bitmap) {
            this.f3755a = str;
            this.f3756b = bitmap;
            int d10 = d(bitmap);
            if (d10 > 262144) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                double sqrt = Math.sqrt(262144.0d / ((double) d10));
                int i10 = (int) (((double) width) * sqrt);
                int i11 = (int) (((double) height) * sqrt);
                StringBuilder sb = new StringBuilder();
                sb.append("Scaling large bitmap of ");
                sb.append(width);
                sb.append("x");
                sb.append(height);
                sb.append(" into ");
                sb.append(i10);
                sb.append("x");
                sb.append(i11);
                this.f3756b = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
            }
        }
    }

    static {
        a<String, Integer> aVar = new a<>();
        f3751d = aVar;
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
        aVar.put("android.media.metadata.MEDIA_URI", 1);
        aVar.put("androidx.media2.metadata.RADIO_FREQUENCY", 4);
        aVar.put("androidx.media2.metadata.RADIO_PROGRAM_NAME", 1);
        aVar.put("androidx.media2.metadata.BROWSABLE", 0);
        aVar.put("androidx.media2.metadata.PLAYABLE", 0);
        aVar.put("androidx.media2.metadata.ADVERTISEMENT", 0);
        aVar.put("androidx.media2.metadata.DOWNLOAD_STATUS", 0);
        aVar.put("androidx.media2.metadata.EXTRAS", 5);
    }

    MediaMetadata() {
    }

    public void c() {
        Bundle bundle = this.f3753b;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f3752a = bundle;
        ParcelImplListSlice parcelImplListSlice = this.f3754c;
        if (parcelImplListSlice != null) {
            for (ParcelImpl a10 : parcelImplListSlice.b()) {
                BitmapEntry bitmapEntry = (BitmapEntry) MediaParcelUtils.a(a10);
                this.f3752a.putParcelable(bitmapEntry.e(), bitmapEntry.c());
            }
        }
    }

    public void d(boolean z10) {
        synchronized (this.f3752a) {
            if (this.f3753b == null) {
                this.f3753b = new Bundle(this.f3752a);
                ArrayList arrayList = new ArrayList();
                for (String str : this.f3752a.keySet()) {
                    Object obj = this.f3752a.get(str);
                    if (obj instanceof Bitmap) {
                        arrayList.add(MediaParcelUtils.b(new BitmapEntry(str, (Bitmap) obj)));
                        this.f3753b.remove(str);
                    }
                }
                this.f3754c = new ParcelImplListSlice((List<ParcelImpl>) arrayList);
            }
        }
    }

    public boolean e(String str) {
        Objects.requireNonNull(str, "key shouldn't be null");
        return this.f3752a.containsKey(str);
    }

    public long f(String str) {
        Objects.requireNonNull(str, "key shouldn't be null");
        return this.f3752a.getLong(str, 0);
    }

    public String g(String str) {
        Objects.requireNonNull(str, "key shouldn't be null");
        CharSequence charSequence = this.f3752a.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public String toString() {
        return this.f3752a.toString();
    }
}
