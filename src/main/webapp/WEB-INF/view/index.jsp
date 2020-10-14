<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<%@ taglib uri="http://java.sun.com/JSP/Page" prefix="jsp" %>--%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Ribbon</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="micro.css" media="screen" />
<link rel="stylesheet" type="text/css" href="base.css" media="screen" />
<link rel="stylesheet" type="text/css" href="style.css" media="screen" />
<link rel="stylesheet" type="text/css" href="print.css" media="print" />
<!--[if IE]>
    <link rel="stylesheet" type="text/css" href="micro-ie.css" media="screen"/>
    <![endif]-->
</head>
<body>
<div id="container">
  <div class="left50">
    <div id="page">
      <h1>Art Space</h1>
      <p>This template is 960px wide, good for a 1024px monitor resolution. In monitor with resolution over 1024px the content is centered. The code is valid XHTML 1.0 Strict.</p>
      <p>The paragraphs are not separated by blank spaces but with the indentation of first line <strong>like a book</strong>. If you want a paragraph without indentation there is a <em>.noindent</em> class, just like LaTeX typesetting system. To better resemble printed books, the text is <strong>justified</strong>. These rules are applied only here (the main content).</p>
      <p>Text and line height are dimensioned to a <strong>vertical rythm</strong> including headings, lists and tables. You can see a page with examples of <a href="tags.html">commonly used tags</a>.</p>
      <h2>Printing</h2>
      <p>There is a <em>print.css</em> stilesheet for printing the page. It hides the <em>ribbon</em> and <em>aux</em> columns and left visible only the main page.</p>
      <h3>Filler text</h3>
      <p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna  aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea  takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr,  sed diam nonumy  eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo  dolores et ea rebum. </p>
    </div>
  </div>
  <div class="right50">
    <div class="left50">
      <div id="ribbon">
        <p><img src="stemma.gif" alt="" /></p>
        <ul id="menu">
          <li><a href="/login">Home</a></li>
          <li><a href="/content">Articles</a></li>
          <li><a href="/profile">Archive</a></li>
          <c:if test="${currentUser.role = 'ADMIN'}">
          <li><a href="/admin">Contacts</a></li>
          </c:if>
          <li><a href="#">About</a></li>
        </ul>
        <p>This is the "ribbon" with the main navigation. </p>
      </div>
    </div>
    <div class="right50">
      <div id="aux">
        <h2>Auxiliary</h2>
        <p>This column can be used to put an "about" box, a secondary navigation or some thumbnails.</p>
        <p>It's a good place for a blogroll or for publish contents from other services like your del.icio.us bookmark or a flickr photo-gallery.</p>
        <p>A traditional site can put here the latest news; a blog can use this column to show the latest comments.</p>
      </div>
    </div>
  </div>
  <div id="footer">
    <p>template by <br />
      <a href="http://www.scaracco.net/">Scaracco</a></p>
  </div>
</div>
</body>
</html>
