<!DOCTYPE html>
<!--
Template Name: Workit V.2
Author: <a href="https://www.os-templates.com/">OS Templates</a>
Author URI: https://www.os-templates.com/
Licence: Free to use under our free template licence terms
Licence URI: https://www.os-templates.com/template-terms
-->

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<%@ taglib uri="http://java.sun.com/JSP/Page" prefix="jsp" %>--%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
<title>Workit V.2</title>
<meta charset="UTF-8">
<link rel="stylesheet" href="layout/styles/layout.css" type="text/css">
  <style type="text/css">
    <%@ include file="layout/styles/layout.css"%>
  </style>

<script src="layout/scripts/jquery.min.js"></script>
<script src="layout/scripts/jquery-innerfade.js"></script>
</head>
<body>
<div class="wrapper row1">
  <header id="header" class="clear">
    <div id="hgroup">
      <h1><a href="index2.jsp">W<span>orkit V.2</span></a></h1>
      <h2>Free HTML5<br>
        Website Template</h2>
    </div>
    <form action="#" method="post">
      <fieldset>
        <legend>Search:</legend>
        <input type="text" value="Search Our Website&hellip;" placeholder="Search Our Website&hellip;">
        <input type="submit" id="sf_submit" value="submit">
      </fieldset>
    </form>
  </header>
</div>
<div class="wrapper row2">
  <nav id="topnav">
    <ul class="clear">
      <li class="active"><a href="index2.jsp">Home</a></li>
      <li><a href="pages/style-demo.html">Style Demo</a></li>
      <li><a href="pages/full-width.html">Full Width</a></li>
      <li><a href="#">DropDown</a>
        <ul>
          <li><a href="#">Link 1</a></li>
          <li><a href="#">Link 2</a></li>
          <li><a href="#">Link 3</a></li>
        </ul>
      </li>
      <li><a href="pages/gallery.html">Gallery</a></li>
      <li><a href="pages/portfolio.html">Portfolio</a></li>
      <li><a href="#">Link Text</a></li>
      <li><a href="#">A Very Long Link Text</a></li>
    </ul>
  </nav>
</div>
<!-- content -->
<div class="wrapper row3">
  <div id="container" class="clear"> 
    <!-- content body --> 
    <!-- ########################################################################################## --> 
    <!-- ########################################################################################## -->
    <div id="homepage"> 
      <!-- ########################################################################################## --> 
      <!-- Shout -->
      <section id="shout">
        <p>&ldquo; Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc non diam erat in fringilla massa &bdquo;</p>
      </section>
      <!-- / Shout --> 
      <!-- ########################################################################################## --> 
      <!-- Latest -->
      <section id="latest">
        <article>
          <figure class="clear">
            <ul id="rotate">
              <li><img src="images/demo/rotate/1.gif" alt=""></li>
              <li><img src="images/demo/rotate/2.gif" alt=""></li>
              <li><img src="images/demo/rotate/3.gif" alt=""></li>
            </ul>
            <figcaption>
              <header>Metridiculis conseque quis</header>
              <p>Orciinterdum condimenterdum nullamcorper elit nam curabitur laoreet met.</p>
              <p>Orciinterdum condimenterdum nullamcorper elit nam curabitur laoreet met praesenean et iaculum. Metridiculis conseque quis iaculum aenean nunc aenean quis nam nis dui.</p>
              <footer><a href="#">View This Project &raquo;</a></footer>
            </figcaption>
          </figure>
        </article>
      </section>
      <!-- / Latest --> 
      <!-- ########################################################################################## --> 
      <!-- Services -->
      <section id="services" class="clear">
        <article class="one_quarter">
          <h2><a href="#">Vivamuslibero Auguer</a></h2>
          <img src="images/demo/48x48.gif" alt="">
          <p>Inteligula congue id elis donec sce sagittis intes id laoreet aenean leo sem massawisi condisse leo sem ac. Tincidunt nibh quis dui fauctor et.</p>
        </article>
        <article class="one_quarter">
          <h2><a href="#">Vivamuslibero Auguer</a></h2>
          <img src="images/demo/48x48.gif" alt="">
          <p>Inteligula congue id elis donec sce sagittis intes id laoreet aenean leo sem massawisi condisse leo sem ac. Tincidunt nibh quis dui fauctor et.</p>
        </article>
        <article class="one_quarter">
          <h2><a href="#">Vivamuslibero Auguer</a></h2>
          <img src="images/demo/48x48.gif" alt="">
          <p>Inteligula congue id elis donec sce sagittis intes id laoreet aenean leo sem massawisi condisse leo sem ac. Tincidunt nibh quis dui fauctor et.</p>
        </article>
        <article class="one_quarter">
          <h2><a href="#">Vivamuslibero Auguer</a></h2>
          <img src="images/demo/48x48.gif" alt="">
          <p>Inteligula congue id elis donec sce sagittis intes id laoreet aenean leo sem massawisi condisse leo sem ac. Tincidunt nibh quis dui fauctor et.</p>
        </article>
      </section>
      <!-- / Services --> 
      <!-- ########################################################################################## --> 
      <!-- Info -->
      <section id="info" class="clear">
        <article class="two_quarter">
          <h2>Lorem ipsum dolor sit amet consectetur</h2>
          <p>This is a W3C compliant free website template from <a href="https://www.os-templates.com/" title="Free Website Templates">OS Templates</a>. For full terms of use of this template please read our <a href="https://www.os-templates.com/template-terms">website template licence</a>.</p>
          <p>You can use and modify the template for both personal and commercial use. You must keep all copyright information and credit links in the template and associated files. For more HTML5 templates visit <a href="https://www.os-templates.com/">free website templates</a>.</p>
          <p class="more"><a href="#">Read More &raquo;</a></p>
        </article>
        <article class="two_quarter">
          <h2>Lorem ipsum dolor sit amet consectetur</h2>
          <img class="imgl" src="images/demo/150x150.gif" alt="">
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc non diam erat. In fringilla massa ut nisi ullamcorper pellentesque. Quisque non luctus sem. Nullam non magna vel nisi posuere bibendum vitae sed dui. Nulla at lorem tortor, non rhoncus odio. Nunc sit amet interdum orci.</p>
          <p class="more"><a href="#">Read More &raquo;</a></p>
        </article>
      </section>
      <!-- / Info --> 
      <!-- ########################################################################################## --> 
    </div>
    <!-- ########################################################################################## --> 
    <!-- ########################################################################################## --> 
    <!-- / content body --> 
  </div>
