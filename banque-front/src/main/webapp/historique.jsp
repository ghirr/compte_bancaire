

<%@page import="java.util.List"%>
<%@page import="service.Historique"%>
<%@page import="service.Compte"%>
<%@page import="service.BanqueWS"%>
<%@page import="service.BanqueService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style1.css">
<style>
@import url(https://fonts.googleapis.com/css?family=Roboto:400,500,700,300,100);


/*** Table Styles **/

.table-fill {
  background: white;
  border-radius:3px;
  border-collapse: collapse;
  height: 320px;
  margin: 30px auto;
  max-width: 600px;
  padding:5px;
  width: 100%;
  box-shadow: 0 5px 10px rgba(0, 0, 0, 0.1);
  animation: float 5s infinite;
}
 
th {
  color:#D5DDE5;;
  background:#1c4b74;
  border-bottom:4px solid #9ea7af;
  border-right: 1px solid #343a45;
  font-size:23px;
  font-weight: 100;
  padding:24px;
  text-align:left;
  text-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);
  vertical-align:middle;
}

th:first-child {
  border-top-left-radius:3px;
}
 
th:last-child {
  border-top-right-radius:3px;
  border-right:none;
}
  
tr {
  border-top: 1px solid #C1C3D1;
  border-bottom-: 1px solid #C1C3D1;
  color:#666B85;
  font-size:16px;
  font-weight:normal;
  text-shadow: 0 1px 1px rgba(256, 256, 256, 0.1);
}
 
tr:hover td {
  background:#ed6e2a;
  color:#FFFFFF;
  border-top: 1px solid #22262e;
}
 
tr:first-child {
  border-top:none;
}

tr:last-child {
  border-bottom:none;
}
 
tr:nth-child(odd) td {
  background:#EBEBEB;
}
 
tr:nth-child(odd):hover td {
  background:#ed6e2a;
}

tr:last-child td:first-child {
  border-bottom-left-radius:3px;
}
 
tr:last-child td:last-child {
  border-bottom-right-radius:3px;
}
 
td {
  background:#FFFFFF;
  padding:20px;
  text-align:left;
  vertical-align:middle;
  font-weight:300;
  font-size:18px;
  text-shadow: -1px -1px 1px rgba(0, 0, 0, 0.1);
  border-right: 1px solid #C1C3D1;
}

td:last-child {
  border-right: 0px;
}

th.text-left {
  text-align: left;
}

th.text-center {
  text-align: center;
}

th.text-right {
  text-align: right;
}

td.text-left {
  text-align: left;
}

td.text-center {
  text-align: center;
}

td.text-right {
  text-align: right;
}

tbody tr{
height:30px
}
</style>


<%
BanqueService proxy=new BanqueWS().getBanqueServicePort();
int code=(Integer)session.getAttribute("codecin");
Compte c = new Compte();
c = proxy.getCompte(code);
List<Historique> ListHisto = proxy.getHist(code); 
%>
</head>
<body>
    <nav class="navbar">
        <div class="logo">
            <img src="./image/banque2.jpg" alt="Logo">
        </div>
        <ul class="nav-links">
            <li><a href="home.jsp">Accueil</a></li>
            <li><a href="versement.jsp">versement</a></li>
            <li><a href="retrait.jsp">retrait</a></li>
            <li><a href="transfert.jsp">transfert</a></li>
            <li><a href="conversion.jsp">conversion</a></li>
            <li><a href="historique.jsp">historique</a></li>
        </ul>
        <div class="mama"><a class="logout"  href="deconnecter.DAO">Deconnecter</a></div>
    </nav>
    <table class="table-fill">
<thead>
<tr>
<th class="text-left">Action</th>
<th class="text-left">Date</th>
</tr>
</thead>
<tbody class="table-hover">
<% for (Historique h : ListHisto) { %>
        <tr>
            <td class="text-left"><%= proxy.getActe(h.getIdActe()) %></td>
            <td class="text-left"><%=h.getDate() %></td>
        </tr>
        <% } %>
</tbody>
</table>
</body>
</html>
