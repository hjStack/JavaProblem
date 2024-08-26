
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class coffee {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면 그 수를 완전수라고 한다.

        while(true){
            int p=Integer.parseInt(br.readLine());
            ArrayList<Integer> pok=new ArrayList<>();
            int sum=0;

            if(p == -1){
                break;
            }

            for(int i=1; i<p; i++){
                if(p% i == 0){
                    pok.add(i);  //객체를 추가
                    sum +=i;  //ArrayList 요소들의 합
                }
            }

            if(sum == p){
                System.out.print(p + " = ");
                for(int i=0; i<pok.size(); i++){
                    System.out.print(pok.get(i));  //주어진 인덱스에 저장된 객체 리턴
                    if (i < pok.size() - 1) {  //자신을 제외하고 출력하기 위함 ex) 6을 입력받으면 6은 제외
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            }
            else{  //완전수가 아니라면
                System.out.println(p + " is NOT perfect.");
            }
        }
    }
}


