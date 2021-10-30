<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Report</title>
<style type="text/css">
a {
  position:absolute;
   right:55px;
  top: 45px;
  text-decoration: none;
  display: inline-block;
  padding: 8px 16px;
}

a:hover {
  background-color: #ddd;
  color: black;
}

.previous {
  background-color: green;
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


.round {
  border-radius: 50%;
}


.btn-group .button {
  
  background-color:gray;
  border: 1px solid green;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  font-size: 16px;
  cursor: pointer;
  width: 150px;
  display: block;
}

.btn-group .button:not(:last-child) {
  border-bottom: none; /* Prevent double borders */
}

.btn-group .button:hover {
  background-color: #3e8e41;
}
#Design {
  position:absolute;
  top:200px;
  left:350px;
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 55%;
 
}

#Design td, #Design th {
  
  border: 1px solid #ddd;
  padding: 7px;
}

#Design tr:nth-child(even){background-color: #f2f2f2;}

#Design tr:hover {background-color: pink;}

#Design th {
  padding-top: 4px;
  padding-bottom: 12px;
  padding-left:20px;
   padding-right:10px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
  
}
#Designsub {
  position:absolute;
  top:600px;
  left:350px;
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 55%;
 
}

#Designsub td, #Design th {
  
  border: 1px solid #ddd;
  padding: 7px;
}

#Designsub tr:nth-child(even){background-color: #f2f2f2;}

#Designsub tr:hover {background-color: pink;}

#Designsub th {
  padding-top: 4px;
  padding-bottom: 12px;
  padding-left:20px;
   padding-right:10px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
  
}
#DesignStud {
  position:absolute;
  top:600
  px;
  left:350px;
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 55%;
 
}

#DesignStud td, #DesignStud th {
  
  border: 1px solid #ddd;
  padding: 7px;
}

#DesignStud tr:nth-child(even){background-color: #f2f2f2;}

#DesignStud tr:hover {background-color: pink;}

#DesignStud th {
  padding-top: 4px;
  padding-bottom: 12px;
  padding-left:20px;
   padding-right:10px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
  
}

</style>
</head>
<body>
<h1>Class Reports</h1>
<form action = "Reports" method="post">

<a href="Validate.jsp" class="previous">&laquo; DashBoard</a>

<div class="btn-group">
<button class="button button1" type="submit" name="b1" value="1AA">1A</button>
<button class="button button2" type="submit" name="b2" value="1BB">1B</button>
<button class="button button3" type="submit" name="b3" value="2AA"> 2A </button>
<button class="button button4" type="submit" name="b4" value="2BB">2B </button>
<button class="button button5" type="submit" name="b5" value="3AA">3A</button>
<button class="button button6" type="submit" name="b6" value="3BB">3B</button>
<button class="button button7" type="submit" name="b7" value="4AA">4A</button>
<button class="button button8" type="submit" name="b8" value="4BB">4B</button>
<button class="button button9" type="submit" name="b9" value="5AA">5A</button>
<button class="button button10" type="submit" name="b10" value="5BB">5B</button>
<button class="button button11" type="submit" name="b11" value="6AA">6A</button>
<button class="button button12" type="submit" name="b12" value="6BB">6B</button>
<button class="button button13" type="submit" name="b13" value="7AA">7A</button>
<button class="button button14" type="submit" name="b14" value="7BB">7B</button>
<button class="button button15" type="submit" name="b15" value="8AA">8A</button>
<button class="button button16" type="submit" name="b16" value="8BB">8B</button>
<button class="button button17" type="submit" name="b17" value="9AA">9A</button>
<button class="button button18" type="submit" name="b18" value="9BB">9B</button>
<button class="button button19" type="submit" name="b19" value="10AA">10A</button>
<button class="button button20" type="submit" name="b20" value="10BB">10B</button>

</div>
</form>

</body>
</html>