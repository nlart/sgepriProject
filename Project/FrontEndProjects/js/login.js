function myFunction() {
    x = document.getElementById("accountName").value;
    if ( x == "" || isNaN(x)) {
        alert("不是数字");
    }
}