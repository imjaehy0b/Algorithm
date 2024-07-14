// const fs = require('fs');
// const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');


// const testCase = +input[0];
// let numArr = [];

// for(let i=1; i<input.length; i++){
//     numArr.push(+input[i]);
// }

// numArr.sort((a,b)=>a-b);
// console.log(numArr.join('\n'));

// node.js 풀이 , 제출 불가능한 언어라 java로 대체하여 품

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)  throws IOException{
	    int[] cnt = new int[10001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i< n; i++){
            cnt[Integer.parseInt(br.readLine())] ++;
        }   
        
        br.close();
        
        
        StringBuilder  sb = new StringBuilder();
        
        for(int i=1; i< 10001; i++){
            while(cnt[i] > 0){
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
}
