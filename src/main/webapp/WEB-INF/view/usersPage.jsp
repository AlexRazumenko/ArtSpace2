<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<%@ taglib uri="http://java.sun.com/JSP/Page" prefix="jsp" %>--%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>ArtSpace</title>
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"/>
    <%--<style type="text/css" media="all">--%>
    <%--@import "images/style.css";--%>

    <%--</style>--%>
    <style type="text/css">
        <%@ include file="resources/css/style.css"%>
    </style>
</head>
<body>
<div class="content">
    <div id="header">
        <div class="title">
            <h1>ART SPACE</h1>
            <h3>Creative space for everybody!</h3>
        </div>
    </div>
    <div id="main">
        <div class="center">
            <h2><a href="#">Welcome! </a></h2>
            <h3>ArtSpace greetings you!</h3>

            <br/>
            <c:out value="${message}"/><br>


            <form:form action="/register" method="post" modelAttribute="currentUser">
                <h2>Input required information below:</h2>
                <p>
                        <label>Name:</label>
                        <form:input path="name"/>

                        <label>E-mail:</label>
                        <form:textarea path="email"/>

                        <label>Password:</label>
                        <form:textarea path="password"/>

                        <input type="submit" value="Register" />
                </p>
            </form:form>


            <%--<form:form action="/register" method="post" modelAttribute="ty">--%>
                <%--<h2>Input required information below:</h2>--%>
                <%--<p>--%>
                    <%--<label>Type:</label>--%>
                    <%--<form:select path="type">--%>
                        <%--<c:forEach items="${typeEnumValues}" var="typename">--%>
                            <%--<form:option value="${typename.name()}"><c:out value="${typename.name()}"/></form:option>--%>
                        <%--</c:forEach>--%>
                    <%--</form:select>--%>

                    <%--<label>Title:</label>--%>
                    <%--<form:input path="title"/>--%>

                    <%--<label>Description:</label>--%>
                    <%--<form:textarea path="description"/>--%>

                    <%--<label>Text:</label>--%>
                    <%--<form:textarea path="text"/>--%>

                    <%--<input type="submit" value="Upload" />--%>

                <%--</p>--%>

            <%--</form:form>--%>


            <form action="/deleteContent/" method="post" style=


            <form:form action="/allContents" method="get" modelAttribute="allContentList">
                <table border="1">
                    <tr>
                        <td>ID</td>
                        <td>Author</td>
                        <td>Type</td>
                        <td>Title</td>
                        <td>Date</td>
                    </tr>

                    <c:forEach items="${allContentList}" var="currentContent">
                        <tr>
                            <td><c:out value="${currentContent.id}"/></td>
                            <td><c:out value="${currentContent.author.name}"/></td>
                            <td><c:out value="${currentContent.type}"/></td>
                            <td><c:out value="${currentContent.title}"/></td>
                            <td><c:out value="${currentContent.date}"/></td>
                        </tr>

                    </c:forEach>


                </table>
            </form:form>


            <table>


            </table>


            <p class="date">Posted by Jack <img src="images/more.gif" alt=""/> <a href="#">Read more</a> <img
                    src="images/comment.gif" alt=""/> <a href="#">Comments (15)</a> <img src="images/timeicon.gif"
                                                                                         alt=""/> 17.01.</p>
            <br/>
            <h2><a href="#">Try it with sNews 1.4</a></h2>
            <h3>AND WHY NOT WITH sNEWS 1.5 ;-)</h3>
            Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec sem. Praesent eu metus. Vivamus ac urna.
            Maecenas tincidunt libero id ipsum. Duis ipsum erat, laoreet in, ultrices at, blandit non, enim. Maecenas et
            libero. In laoreet vehicula enim. Nam at massa. Donec porttitor, odio id scelerisque pretium, augue eros
            cursus est, eget interdum dui justo et tellus. Aenean a neque eu mauris ultrices viverra. In ac urna. Etiam
            in dolor sit amet arcu auctor interdum. Fusce non quam. Nunc aliquet, quam eu facilisis venenatis, pede
            augue adipiscing lorem, nec tincidunt nunc felis eget odio. Integer iaculis pretium odio. Integer viverra.
            Integer porttitor elementum diam. In hac habitasse platea dictumst. Donec porta elit.
            <p class="date">Posted by Jack <img src=""${pageContext.request.contextPath}/images/more.gif" alt="" /> <a
                    href="#">Read more</a> <img src="images/comment.gif" alt=""/> <a href="#">Comments (15)</a> <img
                    src="images/timeicon.gif" alt=""/> 17.01.</p>
            <br/>
        </div>
        <div class="leftmenu">
            <div class="nav">
                <ul>
                    <li><a href="#">Home</a></li>
                    <li><a href="#">Login</a></li>
                    <li><a href="#">View content</a></li>
                    <li><a href="#">Upload content
                        <upload></upload>
                    </a></li>
                    <li><a href="#">Admin page</a></li>
                    <li><a href="#">About</a></li>
                    <li><a href="#">Contact</a></li>
                </ul>
            </div>
        </div>
    </div>
    <div id="prefooter">
        <%--<div class="particles">--%>
        <%--<h2>Top Articles</h2>--%>
        <%--<img src="images/arrow.gif" alt="" /> <a href="#">Integer euismod ante non diam adipiscing</a> <br />--%>
        <%--<img src="images/arrow.gif" alt="" /> <a href="#">consectetuer adipiscing elit dolor sit amet</a> <br />--%>
        <%--<img src="images/arrow.gif" alt="" /> <a href="#">Lorem ipsum dolor sit amet ipsum dolor</a><br />--%>
        <%--<img src="images/arrow.gif" alt="" /> <a href="#">Integer euismod ante non adipiscing elit </a><br />--%>
        <%--<img src="images/arrow.gif" alt="" /> <a href="#">Lorem ipsum dolor sit amet euismod ante</a><br />--%>
        <%--</div>--%>
        <%--<div class="comments">--%>
        <%--<h2>Last Comments</h2>--%>
        <%--<img src="images/arrow.gif" alt="" /> <a href="#">Integer euismod ante non diam adipiscing</a> <br />--%>
        <%--<img src="images/arrow.gif" alt="" /> <a href="#">consectetuer adipiscing elit dolor sit amet</a> <br />--%>
        <%--<img src="images/arrow.gif" alt="" /> <a href="#">Lorem ipsum dolor sit amet ipsum dolor</a><br />--%>
        <%--<img src="images/arrow.gif" alt="" /> <a href="#">Integer euismod ante non adipiscing elit </a><br />--%>
        <%--<img src="images/arrow.gif" alt="" /> <a href="#">Lorem ipsum dolor sit amet euismod ante</a><br />--%>
        <%--</div>--%>
    </div>
    <div id="footer">
        <div class="padding"> Copyright &copy; 2006 Your Site Name | Design: <a
                href="http://www.free-css-templates.com">David Herreman </a> | <a href="#">Contact</a> | <a
                href="http://jigsaw.w3.org/css-validator/check/referer">CSS</a> and <a
                href="http://validator.w3.org/check?uri=referer">XHTML</a> | <a href="http://www.solucija.com">Solucija.com</a>
            | <a href="#">Login</a></div>
    </div>
</div>
</body>
</html>
