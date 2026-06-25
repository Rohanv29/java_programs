package recursion;

public class recursion_04 {
    public static void moveallx(String st,int idx,int count,String newst){
        if(idx==st.length()){
            for(int i=0;i<count;i++){
                newst+='x';
            }
            System.out.println(newst);
            return;
        }
        char currchar=st.charAt(idx);
        if(currchar=='x'){
            count++;
            moveallx(st, idx+1, count, newst);
        }
        else{
            newst+=currchar;
            moveallx(st, idx+1, count, newst);

        }
        
    }
    public static void main(String[] args) {
        String newst="";
        String st="abxacxxgf";
        moveallx(st, 0, 0, newst);
    }
}
