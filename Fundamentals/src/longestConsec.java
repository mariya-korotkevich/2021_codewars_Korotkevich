import java.util.Arrays;

class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        String result = "";

        if (k <= strarr.length && k >0){
            String[] words = new String[strarr.length - k + 1];
            for (int i = 0; i < strarr.length - k + 1; i++) {
                String s = strarr[i];
                for (int j = 1; j < k; j++) {
                    s += strarr[i+j];
                }
                words[i] = s;
            }
            result = words[0];
            for (int i = 1; i < words.length; i++) {
                if (result.length() < words[i].length()){
                    result = words[i];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2)); //"abigailtheta")
        System.out.println(LongestConsec.longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1)); //"oocccffuucccjjjkkkjyyyeehh");
        System.out.println(LongestConsec.longestConsec(new String[] {}, 3)); //"");
        System.out.println(LongestConsec.longestConsec(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2)); //"wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck");
        System.out.println(LongestConsec.longestConsec(new String[] {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2)); //"wlwsasphmxxowiaxujylentrklctozmymu");
        System.out.println(LongestConsec.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas"}, -2)); //"");
        System.out.println(LongestConsec.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3)); // "ixoyx3452zzzzzzzzzzzz");
        System.out.println(LongestConsec.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 15)); // "");
        System.out.println(LongestConsec.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 0)); // "");
    }
}