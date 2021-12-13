var button = document.getElementById("button");
var display = 1;
console.log("Helloworld")
button.addEventListener("click", function () {
    if (display === 1) {
        console.log(display);
        document.getElementById("navigation").style.display = "block";
        document.getElementById("text").style.display = "block";
        display = 0;
    }
    else {
        console.log(display);
        document.getElementById("navigation").style.display = "none";
        document.getElementById("text").style.display = "none";
        display = 1;
    }

})