class ServerDetails {
    protected String serverStatus = "ONLINE";
    protected int activeConnections = 350;

    protected void displayDiagnostics() {
        System.out.println("Base Server Diagnostics: OK");
    }
}