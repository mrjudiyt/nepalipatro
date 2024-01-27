package io.flutter.plugins.webviewflutter;

import android.util.Log;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedAndroidWebView {

    public interface CookieManagerHostApi {

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$CookieManagerHostApi$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static MessageCodec<Object> e() {
                return new StandardMessageCodec();
            }

            public static /* synthetic */ void f(CookieManagerHostApi cookieManagerHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                ArrayList<Object> arrayList = new ArrayList<>();
                Number number = (Number) ((ArrayList) obj).get(0);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                cookieManagerHostApi.attachInstance(l10);
                arrayList.add(0, (Object) null);
                reply.reply(arrayList);
            }

            public static /* synthetic */ void g(CookieManagerHostApi cookieManagerHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                ArrayList<Object> arrayList = new ArrayList<>();
                ArrayList arrayList2 = (ArrayList) obj;
                Number number = (Number) arrayList2.get(0);
                String str = (String) arrayList2.get(1);
                String str2 = (String) arrayList2.get(2);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                cookieManagerHostApi.setCookie(l10, str, str2);
                arrayList.add(0, (Object) null);
                reply.reply(arrayList);
            }

            public static /* synthetic */ void h(CookieManagerHostApi cookieManagerHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                ArrayList arrayList = new ArrayList();
                Number number = (Number) ((ArrayList) obj).get(0);
                AnonymousClass1 r12 = new Result<Boolean>(arrayList, reply) {
                    final /* synthetic */ BasicMessageChannel.Reply val$reply;
                    final /* synthetic */ ArrayList val$wrapped;

                    {
                        this.val$wrapped = r1;
                        this.val$reply = r2;
                    }

                    public void error(Throwable th) {
                        this.val$reply.reply(GeneratedAndroidWebView.wrapError(th));
                    }

                    public void success(Boolean bool) {
                        this.val$wrapped.add(0, bool);
                        this.val$reply.reply(this.val$wrapped);
                    }
                };
                if (number == null) {
                    l10 = null;
                } else {
                    l10 = Long.valueOf(number.longValue());
                }
                cookieManagerHostApi.removeAllCookies(l10, r12);
            }

            public static /* synthetic */ void i(CookieManagerHostApi cookieManagerHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                Long l11;
                ArrayList<Object> arrayList = new ArrayList<>();
                ArrayList arrayList2 = (ArrayList) obj;
                Number number = (Number) arrayList2.get(0);
                Number number2 = (Number) arrayList2.get(1);
                Boolean bool = (Boolean) arrayList2.get(2);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                if (number2 == null) {
                    l11 = null;
                } else {
                    l11 = Long.valueOf(number2.longValue());
                }
                cookieManagerHostApi.setAcceptThirdPartyCookies(l10, l11, bool);
                arrayList.add(0, (Object) null);
                reply.reply(arrayList);
            }

            public static void j(BinaryMessenger binaryMessenger, CookieManagerHostApi cookieManagerHostApi) {
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.CookieManagerHostApi.attachInstance", e());
                if (cookieManagerHostApi != null) {
                    basicMessageChannel.setMessageHandler(new c(cookieManagerHostApi));
                } else {
                    basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.CookieManagerHostApi.setCookie", e());
                if (cookieManagerHostApi != null) {
                    basicMessageChannel2.setMessageHandler(new e(cookieManagerHostApi));
                } else {
                    basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.CookieManagerHostApi.removeAllCookies", e());
                if (cookieManagerHostApi != null) {
                    basicMessageChannel3.setMessageHandler(new f(cookieManagerHostApi));
                } else {
                    basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.CookieManagerHostApi.setAcceptThirdPartyCookies", e());
                if (cookieManagerHostApi != null) {
                    basicMessageChannel4.setMessageHandler(new d(cookieManagerHostApi));
                } else {
                    basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
            }
        }

        void attachInstance(Long l10);

        void removeAllCookies(Long l10, Result<Boolean> result);

        void setAcceptThirdPartyCookies(Long l10, Long l11, Boolean bool);

        void setCookie(Long l10, String str, String str2);
    }

    public static class DownloadListenerFlutterApi {
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t10);
        }

        public DownloadListenerFlutterApi(BinaryMessenger binaryMessenger2) {
            this.binaryMessenger = binaryMessenger2;
        }

        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void onDownloadStart(Long l10, String str, String str2, String str3, String str4, Long l11, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.DownloadListenerFlutterApi.onDownloadStart", getCodec()).send(new ArrayList(Arrays.asList(new Serializable[]{l10, str, str2, str3, str4, l11})), new g(reply));
        }
    }

    public interface DownloadListenerHostApi {
        void create(Long l10);
    }

    public enum FileChooserMode {
        OPEN(0),
        OPEN_MULTIPLE(1),
        SAVE(2);
        
        final int index;

        private FileChooserMode(int i10) {
            this.index = i10;
        }
    }

    public static final class FileChooserModeEnumData {
        private FileChooserMode value;

        public static final class Builder {
            private FileChooserMode value;

            public FileChooserModeEnumData build() {
                FileChooserModeEnumData fileChooserModeEnumData = new FileChooserModeEnumData();
                fileChooserModeEnumData.setValue(this.value);
                return fileChooserModeEnumData;
            }

            public Builder setValue(FileChooserMode fileChooserMode) {
                this.value = fileChooserMode;
                return this;
            }
        }

        FileChooserModeEnumData() {
        }

        static FileChooserModeEnumData fromList(ArrayList<Object> arrayList) {
            FileChooserMode fileChooserMode;
            FileChooserModeEnumData fileChooserModeEnumData = new FileChooserModeEnumData();
            Object obj = arrayList.get(0);
            if (obj == null) {
                fileChooserMode = null;
            } else {
                fileChooserMode = FileChooserMode.values()[((Integer) obj).intValue()];
            }
            fileChooserModeEnumData.setValue(fileChooserMode);
            return fileChooserModeEnumData;
        }

        public FileChooserMode getValue() {
            return this.value;
        }

        public void setValue(FileChooserMode fileChooserMode) {
            if (fileChooserMode != null) {
                this.value = fileChooserMode;
                return;
            }
            throw new IllegalStateException("Nonnull field \"value\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            FileChooserMode fileChooserMode = this.value;
            arrayList.add(fileChooserMode == null ? null : Integer.valueOf(fileChooserMode.index));
            return arrayList;
        }
    }

    public static class FileChooserParamsFlutterApi {
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t10);
        }

        public FileChooserParamsFlutterApi(BinaryMessenger binaryMessenger2) {
            this.binaryMessenger = binaryMessenger2;
        }

        static MessageCodec<Object> getCodec() {
            return FileChooserParamsFlutterApiCodec.INSTANCE;
        }

        public void create(Long l10, Boolean bool, List<String> list, FileChooserModeEnumData fileChooserModeEnumData, String str, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.FileChooserParamsFlutterApi.create", getCodec()).send(new ArrayList(Arrays.asList(new Object[]{l10, bool, list, fileChooserModeEnumData, str})), new j(reply));
        }
    }

    private static class FileChooserParamsFlutterApiCodec extends StandardMessageCodec {
        public static final FileChooserParamsFlutterApiCodec INSTANCE = new FileChooserParamsFlutterApiCodec();

        private FileChooserParamsFlutterApiCodec() {
        }

        /* access modifiers changed from: protected */
        public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
            if (b10 != Byte.MIN_VALUE) {
                return super.readValueOfType(b10, byteBuffer);
            }
            return FileChooserModeEnumData.fromList((ArrayList) readValue(byteBuffer));
        }

        /* access modifiers changed from: protected */
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof FileChooserModeEnumData) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((FileChooserModeEnumData) obj).toList());
                return;
            }
            super.writeValue(byteArrayOutputStream, obj);
        }
    }

    public interface FlutterAssetManagerHostApi {
        String getAssetFilePathByName(String str);

        List<String> list(String str);
    }

    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(String str, String str2, Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    public static class GeolocationPermissionsCallbackFlutterApi {
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t10);
        }

        public GeolocationPermissionsCallbackFlutterApi(BinaryMessenger binaryMessenger2) {
            this.binaryMessenger = binaryMessenger2;
        }

        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void create(Long l10, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.GeolocationPermissionsCallbackFlutterApi.create", getCodec()).send(new ArrayList(Collections.singletonList(l10)), new n(reply));
        }
    }

    public interface GeolocationPermissionsCallbackHostApi {
        void invoke(Long l10, String str, Boolean bool, Boolean bool2);
    }

    public interface InstanceManagerHostApi {
        void clear();
    }

    public static class JavaObjectFlutterApi {
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t10);
        }

        public JavaObjectFlutterApi(BinaryMessenger binaryMessenger2) {
            this.binaryMessenger = binaryMessenger2;
        }

        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void dispose(Long l10, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.JavaObjectFlutterApi.dispose", getCodec()).send(new ArrayList(Collections.singletonList(l10)), new t(reply));
        }
    }

    public interface JavaObjectHostApi {
        void dispose(Long l10);
    }

    public static class JavaScriptChannelFlutterApi {
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t10);
        }

        public JavaScriptChannelFlutterApi(BinaryMessenger binaryMessenger2) {
            this.binaryMessenger = binaryMessenger2;
        }

        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void postMessage(Long l10, String str, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.JavaScriptChannelFlutterApi.postMessage", getCodec()).send(new ArrayList(Arrays.asList(new Serializable[]{l10, str})), new w(reply));
        }
    }

    public interface JavaScriptChannelHostApi {
        void create(Long l10, String str);
    }

    public static class PermissionRequestFlutterApi {
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t10);
        }

        public PermissionRequestFlutterApi(BinaryMessenger binaryMessenger2) {
            this.binaryMessenger = binaryMessenger2;
        }

        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void create(Long l10, List<String> list, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.PermissionRequestFlutterApi.create", getCodec()).send(new ArrayList(Arrays.asList(new Object[]{l10, list})), new z(reply));
        }
    }

    public interface PermissionRequestHostApi {
        void deny(Long l10);

        void grant(Long l10, List<String> list);
    }

    public interface Result<T> {
        void error(Throwable th);

        void success(T t10);
    }

    public static class WebChromeClientFlutterApi {
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t10);
        }

        public WebChromeClientFlutterApi(BinaryMessenger binaryMessenger2) {
            this.binaryMessenger = binaryMessenger2;
        }

        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void onGeolocationPermissionsHidePrompt(Long l10, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebChromeClientFlutterApi.onGeolocationPermissionsHidePrompt", getCodec()).send(new ArrayList(Collections.singletonList(l10)), new g0(reply));
        }

        public void onGeolocationPermissionsShowPrompt(Long l10, Long l11, String str, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebChromeClientFlutterApi.onGeolocationPermissionsShowPrompt", getCodec()).send(new ArrayList(Arrays.asList(new Serializable[]{l10, l11, str})), new f0(reply));
        }

        public void onPermissionRequest(Long l10, Long l11, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebChromeClientFlutterApi.onPermissionRequest", getCodec()).send(new ArrayList(Arrays.asList(new Long[]{l10, l11})), new d0(reply));
        }

        public void onProgressChanged(Long l10, Long l11, Long l12, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebChromeClientFlutterApi.onProgressChanged", getCodec()).send(new ArrayList(Arrays.asList(new Long[]{l10, l11, l12})), new e0(reply));
        }

        public void onShowFileChooser(Long l10, Long l11, Long l12, Reply<List<String>> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebChromeClientFlutterApi.onShowFileChooser", getCodec()).send(new ArrayList(Arrays.asList(new Long[]{l10, l11, l12})), new h0(reply));
        }
    }

    public interface WebChromeClientHostApi {
        void create(Long l10);

        void setSynchronousReturnValueForOnShowFileChooser(Long l10, Boolean bool);
    }

    public static final class WebResourceErrorData {
        private String description;
        private Long errorCode;

        public static final class Builder {
            private String description;
            private Long errorCode;

            public WebResourceErrorData build() {
                WebResourceErrorData webResourceErrorData = new WebResourceErrorData();
                webResourceErrorData.setErrorCode(this.errorCode);
                webResourceErrorData.setDescription(this.description);
                return webResourceErrorData;
            }

            public Builder setDescription(String str) {
                this.description = str;
                return this;
            }

            public Builder setErrorCode(Long l10) {
                this.errorCode = l10;
                return this;
            }
        }

        WebResourceErrorData() {
        }

        static WebResourceErrorData fromList(ArrayList<Object> arrayList) {
            Long l10;
            WebResourceErrorData webResourceErrorData = new WebResourceErrorData();
            Object obj = arrayList.get(0);
            if (obj == null) {
                l10 = null;
            } else {
                l10 = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            webResourceErrorData.setErrorCode(l10);
            webResourceErrorData.setDescription((String) arrayList.get(1));
            return webResourceErrorData;
        }

        public String getDescription() {
            return this.description;
        }

        public Long getErrorCode() {
            return this.errorCode;
        }

        public void setDescription(String str) {
            if (str != null) {
                this.description = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"description\" is null.");
        }

        public void setErrorCode(Long l10) {
            if (l10 != null) {
                this.errorCode = l10;
                return;
            }
            throw new IllegalStateException("Nonnull field \"errorCode\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.errorCode);
            arrayList.add(this.description);
            return arrayList;
        }
    }

    public static final class WebResourceRequestData {
        private Boolean hasGesture;
        private Boolean isForMainFrame;
        private Boolean isRedirect;
        private String method;
        private Map<String, String> requestHeaders;
        private String url;

        public static final class Builder {
            private Boolean hasGesture;
            private Boolean isForMainFrame;
            private Boolean isRedirect;
            private String method;
            private Map<String, String> requestHeaders;
            private String url;

            public WebResourceRequestData build() {
                WebResourceRequestData webResourceRequestData = new WebResourceRequestData();
                webResourceRequestData.setUrl(this.url);
                webResourceRequestData.setIsForMainFrame(this.isForMainFrame);
                webResourceRequestData.setIsRedirect(this.isRedirect);
                webResourceRequestData.setHasGesture(this.hasGesture);
                webResourceRequestData.setMethod(this.method);
                webResourceRequestData.setRequestHeaders(this.requestHeaders);
                return webResourceRequestData;
            }

            public Builder setHasGesture(Boolean bool) {
                this.hasGesture = bool;
                return this;
            }

            public Builder setIsForMainFrame(Boolean bool) {
                this.isForMainFrame = bool;
                return this;
            }

            public Builder setIsRedirect(Boolean bool) {
                this.isRedirect = bool;
                return this;
            }

            public Builder setMethod(String str) {
                this.method = str;
                return this;
            }

            public Builder setRequestHeaders(Map<String, String> map) {
                this.requestHeaders = map;
                return this;
            }

            public Builder setUrl(String str) {
                this.url = str;
                return this;
            }
        }

        WebResourceRequestData() {
        }

        static WebResourceRequestData fromList(ArrayList<Object> arrayList) {
            WebResourceRequestData webResourceRequestData = new WebResourceRequestData();
            webResourceRequestData.setUrl((String) arrayList.get(0));
            webResourceRequestData.setIsForMainFrame((Boolean) arrayList.get(1));
            webResourceRequestData.setIsRedirect((Boolean) arrayList.get(2));
            webResourceRequestData.setHasGesture((Boolean) arrayList.get(3));
            webResourceRequestData.setMethod((String) arrayList.get(4));
            webResourceRequestData.setRequestHeaders((Map) arrayList.get(5));
            return webResourceRequestData;
        }

        public Boolean getHasGesture() {
            return this.hasGesture;
        }

        public Boolean getIsForMainFrame() {
            return this.isForMainFrame;
        }

        public Boolean getIsRedirect() {
            return this.isRedirect;
        }

        public String getMethod() {
            return this.method;
        }

        public Map<String, String> getRequestHeaders() {
            return this.requestHeaders;
        }

        public String getUrl() {
            return this.url;
        }

        public void setHasGesture(Boolean bool) {
            if (bool != null) {
                this.hasGesture = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"hasGesture\" is null.");
        }

        public void setIsForMainFrame(Boolean bool) {
            if (bool != null) {
                this.isForMainFrame = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"isForMainFrame\" is null.");
        }

        public void setIsRedirect(Boolean bool) {
            this.isRedirect = bool;
        }

        public void setMethod(String str) {
            if (str != null) {
                this.method = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"method\" is null.");
        }

        public void setRequestHeaders(Map<String, String> map) {
            if (map != null) {
                this.requestHeaders = map;
                return;
            }
            throw new IllegalStateException("Nonnull field \"requestHeaders\" is null.");
        }

        public void setUrl(String str) {
            if (str != null) {
                this.url = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"url\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.url);
            arrayList.add(this.isForMainFrame);
            arrayList.add(this.isRedirect);
            arrayList.add(this.hasGesture);
            arrayList.add(this.method);
            arrayList.add(this.requestHeaders);
            return arrayList;
        }
    }

    public interface WebSettingsHostApi {
        void create(Long l10, Long l11);

        void setAllowFileAccess(Long l10, Boolean bool);

        void setBuiltInZoomControls(Long l10, Boolean bool);

        void setDisplayZoomControls(Long l10, Boolean bool);

        void setDomStorageEnabled(Long l10, Boolean bool);

        void setJavaScriptCanOpenWindowsAutomatically(Long l10, Boolean bool);

        void setJavaScriptEnabled(Long l10, Boolean bool);

        void setLoadWithOverviewMode(Long l10, Boolean bool);

        void setMediaPlaybackRequiresUserGesture(Long l10, Boolean bool);

        void setSupportMultipleWindows(Long l10, Boolean bool);

        void setSupportZoom(Long l10, Boolean bool);

        void setTextZoom(Long l10, Long l11);

        void setUseWideViewPort(Long l10, Boolean bool);

        void setUserAgentString(Long l10, String str);
    }

    public interface WebStorageHostApi {
        void create(Long l10);

        void deleteAllData(Long l10);
    }

    public static class WebViewClientFlutterApi {
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t10);
        }

        public WebViewClientFlutterApi(BinaryMessenger binaryMessenger2) {
            this.binaryMessenger = binaryMessenger2;
        }

        static MessageCodec<Object> getCodec() {
            return WebViewClientFlutterApiCodec.INSTANCE;
        }

        public void doUpdateVisitedHistory(Long l10, Long l11, String str, Boolean bool, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebViewClientFlutterApi.doUpdateVisitedHistory", getCodec()).send(new ArrayList(Arrays.asList(new Serializable[]{l10, l11, str, bool})), new f1(reply));
        }

        public void onPageFinished(Long l10, Long l11, String str, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebViewClientFlutterApi.onPageFinished", getCodec()).send(new ArrayList(Arrays.asList(new Serializable[]{l10, l11, str})), new e1(reply));
        }

        public void onPageStarted(Long l10, Long l11, String str, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebViewClientFlutterApi.onPageStarted", getCodec()).send(new ArrayList(Arrays.asList(new Serializable[]{l10, l11, str})), new h1(reply));
        }

        public void onReceivedError(Long l10, Long l11, Long l12, String str, String str2, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebViewClientFlutterApi.onReceivedError", getCodec()).send(new ArrayList(Arrays.asList(new Serializable[]{l10, l11, l12, str, str2})), new d1(reply));
        }

        public void onReceivedRequestError(Long l10, Long l11, WebResourceRequestData webResourceRequestData, WebResourceErrorData webResourceErrorData, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebViewClientFlutterApi.onReceivedRequestError", getCodec()).send(new ArrayList(Arrays.asList(new Object[]{l10, l11, webResourceRequestData, webResourceErrorData})), new j1(reply));
        }

        public void requestLoading(Long l10, Long l11, WebResourceRequestData webResourceRequestData, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebViewClientFlutterApi.requestLoading", getCodec()).send(new ArrayList(Arrays.asList(new Object[]{l10, l11, webResourceRequestData})), new g1(reply));
        }

        public void urlLoading(Long l10, Long l11, String str, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebViewClientFlutterApi.urlLoading", getCodec()).send(new ArrayList(Arrays.asList(new Serializable[]{l10, l11, str})), new i1(reply));
        }
    }

    private static class WebViewClientFlutterApiCodec extends StandardMessageCodec {
        public static final WebViewClientFlutterApiCodec INSTANCE = new WebViewClientFlutterApiCodec();

        private WebViewClientFlutterApiCodec() {
        }

        /* access modifiers changed from: protected */
        public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
            if (b10 == Byte.MIN_VALUE) {
                return WebResourceErrorData.fromList((ArrayList) readValue(byteBuffer));
            }
            if (b10 != -127) {
                return super.readValueOfType(b10, byteBuffer);
            }
            return WebResourceRequestData.fromList((ArrayList) readValue(byteBuffer));
        }

        /* access modifiers changed from: protected */
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof WebResourceErrorData) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((WebResourceErrorData) obj).toList());
            } else if (obj instanceof WebResourceRequestData) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((WebResourceRequestData) obj).toList());
            } else {
                super.writeValue(byteArrayOutputStream, obj);
            }
        }
    }

    public interface WebViewClientHostApi {
        void create(Long l10);

        void setSynchronousReturnValueForShouldOverrideUrlLoading(Long l10, Boolean bool);
    }

    public static class WebViewFlutterApi {
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t10);
        }

        public WebViewFlutterApi(BinaryMessenger binaryMessenger2) {
            this.binaryMessenger = binaryMessenger2;
        }

        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void create(Long l10, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebViewFlutterApi.create", getCodec()).send(new ArrayList(Collections.singletonList(l10)), new n1(reply));
        }
    }

    public interface WebViewHostApi {

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static MessageCodec<Object> A() {
                return WebViewHostApiCodec.INSTANCE;
            }

            public static /* synthetic */ void B(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                ArrayList<Object> arrayList = new ArrayList<>();
                Number number = (Number) ((ArrayList) obj).get(0);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                webViewHostApi.create(l10);
                arrayList.add(0, (Object) null);
                reply.reply(arrayList);
            }

            public static /* synthetic */ void C(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                ArrayList<Object> arrayList = new ArrayList<>();
                ArrayList arrayList2 = (ArrayList) obj;
                Number number = (Number) arrayList2.get(0);
                String str = (String) arrayList2.get(1);
                String str2 = (String) arrayList2.get(2);
                String str3 = (String) arrayList2.get(3);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                webViewHostApi.loadData(l10, str, str2, str3);
                arrayList.add(0, (Object) null);
                reply.reply(arrayList);
            }

            public static /* synthetic */ void D(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                ArrayList<Object> arrayList = new ArrayList<>();
                Number number = (Number) ((ArrayList) obj).get(0);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                webViewHostApi.reload(l10);
                arrayList.add(0, (Object) null);
                reply.reply(arrayList);
            }

            public static /* synthetic */ void E(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                ArrayList<Object> arrayList = new ArrayList<>();
                ArrayList arrayList2 = (ArrayList) obj;
                Number number = (Number) arrayList2.get(0);
                Boolean bool = (Boolean) arrayList2.get(1);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                webViewHostApi.clearCache(l10, bool);
                arrayList.add(0, (Object) null);
                reply.reply(arrayList);
            }

            public static /* synthetic */ void F(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                Number number = (Number) arrayList2.get(0);
                String str = (String) arrayList2.get(1);
                AnonymousClass1 r22 = new Result<String>(arrayList, reply) {
                    final /* synthetic */ BasicMessageChannel.Reply val$reply;
                    final /* synthetic */ ArrayList val$wrapped;

                    {
                        this.val$wrapped = r1;
                        this.val$reply = r2;
                    }

                    public void error(Throwable th) {
                        this.val$reply.reply(GeneratedAndroidWebView.wrapError(th));
                    }

                    public void success(String str) {
                        this.val$wrapped.add(0, str);
                        this.val$reply.reply(this.val$wrapped);
                    }
                };
                if (number == null) {
                    l10 = null;
                } else {
                    l10 = Long.valueOf(number.longValue());
                }
                webViewHostApi.evaluateJavascript(l10, str, r22);
            }

            public static /* synthetic */ void G(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                ArrayList<Object> arrayList = new ArrayList<>();
                Number number = (Number) ((ArrayList) obj).get(0);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                arrayList.add(0, webViewHostApi.getTitle(l10));
                reply.reply(arrayList);
            }

            public static /* synthetic */ void H(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                Long l11;
                Long l12;
                ArrayList<Object> arrayList = new ArrayList<>();
                ArrayList arrayList2 = (ArrayList) obj;
                Number number = (Number) arrayList2.get(0);
                Number number2 = (Number) arrayList2.get(1);
                Number number3 = (Number) arrayList2.get(2);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                if (number2 == null) {
                    l11 = null;
                } else {
                    l11 = Long.valueOf(number2.longValue());
                }
                if (number3 == null) {
                    l12 = null;
                } else {
                    l12 = Long.valueOf(number3.longValue());
                }
                webViewHostApi.scrollTo(l10, l11, l12);
                arrayList.add(0, (Object) null);
                reply.reply(arrayList);
            }

            public static /* synthetic */ void I(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                Long l11;
                Long l12;
                ArrayList<Object> arrayList = new ArrayList<>();
                ArrayList arrayList2 = (ArrayList) obj;
                Number number = (Number) arrayList2.get(0);
                Number number2 = (Number) arrayList2.get(1);
                Number number3 = (Number) arrayList2.get(2);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                if (number2 == null) {
                    l11 = null;
                } else {
                    l11 = Long.valueOf(number2.longValue());
                }
                if (number3 == null) {
                    l12 = null;
                } else {
                    l12 = Long.valueOf(number3.longValue());
                }
                webViewHostApi.scrollBy(l10, l11, l12);
                arrayList.add(0, (Object) null);
                reply.reply(arrayList);
            }

            public static /* synthetic */ void J(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                ArrayList<Object> arrayList = new ArrayList<>();
                Number number = (Number) ((ArrayList) obj).get(0);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                arrayList.add(0, webViewHostApi.getScrollX(l10));
                reply.reply(arrayList);
            }

            public static /* synthetic */ void K(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                ArrayList<Object> arrayList = new ArrayList<>();
                Number number = (Number) ((ArrayList) obj).get(0);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                arrayList.add(0, webViewHostApi.getScrollY(l10));
                reply.reply(arrayList);
            }

            public static /* synthetic */ void L(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                ArrayList<Object> arrayList = new ArrayList<>();
                Number number = (Number) ((ArrayList) obj).get(0);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                arrayList.add(0, webViewHostApi.getScrollPosition(l10));
                reply.reply(arrayList);
            }

            public static /* synthetic */ void M(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                ArrayList<Object> arrayList = new ArrayList<>();
                try {
                    webViewHostApi.setWebContentsDebuggingEnabled((Boolean) ((ArrayList) obj).get(0));
                    arrayList.add(0, (Object) null);
                } catch (Throwable th) {
                    arrayList = GeneratedAndroidWebView.wrapError(th);
                }
                reply.reply(arrayList);
            }

            public static /* synthetic */ void N(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                ArrayList<Object> arrayList = new ArrayList<>();
                ArrayList arrayList2 = (ArrayList) obj;
                Number number = (Number) arrayList2.get(0);
                String str = (String) arrayList2.get(1);
                String str2 = (String) arrayList2.get(2);
                String str3 = (String) arrayList2.get(3);
                String str4 = (String) arrayList2.get(4);
                String str5 = (String) arrayList2.get(5);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                webViewHostApi.loadDataWithBaseUrl(l10, str, str2, str3, str4, str5);
                arrayList.add(0, (Object) null);
                reply.reply(arrayList);
            }

            public static /* synthetic */ void O(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                Long l11;
                ArrayList<Object> arrayList = new ArrayList<>();
                ArrayList arrayList2 = (ArrayList) obj;
                Number number = (Number) arrayList2.get(0);
                Number number2 = (Number) arrayList2.get(1);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                if (number2 == null) {
                    l11 = null;
                } else {
                    l11 = Long.valueOf(number2.longValue());
                }
                webViewHostApi.setWebViewClient(l10, l11);
                arrayList.add(0, (Object) null);
                reply.reply(arrayList);
            }

            public static /* synthetic */ void P(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                Long l11;
                ArrayList<Object> arrayList = new ArrayList<>();
                ArrayList arrayList2 = (ArrayList) obj;
                Number number = (Number) arrayList2.get(0);
                Number number2 = (Number) arrayList2.get(1);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                if (number2 == null) {
                    l11 = null;
                } else {
                    l11 = Long.valueOf(number2.longValue());
                }
                webViewHostApi.addJavaScriptChannel(l10, l11);
                arrayList.add(0, (Object) null);
                reply.reply(arrayList);
            }

            public static /* synthetic */ void Q(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                Long l11;
                ArrayList<Object> arrayList = new ArrayList<>();
                ArrayList arrayList2 = (ArrayList) obj;
                Number number = (Number) arrayList2.get(0);
                Number number2 = (Number) arrayList2.get(1);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                if (number2 == null) {
                    l11 = null;
                } else {
                    l11 = Long.valueOf(number2.longValue());
                }
                webViewHostApi.removeJavaScriptChannel(l10, l11);
                arrayList.add(0, (Object) null);
                reply.reply(arrayList);
            }

            public static /* synthetic */ void R(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                Long l11;
                ArrayList<Object> arrayList = new ArrayList<>();
                ArrayList arrayList2 = (ArrayList) obj;
                Number number = (Number) arrayList2.get(0);
                Number number2 = (Number) arrayList2.get(1);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                if (number2 == null) {
                    l11 = null;
                } else {
                    l11 = Long.valueOf(number2.longValue());
                }
                webViewHostApi.setDownloadListener(l10, l11);
                arrayList.add(0, (Object) null);
                reply.reply(arrayList);
            }

            public static /* synthetic */ void S(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                Long l11;
                ArrayList<Object> arrayList = new ArrayList<>();
                ArrayList arrayList2 = (ArrayList) obj;
                Number number = (Number) arrayList2.get(0);
                Number number2 = (Number) arrayList2.get(1);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                if (number2 == null) {
                    l11 = null;
                } else {
                    l11 = Long.valueOf(number2.longValue());
                }
                webViewHostApi.setWebChromeClient(l10, l11);
                arrayList.add(0, (Object) null);
                reply.reply(arrayList);
            }

            public static /* synthetic */ void T(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                Long l11;
                ArrayList<Object> arrayList = new ArrayList<>();
                ArrayList arrayList2 = (ArrayList) obj;
                Number number = (Number) arrayList2.get(0);
                Number number2 = (Number) arrayList2.get(1);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                if (number2 == null) {
                    l11 = null;
                } else {
                    l11 = Long.valueOf(number2.longValue());
                }
                webViewHostApi.setBackgroundColor(l10, l11);
                arrayList.add(0, (Object) null);
                reply.reply(arrayList);
            }

            public static /* synthetic */ void U(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                ArrayList<Object> arrayList = new ArrayList<>();
                ArrayList arrayList2 = (ArrayList) obj;
                Number number = (Number) arrayList2.get(0);
                String str = (String) arrayList2.get(1);
                Map map = (Map) arrayList2.get(2);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                webViewHostApi.loadUrl(l10, str, map);
                arrayList.add(0, (Object) null);
                reply.reply(arrayList);
            }

            public static /* synthetic */ void V(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                ArrayList<Object> arrayList = new ArrayList<>();
                ArrayList arrayList2 = (ArrayList) obj;
                Number number = (Number) arrayList2.get(0);
                String str = (String) arrayList2.get(1);
                byte[] bArr = (byte[]) arrayList2.get(2);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                webViewHostApi.postUrl(l10, str, bArr);
                arrayList.add(0, (Object) null);
                reply.reply(arrayList);
            }

            public static /* synthetic */ void W(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                ArrayList<Object> arrayList = new ArrayList<>();
                Number number = (Number) ((ArrayList) obj).get(0);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                arrayList.add(0, webViewHostApi.getUrl(l10));
                reply.reply(arrayList);
            }

            public static /* synthetic */ void X(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                ArrayList<Object> arrayList = new ArrayList<>();
                Number number = (Number) ((ArrayList) obj).get(0);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                arrayList.add(0, webViewHostApi.canGoBack(l10));
                reply.reply(arrayList);
            }

            public static /* synthetic */ void Y(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                ArrayList<Object> arrayList = new ArrayList<>();
                Number number = (Number) ((ArrayList) obj).get(0);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                arrayList.add(0, webViewHostApi.canGoForward(l10));
                reply.reply(arrayList);
            }

            public static /* synthetic */ void Z(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                ArrayList<Object> arrayList = new ArrayList<>();
                Number number = (Number) ((ArrayList) obj).get(0);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                webViewHostApi.goBack(l10);
                arrayList.add(0, (Object) null);
                reply.reply(arrayList);
            }

            public static /* synthetic */ void a0(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                Long l10;
                ArrayList<Object> arrayList = new ArrayList<>();
                Number number = (Number) ((ArrayList) obj).get(0);
                if (number == null) {
                    l10 = null;
                } else {
                    try {
                        l10 = Long.valueOf(number.longValue());
                    } catch (Throwable th) {
                        arrayList = GeneratedAndroidWebView.wrapError(th);
                    }
                }
                webViewHostApi.goForward(l10);
                arrayList.add(0, (Object) null);
                reply.reply(arrayList);
            }

            public static void b0(BinaryMessenger binaryMessenger, WebViewHostApi webViewHostApi) {
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.create", A());
                if (webViewHostApi != null) {
                    basicMessageChannel.setMessageHandler(new f2(webViewHostApi));
                } else {
                    basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.loadData", A());
                if (webViewHostApi != null) {
                    basicMessageChannel2.setMessageHandler(new p1(webViewHostApi));
                } else {
                    basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.loadDataWithBaseUrl", A());
                if (webViewHostApi != null) {
                    basicMessageChannel3.setMessageHandler(new m2(webViewHostApi));
                } else {
                    basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.loadUrl", A());
                if (webViewHostApi != null) {
                    basicMessageChannel4.setMessageHandler(new n2(webViewHostApi));
                } else {
                    basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.postUrl", A());
                if (webViewHostApi != null) {
                    basicMessageChannel5.setMessageHandler(new b2(webViewHostApi));
                } else {
                    basicMessageChannel5.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.getUrl", A());
                if (webViewHostApi != null) {
                    basicMessageChannel6.setMessageHandler(new e2(webViewHostApi));
                } else {
                    basicMessageChannel6.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.canGoBack", A());
                if (webViewHostApi != null) {
                    basicMessageChannel7.setMessageHandler(new v1(webViewHostApi));
                } else {
                    basicMessageChannel7.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.canGoForward", A());
                if (webViewHostApi != null) {
                    basicMessageChannel8.setMessageHandler(new z1(webViewHostApi));
                } else {
                    basicMessageChannel8.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.goBack", A());
                if (webViewHostApi != null) {
                    basicMessageChannel9.setMessageHandler(new u1(webViewHostApi));
                } else {
                    basicMessageChannel9.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.goForward", A());
                if (webViewHostApi != null) {
                    basicMessageChannel10.setMessageHandler(new h2(webViewHostApi));
                } else {
                    basicMessageChannel10.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.reload", A());
                if (webViewHostApi != null) {
                    basicMessageChannel11.setMessageHandler(new x1(webViewHostApi));
                } else {
                    basicMessageChannel11.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.clearCache", A());
                if (webViewHostApi != null) {
                    basicMessageChannel12.setMessageHandler(new s1(webViewHostApi));
                } else {
                    basicMessageChannel12.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.evaluateJavascript", A());
                if (webViewHostApi != null) {
                    basicMessageChannel13.setMessageHandler(new q1(webViewHostApi));
                } else {
                    basicMessageChannel13.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.getTitle", A());
                if (webViewHostApi != null) {
                    basicMessageChannel14.setMessageHandler(new t1(webViewHostApi));
                } else {
                    basicMessageChannel14.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.scrollTo", A());
                if (webViewHostApi != null) {
                    basicMessageChannel15.setMessageHandler(new g2(webViewHostApi));
                } else {
                    basicMessageChannel15.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel16 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.scrollBy", A());
                if (webViewHostApi != null) {
                    basicMessageChannel16.setMessageHandler(new o1(webViewHostApi));
                } else {
                    basicMessageChannel16.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel17 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.getScrollX", A());
                if (webViewHostApi != null) {
                    basicMessageChannel17.setMessageHandler(new j2(webViewHostApi));
                } else {
                    basicMessageChannel17.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel18 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.getScrollY", A());
                if (webViewHostApi != null) {
                    basicMessageChannel18.setMessageHandler(new c2(webViewHostApi));
                } else {
                    basicMessageChannel18.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel19 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.getScrollPosition", A());
                if (webViewHostApi != null) {
                    basicMessageChannel19.setMessageHandler(new l2(webViewHostApi));
                } else {
                    basicMessageChannel19.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel20 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.setWebContentsDebuggingEnabled", A());
                if (webViewHostApi != null) {
                    basicMessageChannel20.setMessageHandler(new d2(webViewHostApi));
                } else {
                    basicMessageChannel20.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel21 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.setWebViewClient", A());
                if (webViewHostApi != null) {
                    basicMessageChannel21.setMessageHandler(new k2(webViewHostApi));
                } else {
                    basicMessageChannel21.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel22 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.addJavaScriptChannel", A());
                if (webViewHostApi != null) {
                    basicMessageChannel22.setMessageHandler(new w1(webViewHostApi));
                } else {
                    basicMessageChannel22.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel23 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.removeJavaScriptChannel", A());
                if (webViewHostApi != null) {
                    basicMessageChannel23.setMessageHandler(new r1(webViewHostApi));
                } else {
                    basicMessageChannel23.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel24 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.setDownloadListener", A());
                if (webViewHostApi != null) {
                    basicMessageChannel24.setMessageHandler(new y1(webViewHostApi));
                } else {
                    basicMessageChannel24.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel25 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.setWebChromeClient", A());
                if (webViewHostApi != null) {
                    basicMessageChannel25.setMessageHandler(new i2(webViewHostApi));
                } else {
                    basicMessageChannel25.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel26 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.setBackgroundColor", A());
                if (webViewHostApi != null) {
                    basicMessageChannel26.setMessageHandler(new a2(webViewHostApi));
                } else {
                    basicMessageChannel26.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
            }
        }

        void addJavaScriptChannel(Long l10, Long l11);

        Boolean canGoBack(Long l10);

        Boolean canGoForward(Long l10);

        void clearCache(Long l10, Boolean bool);

        void create(Long l10);

        void evaluateJavascript(Long l10, String str, Result<String> result);

        WebViewPoint getScrollPosition(Long l10);

        Long getScrollX(Long l10);

        Long getScrollY(Long l10);

        String getTitle(Long l10);

        String getUrl(Long l10);

        void goBack(Long l10);

        void goForward(Long l10);

        void loadData(Long l10, String str, String str2, String str3);

        void loadDataWithBaseUrl(Long l10, String str, String str2, String str3, String str4, String str5);

        void loadUrl(Long l10, String str, Map<String, String> map);

        void postUrl(Long l10, String str, byte[] bArr);

        void reload(Long l10);

        void removeJavaScriptChannel(Long l10, Long l11);

        void scrollBy(Long l10, Long l11, Long l12);

        void scrollTo(Long l10, Long l11, Long l12);

        void setBackgroundColor(Long l10, Long l11);

        void setDownloadListener(Long l10, Long l11);

        void setWebChromeClient(Long l10, Long l11);

        void setWebContentsDebuggingEnabled(Boolean bool);

        void setWebViewClient(Long l10, Long l11);
    }

    private static class WebViewHostApiCodec extends StandardMessageCodec {
        public static final WebViewHostApiCodec INSTANCE = new WebViewHostApiCodec();

        private WebViewHostApiCodec() {
        }

        /* access modifiers changed from: protected */
        public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
            if (b10 != Byte.MIN_VALUE) {
                return super.readValueOfType(b10, byteBuffer);
            }
            return WebViewPoint.fromList((ArrayList) readValue(byteBuffer));
        }

        /* access modifiers changed from: protected */
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof WebViewPoint) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((WebViewPoint) obj).toList());
                return;
            }
            super.writeValue(byteArrayOutputStream, obj);
        }
    }

    public static final class WebViewPoint {

        /* renamed from: x  reason: collision with root package name */
        private Long f15237x;

        /* renamed from: y  reason: collision with root package name */
        private Long f15238y;

        public static final class Builder {

            /* renamed from: x  reason: collision with root package name */
            private Long f15239x;

            /* renamed from: y  reason: collision with root package name */
            private Long f15240y;

            public WebViewPoint build() {
                WebViewPoint webViewPoint = new WebViewPoint();
                webViewPoint.setX(this.f15239x);
                webViewPoint.setY(this.f15240y);
                return webViewPoint;
            }

            public Builder setX(Long l10) {
                this.f15239x = l10;
                return this;
            }

            public Builder setY(Long l10) {
                this.f15240y = l10;
                return this;
            }
        }

        WebViewPoint() {
        }

        static WebViewPoint fromList(ArrayList<Object> arrayList) {
            Long l10;
            WebViewPoint webViewPoint = new WebViewPoint();
            Object obj = arrayList.get(0);
            Long l11 = null;
            if (obj == null) {
                l10 = null;
            } else {
                l10 = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            webViewPoint.setX(l10);
            Object obj2 = arrayList.get(1);
            if (obj2 != null) {
                l11 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            webViewPoint.setY(l11);
            return webViewPoint;
        }

        public Long getX() {
            return this.f15237x;
        }

        public Long getY() {
            return this.f15238y;
        }

        public void setX(Long l10) {
            if (l10 != null) {
                this.f15237x = l10;
                return;
            }
            throw new IllegalStateException("Nonnull field \"x\" is null.");
        }

        public void setY(Long l10) {
            if (l10 != null) {
                this.f15238y = l10;
                return;
            }
            throw new IllegalStateException("Nonnull field \"y\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f15237x);
            arrayList.add(this.f15238y);
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
