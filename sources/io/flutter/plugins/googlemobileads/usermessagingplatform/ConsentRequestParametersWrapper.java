package io.flutter.plugins.googlemobileads.usermessagingplatform;

import android.content.Context;
import java.util.Objects;
import k6.d;

class ConsentRequestParametersWrapper {
    private final ConsentDebugSettingsWrapper debugSettings;
    private final Boolean tfuac;

    ConsentRequestParametersWrapper(Boolean bool, ConsentDebugSettingsWrapper consentDebugSettingsWrapper) {
        this.tfuac = bool;
        this.debugSettings = consentDebugSettingsWrapper;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConsentRequestParametersWrapper)) {
            return false;
        }
        ConsentRequestParametersWrapper consentRequestParametersWrapper = (ConsentRequestParametersWrapper) obj;
        if (!Objects.equals(this.tfuac, consentRequestParametersWrapper.getTfuac()) || !Objects.equals(this.debugSettings, consentRequestParametersWrapper.getDebugSettings())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public d getAsConsentRequestParameters(Context context) {
        d.a aVar = new d.a();
        Boolean bool = this.tfuac;
        if (bool != null) {
            aVar.c(bool.booleanValue());
        }
        ConsentDebugSettingsWrapper consentDebugSettingsWrapper = this.debugSettings;
        if (consentDebugSettingsWrapper != null) {
            aVar.b(consentDebugSettingsWrapper.getAsConsentDebugSettings(context));
        }
        return aVar.a();
    }

    /* access modifiers changed from: package-private */
    public ConsentDebugSettingsWrapper getDebugSettings() {
        return this.debugSettings;
    }

    /* access modifiers changed from: package-private */
    public Boolean getTfuac() {
        return this.tfuac;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.tfuac, this.debugSettings});
    }
}
