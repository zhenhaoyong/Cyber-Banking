<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%@ taglib prefix = "mytag" uri = "/WEB-INF/tld/SimpleTag.tld" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>balance</title>
</head>
<link rel="stylesheet" href="resources/transferFile/reset.css"> <!-- CSS reset -->
<link rel="stylesheet" href="resources/transferFile/style.css"> <!-- Resource style -->
<script src="resources/transferFile/modernizr.js"></script> <!-- Modernizr -->

</head>
<body style="">


<div class="jq22-container">
    <header class="jq22-header bgcolor-11">
        <h1><span></span></h1>
    </header>

    <span><a href="customerHOME.jsp"><img src="resources/transferFile/picture.jpg"></a></span>
    <form class="cd-form floating-labels">
        <fieldset>

            <legend>Balance</legend>

            <div class="error-message">
                <p>Please check your balance</p>
            </div>
            <span>Your balance is:<mytag:balance/></span>
        </fieldset>
    </form>
</div>

<script src="resources/transferFile/jquery-1.10.2.js"></script>
<script src="resources/transferFile/jquery.min.js"></script>
<script src="resources/transferFile/main.js"></script> <!-- Resource jQuery -->

</body>
</html>
