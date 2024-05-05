class Solution {
    public int minAnagramLength(String s) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int commonDivisor = charCount.get(s.charAt(0));

        for (int count : charCount.values()) {
            commonDivisor = calculateGCD(commonDivisor, count);
        }

        return s.length() / commonDivisor;
    }
    public int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}