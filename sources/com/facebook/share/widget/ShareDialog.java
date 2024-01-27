package com.facebook.share.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookSdk;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogFeature;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeAppCallAttachmentStore;
import com.facebook.share.Sharer;
import com.facebook.share.internal.CameraEffectFeature;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.internal.ShareDialogFeature;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.internal.ShareStoryFeature;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: ShareDialog.kt */
public class ShareDialog extends FacebookDialogBase<ShareContent<?, ?>, Sharer.Result> implements Sharer {
    public static final Companion Companion = new Companion((g) null);
    private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.Share.toRequestCode();
    private static final String FEED_DIALOG = "feed";
    private static final String TAG = ShareDialog.class.getSimpleName();
    private static final String WEB_OG_SHARE_DIALOG = "share_open_graph";
    public static final String WEB_SHARE_DIALOG = "share";
    private boolean isAutomaticMode;
    private final List<FacebookDialogBase<ShareContent<?, ?>, Sharer.Result>.ModeHandler> orderedModeHandlers;
    private boolean shouldFailOnDataError;

    /* compiled from: ShareDialog.kt */
    private final class CameraEffectHandler extends FacebookDialogBase<ShareContent<?, ?>, Sharer.Result>.ModeHandler {
        private Object mode = Mode.NATIVE;
        final /* synthetic */ ShareDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CameraEffectHandler(ShareDialog shareDialog) {
            super(shareDialog);
            m.f(shareDialog, "this$0");
            this.this$0 = shareDialog;
        }

        public Object getMode() {
            return this.mode;
        }

        public void setMode(Object obj) {
            m.f(obj, "<set-?>");
            this.mode = obj;
        }

        public boolean canShow(ShareContent<?, ?> shareContent, boolean z10) {
            m.f(shareContent, FirebaseAnalytics.Param.CONTENT);
            return (shareContent instanceof ShareCameraEffectContent) && ShareDialog.Companion.canShowNative(shareContent.getClass());
        }

        public AppCall createAppCall(ShareContent<?, ?> shareContent) {
            m.f(shareContent, FirebaseAnalytics.Param.CONTENT);
            ShareContentValidation shareContentValidation = ShareContentValidation.INSTANCE;
            ShareContentValidation.validateForNativeShare(shareContent);
            AppCall createBaseAppCall = this.this$0.createBaseAppCall();
            boolean shouldFailOnDataError = this.this$0.getShouldFailOnDataError();
            DialogFeature access$getFeature = ShareDialog.Companion.getFeature(shareContent.getClass());
            if (access$getFeature == null) {
                return null;
            }
            DialogPresenter dialogPresenter = DialogPresenter.INSTANCE;
            DialogPresenter.setupAppCallForNativeDialog(createBaseAppCall, new ShareDialog$CameraEffectHandler$createAppCall$1(createBaseAppCall, shareContent, shouldFailOnDataError), access$getFeature);
            return createBaseAppCall;
        }
    }

    /* compiled from: ShareDialog.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean canShowNative(Class<? extends ShareContent<?, ?>> cls) {
            DialogFeature feature = getFeature(cls);
            if (feature != null) {
                DialogPresenter dialogPresenter = DialogPresenter.INSTANCE;
                if (DialogPresenter.canPresentNativeDialogWithFeature(feature)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        public final boolean canShowWebCheck(ShareContent<?, ?> shareContent) {
            return canShowWebTypeCheck(shareContent.getClass());
        }

        private final boolean canShowWebTypeCheck(Class<? extends ShareContent<?, ?>> cls) {
            return ShareLinkContent.class.isAssignableFrom(cls) || (SharePhotoContent.class.isAssignableFrom(cls) && AccessToken.Companion.isCurrentAccessTokenActive());
        }

        /* access modifiers changed from: private */
        public final DialogFeature getFeature(Class<? extends ShareContent<?, ?>> cls) {
            if (ShareLinkContent.class.isAssignableFrom(cls)) {
                return ShareDialogFeature.SHARE_DIALOG;
            }
            if (SharePhotoContent.class.isAssignableFrom(cls)) {
                return ShareDialogFeature.PHOTOS;
            }
            if (ShareVideoContent.class.isAssignableFrom(cls)) {
                return ShareDialogFeature.VIDEO;
            }
            if (ShareMediaContent.class.isAssignableFrom(cls)) {
                return ShareDialogFeature.MULTIMEDIA;
            }
            if (ShareCameraEffectContent.class.isAssignableFrom(cls)) {
                return CameraEffectFeature.SHARE_CAMERA_EFFECT;
            }
            if (ShareStoryContent.class.isAssignableFrom(cls)) {
                return ShareStoryFeature.SHARE_STORY_ASSET;
            }
            return null;
        }

