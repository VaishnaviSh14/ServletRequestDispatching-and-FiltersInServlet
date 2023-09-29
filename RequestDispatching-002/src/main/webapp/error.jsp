<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Page</title>
<style>
  /* Internal CSS styles */
  body {
    background-color: #f4f4f4; /* Light gray background */
    font-family: Arial, sans-serif;
    text-align: center;
  }

  h1 {
    color: #ff5733; /* Red text color */
    font-size: 36px;
    margin-top: 20px;
  }

  a {
    background-color: #00a64e; /* Green button background */
    color: white;
    text-decoration: none;
    padding: 10px 20px;
    border-radius: 4px;
    font-weight: bold;
    margin-top: 20px;
    transition: background-color 0.3s ease; /* Smooth color transition */
  }

  a:hover {
    background-color: #00853e; /* Darker green on hover */
  }
</style>
</head>
<body>
   <h1>Oops! Something went wrong</h1>
   <p>The credentials you provided are incorrect.</p>
   <a href="login.html">| Back to Login |</a>
</body>
</html>
