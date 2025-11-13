<%@ page isELIgnored="false"  import="java.util.*"%>

<h1 style="color: red;text-align: center"> Report Page</h1>

<b> Simple Model Attributes are :  ==> ${name}, ${age} </b>
<br><br>
<b> Fav colors : : <%=Arrays.toString((String[])request.getAttribute("favColors")) %></b> <br>
<b> friends : : ${friends}</b> <br>
<b> phones : : ${phones}</b> <br>
<b> idDetails : : ${idDetails}</b> <br>
