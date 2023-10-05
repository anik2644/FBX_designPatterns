package CloudSystem;

// CloudDataManager class for interacting with the cloud system
public class CloudDataManager {
    // Send data to the cloud
    public void sendData(String data) {
        CloudSystem.sendDataToCloud(data);
    }

    // Retrieve data from the cloud using a key
    public String retrieveData(String key) {
        return CloudSystem.retrieveDataFromCloud(key);
    }
}
