/*
    input
    2 //테스트 케이스 수
    5 데이터 크기
    1 2 3 4 5
    5
    5 4 2 3 1

 */

const input = [
    2, //테스트 케이스 수
    5, //데이터 크기
    [1,2,3,4,5],
    [5],
    [5,4,2,3,1]
]

class Stack
{
    MAX_N = 100;
    top;
    stack = new Array(this.MAX_N);

    constructor() {
    }

    //스택 시작
    stackInit()
    {
        this.top = 0;
    }

    //스택이 비었는지 확인
    stackIsEmpty()
    {
        return this.top === 0;
    }

    //스택이 가득 찼는지 확인
    stackIsFull()
    {
        return this.top === this.MAX_N;
    }

    //스택에 값 입력
    stackPush(value)
    {
        //스택이 가득 차있는지 체크
        if(this.stackIsFull()){
            console.log('stack overflow');
            return false;
        }
        (this.stack)[this.top] = value;
        this.top++;

        return true;
    }

    stackPop()
    {
        if(this.stackIsEmpty()){
            console.log('stack is empty');
            return null;
        }
        this.top--;
        return (this.stack)[this.top];
    }
}


let test = new Stack();
test.stackInit();

let testCase = input[0];
let answer = [];
for (let i = testCase; i <input.length; i++) {
    for (let j = 0; j < input[i].length; j++) {
        test.stackPush(input[i][j]);
        console.log(test.stackPop());
    }
    console.log('=============')
}





