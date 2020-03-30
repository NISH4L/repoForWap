//alert("Hello Bro!");

"use strict";

function alertBox() {
    alert("*BLING* *BLING*")
}

window.onload = function() {
    function blinged() {
        let isBling = document.getElementById("checkBox");
        let textArea = document.getElementById("texts");
        if (isBling.checked === true) {
            textArea.style.fontWeight = "bold";
            textArea.style.color = "green";
            textArea.style.textDecoration = "underline";
            document.body.style.backgroundImage = "url(http://www.cs.washington.edu/education/courses/190m/CurrentQtr/labs/6/hundred-dollar-bill.jpg)";
        }
        else{
            textArea.style.fontWeight = "normal";
            textArea.style.color = "black";
            textArea.style.textDecoration = "none";
            document.body.style.backgroundImage = "none";
        }
    }
}