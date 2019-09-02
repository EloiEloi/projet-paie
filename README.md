# Paie-api-pi  


## Usage  

Url principale : 

```
https://paie-api-api.herokuapp.com/  
```

<br>



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

#### Réponses :  

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
        "matricule" :  "68123821",
        "code_entreprise" : "SOP",
        "code_profil" : "Cadre",
        "code_grade" : "B"
    },
    {
        "matricule" :  "69253276",
        "code_entreprise" : "DEV",
        "code_profil" : "Cadre",
        "code_grade" : "A"
    }
}
```

<br>




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


<br>




 ## Lister les grades

 

``` json
GET /grades

ContentType: application/json

{
    {
        "id" : "1",
        "code": "A",
        "taux_jour_base" : "200",
        "nbr_heures_base" : "39"

    },
    {
       "id" : "2",
        "code": "B",
        "taux_jour_base" : "300",
        "nbr_heures_base" : "39"
    },
    {
       "id" : "3",
        "code": "C",
        "taux_jour_base" : "400",
        "nbr_heures_base" : "39"
    }
}
```
<br>




 ## Lister les reférentiels

 

``` json
GET /grades

ContentType: application/json

{
    {
        "code": "A",
        "taux_jour": "Dev Institut",
    },
    {
        "code": "B",
        "taux_jour": "Sopra-Steria"
    },
    {
        "code": "C",
        "taux_jour": "Capgemini"
    }
}
```
