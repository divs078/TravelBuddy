var createAccountButton = document.getElementById("create-account");
    var onButtonClick = function() {
      var name = document.getElementById("name-input").value;
      console.log(name);
      document.getElementById("name-input").value = "";
      var age = document.getElementById("age-input").value;
      console.log(age);
      document.getElementById("age-input").value = "";
      var email = document.getElementById("email-input").value;
      console.log(email);
      document.getElementById("email-input").value = "";
      var password = document.getElementById("password-input").value;
      console.log(password);
      document.getElementById("password-input").value = "";

      var pEl = document.createElement("p");
      var pText = document.createTextNode("Account created!");
      pEl.appendChild(pText);
  document.body.appendChild(pEl);
    };
    createAccountButton.addEventListener("click", onButtonClick);