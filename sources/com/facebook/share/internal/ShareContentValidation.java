package com.facebook.share.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;

/* compiled from: ShareContentValidation.kt */
public final class ShareContentValidation {
    public static final ShareContentValidation INSTANCE = new ShareContentValidation();
    private static final Validator apiValidator = new ApiValidator();
    private static final Validator defaultValidator = new Validator();
    private static final Validator storyValidator = new StoryShareValidator();
    private static final Validator webShareValidator = new WebShareValidator();

    /* compiled from: ShareContentValidation.kt */
    private static final class ApiValidator extends Validator {
        public void validate(SharePhoto sharePhoto) {
            m.f(sharePhoto, AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO);
            ShareContentValidation.INSTANCE.validatePhotoForApi(sharePhoto, this);
        }

        public void validate(ShareVideoContent shareVideoContent) {
            m.f(shareVideoContent, "videoContent");
            Utility utility = Utility.INSTANCE;
            if (!Utility.isNullOrEmpty(shareVideoContent.getPlaceId())) {
                throw new FacebookException("Cannot share video content with place IDs using the share api");
            } else if (!Utility.isNullOrEmpty((Collection<?>) shareVideoContent.getPeopleIds())) {
                throw new FacebookException("Cannot share video content with people IDs using the share api");
            } else if (!Utility.isNullOrEmpty(shareVideoContent.getRef())) {
                throw new FacebookException("Cannot share video content with referrer URL using the share api");
            }
        }

        public void validate(ShareMediaContent shareMediaContent) {
            m.f(shareMediaContent, "mediaContent");
            throw new FacebookException("Cannot share ShareMediaContent using the share api");
        }

        public void validate(ShareLinkContent shareLinkContent) {
            m.f(shareLinkContent, "linkContent");
            Utility utility = Utility.INSTANCE;
            if (!Utility.isNullOrEmpty(shareLinkContent.getQuote())) {
                throw new FacebookException("Cannot share link content with quote using the share api");
            }
        }
    }

    /* compiled from: ShareContentValidation.kt */
    private static final class StoryShareValidator extends Validator {
        public void validate(ShareStoryContent shareStoryContent) {
            ShareContentValidation.INSTANCE.validateStoryContent(shareStoryContent, this);
        }
    }

    /* compiled from: ShareContentValidation.kt */
    public static class Validator {
        public void validate(ShareLinkContent shareLinkContent) {
            m.f(shareLinkContent, "linkContent");
            ShareContentValidation.INSTANCE.validateLinkContent(shareLinkContent, this);
        }

        public void validate(SharePhotoContent sharePhotoContent) {
            m.f(sharePhotoContent, "photoContent");
            ShareContentValidation.INSTANCE.validatePhotoContent(sharePhotoContent, this);
        }

        public void validate(ShareVideoContent shareVideoContent) {
            m.f(shareVideoContent, "videoContent");
            ShareContentValidation.INSTANCE.validateVideoContent(shareVideoContent, this);
        }

        public void validate(ShareMediaContent shareMediaContent) {
            m.f(shareMediaContent, "mediaContent");
            ShareContentValidation.INSTANCE.validateMediaContent(shareMediaContent, this);
        }

        public void validate(ShareCameraEffectContent shareCameraEffectContent) {
            m.f(shareCameraEffectContent, "cameraEffectContent");
            ShareContentValidation.INSTANCE.validateCameraEffectContent(shareCameraEffectContent);
        }

        public void validate(SharePhoto sharePhoto) {
            m.f(sharePhoto, AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO);
            ShareContentValidation.INSTANCE.validatePhotoForNativeDialog(sharePhoto, this);
        }

        public void validate(ShareVideo shareVideo) {
            ShareContentValidation.INSTANCE.validateVideo(shareVideo, this);
        }

        public void validate(ShareMedia<?, ?> shareMedia) {
            m.f(shareMedia, "medium");
            ShareContentValidation shareContentValidation = ShareContentValidation.INSTANCE;
            ShareContentValidation.validateMedium(shareMedia, this);
        }

        public void validate(ShareStoryContent shareStoryContent) {
            ShareContentValidation.INSTANCE.validateStoryContent(shareStoryContent, this);
        }
    }

    /* compiled from: ShareContentValidation.kt */
    private static final class WebShareValidator extends Validator {
        public void validate(ShareVideoContent shareVideoContent) {
            m.f(shareVideoContent, "videoContent");
            throw new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
        }

