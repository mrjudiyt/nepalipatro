package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.HashMap;
import java.util.Map;

class FlutterInitializationStatus {
    final Map<String, FlutterAdapterStatus> adapterStatuses;

    FlutterInitializationStatus(Map<String, FlutterAdapterStatus> map) {
        this.adapterStatuses = map;
    }

    FlutterInitializationStatus(InitializationStatus initializationStatus) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : initializationStatus.getAdapterStatusMap().entrySet()) {
            hashMap.put((String) next.getKey(), new FlutterAdapterStatus((AdapterStatus) next.getValue()));
        }
        this.adapterStatuses = hashMap;
    }
}
