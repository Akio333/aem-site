var button = document.getElementById("icon");
var display = 1;
button.addEventListener("click", function () {
    if (display === 1) {
        console.log(display);
        document.getElementById("srch").style.display = "block";
        display = 0;
    }
    else {
        console.log(display);
        document.getElementById("srch").style.display = "none";
        display = 1;
    }

})