package PACKAGE_NAME;

//알고리즘 o(n2) 해결하기 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class first_last {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String s=br.readLine();
        int num=Integer.parseInt(s);

        String s1[]=new String[10];

        for(int i=0; i<num; i++){
            s1[i]=br.readLine();
        }
        for(int i=0; i<num; i++){
            System.out.print(s1[i].charAt(0));
            int lastIndex=s1[i].length()-1;
            System.out.print(s1[i].charAt(lastIndex));
            System.out.println();
        }

    }
}
