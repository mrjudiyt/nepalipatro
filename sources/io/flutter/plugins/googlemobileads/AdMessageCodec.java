package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import com.google.android.gms.ads.RequestConfiguration;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.googlemobileads.FlutterAd;
import io.flutter.plugins.googlemobileads.FlutterAdManagerAdRequest;
import io.flutter.plugins.googlemobileads.FlutterAdRequest;
import io.flutter.plugins.googlemobileads.FlutterAdSize;
import io.flutter.plugins.googlemobileads.FlutterAdapterStatus;
import io.flutter.plugins.googlemobileads.FlutterRewardedAd;
import io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateFontStyle;
import io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateStyle;
import io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateTextStyle;
import io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateType;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

class AdMessageCodec extends StandardMessageCodec {
    private static final byte VALUE_ADAPTER_RESPONSE_INFO = -115;
    private static final byte VALUE_ADAPTER_STATUS = -120;
    private static final byte VALUE_ADMANAGER_AD_REQUEST = -122;
    private static final byte VALUE_AD_ERROR = -117;
    private static final byte VALUE_AD_REQUEST = -127;
    private static final byte VALUE_AD_SIZE = Byte.MIN_VALUE;
    private static final byte VALUE_ANCHORED_ADAPTIVE_BANNER_AD_SIZE = -114;
    private static final byte VALUE_COLOR = -103;
    private static final byte VALUE_FLUID_AD_SIZE = -126;
    private static final byte VALUE_INITIALIZATION_STATE = -121;
    private static final byte VALUE_INITIALIZATION_STATUS = -119;
    private static final byte VALUE_INLINE_ADAPTIVE_BANNER_AD_SIZE = -110;
    private static final byte VALUE_LOAD_AD_ERROR = -123;
    private static final byte VALUE_NATIVE_AD_OPTIONS = -112;
    private static final byte VALUE_NATIVE_TEMPLATE_FONT_STYLE = -105;
    private static final byte VALUE_NATIVE_TEMPLATE_STYLE = -107;
    private static final byte VALUE_NATIVE_TEMPLATE_TEXT_STYLE = -106;
    private static final byte VALUE_NATIVE_TEMPLATE_TYPE = -104;
    private static final byte VALUE_REQUEST_CONFIGURATION_PARAMS = -108;
    private static final byte VALUE_RESPONSE_INFO = -116;
    private static final byte VALUE_REWARD_ITEM = -124;
    private static final byte VALUE_SERVER_SIDE_VERIFICATION_OPTIONS = -118;
    private static final byte VALUE_SMART_BANNER_AD_SIZE = -113;
    private static final byte VALUE_VIDEO_OPTIONS = -111;
    final FlutterAdSize.AdSizeFactory adSizeFactory;
    Context context;
    private MediationNetworkExtrasProvider mediationNetworkExtrasProvider;
    private final FlutterRequestAgentProvider requestAgentProvider;

