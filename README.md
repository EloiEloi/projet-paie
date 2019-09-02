# Paie-api-pi  


## Usage  

Url principale : 

```
https://paie-api-api.herokuapp.com/  
```

<br>

---

 ## Ajouter un employé


Matricule  
Entreprise  
Profil  
Grade  


#### Requete : 
``` json
POST /collegues

ContentType: application/json

{
    "photoUrl": "http://xxxx"
}
```

<br>

Réponse en cas de succès (succès de l'ajout de l'employé):
``` json
201

Content-Type: application/json

{
    "matricule" :  "69253276",
    "code_entreprise" : "SOP",
    "code_profil" : "Cadre",
    "code_grade" : "A"
}
```
 

Réponse en cas d'erreur (bad request) :
``` json
400

Content-Type: application/json

{
    "message" : "mauvaise syntaxe",
    "champ" : "nom_du_champ_incorrect"
}
```



<br>

---- 


 ## Lister les employés

 

``` json
GET /employes

ContentType: application/json

{
    {
        "matricule" :  "69253276",
        "code_entreprise" : "SOP",
        "code_profil" : "Cadre",
        "code_grade" : "A"
    },
    {
        "matricule" :  "69253276",
        "code_entreprise" : "SOP",
        "code_profil" : "Cadre",
        "code_grade" : "A"
    },
    {
        "matricule" :  "69253276",
        "code_entreprise" : "SOP",
        "code_profil" : "Cadre",
        "code_grade" : "A"
    }
}
```

<br>

---- 


 ## Lister les entreprises

 

``` json
GET /entreprises

ContentType: application/json

{
    {
        "code": "DEV",
        "denomination": "Dev Institut"
    },
    {
        "code": "SOP",
        "denomination": "Sopra-Steria"
    },
    {
        "code": "CAP",
        "denomination": "Capgemini"
    }
}
```


