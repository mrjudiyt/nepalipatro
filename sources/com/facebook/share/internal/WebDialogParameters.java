package com.facebook.share.internal;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.Utility;
import com.facebook.share.model.AppGroupCreationContent;
import com.facebook.share.model.GameRequestContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.m;

/* compiled from: WebDialogParameters.kt */
public final class WebDialogParameters {
    public static final WebDialogParameters INSTANCE = new WebDialogParameters();

    private WebDialogParameters() {
    }

    public static final Bundle create(AppGroupCreationContent appGroupCreationContent) {
        String str;
        m.f(appGroupCreationContent, "appGroupCreationContent");
        Bundle bundle = new Bundle();
        Utility utility = Utility.INSTANCE;
        Utility.putNonEmptyString(bundle, "name", appGroupCreationContent.getName());
        Utility.putNonEmptyString(bundle, "description", appGroupCreationContent.getDescription());
        AppGroupCreationContent.AppGroupPrivacy appGroupPrivacy = appGroupCreationContent.getAppGroupPrivacy();
        String str2 = null;
        if (!(appGroupPrivacy == null || (str = appGroupPrivacy.toString()) == null)) {
            Locale locale = Locale.ENGLISH;
            m.e(locale, ViewHierarchyConstants.ENGLISH);
            str2 = str.toLowerCase(locale);
            m.e(str2, "(this as java.lang.String).toLowerCase(locale)");
        }
        Utility.putNonEmptyString(bundle, ShareConstants.WEB_DIALOG_PARAM_PRIVACY, str2);
        return bundle;
    }

    public static final Bundle createBaseParameters(ShareContent<?, ?> shareContent) {
        m.f(shareContent, "shareContent");
        Bundle bundle = new Bundle();
        Utility utility = Utility.INSTANCE;
        ShareHashtag shareHashtag = shareContent.getShareHashtag();
        Utility.putNonEmptyString(bundle, ShareConstants.WEB_DIALOG_PARAM_HASHTAG, shareHashtag == null ? null : shareHashtag.getHashtag());
        return bundle;
    }

    @SuppressLint({"DeprecatedMethod"})
    public static final Bundle createForFeed(ShareLinkContent shareLinkContent) {
        m.f(shareLinkContent, "shareLinkContent");
        Bundle bundle = new Bundle();
        Utility utility = Utility.INSTANCE;
        Utility.putNonEmptyString(bundle, "link", Utility.getUriString(shareLinkContent.getContentUrl()));
        Utility.putNonEmptyString(bundle, ShareConstants.WEB_DIALOG_PARAM_QUOTE, shareLinkContent.getQuote());
        ShareHashtag shareHashtag = shareLinkContent.getShareHashtag();
        Utility.putNonEmptyString(bundle, ShareConstants.WEB_DIALOG_PARAM_HASHTAG, shareHashtag == null ? null : shareHashtag.getHashtag());
        return bundle;
    }

    public static final Bundle create(GameRequestContent gameRequestContent) {
        String str;
        String str2;
        String str3;
        m.f(gameRequestContent, "gameRequestContent");
        Bundle bundle = new Bundle();
        Utility utility = Utility.INSTANCE;
        Utility.putNonEmptyString(bundle, "message", gameRequestContent.getMessage());
        Utility.putCommaSeparatedStringList(bundle, "to", gameRequestContent.getRecipients());
        Utility.putNonEmptyString(bundle, ShareConstants.WEB_DIALOG_PARAM_TITLE, gameRequestContent.getTitle());
        Utility.putNonEmptyString(bundle, "data", gameRequestContent.getData());
        GameRequestContent.ActionType actionType = gameRequestContent.getActionType();
        String str4 = null;
        if (actionType == null || (str3 = actionType.toString()) == null) {
            str = null;
        } else {
            Locale locale = Locale.ENGLISH;
            m.e(locale, ViewHierarchyConstants.ENGLISH);
            str = str3.toLowerCase(locale);
            m.e(str, "(this as java.lang.String).toLowerCase(locale)");
        }
        Utility.putNonEmptyString(bundle, ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, str);
        Utility.putNonEmptyString(bundle, "object_id", gameRequestContent.getObjectId());
        GameRequestContent.Filters filters = gameRequestContent.getFilters();
        if (!(filters == null || (str2 = filters.toString()) == null)) {
            Locale locale2 = Locale.ENGLISH;
            m.e(locale2, ViewHierarchyConstants.ENGLISH);
            str4 = str2.toLowerCase(locale2);
            m.e(str4, "(this as java.lang.String).toLowerCase(locale)");
        }
        Utility.putNonEmptyString(bundle, ShareConstants.WEB_DIALOG_PARAM_FILTERS, str4);
        Utility.putCommaSeparatedStringList(bundle, "suggestions", gameRequestContent.getSuggestions());
        return bundle;
    }

    public static final Bundle createForFeed(ShareFeedContent shareFeedContent) {
        m.f(shareFeedContent, "shareFeedContent");
        Bundle bundle = new Bundle();
        Utility utility = Utility.INSTANCE;
        Utility.putNonEmptyString(bundle, "to", shareFeedContent.getToId());
        Utility.putNonEmptyString(bundle, "link", shareFeedContent.getLink());
        Utility.putNonEmptyString(bundle, "picture", shareFeedContent.getPicture());
        Utility.putNonEmptyString(bundle, "source", shareFeedContent.getMediaSource());
        Utility.putNonEmptyString(bundle, "name", shareFeedContent.getLinkName());
        Utility.putNonEmptyString(bundle, ShareConstants.FEED_CAPTION_PARAM, shareFeedContent.getLinkCaption());
        Utility.putNonEmptyString(bundle, "description", shareFeedContent.getLinkDescription());
        return bundle;
    }

    public static final Bundle create(ShareLinkContent shareLinkContent) {
        m.f(shareLinkContent, "shareLinkContent");
        Bundle createBaseParameters = createBaseParameters(shareLinkContent);
        Utility utility = Utility.INSTANCE;
        Utility.putUri(createBaseParameters, ShareConstants.WEB_DIALOG_PARAM_HREF, shareLinkContent.getContentUrl());
        Utility.putNonEmptyString(createBaseParameters, ShareConstants.WEB_DIALOG_PARAM_QUOTE, shareLinkContent.getQuote());
        return createBaseParameters;
    }

    public static final Bundle create(SharePhotoContent sharePhotoContent) {
        m.f(sharePhotoContent, "sharePhotoContent");
        Bundle createBaseParameters = createBaseParameters(sharePhotoContent);
        List<SharePhoto> photos = sharePhotoContent.getPhotos();
        if (photos == null) {
            photos = p.e();
        }
        ArrayList arrayList = new ArrayList(q.l(photos, 10));
        for (SharePhoto imageUrl : photos) {
            arrayList.add(String.valueOf(imageUrl.getImageUrl()));
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        createBaseParameters.putStringArray(ShareConstants.WEB_DIALOG_PARAM_MEDIA, (String[]) array);
        return createBaseParameters;
    }
}
