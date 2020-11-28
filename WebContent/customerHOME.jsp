<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/27 0027
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>CBank</title>
    <link rel="stylesheet" type="text/css" href="resources/CustomerHomeFiles/css/style.css">
</head>
<body>

<div class="auto-box">
    <div class="main-box">
        <div class="index-tit">
            <h1>More intimate than offline banks, it's C-BANK</h1>
            <p>Nearly 20 years of service experience, a thousand hard work to create online services</p>
        </div>
        <ul class="index-tserver">
            <li class="tserver-list1">
                Hello:${sessionScope.name}
                <p class="animated zoomin">
                    <a href="modifyInfo.jsp">View and modify personal information</a>
                </p>
            </li>
            <li class="tserver-list2">
                Balance
                <p class="animated zoomin">
                    <a href="balance.jsp">View your personal balance</a>
                </p>
            </li>
            <li class="tserver-list3">
                Message box
                <p class="animated zoomin">
                    <a href="/customer/feedbank">Leave your valuable comments and suggestions</a>
                </p>
            </li>
            <li class="tserver-list4">
               Log out
                <p class="animated zoomin">
                    <a href="logout.do">Log out</a>
                </p>
            </li>
            <li class="tserver-list5">
                Details
                <p class="animated zoomin">
                    <a href="https://www.jq22.com/demo/jquerygnjs201907120848/#">View history details</a>
                </p>
            </li>
            <li class="tserver-list6">
                Transfer
                <p class="animated zoomin">
                    <a href="transfer.jsp">Transfer</a>
                </p>
            </li>
            <li class="tserver-list7">
                Other services
                <p class="animated zoomin">
                    <a href="https://www.jq22.com/demo/jquerygnjs201907120848/#">Other services</a>
                </p>
            </li>
        </ul>
    </div>
    <div class="index-tserver-ad">
        <div class="main-box">
            <ul>
                <li><img src="resources/CustomerHomeFiles/images/tserver-ad-icon1.png">7*24*365 service support</li>
                <li><img src="resources/CustomerHomeFiles/images/tserver-ad-icon2.png">Provide personalized financial solutions</li>
                <li><img src="resources/CustomerHomeFiles/images/tserver-ad-icon3.png">Second-level rapid response</li>
                <li><img src="resources/CustomerHomeFiles/images/tserver-ad-icon4.png">Intimate service</li>
                <li><img src="resources/CustomerHomeFiles/images/tserver-ad-icon5.png">Keep your property safe</li>
            </ul>
        </div>
    </div>
</div>



</body></html>
