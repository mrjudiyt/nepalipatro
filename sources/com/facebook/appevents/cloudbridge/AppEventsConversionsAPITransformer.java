package com.facebook.appevents.cloudbridge;

import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.cloudbridge.AppEventType;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import o8.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AppEventsConversionsAPITransformer.kt */
public final class AppEventsConversionsAPITransformer {
    public static final AppEventsConversionsAPITransformer INSTANCE = new AppEventsConversionsAPITransformer();
    public static final String TAG = "AppEventsConversionsAPITransformer";
    public static final Map<CustomEventField, SectionCustomEventFieldMapping> customEventTransformations;
    public static final Map<String, ConversionsAPIEventName> standardEventTransformations = h0.f(o.a(AppEventsConstants.EVENT_NAME_UNLOCKED_ACHIEVEMENT, ConversionsAPIEventName.UNLOCKED_ACHIEVEMENT), o.a(AppEventsConstants.EVENT_NAME_ACTIVATED_APP, ConversionsAPIEventName.ACTIVATED_APP), o.a(AppEventsConstants.EVENT_NAME_ADDED_PAYMENT_INFO, ConversionsAPIEventName.ADDED_PAYMENT_INFO), o.a(AppEventsConstants.EVENT_NAME_ADDED_TO_CART, ConversionsAPIEventName.ADDED_TO_CART), o.a(AppEventsConstants.EVENT_NAME_ADDED_TO_WISHLIST, ConversionsAPIEventName.ADDED_TO_WISHLIST), o.a(AppEventsConstants.EVENT_NAME_COMPLETED_REGISTRATION, ConversionsAPIEventName.COMPLETED_REGISTRATION), o.a(AppEventsConstants.EVENT_NAME_VIEWED_CONTENT, ConversionsAPIEventName.VIEWED_CONTENT), o.a(AppEventsConstants.EVENT_NAME_INITIATED_CHECKOUT, ConversionsAPIEventName.INITIATED_CHECKOUT), o.a(AppEventsConstants.EVENT_NAME_ACHIEVED_LEVEL, ConversionsAPIEventName.ACHIEVED_LEVEL), o.a(AppEventsConstants.EVENT_NAME_PURCHASED, ConversionsAPIEventName.PURCHASED), o.a(AppEventsConstants.EVENT_NAME_RATED, ConversionsAPIEventName.RATED), o.a(AppEventsConstants.EVENT_NAME_SEARCHED, ConversionsAPIEventName.SEARCHED), o.a(AppEventsConstants.EVENT_NAME_SPENT_CREDITS, ConversionsAPIEventName.SPENT_CREDITS), o.a(AppEventsConstants.EVENT_NAME_COMPLETED_TUTORIAL, ConversionsAPIEventName.COMPLETED_TUTORIAL));
    private static final Map<AppEventUserAndAppDataField, SectionFieldMapping> topLevelTransformations;

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    public enum DataProcessingParameterName {
        OPTIONS(FacebookSdk.DATA_PROCESSION_OPTIONS),
        COUNTRY(FacebookSdk.DATA_PROCESSION_OPTIONS_COUNTRY),
        STATE(FacebookSdk.DATA_PROCESSION_OPTIONS_STATE);
        
        public static final Companion Companion = null;
        private final String rawValue;

        /* compiled from: AppEventsConversionsAPITransformer.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final DataProcessingParameterName invoke(String str) {
                m.f(str, "rawValue");
                for (DataProcessingParameterName dataProcessingParameterName : DataProcessingParameterName.values()) {
                    if (m.a(dataProcessingParameterName.getRawValue(), str)) {
                        return dataProcessingParameterName;
                    }
                }
                return null;
            }
        }

        static {
            Companion = new Companion((g) null);
        }

        private DataProcessingParameterName(String str) {
            this.rawValue = str;
        }

        public final String getRawValue() {
            return this.rawValue;
        }
    }

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    public static final class SectionCustomEventFieldMapping {
        private ConversionsAPICustomEventField field;
        private ConversionsAPISection section;

        public SectionCustomEventFieldMapping(ConversionsAPISection conversionsAPISection, ConversionsAPICustomEventField conversionsAPICustomEventField) {
            m.f(conversionsAPICustomEventField, "field");
            this.section = conversionsAPISection;
            this.field = conversionsAPICustomEventField;
        }

        public static /* synthetic */ SectionCustomEventFieldMapping copy$default(SectionCustomEventFieldMapping sectionCustomEventFieldMapping, ConversionsAPISection conversionsAPISection, ConversionsAPICustomEventField conversionsAPICustomEventField, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                conversionsAPISection = sectionCustomEventFieldMapping.section;
            }
            if ((i10 & 2) != 0) {
                conversionsAPICustomEventField = sectionCustomEventFieldMapping.field;
            }
            return sectionCustomEventFieldMapping.copy(conversionsAPISection, conversionsAPICustomEventField);
        }

