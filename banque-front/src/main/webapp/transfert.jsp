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
<link rel="stylesheet" href="css/style1.css">
<%
BanqueService proxy=new BanqueWS().getBanqueServicePort();
int code=(Integer)session.getAttribute("codecin");
 Compte c=new Compte();
 c=proxy.getCompte(code);
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
    <div class="content">
        
        <div class="balance">
            <form action="transfert.dao" method="post">
            <label for="amount">Enter le montant � transfert:</label>
            <input type="text" name="prix" placeholder="montant">
            <input type="hidden" name="codecin" value="<%=c.getCode() %>"><br>
            <label for="recipient">Recepteur Code:</label>
            <input type="text"  name="coderecip" placeholder="recipient code"><br>
            <input type="submit" value="transfert"><br>
            </form>
            <h3>Votre Solde</h3>
            <p class="balance-amount">$<%=c.getSolde() %></p>
        </div>
    </div>
</body>
</html>