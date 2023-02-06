/* When the user clicks on the button,
toggle between hiding and showing the dropdown content */
function myFunction() {
  document.getElementById("myDropdown").classList.toggle("show");
}

function filterFunction() {
  var input, filter, ul, li, a, i;
  input = document.getElementById("myInput");
  filter = input.value.toUpperCase();
  div = document.getElementById("myDropdown");
  a = div.getElementsByTagName("a");
  for (i = 0; i < a.length; i++) {
    txtValue = a[i].textContent || a[i].innerText;
    if (txtValue.toUpperCase().indexOf(filter) > -1) {
      a[i].style.display = "";
    } else {
      a[i].style.display = "none";
    }
  }
}


var Destination = localStorage.getItem('Destination');
var traveltype = localStorage.getItem('traveltype');
  
function change() {
  var text = document.getElementById();
  localStorage.setItem('Destination', text.value);
};

function change1() {
  var text = document.getElementById();
  localStorage.setItem('traveltype', text.value);
};

var from = document.getElementById("from").value;
var to = document.getElementById("to").value;
var date = document.getElementById("datebut").value;



/*
function marta() {
  var x = document.getElementById("#marta");

}

*/




