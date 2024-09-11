public class IPaddress {
    public boolean isValid(String str) {
        // edge case weater string is empty or does it start and end with dot
        if (str.isEmpty() || str.charAt(0) == '.' || str.charAt(str.length() - 1) == '.') {
            return false;
        }
        int dots = 0;
        int num = 0;
        boolean numStarted = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '.') {
                if (!numStarted) {
                    return false;
                }
                dots++;
                if (dots > 3) {
                    return false;
                }
                num = 0;
                numStarted = false;
            } else if (ch >= '0' && ch <= '9') {
                if (!numStarted && ch == '0' && (i + 1 < str.length() && str.charAt(i + 1) != '.')) {
                    return false;
                }

                numStarted = true;
                num = num * 10 + (ch - '0');

                if (num > 255) {
                    return false;
                }
            } else {
                return false;
            }
        }

        // Ensure exactly 3 dots and the last segment is valid
        return dots == 3 && numStarted;
    }

    public static void main(String[] args) {
        IPaddress ip = new IPaddress();
        System.out.println(ip.isValid("192.168.1.1")); // Output: true (valid)
        System.out.println(ip.isValid("255.255.255.255")); // Output: true (valid)
        System.out.println(ip.isValid("192.168.1")); // Output: false (invalid)
        System.out.println(ip.isValid("256.256.256.256")); // Output: false (invalid)
        System.out.println(ip.isValid("192.168.1.01")); // Output: false (invalid, leading zero)
        System.out.println(ip.isValid(".192.168.1.1")); // Output: false (invalid, leading dot)
        System.out.println(ip.isValid("192.168.1.1.")); // Output: false (invalid, trailing dot)
        System.out.println(ip.isValid("192.168.1.1")); // Output: false (invalid, consecutive dots)
    }
}