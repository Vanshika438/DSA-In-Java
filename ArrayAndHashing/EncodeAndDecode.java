class Solution {

    public String encode(List<String> strs) {
       StringBuilder sb=new StringBuilder();
       for(String s:strs){
        sb.append(s.length()).append('#').append(s);
       }
       return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int len=0;
            while(str.charAt(i)!='#'){
                len = len*10 +(str.charAt(i)-'0');
                i++;
            }
            i++;
            list.add(str.substring(i,i+len));
            i+=len;
        }
        return list;
    }
}
