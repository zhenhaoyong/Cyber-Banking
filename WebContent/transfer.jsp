<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "mytag" uri = "/WEB-INF/tld/SimpleTag.tld" %>
<!DOCTYPE html>
<html lang="zh" style=""
      class=" js flexbox canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers no-applicationcache svg inlinesvg smil svgclippaths">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title></title>
    <link rel="stylesheet" href="resources/transferFile/reset.css"> <!-- CSS reset -->
    <link rel="stylesheet" href="resources/transferFile/style.css"> <!-- Resource style -->
    <script src="resources/transferFile/modernizr.js"></script> <!-- Modernizr -->

</head>
<body style="">

<mytag:transfer/>

<div class="jq22-container">
    <header class="jq22-header bgcolor-11">
        <h1><span></span></h1>
    </header>

    <span><a href="customerHOME.jsp"><img src="resources/transferFile/picture.jpg"></a></span>
    <form class="cd-form floating-labels" method="post" action="transfer.do">
        <fieldset>

            <legend>Transfer</legend>

            <div class="error-message">
                <p>Please enter information</p>
            </div>

            <div class="icon">
                <label class="cd-label" for="cd-name">Name</label>
                <input class="user" type="text" name="name" id="cd-name" required="">
            </div>

            <div class="icon">
                <label class="cd-label" for="cd-phone">PhoneNumber</label>
                <input class="email " type="text" name="phoneNo" id="cd-phone" required="">
            </div>

            <div class="icon">
                <label class="cd-label" for="cd-money">Money</label>
                <input class="email " type="text" name="amount" id="cd-money" required="">
            </div>

        </fieldset>

        <fieldset>

            <legend>Other notes</legend>
            <div class="icon">
                <label class="cd-label" for="cd-textarea">Note</label>
                <textarea class="message" name="cd-textarea" id="cd-textarea" required=""></textarea>
            </div>

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
