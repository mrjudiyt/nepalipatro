package com.facebook.login.widget;

import com.facebook.Profile;
import com.facebook.ProfileTracker;

/* compiled from: ProfilePictureView.kt */
public final class ProfilePictureView$initialize$1 extends ProfileTracker {
    final /* synthetic */ ProfilePictureView this$0;

    ProfilePictureView$initialize$1(ProfilePictureView profilePictureView) {
        this.this$0 = profilePictureView;
    }

    /* access modifiers changed from: protected */
    public void onCurrentProfileChanged(Profile profile, Profile profile2) {
        this.this$0.setProfileId(profile2 == null ? null : profile2.getId());
        this.this$0.refreshImage(true);
    }
}
