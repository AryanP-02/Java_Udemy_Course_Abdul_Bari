public class StringMethodsMaster {

    public static void main(String[] args) {

        // --- 1. MEMORY & COMPARISON ---
        // Note: We use literals to satisfy the 'Redundant String Constructor' warning.
        String primary = "Java";
        String secondary = "Java";
        String different = "JAVA";

        // Using .equals() is the 'Green' way to compare content
        boolean isSame = primary.equals(secondary);
        boolean isCaseSame = primary.equalsIgnoreCase(different);

        System.out.println("Content Equality: " + isSame);
        System.out.println("Case-Insensitive Equality: " + isCaseSame);

        // --- 2. DATA SANITIZATION ---
        String emailInput = "   Aryan.Patil@Internship.com   ";

        // Method chaining is cleaner and reduces "Unused Variable" warnings
        String cleanEmail = emailInput.trim().toLowerCase();
        System.out.println("Sanitized Email: " + cleanEmail);

        // --- 3. DYNAMIC EXTRACTION ---
        // We check for the character existence to avoid potential runtime errors
        if (cleanEmail.contains("@")) {
            int atIndex = cleanEmail.indexOf('@');

            // Extracting components
            String user = cleanEmail.substring(0, atIndex);
            String host = cleanEmail.substring(atIndex + 1);

            System.out.println("Username: " + user);
            System.out.println("Domain: " + host);
        }

        // --- 4. MODIFICATION ---
        // replace() is preferred over replaceAll() for simple character sequences
        String status = "Study Mode: Offline";
        String updatedStatus = status.replace("Offline", "Online");
        System.out.println("Current Status: " + updatedStatus);
    }
}