import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//숫자 1을 걸려면 총 2초가 필요하다.
// 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.

public class clock {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        String s=bf.readLine();
        int count=0;

        for(int i=0; i<s.length(); i++){
            switch (s.charAt(i)){
                case 'A':
                case 'B':
                case 'C':
                    count +=3;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    count +=4;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    count +=5;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    count +=6;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    count +=7;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    count +=8;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    count +=9;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    count +=10;
                    break;
            }

        }
        System.out.println(count);
    }
}