        public final ConversionsAPISection component1() {
            return this.section;
        }

        public final ConversionsAPICustomEventField component2() {
            return this.field;
        }

        public final SectionCustomEventFieldMapping copy(ConversionsAPISection conversionsAPISection, ConversionsAPICustomEventField conversionsAPICustomEventField) {
            m.f(conversionsAPICustomEventField, "field");
            return new SectionCustomEventFieldMapping(conversionsAPISection, conversionsAPICustomEventField);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SectionCustomEventFieldMapping)) {
                return false;
            }
            SectionCustomEventFieldMapping sectionCustomEventFieldMapping = (SectionCustomEventFieldMapping) obj;
            return this.section == sectionCustomEventFieldMapping.section && this.field == sectionCustomEventFieldMapping.field;
        }

        public final ConversionsAPICustomEventField getField() {
            return this.field;
        }

        public final ConversionsAPISection getSection() {
            return this.section;
        }

        public int hashCode() {
            ConversionsAPISection conversionsAPISection = this.section;
            return ((conversionsAPISection == null ? 0 : conversionsAPISection.hashCode()) * 31) + this.field.hashCode();
        }

        public final void setField(ConversionsAPICustomEventField conversionsAPICustomEventField) {
            m.f(conversionsAPICustomEventField, "<set-?>");
            this.field = conversionsAPICustomEventField;
        }

        public final void setSection(ConversionsAPISection conversionsAPISection) {
            this.section = conversionsAPISection;
        }

        public String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.section + ", field=" + this.field + ')';
        }
    }

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    public static final class SectionFieldMapping {
        private ConversionsAPIUserAndAppDataField field;
        private ConversionsAPISection section;

        public SectionFieldMapping(ConversionsAPISection conversionsAPISection, ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField) {
            m.f(conversionsAPISection, "section");
            this.section = conversionsAPISection;
            this.field = conversionsAPIUserAndAppDataField;
        }

        public static /* synthetic */ SectionFieldMapping copy$default(SectionFieldMapping sectionFieldMapping, ConversionsAPISection conversionsAPISection, ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                conversionsAPISection = sectionFieldMapping.section;
            }
            if ((i10 & 2) != 0) {
                conversionsAPIUserAndAppDataField = sectionFieldMapping.field;
            }
            return sectionFieldMapping.copy(conversionsAPISection, conversionsAPIUserAndAppDataField);
        }

        public final ConversionsAPISection component1() {
            return this.section;
        }

        public final ConversionsAPIUserAndAppDataField component2() {
            return this.field;
        }

        public final SectionFieldMapping copy(ConversionsAPISection conversionsAPISection, ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField) {
            m.f(conversionsAPISection, "section");
            return new SectionFieldMapping(conversionsAPISection, conversionsAPIUserAndAppDataField);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SectionFieldMapping)) {
                return false;
            }
            SectionFieldMapping sectionFieldMapping = (SectionFieldMapping) obj;
            return this.section == sectionFieldMapping.section && this.field == sectionFieldMapping.field;
        }

        public final ConversionsAPIUserAndAppDataField getField() {
            return this.field;
        }

        public final ConversionsAPISection getSection() {
            return this.section;
        }

        public int hashCode() {
            int hashCode = this.section.hashCode() * 31;
            ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField = this.field;
            return hashCode + (conversionsAPIUserAndAppDataField == null ? 0 : conversionsAPIUserAndAppDataField.hashCode());
        }

        public final void setField(ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField) {
            this.field = conversionsAPIUserAndAppDataField;
        }

        public final void setSection(ConversionsAPISection conversionsAPISection) {
            m.f(conversionsAPISection, "<set-?>");
            this.section = conversionsAPISection;
        }

        public String toString() {
            return "SectionFieldMapping(section=" + this.section + ", field=" + this.field + ')';
        }
    }

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    public enum ValueTransformationType {
        ARRAY,
        BOOL,
        INT;
        
        public static final Companion Companion = null;

        /* compiled from: AppEventsConversionsAPITransformer.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final ValueTransformationType invoke(String str) {
                m.f(str, "rawValue");
                if (m.a(str, AppEventUserAndAppDataField.EXT_INFO.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (m.a(str, AppEventUserAndAppDataField.URL_SCHEMES.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (m.a(str, CustomEventField.CONTENT_IDS.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (m.a(str, CustomEventField.CONTENTS.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (m.a(str, DataProcessingParameterName.OPTIONS.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (m.a(str, AppEventUserAndAppDataField.ADV_TE.getRawValue())) {
                    return ValueTransformationType.BOOL;
                }
                if (m.a(str, AppEventUserAndAppDataField.APP_TE.getRawValue())) {
                    return ValueTransformationType.BOOL;
                }
                if (m.a(str, CustomEventField.EVENT_TIME.getRawValue())) {
                    return ValueTransformationType.INT;
                }
                return null;
            }
        }

        static {
            Companion = new Companion((g) null);
        }
    }

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ValueTransformationType.values().length];
            iArr[ValueTransformationType.ARRAY.ordinal()] = 1;
            iArr[ValueTransformationType.BOOL.ordinal()] = 2;
            iArr[ValueTransformationType.INT.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConversionsAPISection.values().length];
            iArr2[ConversionsAPISection.APP_DATA.ordinal()] = 1;
            iArr2[ConversionsAPISection.USER_DATA.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AppEventType.values().length];
            iArr3[AppEventType.MOBILE_APP_INSTALL.ordinal()] = 1;
            iArr3[AppEventType.CUSTOM.ordinal()] = 2;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        AppEventUserAndAppDataField appEventUserAndAppDataField = AppEventUserAndAppDataField.ANON_ID;
        ConversionsAPISection conversionsAPISection = ConversionsAPISection.USER_DATA;
        AppEventUserAndAppDataField appEventUserAndAppDataField2 = AppEventUserAndAppDataField.ADV_TE;
        ConversionsAPISection conversionsAPISection2 = ConversionsAPISection.APP_DATA;
        topLevelTransformations = h0.f(o.a(appEventUserAndAppDataField, new SectionFieldMapping(conversionsAPISection, ConversionsAPIUserAndAppDataField.ANON_ID)), o.a(AppEventUserAndAppDataField.APP_USER_ID, new SectionFieldMapping(conversionsAPISection, ConversionsAPIUserAndAppDataField.FB_LOGIN_ID)), o.a(AppEventUserAndAppDataField.ADVERTISER_ID, new SectionFieldMapping(conversionsAPISection, ConversionsAPIUserAndAppDataField.MAD_ID)), o.a(AppEventUserAndAppDataField.PAGE_ID, new SectionFieldMapping(conversionsAPISection, ConversionsAPIUserAndAppDataField.PAGE_ID)), o.a(AppEventUserAndAppDataField.PAGE_SCOPED_USER_ID, new SectionFieldMapping(conversionsAPISection, ConversionsAPIUserAndAppDataField.PAGE_SCOPED_USER_ID)), o.a(appEventUserAndAppDataField2, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.ADV_TE)), o.a(AppEventUserAndAppDataField.APP_TE, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.APP_TE)), o.a(AppEventUserAndAppDataField.CONSIDER_VIEWS, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.CONSIDER_VIEWS)), o.a(AppEventUserAndAppDataField.DEVICE_TOKEN, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.DEVICE_TOKEN)), o.a(AppEventUserAndAppDataField.EXT_INFO, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.EXT_INFO)), o.a(AppEventUserAndAppDataField.INCLUDE_DWELL_DATA, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INCLUDE_DWELL_DATA)), o.a(AppEventUserAndAppDataField.INCLUDE_VIDEO_DATA, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INCLUDE_VIDEO_DATA)), o.a(AppEventUserAndAppDataField.INSTALL_REFERRER, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INSTALL_REFERRER)), o.a(AppEventUserAndAppDataField.INSTALLER_PACKAGE, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INSTALLER_PACKAGE)), o.a(AppEventUserAndAppDataField.RECEIPT_DATA, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.RECEIPT_DATA)), o.a(AppEventUserAndAppDataField.URL_SCHEMES, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.URL_SCHEMES)), o.a(AppEventUserAndAppDataField.USER_DATA, new SectionFieldMapping(conversionsAPISection, (ConversionsAPIUserAndAppDataField) null)));
        CustomEventField customEventField = CustomEventField.VALUE_TO_SUM;
        ConversionsAPISection conversionsAPISection3 = ConversionsAPISection.CUSTOM_DATA;
        customEventTransformations = h0.f(o.a(CustomEventField.EVENT_TIME, new SectionCustomEventFieldMapping((ConversionsAPISection) null, ConversionsAPICustomEventField.EVENT_TIME)), o.a(CustomEventField.EVENT_NAME, new SectionCustomEventFieldMapping((ConversionsAPISection) null, ConversionsAPICustomEventField.EVENT_NAME)), o.a(customEventField, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.VALUE_TO_SUM)), o.a(CustomEventField.CONTENT_IDS, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.CONTENT_IDS)), o.a(CustomEventField.CONTENTS, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.CONTENTS)), o.a(CustomEventField.CONTENT_TYPE, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.CONTENT_TYPE)), o.a(CustomEventField.CURRENCY, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.CURRENCY)), o.a(CustomEventField.DESCRIPTION, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.DESCRIPTION)), o.a(CustomEventField.LEVEL, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.LEVEL)), o.a(CustomEventField.MAX_RATING_VALUE, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.MAX_RATING_VALUE)), o.a(CustomEventField.NUM_ITEMS, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.NUM_ITEMS)), o.a(CustomEventField.PAYMENT_INFO_AVAILABLE, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.PAYMENT_INFO_AVAILABLE)), o.a(CustomEventField.REGISTRATION_METHOD, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.REGISTRATION_METHOD)), o.a(CustomEventField.SEARCH_STRING, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.SEARCH_STRING)), o.a(CustomEventField.SUCCESS, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.SUCCESS)), o.a(CustomEventField.ORDER_ID, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.ORDER_ID)), o.a(CustomEventField.AD_TYPE, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.AD_TYPE)));
    }

    private AppEventsConversionsAPITransformer() {
    }

    private final List<Map<String, Object>> combineAllTransformedDataForCustom(Map<String, ? extends Object> map, List<? extends Map<String, ? extends Object>> list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map putAll : list) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            linkedHashMap.putAll(putAll);
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }

    private final List<Map<String, Object>> combineAllTransformedDataForMobileAppInstall(Map<String, ? extends Object> map, Object obj) {
        if (obj == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put(ConversionsAPICustomEventField.EVENT_NAME.getRawValue(), OtherEventConstants.MOBILE_APP_INSTALL.getRawValue());
        linkedHashMap.put(ConversionsAPICustomEventField.EVENT_TIME.getRawValue(), obj);
        return o.b(linkedHashMap);
    }

    private final AppEventType splitAppEventParameters(Map<String, ? extends Object> map, Map<String, Object> map2, Map<String, Object> map3, ArrayList<Map<String, Object>> arrayList, Map<String, Object> map4) {
        Object obj = map.get(OtherEventConstants.EVENT.getRawValue());
        AppEventType.Companion companion = AppEventType.Companion;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        AppEventType invoke = companion.invoke((String) obj);
        if (invoke == AppEventType.OTHER) {
            return invoke;
        }
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            AppEventUserAndAppDataField invoke2 = AppEventUserAndAppDataField.Companion.invoke(str);
            if (invoke2 != null) {
                INSTANCE.transformAndUpdateAppAndUserData$facebook_core_release(map2, map3, invoke2, value);
            } else {
                boolean a10 = m.a(str, ConversionsAPISection.CUSTOM_EVENTS.getRawValue());
                boolean z10 = value instanceof String;
                if (invoke == AppEventType.CUSTOM && a10 && z10) {
                    ArrayList<Map<String, Object>> transformEvents$facebook_core_release = transformEvents$facebook_core_release((String) value);
                    if (transformEvents$facebook_core_release != null) {
                        arrayList.addAll(transformEvents$facebook_core_release);
                    }
                } else if (DataProcessingParameterName.Companion.invoke(str) != null) {
                    map4.put(str, value);
                }
            }
        }
        return invoke;
    }

    private final void transformAndUpdateAppData(Map<String, Object> map, AppEventUserAndAppDataField appEventUserAndAppDataField, Object obj) {
        SectionFieldMapping sectionFieldMapping = topLevelTransformations.get(appEventUserAndAppDataField);
        ConversionsAPIUserAndAppDataField field = sectionFieldMapping == null ? null : sectionFieldMapping.getField();
        if (field != null) {
            map.put(field.getRawValue(), obj);
        }
    }

    private final void transformAndUpdateUserData(Map<String, Object> map, AppEventUserAndAppDataField appEventUserAndAppDataField, Object obj) {
        if (appEventUserAndAppDataField == AppEventUserAndAppDataField.USER_DATA) {
            try {
                Utility utility = Utility.INSTANCE;
                map.putAll(Utility.convertJSONObjectToHashMap(new JSONObject((String) obj)));
            } catch (JSONException e10) {
                Logger.Companion.log(LoggingBehavior.APP_EVENTS, TAG, "\n transformEvents JSONException: \n%s\n%s", obj, e10);
            }
        } else {
            SectionFieldMapping sectionFieldMapping = topLevelTransformations.get(appEventUserAndAppDataField);
            ConversionsAPIUserAndAppDataField field = sectionFieldMapping == null ? null : sectionFieldMapping.getField();
            if (field != null) {
                map.put(field.getRawValue(), obj);
            }
        }
    }

    private final String transformEventName(String str) {
        Map<String, ConversionsAPIEventName> map = standardEventTransformations;
        if (!map.containsKey(str)) {
            return str;
        }
        ConversionsAPIEventName conversionsAPIEventName = map.get(str);
        return conversionsAPIEventName == null ? "" : conversionsAPIEventName.getRawValue();
    }

    public static final ArrayList<Map<String, Object>> transformEvents$facebook_core_release(String str) {
        m.f(str, "appEvents");
        ArrayList<Map> arrayList = new ArrayList<>();
        try {
            Utility utility = Utility.INSTANCE;
            for (String jSONObject : Utility.convertJSONArrayToList(new JSONArray(str))) {
                Utility utility2 = Utility.INSTANCE;
                arrayList.add(Utility.convertJSONObjectToHashMap(new JSONObject(jSONObject)));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList<Map<String, Object>> arrayList2 = new ArrayList<>();
            for (Map map : arrayList) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String str2 : map.keySet()) {
                    CustomEventField invoke = CustomEventField.Companion.invoke(str2);
                    SectionCustomEventFieldMapping sectionCustomEventFieldMapping = customEventTransformations.get(invoke);
                    if (!(invoke == null || sectionCustomEventFieldMapping == null)) {
                        ConversionsAPISection section = sectionCustomEventFieldMapping.getSection();
                        if (section == null) {
                            try {
                                String rawValue = sectionCustomEventFieldMapping.getField().getRawValue();
                                if (invoke == CustomEventField.EVENT_NAME && ((String) map.get(str2)) != null) {
                                    AppEventsConversionsAPITransformer appEventsConversionsAPITransformer = INSTANCE;
                                    Object obj = map.get(str2);
                                    if (obj != null) {
                                        linkedHashMap2.put(rawValue, appEventsConversionsAPITransformer.transformEventName((String) obj));
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                } else if (invoke == CustomEventField.EVENT_TIME && ((Integer) map.get(str2)) != null) {
                                    Object obj2 = map.get(str2);
                                    if (obj2 != null) {
                                        Object transformValue$facebook_core_release = transformValue$facebook_core_release(str2, obj2);
                                        if (transformValue$facebook_core_release != null) {
                                            linkedHashMap2.put(rawValue, transformValue$facebook_core_release);
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                        }
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                }
                            } catch (ClassCastException e10) {
                                Logger.Companion.log(LoggingBehavior.APP_EVENTS, TAG, "\n transformEvents ClassCastException: \n %s ", b.b(e10));
                            }
                        } else if (section == ConversionsAPISection.CUSTOM_DATA) {
                            String rawValue2 = sectionCustomEventFieldMapping.getField().getRawValue();
                            Object obj3 = map.get(str2);
                            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Any");
                            Object transformValue$facebook_core_release2 = transformValue$facebook_core_release(str2, obj3);
                            Objects.requireNonNull(transformValue$facebook_core_release2, "null cannot be cast to non-null type kotlin.Any");
                            linkedHashMap.put(rawValue2, transformValue$facebook_core_release2);
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    linkedHashMap2.put(ConversionsAPISection.CUSTOM_DATA.getRawValue(), linkedHashMap);
                }
                arrayList2.add(linkedHashMap2);
            }
            return arrayList2;
        } catch (JSONException e11) {
            Logger.Companion.log(LoggingBehavior.APP_EVENTS, TAG, "\n transformEvents JSONException: \n%s\n%s", str, e11);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:28|29) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:25|26|27|30|31|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r5 = com.facebook.internal.Utility.INSTANCE;
        r1 = com.facebook.internal.Utility.convertJSONArrayToList(new org.json.JSONArray(r1));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x007f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x008a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object transformValue$facebook_core_release(java.lang.String r6, java.lang.Object r7) {
        /*
            java.lang.String r0 = "field"
            kotlin.jvm.internal.m.f(r6, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.m.f(r7, r0)
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$ValueTransformationType$Companion r0 = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.ValueTransformationType.Companion
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$ValueTransformationType r6 = r0.invoke(r6)
            boolean r0 = r7 instanceof java.lang.String
            r1 = 0
            if (r0 == 0) goto L_0x0019
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x001a
        L_0x0019:
            r0 = r1
        L_0x001a:
            if (r6 == 0) goto L_0x00a4
            if (r0 != 0) goto L_0x0020
            goto L_0x00a4
        L_0x0020:
            int[] r2 = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.WhenMappings.$EnumSwitchMapping$0
            int r6 = r6.ordinal()
            r6 = r2[r6]
            r2 = 0
            r3 = 2
            r4 = 1
            if (r6 == r4) goto L_0x0053
            if (r6 == r3) goto L_0x0041
            r0 = 3
            if (r6 != r0) goto L_0x003b
            java.lang.String r6 = r7.toString()
            java.lang.Integer r6 = g9.o.f(r6)
            return r6
        L_0x003b:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x0041:
            java.lang.Integer r6 = g9.o.f(r0)
            if (r6 == 0) goto L_0x0052
            int r6 = r6.intValue()
            if (r6 == 0) goto L_0x004e
            r2 = 1
        L_0x004e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
        L_0x0052:
            return r1
        L_0x0053:
            com.facebook.internal.Utility r6 = com.facebook.internal.Utility.INSTANCE     // Catch:{ JSONException -> 0x008f }
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x008f }
            r6.<init>(r0)     // Catch:{ JSONException -> 0x008f }
            java.util.List r6 = com.facebook.internal.Utility.convertJSONArrayToList(r6)     // Catch:{ JSONException -> 0x008f }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ JSONException -> 0x008f }
            r0.<init>()     // Catch:{ JSONException -> 0x008f }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ JSONException -> 0x008f }
        L_0x0067:
            boolean r1 = r6.hasNext()     // Catch:{ JSONException -> 0x008f }
            if (r1 == 0) goto L_0x008e
            java.lang.Object r1 = r6.next()     // Catch:{ JSONException -> 0x008f }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x008f }
            com.facebook.internal.Utility r5 = com.facebook.internal.Utility.INSTANCE     // Catch:{ JSONException -> 0x007f }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x007f }
            r5.<init>(r1)     // Catch:{ JSONException -> 0x007f }
            java.util.Map r1 = com.facebook.internal.Utility.convertJSONObjectToHashMap(r5)     // Catch:{ JSONException -> 0x007f }
            goto L_0x008a
        L_0x007f:
            com.facebook.internal.Utility r5 = com.facebook.internal.Utility.INSTANCE     // Catch:{ JSONException -> 0x008a }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x008a }
            r5.<init>(r1)     // Catch:{ JSONException -> 0x008a }
            java.util.List r1 = com.facebook.internal.Utility.convertJSONArrayToList(r5)     // Catch:{ JSONException -> 0x008a }
        L_0x008a:
            r0.add(r1)     // Catch:{ JSONException -> 0x008f }
            goto L_0x0067
        L_0x008e:
            return r0
        L_0x008f:
            r6 = move-exception
            com.facebook.internal.Logger$Companion r0 = com.facebook.internal.Logger.Companion
            com.facebook.LoggingBehavior r1 = com.facebook.LoggingBehavior.APP_EVENTS
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r7
            r3[r4] = r6
            java.lang.String r6 = "AppEventsConversionsAPITransformer"
            java.lang.String r7 = "\n transformEvents JSONException: \n%s\n%s"
            r0.log((com.facebook.LoggingBehavior) r1, (java.lang.String) r6, (java.lang.String) r7, (java.lang.Object[]) r3)
            o8.q r6 = o8.q.f16189a
            return r6
        L_0x00a4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.transformValue$facebook_core_release(java.lang.String, java.lang.Object):java.lang.Object");
    }

    public final List<Map<String, Object>> combineAllTransformedData$facebook_core_release(AppEventType appEventType, Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, List<? extends Map<String, ? extends Object>> list, Object obj) {
        m.f(appEventType, "eventType");
        m.f(map, "userData");
        m.f(map2, "appData");
        m.f(map3, "restOfData");
        m.f(list, "customEvents");
        Map<String, Object> combineCommonFields$facebook_core_release = combineCommonFields$facebook_core_release(map, map2, map3);
        int i10 = WhenMappings.$EnumSwitchMapping$2[appEventType.ordinal()];
        if (i10 == 1) {
            return combineAllTransformedDataForMobileAppInstall(combineCommonFields$facebook_core_release, obj);
        }
        if (i10 != 2) {
            return null;
        }
        return combineAllTransformedDataForCustom(combineCommonFields$facebook_core_release, list);
    }

    public final Map<String, Object> combineCommonFields$facebook_core_release(Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3) {
        m.f(map, "userData");
        m.f(map2, "appData");
        m.f(map3, "restOfData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OtherEventConstants.ACTION_SOURCE.getRawValue(), OtherEventConstants.APP.getRawValue());
        linkedHashMap.put(ConversionsAPISection.USER_DATA.getRawValue(), map);
        linkedHashMap.put(ConversionsAPISection.APP_DATA.getRawValue(), map2);
        linkedHashMap.putAll(map3);
        return linkedHashMap;
    }

    public final List<Map<String, Object>> conversionsAPICompatibleEvent$facebook_core_release(Map<String, ? extends Object> map) {
        m.f(map, "parameters");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        AppEventType splitAppEventParameters = splitAppEventParameters(map, linkedHashMap, linkedHashMap2, arrayList, linkedHashMap3);
        if (splitAppEventParameters == AppEventType.OTHER) {
            return null;
        }
        return combineAllTransformedData$facebook_core_release(splitAppEventParameters, linkedHashMap, linkedHashMap2, linkedHashMap3, arrayList, map.get(OtherEventConstants.INSTALL_EVENT_TIME.getRawValue()));
    }

    public final void transformAndUpdateAppAndUserData$facebook_core_release(Map<String, Object> map, Map<String, Object> map2, AppEventUserAndAppDataField appEventUserAndAppDataField, Object obj) {
        m.f(map, "userData");
        m.f(map2, "appData");
        m.f(appEventUserAndAppDataField, "field");
        m.f(obj, "value");
        SectionFieldMapping sectionFieldMapping = topLevelTransformations.get(appEventUserAndAppDataField);
        if (sectionFieldMapping != null) {
            int i10 = WhenMappings.$EnumSwitchMapping$1[sectionFieldMapping.getSection().ordinal()];
            if (i10 == 1) {
                transformAndUpdateAppData(map2, appEventUserAndAppDataField, obj);
            } else if (i10 == 2) {
                transformAndUpdateUserData(map, appEventUserAndAppDataField, obj);
            }
        }
    }
}
