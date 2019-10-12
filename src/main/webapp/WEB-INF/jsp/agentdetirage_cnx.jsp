<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authentification</title>
</head>
<body>
	<h1>Bienvenue Agent de tirage</h1>
	<form action="AgentDeTirage/Authentification">
		<fieldset>
			<legend>Parametres d'authentification</legend>
			<label for="login">Login</label> <br /> <input name="login"
				id="login" type="text" /> <br /> <label for="motdepasse">Mot
				de passe</label> <br /> <input name="motdepasse" id="motdepasse"
				type="password" /> <br /> <label for="sub">Submit</label> <br />
			<input name="sub" id="sub" type="submit" />
		</fieldset>
	</form>
</body>
</html>