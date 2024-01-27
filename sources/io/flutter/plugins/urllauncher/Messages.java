package io.flutter.plugins.urllauncher;

import android.util.Log;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

public class Messages {

    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(String str, String str2, Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    public interface UrlLauncherApi {
        Boolean canLaunchUrl(String str);

        void closeWebView();

        Boolean launchUrl(String str, Map<String, String> map);

        Boolean openUrlInApp(String str, Boolean bool, WebViewOptions webViewOptions);

        Boolean supportsCustomTabs();
    }

    private static class UrlLauncherApiCodec extends StandardMessageCodec {
        public static final UrlLauncherApiCodec INSTANCE = new UrlLauncherApiCodec();

        private UrlLauncherApiCodec() {
        }

        /* access modifiers changed from: protected */
        public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
            if (b10 != Byte.MIN_VALUE) {
                return super.readValueOfType(b10, byteBuffer);
            }
            return WebViewOptions.fromList((ArrayList) readValue(byteBuffer));
        }

        /* access modifiers changed from: protected */
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof WebViewOptions) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((WebViewOptions) obj).toList());
                return;
            }
            super.writeValue(byteArrayOutputStream, obj);
        }
    }

    public static final class WebViewOptions {
        private Boolean enableDomStorage;
        private Boolean enableJavaScript;
        private Map<String, String> headers;

        public static final class Builder {
            private Boolean enableDomStorage;
            private Boolean enableJavaScript;
            private Map<String, String> headers;

            public WebViewOptions build() {
                WebViewOptions webViewOptions = new WebViewOptions();
                webViewOptions.setEnableJavaScript(this.enableJavaScript);
                webViewOptions.setEnableDomStorage(this.enableDomStorage);
                webViewOptions.setHeaders(this.headers);
                return webViewOptions;
            }

            public Builder setEnableDomStorage(Boolean bool) {
                this.enableDomStorage = bool;
                return this;
            }

            public Builder setEnableJavaScript(Boolean bool) {
                this.enableJavaScript = bool;
                return this;
            }

            public Builder setHeaders(Map<String, String> map) {
                this.headers = map;
                return this;
            }
        }

        WebViewOptions() {
        }

        static WebViewOptions fromList(ArrayList<Object> arrayList) {
            WebViewOptions webViewOptions = new WebViewOptions();
            webViewOptions.setEnableJavaScript((Boolean) arrayList.get(0));
            webViewOptions.setEnableDomStorage((Boolean) arrayList.get(1));
            webViewOptions.setHeaders((Map) arrayList.get(2));
            return webViewOptions;
        }

        public Boolean getEnableDomStorage() {
            return this.enableDomStorage;
        }

        public Boolean getEnableJavaScript() {
            return this.enableJavaScript;
        }

        public Map<String, String> getHeaders() {
            return this.headers;
        }

        public void setEnableDomStorage(Boolean bool) {
            if (bool != null) {
                this.enableDomStorage = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
        }

        public void setEnableJavaScript(Boolean bool) {
            if (bool != null) {
                this.enableJavaScript = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
        }

        public void setHeaders(Map<String, String> map) {
            if (map != null) {
                this.headers = map;
                return;
            }
            throw new IllegalStateException("Nonnull field \"headers\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.enableJavaScript);
            arrayList.add(this.enableDomStorage);
            arrayList.add(this.headers);
            return arrayList;
        }
    }

    protected static ArrayList<Object> wrapError(Throwable th) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.details);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
