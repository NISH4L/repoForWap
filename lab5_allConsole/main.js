//Maharishi Uni WAP Lab 5
//Author: Nishal
//If any issues found, it will be corrected and updated in the git itself.
//So, use the direct github link instead if possible


// Question #1 Find max among two
function max (firstNum, secondNum){
    if(firstNum>secondNum)
        console.log(firstNum + " is greater!");
    else
        console.log(secondNum + " is greater!");
}

//Question #2
function maxOfThree(first,second,third){
    if(first>second){
        if(first>third)
            console.log(first + " is greater than all");
        else
            console.log(third + " is greater than all");
    }
    else if(second > third) {
        if (second > first)
            console.log(second + " is greater than all");
    }
    else
        console.log(third + " is greater than all");
}

//Question #3
function isVowel(char){
    return char === 'a' || char === 'e' || char === 'i' || char === 'o' || char === 'u';
    //OR
    //
    // if (char === 'a' || char === 'e' || char === 'i' || char === 'o' || char === 'u' )
    //     return true;
    // else
    //     return false;
}

//Question #4
const a = [];
function sum(a){
    let summed = 0;
    for(let i=0; i<a.length; i++){
        summed+=a[i];
    }
    return summed;
}

//Or another way, will be used for product
function product(a){
    let pro=1;
    for(let i in a){
        pro *= a[i];
    }
    return pro;
}

//Question #5
function reverse(str){
    //This following one should work but for some reason doesn't, so I will go with the loop method
    // var splittedInArray = str.split();
    // var reversedInArray = splittedInArray.reverse();
    // var joined = reversedInArray.join();
    // return joined;
    let newString = "";
    for(let i=str.length-1; i>=0; i--){
        newString = newString + str[i];
    }
    return newString;
}

//Question #6
function findLongestWord(arr){
    let longest;
    let initialLength = 0;
    for(let i=0; i<arr.length; i++){
        if(arr[i].length > initialLength ){
            initialLength = arr[i].length;
            longest = arr[i];
        }
    }
    return longest;
}

//Question #7
function filterLongWords(arr, int){
    let newArr = [];
    for(let i=0; i<arr.length; i++){
        if(arr[i].length >= int)
            newArr[newArr.length] = arr[i];
    }
    return newArr;
}

//Question #8
function computeSumOfSquares(arrOfNumbers){
    let sum = 0;
    for(let i=0; i<arrOfNumbers.length; i++){
        sum += (arrOfNumbers[i]*arrOfNumbers[i]);
    }
    return sum;
}

//Question #9
function printOddNumbersOnly(arr){
    let newArr = [];
    for(let i=0; i<arr.length; i++){
        if(arr[i]%2!==0)
            newArr[newArr.length] = arr[i]; //in the new spot of newArr, put this item
    }
    return newArr;
}

//Question #10
function computeSumOfSquaresOfEvensOnly(arr){
    let newArr = [];
    let sum = 0;
    for(let i=0; i<arr.length; i++) {
        if(arr[i]%2 === 0) {
            sum += (arr[i] * arr[i])
        }
    }
    return sum;
}

//Question #11, Using reduce for sum and product
function sumReduce(a){
    a.reduce(function (one,two) {
        return one + two;
    }, 0);
}

//Question #12, find second biggest
function findSecondBiggest(arr){
    let first = 0;
    let second = 0;
    for(let i=0; i<arr.length; i++){
        if(arr[i]>first) {
            first = arr[i];
        }
    }
    for(let i=0; i<arr.length; i++){
        if(arr[i]>second && arr[i]<first)
            second = arr[i];
    }
    return second;
}

//Question #13
function printFibo(n, a, b){
    let temp;
    let newArr = [];
    for(let i=0; i<n; i++) {
        temp = b;
        b = a+b;
        a = temp;
        newArr[newArr.length] = a;
    }
    return newArr;
}

//Question #14 implemented on form from lab4 as asked

//Question #15 implemented below

function theWatch(){
    let today = new Date();
    let y = today.getFullYear();
    let m = today.getMonth();
    let d = today.getDay();
    let h = today.getHours();
    let n = today.getMinutes();
    let s = today.getSeconds();

    d = noZero(d);
    n = noZero(n);
    s = noZero(s);

    document.getElementById("forClock").innerHTML= y + "-" + m + "-" + d + " " + h + ":" + n + ":" + s;
    let t = setTimeout(theWatch, 1000); //refreshes in this milliseconds

    //Prevents the single digit in the clock
    function noZero(digit){
        if(digit<10)
            digit = "0"+digit;
        return digit;
    }

}

