package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.m;

/* compiled from: CrashlyticsRemoteConfigListener.kt */
public final class CrashlyticsRemoteConfigListener implements RolloutsStateSubscriber {
    private final UserMetadata userMetadata;

    public CrashlyticsRemoteConfigListener(UserMetadata userMetadata2) {
        m.f(userMetadata2, "userMetadata");
        this.userMetadata = userMetadata2;
    }

    public void onRolloutsStateChanged(RolloutsState rolloutsState) {
        m.f(rolloutsState, "rolloutsState");
        UserMetadata userMetadata2 = this.userMetadata;
        Set<RolloutAssignment> rolloutAssignments = rolloutsState.getRolloutAssignments();
        m.e(rolloutAssignments, "rolloutsState.rolloutAssignments");
        ArrayList arrayList = new ArrayList(q.l(rolloutAssignments, 10));
        for (RolloutAssignment rolloutAssignment : rolloutAssignments) {
            arrayList.add(com.google.firebase.crashlytics.internal.metadata.RolloutAssignment.create(rolloutAssignment.getRolloutId(), rolloutAssignment.getParameterKey(), rolloutAssignment.getParameterValue(), rolloutAssignment.getVariantId(), rolloutAssignment.getTemplateVersion()));
        }
        userMetadata2.updateRolloutsState(arrayList);
        Logger.getLogger().d("Updated Crashlytics Rollout State");
    }
}
