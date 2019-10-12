<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="/css/bootstrap.min.css" rel="stylesheet"  />
<title>Authentification</title>
</head>
<body>
	<h1 class="text-danger">Bienvenue, Qui vous êtes?</h1>

	<table>
		<tr>
			<td>
				<h1>Bienvenue, Qui vous êtes?</h1>
			</td>
		</tr>
	</table>
	<!-- Button trigger modal -->
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
  Launch demo modal
</button>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        ...
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
	<table>
		<tr>
			<td>
				<form action="administrateur_cnx">
					<fieldset>
						<legend>Administrateur</legend>
						<label for="sub"></label> <input name="sub" id="sub" type="submit" />
					</fieldset>
				</form>
			</td>
			<td>
				<form action="agentdetirage_cnx">
					<fieldset>
						<legend>Agent de tirage</legend>
						<label for="sub"></label> <input name="sub" id="sub" type="submit" />
					</fieldset>
				</form>
			</td>
			<td>
				<form action="enseignant_cnx">
					<fieldset>
						<legend>Enseignant</legend>
						<label for="sub"></label> <input name="sub" id="sub" type="submit" />
					</fieldset>
				</form>
			</td>
		</tr>
	</table>
	<script src="/js/jquery.js" type="text/javascript"></script>
	<script src="/js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>