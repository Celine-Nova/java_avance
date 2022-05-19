**TP 1**
Ecrire un programme Java qui demande à l'utilisateur de saisir la valeur du diamètre, et qui ensuite va effectuer le calcul de la surface.
Surface = Rayon x Rayon x PI;
Rayon = Diamètre / 2

**TP 2**
Ecrire un programme Java qui demande à l'utilisateur de saisir son nom, prenom et age, et qui ensuite va afficher le message : "Vous vous appelez <prenom> <nom>, et vous avez <age> ans"

**TP 3**
Ecrire un programme Java qui déclare 3 variables, a,b,c et qui va ensuite effectuer une permutation de ces valeurs :
Exemple :
Entrez la première valeur(a) : 51
Entrez la deuxième valeur(b) : 876
Entrez la troisième valeur(c) : 235
Les valeurs entrées sont : a = 51, b = 876 et c = 235
Permutation: b <== a, c <== b, a <== c
Les valeurs permutées sont : a = 235, b = 51 et c = 876

**TP 4**
Ecrivez un programme Java qui lit un nombre et indique s'il est positif, négatif ou s'il vaut zéro et s'il est pair ou impair.
Exemple d'exécution:
Entrez un nombre entier: 5
Le nombre est positif et impair
Entrez un nombre entier: -4
Le nombre est négatif et pair
Entrez un nombre entier: 0
Le nombre est zéro (et il est pair)

**TP 5**
Ecrivez un programme Java qui permet de résoudre une équation du 2nd degré de la forme ax2+bx+c = 0.
L'utilisateur devra fournir a,b,c à partir du clavier, ensuite le programme lui donnera la solution
Principe du fonctionnement d'une équation du 2nd degré:
https://www.maths-et-tiques.fr/telech/Secondegre2ESL.pdf

**TP 6**
Ecrire un programme qui permet à l’utilisateur de saisir un entier entre 1 et 12 et qui affiche le nom du mois correspondant.
Ex:
Mois : 4
Résult : Avril

**TP 7**
L’email doit posseder le simbole @
Le mot de passe doit avoir entre 8 et 20 caractères
Créer une classe users avec les champs id,nom,prenom,email et mot de passe
Créer un tableau des User avec 5 utilisateurs avec chacun un  id,nom,prenom,email et mot de passe
Créer une classe utilitaire de validation qui aura 2 méthodes:
isEmail qui retournera un booléen
une methode isLength qui retourne un booléen et qui vérifie si une chaine est comprise entre une valeur minimal et une valeur maximale
Au moment de l’authentification il faut vérifier le user dans la liste des users
Si au moins un utilisateur possède un email et mot de passe correspondant : On affiche bienvenue ainsi que les informations relatives à l’utilisateur connecté
Sinon, on affiche le message email et/ou mot de passe incorrect
L’utilisateur aura 3 chances pour saisir des identifiants valides

**TP 7 suite**
Vous aurez au minimun 2 classes:
Une classe qui représente le client(Client)
Une classe dans laquelle vous allez mettre le requête SQL(Vous pouvez l’appeler ClientQueries)
Tout autre classe qui peut sembler important
Effectuer des requêtes SQL pour :
Lire les données de la table clients
Récupérer un client par son ID : méthode qui reçoit un ID et qui ensuite fait une requête SQL
Supprimer un client par son ID : méthode qui reçoit un ID et qui ensuite fait une requête SQL de suppression
Mettre à jour les données d’un client : méthode qui reçoit un objet de type Client et qui ensuite insérer dans la base de données