        public void validate(ShareMediaContent shareMediaContent) {
            m.f(shareMediaContent, "mediaContent");
            throw new FacebookException("Cannot share ShareMediaContent via web sharing dialogs");
        }

        public void validate(SharePhoto sharePhoto) {
            m.f(sharePhoto, AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO);
            ShareContentValidation.INSTANCE.validatePhotoForWebDialog(sharePhoto, this);
        }
    }

    private ShareContentValidation() {
    }

    private final void validate(ShareContent<?, ?> shareContent, Validator validator) {
        if (shareContent == null) {
            throw new FacebookException("Must provide non-null content to share");
        } else if (shareContent instanceof ShareLinkContent) {
            validator.validate((ShareLinkContent) shareContent);
        } else if (shareContent instanceof SharePhotoContent) {
            validator.validate((SharePhotoContent) shareContent);
        } else if (shareContent instanceof ShareVideoContent) {
            validator.validate((ShareVideoContent) shareContent);
        } else if (shareContent instanceof ShareMediaContent) {
            validator.validate((ShareMediaContent) shareContent);
        } else if (shareContent instanceof ShareCameraEffectContent) {
            validator.validate((ShareCameraEffectContent) shareContent);
        } else if (shareContent instanceof ShareStoryContent) {
            validator.validate((ShareStoryContent) shareContent);
        }
    }

    /* access modifiers changed from: private */
    public final void validateCameraEffectContent(ShareCameraEffectContent shareCameraEffectContent) {
        String effectId = shareCameraEffectContent.getEffectId();
        Utility utility = Utility.INSTANCE;
        if (Utility.isNullOrEmpty(effectId)) {
            throw new FacebookException("Must specify a non-empty effectId");
        }
    }

    public static final void validateForApiShare(ShareContent<?, ?> shareContent) {
        INSTANCE.validate(shareContent, apiValidator);
    }

    public static final void validateForMessage(ShareContent<?, ?> shareContent) {
        INSTANCE.validate(shareContent, defaultValidator);
    }

    public static final void validateForNativeShare(ShareContent<?, ?> shareContent) {
        INSTANCE.validate(shareContent, defaultValidator);
    }

    public static final void validateForStoryShare(ShareContent<?, ?> shareContent) {
        INSTANCE.validate(shareContent, storyValidator);
    }

    public static final void validateForWebShare(ShareContent<?, ?> shareContent) {
        INSTANCE.validate(shareContent, webShareValidator);
    }

    /* access modifiers changed from: private */
    public final void validateLinkContent(ShareLinkContent shareLinkContent, Validator validator) {
        Uri contentUrl = shareLinkContent.getContentUrl();
        if (contentUrl != null) {
            Utility utility = Utility.INSTANCE;
            if (!Utility.isWebUri(contentUrl)) {
                throw new FacebookException("Content Url must be an http:// or https:// url");
            }
        }
    }

    /* access modifiers changed from: private */
    public final void validateMediaContent(ShareMediaContent shareMediaContent, Validator validator) {
        List<ShareMedia<?, ?>> media = shareMediaContent.getMedia();
        if (media == null || media.isEmpty()) {
            throw new FacebookException("Must specify at least one medium in ShareMediaContent.");
        } else if (media.size() <= 6) {
            for (ShareMedia<?, ?> validate : media) {
                validator.validate(validate);
            }
        } else {
            b0 b0Var = b0.f15559a;
            String format = String.format(Locale.ROOT, "Cannot add more than %d media.", Arrays.copyOf(new Object[]{6}, 1));
            m.e(format, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format);
        }
    }

    public static final void validateMedium(ShareMedia<?, ?> shareMedia, Validator validator) {
        m.f(shareMedia, "medium");
        m.f(validator, "validator");
        if (shareMedia instanceof SharePhoto) {
            validator.validate((SharePhoto) shareMedia);
        } else if (shareMedia instanceof ShareVideo) {
            validator.validate((ShareVideo) shareMedia);
        } else {
            b0 b0Var = b0.f15559a;
            String format = String.format(Locale.ROOT, "Invalid media type: %s", Arrays.copyOf(new Object[]{shareMedia.getClass().getSimpleName()}, 1));
            m.e(format, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format);
        }
    }

    private final void validatePhoto(SharePhoto sharePhoto) {
        if (sharePhoto != null) {
            Bitmap bitmap = sharePhoto.getBitmap();
            Uri imageUrl = sharePhoto.getImageUrl();
            if (bitmap == null && imageUrl == null) {
                throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
            }
            return;
        }
        throw new FacebookException("Cannot share a null SharePhoto");
    }

