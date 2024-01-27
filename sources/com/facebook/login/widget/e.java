package com.facebook.login.widget;

import com.facebook.internal.ImageRequest;
import com.facebook.internal.ImageResponse;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements ImageRequest.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProfilePictureView f6144a;

    public /* synthetic */ e(ProfilePictureView profilePictureView) {
        this.f6144a = profilePictureView;
    }

    public final void onCompleted(ImageResponse imageResponse) {
        ProfilePictureView.m151sendImageRequest$lambda2(this.f6144a, imageResponse);
    }
}
