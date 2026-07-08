package strings;
import java.util.*;
public class str_02 {
    // public static String gameofThrones(String s){
    //     HashMap<Character,Integer>map=new HashMap<>();
    //     for(char ch:s.toCharArray()){
    //         map.put(ch,map.getOrDefault(ch,0)+1);
    //     }
    //     int Odd=0;
    //     for(int freq:map.values()){
    //         if(freq%2!=0){
    //             Odd++;
    //         }

    //     }
    //     return Odd<=1? "Yes" : "No";
    // }
    public static String gameofThrones(String s){
        int[]freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        } 
        int odd=0;
        for(int count :freq){
            if(count%2!=0){
                odd++;
            }
        }
        return  odd<=1? "Yes":"No";
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(gameofThrones(s));
        sc.close();
    }
}
