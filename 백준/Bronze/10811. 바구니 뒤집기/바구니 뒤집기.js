const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');


const [n, m] = input[0].split(' ').map(Number);

const basket = [];
for(let i=1; i<=n; i++){
    basket.push(i);
}

for(let k=1; k<=m; k++){
    const [i,j] = input[k].split(' ').map(Number);
    
    let arr = basket.slice(i-1, j).reverse();
    basket.splice(i-1,j-i+1,...arr);
}

    console.log(basket.join(" "));