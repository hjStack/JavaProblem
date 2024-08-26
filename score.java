
//응시인원과 상받는 사람수대로 n번째 점수 출력 

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class score {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st =  new StringTokenizer(br.readLine()); //첫번째 줄 입력받기

        //응시 인원수
        int num1=Integer.parseInt(st.nextToken());

        //상 받는 사람 수
        int num2=Integer.parseInt(st.nextToken());

        int scores[]=new int[num1];
        st =  new StringTokenizer(br.readLine()); // 두번째줄 입력 받기 위해

        for(int i=0; i<num1; i++){
            scores[i] = Integer.parseInt(st.nextToken()); // 점수 입력 및 정수로 변환
        }

        Arrays.sort(scores);  //오름차순 정렬
        System.out.println(scores[num1 - num2]);

        bw.flush();
        bw.close();
    }
}
