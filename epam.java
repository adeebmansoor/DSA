public class epam {
// Reverse a string without changing sequence of special characters.(Java only) 
// Eg : Input  -  abc@def_m_$u
//      Output -  umf@edc_b_$a

    static String reverse(String s){
        int i = 0;
        int j = s.length()-1;
        char[] ch = s.toCharArray();
        while (i < j){
            if (!Character.isLetter(ch[i])){
                i++;
            }
            else if (!Character.isLetter(ch[j])){
                j--;
            }
            else{
                swap (ch, i, j);
                i++;
                j--;
            }
        }
        return new String(ch);
    }

    static void swap(char[] ch, int first, int second){
        char temp = ch[first];
        ch[first] = ch[second];
        ch[second] = temp;
    }

    public static void main(String[] args) {
        String s = "abc@def_m_$u";
        String ans = reverse(s);
        System.out.println(ans);
    }
}
