package com.facebook.login.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.Profile;
import com.facebook.ProfileTracker;
import com.facebook.internal.ImageDownloader;
import com.facebook.internal.ImageRequest;
import com.facebook.internal.ImageResponse;
import com.facebook.internal.Logger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.R;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: ProfilePictureView.kt */
public final class ProfilePictureView extends FrameLayout {
    private static final String BITMAP_HEIGHT_KEY = "ProfilePictureView_height";
    private static final String BITMAP_KEY = "ProfilePictureView_bitmap";
    private static final String BITMAP_WIDTH_KEY = "ProfilePictureView_width";
    public static final int CUSTOM = -1;
    public static final Companion Companion = new Companion((g) null);
    private static final boolean IS_CROPPED_DEFAULT_VALUE = true;
    private static final String IS_CROPPED_KEY = "ProfilePictureView_isCropped";
    public static final int LARGE = -4;
    private static final int MIN_SIZE = 1;
    public static final int NORMAL = -3;
    private static final String PENDING_REFRESH_KEY = "ProfilePictureView_refresh";
    private static final String PRESET_SIZE_KEY = "ProfilePictureView_presetSize";
    private static final String PROFILE_ID_KEY = "ProfilePictureView_profileId";
    public static final int SMALL = -2;
    private static final String SUPER_STATE_KEY = "ProfilePictureView_superState";
    /* access modifiers changed from: private */
    public static final String TAG;
    private Bitmap customizedDefaultProfilePicture;
    private final ImageView image = new ImageView(getContext());
    private Bitmap imageContents;
    private boolean isCropped = true;
    private ImageRequest lastRequest;
    private OnErrorListener onErrorListener;
    private int presetSize = -1;
    private String profileId;
    private ProfileTracker profileTracker;
    private int queryHeight;
    private int queryWidth;

    /* compiled from: ProfilePictureView.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final String getTAG() {
            return ProfilePictureView.TAG;
        }
    }

    /* compiled from: ProfilePictureView.kt */
    public interface OnErrorListener {
        void onError(FacebookException facebookException);
    }

