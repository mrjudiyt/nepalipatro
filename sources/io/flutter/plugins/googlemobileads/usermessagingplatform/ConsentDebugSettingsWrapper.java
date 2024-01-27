package io.flutter.plugins.googlemobileads.usermessagingplatform;

import android.content.Context;
import java.util.List;
import java.util.Objects;
import k6.a;

class ConsentDebugSettingsWrapper {
    private final Integer debugGeography;
    private final List<String> testIdentifiers;

    ConsentDebugSettingsWrapper(Integer num, List<String> list) {
        this.debugGeography = num;
        this.testIdentifiers = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConsentDebugSettingsWrapper)) {
            return false;
        }
        ConsentDebugSettingsWrapper consentDebugSettingsWrapper = (ConsentDebugSettingsWrapper) obj;
        if (!Objects.equals(this.debugGeography, consentDebugSettingsWrapper.getDebugGeography()) || !Objects.equals(this.testIdentifiers, consentDebugSettingsWrapper.getTestIdentifiers())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public a getAsConsentDebugSettings(Context context) {
        a.C0256a aVar = new a.C0256a(context);
        Integer num = this.debugGeography;
        if (num != null) {
            aVar.c(num.intValue());
        }
        List<String> list = this.testIdentifiers;
        if (list != null) {
            for (String a10 : list) {
                aVar.a(a10);
            }
        }
        return aVar.b();
    }

    /* access modifiers changed from: package-private */
    public Integer getDebugGeography() {
        return this.debugGeography;
    }

    /* access modifiers changed from: package-private */
    public List<String> getTestIdentifiers() {
        return this.testIdentifiers;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.debugGeography, this.testIdentifiers});
    }
}
