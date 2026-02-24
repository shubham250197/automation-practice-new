package javaPrograms;

public class ReverseString {
    public static void main(String[] args){
        String s1 = "shiv";
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        System.out.println(sb);
        sb.append("chaouhdry");
        System.out.println(sb);
    }
}
