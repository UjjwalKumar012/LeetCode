class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length()) {
            return ans;
        }

        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];


        for (char ch : p.toCharArray()) {
            pFreq[ch - 'a']++;
        }

        int k = p.length();

        for (int i = 0; i < k; i++) {
            windowFreq[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pFreq, windowFreq)) {
            ans.add(0);
        }


        for (int r = k; r < s.length(); r++) {


            windowFreq[s.charAt(r) - 'a']++;

            windowFreq[s.charAt(r - k) - 'a']--;

            if (Arrays.equals(pFreq, windowFreq)) {
                ans.add(r - k + 1);
            }
        }

        return ans;
    }
}