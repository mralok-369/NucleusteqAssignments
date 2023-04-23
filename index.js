function validation() {
    var fullname = document.getElementById('fullname').value;
    var username = document.getElementById('username').value;
    var email = document.getElementById('email').value;
    var mobilenumber = document.getElementById('mobilenumber').value;
    var password = document.getElementById('password').value;
    var confirmpassword = document.getElementById('confirmpassword').value;
    var gender = document.querySelector('input[name="gender"]:checked');

    if(fullname==""){
        document.getElementById('fname').innerHTML="**Please enter your full name";
    } else if((fullname.length<=2 )|| (fullname.length>=20)){
        document.getElementById('fname').innerHTML="**Full name length must be between 2-20 characters";
    } else if(!isNaN(fullname)){
        document.getElementById('fname').innerHTML="**Only characters allowed";
    } else 
    
    
    if(username==""){
        document.getElementById('uname').innerHTML="**Please enter your username";
    } else if((username.length<=2 )|| (username.length>=20)){
        document.getElementById('uname').innerHTML="**User name length must be between 2-20 characters";
    } else 
    
    
    if(email==""){
        document.getElementById('mail').innerHTML="**Please enter your email";
    } else if(email.indexOf('@')<=0){
        document.getElementById('mail').innerHTML="**@ invalid position";
    } else if((email.charAt(email.length-4)='.') && (email.charAt(email.length-3)!='.')){
        document.getElementById('mail').innerHTML="**. invalid position";
    } else 
    
    
    if(mobilenumber==""){
        document.getElementById('number').innerHTML="**Please enter your mobile number";
    } else if(isNaN(mobilenumber)){
        document.getElementById('number').innerHTML="**Only digits are allowed";
    } else if(mobilenumber.length!=10) {
        document.getElementById('number').innerHTML="**mobile number must be of 10 digits only";
    } else
    
    
    if(password==""){
        document.getElementById('pass').innerHTML="**Please enter your password";
    } else if((password.length<=5) || (password.length>20)){
        document.getElementById('pass').innerHTML="**Password length must be between 5-20 chars";
    } else 
    
    
    if(confirmpassword==""){
        document.getElementById('cpass').innerHTML="**Please enter your confirm password";
    } else if(password != confirmpassword){
        document.getElementById('cpass').innerHTML="**Password are not matching";
    } else 

    if(!gender.length) {
        document.getElementById('gender').innerHTML="**Plz select your gender";
    } else {
        alert("Registered Successfully.");
    }

}