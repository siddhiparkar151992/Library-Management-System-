<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.1 Transitional//EN">
<html>
<font face="Arial,Helvetica,Geneva,Swiss,SunSans-Regular">

<head>




<title>Country - State - City Dropdown</title>

<script type="text/javascript">

// State lists
var states = new Array();

states['Canada'] = new Array('Alberta','British Columbia','Ontario');
states['Mexico'] = new Array('Baja California','Chihuahua','Jalisco');
states['United States'] = new Array('California','Florida','New York');


// City lists
var cities = new Array();

cities['Canada'] = new Array();
cities['Canada']['Alberta']          = new Array('Edmonton','Calgary');
cities['Canada']['British Columbia'] = new Array('Victoria','Vancouver');
cities['Canada']['Ontario']          = new Array('Toronto','Hamilton');

cities['Mexico'] = new Array();
cities['Mexico']['Baja California'] = new Array('Tijauna','Mexicali');
cities['Mexico']['Chihuahua']       = new Array('Ciudad Juárez','Chihuahua');
cities['Mexico']['Jalisco']         = new Array('Guadalajara','Chapala');

cities['United States'] = new Array();
cities['United States']['California'] = new Array('Los Angeles','San Francisco');
cities['United States']['Florida']    = new Array('Miami','Orlando');
cities['United States']['New York']   = new Array('Buffalo','new York');


function setStates() {
  cntrySel = document.getElementById('country');
  stateList = states[cntrySel.value];
  changeSelect('state', stateList, stateList);
  setCities();
}

function setCities() {
  cntrySel = document.getElementById('country');
  stateSel = document.getElementById('state');
  cityList = cities[cntrySel.value][stateSel.value];
  changeSelect('city', cityList, cityList);
}

function changeSelect(fieldID, newOptions, newValues) {
  selectField = document.getElementById(fieldID);
  selectField.options.length = 0;
  for (i=0; i<newOptions.length; i++) {
    selectField.options[selectField.length] = new Option(newOptions[i], newValues[i]);
  }
}

function addLoadEvent(func) {
  var oldonload = window.onload;
  if (typeof window.onload != 'function') {
    window.onload = func;
  } else {
    window.onload = function() {
      if (oldonload) {
        oldonload();
      }
      func();
    }
  }
}

addLoadEvent(function() {
  setStates();
});
</script>
<!--end head-->  
</head>
<body bgcolor="#FFFFFF" text="#000000" link="#0000FF" vlink="#0000FF" alink="#FF0000"><font size="2" color="#000000" face="Arial">
<div align="center"><img src="snippetsheader.jpg" width="950" height="95" alt="CSGNetwork FREE Source Code, Javascript Source, and Code Snippets!">