    /* access modifiers changed from: private */
    public final void validatePhotoContent(SharePhotoContent sharePhotoContent, Validator validator) {
        List<SharePhoto> photos = sharePhotoContent.getPhotos();
        if (photos == null || photos.isEmpty()) {
            throw new FacebookException("Must specify at least one Photo in SharePhotoContent.");
        } else if (photos.size() <= 6) {
            for (SharePhoto validate : photos) {
                validator.validate(validate);
            }
        } else {
            b0 b0Var = b0.f15559a;
            String format = String.format(Locale.ROOT, "Cannot add more than %d photos.", Arrays.copyOf(new Object[]{6}, 1));
            m.e(format, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format);
        }
    }

    /* access modifiers changed from: private */
    public final void validatePhotoForApi(SharePhoto sharePhoto, Validator validator) {
        validatePhoto(sharePhoto);
        Bitmap bitmap = sharePhoto.getBitmap();
        Uri imageUrl = sharePhoto.getImageUrl();
        if (bitmap == null) {
            Utility utility = Utility.INSTANCE;
            if (Utility.isWebUri(imageUrl)) {
                throw new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
            }
        }
    }

    /* access modifiers changed from: private */
    public final void validatePhotoForNativeDialog(SharePhoto sharePhoto, Validator validator) {
        validatePhotoForApi(sharePhoto, validator);
        if (sharePhoto.getBitmap() == null) {
            Utility utility = Utility.INSTANCE;
            if (Utility.isWebUri(sharePhoto.getImageUrl())) {
                return;
            }
        }
        Validate validate = Validate.INSTANCE;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Validate.hasContentProvider(FacebookSdk.getApplicationContext());
    }

    /* access modifiers changed from: private */
    public final void validatePhotoForWebDialog(SharePhoto sharePhoto, Validator validator) {
        validatePhoto(sharePhoto);
    }

    private final void validateShareMessengerActionButton(ShareMessengerActionButton shareMessengerActionButton) {
        if (shareMessengerActionButton != null) {
            Utility utility = Utility.INSTANCE;
            if (Utility.isNullOrEmpty(shareMessengerActionButton.getTitle())) {
                throw new FacebookException("Must specify title for ShareMessengerActionButton");
            } else if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
                validateShareMessengerURLActionButton((ShareMessengerURLActionButton) shareMessengerActionButton);
            }
        }
    }

    private final void validateShareMessengerURLActionButton(ShareMessengerURLActionButton shareMessengerURLActionButton) {
        if (shareMessengerURLActionButton.getUrl() == null) {
            throw new FacebookException("Must specify url for ShareMessengerURLActionButton");
        }
    }

    /* access modifiers changed from: private */
    public final void validateStoryContent(ShareStoryContent shareStoryContent, Validator validator) {
        if (shareStoryContent == null || (shareStoryContent.getBackgroundAsset() == null && shareStoryContent.getStickerAsset() == null)) {
            throw new FacebookException("Must pass the Facebook app a background asset, a sticker asset, or both");
        }
        if (shareStoryContent.getBackgroundAsset() != null) {
            validator.validate(shareStoryContent.getBackgroundAsset());
        }
        if (shareStoryContent.getStickerAsset() != null) {
            validator.validate(shareStoryContent.getStickerAsset());
        }
    }

    /* access modifiers changed from: private */
    public final void validateVideo(ShareVideo shareVideo, Validator validator) {
        if (shareVideo != null) {
            Uri localUrl = shareVideo.getLocalUrl();
            if (localUrl != null) {
                Utility utility = Utility.INSTANCE;
                if (!Utility.isContentUri(localUrl) && !Utility.isFileUri(localUrl)) {
                    throw new FacebookException("ShareVideo must reference a video that is on the device");
                }
                return;
            }
            throw new FacebookException("ShareVideo does not have a LocalUrl specified");
        }
        throw new FacebookException("Cannot share a null ShareVideo");
    }

    /* access modifiers changed from: private */
    public final void validateVideoContent(ShareVideoContent shareVideoContent, Validator validator) {
        validator.validate(shareVideoContent.getVideo());
        SharePhoto previewPhoto = shareVideoContent.getPreviewPhoto();
        if (previewPhoto != null) {
            validator.validate(previewPhoto);
        }
    }
}
