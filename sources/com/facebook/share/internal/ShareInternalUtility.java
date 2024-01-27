package com.facebook.share.internal;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.NativeAppCallAttachmentStore;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.share.Sharer;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ShareInternalUtility.kt */
public final class ShareInternalUtility {
    public static final ShareInternalUtility INSTANCE = new ShareInternalUtility();
    public static final String MY_STAGING_RESOURCES = "me/staging_resources";
    public static final String STAGING_PARAM = "file";

    private ShareInternalUtility() {
    }

    private final AppCall getAppCallFromActivityResult(int i10, int i11, Intent intent) {
        NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
        UUID callIdFromIntent = NativeProtocol.getCallIdFromIntent(intent);
        if (callIdFromIntent == null) {
            return null;
        }
        return AppCall.Companion.finishPendingCall(callIdFromIntent, i10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.graphics.Bitmap] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.facebook.internal.NativeAppCallAttachmentStore.Attachment getAttachment(java.util.UUID r4, com.facebook.share.model.ShareMedia<?, ?> r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof com.facebook.share.model.SharePhoto
            r1 = 0
            if (r0 == 0) goto L_0x0013
            com.facebook.share.model.SharePhoto r5 = (com.facebook.share.model.SharePhoto) r5
            android.graphics.Bitmap r1 = r5.getBitmap()
            android.net.Uri r5 = r5.getImageUrl()
        L_0x000f:
            r2 = r1
            r1 = r5
            r5 = r2
            goto L_0x001f
        L_0x0013:
            boolean r0 = r5 instanceof com.facebook.share.model.ShareVideo
            if (r0 == 0) goto L_0x001e
            com.facebook.share.model.ShareVideo r5 = (com.facebook.share.model.ShareVideo) r5
            android.net.Uri r5 = r5.getLocalUrl()
            goto L_0x000f
        L_0x001e:
            r5 = r1
        L_0x001f:
            com.facebook.internal.NativeAppCallAttachmentStore$Attachment r4 = r3.getAttachment(r4, r1, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.ShareInternalUtility.getAttachment(java.util.UUID, com.facebook.share.model.ShareMedia):com.facebook.internal.NativeAppCallAttachmentStore$Attachment");
    }

    public static final Bundle getBackgroundAssetMediaInfo(ShareStoryContent shareStoryContent, UUID uuid) {
        m.f(uuid, "appCallId");
        Bundle bundle = null;
        if (!(shareStoryContent == null || shareStoryContent.getBackgroundAsset() == null)) {
            ShareMedia<?, ?> backgroundAsset = shareStoryContent.getBackgroundAsset();
            NativeAppCallAttachmentStore.Attachment attachment = INSTANCE.getAttachment(uuid, backgroundAsset);
            if (attachment == null) {
                return null;
            }
            bundle = new Bundle();
            bundle.putString(ShareConstants.MEDIA_TYPE, backgroundAsset.getMediaType().name());
            bundle.putString(ShareConstants.MEDIA_URI, attachment.getAttachmentUrl());
            String uriExtension = getUriExtension(attachment.getOriginalUri());
            if (uriExtension != null) {
                Utility utility = Utility.INSTANCE;
                Utility.putNonEmptyString(bundle, ShareConstants.MEDIA_EXTENSION, uriExtension);
            }
            NativeAppCallAttachmentStore nativeAppCallAttachmentStore = NativeAppCallAttachmentStore.INSTANCE;
            NativeAppCallAttachmentStore.addAttachments(o.b(attachment));
        }
        return bundle;
    }

    public static final Pair<String, String> getFieldNameAndNamespaceFromFullName(String str) {
        String str2;
        int i10;
        m.f(str, "fullName");
        int G = q.G(str, ':', 0, false, 6, (Object) null);
        if (G == -1 || str.length() <= (i10 = G + 1)) {
            str2 = null;
        } else {
            str2 = str.substring(0, G);
            m.e(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            str = str.substring(i10);
            m.e(str, "(this as java.lang.String).substring(startIndex)");
        }
        return new Pair<>(str2, str);
    }

    public static final List<Bundle> getMediaInfos(ShareMediaContent shareMediaContent, UUID uuid) {
        Bundle bundle;
        m.f(uuid, "appCallId");
        List<ShareMedia<?, ?>> media = shareMediaContent == null ? null : shareMediaContent.getMedia();
        if (media == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ShareMedia shareMedia : media) {
            NativeAppCallAttachmentStore.Attachment attachment = INSTANCE.getAttachment(uuid, shareMedia);
            if (attachment == null) {
                bundle = null;
            } else {
                arrayList.add(attachment);
                bundle = new Bundle();
                bundle.putString(ShareConstants.MEDIA_TYPE, shareMedia.getMediaType().name());
                bundle.putString(ShareConstants.MEDIA_URI, attachment.getAttachmentUrl());
            }
            if (bundle != null) {
                arrayList2.add(bundle);
            }
        }
        NativeAppCallAttachmentStore nativeAppCallAttachmentStore = NativeAppCallAttachmentStore.INSTANCE;
        NativeAppCallAttachmentStore.addAttachments(arrayList);
        return arrayList2;
    }

    public static final String getNativeDialogCompletionGesture(Bundle bundle) {
        m.f(bundle, "result");
        if (bundle.containsKey(NativeProtocol.RESULT_ARGS_DIALOG_COMPLETION_GESTURE_KEY)) {
            return bundle.getString(NativeProtocol.RESULT_ARGS_DIALOG_COMPLETION_GESTURE_KEY);
        }
        return bundle.getString(NativeProtocol.EXTRA_DIALOG_COMPLETION_GESTURE_KEY);
    }

    public static final List<String> getPhotoUrls(SharePhotoContent sharePhotoContent, UUID uuid) {
        m.f(uuid, "appCallId");
        List<SharePhoto> photos = sharePhotoContent == null ? null : sharePhotoContent.getPhotos();
        if (photos == null) {
            return null;
        }
        ArrayList<NativeAppCallAttachmentStore.Attachment> arrayList = new ArrayList<>();
        for (SharePhoto attachment : photos) {
            NativeAppCallAttachmentStore.Attachment attachment2 = INSTANCE.getAttachment(uuid, attachment);
            if (attachment2 != null) {
                arrayList.add(attachment2);
            }
        }
        ArrayList arrayList2 = new ArrayList(q.l(arrayList, 10));
        for (NativeAppCallAttachmentStore.Attachment attachmentUrl : arrayList) {
            arrayList2.add(attachmentUrl.getAttachmentUrl());
        }
        NativeAppCallAttachmentStore nativeAppCallAttachmentStore = NativeAppCallAttachmentStore.INSTANCE;
        NativeAppCallAttachmentStore.addAttachments(arrayList);
        return arrayList2;
    }

    public static final String getShareDialogPostId(Bundle bundle) {
        m.f(bundle, "result");
        if (bundle.containsKey(ShareConstants.RESULT_POST_ID)) {
            return bundle.getString(ShareConstants.RESULT_POST_ID);
        }
        if (bundle.containsKey(ShareConstants.EXTRA_RESULT_POST_ID)) {
            return bundle.getString(ShareConstants.EXTRA_RESULT_POST_ID);
        }
        return bundle.getString(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID);
    }

    public static final ResultProcessor getShareResultProcessor(FacebookCallback<Sharer.Result> facebookCallback) {
        return new ShareInternalUtility$getShareResultProcessor$1(facebookCallback);
    }

    public static final Bundle getStickerUrl(ShareStoryContent shareStoryContent, UUID uuid) {
        m.f(uuid, "appCallId");
        if (shareStoryContent == null || shareStoryContent.getStickerAsset() == null) {
            return null;
        }
        new ArrayList().add(shareStoryContent.getStickerAsset());
        NativeAppCallAttachmentStore.Attachment attachment = INSTANCE.getAttachment(uuid, shareStoryContent.getStickerAsset());
        if (attachment == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString(ShareConstants.MEDIA_URI, attachment.getAttachmentUrl());
        String uriExtension = getUriExtension(attachment.getOriginalUri());
        if (uriExtension != null) {
            Utility utility = Utility.INSTANCE;
            Utility.putNonEmptyString(bundle, ShareConstants.MEDIA_EXTENSION, uriExtension);
        }
        NativeAppCallAttachmentStore nativeAppCallAttachmentStore = NativeAppCallAttachmentStore.INSTANCE;
        NativeAppCallAttachmentStore.addAttachments(o.b(attachment));
        return bundle;
    }

    public static final Bundle getTextureUrlBundle(ShareCameraEffectContent shareCameraEffectContent, UUID uuid) {
        m.f(uuid, "appCallId");
        CameraEffectTextures textures = shareCameraEffectContent == null ? null : shareCameraEffectContent.getTextures();
        if (textures == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        for (String next : textures.keySet()) {
            NativeAppCallAttachmentStore.Attachment attachment = INSTANCE.getAttachment(uuid, textures.getTextureUri(next), textures.getTextureBitmap(next));
            if (attachment != null) {
                arrayList.add(attachment);
                bundle.putString(next, attachment.getAttachmentUrl());
            }
        }
        NativeAppCallAttachmentStore nativeAppCallAttachmentStore = NativeAppCallAttachmentStore.INSTANCE;
        NativeAppCallAttachmentStore.addAttachments(arrayList);
        return bundle;
    }

    public static final String getUriExtension(Uri uri) {
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        m.e(uri2, "uri.toString()");
        int L = q.L(uri2, '.', 0, false, 6, (Object) null);
        if (L == -1) {
            return null;
        }
        String substring = uri2.substring(L);
        m.e(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r1 = r1.getVideo();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String getVideoUrl(com.facebook.share.model.ShareVideoContent r1, java.util.UUID r2) {
        /*
            java.lang.String r0 = "appCallId"
            kotlin.jvm.internal.m.f(r2, r0)
            r0 = 0
            if (r1 != 0) goto L_0x000a
        L_0x0008:
            r1 = r0
            goto L_0x0015
        L_0x000a:
            com.facebook.share.model.ShareVideo r1 = r1.getVideo()
            if (r1 != 0) goto L_0x0011
            goto L_0x0008
        L_0x0011:
            android.net.Uri r1 = r1.getLocalUrl()
        L_0x0015:
            if (r1 != 0) goto L_0x0018
            return r0
        L_0x0018:
            com.facebook.internal.NativeAppCallAttachmentStore r0 = com.facebook.internal.NativeAppCallAttachmentStore.INSTANCE
            com.facebook.internal.NativeAppCallAttachmentStore$Attachment r1 = com.facebook.internal.NativeAppCallAttachmentStore.createAttachment((java.util.UUID) r2, (android.net.Uri) r1)
            java.util.List r2 = p8.o.b(r1)
            com.facebook.internal.NativeAppCallAttachmentStore.addAttachments(r2)
            java.lang.String r1 = r1.getAttachmentUrl()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.ShareInternalUtility.getVideoUrl(com.facebook.share.model.ShareVideoContent, java.util.UUID):java.lang.String");
    }

    public static final boolean handleActivityResult(int i10, int i11, Intent intent, ResultProcessor resultProcessor) {
        FacebookException facebookException;
        AppCall appCallFromActivityResult = INSTANCE.getAppCallFromActivityResult(i10, i11, intent);
        if (appCallFromActivityResult == null) {
            return false;
        }
        NativeAppCallAttachmentStore nativeAppCallAttachmentStore = NativeAppCallAttachmentStore.INSTANCE;
        NativeAppCallAttachmentStore.cleanupAttachmentsForCall(appCallFromActivityResult.getCallId());
        if (resultProcessor == null) {
            return true;
        }
        Bundle bundle = null;
        if (intent != null) {
            NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
            facebookException = NativeProtocol.getExceptionFromErrorData(NativeProtocol.getErrorDataFromResultIntent(intent));
        } else {
            facebookException = null;
        }
        if (facebookException == null) {
            if (intent != null) {
                NativeProtocol nativeProtocol2 = NativeProtocol.INSTANCE;
                bundle = NativeProtocol.getSuccessResultsFromIntent(intent);
            }
            resultProcessor.onSuccess(appCallFromActivityResult, bundle);
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            resultProcessor.onCancel(appCallFromActivityResult);
        } else {
            resultProcessor.onError(appCallFromActivityResult, facebookException);
        }
        return true;
    }

    public static final void invokeCallbackWithError(FacebookCallback<Sharer.Result> facebookCallback, String str) {
        invokeOnErrorCallback(facebookCallback, str);
    }

    public static final void invokeCallbackWithException(FacebookCallback<Sharer.Result> facebookCallback, Exception exc) {
        m.f(exc, Constants.EXCEPTION);
        if (exc instanceof FacebookException) {
            invokeOnErrorCallback(facebookCallback, (FacebookException) exc);
        } else {
            invokeCallbackWithError(facebookCallback, m.o("Error preparing share content: ", exc.getLocalizedMessage()));
        }
    }

    public static final void invokeCallbackWithResults(FacebookCallback<Sharer.Result> facebookCallback, String str, GraphResponse graphResponse) {
        m.f(graphResponse, "graphResponse");
        FacebookRequestError error = graphResponse.getError();
        if (error != null) {
            String errorMessage = error.getErrorMessage();
            Utility utility = Utility.INSTANCE;
            if (Utility.isNullOrEmpty(errorMessage)) {
                errorMessage = "Unexpected error sharing.";
            }
            invokeOnErrorCallback(facebookCallback, graphResponse, errorMessage);
            return;
        }
        invokeOnSuccessCallback(facebookCallback, str);
    }

    public static final void invokeOnCancelCallback(FacebookCallback<Sharer.Result> facebookCallback) {
        INSTANCE.logShareResult(AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED, (String) null);
        if (facebookCallback != null) {
            facebookCallback.onCancel();
        }
    }

    public static final void invokeOnErrorCallback(FacebookCallback<Sharer.Result> facebookCallback, GraphResponse graphResponse, String str) {
        INSTANCE.logShareResult("error", str);
        if (facebookCallback != null) {
            facebookCallback.onError(new FacebookGraphResponseException(graphResponse, str));
        }
    }

    public static final void invokeOnSuccessCallback(FacebookCallback<Sharer.Result> facebookCallback, String str) {
        INSTANCE.logShareResult(AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED, (String) null);
        if (facebookCallback != null) {
            facebookCallback.onSuccess(new Sharer.Result(str));
        }
    }

    private final void logShareResult(String str, String str2) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(FacebookSdk.getApplicationContext());
        Bundle bundle = new Bundle();
        bundle.putString(AnalyticsEvents.PARAMETER_SHARE_OUTCOME, str);
        if (str2 != null) {
            bundle.putString(AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE, str2);
        }
        internalAppEventsLogger.logEventImplicitly(AnalyticsEvents.EVENT_SHARE_RESULT, bundle);
    }

    public static final GraphRequest newUploadStagingResourceWithImageRequest(AccessToken accessToken, Bitmap bitmap, GraphRequest.Callback callback) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", bitmap);
        return new GraphRequest(accessToken, MY_STAGING_RESOURCES, bundle, HttpMethod.POST, callback, (String) null, 32, (g) null);
    }

    public static final void registerSharerCallback(int i10, CallbackManager callbackManager, FacebookCallback<Sharer.Result> facebookCallback) {
        if (callbackManager instanceof CallbackManagerImpl) {
            ((CallbackManagerImpl) callbackManager).registerCallback(i10, new b(i10, facebookCallback));
            return;
        }
        throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
    }

    /* access modifiers changed from: private */
    /* renamed from: registerSharerCallback$lambda-1  reason: not valid java name */
    public static final boolean m155registerSharerCallback$lambda1(int i10, FacebookCallback facebookCallback, int i11, Intent intent) {
        return handleActivityResult(i10, i11, intent, getShareResultProcessor(facebookCallback));
    }

    public static final void registerStaticShareCallback(int i10) {
        CallbackManagerImpl.Companion.registerStaticCallback(i10, new a(i10));
    }

    /* access modifiers changed from: private */
    /* renamed from: registerStaticShareCallback$lambda-0  reason: not valid java name */
    public static final boolean m156registerStaticShareCallback$lambda0(int i10, int i11, Intent intent) {
        return handleActivityResult(i10, i11, intent, getShareResultProcessor((FacebookCallback<Sharer.Result>) null));
    }

    public static final JSONArray removeNamespacesFromOGJsonArray(JSONArray jSONArray, boolean z10) {
        m.f(jSONArray, "jsonArray");
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                Object obj = jSONArray.get(i10);
                if (obj instanceof JSONArray) {
                    obj = removeNamespacesFromOGJsonArray((JSONArray) obj, z10);
                } else if (obj instanceof JSONObject) {
                    obj = removeNamespacesFromOGJsonObject((JSONObject) obj, z10);
                }
                jSONArray2.put(obj);
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return jSONArray2;
    }

    public static final JSONObject removeNamespacesFromOGJsonObject(JSONObject jSONObject, boolean z10) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray names = jSONObject.names();
            if (names == null) {
                return null;
            }
            int i10 = 0;
            int length = names.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    String string = names.getString(i10);
                    Object obj = jSONObject.get(string);
                    if (obj instanceof JSONObject) {
                        obj = removeNamespacesFromOGJsonObject((JSONObject) obj, true);
                    } else if (obj instanceof JSONArray) {
                        obj = removeNamespacesFromOGJsonArray((JSONArray) obj, true);
                    }
                    m.e(string, Constants.KEY);
                    Pair<String, String> fieldNameAndNamespaceFromFullName = getFieldNameAndNamespaceFromFullName(string);
                    String str = (String) fieldNameAndNamespaceFromFullName.first;
                    String str2 = (String) fieldNameAndNamespaceFromFullName.second;
                    if (z10) {
                        if (str == null || !m.a(str, DeviceRequestsHelper.SDK_HEADER)) {
                            if (str != null) {
                                if (!m.a(str, "og")) {
                                    jSONObject3.put(str2, obj);
                                }
                            }
                            jSONObject2.put(str2, obj);
                        } else {
                            jSONObject2.put(string, obj);
                        }
                    } else if (str == null || !m.a(str, "fb")) {
                        jSONObject2.put(str2, obj);
                    } else {
                        jSONObject2.put(string, obj);
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("data", jSONObject3);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            throw new FacebookException("Failed to create json object from share content");
        }
    }

    public static final void invokeOnErrorCallback(FacebookCallback<Sharer.Result> facebookCallback, String str) {
        INSTANCE.logShareResult("error", str);
        if (facebookCallback != null) {
            facebookCallback.onError(new FacebookException(str));
        }
    }

    public static final GraphRequest newUploadStagingResourceWithImageRequest(AccessToken accessToken, File file, GraphRequest.Callback callback) {
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, MY_STAGING_RESOURCES, bundle, HttpMethod.POST, callback, (String) null, 32, (g) null);
    }

    public static final void invokeOnErrorCallback(FacebookCallback<Sharer.Result> facebookCallback, FacebookException facebookException) {
        m.f(facebookException, "ex");
        INSTANCE.logShareResult("error", facebookException.getMessage());
        if (facebookCallback != null) {
            facebookCallback.onError(facebookException);
        }
    }

    private final NativeAppCallAttachmentStore.Attachment getAttachment(UUID uuid, Uri uri, Bitmap bitmap) {
        if (bitmap != null) {
            NativeAppCallAttachmentStore nativeAppCallAttachmentStore = NativeAppCallAttachmentStore.INSTANCE;
            return NativeAppCallAttachmentStore.createAttachment(uuid, bitmap);
        } else if (uri == null) {
            return null;
        } else {
            NativeAppCallAttachmentStore nativeAppCallAttachmentStore2 = NativeAppCallAttachmentStore.INSTANCE;
            return NativeAppCallAttachmentStore.createAttachment(uuid, uri);
        }
    }

    public static final GraphRequest newUploadStagingResourceWithImageRequest(AccessToken accessToken, Uri uri, GraphRequest.Callback callback) {
        m.f(uri, "imageUri");
        String path = uri.getPath();
        Utility utility = Utility.INSTANCE;
        if (Utility.isFileUri(uri) && path != null) {
            return newUploadStagingResourceWithImageRequest(accessToken, new File(path), callback);
        }
        if (Utility.isContentUri(uri)) {
            GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(uri, "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", parcelableResourceWithMimeType);
            return new GraphRequest(accessToken, MY_STAGING_RESOURCES, bundle, HttpMethod.POST, callback, (String) null, 32, (g) null);
        }
        throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
    }
}
