package bankmanagement.classesUtilitaire;

import java.security.SecureRandom;
import java.security.SecureRandom;
public class NumeroDeCompteGenerator {
    private static final String CHARS = "0123456789!@#$%&*";

    public static String generateNumeroDeCompte(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARS.length());
            sb.append(CHARS.charAt(index));
        }

        return sb.toString();
    }
}
