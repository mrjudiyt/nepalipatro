package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class MetaDataStore {
    private static final String KEY_USER_ID = "userId";
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final FileStore fileStore;

    public MetaDataStore(FileStore fileStore2) {
        this.fileStore = fileStore2;
    }

    private static Map<String, String> jsonToKeysData(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, valueOrNull(jSONObject, next));
        }
        return hashMap;
    }

    private static List<RolloutAssignment> jsonToRolloutsState(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                arrayList.add(RolloutAssignment.create(string));
            } catch (Exception e10) {
                Logger logger = Logger.getLogger();
                logger.w("Failed de-serializing rollouts state. " + string, e10);
            }
        }
        return arrayList;
    }

    private String jsonToUserId(String str) {
        return valueOrNull(new JSONObject(str), "userId");
    }

    private static String keysDataToJson(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static String rolloutsStateToJson(List<RolloutAssignment> list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(RolloutAssignment.ROLLOUT_ASSIGNMENT_JSON_ENCODER.encode(list.get(i10))));
            } catch (JSONException e10) {
                Logger.getLogger().w("Exception parsing rollout assignment!", e10);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    private static void safeDeleteCorruptFile(File file) {
        if (file.exists() && file.delete()) {
            Logger logger = Logger.getLogger();
            logger.i("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    private static String userIdToJson(String str) {
        return new JSONObject(str) {
            final /* synthetic */ String val$userId;

            {
                this.val$userId = r2;
                put("userId", r2);
            }
        }.toString();
    }

    private static String valueOrNull(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, (String) null);
        }
        return null;
    }

    public File getInternalKeysFileForSession(String str) {
        return this.fileStore.getSessionFile(str, UserMetadata.INTERNAL_KEYDATA_FILENAME);
    }

    public File getKeysFileForSession(String str) {
        return this.fileStore.getSessionFile(str, UserMetadata.KEYDATA_FILENAME);
    }

    public File getRolloutsStateForSession(String str) {
        return this.fileStore.getSessionFile(str, UserMetadata.ROLLOUTS_STATE_FILENAME);
    }

    public File getUserDataFileForSession(String str) {
        return this.fileStore.getSessionFile(str, UserMetadata.USERDATA_FILENAME);
    }

    public Map<String, String> readKeyData(String str) {
        return readKeyData(str, false);
    }

    public List<RolloutAssignment> readRolloutsState(String str) {
        File rolloutsStateForSession = getRolloutsStateForSession(str);
        if (!rolloutsStateForSession.exists() || rolloutsStateForSession.length() == 0) {
            safeDeleteCorruptFile(rolloutsStateForSession);
            return Collections.emptyList();
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(rolloutsStateForSession);
            try {
                List<RolloutAssignment> jsonToRolloutsState = jsonToRolloutsState(CommonUtils.streamToString(fileInputStream2));
                Logger logger = Logger.getLogger();
                logger.d("Loaded rollouts state:\n" + jsonToRolloutsState + "\nfor session " + str);
                CommonUtils.closeOrLog(fileInputStream2, "Failed to close rollouts state file.");
                return jsonToRolloutsState;
            } catch (Exception e10) {
                e = e10;
                fileInputStream = fileInputStream2;
                try {
                    Logger.getLogger().w("Error deserializing rollouts state.", e);
                    safeDeleteCorruptFile(rolloutsStateForSession);
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close rollouts state file.");
                    return Collections.emptyList();
                } catch (Throwable th) {
                    th = th;
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                CommonUtils.closeOrLog(fileInputStream, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            Logger.getLogger().w("Error deserializing rollouts state.", e);
            safeDeleteCorruptFile(rolloutsStateForSession);
            CommonUtils.closeOrLog(fileInputStream, "Failed to close rollouts state file.");
            return Collections.emptyList();
        }
    }

    public String readUserId(String str) {
        FileInputStream fileInputStream;
        File userDataFileForSession = getUserDataFileForSession(str);
        FileInputStream fileInputStream2 = null;
        if (!userDataFileForSession.exists() || userDataFileForSession.length() == 0) {
            Logger.getLogger().d("No userId set for session " + str);
            safeDeleteCorruptFile(userDataFileForSession);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(userDataFileForSession);
            try {
                String jsonToUserId = jsonToUserId(CommonUtils.streamToString(fileInputStream));
                Logger.getLogger().d("Loaded userId " + jsonToUserId + " for session " + str);
                CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                return jsonToUserId;
            } catch (Exception e10) {
                e = e10;
                try {
                    Logger.getLogger().w("Error deserializing user metadata.", e);
                    safeDeleteCorruptFile(userDataFileForSession);
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
            Logger.getLogger().w("Error deserializing user metadata.", e);
            safeDeleteCorruptFile(userDataFileForSession);
            CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
            return null;
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void writeKeyData(String str, Map<String, String> map) {
        writeKeyData(str, map, false);
    }

    public void writeRolloutState(String str, List<RolloutAssignment> list) {
        File rolloutsStateForSession = getRolloutsStateForSession(str);
        if (list.isEmpty()) {
            safeDeleteCorruptFile(rolloutsStateForSession);
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            String rolloutsStateToJson = rolloutsStateToJson(list);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(rolloutsStateForSession), UTF_8));
            try {
                bufferedWriter2.write(rolloutsStateToJson);
                bufferedWriter2.flush();
                CommonUtils.closeOrLog(bufferedWriter2, "Failed to close rollouts state file.");
            } catch (Exception e10) {
                e = e10;
                bufferedWriter = bufferedWriter2;
                try {
                    Logger.getLogger().w("Error serializing rollouts state.", e);
                    safeDeleteCorruptFile(rolloutsStateForSession);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Throwable th) {
                    th = th;
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                CommonUtils.closeOrLog(bufferedWriter, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            Logger.getLogger().w("Error serializing rollouts state.", e);
            safeDeleteCorruptFile(rolloutsStateForSession);
            CommonUtils.closeOrLog(bufferedWriter, "Failed to close rollouts state file.");
        }
    }

    public void writeUserData(String str, String str2) {
        File userDataFileForSession = getUserDataFileForSession(str);
        BufferedWriter bufferedWriter = null;
        try {
            String userIdToJson = userIdToJson(str2);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(userDataFileForSession), UTF_8));
            try {
                bufferedWriter2.write(userIdToJson);
                bufferedWriter2.flush();
                CommonUtils.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
            } catch (Exception e10) {
                e = e10;
                bufferedWriter = bufferedWriter2;
                try {
                    Logger.getLogger().w("Error serializing user metadata.", e);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            Logger.getLogger().w("Error serializing user metadata.", e);
            CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
        }
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> readKeyData(String str, boolean z10) {
        Exception e10;
        FileInputStream fileInputStream;
        File internalKeysFileForSession = z10 ? getInternalKeysFileForSession(str) : getKeysFileForSession(str);
        if (!internalKeysFileForSession.exists() || internalKeysFileForSession.length() == 0) {
            safeDeleteCorruptFile(internalKeysFileForSession);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(internalKeysFileForSession);
            try {
                Map<String, String> jsonToKeysData = jsonToKeysData(CommonUtils.streamToString(fileInputStream));
                CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                return jsonToKeysData;
            } catch (Exception e11) {
                e10 = e11;
                try {
                    Logger.getLogger().w("Error deserializing user metadata.", e10);
                    safeDeleteCorruptFile(internalKeysFileForSession);
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e12) {
            Exception exc = e12;
            fileInputStream = null;
            e10 = exc;
            Logger.getLogger().w("Error deserializing user metadata.", e10);
            safeDeleteCorruptFile(internalKeysFileForSession);
            CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
            return Collections.emptyMap();
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void writeKeyData(String str, Map<String, String> map, boolean z10) {
        File internalKeysFileForSession = z10 ? getInternalKeysFileForSession(str) : getKeysFileForSession(str);
        BufferedWriter bufferedWriter = null;
        try {
            String keysDataToJson = keysDataToJson(map);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(internalKeysFileForSession), UTF_8));
            try {
                bufferedWriter2.write(keysDataToJson);
                bufferedWriter2.flush();
                CommonUtils.closeOrLog(bufferedWriter2, "Failed to close key/value metadata file.");
            } catch (Exception e10) {
                e = e10;
                bufferedWriter = bufferedWriter2;
                try {
                    Logger.getLogger().w("Error serializing key/value metadata.", e);
                    safeDeleteCorruptFile(internalKeysFileForSession);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            Logger.getLogger().w("Error serializing key/value metadata.", e);
            safeDeleteCorruptFile(internalKeysFileForSession);
            CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
        }
    }
}
