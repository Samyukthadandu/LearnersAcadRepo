
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validate</title>
<style>

h2 { 
    align:center;
    display: block;
  font-size: 2em;
  margin-top: 0.67em;
  margin-bottom: 0.67em;
  margin-left: 0;
  margin-right: 0;
  font-weight: bold;
  text-align:center;
  background-color:blue;
}
#Teacher {
 
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 75%;
}

#Teacher td, #Teacher th {
  border: 1px solid #ddd;
  padding: 7px;
}

#Teacher tr:nth-child(even){background-color: #f2f2f2;}

#Teacher tr:hover {background-color: #ddd;}

#Teacher th {
  padding-top: 12px;
  padding-bottom: 12px;
  padding-left:20px;
   padding-right:10px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}



h1 { 
  display: block;
  font-size: 3em;
  margin-top: 0.67em;
  margin-bottom: 0.67em;
  margin-left: 0;
  margin-right: 0;
  font-weight: bold;
  text-align:center;
  background-color:yellow;
}


.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 9px 88px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 21px;
  margin: 4px 2px;
  transition-duration: 0.4s;
  cursor: pointer;  
  
}

.button1 {
  background-color: white; 
  color: black; 
  border: 2px solid #4CAF50;
 
}

.button1:hover {
  background-color: #4CAF50;
  color: white;
}

.button2 {
  background-color: white; 
  color: black; 
  border: 2px solid #008CBA;

}

.button2:hover {
  background-color: #008CBA;
  color: white;
}

.button3 {
  background-color: white; 
  color: black; 
  border: 2px solid #f44336;
 
}

.button3:hover {
  background-color: #f44336;
  color: white;
}

.button4 {
  background-color: white;
  color: black;
  border: 2px solid #e7e7e7;
  
}

.button4:hover {
background-color: #e7e7e7;
 color: white;
}

.button5 {
  background-color: white;
  color: black;
  border: 2px solid #555555;
 
}

.button5:hover {
  background-color: #555555;
  color: white;
}

</style>
</head>
<body>
<h1>Welcome</h1>
<form action = "AcademyInfo" method="post">
<div class="container">
  <div class="center" >
<button class="button button1" type="submit" name="b1" value="TEACHER">Teachers</button>
<button class="button button2" type="submit" name="b2" value="STUDENT">Students</button>
<button class="button button3" type="submit" name="b3" value="SUB"> Subjects </button>
<button class="button button4" type="submit" name="b4" value="REP">Reports </button>
<button class="button button6" type="submit" name="b5" value="signout">Logout</button>
  </div>
</div>






</form>
</body>
</html>