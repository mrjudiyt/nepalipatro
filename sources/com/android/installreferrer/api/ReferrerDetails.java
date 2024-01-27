package com.android.installreferrer.api;

import android.os.Bundle;

public class ReferrerDetails {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f5542a;

    public ReferrerDetails(Bundle bundle) {
        this.f5542a = bundle;
    }

    public String a() {
        return this.f5542a.getString("install_referrer");
    }
}
