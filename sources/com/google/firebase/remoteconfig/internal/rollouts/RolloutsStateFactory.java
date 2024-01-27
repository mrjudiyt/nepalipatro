package com.google.firebase.remoteconfig.internal.rollouts;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RolloutsStateFactory {
    ConfigGetParameterHandler getParameterHandler;

    RolloutsStateFactory(ConfigGetParameterHandler configGetParameterHandler) {
        this.getParameterHandler = configGetParameterHandler;
    }

    public static RolloutsStateFactory create(ConfigGetParameterHandler configGetParameterHandler) {
        return new RolloutsStateFactory(configGetParameterHandler);
    }

    /* access modifiers changed from: package-private */
    public RolloutsState getActiveRolloutsState(ConfigContainer configContainer) {
        JSONArray rolloutMetadata = configContainer.getRolloutMetadata();
        long templateVersionNumber = configContainer.getTemplateVersionNumber();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (i10 < rolloutMetadata.length()) {
            try {
                JSONObject jSONObject = rolloutMetadata.getJSONObject(i10);
                String string = jSONObject.getString(ConfigContainer.ROLLOUT_METADATA_ID);
                JSONArray jSONArray = jSONObject.getJSONArray(ConfigContainer.ROLLOUT_METADATA_AFFECTED_KEYS);
                if (jSONArray.length() > 1) {
                    String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", new Object[]{string, jSONArray});
                }
                String optString = jSONArray.optString(0, "");
                hashSet.add(RolloutAssignment.builder().setRolloutId(string).setVariantId(jSONObject.getString("variantId")).setParameterKey(optString).setParameterValue(this.getParameterHandler.getString(optString)).setTemplateVersion(templateVersionNumber).build());
                i10++;
            } catch (JSONException e10) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", (Throwable) e10);
            }
        }
        return RolloutsState.create(hashSet);
    }
}
