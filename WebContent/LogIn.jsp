<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "loginfail" uri = "/WEB-INF/tld/SimpleTag.tld" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8">
    <title>C-Bank Login</title>
    <link rel="stylesheet"
          href="resources/CSS/style.css">
    <script src="resources/CSS/prompt.js"></script>
    <script type="text/javascript"
            src="resources/CSS/inspector.js"></script>
    <input type="hidden" id="_o_dbjbempljhcmhlfpfacalomonjpalpko">

</head>
<body class="on-start document-loaded">
<main>
    <form method="POST" action="login.do">
        <div class="form__cover"></div>
        <div class="form__loader">
            <div class="spinner active">
                <svg class="spinner__circular" viewBox="25 25 50 50">
                    <circle class="spinner__path" cx="50" cy="50" r="20" fill="none" stroke-width="4"
                            stroke-miterlimit="10"></circle>
                </svg>
            </div>
        </div>
        <div class="form__content">
            <h1 id="cbank">C-BANK</h1>
            <div class="styled-input">
                <input type="text" class="styled-input__input" name="phoneNo">
                <div class="styled-input__placeholder"><span class="styled-input__placeholder-text"><span
                        class="letter">U</span><span class="letter">s</span><span class="letter">e</span><span
                        class="letter">r</span><span class="letter">I</span><span class="letter">D</span></span></div>
                <div class="styled-input__circle"></div>
            </div>
            <div class="styled-input">
                <input type="password" class="styled-input__input" name="password">
                <div class="styled-input__placeholder"><span class="styled-input__placeholder-text"><span
                        class="letter">P</span><span class="letter">a</span><span class="letter">s</span><span
                        class="letter">s</span><span class="letter">w</span><span class="letter">o</span><span
                        class="letter">r</span><span class="letter">d</span></span></div>
                <div class="styled-input__circle"></div>
            </div>
            <div>
                <label class="indentity"><input type="radio" name="identity" value="client">client</label>
                <label class="indentity"><input type="radio" name="identity" value="staff">staff</label>
                <label class="indentity"><input type="radio" name="identity" value="administrator">administrator</label>
            </div>

            <button type="SUBMIT" class="styled-button"><span class="styled-button__real-text-holder">

           <span
                   class="styled-button__real-text">Submit</span> <span class="styled-button__moving-block face"><span
                    class="styled-button__text-holder"> <span
                    class="styled-button__text">Submit</span> </span> </span><span
                    class="styled-button__moving-block back"> <span class="styled-button__text-holder"> <span
                    class="styled-button__text">Submit</span> </span> </span> </span> </button>

            <br>
            <loginfail:note/><br>
            <a href=""><span style="font-size: 10px">Forgot password</span></a>
        </div>
    </form>
</main>
<script src="resources/CSS/Loginindex.js"></script>


<div id="extwaiokist" style="display:none" v="{6161" q="c0266c01" c="46.07" i="46" u="183.8" s="09142018" d="0"
     w="false" e="" m="BMe=">
    <div id="extwaiimpotscp" style="display:none" v="{6161" q="c0266c01" c="46.07" i="46" u="183.8" s="09142018" d="0"
         w="false" e="" m="BMe=" vn="0scr2"></div>
</div>
</body>
</html>