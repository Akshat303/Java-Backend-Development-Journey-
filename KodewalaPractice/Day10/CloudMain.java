class CloudMain extends ServerDetails {
    public static void main(String[] args) {
        CloudMain cloud = new CloudMain();
        
        // Directly accessing protected members through inheritance
        System.out.println("Server Status: " + cloud.serverStatus);
        System.out.println("Active Users: " + cloud.activeConnections);
        cloud.displayDiagnostics();
    }
}