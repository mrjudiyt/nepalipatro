package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.initialization.AdapterStatus;

class FlutterAdapterStatus {
    final String description;
    final Number latency;
    final AdapterInitializationState state;

    /* renamed from: io.flutter.plugins.googlemobileads.FlutterAdapterStatus$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$gms$ads$initialization$AdapterStatus$State;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.android.gms.ads.initialization.AdapterStatus$State[] r0 = com.google.android.gms.ads.initialization.AdapterStatus.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$google$android$gms$ads$initialization$AdapterStatus$State = r0
                com.google.android.gms.ads.initialization.AdapterStatus$State r1 = com.google.android.gms.ads.initialization.AdapterStatus.State.NOT_READY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$google$android$gms$ads$initialization$AdapterStatus$State     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.android.gms.ads.initialization.AdapterStatus$State r1 = com.google.android.gms.ads.initialization.AdapterStatus.State.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.googlemobileads.FlutterAdapterStatus.AnonymousClass1.<clinit>():void");
        }
    }

    enum AdapterInitializationState {
        NOT_READY,
        READY
    }

    FlutterAdapterStatus(AdapterInitializationState adapterInitializationState, String str, Number number) {
        this.state = adapterInitializationState;
        this.description = str;
        this.latency = number;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlutterAdapterStatus)) {
            return false;
        }
        FlutterAdapterStatus flutterAdapterStatus = (FlutterAdapterStatus) obj;
        if (this.state == flutterAdapterStatus.state && this.description.equals(flutterAdapterStatus.description)) {
            return this.latency.equals(flutterAdapterStatus.latency);
        }
        return false;
    }

    public int hashCode() {
        return (((this.state.hashCode() * 31) + this.description.hashCode()) * 31) + this.latency.hashCode();
    }

    FlutterAdapterStatus(AdapterStatus adapterStatus) {
        int i10 = AnonymousClass1.$SwitchMap$com$google$android$gms$ads$initialization$AdapterStatus$State[adapterStatus.getInitializationState().ordinal()];
        if (i10 == 1) {
            this.state = AdapterInitializationState.NOT_READY;
        } else if (i10 == 2) {
            this.state = AdapterInitializationState.READY;
        } else {
            throw new IllegalArgumentException(String.format("Unable to handle state: %s", new Object[]{adapterStatus.getInitializationState()}));
        }
        this.description = adapterStatus.getDescription();
        this.latency = Integer.valueOf(adapterStatus.getLatency());
    }
}
