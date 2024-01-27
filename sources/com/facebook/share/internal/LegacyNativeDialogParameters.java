package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.Utility;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.m;

/* compiled from: LegacyNativeDialogParameters.kt */
public final class LegacyNativeDialogParameters {
    public static final LegacyNativeDialogParameters INSTANCE = new LegacyNativeDialogParameters();

    private LegacyNativeDialogParameters() {
    }

    public static final Bundle create(UUID uuid, ShareContent<?, ?> shareContent, boolean z10) {
        m.f(uuid, "callId");
        m.f(shareContent, "shareContent");
        if (shareContent instanceof ShareLinkContent) {
            return INSTANCE.create((ShareLinkContent) shareContent, z10);
        }
        if (shareContent instanceof SharePhotoContent) {
            ShareInternalUtility shareInternalUtility = ShareInternalUtility.INSTANCE;
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            List<String> photoUrls = ShareInternalUtility.getPhotoUrls(sharePhotoContent, uuid);
            if (photoUrls == null) {
                photoUrls = p.e();
            }
            return INSTANCE.create(sharePhotoContent, photoUrls, z10);
        }
        boolean z11 = shareContent instanceof ShareVideoContent;
        return null;
    }

    private final Bundle createBaseParameters(ShareContent<?, ?> shareContent, boolean z10) {
        Bundle bundle = new Bundle();
        Utility utility = Utility.INSTANCE;
        Utility.putUri(bundle, ShareConstants.LEGACY_LINK, shareContent.getContentUrl());
        Utility.putNonEmptyString(bundle, ShareConstants.LEGACY_PLACE_TAG, shareContent.getPlaceId());
        Utility.putNonEmptyString(bundle, ShareConstants.LEGACY_REF, shareContent.getRef());
        bundle.putBoolean(ShareConstants.LEGACY_DATA_FAILURES_FATAL, z10);
        List<String> peopleIds = shareContent.getPeopleIds();
        if (!(peopleIds == null || peopleIds.isEmpty())) {
            bundle.putStringArrayList(ShareConstants.LEGACY_FRIEND_TAGS, new ArrayList(peopleIds));
        }
        return bundle;
    }

    private final Bundle create(ShareLinkContent shareLinkContent, boolean z10) {
        return createBaseParameters(shareLinkContent, z10);
    }

    private final Bundle create(SharePhotoContent sharePhotoContent, List<String> list, boolean z10) {
        Bundle createBaseParameters = createBaseParameters(sharePhotoContent, z10);
        createBaseParameters.putStringArrayList(ShareConstants.LEGACY_PHOTOS, new ArrayList(list));
        return createBaseParameters;
    }
}