    /* renamed from: io.flutter.plugins.googlemobileads.AdMessageCodec$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$googlemobileads$FlutterAdapterStatus$AdapterInitializationState;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.flutter.plugins.googlemobileads.FlutterAdapterStatus$AdapterInitializationState[] r0 = io.flutter.plugins.googlemobileads.FlutterAdapterStatus.AdapterInitializationState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$flutter$plugins$googlemobileads$FlutterAdapterStatus$AdapterInitializationState = r0
                io.flutter.plugins.googlemobileads.FlutterAdapterStatus$AdapterInitializationState r1 = io.flutter.plugins.googlemobileads.FlutterAdapterStatus.AdapterInitializationState.NOT_READY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$flutter$plugins$googlemobileads$FlutterAdapterStatus$AdapterInitializationState     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.plugins.googlemobileads.FlutterAdapterStatus$AdapterInitializationState r1 = io.flutter.plugins.googlemobileads.FlutterAdapterStatus.AdapterInitializationState.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.googlemobileads.AdMessageCodec.AnonymousClass1.<clinit>():void");
        }
    }

    AdMessageCodec(Context context2, FlutterRequestAgentProvider flutterRequestAgentProvider) {
        this.context = context2;
        this.adSizeFactory = new FlutterAdSize.AdSizeFactory();
        this.requestAgentProvider = flutterRequestAgentProvider;
    }

    private static Boolean booleanValueOf(Object obj) {
        if (obj == null) {
            return null;
        }
        return (Boolean) obj;
    }

    /* access modifiers changed from: protected */
    public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        switch (b10) {
            case Byte.MIN_VALUE:
                try {
                    return new FlutterAdSize(((Integer) readValueOfType(byteBuffer.get(), byteBuffer2)).intValue(), ((Integer) readValueOfType(byteBuffer.get(), byteBuffer2)).intValue());
                } catch (Throwable th) {
                    throw th;
                }
            case -127:
                return new FlutterAdRequest.Builder().setKeywords((List) readValueOfType(byteBuffer.get(), byteBuffer2)).setContentUrl((String) readValueOfType(byteBuffer.get(), byteBuffer2)).setNonPersonalizedAds(booleanValueOf(readValueOfType(byteBuffer.get(), byteBuffer2))).setNeighboringContentUrls((List) readValueOfType(byteBuffer.get(), byteBuffer2)).setHttpTimeoutMillis((Integer) readValueOfType(byteBuffer.get(), byteBuffer2)).setMediationNetworkExtrasIdentifier((String) readValueOfType(byteBuffer.get(), byteBuffer2)).setMediationNetworkExtrasProvider(this.mediationNetworkExtrasProvider).setAdMobExtras((Map) readValueOfType(byteBuffer.get(), byteBuffer2)).setRequestAgent(this.requestAgentProvider.getRequestAgent()).build();
            case -126:
                return new FlutterAdSize.FluidAdSize();
            case -124:
                return new FlutterRewardedAd.FlutterRewardItem((Integer) readValueOfType(byteBuffer.get(), byteBuffer2), (String) readValueOfType(byteBuffer.get(), byteBuffer2));
            case -123:
                return new FlutterAd.FlutterLoadAdError(((Integer) readValueOfType(byteBuffer.get(), byteBuffer2)).intValue(), (String) readValueOfType(byteBuffer.get(), byteBuffer2), (String) readValueOfType(byteBuffer.get(), byteBuffer2), (FlutterAd.FlutterResponseInfo) readValueOfType(byteBuffer.get(), byteBuffer2));
            case -122:
                FlutterAdManagerAdRequest.Builder builder = new FlutterAdManagerAdRequest.Builder();
                builder.setKeywords((List) readValueOfType(byteBuffer.get(), byteBuffer2));
                builder.setContentUrl((String) readValueOfType(byteBuffer.get(), byteBuffer2));
                builder.setCustomTargeting((Map) readValueOfType(byteBuffer.get(), byteBuffer2));
                builder.setCustomTargetingLists((Map) readValueOfType(byteBuffer.get(), byteBuffer2));
                builder.setNonPersonalizedAds((Boolean) readValueOfType(byteBuffer.get(), byteBuffer2));
                builder.setNeighboringContentUrls((List) readValueOfType(byteBuffer.get(), byteBuffer2));
                builder.setHttpTimeoutMillis((Integer) readValueOfType(byteBuffer.get(), byteBuffer2));
                builder.setPublisherProvidedId((String) readValueOfType(byteBuffer.get(), byteBuffer2));
                builder.setMediationNetworkExtrasIdentifier((String) readValueOfType(byteBuffer.get(), byteBuffer2));
                builder.setMediationNetworkExtrasProvider(this.mediationNetworkExtrasProvider);
                builder.setAdMobExtras((Map) readValueOfType(byteBuffer.get(), byteBuffer2));
                builder.setRequestAgent(this.requestAgentProvider.getRequestAgent());
                return builder.build();
            case -121:
                String str = (String) readValueOfType(byteBuffer.get(), byteBuffer2);
                str.hashCode();
                if (str.equals("ready")) {
                    return FlutterAdapterStatus.AdapterInitializationState.READY;
                }
                if (str.equals("notReady")) {
                    return FlutterAdapterStatus.AdapterInitializationState.NOT_READY;
                }
                throw new IllegalArgumentException(String.format("Unable to handle state: %s", new Object[]{str}));
            case -120:
                return new FlutterAdapterStatus((FlutterAdapterStatus.AdapterInitializationState) readValueOfType(byteBuffer.get(), byteBuffer2), (String) readValueOfType(byteBuffer.get(), byteBuffer2), (Number) readValueOfType(byteBuffer.get(), byteBuffer2));
            case -119:
                return new FlutterInitializationStatus((Map<String, FlutterAdapterStatus>) (Map) readValueOfType(byteBuffer.get(), byteBuffer2));
            case -118:
                return new FlutterServerSideVerificationOptions((String) readValueOfType(byteBuffer.get(), byteBuffer2), (String) readValueOfType(byteBuffer.get(), byteBuffer2));
            case -117:
                return new FlutterAd.FlutterAdError(((Integer) readValueOfType(byteBuffer.get(), byteBuffer2)).intValue(), (String) readValueOfType(byteBuffer.get(), byteBuffer2), (String) readValueOfType(byteBuffer.get(), byteBuffer2));
            case -116:
                return new FlutterAd.FlutterResponseInfo((String) readValueOfType(byteBuffer.get(), byteBuffer2), (String) readValueOfType(byteBuffer.get(), byteBuffer2), (List) readValueOfType(byteBuffer.get(), byteBuffer2), (FlutterAd.FlutterAdapterResponseInfo) readValueOfType(byteBuffer.get(), byteBuffer2), (Map) readValueOfType(byteBuffer.get(), byteBuffer2));
            case -115:
                return new FlutterAd.FlutterAdapterResponseInfo((String) readValueOfType(byteBuffer.get(), byteBuffer2), ((Long) readValueOfType(byteBuffer.get(), byteBuffer2)).longValue(), (String) readValueOfType(byteBuffer.get(), byteBuffer2), (Map) readValueOfType(byteBuffer.get(), byteBuffer2), (FlutterAd.FlutterAdError) readValueOfType(byteBuffer.get(), byteBuffer2), (String) readValueOfType(byteBuffer.get(), byteBuffer2), (String) readValueOfType(byteBuffer.get(), byteBuffer2), (String) readValueOfType(byteBuffer.get(), byteBuffer2), (String) readValueOfType(byteBuffer.get(), byteBuffer2));
            case -114:
                return new FlutterAdSize.AnchoredAdaptiveBannerAdSize(this.context, this.adSizeFactory, (String) readValueOfType(byteBuffer.get(), byteBuffer2), ((Integer) readValueOfType(byteBuffer.get(), byteBuffer2)).intValue());
            case -113:
                return new FlutterAdSize.SmartBannerAdSize();
            case -112:
                return new FlutterNativeAdOptions((Integer) readValueOfType(byteBuffer.get(), byteBuffer2), (Integer) readValueOfType(byteBuffer.get(), byteBuffer2), (FlutterVideoOptions) readValueOfType(byteBuffer.get(), byteBuffer2), (Boolean) readValueOfType(byteBuffer.get(), byteBuffer2), (Boolean) readValueOfType(byteBuffer.get(), byteBuffer2), (Boolean) readValueOfType(byteBuffer.get(), byteBuffer2));
            case -111:
                return new FlutterVideoOptions((Boolean) readValueOfType(byteBuffer.get(), byteBuffer2), (Boolean) readValueOfType(byteBuffer.get(), byteBuffer2), (Boolean) readValueOfType(byteBuffer.get(), byteBuffer2));
            case -110:
                Integer num = (Integer) readValueOfType(byteBuffer.get(), byteBuffer2);
                return new FlutterAdSize.InlineAdaptiveBannerAdSize(this.adSizeFactory, this.context, ((Integer) readValueOfType(byteBuffer.get(), byteBuffer2)).intValue(), num, (Integer) readValueOfType(byteBuffer.get(), byteBuffer2));
            case -108:
                RequestConfiguration.Builder builder2 = new RequestConfiguration.Builder();
                builder2.setMaxAdContentRating((String) readValueOfType(byteBuffer.get(), byteBuffer2));
                builder2.setTagForChildDirectedTreatment(((Integer) readValueOfType(byteBuffer.get(), byteBuffer2)).intValue());
                builder2.setTagForUnderAgeOfConsent(((Integer) readValueOfType(byteBuffer.get(), byteBuffer2)).intValue());
                builder2.setTestDeviceIds((List) readValueOfType(byteBuffer.get(), byteBuffer2));
                return builder2.build();
            case -107:
                return new FlutterNativeTemplateStyle((FlutterNativeTemplateType) readValueOfType(byteBuffer.get(), byteBuffer2), (ColorDrawable) readValueOfType(byteBuffer.get(), byteBuffer2), (FlutterNativeTemplateTextStyle) readValueOfType(byteBuffer.get(), byteBuffer2), (FlutterNativeTemplateTextStyle) readValueOfType(byteBuffer.get(), byteBuffer2), (FlutterNativeTemplateTextStyle) readValueOfType(byteBuffer.get(), byteBuffer2), (FlutterNativeTemplateTextStyle) readValueOfType(byteBuffer.get(), byteBuffer2));
            case -106:
                return new FlutterNativeTemplateTextStyle((ColorDrawable) readValueOfType(byteBuffer.get(), byteBuffer2), (ColorDrawable) readValueOfType(byteBuffer.get(), byteBuffer2), (FlutterNativeTemplateFontStyle) readValueOfType(byteBuffer.get(), byteBuffer2), (Double) readValueOfType(byteBuffer.get(), byteBuffer2));
            case -105:
                return FlutterNativeTemplateFontStyle.fromIntValue(((Integer) readValueOfType(byteBuffer.get(), byteBuffer2)).intValue());
            case -104:
                return FlutterNativeTemplateType.fromIntValue(((Integer) readValueOfType(byteBuffer.get(), byteBuffer2)).intValue());
            case -103:
                return new ColorDrawable(Color.argb(((Integer) readValueOfType(byteBuffer.get(), byteBuffer2)).intValue(), ((Integer) readValueOfType(byteBuffer.get(), byteBuffer2)).intValue(), ((Integer) readValueOfType(byteBuffer.get(), byteBuffer2)).intValue(), ((Integer) readValueOfType(byteBuffer.get(), byteBuffer2)).intValue()));
            default:
                return super.readValueOfType(b10, byteBuffer);
        }
    }

    /* access modifiers changed from: package-private */
    public void setContext(Context context2) {
        this.context = context2;
    }

    /* access modifiers changed from: package-private */
    public void setMediationNetworkExtrasProvider(MediationNetworkExtrasProvider mediationNetworkExtrasProvider2) {
        this.mediationNetworkExtrasProvider = mediationNetworkExtrasProvider2;
    }

    /* access modifiers changed from: protected */
    public void writeAdSize(ByteArrayOutputStream byteArrayOutputStream, FlutterAdSize flutterAdSize) {
        if (flutterAdSize instanceof FlutterAdSize.InlineAdaptiveBannerAdSize) {
            FlutterAdSize.InlineAdaptiveBannerAdSize inlineAdaptiveBannerAdSize = (FlutterAdSize.InlineAdaptiveBannerAdSize) flutterAdSize;
            byteArrayOutputStream.write(-110);
            writeValue(byteArrayOutputStream, Integer.valueOf(inlineAdaptiveBannerAdSize.width));
            writeValue(byteArrayOutputStream, inlineAdaptiveBannerAdSize.maxHeight);
            writeValue(byteArrayOutputStream, inlineAdaptiveBannerAdSize.orientation);
        } else if (flutterAdSize instanceof FlutterAdSize.AnchoredAdaptiveBannerAdSize) {
            byteArrayOutputStream.write(-114);
            FlutterAdSize.AnchoredAdaptiveBannerAdSize anchoredAdaptiveBannerAdSize = (FlutterAdSize.AnchoredAdaptiveBannerAdSize) flutterAdSize;
            writeValue(byteArrayOutputStream, anchoredAdaptiveBannerAdSize.orientation);
            writeValue(byteArrayOutputStream, Integer.valueOf(anchoredAdaptiveBannerAdSize.width));
        } else if (flutterAdSize instanceof FlutterAdSize.SmartBannerAdSize) {
            byteArrayOutputStream.write(-113);
        } else if (flutterAdSize instanceof FlutterAdSize.FluidAdSize) {
            byteArrayOutputStream.write(-126);
        } else {
            byteArrayOutputStream.write(-128);
            writeValue(byteArrayOutputStream, Integer.valueOf(flutterAdSize.width));
            writeValue(byteArrayOutputStream, Integer.valueOf(flutterAdSize.height));
        }
    }

    /* access modifiers changed from: protected */
    public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof FlutterAdSize) {
            writeAdSize(byteArrayOutputStream, (FlutterAdSize) obj);
        } else if (obj instanceof FlutterAdManagerAdRequest) {
            byteArrayOutputStream.write(-122);
            FlutterAdManagerAdRequest flutterAdManagerAdRequest = (FlutterAdManagerAdRequest) obj;
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getKeywords());
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getContentUrl());
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getCustomTargeting());
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getCustomTargetingLists());
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getNonPersonalizedAds());
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getNeighboringContentUrls());
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getHttpTimeoutMillis());
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getPublisherProvidedId());
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getMediationExtrasIdentifier());
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getAdMobExtras());
        } else if (obj instanceof FlutterAdRequest) {
            byteArrayOutputStream.write(-127);
            FlutterAdRequest flutterAdRequest = (FlutterAdRequest) obj;
            writeValue(byteArrayOutputStream, flutterAdRequest.getKeywords());
            writeValue(byteArrayOutputStream, flutterAdRequest.getContentUrl());
            writeValue(byteArrayOutputStream, flutterAdRequest.getNonPersonalizedAds());
            writeValue(byteArrayOutputStream, flutterAdRequest.getNeighboringContentUrls());
            writeValue(byteArrayOutputStream, flutterAdRequest.getHttpTimeoutMillis());
            writeValue(byteArrayOutputStream, flutterAdRequest.getMediationExtrasIdentifier());
            writeValue(byteArrayOutputStream, flutterAdRequest.getAdMobExtras());
        } else if (obj instanceof FlutterRewardedAd.FlutterRewardItem) {
            byteArrayOutputStream.write(-124);
            FlutterRewardedAd.FlutterRewardItem flutterRewardItem = (FlutterRewardedAd.FlutterRewardItem) obj;
            writeValue(byteArrayOutputStream, flutterRewardItem.amount);
            writeValue(byteArrayOutputStream, flutterRewardItem.type);
        } else if (obj instanceof FlutterAd.FlutterAdapterResponseInfo) {
            byteArrayOutputStream.write(-115);
            FlutterAd.FlutterAdapterResponseInfo flutterAdapterResponseInfo = (FlutterAd.FlutterAdapterResponseInfo) obj;
            writeValue(byteArrayOutputStream, flutterAdapterResponseInfo.getAdapterClassName());
            writeValue(byteArrayOutputStream, Long.valueOf(flutterAdapterResponseInfo.getLatencyMillis()));
            writeValue(byteArrayOutputStream, flutterAdapterResponseInfo.getDescription());
            writeValue(byteArrayOutputStream, flutterAdapterResponseInfo.getAdUnitMapping());
            writeValue(byteArrayOutputStream, flutterAdapterResponseInfo.getError());
            writeValue(byteArrayOutputStream, flutterAdapterResponseInfo.getAdSourceName());
            writeValue(byteArrayOutputStream, flutterAdapterResponseInfo.getAdSourceId());
            writeValue(byteArrayOutputStream, flutterAdapterResponseInfo.getAdSourceInstanceName());
            writeValue(byteArrayOutputStream, flutterAdapterResponseInfo.getAdSourceInstanceId());
        } else if (obj instanceof FlutterAd.FlutterResponseInfo) {
            byteArrayOutputStream.write(-116);
            FlutterAd.FlutterResponseInfo flutterResponseInfo = (FlutterAd.FlutterResponseInfo) obj;
            writeValue(byteArrayOutputStream, flutterResponseInfo.getResponseId());
            writeValue(byteArrayOutputStream, flutterResponseInfo.getMediationAdapterClassName());
            writeValue(byteArrayOutputStream, flutterResponseInfo.getAdapterResponses());
            writeValue(byteArrayOutputStream, flutterResponseInfo.getLoadedAdapterResponseInfo());
            writeValue(byteArrayOutputStream, flutterResponseInfo.getResponseExtras());
        } else if (obj instanceof FlutterAd.FlutterLoadAdError) {
            byteArrayOutputStream.write(-123);
            FlutterAd.FlutterLoadAdError flutterLoadAdError = (FlutterAd.FlutterLoadAdError) obj;
            writeValue(byteArrayOutputStream, Integer.valueOf(flutterLoadAdError.code));
            writeValue(byteArrayOutputStream, flutterLoadAdError.domain);
            writeValue(byteArrayOutputStream, flutterLoadAdError.message);
            writeValue(byteArrayOutputStream, flutterLoadAdError.responseInfo);
        } else if (obj instanceof FlutterAd.FlutterAdError) {
            byteArrayOutputStream.write(-117);
            FlutterAd.FlutterAdError flutterAdError = (FlutterAd.FlutterAdError) obj;
            writeValue(byteArrayOutputStream, Integer.valueOf(flutterAdError.code));
            writeValue(byteArrayOutputStream, flutterAdError.domain);
            writeValue(byteArrayOutputStream, flutterAdError.message);
        } else if (obj instanceof FlutterAdapterStatus.AdapterInitializationState) {
            byteArrayOutputStream.write(-121);
            FlutterAdapterStatus.AdapterInitializationState adapterInitializationState = (FlutterAdapterStatus.AdapterInitializationState) obj;
            int i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$googlemobileads$FlutterAdapterStatus$AdapterInitializationState[adapterInitializationState.ordinal()];
            if (i10 == 1) {
                writeValue(byteArrayOutputStream, "notReady");
            } else if (i10 == 2) {
                writeValue(byteArrayOutputStream, "ready");
            } else {
                throw new IllegalArgumentException(String.format("Unable to handle state: %s", new Object[]{adapterInitializationState}));
            }
        } else if (obj instanceof FlutterAdapterStatus) {
            byteArrayOutputStream.write(-120);
            FlutterAdapterStatus flutterAdapterStatus = (FlutterAdapterStatus) obj;
            writeValue(byteArrayOutputStream, flutterAdapterStatus.state);
            writeValue(byteArrayOutputStream, flutterAdapterStatus.description);
            writeValue(byteArrayOutputStream, flutterAdapterStatus.latency);
        } else if (obj instanceof FlutterInitializationStatus) {
            byteArrayOutputStream.write(-119);
            writeValue(byteArrayOutputStream, ((FlutterInitializationStatus) obj).adapterStatuses);
        } else if (obj instanceof FlutterServerSideVerificationOptions) {
            byteArrayOutputStream.write(-118);
            FlutterServerSideVerificationOptions flutterServerSideVerificationOptions = (FlutterServerSideVerificationOptions) obj;
            writeValue(byteArrayOutputStream, flutterServerSideVerificationOptions.getUserId());
            writeValue(byteArrayOutputStream, flutterServerSideVerificationOptions.getCustomData());
        } else if (obj instanceof FlutterNativeAdOptions) {
            byteArrayOutputStream.write(-112);
            FlutterNativeAdOptions flutterNativeAdOptions = (FlutterNativeAdOptions) obj;
            writeValue(byteArrayOutputStream, flutterNativeAdOptions.adChoicesPlacement);
            writeValue(byteArrayOutputStream, flutterNativeAdOptions.mediaAspectRatio);
            writeValue(byteArrayOutputStream, flutterNativeAdOptions.videoOptions);
            writeValue(byteArrayOutputStream, flutterNativeAdOptions.requestCustomMuteThisAd);
            writeValue(byteArrayOutputStream, flutterNativeAdOptions.shouldRequestMultipleImages);
            writeValue(byteArrayOutputStream, flutterNativeAdOptions.shouldReturnUrlsForImageAssets);
        } else if (obj instanceof RequestConfiguration) {
            byteArrayOutputStream.write(-108);
            RequestConfiguration requestConfiguration = (RequestConfiguration) obj;
            writeValue(byteArrayOutputStream, requestConfiguration.getMaxAdContentRating());
            writeValue(byteArrayOutputStream, Integer.valueOf(requestConfiguration.getTagForChildDirectedTreatment()));
            writeValue(byteArrayOutputStream, Integer.valueOf(requestConfiguration.getTagForUnderAgeOfConsent()));
            writeValue(byteArrayOutputStream, requestConfiguration.getTestDeviceIds());
        } else if (obj instanceof FlutterVideoOptions) {
            byteArrayOutputStream.write(-111);
            FlutterVideoOptions flutterVideoOptions = (FlutterVideoOptions) obj;
            writeValue(byteArrayOutputStream, flutterVideoOptions.clickToExpandRequested);
            writeValue(byteArrayOutputStream, flutterVideoOptions.customControlsRequested);
            writeValue(byteArrayOutputStream, flutterVideoOptions.startMuted);
        } else if (obj instanceof FlutterNativeTemplateStyle) {
            byteArrayOutputStream.write(-107);
            FlutterNativeTemplateStyle flutterNativeTemplateStyle = (FlutterNativeTemplateStyle) obj;
            writeValue(byteArrayOutputStream, flutterNativeTemplateStyle.getTemplateType());
            writeValue(byteArrayOutputStream, flutterNativeTemplateStyle.getMainBackgroundColor());
            writeValue(byteArrayOutputStream, flutterNativeTemplateStyle.getCallToActionStyle());
            writeValue(byteArrayOutputStream, flutterNativeTemplateStyle.getPrimaryTextStyle());
            writeValue(byteArrayOutputStream, flutterNativeTemplateStyle.getSecondaryTextStyle());
            writeValue(byteArrayOutputStream, flutterNativeTemplateStyle.getTertiaryTextStyle());
        } else if (obj instanceof FlutterNativeTemplateFontStyle) {
            byteArrayOutputStream.write(-105);
            writeValue(byteArrayOutputStream, Integer.valueOf(((FlutterNativeTemplateFontStyle) obj).ordinal()));
        } else if (obj instanceof FlutterNativeTemplateType) {
            byteArrayOutputStream.write(-104);
            writeValue(byteArrayOutputStream, Integer.valueOf(((FlutterNativeTemplateType) obj).ordinal()));
        } else if (obj instanceof FlutterNativeTemplateTextStyle) {
            byteArrayOutputStream.write(-106);
            FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle = (FlutterNativeTemplateTextStyle) obj;
            writeValue(byteArrayOutputStream, flutterNativeTemplateTextStyle.getTextColor());
            writeValue(byteArrayOutputStream, flutterNativeTemplateTextStyle.getBackgroundColor());
            writeValue(byteArrayOutputStream, flutterNativeTemplateTextStyle.getFontStyle());
            writeValue(byteArrayOutputStream, flutterNativeTemplateTextStyle.getSize());
        } else if (obj instanceof ColorDrawable) {
            byteArrayOutputStream.write(-103);
            int color = ((ColorDrawable) obj).getColor();
            writeValue(byteArrayOutputStream, Integer.valueOf(Color.alpha(color)));
            writeValue(byteArrayOutputStream, Integer.valueOf(Color.red(color)));
            writeValue(byteArrayOutputStream, Integer.valueOf(Color.green(color)));
            writeValue(byteArrayOutputStream, Integer.valueOf(Color.blue(color)));
        } else {
            super.writeValue(byteArrayOutputStream, obj);
        }
    }

    AdMessageCodec(Context context2, FlutterAdSize.AdSizeFactory adSizeFactory2, FlutterRequestAgentProvider flutterRequestAgentProvider) {
        this.context = context2;
        this.adSizeFactory = adSizeFactory2;
        this.requestAgentProvider = flutterRequestAgentProvider;
    }
}