</div>
<!-- Footer -->
<div class="wrapper row4">
  <div id="footer" class="clear"> 
    <!-- Section One -->
    <section class="one_quarter first">
      <h2 class="title">Contact Details</h2>
      <address>
      Company Name<br>
      Street Name &amp; Number<br>
      Town<br>
      Postcode/Zip
      </address>
      <p>Tel: xxxxx xxxxxxxxxx<br>
        Fax: xxxxx xxxxxxxxxx<br>
        Email: <a href="#">contact@mydomain.com</a></p>
    </section>
    <!-- Section Two -->
    <section class="one_quarter">
      <h2 class="title">Quick Links</h2>
      <nav>
        <ul>
          <li class="first"><a href="#">Lorem ipsum dolor sit</a></li>
          <li><a href="#">Amet consectetur</a></li>
          <li><a href="#">Praesent vel sem id</a></li>
          <li><a href="#">Curabitur hendrerit est</a></li>
          <li><a href="#">Aliquam eget erat nec sapien</a></li>
        </ul>
      </nav>
    </section>
    <!-- Section Three -->
    <section class="one_quarter">
      <h2 class="title">From The Blog</h2>
      <article>
        <header>
          <h2>Blog Post Title</h2>
          <time datetime="2000-04-06">Friday, 6<sup>th</sup> April 2000</time>
        </header>
        <p>Vestibulumaccumsan egestibulum eu justo convallis augue estas aenean elit intesque sed.</p>
        <p><a href="#">Read More &raquo;</a></p>
      </article>
    </section>
    <!-- Section Four -->
    <section class="one_quarter">
      <h2 class="title">Grab Our Newsletter</h2>
      <form method="post" action="#">
        <fieldset>
          <legend>Contact Form:</legend>
          <label for="nl_name">Name:</label>
          <input type="text" name="nl_name" id="nl_name" value="" placeholder="Name">
          <label for="nl_email">Email:</label>
          <input type="text" name="nl_email" id="nl_email" value="" placeholder="Email Address">
          <button type="submit" value="submit">Submit</button>
        </fieldset>
      </form>
    </section>
    <!-- / Section --> 
  </div>
</div>
<!-- Copyright -->
<div class="wrapper row5">
  <footer id="copyright" class="clear">
    <p class="fl_left">Copyright &copy; 2018 - All Rights Reserved - <a href="#">Domain Name</a></p>
    <p class="fl_right">Template by <a target="_blank" href="https://www.os-templates.com/" title="Free Website Templates">OS Templates</a></p>
  </footer>
</div>
</body>
</html>