        public boolean canShow(Class<? extends ShareContent<?, ?>> cls) {
            m.f(cls, "contentType");
            return canShowWebTypeCheck(cls) || canShowNative(cls);
        }

        public void show(Activity activity, ShareContent<?, ?> shareContent) {
            m.f(activity, "activity");
            m.f(shareContent, "shareContent");
            new ShareDialog(activity).show(shareContent);
        }

        public void show(Fragment fragment, ShareContent<?, ?> shareContent) {
            m.f(fragment, "fragment");
            m.f(shareContent, "shareContent");
            show(new FragmentWrapper(fragment), shareContent);
        }

        public void show(android.app.Fragment fragment, ShareContent<?, ?> shareContent) {
            m.f(fragment, "fragment");
            m.f(shareContent, "shareContent");
            show(new FragmentWrapper(fragment), shareContent);
        }

        private final void show(FragmentWrapper fragmentWrapper, ShareContent<?, ?> shareContent) {
            new ShareDialog(fragmentWrapper, 0, 2, (g) null).show(shareContent);
        }
    }

    /* compiled from: ShareDialog.kt */
    private final class FeedHandler extends FacebookDialogBase<ShareContent<?, ?>, Sharer.Result>.ModeHandler {
        private Object mode = Mode.FEED;
        final /* synthetic */ ShareDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FeedHandler(ShareDialog shareDialog) {
            super(shareDialog);
            m.f(shareDialog, "this$0");
            this.this$0 = shareDialog;
        }

        public Object getMode() {
            return this.mode;
        }

        public void setMode(Object obj) {
            m.f(obj, "<set-?>");
            this.mode = obj;
        }

        public boolean canShow(ShareContent<?, ?> shareContent, boolean z10) {
            m.f(shareContent, FirebaseAnalytics.Param.CONTENT);
            return (shareContent instanceof ShareLinkContent) || (shareContent instanceof ShareFeedContent);
        }

        public AppCall createAppCall(ShareContent<?, ?> shareContent) {
            Bundle bundle;
            m.f(shareContent, FirebaseAnalytics.Param.CONTENT);
            ShareDialog shareDialog = this.this$0;
            shareDialog.logDialogShare(shareDialog.getActivityContext(), shareContent, Mode.FEED);
            AppCall createBaseAppCall = this.this$0.createBaseAppCall();
            if (shareContent instanceof ShareLinkContent) {
                ShareContentValidation shareContentValidation = ShareContentValidation.INSTANCE;
                ShareContentValidation.validateForWebShare(shareContent);
                WebDialogParameters webDialogParameters = WebDialogParameters.INSTANCE;
                bundle = WebDialogParameters.createForFeed((ShareLinkContent) shareContent);
            } else if (!(shareContent instanceof ShareFeedContent)) {
                return null;
            } else {
                WebDialogParameters webDialogParameters2 = WebDialogParameters.INSTANCE;
                bundle = WebDialogParameters.createForFeed((ShareFeedContent) shareContent);
            }
            DialogPresenter dialogPresenter = DialogPresenter.INSTANCE;
            DialogPresenter.setupAppCallForWebDialog(createBaseAppCall, ShareDialog.FEED_DIALOG, bundle);
            return createBaseAppCall;
        }
    }

    /* compiled from: ShareDialog.kt */
    public enum Mode {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED
    }

    /* compiled from: ShareDialog.kt */
    private final class NativeHandler extends FacebookDialogBase<ShareContent<?, ?>, Sharer.Result>.ModeHandler {
        private Object mode = Mode.NATIVE;
        final /* synthetic */ ShareDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NativeHandler(ShareDialog shareDialog) {
            super(shareDialog);
            m.f(shareDialog, "this$0");
            this.this$0 = shareDialog;
        }

        public Object getMode() {
            return this.mode;
        }

        public void setMode(Object obj) {
            m.f(obj, "<set-?>");
            this.mode = obj;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
            if (com.facebook.internal.DialogPresenter.canPresentNativeDialogWithFeature(com.facebook.share.internal.ShareDialogFeature.LINK_SHARE_QUOTES) != false) goto L_0x004a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0059 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean canShow(com.facebook.share.model.ShareContent<?, ?> r4, boolean r5) {
            /*
                r3 = this;
                java.lang.String r0 = "content"
                kotlin.jvm.internal.m.f(r4, r0)
                boolean r0 = r4 instanceof com.facebook.share.model.ShareCameraEffectContent
                r1 = 0
                if (r0 != 0) goto L_0x005a
                boolean r0 = r4 instanceof com.facebook.share.model.ShareStoryContent
                if (r0 == 0) goto L_0x000f
                goto L_0x005a
            L_0x000f:
                r0 = 1
                if (r5 != 0) goto L_0x004a
                com.facebook.share.model.ShareHashtag r5 = r4.getShareHashtag()
                if (r5 == 0) goto L_0x0021
                com.facebook.internal.DialogPresenter r5 = com.facebook.internal.DialogPresenter.INSTANCE
                com.facebook.share.internal.ShareDialogFeature r5 = com.facebook.share.internal.ShareDialogFeature.HASHTAG
                boolean r5 = com.facebook.internal.DialogPresenter.canPresentNativeDialogWithFeature(r5)
                goto L_0x0022
            L_0x0021:
                r5 = 1
            L_0x0022:
                boolean r2 = r4 instanceof com.facebook.share.model.ShareLinkContent
                if (r2 == 0) goto L_0x004b
                r2 = r4
                com.facebook.share.model.ShareLinkContent r2 = (com.facebook.share.model.ShareLinkContent) r2
                java.lang.String r2 = r2.getQuote()
                if (r2 == 0) goto L_0x0038
                int r2 = r2.length()
                if (r2 != 0) goto L_0x0036
                goto L_0x0038
            L_0x0036:
                r2 = 0
                goto L_0x0039
            L_0x0038:
                r2 = 1
            L_0x0039:
                if (r2 != 0) goto L_0x004b
                if (r5 == 0) goto L_0x0048
                com.facebook.internal.DialogPresenter r5 = com.facebook.internal.DialogPresenter.INSTANCE
                com.facebook.share.internal.ShareDialogFeature r5 = com.facebook.share.internal.ShareDialogFeature.LINK_SHARE_QUOTES
                boolean r5 = com.facebook.internal.DialogPresenter.canPresentNativeDialogWithFeature(r5)
                if (r5 == 0) goto L_0x0048
                goto L_0x004a
            L_0x0048:
                r5 = 0
                goto L_0x004b
            L_0x004a:
                r5 = 1
            L_0x004b:
                if (r5 == 0) goto L_0x005a
                com.facebook.share.widget.ShareDialog$Companion r5 = com.facebook.share.widget.ShareDialog.Companion
                java.lang.Class r4 = r4.getClass()
                boolean r4 = r5.canShowNative(r4)
                if (r4 == 0) goto L_0x005a
                r1 = 1
            L_0x005a:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.widget.ShareDialog.NativeHandler.canShow(com.facebook.share.model.ShareContent, boolean):boolean");
        }

        public AppCall createAppCall(ShareContent<?, ?> shareContent) {
            m.f(shareContent, FirebaseAnalytics.Param.CONTENT);
            ShareDialog shareDialog = this.this$0;
            shareDialog.logDialogShare(shareDialog.getActivityContext(), shareContent, Mode.NATIVE);
            ShareContentValidation shareContentValidation = ShareContentValidation.INSTANCE;
            ShareContentValidation.validateForNativeShare(shareContent);
            AppCall createBaseAppCall = this.this$0.createBaseAppCall();
            boolean shouldFailOnDataError = this.this$0.getShouldFailOnDataError();
            DialogFeature access$getFeature = ShareDialog.Companion.getFeature(shareContent.getClass());
            if (access$getFeature == null) {
                return null;
            }
            DialogPresenter dialogPresenter = DialogPresenter.INSTANCE;
            DialogPresenter.setupAppCallForNativeDialog(createBaseAppCall, new ShareDialog$NativeHandler$createAppCall$1(createBaseAppCall, shareContent, shouldFailOnDataError), access$getFeature);
            return createBaseAppCall;
        }
    }

    /* compiled from: ShareDialog.kt */
    private final class ShareStoryHandler extends FacebookDialogBase<ShareContent<?, ?>, Sharer.Result>.ModeHandler {
        private Object mode = Mode.NATIVE;
        final /* synthetic */ ShareDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ShareStoryHandler(ShareDialog shareDialog) {
            super(shareDialog);
            m.f(shareDialog, "this$0");
            this.this$0 = shareDialog;
        }

        public Object getMode() {
            return this.mode;
        }

        public void setMode(Object obj) {
            m.f(obj, "<set-?>");
            this.mode = obj;
        }

        public boolean canShow(ShareContent<?, ?> shareContent, boolean z10) {
            m.f(shareContent, FirebaseAnalytics.Param.CONTENT);
            return (shareContent instanceof ShareStoryContent) && ShareDialog.Companion.canShowNative(shareContent.getClass());
        }

        public AppCall createAppCall(ShareContent<?, ?> shareContent) {
            m.f(shareContent, FirebaseAnalytics.Param.CONTENT);
            ShareContentValidation shareContentValidation = ShareContentValidation.INSTANCE;
            ShareContentValidation.validateForStoryShare(shareContent);
            AppCall createBaseAppCall = this.this$0.createBaseAppCall();
            boolean shouldFailOnDataError = this.this$0.getShouldFailOnDataError();
            DialogFeature access$getFeature = ShareDialog.Companion.getFeature(shareContent.getClass());
            if (access$getFeature == null) {
                return null;
            }
            DialogPresenter dialogPresenter = DialogPresenter.INSTANCE;
            DialogPresenter.setupAppCallForNativeDialog(createBaseAppCall, new ShareDialog$ShareStoryHandler$createAppCall$1(createBaseAppCall, shareContent, shouldFailOnDataError), access$getFeature);
            return createBaseAppCall;
        }
    }

    /* compiled from: ShareDialog.kt */
    private final class WebShareHandler extends FacebookDialogBase<ShareContent<?, ?>, Sharer.Result>.ModeHandler {
        private Object mode = Mode.WEB;
        final /* synthetic */ ShareDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public WebShareHandler(ShareDialog shareDialog) {
            super(shareDialog);
            m.f(shareDialog, "this$0");
            this.this$0 = shareDialog;
        }

        private final SharePhotoContent createAndMapAttachments(SharePhotoContent sharePhotoContent, UUID uuid) {
            SharePhotoContent.Builder readFrom = new SharePhotoContent.Builder().readFrom(sharePhotoContent);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = sharePhotoContent.getPhotos().size() - 1;
            if (size >= 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    SharePhoto sharePhoto = sharePhotoContent.getPhotos().get(i10);
                    Bitmap bitmap = sharePhoto.getBitmap();
                    if (bitmap != null) {
                        NativeAppCallAttachmentStore nativeAppCallAttachmentStore = NativeAppCallAttachmentStore.INSTANCE;
                        NativeAppCallAttachmentStore.Attachment createAttachment = NativeAppCallAttachmentStore.createAttachment(uuid, bitmap);
                        sharePhoto = new SharePhoto.Builder().readFrom(sharePhoto).setImageUrl(Uri.parse(createAttachment.getAttachmentUrl())).setBitmap((Bitmap) null).build();
                        arrayList2.add(createAttachment);
                    }
                    arrayList.add(sharePhoto);
                    if (i11 > size) {
                        break;
                    }
                    i10 = i11;
                }
            }
            readFrom.setPhotos(arrayList);
            NativeAppCallAttachmentStore nativeAppCallAttachmentStore2 = NativeAppCallAttachmentStore.INSTANCE;
            NativeAppCallAttachmentStore.addAttachments(arrayList2);
            return readFrom.build();
        }

        private final String getActionName(ShareContent<?, ?> shareContent) {
            if ((shareContent instanceof ShareLinkContent) || (shareContent instanceof SharePhotoContent)) {
                return "share";
            }
            return null;
        }

        public Object getMode() {
            return this.mode;
        }

        public void setMode(Object obj) {
            m.f(obj, "<set-?>");
            this.mode = obj;
        }

        public boolean canShow(ShareContent<?, ?> shareContent, boolean z10) {
            m.f(shareContent, FirebaseAnalytics.Param.CONTENT);
            return ShareDialog.Companion.canShowWebCheck(shareContent);
        }

        public AppCall createAppCall(ShareContent<?, ?> shareContent) {
            Bundle bundle;
            m.f(shareContent, FirebaseAnalytics.Param.CONTENT);
            ShareDialog shareDialog = this.this$0;
            shareDialog.logDialogShare(shareDialog.getActivityContext(), shareContent, Mode.WEB);
            AppCall createBaseAppCall = this.this$0.createBaseAppCall();
            ShareContentValidation shareContentValidation = ShareContentValidation.INSTANCE;
            ShareContentValidation.validateForWebShare(shareContent);
            if (shareContent instanceof ShareLinkContent) {
                WebDialogParameters webDialogParameters = WebDialogParameters.INSTANCE;
                bundle = WebDialogParameters.create((ShareLinkContent) shareContent);
            } else if (!(shareContent instanceof SharePhotoContent)) {
                return null;
            } else {
                SharePhotoContent createAndMapAttachments = createAndMapAttachments((SharePhotoContent) shareContent, createBaseAppCall.getCallId());
                WebDialogParameters webDialogParameters2 = WebDialogParameters.INSTANCE;
                bundle = WebDialogParameters.create(createAndMapAttachments);
            }
            DialogPresenter dialogPresenter = DialogPresenter.INSTANCE;
            DialogPresenter.setupAppCallForWebDialog(createBaseAppCall, getActionName(shareContent), bundle);
            return createBaseAppCall;
        }
    }

    /* compiled from: ShareDialog.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            iArr[Mode.AUTOMATIC.ordinal()] = 1;
            iArr[Mode.WEB.ordinal()] = 2;
            iArr[Mode.NATIVE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShareDialog(Activity activity) {
        this(activity, DEFAULT_REQUEST_CODE);
        m.f(activity, "activity");
    }

    public static boolean canShow(Class<? extends ShareContent<?, ?>> cls) {
        return Companion.canShow(cls);
    }

    /* access modifiers changed from: private */
    public final void logDialogShare(Context context, ShareContent<?, ?> shareContent, Mode mode) {
        if (this.isAutomaticMode) {
            mode = Mode.AUTOMATIC;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        String str = "unknown";
        String str2 = i10 != 1 ? i10 != 2 ? i10 != 3 ? str : AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE : AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_WEB : AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC;
        DialogFeature access$getFeature = Companion.getFeature(shareContent.getClass());
        if (access$getFeature == ShareDialogFeature.SHARE_DIALOG) {
            str = AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS;
        } else if (access$getFeature == ShareDialogFeature.PHOTOS) {
            str = AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO;
        } else if (access$getFeature == ShareDialogFeature.VIDEO) {
            str = AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO;
        }
        InternalAppEventsLogger.Companion companion = InternalAppEventsLogger.Companion;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        InternalAppEventsLogger createInstance = companion.createInstance(context, FacebookSdk.getApplicationId());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", str2);
        bundle.putString(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_TYPE, str);
        createInstance.logEventImplicitly("fb_share_dialog_show", bundle);
    }

    public static void show(Activity activity, ShareContent<?, ?> shareContent) {
        Companion.show(activity, shareContent);
    }

    public static void show(android.app.Fragment fragment, ShareContent<?, ?> shareContent) {
        Companion.show(fragment, shareContent);
    }

    public static void show(Fragment fragment, ShareContent<?, ?> shareContent) {
        Companion.show(fragment, shareContent);
    }

    public boolean canShow(ShareContent<?, ?> shareContent, Mode mode) {
        m.f(shareContent, FirebaseAnalytics.Param.CONTENT);
        m.f(mode, "mode");
        Object obj = mode;
        if (mode == Mode.AUTOMATIC) {
            obj = FacebookDialogBase.BASE_AUTOMATIC_MODE;
        }
        return canShowImpl(shareContent, obj);
    }

    /* access modifiers changed from: protected */
    public AppCall createBaseAppCall() {
        return new AppCall(getRequestCode(), (UUID) null, 2, (g) null);
    }

    /* access modifiers changed from: protected */
    public List<FacebookDialogBase<ShareContent<?, ?>, Sharer.Result>.ModeHandler> getOrderedModeHandlers() {
        return this.orderedModeHandlers;
    }

    public boolean getShouldFailOnDataError() {
        return this.shouldFailOnDataError;
    }

    /* access modifiers changed from: protected */
    public void registerCallbackImpl(CallbackManagerImpl callbackManagerImpl, FacebookCallback<Sharer.Result> facebookCallback) {
        m.f(callbackManagerImpl, "callbackManager");
        m.f(facebookCallback, "callback");
        ShareInternalUtility shareInternalUtility = ShareInternalUtility.INSTANCE;
        ShareInternalUtility.registerSharerCallback(getRequestCode(), callbackManagerImpl, facebookCallback);
    }

    public void setShouldFailOnDataError(boolean z10) {
        this.shouldFailOnDataError = z10;
    }

    public void show(ShareContent<?, ?> shareContent, Mode mode) {
        m.f(shareContent, FirebaseAnalytics.Param.CONTENT);
        m.f(mode, "mode");
        boolean z10 = mode == Mode.AUTOMATIC;
        this.isAutomaticMode = z10;
        Object obj = mode;
        if (z10) {
            obj = FacebookDialogBase.BASE_AUTOMATIC_MODE;
        }
        showImpl(shareContent, obj);
    }

    public ShareDialog(int i10) {
        super(i10);
        this.isAutomaticMode = true;
        this.orderedModeHandlers = p.c(new NativeHandler(this), new FeedHandler(this), new WebShareHandler(this), new CameraEffectHandler(this), new ShareStoryHandler(this));
        ShareInternalUtility shareInternalUtility = ShareInternalUtility.INSTANCE;
        ShareInternalUtility.registerStaticShareCallback(i10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShareDialog(int i10, int i11, g gVar) {
        this((i11 & 1) != 0 ? DEFAULT_REQUEST_CODE : i10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShareDialog(Fragment fragment) {
        this(new FragmentWrapper(fragment), 0, 2, (g) null);
        m.f(fragment, "fragment");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShareDialog(android.app.Fragment fragment) {
        this(new FragmentWrapper(fragment), 0, 2, (g) null);
        m.f(fragment, "fragment");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareDialog(Activity activity, int i10) {
        super(activity, i10);
        m.f(activity, "activity");
        this.isAutomaticMode = true;
        this.orderedModeHandlers = p.c(new NativeHandler(this), new FeedHandler(this), new WebShareHandler(this), new CameraEffectHandler(this), new ShareStoryHandler(this));
        ShareInternalUtility shareInternalUtility = ShareInternalUtility.INSTANCE;
        ShareInternalUtility.registerStaticShareCallback(i10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShareDialog(Fragment fragment, int i10) {
        this(new FragmentWrapper(fragment), i10);
        m.f(fragment, "fragment");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShareDialog(android.app.Fragment fragment, int i10) {
        this(new FragmentWrapper(fragment), i10);
        m.f(fragment, "fragment");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShareDialog(FragmentWrapper fragmentWrapper, int i10, int i11, g gVar) {
        this(fragmentWrapper, (i11 & 2) != 0 ? DEFAULT_REQUEST_CODE : i10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareDialog(FragmentWrapper fragmentWrapper, int i10) {
        super(fragmentWrapper, i10);
        m.f(fragmentWrapper, "fragmentWrapper");
        this.isAutomaticMode = true;
        this.orderedModeHandlers = p.c(new NativeHandler(this), new FeedHandler(this), new WebShareHandler(this), new CameraEffectHandler(this), new ShareStoryHandler(this));
        ShareInternalUtility shareInternalUtility = ShareInternalUtility.INSTANCE;
        ShareInternalUtility.registerStaticShareCallback(i10);
    }
}