    static {
        String simpleName = ProfilePictureView.class.getSimpleName();
        m.e(simpleName, "ProfilePictureView::class.java.simpleName");
        TAG = simpleName;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfilePictureView(Context context) {
        super(context);
        m.f(context, "context");
        initialize();
    }

    private final int getPresetSizeInPixels(boolean z10) {
        int i10;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            int i11 = this.presetSize;
            if (i11 == -1 && !z10) {
                return 0;
            }
            if (i11 == -4) {
                i10 = R.dimen.com_facebook_profilepictureview_preset_size_large;
            } else if (i11 == -3) {
                i10 = R.dimen.com_facebook_profilepictureview_preset_size_normal;
            } else if (i11 == -2) {
                i10 = R.dimen.com_facebook_profilepictureview_preset_size_small;
            } else if (i11 != -1) {
                return 0;
            } else {
                i10 = R.dimen.com_facebook_profilepictureview_preset_size_normal;
            }
            return getResources().getDimensionPixelSize(i10);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    private final Uri getProfilePictureUri(String str) {
        Profile currentProfile = Profile.Companion.getCurrentProfile();
        if (currentProfile == null || !AccessToken.Companion.isLoggedInWithInstagram()) {
            return ImageRequest.Companion.getProfilePictureUri(this.profileId, this.queryWidth, this.queryHeight, str);
        }
        return currentProfile.getProfilePictureUri(this.queryWidth, this.queryHeight);
    }

    private final void initialize() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                removeAllViews();
                this.image.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.image.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                addView(this.image);
                this.profileTracker = new ProfilePictureView$initialize$1(this);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final boolean isUnspecifiedDimensions() {
        return this.queryWidth == 0 && this.queryHeight == 0;
    }

    private final void parseAttributes(AttributeSet attributeSet) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.com_facebook_profile_picture_view);
                m.e(obtainStyledAttributes, "context.obtainStyledAttributes(attrs, R.styleable.com_facebook_profile_picture_view)");
                setPresetSize(obtainStyledAttributes.getInt(R.styleable.com_facebook_profile_picture_view_com_facebook_preset_size, -1));
                setCropped(obtainStyledAttributes.getBoolean(R.styleable.com_facebook_profile_picture_view_com_facebook_is_cropped, true));
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void processResponse(ImageResponse imageResponse) {
        if (!CrashShieldHandler.isObjectCrashing(this) && imageResponse != null) {
            try {
                if (m.a(imageResponse.getRequest(), this.lastRequest)) {
                    this.lastRequest = null;
                    Bitmap bitmap = imageResponse.getBitmap();
                    Exception error = imageResponse.getError();
                    if (error != null) {
                        OnErrorListener onErrorListener2 = this.onErrorListener;
                        if (onErrorListener2 != null) {
                            onErrorListener2.onError(new FacebookException(m.o("Error in downloading profile picture for profileId: ", this.profileId), (Throwable) error));
                        } else {
                            Logger.Companion.log(LoggingBehavior.REQUESTS, 6, TAG, error.toString());
                        }
                    } else if (bitmap != null) {
                        setImageBitmap(bitmap);
                        if (imageResponse.isCachedRedirect()) {
                            sendImageRequest(false);
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void refreshImage(boolean z10) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                boolean updateImageQueryParameters = updateImageQueryParameters();
                String str = this.profileId;
                if (str != null) {
                    if (!(str.length() == 0)) {
                        if (!isUnspecifiedDimensions()) {
                            if (updateImageQueryParameters || z10) {
                                sendImageRequest(true);
                                return;
                            }
                            return;
                        }
                    }
                }
                setBlankProfilePicture();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void sendImageRequest(boolean z10) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                AccessToken.Companion companion = AccessToken.Companion;
                String str = "";
                if (companion.isCurrentAccessTokenActive()) {
                    AccessToken currentAccessToken = companion.getCurrentAccessToken();
                    if (currentAccessToken != null) {
                        String token = currentAccessToken.getToken();
                        if (token != null) {
                            str = token;
                        }
                    }
                }
                Uri profilePictureUri = getProfilePictureUri(str);
                Context context = getContext();
                m.e(context, "context");
                ImageRequest build = new ImageRequest.Builder(context, profilePictureUri).setAllowCachedRedirects(z10).setCallerTag(this).setCallback(new e(this)).build();
                ImageRequest imageRequest = this.lastRequest;
                if (imageRequest != null) {
                    ImageDownloader imageDownloader = ImageDownloader.INSTANCE;
                    ImageDownloader.cancelRequest(imageRequest);
                }
                this.lastRequest = build;
                ImageDownloader imageDownloader2 = ImageDownloader.INSTANCE;
                ImageDownloader.downloadAsync(build);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: sendImageRequest$lambda-2  reason: not valid java name */
    public static final void m151sendImageRequest$lambda2(ProfilePictureView profilePictureView, ImageResponse imageResponse) {
        m.f(profilePictureView, "this$0");
        profilePictureView.processResponse(imageResponse);
    }

    private final void setBlankProfilePicture() {
        int i10;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                ImageRequest imageRequest = this.lastRequest;
                if (imageRequest != null) {
                    ImageDownloader imageDownloader = ImageDownloader.INSTANCE;
                    ImageDownloader.cancelRequest(imageRequest);
                }
                Bitmap bitmap = this.customizedDefaultProfilePicture;
                if (bitmap == null) {
                    if (this.isCropped) {
                        i10 = R.drawable.com_facebook_profile_picture_blank_square;
                    } else {
                        i10 = R.drawable.com_facebook_profile_picture_blank_portrait;
                    }
                    setImageBitmap(BitmapFactory.decodeResource(getResources(), i10));
                    return;
                }
                updateImageQueryParameters();
                setImageBitmap(Bitmap.createScaledBitmap(bitmap, this.queryWidth, this.queryHeight, false));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void setImageBitmap(Bitmap bitmap) {
        if (!CrashShieldHandler.isObjectCrashing(this) && bitmap != null) {
            try {
                this.imageContents = bitmap;
                this.image.setImageBitmap(bitmap);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final boolean updateImageQueryParameters() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            int height = getHeight();
            int width = getWidth();
            boolean z10 = true;
            if (width >= 1) {
                if (height >= 1) {
                    int presetSizeInPixels = getPresetSizeInPixels(false);
                    if (presetSizeInPixels != 0) {
                        height = presetSizeInPixels;
                        width = height;
                    }
                    if (width <= height) {
                        height = this.isCropped ? width : 0;
                    } else {
                        width = this.isCropped ? height : 0;
                    }
                    if (width == this.queryWidth) {
                        if (height == this.queryHeight) {
                            z10 = false;
                        }
                    }
                    this.queryWidth = width;
                    this.queryHeight = height;
                    return z10;
                }
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public final OnErrorListener getOnErrorListener() {
        return this.onErrorListener;
    }

    public final int getPresetSize() {
        return this.presetSize;
    }

    public final String getProfileId() {
        return this.profileId;
    }

    public final boolean getShouldUpdateOnProfileChange() {
        ProfileTracker profileTracker2 = this.profileTracker;
        if (profileTracker2 == null) {
            return false;
        }
        return profileTracker2.isTracking();
    }

    public final boolean isCropped() {
        return this.isCropped;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.lastRequest = null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        refreshImage(false);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        boolean z10;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean z11 = true;
        if (View.MeasureSpec.getMode(i11) == 1073741824 || layoutParams.height != -2) {
            z10 = false;
        } else {
            size = getPresetSizeInPixels(true);
            i11 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            z10 = true;
        }
        if (View.MeasureSpec.getMode(i10) == 1073741824 || layoutParams.width != -2) {
            z11 = z10;
        } else {
            size2 = getPresetSizeInPixels(true);
            i10 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        }
        if (z11) {
            setMeasuredDimension(size2, size);
            measureChildren(i10, i11);
            return;
        }
        super.onMeasure(i10, i11);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        m.f(parcelable, "state");
        if (!m.a(parcelable.getClass(), Bundle.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable(SUPER_STATE_KEY));
        setProfileId(bundle.getString(PROFILE_ID_KEY));
        setPresetSize(bundle.getInt(PRESET_SIZE_KEY));
        setCropped(bundle.getBoolean(IS_CROPPED_KEY));
        this.queryWidth = bundle.getInt(BITMAP_WIDTH_KEY);
        this.queryHeight = bundle.getInt(BITMAP_HEIGHT_KEY);
        refreshImage(true);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable(SUPER_STATE_KEY, onSaveInstanceState);
        bundle.putString(PROFILE_ID_KEY, this.profileId);
        bundle.putInt(PRESET_SIZE_KEY, this.presetSize);
        bundle.putBoolean(IS_CROPPED_KEY, this.isCropped);
        bundle.putInt(BITMAP_WIDTH_KEY, this.queryWidth);
        bundle.putInt(BITMAP_HEIGHT_KEY, this.queryHeight);
        bundle.putBoolean(PENDING_REFRESH_KEY, this.lastRequest != null);
        return bundle;
    }

    public final void setCropped(boolean z10) {
        this.isCropped = z10;
        refreshImage(false);
    }

    public final void setDefaultProfilePicture(Bitmap bitmap) {
        this.customizedDefaultProfilePicture = bitmap;
    }

    public final void setOnErrorListener(OnErrorListener onErrorListener2) {
        this.onErrorListener = onErrorListener2;
    }

    public final void setPresetSize(int i10) {
        if (i10 == -4 || i10 == -3 || i10 == -2 || i10 == -1) {
            this.presetSize = i10;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Must use a predefined preset size");
    }

    public final void setProfileId(String str) {
        String str2 = this.profileId;
        boolean z10 = false;
        if ((str2 == null || str2.length() == 0) || !p.m(this.profileId, str, true)) {
            setBlankProfilePicture();
            z10 = true;
        }
        this.profileId = str;
        refreshImage(z10);
    }

    public final void setShouldUpdateOnProfileChange(boolean z10) {
        if (z10) {
            ProfileTracker profileTracker2 = this.profileTracker;
            if (profileTracker2 != null) {
                profileTracker2.startTracking();
                return;
            }
            return;
        }
        ProfileTracker profileTracker3 = this.profileTracker;
        if (profileTracker3 != null) {
            profileTracker3.stopTracking();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfilePictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.f(context, "context");
        m.f(attributeSet, "attrs");
        initialize();
        parseAttributes(attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfilePictureView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m.f(context, "context");
        m.f(attributeSet, "attrs");
        initialize();
        parseAttributes(attributeSet);
    }
}
