<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<%@ taglib uri="http://java.sun.com/JSP/Page" prefix="jsp" %>--%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
<title>ArtSpace</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
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
      <h2><a href="#"> <c:out value="${message}" /> </a></h2>
      <h3>Please enter your login and password to login:</h3>



      <%--<form:form  action="/login" method="post" modelAttribute="currentUser">--%>
        <%--modelAttribute="currentUser"--%>
      <form:form method="post" action="/login" modelAttribute="currentUser">
        <p>Log in:</p>
        <label>E-mail:</label><form:input path="email" />
        <label>Password:</label><form:password path="password" />

        <input type="submit" value="Log in!"/>
      </form:form>

      <%--Here you can publish your poetry, songtexts or prose. <br>--%>
      <%--Soon we will give you opportunity to upload your audio, video, pictures or photos.--%>
      <%--<p class="date">Posted by Jack <img src="images/more.gif" alt="" /> <a href="#">Read more</a> <img src="images/comment.gif" alt="" /> <a href="#">Comments (15)</a> <img src="images/timeicon.gif" alt="" /> 17.01.</p>--%>
      <%--<br />--%>
      <h2><a href="#">Try it with sNews 1.4</a></h2>
      <h3>AND WHY NOT WITH sNEWS 1.5 ;-)</h3>
      Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec sem. Praesent eu metus. Vivamus ac urna. Maecenas tincidunt libero id ipsum. Duis ipsum erat, laoreet in, ultrices at, blandit non, enim. Maecenas et libero. In laoreet vehicula enim. Nam at massa. Donec porttitor, odio id scelerisque pretium, augue eros cursus est, eget interdum dui justo et tellus. Aenean a neque eu mauris ultrices viverra. In ac urna. Etiam in dolor sit amet arcu auctor interdum. Fusce non quam. Nunc aliquet, quam eu facilisis venenatis, pede augue adipiscing lorem, nec tincidunt nunc felis eget odio. Integer iaculis pretium odio. Integer viverra. Integer porttitor elementum diam. In hac habitasse platea dictumst. Donec porta elit.
      <p class="date">Posted by Jack <img src=""${pageContext.request.contextPath}/images/more.gif" alt="" /> <a href="#">Read more</a> <img src="images/comment.gif" alt="" /> <a href="#">Comments (15)</a> <img src="images/timeicon.gif" alt="" /> 17.01.</p>
      <br />
    </div>
    <div class="leftmenu">
      <div class="nav">
        <ul>
          <li><a href="#">Home</a></li>
          <li><a href="#">Login</a></li>
          <li><a href="/allContents">View content</a></li>
          <li><a href="#">Upload content <upload></upload></a></li>
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
    <div class="padding"> Copyright &copy; 2006 Your Site Name | Design: <a href="http://www.free-css-templates.com">David Herreman </a> | <a href="#">Contact</a> | <a href="http://jigsaw.w3.org/css-validator/check/referer">CSS</a> and <a href="http://validator.w3.org/check?uri=referer">XHTML</a> | <a href="http://www.solucija.com">Solucija.com</a> | <a href="#">Login</a> </div>
  </div>
</div>
</body>
</html>