<div align="center"><table width="950" border="0" cellpadding="0" cellspacing="0"><tr><td>
<style type="text/css">
@import url(http://www.google.com/cse/api/branding.css);
</style>
<div class="cse-branding-right" style="background-color:#FFFFFF;color:#000000">
  <div class="cse-branding-form" >
    <form action="http://www.google.com/cse" id="cse-search-box" target="_blank">
      <div>
        <input type="hidden" name="cx" value="partner-pub-8018289210612122:luopoc-fjud" />
        <input type="hidden" name="ie" value="ISO-8859-1" />
        <input type="text" name="q" size="20" />
        <input type="submit" name="sa" value="Search" />
      </div>
    </form>
  </div>
  <div class="cse-branding-logo">
    <img src="http://www.google.com/images/poweredby_transparent/poweredby_FFFFFF.gif" alt="Google" />
  </div>
  <div class="cse-branding-text">
    CSGNetwork Custom Search
  </div>
</div>
</td>
<td valign="middle">
<div align="right">
<a href="http://www.csgnetwork.com/sssdetails.html"><img src="openshareicon-16x16.jpg" border=0/></a>&nbsp;&nbsp;&nbsp;&nbsp;
<!-- AddThis Button BEGIN -->
<a href="http://www.addthis.com/bookmark.php" onclick="addthis_url   = location.href; addthis_title = document.title; return addthis_click(this);" target="_blank"><img src="http://s9.addthis.com/button1-bm.gif" width="125" height="16" border="0" alt="Bookmark and Share" /></a> <script type="text/javascript">var addthis_pub = 'gloryless';</script><script type="text/javascript" src="http://s9.addthis.com/js/widget.php?v=10"></script>  
<!-- AddThis Button END -->  
</div></td></tr></table></div>
<table width="950" border="0" cellpadding="5" cellspacing="0"><tr valign="top"><td colspan="2"><div align="center">
<script type="text/javascript"><!--
google_ad_client = "pub-8018289210612122";
/* Snippet Top, created 4/23/08 */
google_ad_slot = "3188621492";
google_ad_width = 728;
google_ad_height = 90;
//--></script><script type="text/javascript"
src="http://pagead2.googlesyndication.com/pagead/show_ads.js">
</script></div></td></tr><tr valign="top"><td width="10%" bgcolor="#c5c3c4" align="left"> <table border="0" width=122>  <tr bgcolor="#c5c3c4"><td><font size="2" face="arial"><b>CSGNetwork</b></td></tr>  <tr><td><a href="http://www.csgnetwork.com/sssconverters.html"><font size="2" face="arial">Snippets</a></td></tr>
<tr><td><a href="http://www.csgnetwork.com/converters.html"><font size="2" face="arial">Calculators</a></td></tr>
<tr><td><a href="http://www.csgnetwork.com/top_free_apps.html"><font size="2" face="arial">Top Free Apps</a></td>
</tr><tr><td><a href="http://www.csgnetwork.com/"><font size="2" face="arial">Home</a></td></tr>
<tr><td><font size="2" face="arial"><a href="#" onClick="history.go(-1)">Back</a> 
</td></tr></table><br><div align="center"><script type="text/javascript"><!--
google_ad_client = "pub-8018289210612122";
/* Snippet Link Unit created 4/23/08 */
google_ad_slot = "4580845370";
google_ad_width = 120;
google_ad_height = 90;
//--></script>
<script type="text/javascript"
src="http://pagead2.googlesyndication.com/pagead/show_ads.js">
</script></div><br /><br /></td><td><center><font color="#FF8080"><b>Right click this window and select "view source" in order to copy the source for this script.</b></font><br /><br /><div align="center">

<!-- 

/*

/*

/*

***** Start Visual Snippet Component *****

/*

/*

/*

/*

//-->
<!--v comp-->



<fieldset style="width: 300px;">
<legend><strong>Make your selection</strong></legend>
<p>
<!-- <form name="test" method="POST" action="processingpage.php"> -->
<form>
<table>
<tr>
<td style="text-align: left;">Country:</td>
<td style="text-align: left;">
<select name="country" id="country" onchange="setStates();">
  <option value="Canada">Canada</option>
  <option value="Mexico">Mexico</option>
  <option value="United States">United States</option>
</select>
</td>
</tr><tr>
<td style="text-align: left;">State:</td>
<td style="text-align: left;">
<select name="state" id="state" onchange="setCities();">
  <option value="">Please select a Country</option>
</select>
</td>
</tr><tr>
<td style="text-align: left;">City:</td>
<td style="text-align: left;">
<select name="city"  id="city">
  <option value="">Please select a Country</option>
</select>
</td>
</tr>
</table>
</form>
</fieldset>
<br /><br />Country - State - City Dropdown<br /><br />View the source...<br /><br />This is a demonstration of a country dropdown box and states (or sub-regions) within it, in the supporting box. Subsequently, cities are available within the state. If the country does not use such regions, or you do not with to use them, the second box is inactive, as can be the third box.<br /><br />
<!--v comp-->
<!-- 

/*

/*

/*

***** End Visual Snippet Component *****

/*

/*

/*

/*

//-->



</td></tr><tr valign="top"><td colspan="2"><br /><div align="center">

<script type="text/javascript"><!--

google_ad_client = "pub-8018289210612122";

/* Snippet Bottom Leaderboard, created 4/23/08 */

google_ad_slot = "1754004656";

google_ad_width = 728;

google_ad_height = 90;

//-->

</script>

<script type="text/javascript"

src="http://pagead2.googlesyndication.com/pagead/show_ads.js">

</script>

<br />
<!-- google_ad_section_start(weight=ignore) -->
<div align="center"><table width="950" border="0" cellpadding="0" cellspacing="0"><tr><td>
<FONT Size="1">
<SCRIPT LANGUAGE="JavaScript">

var dateRef = ""  ;dateRef = document.lastModified  ;document.write("<div align='left'>This Page Last Downloaded or Refreshed:  ");  document.write(dateRef);  document.write("</div>"); 

</SCRIPT>

</FONT>
</td>
<td valign="middle" width="50">
<div align="right">
<!-- AddThis Button BEGIN -->
<a href="http://www.addthis.com/bookmark.php" onclick="addthis_url   = location.href; addthis_title = document.title; return addthis_click(this);" target="_blank"><img src="http://s9.addthis.com/button1-bm.gif" width="125" height="16" border="0" alt="Bookmark and Share" /></a> <script type="text/javascript">var addthis_pub = 'gloryless';</script><script type="text/javascript" src="http://s9.addthis.com/js/widget.php?v=10"></script>  
<!-- AddThis Button END -->  
</div></td></tr></table></div>
<div align="center">
<table border="0" cellpadding="0" cellspacing="0" width="950">
<tr><td><SCRIPT LANGUAGE="JavaScript">

<!--



    today=new Date();

    y0=today.getFullYear();



//  --->

</SCRIPT>
<FONT Size="1"><div align="center">Registered&reg; Trademark&trade; and Copyright© 1973 - <SCRIPT LANGUAGE="JavaScript">

 <!--- 

  

    document.write(y0);

 // ---></SCRIPT>
<a href="http://www.csgnetwork.com/">CSG, Computer Support Group, Inc. and CSGNetwork.Com</a> All Rights Reserved</b></div></font><br />
</td></tr></table>

<font size="3"><div align="center"><a href="http://www.csgnetwork.com/">Home</a> | <a href="http://www.csgnetwork.com/advertising.html">Advertising</a> | <a href="http://www.csgnetwork.com/converters.html">Calculators</a> | <a href="http://www.csgnetwork.com/srchcsg.html">Search</a> | <a href="http://www.csgnetwork.com/contact.html">Contact Us</a> | <a href="http://www.csgnetwork.com/sssconverters.html">Snippets</a> | <a href="http://www.csgnetwork.com/sitemap.html">Sitemap</a> | <a href="http://www.csgnetwork.com/glossary.html">Glossary</a> | <a href="http://www.csgnetwork.com/top_free_apps.html">Top Apps</a></div></font>

</CENTER>
<!-- google_ad_section_stop(weight=ignore) -->
<!-- END of Last Page Load or Refresh JavaScript -->

<script type="text/javascript">
var gaJsHost = (("https:" == document.location.protocol) ? "https://ssl." : "http://www.");
document.write(unescape("%3Cscript src='" + gaJsHost + "google-analytics.com/ga.js' type='text/javascript'%3E%3C/script%3E"));
</script>
<script type="text/javascript">
var pageTracker = _gat._getTracker("UA-586965-1");
pageTracker._trackPageview();
</script>

<!-- Start Quantcast tag -->

<script type="text/javascript">

_qoptions={

qacct:"p-e5Rm3n0BNyiaA"

};

</script>

<script type="text/javascript" src="http://edge.quantserve.com/quant.js"></script>

<noscript>

<img src="http://pixel.quantserve.com/pixel/p-e5Rm3n0BNyiaA.gif" style="display: none;" border="0" height="1" width="1" alt="Quantcast"/>

</noscript>

<!-- End Quantcast tag -->
<br /><br /></div></td></tr></table></font></div></font></body></html>






