
package mainInterfaces;


public class sessionManager {
    private static int accountId = -1;  // Default invalid value

    // Setter
    public static void setAccountId(int id) {
        accountId = id;
    }

    // Getter
    public static int getAccountId() {
        return accountId;
    }

    // Clear session (optional)
    public static void clearSession() {
        accountId = -1;
    }
}
