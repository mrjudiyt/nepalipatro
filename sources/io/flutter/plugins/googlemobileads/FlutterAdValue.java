package io.flutter.plugins.googlemobileads;

public class FlutterAdValue {
    final String currencyCode;
    final int precisionType;
    final long valueMicros;

    public FlutterAdValue(int i10, String str, long j10) {
        this.precisionType = i10;
        this.currencyCode = str;
        this.valueMicros = j10;
    }
}
