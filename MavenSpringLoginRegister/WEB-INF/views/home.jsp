<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>TAMAKA SITE</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
  box-sizing: border-box;
}
body {
  font-family: Arial, Helvetica, sans-serif;
}
/* Style the header */
header {
  background-color: #666;
  padding: 30px;
  text-align: center;
  font-size: 35px;
  color: white;
}
/* Create two columns/boxes that floats next to each other */
nav {
  float: left;
  width: 30%;
  height: 300px; /* only for demonstration, should be removed */
  background: #ccc;
  padding: 20px;
}
/* Style the list inside the menu */
nav ul {
  list-style-type: none;
  padding: 0;
}
iframe {
  float: left;
  padding: 20px;
  width: 70%;
  background-color: #f1f1f1;
  height: 300px; /* only for demonstration, should be removed */
}
/* Clear floats after the columns */
section:after {
  content: "";
  display: table;
  clear: both;
}
/* Style the footer */
footer {
  background-color: #777;
  padding: 10px;
  text-align: center;
  color: white;
}
/* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */
@media (max-width: 600px) {
  nav, article {
    width: 100%;
    height: auto;
  }
}
</style>
</head>
<body>


<header>
  <h2>Welcome To TAMAKA</h2>
</header>

<section>
  <nav>
    <ul>
  
      <li><a href="/MavenSpringLoginRegister" target="main">Home</a></li><br/>

      <li><a href="/MavenSpringLoginRegister/register" target="main">CreateNewUser/Register</a></li><br/>
      <li><a href="/MavenSpringLoginRegister/login" target="main">Login</a></li><br/>  
         
    
    </ul>
  </nav>
  
  <article>
    <iframe name="main">
    
    </iframe>
  </article>
</section>

<footer>
  <p>Footer</p>
</footer>

</body>
</html>