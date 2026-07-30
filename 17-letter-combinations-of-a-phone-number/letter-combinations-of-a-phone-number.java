class Solution {

    List<String> res = new ArrayList<>();

    String[] map = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
    };

    void solve(int index, String digits, StringBuilder sb) {

        if (index == digits.length()) {
            res.add(sb.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {

            sb.append(letters.charAt(i));

            solve(index + 1, digits, sb);

            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) {
            return res;
        }

        solve(0, digits, new StringBuilder());

        return res;
    }
}