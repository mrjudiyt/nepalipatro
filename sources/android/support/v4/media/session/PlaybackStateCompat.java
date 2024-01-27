package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    final int f461h;

    /* renamed from: i  reason: collision with root package name */
    final long f462i;

    /* renamed from: j  reason: collision with root package name */
    final long f463j;

    /* renamed from: k  reason: collision with root package name */
    final float f464k;

    /* renamed from: l  reason: collision with root package name */
    final long f465l;

    /* renamed from: m  reason: collision with root package name */
    final int f466m;

    /* renamed from: n  reason: collision with root package name */
    final CharSequence f467n;

    /* renamed from: o  reason: collision with root package name */
    final long f468o;

    /* renamed from: p  reason: collision with root package name */
    List<CustomAction> f469p;

    /* renamed from: q  reason: collision with root package name */
    final long f470q;

    /* renamed from: r  reason: collision with root package name */
    final Bundle f471r;

    /* renamed from: s  reason: collision with root package name */
    private PlaybackState f472s;

    class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    private static class b {
        static void a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        static PlaybackState c(PlaybackState.Builder builder) {
            return builder.build();
        }

        static PlaybackState.Builder d() {
            return new PlaybackState.Builder();
        }

        static PlaybackState.CustomAction.Builder e(String str, CharSequence charSequence, int i10) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i10);
        }

        static String f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        static long g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        static long h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        static long i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        static List<PlaybackState.CustomAction> j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        static CharSequence k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        static Bundle l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        static int m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        static long n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        static CharSequence o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        static float p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        static long q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        static int r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        static void s(PlaybackState.Builder builder, long j10) {
            builder.setActions(j10);
        }

        static void t(PlaybackState.Builder builder, long j10) {
            builder.setActiveQueueItemId(j10);
        }

        static void u(PlaybackState.Builder builder, long j10) {
            builder.setBufferedPosition(j10);
        }

        static void v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void x(PlaybackState.Builder builder, int i10, long j10, float f10, long j11) {
            builder.setState(i10, j10, f10, j11);
        }
    }

    private static class c {
        static Bundle a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        static void b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, int i11, CharSequence charSequence, long j13, List<CustomAction> list, long j14, Bundle bundle) {
        this.f461h = i10;
        this.f462i = j10;
        this.f463j = j11;
        this.f464k = f10;
        this.f465l = j12;
        this.f466m = i11;
        this.f467n = charSequence;
        this.f468o = j13;
        this.f469p = new ArrayList(list);
        this.f470q = j14;
        this.f471r = bundle;
    }

    public static PlaybackStateCompat b(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> j10 = b.j(playbackState);
        if (j10 != null) {
            ArrayList arrayList2 = new ArrayList(j10.size());
            for (PlaybackState.CustomAction b10 : j10) {
                arrayList2.add(CustomAction.b(b10));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = c.a(playbackState);
            MediaSessionCompat.a(bundle);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(b.r(playbackState), b.q(playbackState), b.i(playbackState), b.p(playbackState), b.g(playbackState), 0, b.k(playbackState), b.n(playbackState), arrayList, b.h(playbackState), bundle);
        playbackStateCompat.f472s = playbackState;
        return playbackStateCompat;
    }

    public static int j(long j10) {
        if (j10 == 4) {
            return 126;
        }
        if (j10 == 2) {
            return 127;
        }
        if (j10 == 32) {
            return 87;
        }
        if (j10 == 16) {
            return 88;
        }
        if (j10 == 1) {
            return 86;
        }
        if (j10 == 64) {
            return 90;
        }
        if (j10 == 8) {
            return 89;
        }
        return j10 == 512 ? 85 : 0;
    }

    public long c() {
        return this.f465l;
    }

    public long d() {
        return this.f463j;
    }

    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.f468o;
    }

    public float f() {
        return this.f464k;
    }

    public Object g() {
        if (this.f472s == null && Build.VERSION.SDK_INT >= 21) {
            PlaybackState.Builder d10 = b.d();
            b.x(d10, this.f461h, this.f462i, this.f464k, this.f468o);
            b.u(d10, this.f463j);
            b.s(d10, this.f465l);
            b.v(d10, this.f467n);
            for (CustomAction c10 : this.f469p) {
                b.a(d10, (PlaybackState.CustomAction) c10.c());
            }
            b.t(d10, this.f470q);
            if (Build.VERSION.SDK_INT >= 22) {
                c.b(d10, this.f471r);
            }
            this.f472s = b.c(d10);
        }
        return this.f472s;
    }

    public long h() {
        return this.f462i;
    }

    public int i() {
        return this.f461h;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f461h + ", position=" + this.f462i + ", buffered position=" + this.f463j + ", speed=" + this.f464k + ", updated=" + this.f468o + ", actions=" + this.f465l + ", error code=" + this.f466m + ", error message=" + this.f467n + ", custom actions=" + this.f469p + ", active item id=" + this.f470q + "}";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f461h);
        parcel.writeLong(this.f462i);
        parcel.writeFloat(this.f464k);
        parcel.writeLong(this.f468o);
        parcel.writeLong(this.f463j);
        parcel.writeLong(this.f465l);
        TextUtils.writeToParcel(this.f467n, parcel, i10);
        parcel.writeTypedList(this.f469p);
        parcel.writeLong(this.f470q);
        parcel.writeBundle(this.f471r);
        parcel.writeInt(this.f466m);
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final List<CustomAction> f478a;

        /* renamed from: b  reason: collision with root package name */
        private int f479b;

        /* renamed from: c  reason: collision with root package name */
        private long f480c;

        /* renamed from: d  reason: collision with root package name */
        private long f481d;

        /* renamed from: e  reason: collision with root package name */
        private float f482e;

        /* renamed from: f  reason: collision with root package name */
        private long f483f;

        /* renamed from: g  reason: collision with root package name */
        private int f484g;

        /* renamed from: h  reason: collision with root package name */
        private CharSequence f485h;

        /* renamed from: i  reason: collision with root package name */
        private long f486i;

        /* renamed from: j  reason: collision with root package name */
        private long f487j;

        /* renamed from: k  reason: collision with root package name */
        private Bundle f488k;

        public d() {
            this.f478a = new ArrayList();
            this.f487j = -1;
        }

        public PlaybackStateCompat a() {
            return new PlaybackStateCompat(this.f479b, this.f480c, this.f481d, this.f482e, this.f483f, this.f484g, this.f485h, this.f486i, this.f478a, this.f487j, this.f488k);
        }

        public d b(long j10) {
            this.f483f = j10;
            return this;
        }

        public d c(long j10) {
            this.f481d = j10;
            return this;
        }

        public d d(int i10, long j10, float f10, long j11) {
            this.f479b = i10;
            this.f480c = j10;
            this.f486i = j11;
            this.f482e = f10;
            return this;
        }

        public d(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f478a = arrayList;
            this.f487j = -1;
            this.f479b = playbackStateCompat.f461h;
            this.f480c = playbackStateCompat.f462i;
            this.f482e = playbackStateCompat.f464k;
            this.f486i = playbackStateCompat.f468o;
            this.f481d = playbackStateCompat.f463j;
            this.f483f = playbackStateCompat.f465l;
            this.f484g = playbackStateCompat.f466m;
            this.f485h = playbackStateCompat.f467n;
            List<CustomAction> list = playbackStateCompat.f469p;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f487j = playbackStateCompat.f470q;
            this.f488k = playbackStateCompat.f471r;
        }
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        private final String f473h;

        /* renamed from: i  reason: collision with root package name */
        private final CharSequence f474i;

        /* renamed from: j  reason: collision with root package name */
        private final int f475j;

        /* renamed from: k  reason: collision with root package name */
        private final Bundle f476k;

        /* renamed from: l  reason: collision with root package name */
        private PlaybackState.CustomAction f477l;

        class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.f473h = str;
            this.f474i = charSequence;
            this.f475j = i10;
            this.f476k = bundle;
        }

        public static CustomAction b(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle l10 = b.l(customAction);
            MediaSessionCompat.a(l10);
            CustomAction customAction2 = new CustomAction(b.f(customAction), b.o(customAction), b.m(customAction), l10);
            customAction2.f477l = customAction;
            return customAction2;
        }

        public Object c() {
            PlaybackState.CustomAction customAction = this.f477l;
            if (customAction != null || Build.VERSION.SDK_INT < 21) {
                return customAction;
            }
            PlaybackState.CustomAction.Builder e10 = b.e(this.f473h, this.f474i, this.f475j);
            b.w(e10, this.f476k);
            return b.b(e10);
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f474i + ", mIcon=" + this.f475j + ", mExtras=" + this.f476k;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f473h);
            TextUtils.writeToParcel(this.f474i, parcel, i10);
            parcel.writeInt(this.f475j);
            parcel.writeBundle(this.f476k);
        }

        CustomAction(Parcel parcel) {
            this.f473h = parcel.readString();
            this.f474i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f475j = parcel.readInt();
            this.f476k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f461h = parcel.readInt();
        this.f462i = parcel.readLong();
        this.f464k = parcel.readFloat();
        this.f468o = parcel.readLong();
        this.f463j = parcel.readLong();
        this.f465l = parcel.readLong();
        this.f467n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f469p = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f470q = parcel.readLong();
        this.f471r = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f466m = parcel.readInt();
    }
}
