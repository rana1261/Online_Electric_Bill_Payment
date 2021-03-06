<%
    session.setAttribute("username", null);
    session.invalidate();
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin login Page</title>
        <meta charset="utf-8">
        <meta name="description" content="Onlin Bill Payment">
        <meta name="keywords" content="Admin login,Name,password,Mobile Payment type,Transaction ID,Bangladesh Power Development Board(BPDB)">
        <meta name="author" content="Md. Sohel Rana">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="refresh" content="120">
        <link rel="shortcut icon" href="image/logo.png" />
        <link rel="stylesheet" href="css/login.css" type="text/css">
    </head>
    <body>
        <div class="page_margin">


            <div class="header_container">
                <img src="image/logo.png" alt="Header Logo" class="image1">

                <div class="header_content">
                    <h1>Bangladesh Power Development Board</h1>
                </div>


            </div>

            <ul>
                <li><a  href="Home.jsp">Home</a></li>
                <li><a href="RegistrationForm.jsp">Registration</a></li>
                <li><a  href="BillPay.jsp">Bill Pay</a></li>
                <li><a href="billReceipt_login.jsp">Bill Receipt</a></li>
                <li><a class="active" href="Admin_login.jsp">Admin</a></li>
                <li style="float:right"><a href="about.jsp">About</a></li>
            </ul>

            <div> <img src="image/5.jpg" alt="Bill Screen Image" class="image2">


                <div class="bill_infocontainer">


                    <div class="from_container">
                        <h2>Login</h2>
                        <p>Please fill this form for Login.</P>
                    </div>

                    <div class="form_container"> 
                        <form action="AdminLoginServlet" method="post">
                            <input type="text" name="username"  placeholder="Username" align="center"><br><br>

                            <input type="password" name="Password" placeholder="Password"><br><br>


                            <input type="submit" value="Login">
                        </form>
                    </div>
             


                </div>

            </div>

            <footer>Copyright &copy; Sohel & Belal</footer>
        </div>

    </body>
</html>
