package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    private final int f360h;

    /* renamed from: i  reason: collision with root package name */
    private final float f361i;

    /* renamed from: j  reason: collision with root package name */
    private Object f362j;

    class a implements Parcelable.Creator<RatingCompat> {
        a() {
        }

        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: b */
        public RatingCompat[] newArray(int i10) {
            return new RatingCompat[i10];
        }
    }

    private static class b {
        static float a(Rating rating) {
            return rating.getPercentRating();
        }

        static int b(Rating rating) {
            return rating.getRatingStyle();
        }

        static float c(Rating rating) {
            return rating.getStarRating();
        }

        static boolean d(Rating rating) {
            return rating.hasHeart();
        }

        static boolean e(Rating rating) {
            return rating.isRated();
        }

        static boolean f(Rating rating) {
            return rating.isThumbUp();
        }

        static Rating g(boolean z10) {
            return Rating.newHeartRating(z10);
        }

        static Rating h(float f10) {
            return Rating.newPercentageRating(f10);
        }

        static Rating i(int i10, float f10) {
            return Rating.newStarRating(i10, f10);
        }

        static Rating j(boolean z10) {
            return Rating.newThumbRating(z10);
        }

        static Rating k(int i10) {
            return Rating.newUnratedRating(i10);
        }
    }

    RatingCompat(int i10, float f10) {
        this.f360h = i10;
        this.f361i = f10;
    }

    public static RatingCompat b(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null && Build.VERSION.SDK_INT >= 19) {
            Rating rating = (Rating) obj;
            int b10 = b.b(rating);
            if (b.e(rating)) {
                switch (b10) {
                    case 1:
                        ratingCompat = j(b.d(rating));
                        break;
                    case 2:
                        ratingCompat = m(b.f(rating));
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = l(b10, b.c(rating));
                        break;
                    case 6:
                        ratingCompat = k(b.a(rating));
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = n(b10);
            }
            ratingCompat.f362j = obj;
        }
        return ratingCompat;
    }

    public static RatingCompat j(boolean z10) {
        return new RatingCompat(1, z10 ? 1.0f : 0.0f);
    }

    public static RatingCompat k(float f10) {
        if (f10 < 0.0f || f10 > 100.0f) {
            return null;
        }
        return new RatingCompat(6, f10);
    }

    public static RatingCompat l(int i10, float f10) {
        float f11;
        if (i10 == 3) {
            f11 = 3.0f;
        } else if (i10 == 4) {
            f11 = 4.0f;
        } else if (i10 != 5) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid rating style (");
            sb.append(i10);
            sb.append(") for a star rating");
            return null;
        } else {
            f11 = 5.0f;
        }
        if (f10 < 0.0f || f10 > f11) {
            return null;
        }
        return new RatingCompat(i10, f10);
    }

    public static RatingCompat m(boolean z10) {
        return new RatingCompat(2, z10 ? 1.0f : 0.0f);
    }

    public static RatingCompat n(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i10, -1.0f);
            default:
                return null;
        }
    }

    public float c() {
        if (this.f360h != 6 || !h()) {
            return -1.0f;
        }
        return this.f361i;
    }

    public Object d() {
        if (this.f362j == null && Build.VERSION.SDK_INT >= 19) {
            if (h()) {
                int i10 = this.f360h;
                switch (i10) {
                    case 1:
                        this.f362j = b.g(g());
                        break;
                    case 2:
                        this.f362j = b.j(i());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.f362j = b.i(i10, f());
                        break;
                    case 6:
                        this.f362j = b.h(c());
                        break;
                    default:
                        return null;
                }
            } else {
                this.f362j = b.k(this.f360h);
            }
        }
        return this.f362j;
    }

    public int describeContents() {
        return this.f360h;
    }

    public int e() {
        return this.f360h;
    }

    public float f() {
        int i10 = this.f360h;
        if ((i10 == 3 || i10 == 4 || i10 == 5) && h()) {
            return this.f361i;
        }
        return -1.0f;
    }

    public boolean g() {
        if (this.f360h == 1 && this.f361i == 1.0f) {
            return true;
        }
        return false;
    }

    public boolean h() {
        return this.f361i >= 0.0f;
    }

    public boolean i() {
        if (this.f360h == 2 && this.f361i == 1.0f) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f360h);
        sb.append(" rating=");
        float f10 = this.f361i;
        sb.append(f10 < 0.0f ? "unrated" : String.valueOf(f10));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f360h);
        parcel.writeFloat(this.f361i);
    }
}
