<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="mytag" uri="/WEB-INF/tld/SimpleTag.tld" %>
<!DOCTYPE html>
<html lang="zh" style=""
      class=" js flexbox canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers no-applicationcache svg inlinesvg smil svgclippaths">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Modify</title>
    <link rel="stylesheet" href="resources/transferFile/reset.css"> <!-- CSS reset -->
    <link rel="stylesheet" href="resources/transferFile/style.css"> <!-- Resource style -->
    <script src="resources/transferFile/modernizr.js"></script> <!-- Modernizr -->

</head>
<body style="">

<mytag:modify/>
<div class="jq22-container">
    <header class="jq22-header bgcolor-11">
        <h1><span></span></h1>
    </header>

    <span><a href="customerHOME.jsp"><img src="resources/transferFile/picture.jpg"></a></span>
    <form class="cd-form floating-labels" method="post" action="modify.do">
        <fieldset>


            <div class="error-message">
                <p>Your Information</p>
            </div>

            <div class="icon">
                <label class="cd-label" for="email">Email</label>
                <input class="email" type="email" name="email" id="email" value="${sessionScope.email}">
            </div>

            <div class="icon">
                <label class="cd-label" for="PhoneNo">PhoneNo</label>
                <input type="text" name="phoneNo" id="PhoneNo" value="${sessionScope.phoneNo}">
            </div>

            <div class="icon">
                <label class="cd-label" for="password">Password</label>
                <input type="text" name="password" id="password" value="${sessionScope.password}">
            </div>


        </fieldset>

        <fieldset>
            <div>
                <input type="submit" value="Confirm">
            </div>
        </fieldset>
    </form>
</div>

<script src="resources/transferFile/jquery-1.10.2.js"></script>
<script src="resources/transferFile/jquery.min.js"></script>
<script src="resources/transferFile/main.js"></script> <!-- Resource jQuery -->

</body>
</html>
