package strings;

public class str_01 {
    public static void main(String[] args) {
        // String sb="Rohan";
        // System.out.println(sb);
        StringBuilder sb=new StringBuilder("Rohan");
        System.out.println(sb);


        // //char at index 0
        // System.out.println(sb.charAt(0));


        // //set char at index 0
        // sb.setCharAt(0,'P');
        // System.out.println(sb);

        // //insert char in strings
        // sb.insert(3,'s');
        // System.out.println(sb);

        // //delete s from sb
        // sb.delete(2,3);
        // System.out.println(sb);
        

        // //append in string sb
        // sb.append("V");
        // System.out.println(sb);
         

        //reverse the string
        // sb.reverse();
        // System.out.println(sb);
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;

            char frontChar=sb.charAt(front);
            char backchar=sb.charAt(back);
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
