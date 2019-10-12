$(document).ready(function() {
    $.ajax({
        url: "http://localhost:5050/Administrateur/Authentification"
    }).then(function(data) {
       $('.Authentification-idAdministrateur').append(data.idAdministrateur);
       $('.Authentification-login').append(data.login);
       $('.Authentification-motDePasse').append(data.motDePasse);
    });
});