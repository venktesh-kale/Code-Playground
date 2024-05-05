class Solution {
    public int minAnagramLength(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int commonDivisor = map.get(s.charAt(0));

        for (int count : map.values()) {
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