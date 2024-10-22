# leVerger
Repertoire github pour un projet Java réalisé en première année de BUT Informatique.

## SAE 2.01 - 2.02
### Développement d’une application

**Iut du Limousin**  
**BUT Informatique**

### Phase d’analyse

#### Cahier des Charges
Lors de ce projet, l'entreprise GamIUTer nous a confié le projet de réaliser le jeu du verger et de le versionner en 7 versions, chacune avec des fonctionnalités supplémentaires. Voici les règles du jeu :

C’est un jeu pour 1 à 3 joueurs. Il faut lancer un dé à 6 faces :  
- Si l’on obtient une couleur, on place un fruit correspondant dans le panier (jusqu’à 10 fruits maximum).  
- Si l’arbre n’a plus de fruits de cette couleur, on passe au joueur suivant.  
- Si l’on tombe sur la face « panier », on retire 2 fruits sur n’importe quel arbre.  
- Si l’on tombe sur la face « corbeau », une pièce du puzzle est ajoutée. Si toutes les pièces du puzzle sont placées, la partie est perdue. Sinon, elle est gagnée lorsque tous les fruits sont récoltés.

Les outils utilisés pour ce projet étaient : Java, JavaFX, Maven, et Git.

Nous avons atteint la version 7 du jeu.

#### Versionnage :
- **V1** : Jeu pour un seul joueur, avec un dé à 4 faces pour chaque couleur de fruit. Le fruit correspondant est automatiquement récolté et la partie est toujours gagnée.
- **V2** : Ajout des paniers correspondant aux fruits, qui se remplissent jusqu'à 10 fruits.
- **V3** : Ajout d'une 5e face au dé représentant le corbeau. Si le corbeau apparaît, une pièce du puzzle est ajoutée. Partie perdue si le puzzle est complété.
- **V4** : Le joueur peut choisir quel fruit récolter en fonction de la couleur du dé. Une 6e face « panier » permet de récolter 2 fruits.
- **V5** : Les paniers ne sont plus dédiés à un seul fruit, et les fruits sont glissés dans les paniers par drag-and-drop.
- **V6** : Ajout du mode multijoueur avec 1, 2 ou 3 joueurs.
- **V7** : Liberté d'ajouter des fonctionnalités créatives.

### Phase de conception
Nous avons réalisé un diagramme de classe pour la version 6, puis adapté pour la version 7 avec des ajustements supplémentaires.

### Phase d’implémentation

#### V1: Des arbres fruitiers
Cette version posait les bases du jeu avec 4 arbres, 10 fruits par arbre, et un dé à 4 faces.

#### V2: Des paniers pour la cueillette
Nous avons ajouté des paniers pour chaque type de fruit avec un maximum de 10 fruits par panier.

#### V3: Apparition du corbeau
Nous avons introduit la mécanique du corbeau avec une nouvelle face du dé et l’ajout des pièces du puzzle.

#### V4: Choix du fruit à récolter
Les joueurs peuvent choisir quel fruit récolter, et une face « panier » permet de récolter 2 fruits.

#### V5: Choix du panier & pioche du puzzle
Le drag-and-drop pour déplacer les fruits dans les paniers et la pioche du puzzle ont été ajoutés.

#### V6: Une équipe de joueurs
Nous avons introduit la possibilité de jouer à plusieurs, jusqu’à 3 joueurs.

#### V7: Soyez créatifs
Nous avons ajouté des améliorations visuelles et un menu avec les règles du jeu.

### Conclusion
Le projet a respecté les exigences de l’entreprise GamIUTer, avec un jeu fonctionnel versionné en 7 itérations. Nous avons rencontré quelques difficultés techniques, notamment sur le drag-and-drop à partir de la version 5. Les outils utilisés incluaient Git, Maven, Java et JavaFX.

### Glossaire
- **Java** : Langage de programmation utilisé pour le projet.
- **JavaFX** : Utilisé pour réaliser des interfaces interactives.
- **Git** : Outil de partage et versionnement des projets.
- **Maven** : Outil pour la gestion des dépendances et la compilation du projet.
- **Drag and drop** : Technique pour déplacer un objet en le faisant glisser avec la souris.
