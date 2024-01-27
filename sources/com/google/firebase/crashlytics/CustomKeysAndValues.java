package com.google.firebase.crashlytics;

import java.util.HashMap;
import java.util.Map;

public class CustomKeysAndValues {
    final Map<String, String> keysAndValues;

    public static class Builder {
        /* access modifiers changed from: private */
        public Map<String, String> keysAndValues = new HashMap();

        public CustomKeysAndValues build() {
            return new CustomKeysAndValues(this);
        }

        public Builder putBoolean(String str, boolean z10) {
            this.keysAndValues.put(str, Boolean.toString(z10));
            return this;
        }

        public Builder putDouble(String str, double d10) {
            this.keysAndValues.put(str, Double.toString(d10));
            return this;
        }

        public Builder putFloat(String str, float f10) {
            this.keysAndValues.put(str, Float.toString(f10));
            return this;
        }

        public Builder putInt(String str, int i10) {
            this.keysAndValues.put(str, Integer.toString(i10));
            return this;
        }

        public Builder putLong(String str, long j10) {
            this.keysAndValues.put(str, Long.toString(j10));
            return this;
        }

        public Builder putString(String str, String str2) {
            this.keysAndValues.put(str, str2);
            return this;
        }
    }

    CustomKeysAndValues(Builder builder) {
        this.keysAndValues = builder.keysAndValues;
    }
}
