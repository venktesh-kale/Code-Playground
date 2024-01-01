class Solution {
    public boolean isIsomorphic(String s, String t) {
     if(s.length() != t.length()) return false;

    Map<Character, Character> charmapping = new HashMap<>();
    for(int i = 0; i< s.length(); i++){
        char Orignal = s.charAt(i);
        char replacement = t.charAt(i);

        if(!charmapping.containsKey(Orignal)){
            if(!charmapping.containsValue(replacement)){
                charmapping.put(Orignal, replacement);
            }
            else
            return false;
        }
        else{
            char mappedchar = charmapping.get(Orignal);
            if(mappedchar != replacement){
                return false;
            }
        }
    }
    return true;
    }
}