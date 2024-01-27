package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import com.facebook.FacebookSdk;
import io.flutter.plugins.firebase.analytics.Constants;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: ImageRequest.kt */
public final class ImageRequest {
    private static final String ACCESS_TOKEN_PARAM = "access_token";
    public static final Companion Companion = new Companion((g) null);
    private static final String HEIGHT_PARAM = "height";
    private static final String MIGRATION_PARAM = "migration_overrides";
    private static final String MIGRATION_VALUE = "{october_2012:true}";
    private static final String PATH = "%s/%s/picture";
    public static final int UNSPECIFIED_DIMENSION = 0;
    private static final String WIDTH_PARAM = "width";
    private final boolean allowCachedRedirects;
    private final Callback callback;
    private final Object callerTag;
    private final Context context;
    private final Uri imageUri;

    /* compiled from: ImageRequest.kt */
    public static final class Builder {
        private boolean allowCachedRedirects;
        private Callback callback;
        private Object callerTag;
        private final Context context;
        private final Uri imageUri;

        public Builder(Context context2, Uri uri) {
            m.f(context2, "context");
            m.f(uri, "imageUri");
            this.context = context2;
            this.imageUri = uri;
        }

        private final Context component1() {
            return this.context;
        }

        private final Uri component2() {
            return this.imageUri;
        }

        public static /* synthetic */ Builder copy$default(Builder builder, Context context2, Uri uri, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                context2 = builder.context;
            }
            if ((i10 & 2) != 0) {
                uri = builder.imageUri;
            }
            return builder.copy(context2, uri);
        }

        public final ImageRequest build() {
            Context context2 = this.context;
            Uri uri = this.imageUri;
            Callback callback2 = this.callback;
            boolean z10 = this.allowCachedRedirects;
            Object obj = this.callerTag;
            if (obj == null) {
                obj = new Object();
            } else if (obj == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            return new ImageRequest(context2, uri, callback2, z10, obj, (g) null);
        }

        public final Builder copy(Context context2, Uri uri) {
            m.f(context2, "context");
            m.f(uri, "imageUri");
            return new Builder(context2, uri);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            return m.a(this.context, builder.context) && m.a(this.imageUri, builder.imageUri);
        }

        public int hashCode() {
            return (this.context.hashCode() * 31) + this.imageUri.hashCode();
        }

        public final Builder setAllowCachedRedirects(boolean z10) {
            this.allowCachedRedirects = z10;
            return this;
        }

        public final Builder setCallback(Callback callback2) {
            this.callback = callback2;
            return this;
        }

        public final Builder setCallerTag(Object obj) {
            this.callerTag = obj;
            return this;
        }

        public String toString() {
            return "Builder(context=" + this.context + ", imageUri=" + this.imageUri + ')';
        }
    }

    /* compiled from: ImageRequest.kt */
    public interface Callback {
        void onCompleted(ImageResponse imageResponse);
    }

    /* compiled from: ImageRequest.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final Uri getProfilePictureUri(String str, int i10, int i11) {
            return getProfilePictureUri(str, i10, i11, "");
        }

        public final Uri getProfilePictureUri(String str, int i10, int i11, String str2) {
            Validate validate = Validate.INSTANCE;
            Validate.notNullOrEmpty(str, Constants.USER_ID);
            int max = Math.max(i10, 0);
            int max2 = Math.max(i11, 0);
            if ((max == 0 && max2 == 0) ? false : true) {
                ServerProtocol serverProtocol = ServerProtocol.INSTANCE;
                Uri.Builder buildUpon = Uri.parse(ServerProtocol.getGraphUrlBase()).buildUpon();
                b0 b0Var = b0.f15559a;
                Locale locale = Locale.US;
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                String format = String.format(locale, ImageRequest.PATH, Arrays.copyOf(new Object[]{FacebookSdk.getGraphApiVersion(), str}, 2));
                m.e(format, "java.lang.String.format(locale, format, *args)");
                Uri.Builder path = buildUpon.path(format);
                if (max2 != 0) {
                    path.appendQueryParameter("height", String.valueOf(max2));
                }
                if (max != 0) {
                    path.appendQueryParameter("width", String.valueOf(max));
                }
                path.appendQueryParameter(ImageRequest.MIGRATION_PARAM, ImageRequest.MIGRATION_VALUE);
                Utility utility = Utility.INSTANCE;
                if (!Utility.isNullOrEmpty(str2)) {
                    path.appendQueryParameter("access_token", str2);
                } else if (!Utility.isNullOrEmpty(FacebookSdk.getClientToken()) && !Utility.isNullOrEmpty(FacebookSdk.getApplicationId())) {
                    path.appendQueryParameter("access_token", FacebookSdk.getApplicationId() + '|' + FacebookSdk.getClientToken());
                }
                Uri build = path.build();
                m.e(build, "builder.build()");
                return build;
            }
            throw new IllegalArgumentException("Either width or height must be greater than 0".toString());
        }
    }

    private ImageRequest(Context context2, Uri uri, Callback callback2, boolean z10, Object obj) {
        this.context = context2;
        this.imageUri = uri;
        this.callback = callback2;
        this.allowCachedRedirects = z10;
        this.callerTag = obj;
    }

    public /* synthetic */ ImageRequest(Context context2, Uri uri, Callback callback2, boolean z10, Object obj, g gVar) {
        this(context2, uri, callback2, z10, obj);
    }

    public static final Uri getProfilePictureUri(String str, int i10, int i11) {
        return Companion.getProfilePictureUri(str, i10, i11);
    }

    public static final Uri getProfilePictureUri(String str, int i10, int i11, String str2) {
        return Companion.getProfilePictureUri(str, i10, i11, str2);
    }

    public final boolean getAllowCachedRedirects() {
        return this.allowCachedRedirects;
    }

    public final Callback getCallback() {
        return this.callback;
    }

    public final Object getCallerTag() {
        return this.callerTag;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Uri getImageUri() {
        return this.imageUri;
    }

    public final boolean isCachedRedirectAllowed() {
        return this.allowCachedRedirects;
    }
}
